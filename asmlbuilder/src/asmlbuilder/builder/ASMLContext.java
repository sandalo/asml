package asmlbuilder.builder;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.ASTNode;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.matching.AbstraticMatching;
import br.ufmg.dcc.asml.ASMLASTNode;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.ExternalModule;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.View;

public class ASMLContext {
	private static final Logger log = Logger.getLogger(ASMLContext.class.getName());
	private ASMLClassLoader classLoader;
	private long timeStampResource;
	private final Set<ASMLResource> resources = new TreeSet<ASMLResource>();

	private ASMLModel asmlModel;
	private IJavaProject javaProject;
	private ASTJavaParser astJavaParser;
	private IClasspathContainer classpathMavenContainer;
	private ASMLResourceVisitor resourceVisitor;
	private ASMLResourceDeltaVisitor resourceDeltaVisitor;
	private ASMLBinder asmlBinder = new ASMLBinder(this);

	private final Set<AbstractComponent> declaredComponents = new HashSet<AbstractComponent>(100);
	
	private List<Violation> violations = new ArrayList<Violation>();
	
	private Map<IResource, IType> resourcesITypes = new HashMap<IResource, IType>(100);
	private Map<IResource, Map<Class<? extends ASTNode>, Set<ASMLASTNode>>> instancesOfASMLASTNodeJavaFound = new HashMap<IResource, Map<Class<? extends ASTNode>, Set<ASMLASTNode>>>(100);
	private Map<MetaClass, Set<MetaClass>> sublMetaClasses = new HashMap<MetaClass, Set<MetaClass>>(100);

	class ResourceComparator implements Comparator<IResource> {
		@Override
		public int compare(IResource o1, IResource o2) {
			return o1.getFullPath().toString().compareTo(o2.getFullPath().toString());
		}
	}

	public Set<ASMLResource> getInstancesByComponent(AbstractComponent abstractComponent) {
		Set<ASMLResource> set = new HashSet<ASMLResource>(abstractComponent.getResources());
		return set;
	}

	public Set<ASMLResource> getInstancesByComponentHierarchy(AbstractComponent abstractComponent) {
		Set<ASMLResource> resources = getInstancesByComponent(abstractComponent);
		EList<AbstractComponent> components = getComponentsChildren(abstractComponent);
		for (AbstractComponent child : components) {
			resources.addAll(getInstancesByComponentHierarchy(child));
		}
		return resources;
	}

	public AbstractComponent getComponentByName(String name) {
		for (AbstractComponent abstractComponent : declaredComponents) {
			if (abstractComponent.getName().equals(name)) {
				return abstractComponent;
			}
		}
		return null;
	}

	public boolean existInstancesOfComponentWithName(String resourcetName, String componentName) {
		AbstractComponent componentByName = getComponentByName(componentName);
		if (componentByName == null)
			return false;
		ASMLResource instanceByName = getInstanceByName(componentByName, resourcetName);
		if (instanceByName != null)
			return true;
		return false;
	}

	public ASMLResource getInstanceByName(AbstractComponent abstractComponent, String name) {
		if(abstractComponent==null)
			return null;
		Set<ASMLResource> list = abstractComponent.getResources();
		if(list==null)
			return null;
		for (ASMLResource iResource : list) {
			String nomeDoRecursoSemExtencao = deleteExtension(iResource.getResource());
			name = deleteExtension(name);
			if (nomeDoRecursoSemExtencao.equalsIgnoreCase(name)) {
				return iResource;
			}
		}
		return null;
	}

	private String deleteExtension(IResource iResource) {
		String name = iResource.getName();
		return deleteExtension(name);
	}

	private String deleteExtension(String name) {
		return name.replace(".java", "").replace(".txt", "").replace(".xml", "").replace(".zul", "").replace(".js", "").replace(".html", "");
	}

/*	public boolean existInstancesOfComponent(AbstractComponent abstractComponent) {
		return instancesOfComponentsFound.contains(abstractComponent);
	}

	public boolean existMoreThanOneInstancesOfComponent(AbstractComponent abstractComponent) {
		int cont = 0;
		for (AbstractComponent abstractComponentAux : instancesOfComponentsFound) {
			if(abstractComponent.getClass().isAssignableFrom(abstractComponentAux.getClass())){
				cont++;
			}
		}
		if(cont>0)
			return true;
		return false;
	}

	public boolean existAtLeastOneInstancesOfComponent(AbstractComponent abstractComponent) {
		return true;///instancesOfComponentsFound.get(abstractComponent).size() > 0;
	}

	public boolean existOnlyOneInstancesOfComponent(AbstractComponent abstractComponent) {
		return true;///instancesOfComponentsFound.get(abstractComponent).size() == 1;
	}*/

/*	public boolean addInstanceOfComponent(AbstractComponent abstractComponent, IResource iResource) {
		Set<IResource> resources = instancesOfComponentsFound.get(abstractComponent);
		Set<AbstractComponent> components = resourceComponents.get(iResource);
		boolean add = false;
		boolean add2 = false;
		if (resources == null || components == null) {
			if (resources == null) {
				resources = new HashSet<IResource>();
			}
			if (components == null) {
				components = new HashSet<AbstractComponent>();
			}
			resources.add(iResource);
			components.add(abstractComponent);
			add(abstractComponent, resources);
			add(iResource, components);
			add = true;
		} else {
			add = resources.add(iResource);
			add2 = components.add(abstractComponent);
			add = add && add2;
		}
		if(add){
			System.out.println("=============================================================");
			System.out.println("=============================================================");
			System.out.println("Nome do componente: "+abstractComponent.getName() + " Nome do recurso "+iResource.getFullPath());
			System.out.println("Hashcode do componente          ===> "+abstractComponent.hashCode());
			System.out.println("Hashcode do map          ===> "+instancesOfComponentsFound.hashCode());
			System.out.println("Hashcode da lista               ===> "+resources.hashCode());
			System.out.println("=============================================================");
			System.out.println("=============================================================");
		}
		return add;
	}
*/
/*	public boolean removeResourcesFromComponents(IResource iResource) {
		Set<AbstractComponent> components = resourceComponents.get(iResource);
		if (components == null)
			return false;
		for (AbstractComponent abstractComponent : components) {
			Set<IResource> resources = instancesOfComponentsFound.get(abstractComponent);
			boolean remove = resources.remove(iResource);
			if (remove) {
				break;
			}
		}
		resourceComponents.remove(iResource);
		return false;
	}

	private void add(AbstractComponent abstractComponent, Set<IResource> resources) {
		instancesOfComponentsFound.put(abstractComponent, resources);
	}

	private void add(IResource resource, Set<AbstractComponent> components) {
		resourceComponents.put(resource, components);
	}*/

	public void print() { 
		for (AbstractComponent abstractComponent : declaredComponents) {
			System.out.println("=============================================================");
			System.out.println("=============================================================");
			System.out.println("Componente - Tipo:"+  abstractComponent.getClass().getName() +" Nome: "+ abstractComponent.getName());
			Set<ASMLResource> resourcesAux = getInstancesByComponent(abstractComponent);
			for (ASMLResource iResource : resourcesAux) {
				System.out.println(iResource.getResource().getFullPath());
			}
			System.out.println("=============================================================");
			System.out.println("=============================================================");
		}
	}

	public Set<ASMLResource> getResources() {
		return Collections.unmodifiableSet(resources);
	}

	public void addResource(ASMLResource asmlResource) {
		System.out.println(asmlResource.getResource().getName());
		resources.add(asmlResource);
	}

	public void removeResource(ASMLResource asmlResource) {
		resources.remove(asmlResource);
	}

	public void clearResource() {
		resources.clear();
	}

	
	public List<Violation> getViolations() {
		return violations;
	}

	public ASMLModel getAsmlModel() {
		return asmlModel;
	}

	public void setAsmlModel(ASMLModel asmlModel) {
		this.asmlModel = asmlModel;
	}

	public IJavaProject getJavaProject() {
		return javaProject;
	}

	public void setJavaProject(IJavaProject javaProject) {
		this.javaProject = javaProject;
	}

	public ASTJavaParser getAstJavaParser() {
		return astJavaParser;
	}

	public void setAstJavaParser(ASTJavaParser astJavaParser) {
		this.astJavaParser = astJavaParser;
	}

	public IClasspathContainer getClasspathMavenContainer() {
		return classpathMavenContainer;
	}

	public void setClasspathMavenContainer(IClasspathContainer classpathMavenContainer) {
		this.classpathMavenContainer = classpathMavenContainer;
	}

	public ASMLResourceVisitor getResourceVisitor() {
		return resourceVisitor;
	}

	public void setResourceVisitor(ASMLResourceVisitor resourceVisitor) {
		this.resourceVisitor = resourceVisitor;
	}

	public ASMLResourceDeltaVisitor getResourceDeltaVisitor() {
		return resourceDeltaVisitor;
	}

	public void setResourceDeltaVisitor(ASMLResourceDeltaVisitor resourceDeltaVisitor) {
		this.resourceDeltaVisitor = resourceDeltaVisitor;
	}

	public AbstraticMatching getMatching(AbstractComponent abstractComponent) {
		if (getAsmlBinder().getBindMatchingCustom().containsKey(abstractComponent)) {
			return getAsmlBinder().getBindMatchingCustom().get(abstractComponent);
		}
		return getAsmlBinder().getBindMatching().get(abstractComponent.getClass());
	}

	public void addMatchingCustom(AbstractComponent abstractComponent) {
		AbstraticMatching abstraticMatching = null;
		String nameClass = getComponentFullName(abstractComponent);
		abstraticMatching = loadMatchingCustomClass(nameClass + ".matching.MetaModuleMatching_" + abstractComponent.getName());
		if (abstraticMatching != null)
			getAsmlBinder().getBindMatchingCustom().put(abstractComponent, abstraticMatching);
	}

	private String getComponentFullName(AbstractComponent abstractComponent) {
		String nameClass = abstractComponent.getName();
		EObject parent = abstractComponent.eContainer();
		while (parent != null) {
			if (parent instanceof View)
				nameClass = ((View) parent).getName() + "." + nameClass;
			if (parent instanceof ASMLModel)
				nameClass = ((ASMLModel) parent).getName() + "." + nameClass;
			if (parent instanceof AbstractComponent)
				nameClass = ((AbstractComponent) parent).getName() + "." + nameClass;
			parent = parent.eContainer();
		}
		return nameClass;
	}

	private AbstraticMatching loadMatchingCustomClass(String nameClass) {
		AbstraticMatching abstraticMatching = null;
		try {
			Class<?> loadClass = classLoader.loadClass(nameClass);
			if (loadClass != null) {
				Constructor<?> constructor = loadClass.getConstructor(ASMLContext.class);
				abstraticMatching = (AbstraticMatching) constructor.newInstance(this);
			}
		} catch (Exception e) {
			//System.out.println("controlado...");
		}
		return abstraticMatching;
	}

	public ASMLClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ASMLClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public void clearAll() {
		resourcesITypes.clear();
		resources.clear();
		violations.clear();
		instancesOfASMLASTNodeJavaFound.clear();
	}

	public Map<MetaClass, Set<MetaClass>> getSublMetaClasses() {
		return sublMetaClasses;
	}

	public ASMLBinder getAsmlBinder() {
		return asmlBinder;
	}

	public void setAsmlBinder(ASMLBinder asmlBinder) {
		this.asmlBinder = asmlBinder;
	}

	public static EList<Restriction> getRestrictions(AbstractComponent abstractComponent) {
		EList<Restriction> restrictions = new BasicEList<Restriction>();
		if (abstractComponent instanceof Module)
			restrictions = ((Module) abstractComponent).getRestrictions();
		else if (abstractComponent instanceof MetaModule)
			restrictions = ((MetaModule) abstractComponent).getRestrictions();
		else if (abstractComponent instanceof ExternalModule)
			restrictions = ((ExternalModule) abstractComponent).getRestrictions();
		return restrictions;
	}

	public static EList<AbstractComponent> getComponentsChildren(AbstractComponent abstractComponent) {
		EList<AbstractComponent> components = new BasicEList<AbstractComponent>();
		if (abstractComponent instanceof Module)
			components = ((Module) abstractComponent).getComponents();
		else if (abstractComponent instanceof MetaModule)
			components = ((MetaModule) abstractComponent).getComponents();
		else if (abstractComponent instanceof ExternalModule)
			components = ((ExternalModule) abstractComponent).getComponents();
		return components;
	}

	public long getTimeStampResource() {
		return timeStampResource;
	}

	public void setTimeStampResource(long timeStampResource) {
		this.timeStampResource = timeStampResource;
	}

	public Set<ASMLResource> getResourcesMatchedInStaticAnalysis() {
		Set<ASMLResource> resourcesMatchedInStaticAnalysis = new HashSet<ASMLResource>();
		for (AbstractComponent abstractComponent : declaredComponents) {
			resourcesMatchedInStaticAnalysis.addAll(abstractComponent.getResources());
		}
		return resourcesMatchedInStaticAnalysis;
	}

	public Set<AbstractComponent> getDeclaredComponents() {
		return Collections.unmodifiableSet(declaredComponents);
	}
	
	public void  addDeclaredComponents(AbstractComponent abstractComponent) {
		declaredComponents.add(abstractComponent);
	}

	public void  clearDeclaredComponents() {
		declaredComponents.clear();
	}

}
