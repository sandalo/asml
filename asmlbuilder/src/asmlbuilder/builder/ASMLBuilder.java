package asmlbuilder.builder;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
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

	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			inicialize();
			recovery(kind);
			matching();
			validate();
			show_violations();
		}
		return null;
	}

	private void show_violations() {
		for (ComponentInstance rerource : asmlContext.getComponentInstances()) {
			if (rerource.getComponent() == null)
				MarkerUtils.addMarker(rerource.getResource(), "Componente não identificado pela arquitetura!", 1, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE);
		}

		for (Violation violation : asmlContext.getViolations()) {
			MarkerUtils.addMarker(violation.getResource(), violation.getMessage(), violation.getLineNumber(), violation.getSeverity(), ASMLConstant.MARKER_TYPE);
		}
	}

	private void recovery(int kind) throws CoreException {
		allTokensNameConventionRecovery();
		allExternalComponentInstancesRecovery();
		allInternalComponentInstancesRecovery(kind);
	}

	private void allExternalComponentInstancesRecovery() {
		try {
			IJavaProject javaProject = JavaCore.create(getProject());
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
									ComponentInstance componentInstance = new ComponentInstance();
									componentInstance.setType(iClassFile.getType());
									componentInstance.setResource(fileInJar);
									componentInstance.setExternal(true);
									asmlContext.addComponentInstance(componentInstance);
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	private void allInternalComponentInstancesRecovery(int kind) throws CoreException {
		IProject project = asmlContext.getJavaProject().getProject();
		if (kind == FULL_BUILD) {
			project.accept(asmlContext.getResourceVisitor());
		} else {
			asmlContext.getViolations().clear();
			IResourceDelta delta = getDelta(project);
			if (delta == null) {
				project.accept(asmlContext.getResourceVisitor());
			} else {
				delta.accept(asmlContext.getResourceDeltaVisitor());
			}
		}
	}

	private void allTokensNameConventionRecovery() throws CoreException {
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

	private IProject inicialize() throws CoreException {
		IProject project = getProject();
		inicializaASML(project);
		project.deleteMarkers(ASMLConstant.MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		return project;
	}

	private void inicializaASML(IProject project) throws CoreException {
		try {
			IJavaProject javaProject = JavaCore.create(project);
			String path_vaccine = ClassPathUtil.recuperaPathVaccine(javaProject);
			if (true) {
				asmlContext = new ASMLContext();
				IClasspathEntry iClasspathEntryVaccine = ClassPathUtil.recuperaClassPathDaVaccina(javaProject);
				IClasspathContainer classpathMavenContainer = ClassPathUtil.recuperaMavenContainerClassPath(javaProject);
				asmlContext.setJavaProject(javaProject);
				asmlContext.setClasspathMavenContainer(classpathMavenContainer);
				if (path_vaccine != null && !"".equals(path_vaccine)) {
					Resource resource = recuperaASMLModelResource(javaProject);
					EList<EObject> contents = resource.getContents();
					ASMLModel asmlModel = (ASMLModel) contents.get(0);
					asmlContext.setTimeStampResource(resource.getTimeStamp());
					asmlContext.setAsmlModel(asmlModel);
					asmlContext.clearAll();
					asmlContext.setReosurceJavaVisitor(new ASMLReosurceJavaVisitor(asmlContext));
					asmlContext.setResourceVisitor(new ASMLResourceVisitor(asmlContext));
					asmlContext.setResourceDeltaVisitor(new ASMLResourceDeltaVisitor(asmlContext));
					String workspacePath = project.getWorkspace().getRoot().getLocation().toString();// TODO:Melhorar as duas linhas abaixo
					URL[] urls = new URL[] { new URL("file:/" + workspacePath + iClasspathEntryVaccine.getPath() + "/target/classes/") };
					asmlContext.setClassLoader(new ASMLClassLoader(urls, this.getClass().getClassLoader()));
					asmlContext.getViolations().clear();
					asmlContext.clearResource();
					asmlContext.clearAll();

				} else {
					throw new CoreException(Status.CANCEL_STATUS);
				}
			} else {
				Resource resource = recuperaASMLModelResource(javaProject);
				ASMLModel asmlModel = (ASMLModel) resource.getContents().get(0);
				asmlContext.setAsmlModel(asmlModel);
				asmlContext.setTimeStampResource(resource.getTimeStamp());
				asmlContext.clearAll();
				ComponentInstance.clearALl();
			}
		} catch (Throwable e) {
			MarkerUtils.addMarker(project, "Projeto não vacinado! Verifique se a vaccine consta no classpath do projeto.", 1, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE);
			throw new CoreException(Status.CANCEL_STATUS);
		}
	}

	private Resource recuperaASMLModelResource(IJavaProject javaProject) {
		String path_vaccine_principal = ClassPathUtil.recuperaPathVaccine(javaProject);
		URI uri = URI.createURI(path_vaccine_principal);
		LazyLinkingResource resourcePrincipal = (LazyLinkingResource) xtextParser.getResource(uri);
		resourcePrincipal.setModified(false);
		List<IClasspathEntry> entries = ClassPathUtil.recuperaIClasspathEntriesDaVaccina(javaProject);
		xtextParser.addAllResourcesImported(resourcePrincipal, path_vaccine_principal);
		for (IClasspathEntry iClasspathEntry : entries) {
			String path = "";
			IPath nomeProjeto = iClasspathEntry.getPath();
			if (iClasspathEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				path = "jar:file:/" + nomeProjeto.toString() + "!" + "/vaccine.asml";
				if (!path.equals(path_vaccine_principal))
					xtextParser.addAllResourcesImported(resourcePrincipal, path);
			} else if (iClasspathEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
				path = "file:/" + javaProject.getProject().getWorkspace().getRoot().getLocation() + nomeProjeto + "/src/main/resources/vaccine.asml";
				if (!path.equals(path_vaccine_principal))
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

	void matching() {
		MatchingVisitor matchingVisitor = new MatchingVisitor(asmlContext);

		matchingExternal(matchingVisitor);

		matchingInternal(matchingVisitor);

		PrintMatchingVisitor printMatchingVisitor = new PrintMatchingVisitor(asmlContext);

		Set<ASMLModel> otherAsmlModelReferenced = new HashSet<ASMLModel>(asmlContext.getOtherAsmlModelReferenced());
		for (ASMLModel asmlModel : otherAsmlModelReferenced) {
			List<AbstractComponent> components = asmlModel.getComponents();
			for (AbstractComponent component : components) {
				component.accept(printMatchingVisitor);
			}
		}

	}

	private void matchingInternal(MatchingVisitor matchingVisitor) {
		matchingVisitor.setInternal(true);
		ASMLModel asmlModelPrincipal2 = asmlContext.getAsmlModel();
		for (AbstractComponent component : asmlModelPrincipal2.getComponents()) {
			component.accept(matchingVisitor);
		}
	}

	private void matchingExternal(MatchingVisitor matchingVisitor) {
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

	void validate() {
		EList<AbstractComponent> components = asmlContext.getAsmlModel().getComponents();
		ValidatorVisitor validatorVisitor = new ValidatorVisitor(asmlContext);
		for (AbstractComponent component : components) {
			component.accept(validatorVisitor);
		}
	}
}
