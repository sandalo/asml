package asmlbuilder.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.xml.sax.SAXException;

import br.ufmg.dcc.asml.ASMLModelStandaloneSetup;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.ExternalClass;
import br.ufmg.dcc.asml.aSMLModel.ExternalModule;
import br.ufmg.dcc.asml.aSMLModel.File;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.ModuleMatching;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.View;

public class ASMLBuilder extends IncrementalProjectBuilder {
	private static final Logger log = Logger.getLogger(ASMLBuilder.class.getName());

	private IClasspathContainer classpathMavenContainer;
	private CacheASML cacheASML;
	private ASMLResourceVisitor resourceVisitor;
	private ASMLResourceDeltaVisitor resourceDeltaVisitor;
	private ASMLReosurceJavaVisitor asmlReosurceJavaVisitor;
	private ASTJavaParser astJavaParser;
	public static final String BUILDER_ID = "asmlbuilder.asmlBuilder";
	private static final String MARKER_TYPE = "asmlbuilder.asmlProblem";
	private SAXParserFactory parserFactory;
	private IJavaProject javaProject;
	private ASMLModel asmlModel;

	private long timeStampResource;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	private String recuperaPathVaccine(IProject project, IClasspathEntry iClasspathEntryVaccine) {
		String path_vaccine_in_open_project;
		if (iClasspathEntryVaccine.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
			path_vaccine_in_open_project = "jar:file:/" + iClasspathEntryVaccine.getPath() + "!" + "/vaccine.asml";
		} else {
			String workspacePath = project.getPathVariableManager().getValue("WORKSPACE_LOC").toString();
			path_vaccine_in_open_project = "file:/" + workspacePath + iClasspathEntryVaccine.getPath() + "/src/main/resources/" + "vaccine.asml";
		}
		return path_vaccine_in_open_project;
	}

	private void parserArchitecture(String path_vaccine_in_open_project) {
		ASMLModelStandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		URI createURI = URI.createURI(path_vaccine_in_open_project);
		Resource resource = rs.getResource(createURI, true);
		long timeStampResource = resource.getTimeStamp();
		if (this.timeStampResource != timeStampResource) {
			this.timeStampResource = timeStampResource;
			asmlModel = (ASMLModel) resource.getContents().get(0);
			cacheASML = new CacheASML(asmlModel);
			resourceVisitor = new ASMLResourceVisitor(cacheASML);
			resourceDeltaVisitor = new ASMLResourceDeltaVisitor(cacheASML);
			asmlReosurceJavaVisitor = new ASMLReosurceJavaVisitor(cacheASML);
			astJavaParser = new ASTJavaParser(asmlReosurceJavaVisitor);
		} else {
			cacheASML.getResourcesNotMatchedInStaticAnalysis().clear();
			cacheASML.getResourcesMatchedInStaticAnalysis().clear();
		}
		// cacheASML.getInstancesOfComponentsFound().clear();
		cacheASML.getViolations().clear();
	}

	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		
		try {
			Class c = getJavaProject().findType("br.ufmg.vaccine.Vaccine").getClass();
			 c = Class.forName("br.ufmg.vaccine.Vaccine");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		IProject project = getProject();
		project.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
		inicializaASML(project);
		if (kind == FULL_BUILD) {
			project.accept(resourceVisitor);
		} else {
			IResourceDelta delta = getDelta(project);
			if (delta == null) {
				project.accept(resourceVisitor);
			} else {
				delta.accept(resourceDeltaVisitor);
			}
		}

		matching();

		for (IResource resourceNotMatchedInStaticAnalysis : cacheASML.getResourcesNotMatchedInStaticAnalysis()) {
			MarkerUtils.addMarker(resourceNotMatchedInStaticAnalysis, "Componente não validado pela arquitura!", 0, IMarker.SEVERITY_ERROR, MARKER_TYPE);
		}

		validate();

		for (Violation violation : cacheASML.getViolations()) {
			MarkerUtils.addMarker(violation.getResource(), violation.getMessage(), violation.getLineNumber(), violation.getSeverity(), MARKER_TYPE);
		}

		return null;
	}

	private void inicializaASML(IProject project) throws CoreException {
		try {
			javaProject = JavaCore.create(project);
			IClasspathEntry iClasspathEntryVaccine = recuperaClassPathDaVaccina();
			String path_vaccine = "";// "jar:file:/C:/Users/sandalo/workspace-indigo/parser-architecturemodel/lib/vaccine.jar!/br/sandalo/dsl/xtex/parser/teste.arch";
			if (iClasspathEntryVaccine != null) {
				path_vaccine = recuperaPathVaccine(project, iClasspathEntryVaccine);
				parserArchitecture(path_vaccine);
			}
		} catch (Throwable e) {
			throw new CoreException(Status.CANCEL_STATUS);
		}
	}

	private IClasspathEntry recuperaClassPathDaVaccina() throws JavaModelException {
		IClasspathContainer classpathMavenContainer = recuperaMavenContainerClassPath();
		if (classpathMavenContainer == null) {
			log.info("Não encoutro o classPathContainer Maven.");
			return null;
		}
		IClasspathEntry[] classpathEntryMaven = classpathMavenContainer.getClasspathEntries();
		log.info("Começa a varredura para encontrar iClasspathEntry de vaccine...");
		for (IClasspathEntry iClasspathEntry : classpathEntryMaven) {
			log.info("Encontrou " + iClasspathEntry.getPath().toString());
			IClasspathAttribute attributes[] = iClasspathEntry.getExtraAttributes();
			for (IClasspathAttribute iClasspathAttribute : attributes) {
				if (iClasspathAttribute.getValue().contains("vaccine")) {
					log.info("Encontrou jar ou porjeto maven da vaccine...:" + iClasspathEntry.getPath().toString());
					return iClasspathEntry;
				}
			}
		}
		log.info("Não encontrou iClasspathEntry");
		return null;
	}

	public IClasspathContainer recuperaMavenContainerClassPath() throws JavaModelException {
		if (classpathMavenContainer != null)
			return classpathMavenContainer;
		IClasspathEntry[] rawClasspath = getJavaProject().getRawClasspath();
		log.info("rawClasspath encontrados: " + rawClasspath + " size:" + rawClasspath.length);
		IClasspathEntry iClasspathEntryMAVEN = null;
		for (IClasspathEntry iClasspathEntry : rawClasspath) {
			log.info("   encontrou a entrada:" + iClasspathEntry.getPath() + " EntryKind:" + iClasspathEntry.getEntryKind() + " no classpath.");
			if (iClasspathEntry.getPath().toString().contains("MAVEN")) {
				iClasspathEntryMAVEN = iClasspathEntry;
				log.info("      vai recuperar o classpathContainer no path: " + iClasspathEntryMAVEN.getPath() + " size:" + rawClasspath.length);
				classpathMavenContainer = JavaCore.getClasspathContainer(iClasspathEntryMAVEN.getPath(), getJavaProject());
				log.info("       Recuperou o classpathContainer MAVEN");
				return classpathMavenContainer;
			}
		}
		return null;
	}

	public IJavaProject getJavaProject() {
		return javaProject;
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		// delete markers set and files created
		getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
	}

	void matching() {
		EList<View> views = asmlModel.getViews();
		loop_view: for (View view : views) {
			for (AbstractComponent component : view.getComponents()) {
				if (findComponentInstance(component)) {
					break loop_view;
				}
			}
		}
	}

	void validate() {
		EList<View> views = asmlModel.getViews();
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
		if (abstractComponent instanceof Module || abstractComponent instanceof MetaModule || abstractComponent instanceof ExternalModule) {
			EList<Restriction> restrictions = null;
			if (abstractComponent instanceof Module)
				restrictions = ((Module) abstractComponent).getRestrictions();
			if (abstractComponent instanceof MetaModule)
				restrictions = ((MetaModule) abstractComponent).getRestrictions();
			if (abstractComponent instanceof ExternalModule)
				restrictions = ((ExternalModule) abstractComponent).getRestrictions();
			for (Restriction restriction : restrictions) {
				EList<AbstractComponent> componentsA = restriction.getComponentA();
				AbstractComponent componentB = restriction.getComponentB();
				for (AbstractComponent componentA : componentsA) {
					if (restriction.getGroupClause().equals(GroupClause.NULL) && restriction.getPermissionClause().equals(PermissionClause.NULL) && restriction.getRelactionType().equals(RelactionType.REQUIRES)) {
						anyComponentAMustRequiresCompontB(restriction, componentA, componentB);
					} else if (restriction.getGroupClause().equals(GroupClause.ANY) && restriction.getPermissionClause().equals(PermissionClause.MUST) && restriction.getRelactionType().equals(RelactionType.EXTEND)) {
						anyComponentAMustExtendCompontB(restriction, componentA, componentB);
					} else if (restriction.getGroupClause().equals(GroupClause.ONLY) && restriction.getPermissionClause().equals(PermissionClause.CAN) && restriction.getRelactionType().equals(RelactionType.HANDLE)) {
						onlyComponentAHandleCompontB(restriction, componentA, componentB);
					}
				}
			}
		}
	}

	void validateLocalization(AbstractComponent abstractComponent) {
		if (!getComponentsChildren(abstractComponent).isEmpty()) {
			validateLocalizationChildren(abstractComponent);
		}
		Set<IResource> resourcesFilho = cacheASML.getInstancesByComponent((AbstractComponent) abstractComponent);
		for (IResource resourceFilho : resourcesFilho) {
			if (!localizacaoCorreta(abstractComponent, resourceFilho)) {
				String message = "O  componente  " + abstractComponent.getName() + " esta localizado no lugar errado";
				cacheASML.getViolations().add(new Violation(resourceFilho, message, 1, IMarker.SEVERITY_ERROR));
			}
		}

		/*
		 * EObject eoPai = abstractComponent.eContainer(); Set<IResource>
		 * resourcesPai = null; if (eoPai instanceof View || eoPai instanceof
		 * FrameworkInstantiation) { resourcesPai = new HashSet<IResource>();
		 * resourcesPai.add(getProject()); } else { resourcesPai =
		 * cacheASML.getInstancesByComponent((AbstractComponent) eoPai); } for
		 * (IResource resourceFilho : resourcesFilho) { if
		 * (isNameSpace(resourceFilho, abstractComponent)) { continue; }
		 * matching = false; for (IResource resourcePai : resourcesPai) { if
		 * (resourcePai
		 * .getFullPath().equals(resourceFilho.getParent().getFullPath())) {
		 * matching = true; break; } } if (!matching) { String message =
		 * "O  componente  " + abstractComponent.getName() +
		 * " esta localizado no lugar errado"; cacheASML.getViolations().add(new
		 * Violation(resourceFilho, message, 1, IMarker.SEVERITY_ERROR)); } }
		 */}

	private void anyComponentAMustRequiresCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<IResource> instances = cacheASML.getInstancesByComponent(componentA);
		for (IResource iResource : instances) {
			if (componentB instanceof MetaClass && componentA instanceof MetaClass) {
				MetaClass classeB = (MetaClass) componentB;
				MetaClass classeA = (MetaClass) componentA;
				AbstractNameConvetion matchingB = classeB.getMatching();
				AbstractNameConvetion matchingA = classeA.getMatching();
				if (matchingB instanceof ClassMatching && matchingA instanceof ClassMatching) {
					ClassMatching classMatchigB = (ClassMatching) matchingB;
					ClassMatching classMatchigA = (ClassMatching) matchingA;
					String resourcetName = iResource.getName();
					if (classMatchigB.getExpressionMatching().equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
						resourcetName = extractResourceName(iResource);
						resourcetName = resourcetName.replaceAll(classMatchigA.getParameter(), classMatchigB.getParameter());
						if (!cacheASML.existInstancesOfComponentWithName(resourcetName, componentB.getName())) {
							String message = "Todo componente " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName() + ": " + classeA.getDescription() + ". " + "Descrição do componente " + classeB.getName() + ": " + classeB.getDescription() + ".";
							cacheASML.getViolations().add(new Violation(iResource, message, 1, IMarker.SEVERITY_ERROR));
						}
					}
				}
			}
			if (componentB instanceof MetaClass && componentA instanceof File) {
				MetaClass classeB = (MetaClass) componentB;
				File classeA = (File) componentA;
				AbstractNameConvetion matchingB = classeB.getMatching();
				AbstractNameConvetion matchingA = classeA.getMatching();
				if (matchingB instanceof ClassMatching && matchingA instanceof ClassMatching) {
					ClassMatching classMatchigB = (ClassMatching) matchingB;
					ClassMatching classMatchigA = (ClassMatching) matchingA;
					String resourcetName = iResource.getName();
					if (classMatchigB.getExpressionMatching().equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
						resourcetName = extractResourceName(iResource);
						resourcetName = resourcetName.replaceAll(classMatchigA.getParameter(), classMatchigB.getParameter());
						if (!cacheASML.existInstancesOfComponentWithName(resourcetName, componentB.getName())) {
							String message = "Todo componente " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName() + ": " + "Implmentar descrição" + ". " + "Descrição do componente " + classeB.getName() + ": " + classeB.getDescription() + ".";
							cacheASML.getViolations().add(new Violation(iResource, message, 1, IMarker.SEVERITY_ERROR));
						}
					}
				}
			}
			if (componentB instanceof MetaClass && componentA instanceof Module) {
				MetaClass classeB = (MetaClass) componentB;
				Module classeA = (Module) componentA;
				AbstractNameConvetion matchingB = classeB.getMatching();
				ModuleMatching matchingA = classeA.getMatching();
				if (matchingB instanceof ClassMatching) {
					ClassMatching classMatchigB = (ClassMatching) matchingB;
					String resourcetName = iResource.getName();
					resourcetName = extractResourceName(iResource);
					resourcetName = resourcetName + classMatchigB.getParameter();
					if (!cacheASML.existInstancesOfComponentWithName(resourcetName, componentB.getName())) {
						String message = "Todo componente  " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName() + ": " + "Implmentar descrição" + ". " + "\nDescrição do componente " + classeB.getName() + ": " + classeB.getDescription() + ".";
						cacheASML.getViolations().add(new Violation(iResource, message, 1, IMarker.SEVERITY_ERROR));
					}
				}
			}

		}
	}

	private void anyComponentAMustExtendCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<IResource> instances = cacheASML.getInstancesByComponent(componentA);
		int lineNumber = 0;
		for (IResource iResource : instances) {
			boolean achou = false;
			if (componentA instanceof MetaClass && componentB instanceof ExternalClass) {
				if (iResource instanceof IFile) {
					Set<ASMLASTNode> asmlASTNodes = cacheASML.getInstancesOfASTNodeJavaFound().get(iResource).get(TypeDeclaration.class);
					for (ASMLASTNode asmlASTNode : asmlASTNodes) {
						TypeDeclaration typeDeclaration = (TypeDeclaration) asmlASTNode.getAstNode();
						try {
							IType iType = getType((IResource) asmlASTNode.getResource());
							ITypeHierarchy typeHierarchy = iType.newSupertypeHierarchy(new NullProgressMonitor());
							IType[] iTypes = typeHierarchy.getAllSupertypes(iType);
							for (IType iType2 : iTypes) {
								if (iType2.getFullyQualifiedName().equals(componentB.getName())) {
									achou = true;
								}
							}
						} catch (JavaModelException e) {
							e.printStackTrace();
						}
						lineNumber = asmlASTNode.getCompilationUnit().getLineNumber(typeDeclaration.getStartPosition());
					}
				}
			}
			if (!achou) {
				String message = "";
				if (restriction.getDescription() != null)
					message = restriction.getDescription();
				else
					message = "Classes do tipo " + componentA.getName() + " devem herdar da classe " + componentB.getName();
				cacheASML.getViolations().add(new Violation(iResource, message, lineNumber, IMarker.SEVERITY_ERROR));
			}
		}
	}

	private void onlyComponentAHandleCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<IResource> instances = cacheASML.getInstancesByComponent(componentB);
		for (IResource iResource : instances) {
			if (cacheASML.existInstancesOfComponentWithName(iResource.getName(), componentB.getName())) {
				Set<IResource> resourcesComponenteA = cacheASML.getInstancesByComponent(componentA);
				boolean not_found = true;
				for (IResource resourceComponenteA : resourcesComponenteA) {
					if (resourceComponenteA.getFullPath().isPrefixOf(iResource.getFullPath())) {
						not_found = false;
						break;
					}
				}
				if (not_found) {
					String message = "Somente componente o " + componentA.getName() + " pode tratar, lidar ou conter componentes " + componentB.getName();
					cacheASML.getViolations().add(new Violation(iResource, message, 1, IMarker.SEVERITY_ERROR));
				}
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

	boolean findComponentInstance(AbstractComponent component) {
		if (!getComponentsChildren(component).isEmpty()) {
			boolean findInChildrenComponents = findInChildrenComponents(component);
			if (findInChildrenComponents) {
				return findInChildrenComponents;
			} else
				return matching(component);
		} else
			return matching(component);
	}

	private boolean findInChildrenComponents(AbstractComponent component) {
		EList<? extends AbstractComponent> abstractComponents = getComponentsChildren(component);
		for (AbstractComponent abstractComponent : abstractComponents) {
			boolean existComponent = findComponentInstance(abstractComponent);
			if (existComponent)
				return existComponent;
		}
		return false;
	}

	private boolean matching(AbstractComponent component) {
		List<IResource> resources = new ArrayList<IResource>(cacheASML.getResources());
		Collections.reverse(resources);
		for (IResource resource : resources) {
			boolean matching = false;
			if (resource.getName().equals(getProject().getName()))
				continue;
			if (component instanceof File && resource instanceof IFile && (resource.getFileExtension().equals("xml") || resource.getFileExtension().equals("html") || !resource.getFileExtension().equals("java"))) {
				matching = matchingFile(resource, component);
			} else if (component instanceof MetaClass && resource instanceof IFile && resource.getFileExtension().equals("java")) {
				matching = matchingJava(resource, component);
			} else if ((component instanceof Module) && resource instanceof IFolder) {
				matching = matchingModule(resource, (Module) component);
			} else if ((component instanceof MetaModule) && resource instanceof IFolder) {
				matching = matchingMetaModule(resource, (MetaModule) component);
			} else if ((component instanceof ExternalModule) && resource instanceof IFolder) {
				matching = matchingExternalModule(resource, (ExternalModule) component);
			}
			if (matching) {
				matching = localizacaoCorreta(component, resource);
			}
			if (!matching) {
				if (!cacheASML.getResourcesMatchedInStaticAnalysis().contains(resource)) {
					cacheASML.getResourcesNotMatchedInStaticAnalysis().add(resource);
				}
			} else {
				cacheASML.getResourcesNotMatchedInStaticAnalysis().remove(resource);
				cacheASML.getResourcesMatchedInStaticAnalysis().add(resource);
				cacheASML.addInstanceOfComponent(component, resource);
			}
		}

		return false;
	}

	private boolean localizacaoCorreta(AbstractComponent component, IResource resource) {
		boolean matching = true;
		EObject eoPai = component.eContainer();
		IResource resourcePai = resource.getParent();
		while (eoPai instanceof MetaModule) {
			eoPai = eoPai.eContainer();
			resourcePai = resourcePai.getParent();
		}
		if (!(eoPai instanceof View)) {
			AbstractComponent eoPai2 = (AbstractComponent) eoPai;
			if (!(eoPai2 instanceof MetaModule)&&!(eoPai2 instanceof ExternalModule)) {// Framework é conceito abstrato
				String name = eoPai2.getName();
				if (eoPai2 instanceof Module && !((Module) eoPai2).getAttributes().isEmpty() && ((Module) eoPai2).getAttributes().get(0).getName().equals("namespace")) {
					name = ((Module) eoPai2).getAttributes().get(0).getValue().split("\\.")[1];// TODO
				}
				if (!(resourcePai.getName().replaceAll("." + resourcePai.getFileExtension(), "").equals(name))) {
					matching = false;
				}
			}
		}
		return matching;
	}

	private boolean matchingComponent(AbstractComponent component, IResource resource) {
		boolean matching;
		matching = resource.getName().replaceAll("." + resource.getFileExtension(), "").equals(component.getName());
		return matching;
	}

	private EList<? extends AbstractComponent> getComponentsChildren(AbstractComponent component) {
		if (component instanceof Module) {
			return ((Module) component).getComponents();
		} else if (component instanceof MetaModule) {
			return ((MetaModule) component).getComponents();
		}else if (component instanceof ExternalModule) {
			return ((ExternalModule) component).getComponents();
		}
		return new BasicEList<AbstractComponent>();// Lista vazia
	}

	boolean findJavaClass(IResource resource, AbstractComponent component) {
		if (component instanceof MetaClass) {
			if (matchingJava(resource, component)) {
				return true;
			}
		}
		return false;
	}

	private boolean matchingJava(IResource resource, AbstractComponent abstractComponent) {
		MetaClass class1 = (MetaClass) abstractComponent;
		AbstractNameConvetion abstractNameConvetion = class1.getMatching();
		if (abstractNameConvetion instanceof ClassMatching) {
			ClassMatching expressionMatching = (ClassMatching) abstractNameConvetion;
			ExpressionMatchingClause clause = expressionMatching.getExpressionMatching();
			if (clause.equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
				String parameter = expressionMatching.getParameter() + "";
				String resourceName = extractResourceName(resource);
				if (resourceName.endsWith(parameter)) {
					astJavaParser.parse((IFile) resource, cacheASML);
					return true;
				}
			}
		}
		return false;
	}

	private IType getType(IResource resource) {
		IType iType = null;
		try {
			IClasspathEntry[] classpathEntries = getJavaProject().getRawClasspath();
			String logicalName = " ";
			for (IClasspathEntry iClasspathEntry : classpathEntries) {
				if (iClasspathEntry.getPath().isPrefixOf(resource.getFullPath())) {
					logicalName = resource.getFullPath().toString().replace(iClasspathEntry.getPath().toString(), "");
					break;
				}
			}
			logicalName = logicalName.substring(1).replace("/", ".").replace(".java", "");

			iType = getJavaProject().findType(logicalName);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return iType;
	}

	private boolean matchingFile(IResource resource, AbstractComponent component) {
		br.ufmg.dcc.asml.aSMLModel.File file = (File) component;
		AbstractNameConvetion abstractNameConvetion = file.getMatching();
		String fileExtensioWithPoint = "." + resource.getFileExtension();
		if (abstractNameConvetion != null) {
			if (abstractNameConvetion instanceof ClassMatching) {
				ClassMatching expressionMatching = (ClassMatching) abstractNameConvetion;
				ExpressionMatchingClause clause = expressionMatching.getExpressionMatching();
				if (clause.equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
					String parameter = expressionMatching.getParameter() + "";
					String resourceName = extractResourceName(resource);
					if (resourceName.endsWith(parameter)) {
						return true;
					}
				}
			}
		} else {
			String replaceAll = resource.getName().replaceAll(fileExtensioWithPoint, "");
			if (replaceAll.equals(component.getName()) || component.getName().equals(fileExtensioWithPoint))
				return true;
		}

		return false;
	}

	private String extractResourceName(IResource resource) {
		String fileExtensioWithPoint = "";
		int positionExtension = 0;
		if (resource.getFileExtension() != null) {
			fileExtensioWithPoint = "." + resource.getFileExtension();
			positionExtension = resource.getName().indexOf(fileExtensioWithPoint);
		} else {
			positionExtension = resource.getName().length();
		}
		if (positionExtension == 0) {
			return resource.getName();
		}
		int index = positionExtension - 1;
		if (index != 0) {
			while (Character.isDigit(resource.getName().charAt(index))) {
				index--;
			}
			String resourceName = resource.getName().replaceAll(fileExtensioWithPoint, "");
			resourceName = resourceName.substring(0, index + 1);
			return resourceName;
		}
		return resource.getName();
	}

	private boolean matchingModule(IResource resource, Module module) {
		boolean isNameSapce = isNameSpace(resource, module);
		if (isNameSapce) {
			return true;
		} else {
			String resourceName = resource.getName();
			String fullPath = resource.getFullPath().toString().replaceAll("/", ".");
			if (fullPath.endsWith(module.getName())) {
				return true;
			}
			boolean basicMatching = resourceName.equals(module.getName()) || module.getName().contains(resourceName + ".") || module.getName().contains("." + resourceName);
			return basicMatching;
		}
	}

	private boolean matchingMetaModule(IResource resource, MetaModule metaModule) {
		try {
			boolean isNameSapce = isNameSpace(resource, metaModule);
			if (isNameSapce) {
				return true;
			} else {
				EObject parent = metaModule.eContainer();
				while (parent != null && parent instanceof Module) {
					if (isNameSpace(resource, (Module) parent)) {
						return false;
					}
					parent = (EObject) parent.eContainer();
				}
				if (isJavaPackage(resource) && !isNameSpace(resource, metaModule)) {
					int level = geModuleLevel(metaModule);
					int level2 = getPackageLevel(resource);
					if (level == level2)
						return true;
					else
						return false;
				}
			}
			return false;
		} catch (JavaModelException e) {
			e.printStackTrace();
			return false;
		}
	}

	private boolean matchingExternalModule(IResource resource, ExternalModule metaModule) {
		try {
			boolean isNameSapce = isNameSpace(resource, metaModule);
			if (isNameSapce) {
				return true;
			} else {
				EObject parent = metaModule.eContainer();
				while (parent != null && parent instanceof Module) {
					if (isNameSpace(resource, (Module) parent)) {
						return false;
					}
					parent = (EObject) parent.eContainer();
				}
				if (isJavaPackage(resource) && !isNameSpace(resource, metaModule)) {
					int level = geModuleLevel(metaModule);
					int level2 = getPackageLevel(resource);
					if (level == level2)
						return true;
					else
						return false;
				}
			}
			return false;
		} catch (JavaModelException e) {
			e.printStackTrace();
			return false;
		}
	}

	private int geModuleLevel(EObject module) {
		int level = 1;
		EObject parent;
		parent = module.eContainer();
		while (parent != null && parent instanceof Module) {
			EList<Attribute> attributes = null;
			if (parent instanceof Module)
				attributes = ((Module) (parent)).getAttributes();
			else if (parent instanceof MetaModule)
				attributes = ((MetaModule) (parent)).getAttributes();
			if (!attributes.isEmpty() && attributes.get(0).getName().equals("namespace")) {
				Attribute attribute = attributes.get(0);
				String[] names = attribute.getValue().split("\\.");
				level = level + names.length;
			} else {
				level++;
			}
			parent = (EObject) parent.eContainer();
		}
		return level;
	}

	private boolean isJavaPackage(IResource resource) throws JavaModelException {
		IPackageFragment packageFragment = getJavaProject().findPackageFragment(resource.getFullPath());
		if (packageFragment == null)
			return false;
		packageFragment.getElementName();
		if (packageFragment.getElementName().equals("")) {
			return false;
		}
		return true;
	}

	private int getPackageLevel(IResource resource) throws JavaModelException {
		IPackageFragment packageFragment = getJavaProject().findPackageFragment(resource.getFullPath());
		if (packageFragment == null)
			return 0;
		packageFragment.getElementName();
		if (packageFragment.getElementName().equals("")) {
			return 0;
		}
		return packageFragment.getElementName().split("\\.").length;
	}

	private boolean isNameSpace(IResource resource, AbstractComponent abstractComponent) {
		if (!(abstractComponent instanceof Module)) {
			return false;
		}
		Module module = (Module) abstractComponent;
		boolean isNameSapce = false;
		EList<Attribute> attributes = module.getAttributes();
		if (!attributes.isEmpty() && attributes.get(0).getName().equals("namespace")) {
			String resourceName = resource.getName();
			Attribute attribute = attributes.get(0);
			String[] names = attribute.getValue().split("\\.");
			for (String name : names) {
				if (resourceName.equals(name)) {
					isNameSapce = true;
				}
			}
		}
		return isNameSapce;
	}

	/*
	 * XMLErrorHandler reporter = new XMLErrorHandler(file); try {
	 * getParser().parse(file.getContents(), reporter); } catch (Exception e1) {
	 * }
	 */

	private SAXParser getParser() throws ParserConfigurationException, SAXException {
		if (parserFactory == null) {
			parserFactory = SAXParserFactory.newInstance();
		}
		return parserFactory.newSAXParser();
	}
}
