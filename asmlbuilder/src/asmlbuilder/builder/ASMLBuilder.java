package asmlbuilder.builder;

import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.classpath_util.ClassPathUtil;
import asmlbuilder.constants.ASMLConstant;
import asmlbuilder.matching.MatchingVisitor;
import asmlbuilder.validation.ValidatorVisitor;
import br.ufmg.dcc.asml.ASMLModelStandaloneSetup;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class ASMLBuilder extends IncrementalProjectBuilder {
	private static final Logger log = Logger.getLogger(ASMLBuilder.class.getName());

	private ASMLContext asmlContext;
	private StringBuilder ident = new StringBuilder();

	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		inicialize();
		visite(kind);
		matching();
		validate();
		print_violations();
		return null;
	}

	private void print_violations() {
		for (ComponentInstance rerource : asmlContext.getComponentInstances()) {
			System.out.println(rerource);
			if (rerource.getComponent() == null)
				MarkerUtils.addMarker(rerource.getResource(), "Componente não identificado pela arquitura!", 0, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE);
		}

		for (Violation violation : asmlContext.getViolations()) {
			MarkerUtils.addMarker(violation.getResource(), violation.getMessage(), violation.getLineNumber(), violation.getSeverity(), ASMLConstant.MARKER_TYPE);
		}
	}

	private void visite(int kind) throws CoreException {
		resourcesRecovery(kind);
		componentsRecovery();
		externalComponentsRecovery();
	}

	private void externalComponentsRecovery() {
		Set<AbstractComponent> components = asmlContext.getDeclaredComponents();
		Object resourceType = null;
		IJavaProject javaProject = asmlContext.getJavaProject();
		for (AbstractComponent abstractComponent : components) {
			try {
				String matching = abstractComponent.getMatching();
				if(matching==null)
					continue;
				if (matching.contains("*")) {
					String typeName = matching.replace(".*", "");
					IPackageFragmentRoot[] packageFragmentRoots = javaProject.getAllPackageFragmentRoots();
					for (IPackageFragmentRoot iPackageFragmentRoot : packageFragmentRoots) {
						IPackageFragment iPackageFragment = iPackageFragmentRoot.getPackageFragment(typeName);
						if (iPackageFragment.exists()) {
							resourceType = iPackageFragment;
							ComponentInstance componentInstance = new ComponentInstance();
							componentInstance.setType(resourceType);
							abstractComponent.addComponentInstance(componentInstance);
							componentInstance.setComponent(abstractComponent);
							IResource correspondingResource = iPackageFragment.getCorrespondingResource();
							componentInstance.setResource(correspondingResource);
							IClassFile[] classFiles = iPackageFragment.getClassFiles();
							for (IClassFile iClassFile : classFiles) {
								IType iType = iClassFile.getType();
								ComponentInstance componentInstance2 = new ComponentInstance();
								componentInstance2.setComponent(abstractComponent);
								componentInstance2.setType(iType);
								abstractComponent.addComponentInstance(componentInstance2);
							}
						}
					}
					javaProject.getPackageFragmentRoot("");
				} else {
					try {
						resourceType = javaProject.findType(matching);
					} catch (Exception e2) {

					}
					if (resourceType != null) {
						IType iType = (IType) resourceType;
						ComponentInstance componentInstance = new ComponentInstance();
						componentInstance.setType(iType);
						abstractComponent.addComponentInstance(componentInstance);
						componentInstance.setComponent(abstractComponent);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void resourcesRecovery(int kind) throws CoreException {
		IProject project = asmlContext.getJavaProject().getProject();
		if (kind == FULL_BUILD) {
			asmlContext.clearAll();
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

	private void componentsRecovery() throws CoreException {
		EList<AbstractComponent> components = asmlContext.getAsmlModel().getComponents();
		ComponentRecoveryVisitor componentRecoveryVisitor = new ComponentRecoveryVisitor(asmlContext);
		for (AbstractComponent component : components) {
			component.accept(componentRecoveryVisitor);
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
			if (asmlContext == null) {
				asmlContext = new ASMLContext();
				IClasspathEntry iClasspathEntryVaccine = ClassPathUtil.recuperaClassPathDaVaccina(javaProject);
				IClasspathContainer classpathMavenContainer = ClassPathUtil.recuperaMavenContainerClassPath(javaProject);
				asmlContext.setJavaProject(javaProject);
				asmlContext.setClasspathMavenContainer(classpathMavenContainer);
				if (path_vaccine != null && !"".equals(path_vaccine)) {
					Resource resource = recuperaASMLModelResource(path_vaccine);
					ASMLModel asmlModel = (ASMLModel) resource.getContents().get(0);
					asmlContext.setTimeStampResource(resource.getTimeStamp());
					asmlContext.setAsmlModel(asmlModel);
					asmlContext.clearAll();
					asmlContext.setReosurceJavaVisitor(new ASMLReosurceJavaVisitor(asmlContext));
					asmlContext.setResourceVisitor(new ASMLResourceVisitor(asmlContext));
					asmlContext.setResourceDeltaVisitor(new ASMLResourceDeltaVisitor(asmlContext));
					String workspacePath = project.getPathVariableManager().getValue("WORKSPACE_LOC").toString();// TODO:Melhor
																													// as
																													// duas
																													// linhas
																													// abaixo
					URL[] urls = new URL[] { new URL("file:/" + workspacePath + iClasspathEntryVaccine.getPath() + "/target/classes/") };
					asmlContext.setClassLoader(new ASMLClassLoader(urls, this.getClass().getClassLoader()));
					asmlContext.getViolations().clear();
					asmlContext.clearResource();
				} else {
					System.out.println("Não  encotrou a vaccine...");
					throw new CoreException(Status.CANCEL_STATUS);
				}
			} else {
				Resource resource = recuperaASMLModelResource(path_vaccine);
				if (asmlContext.getTimeStampResource() != resource.getTimeStamp()) {
					ASMLModel asmlModel = (ASMLModel) resource.getContents().get(0);
					asmlContext.setAsmlModel(asmlModel);
					asmlContext.setTimeStampResource(resource.getTimeStamp());
					asmlContext.clearAll();
				} else {
					asmlContext.clearDeclaredComponents();
					asmlContext.getViolations().clear();
				}
			}
		} catch (Throwable e) {
			throw new CoreException(Status.CANCEL_STATUS);
		}
	}

	private Resource recuperaASMLModelResource(String path_vaccine) {
		// Injector injector = Guice.createInjector(new
		// ASMLModelStandaloneSetup());
		ASMLModelStandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		URI createURI = URI.createURI(path_vaccine);
		Resource resource = rs.getResource(createURI, true);
		return resource;
	}

	public IJavaProject getJavaProject() {
		return asmlContext.getJavaProject();
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		// delete markers set and files created
		getProject().deleteMarkers(ASMLConstant.MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

	void matching() {
		ident = new StringBuilder();
		EList<AbstractComponent> components = asmlContext.getAsmlModel().getComponents();
		MatchingVisitor matchingVisitor = new MatchingVisitor(asmlContext);
		for (AbstractComponent component : components) {
			String string = "/" + component.getName();
			System.out.println(ident.append(string));
			component.accept(matchingVisitor);
			System.out.println(ident.replace(ident.length() - string.length(), ident.length(), ""));
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
