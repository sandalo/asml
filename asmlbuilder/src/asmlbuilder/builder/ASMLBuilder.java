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
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.BinaryType;
import org.eclipse.jdt.internal.core.ClassFile;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.internal.core.ResolvedSourceType;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.classpath_util.ClassPathUtil;
import asmlbuilder.constants.ASMLConstant;
import asmlbuilder.matching.MatchingVisitor;
import asmlbuilder.validation.ValidatorVisitor;
import br.ufmg.dcc.asml.ASMLModelStandaloneSetup;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.ExternalClass;
import br.ufmg.dcc.asml.aSMLModel.View;

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
			if (rerource.getComponents().isEmpty())
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
		for (AbstractComponent abstractComponent : components) {
			if (abstractComponent instanceof ExternalClass) {
				ExternalClass externalClass = (ExternalClass) abstractComponent;
				String typeName = externalClass.getType();
				IType iType = null;
				IJavaProject javaProject = asmlContext.getJavaProject();
				try {
					iType = javaProject.findType(typeName);
				} catch (Exception e) {
					// TODO: handle exception
				}
				if(iType==null){
					String name = externalClass.getName();
					try {
						iType = javaProject.findType(name);
					} catch (Exception e) {
						
					}
					if(iType==null)
						continue;
				}
				ComponentInstance componentInstance = new ComponentInstance();
				componentInstance.setType(iType);
				externalClass.addComponentInstance(componentInstance);
				componentInstance.addComponents(externalClass);
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
		EList<View> views = asmlContext.getAsmlModel().getViews();
		ComponentRecoveryVisitor componentRecoveryVisitor = new ComponentRecoveryVisitor(asmlContext); 
		for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
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
					String workspacePath = project.getPathVariableManager().getValue("WORKSPACE_LOC").toString();// TODO:
																													// Melhor
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
		EList<View> views = asmlContext.getAsmlModel().getViews();
		MatchingVisitor matchingVisitor = new MatchingVisitor(asmlContext);
		for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
				String string = "/" + component.getName();
				System.out.println(ident.append(string));
				component.accept(matchingVisitor);
				System.out.println(ident.replace(ident.length() - string.length(), ident.length(), ""));
			}
		}
	}

	void validate() {
		EList<View> views = asmlContext.getAsmlModel().getViews();
		ValidatorVisitor validatorVisitor = new ValidatorVisitor(asmlContext);
		for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
				component.accept(validatorVisitor);
			}
		}
	}
}
