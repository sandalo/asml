package asmlbuilder.builder;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IPlatformRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.wizards.JavaCapabilityConfigurationPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.classpath_util.ClassPathUtil;
import asmlbuilder.constants.ASMLConstant;
import asmlbuilder.matching.IMatching;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.ASMLModelStandaloneSetup;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.ExternalModule;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
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
		for (ASMLResource rerource : asmlContext.getResources()) {
			System.out.println(rerource);
			if (rerource.getComponents().isEmpty())
				MarkerUtils.addMarker(rerource.getResource(), "Componente não identificado pela arquitura!", 0, IMarker.SEVERITY_ERROR, ASMLConstant.MARKER_TYPE);
		}

		for (Violation violation : asmlContext.getViolations()) {
			MarkerUtils.addMarker(violation.getResource(), violation.getMessage(), violation.getLineNumber(), violation.getSeverity(), ASMLConstant.MARKER_TYPE);
		}
		asmlContext.print();
	}

	private void visite(int kind) throws CoreException {
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
					asmlContext.setAstJavaParser(new ASTJavaParser(new ASMLReosurceJavaVisitor(asmlContext)));
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
		loop_view: for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
				String string = "/" + component.getName();
				System.out.println(ident.append(string));
				matchingComponentInstance(component);
				System.out.println(ident.replace(ident.length() - string.length(), ident.length(), ""));
			}
		}
	}

	void validate() {
		EList<View> views = asmlContext.getAsmlModel().getViews();
		for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
				validateComponentRestrictions(component);
				validateLocalization(component);
			}
		}
	}

	AbstractComponent searchCmponent(String[] componentParentsName, AbstractComponent component) {
		if (componentParentsName[0].equals(component.getName()) && componentParentsName.length == 1) {
			return component;
		} else if (componentParentsName[0].equals(component.getName())) {
			EList<? extends AbstractComponent> abstractComponents = null;
			if (component instanceof MetaClass) {
				return component;
			}
			if (abstractComponents == null) {
				return null;
			}
		}
		return null;
	}

	void validateComponentRestrictions(AbstractComponent abstractComponent) {
		if (!getComponentsChildren(abstractComponent).isEmpty()) {
			validateComponentChildrenRetrictions(abstractComponent);
		}
		EList<Restriction> restrictions = ASMLContext.getRestrictions(abstractComponent);
		for (Restriction restriction : restrictions) {
			EList<AbstractComponent> componentsA = restriction.getComponentA();
			AbstractComponent componentB = restriction.getComponentB();
			for (AbstractComponent componentA : componentsA) {
				RestricionChecker restricionChecker = asmlContext.getAsmlBinder().getBindRestrictionChecker().get(restriction.getRelactionType());
				if (restricionChecker != null) {
					restricionChecker.checker(restriction, componentA, componentB);
				} else {
					System.out.println("Restriction checker ainda não implementado.");
				}
			}
		}
	}

	void validateLocalization(AbstractComponent abstractComponent) {
		if (!getComponentsChildren(abstractComponent).isEmpty()) {
			validateLocalizationChildren(abstractComponent);
		}
		Set<ASMLResource> resourcesFilho = asmlContext.getInstancesByComponent((AbstractComponent) abstractComponent);
		for (ASMLResource resourceFilho : resourcesFilho) {
			if (!localizacaoCorreta(abstractComponent, resourceFilho.getResource())) {
				String message = "O  componente  " + abstractComponent.getName() + " esta localizado no lugar errado";
				asmlContext.getViolations().add(new Violation(resourceFilho.getResource(), message, 1, IMarker.SEVERITY_ERROR));
			}
		}
	}

	private void validateComponentChildrenRetrictions(AbstractComponent component) {
		EList<? extends AbstractComponent> abstractComponents = getComponentsChildren(component);
		for (AbstractComponent abstractComponent : abstractComponents) {
			validateComponentRestrictions(abstractComponent);
		}
	}

	private void validateLocalizationChildren(AbstractComponent component) {
		EList<? extends AbstractComponent> abstractComponents = getComponentsChildren(component);
		for (AbstractComponent abstractComponent : abstractComponents) {
			validateLocalization(abstractComponent);
		}
	}

	void matchingComponentInstance(AbstractComponent component) {
		EList<? extends AbstractComponent> abstractComponentsChildren = getComponentsChildren(component);
		for (AbstractComponent child : abstractComponentsChildren) {
			String string = "/" + child.getName();
			System.out.println(ident.append(string));
			matchingComponentInstance(child);
			System.out.println(ident.replace(ident.length() - string.length(), ident.length(), ""));
		}
		matching(component);
	}

	private void matching(AbstractComponent component) {
		asmlContext.addMatchingCustom(component);
		asmlContext.addDeclaredComponents(component);
		List<ASMLResource> resources = new ArrayList<ASMLResource>(asmlContext.getResources());
		Collections.reverse(resources);
		boolean matching = false;
		for (ASMLResource resource : resources) {
			IMatching iMatching = asmlContext.getMatching(component);
			if (iMatching == null)
				continue;
			matching = iMatching.matching(resource, component);
			if (matching) {
				component.addResources(resource);
				resource.addComponents(component);
			}
		}
	}

	private boolean localizacaoCorreta(AbstractComponent component, IResource resource) {
		boolean matching = true;
		return matching;
	}

	private EList<? extends AbstractComponent> getComponentsChildren(AbstractComponent component) {
		if (component instanceof Module) {
			return ((Module) component).getComponents();
		} else if (component instanceof MetaModule) {
			return ((MetaModule) component).getComponents();
		} else if (component instanceof ExternalModule) {
			return ((ExternalModule) component).getComponents();
		}
		return new BasicEList<AbstractComponent>();// Lista vazia
	}

}
