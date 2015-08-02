package asmlbuilder.builder;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.constants.ASMLConstant;
import asmlbuilder.matching.MatchingVisitor;
import asmlbuilder.matching.PrintMatchingVisitor;
import asmlbuilder.validation.ValidatorVisitor;
import br.ufmg.dcc.asml.ClassPathUtil;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.XtextParser;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class ASMLBuilder extends IncrementalProjectBuilder {

	private static final Logger log = Logger.getLogger(ASMLBuilder.class.getName());
	private ASMLContext asmlContext;
	XtextParser xtextParser = new XtextParser();
	private String path_vaccine = null;
	private boolean initialized = false;

	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
		log.log(Level.INFO, "Iniciou o processo de build...");
		if (kind == FULL_BUILD) {
			if (!initialized) {
				configuraContexto();
				configuraClassLoaderEspecifico();
				allTokensNameConventionRecovery(kind);
				allExternalComponentInstancesRecoveryInJarFIles();
			}
			carregaArvoreDeComponentes();
			
			limpaInstanciasDeComponetesInternos();
			
			allExternalComponentInstancesRecoveryInOpenProjects();
			allInternalComponentInstancesRecovery();
			allInternalComponentInstancesReferencesRecovery();
			// allInternalComponentInstancesRecoveryNaoJavaIncremental(project);
			matchingExternal();
			matchingInternal();
			printMatching();
			
			validate(kind);
			show_violations();
			initialized = true;
		}else if (kind == AUTO_BUILD && initialized) {
			limpaInstanciasDeComponetesInternos();

			allExternalComponentInstancesRecoveryInOpenProjects();
			allInternalComponentInstancesRecovery();
			allInternalComponentInstancesReferencesRecovery();
			// allInternalComponentInstancesRecoveryNaoJavaIncremental(project);
			matchingExternal();
			matchingInternal();
			validate(kind);

			show_violations();
		}
		if (kind == CLEAN_BUILD)
			initialized = false;

		log.log(Level.INFO, "Terminou o processo de build...");
		return null;
	}

	private void show_violations() {
		for (ComponentInstance componentInstance : asmlContext.getComponentInstances()) {
			if (componentInstance.getComponent() == null && !componentInstance.isExternal())
				MarkerUtils.addMarker(componentInstance.getResource(), "Componente não identificado pela arquitetura!", 1, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE);
		}

		for (Violation violation : asmlContext.getViolations()) {
			MarkerUtils.addMarker(violation.getResource(), violation.getMessage(), violation.getLineNumber(), violation.getSeverity(), ASMLConstant.MARKER_TYPE);
		}
	}

	private void allExternalComponentInstancesRecoveryInOpenProjects() throws JavaModelException {
		// if (!initialized && kind==FULL_BUILD) {
		IProject project = asmlContext.getJavaProject().getProject();
		List<String> projectOpnendNamesOf = ClassPathUtil.recuperaOpenedProjectNamesInClassPath(asmlContext.getJavaProject());
		List<IProject> projects = getOpendedProjectsInClassPath();
		for (IProject iProject : projects) {
			if (iProject.equals(project))
				continue;
			if (iProject.isOpen()) {
				IJavaProject javaProject = null;
				IPackageFragmentRoot[] packageFragmentRoots = null;
				try {
					javaProject = JavaCore.create(iProject);
					packageFragmentRoots = javaProject.getAllPackageFragmentRoots();
				} catch (Exception e) {
					continue;
				}
				int i;
				for (IPackageFragmentRoot iPackageFragmentRoot : packageFragmentRoots) {
					String elementName = iPackageFragmentRoot.getParent().getElementName();
					if (!(iPackageFragmentRoot instanceof JarPackageFragmentRoot) && elementName.equals(iProject.getName())) {
						IJavaElement[] iJavaElement = iPackageFragmentRoot.getChildren();
						for (IJavaElement iJavaElement2 : iJavaElement) {
							if (iJavaElement2 instanceof IPackageFragment) {
								IPackageFragment iPackageFragment = (IPackageFragment) iJavaElement2;
								ICompilationUnit[] iCompilationUnits = iPackageFragment.getCompilationUnits();
								for (ICompilationUnit iCompilationUnit : iCompilationUnits) {
									IType iType = iCompilationUnit.getTypes()[0];
									ComponentInstance componentInstance = ComponentInstance.createInstance(iCompilationUnit.getResource(), true, null);
									componentInstance.setType(iType);
									asmlContext.addComponentInstance(componentInstance);
								}
							}
						}
					}
				}
			}
			// }
		}
	}

	private List<IProject> getOpendedProjectsInClassPath() {
		List<IProject> projects = new ArrayList<IProject>();
		IJavaProject javaProject = JavaCore.create(getProject());
		List<String> projectNames = ClassPathUtil.recuperaOpenedProjectNamesInClassPath(javaProject);
		IProject[] projectsFull = getProject().getWorkspace().getRoot().getProjects();
		for (IProject iProject : projectsFull) {
			if (iProject.isOpen() && projectNames.contains(iProject.getName()) && !iProject.getName().contains("vaccine"))
				projects.add(iProject);
		}

		return projects;
	}

	private void allExternalComponentInstancesRecoveryInJarFIles() throws JavaModelException {
		IProject project = getProject();
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragmentRoot[] packageFragmentRoots = javaProject.getAllPackageFragmentRoots();
		for (IPackageFragmentRoot iPackageFragmentRoot : packageFragmentRoots) {
			IJavaElement[] iJavaElement = iPackageFragmentRoot.getChildren();
			for (IJavaElement iJavaElement2 : iJavaElement) {
				if (iJavaElement2 instanceof IPackageFragment) {
					Set<String> paSet = asmlContext.getPackagesMathing();
					IPackageFragment iPackageFragment = (IPackageFragment) iJavaElement2;
					String elementName = iPackageFragment.getElementName();
					for (String packageFragmentName : paSet) {
						if (elementName.startsWith(packageFragmentName)) {
							IClassFile[] classFiles = iPackageFragment.getClassFiles();
							for (IClassFile iClassFile : classFiles) {
								String typePath = iClassFile.getType().getFullyQualifiedName().replaceAll("\\.", "/");
								FileInJar fileInJar = new FileInJar();
								fileInJar.setFullPath(typePath);
								ComponentInstance componentInstance = ComponentInstance.createInstance(fileInJar, true, null);
								componentInstance.setType(iClassFile.getType());
								asmlContext.addComponentInstance(componentInstance);
							}
						}
					}
				}
			}
		}
	}

	private void allInternalComponentInstancesRecovery() throws CoreException {
		IProject project = getProject();
		IPackageFragmentRoot[] packageFragmentRoots = null;
		packageFragmentRoots = asmlContext.getJavaProject().getAllPackageFragmentRoots();

		for (IPackageFragmentRoot iPackageFragmentRoot : packageFragmentRoots) {
			if (!(iPackageFragmentRoot instanceof JarPackageFragmentRoot) && iPackageFragmentRoot.getParent().getElementName().equals(project.getName())) {
				IJavaElement[] iJavaElement = iPackageFragmentRoot.getChildren();
				for (IJavaElement iJavaElement2 : iJavaElement) {
					if (iJavaElement2 instanceof IPackageFragment) {
						IPackageFragment iPackageFragment = (IPackageFragment) iJavaElement2;
						ICompilationUnit[] iCompilationUnits = iPackageFragment.getCompilationUnits();
						for (ICompilationUnit iCompilationUnit : iCompilationUnits) {
							IType iType = iCompilationUnit.getTypes()[0];
							ComponentInstance componentInstance = ComponentInstance.createInstance(iCompilationUnit.getResource(), false, null);
							componentInstance.setType(iType);
							asmlContext.addComponentInstance(componentInstance);
						}
					}
				}
			}
		}
	}

	private void allInternalComponentInstancesReferencesRecoveryIncremental(IProject project) throws CoreException {
		asmlContext.getViolations().clear();
		IResourceDelta delta = getDelta(project);
		if (delta == null) {
			allInternalComponentInstancesReferencesRecovery();
		} else {
			delta.accept(asmlContext.getResourceDeltaVisitor());
			// /allInternalComponentInstancesRecoveryNaoJava();
		}
	}

	private void allInternalComponentInstancesReferencesRecovery() throws CoreException {
		asmlContext.getJavaProject().getProject().accept(asmlContext.getResourceVisitor());
	}

	private void allTokensNameConventionRecovery(int kind) throws CoreException {
		TokensNameConventionVisitor componentRecoveryVisitor = new TokensNameConventionVisitor(asmlContext);
		Set<ASMLModel> models = new HashSet<ASMLModel>(asmlContext.getOtherAsmlModelReferenced());
		models.add(asmlContext.getAsmlModel());
		for (ASMLModel asmlModel : models) {
			EList<AbstractComponent> components = asmlModel.getComponents();
			for (AbstractComponent component : components) {
				component.accept(componentRecoveryVisitor);
			}
		}
	}

	/*
	 * private IProject inicialize(int kind) throws CoreException { IProject project = getProject(); log.log(Level.INFO, "##################################"); try { IJavaProject javaProject = JavaCore.create(project);
	 * 
	 * configuraContexto();
	 * 
	 * carregaArvoreDeComponentes();
	 * 
	 * configuraClassLoaderEspecifico(javaProject);
	 * 
	 * limpaInstanciasDeComponetesInternos(javaProject);
	 * 
	 * } catch (Throwable e) { MarkerUtils.addMarker(project, "Projeto não vacinado! Verifique se a vaccine consta no classpath do projeto.", 1, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE); throw new CoreException(Status.CANCEL_STATUS); } return project; }
	 */
	private void configuraCaminhoDaVacina(IJavaProject javaProject) {
		if (path_vaccine == null)
			path_vaccine = ClassPathUtil.recuperaPathVaccine(javaProject);
	}

	private void configuraContexto() {
		IProject project = getProject();
		IJavaProject javaProject = JavaCore.create(project);
		asmlContext = new ASMLContext();
		asmlContext.setJavaProject(javaProject);
		asmlContext.setReosurceJavaVisitor(new ASMLReosurceJavaVisitor(asmlContext));
		asmlContext.setResourceVisitor(new ASMLResourceVisitor(asmlContext));
		asmlContext.setResourceDeltaVisitor(new ASMLResourceDeltaVisitor(asmlContext));
		asmlContext.setPrintMatchingVisitor(new PrintMatchingVisitor(asmlContext));
		asmlContext.setMatchingVisitor(new MatchingVisitor(asmlContext));
		if (asmlContext.getClasspathMavenContainer() == null) {
			IClasspathContainer classpathMavenContainer = ClassPathUtil.recuperaMavenContainerClassPath(javaProject);
			asmlContext.setClasspathMavenContainer(classpathMavenContainer);
		}
		configuraCaminhoDaVacina(javaProject);
	}

	private void limpaInstanciasDeComponetesInternos() {
		asmlContext.getViolations().clear();
		try {
			asmlContext.getJavaProject().getProject().deleteMarkers(ASMLConstant.MARKER_TYPE, true, IResource.DEPTH_INFINITE);
			asmlContext.clearInternalsComponentInstance();
			asmlContext.getAsmlModel().getAllComponents().get(0).componentInstancesClearAll();// A partir da raiz limpa todos as instancias de componentes encontradas.
		} catch (CoreException e) {
			throw new RuntimeException("Erro ao limpar instancias de componentes");
		}
	}

	private void configuraClassLoaderEspecifico() {
		try {
			IJavaProject javaProject = asmlContext.getJavaProject();
			IClasspathEntry iClasspathEntryVaccine = ClassPathUtil.recuperaClassPathDaVaccina(javaProject);
			String workspacePath = javaProject.getProject().getWorkspace().getRoot().getLocation().toString();// TODO:Melhorar as duas linhas abaixo
			URL[] urls = new URL[] { new URL("file:/" + workspacePath + iClasspathEntryVaccine.getPath() + "/target/classes/") };
			asmlContext.setClassLoader(new ASMLClassLoader(urls, this.getClass().getClassLoader()));
		} catch (Exception e) {
			throw new RuntimeException("Erro ao configurar class loader especifico");
		}
	}

	private void carregaArvoreDeComponentes() {
		Resource resource = recuperaASMLModelResource(asmlContext.getJavaProject());
		EList<EObject> contents = resource.getContents();
		ASMLModel asmlModel = (ASMLModel) contents.get(0);
		asmlContext.setAsmlModel(asmlModel);
		asmlContext.setTimeStampResource(resource.getTimeStamp());
	}

	private Resource recuperaASMLModelResource(IJavaProject javaProject) {
		String path_vaccine_principal = ClassPathUtil.recuperaPathVaccine(javaProject);
		URI uri = URI.createURI(path_vaccine_principal);
		LazyLinkingResource resourcePrincipal = (LazyLinkingResource) xtextParser.getResource(uri);
		resourcePrincipal.setModified(false);
//		EObject asmlMain = resourcePrincipal.getContents().get(0);
		resourcePrincipal.getContents().clear();

/*		resourcePrincipal.getContents().clear();
		resourcePrincipal.getContents().add(asmlMain);
*/		List<IClasspathEntry> entries = ClassPathUtil.recuperaIClasspathEntriesDaVaccina(javaProject);
		// xtextParser.addAllResourcesImported(resourcePrincipal, path_vaccine_principal);
		for (IClasspathEntry iClasspathEntry : entries) {
			String path = "";
			IPath nomeProjeto = iClasspathEntry.getPath();
			if (iClasspathEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				path = "jar:file:/" + nomeProjeto.toString() + "!" + "/vaccine.asml";
//				if (!path.equals(path_vaccine_principal))
					xtextParser.addAllResourcesImported(resourcePrincipal, path);
			} else if (iClasspathEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
				path = "file:/" + javaProject.getProject().getWorkspace().getRoot().getLocation() + nomeProjeto + "/src/main/resources/vaccine.asml";
//				if (!path.equals(path_vaccine_principal))
					xtextParser.addAllResourcesImported(resourcePrincipal, path);
			}
		}
		return resourcePrincipal;
	}

	public IJavaProject getJavaProject() {
		return asmlContext.getJavaProject();
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		getProject().deleteMarkers(ASMLConstant.MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

/*	void matching(int kind) {
		log.log(Level.INFO, "Iniciou o processo matching...");


		matchingExternal();

		matchingInternal();

		printMatching();

		log.log(Level.INFO, "Finalizou o processo matching...");
	}
*/
	private void printMatching() {
		PrintMatchingVisitor printMatchingVisitor = asmlContext.getPrintMatchingVisitor();

		Set<ASMLModel> otherAsmlModelReferenced = new HashSet<ASMLModel>(asmlContext.getOtherAsmlModelReferenced());
		for (ASMLModel asmlModel : otherAsmlModelReferenced) {
			List<AbstractComponent> components = asmlModel.getComponents();
			for (AbstractComponent component : components) {
				component.accept(printMatchingVisitor);
			}
		}
		for (AbstractComponent component : asmlContext.getAsmlModel().getAllComponents()) {
			component.accept(printMatchingVisitor);
		}

	}

	private void matchingInternal() {
		MatchingVisitor matchingVisitor = asmlContext.getMatchingVisitor();
		matchingVisitor.setInternal(true);
		ASMLModel asmlModelPrincipal2 = asmlContext.getAsmlModel();
		for (AbstractComponent component : asmlModelPrincipal2.getComponents()) {
			component.accept(matchingVisitor);
		}
	}

	private void matchingExternal() {
		MatchingVisitor matchingVisitor = asmlContext.getMatchingVisitor();
		matchingVisitor.setInternal(false);
		Set<ASMLModel> otherAsmlModelReferenced = new HashSet<ASMLModel>(asmlContext.getOtherAsmlModelReferenced());
		ASMLModel asmlModelPrincipal = asmlContext.getAsmlModel();
		for (ASMLModel asmlModel : otherAsmlModelReferenced) {
			if (asmlModelPrincipal.getName().equals(asmlModel.getName()))
				continue;
			List<AbstractComponent> components = asmlModel.getComponents();
			for (AbstractComponent component : components) {
				component.accept(matchingVisitor);
			}
		}
	}

	void validate(int kind) {
		log.log(Level.INFO, "Iniciou o processo validação...");
		EList<AbstractComponent> components = asmlContext.getAsmlModel().getComponents();
		ValidatorVisitor validatorVisitor = new ValidatorVisitor(asmlContext);
		for (AbstractComponent component : components) {
			component.accept(validatorVisitor);
		}
		log.log(Level.INFO, "Finalizou o processo validação...");
	}
}
