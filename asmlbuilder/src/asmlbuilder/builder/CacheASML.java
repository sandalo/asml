package asmlbuilder.builder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.ASTNode;

import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class CacheASML {
	 ASMLModel asmlModel;
	public CacheASML(ASMLModel asmlModel){
		this.asmlModel = asmlModel;
	}
	
	public Map<AbstractComponent, Set<IResource>> getInstancesOfComponentsFound() {
		return instancesOfComponentsFound;
	}

	private Map<IResource, IType> resourcesITypes = new HashMap<IResource, IType>(100);
	private Map<AbstractComponent, Set<IResource>> instancesOfComponentsFound = new HashMap<AbstractComponent, Set<IResource>>(100);
	private Map<IResource, Set<AbstractComponent>> resourceComponents = new HashMap<IResource, Set<AbstractComponent>>(100);
	private Set<IResource> resourcesNotMatchedInStaticAnalysis = new TreeSet<IResource>(new ResourceComparator());
	private Set<IResource> resourcesMatchedInStaticAnalysis = new TreeSet<IResource>(new ResourceComparator());
	private Set<IResource> resources = new TreeSet<IResource>(new ResourceComparator());
	private List<Violation> violations = new ArrayList<Violation>();
	private Map<IResource, Map<Class<? extends  ASTNode>, Set<ASMLASTNode>>> instancesOfASMLASTNodeJavaFound = new HashMap<IResource, Map<Class<? extends ASTNode>, Set<ASMLASTNode>>>(100);

	class ResourceComparator implements Comparator<IResource> {
		@Override
		public int compare(IResource o1, IResource o2) {
			return o1.getFullPath().toString().compareTo(o2.getFullPath().toString());
		}
	}

	public Set<IResource> getInstancesByComponent(AbstractComponent abstractComponent) {
		Set<IResource> set = instancesOfComponentsFound.get(abstractComponent);
		if (set == null)
			return new HashSet<IResource>();
		return set;
	}

	public AbstractComponent getComponentByName(String name) {
		Set<AbstractComponent> keySet = instancesOfComponentsFound.keySet();
		for (AbstractComponent abstractComponent : keySet) {
			if (abstractComponent.getName().equals(name)) {
				return abstractComponent;
			}
			/*
			 * if (abstractComponent instanceof Class) { Class classe = (Class)
			 * abstractComponent; if (classe.getMatching() instanceof
			 * ClassMatching) { ClassMatching classMatching = (ClassMatching)
			 * classe.getMatching(); if
			 * (classMatching.getExpressionMatching().equals
			 * (ExpressionMatchingClause.NAME_ENDS_WITH)) { if
			 * (classe.getName().replace(classMatching.getParameter(),
			 * "").equalsIgnoreCase(name)) { return abstractComponent; } } } }
			 */}
		return null;
	}

	public boolean existInstancesOfComponentWithName(String resourcetName, String componentName) {
		AbstractComponent componentByName = getComponentByName(componentName);
		if (componentByName == null)
			return false;
		IResource instanceByName = getInstanceByName(componentByName, resourcetName);
		if (instanceByName != null)
			return true;
		return false;
	}

	public IResource getInstanceByName(AbstractComponent abstractComponent, String name) {
		Set<IResource> list = instancesOfComponentsFound.get(abstractComponent);
		for (IResource iResource : list) {
			String nomeDoRecursoSemExtencao = deleteExtension(iResource);
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

	public boolean existInstancesOfComponent(AbstractComponent abstractComponent) {
		return instancesOfComponentsFound.containsKey(abstractComponent);
	}

	public boolean existMoreThanOneInstancesOfComponent(AbstractComponent abstractComponent) {
		return instancesOfComponentsFound.get(abstractComponent).size() > 1;
	}

	public boolean existAtLeastOneInstancesOfComponent(AbstractComponent abstractComponent) {
		return instancesOfComponentsFound.get(abstractComponent).size() > 0;
	}

	public boolean existOnlyOneInstancesOfComponent(AbstractComponent abstractComponent) {
		return instancesOfComponentsFound.get(abstractComponent).size() == 1;
	}

	public boolean addInstanceOfComponent(AbstractComponent abstractComponent, IResource iResource) {
		Set<IResource> resources = instancesOfComponentsFound.get(abstractComponent);
		Set<AbstractComponent> components = resourceComponents.get(iResource);
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
			return true;
		} else {
			boolean add = resources.add(iResource);
			boolean add2 = components.add(abstractComponent);
			return add && add2;
		}
	}

	public boolean removeResourcesFromComponents(IResource iResource) {
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
	}

	public void print() {
		for (AbstractComponent abstractComponent : instancesOfComponentsFound.keySet()) {
			System.out.println("AbstractComponent: " + abstractComponent.getName());
			Set<IResource> resources = getInstancesByComponent(abstractComponent);
			for (IResource iResource : resources) {
				System.out.println("Instancia: " + iResource.getName());
			}
			System.out.println("+++++++++++++++++++++++++++++++");
		}
	}

	public Set<IResource> getResourcesNotMatchedInStaticAnalysis() {
		return resourcesNotMatchedInStaticAnalysis;
	}

	public Set<IResource> getResourcesMatchedInStaticAnalysis() {
		return resourcesMatchedInStaticAnalysis;
	}

	public Set<IResource> getResources() {
		return resources;
	}

	public List<Violation> getViolations() {
		return violations;
	}

	public Map<IResource, Map<Class<? extends ASTNode>, Set<ASMLASTNode>>> getInstancesOfASTNodeJavaFound() {
		return instancesOfASMLASTNodeJavaFound;
	}

	public boolean addInstancesOfASTNodeJavaFound(IResource iResource, ASMLASTNode astNode) {
		Map<Class<? extends ASTNode>, Set<ASMLASTNode>> nodesByResources = instancesOfASMLASTNodeJavaFound.get(iResource);
		Class<? extends ASTNode> classOfNode = astNode.getAstNode().getClass();
		if(nodesByResources == null){
			nodesByResources = new HashMap<Class<? extends  ASTNode>, Set<ASMLASTNode>>();
			Set<ASMLASTNode> astNodes = new HashSet<ASMLASTNode>();
			nodesByResources.put(classOfNode, astNodes);
			instancesOfASMLASTNodeJavaFound.put(iResource, nodesByResources);
			return astNodes.add(astNode);
		}else{
			Set<ASMLASTNode> astNodes = (Set<ASMLASTNode>) nodesByResources.get(classOfNode);
			if(astNodes==null){ 
				astNodes = new HashSet<ASMLASTNode>();
				nodesByResources.put(classOfNode, astNodes);
				astNodes.add(astNode);
			}
			return astNodes.add(astNode);
		}
	}

	public Map<IResource, IType> getResourcesITypes() {
		return resourcesITypes;
	}

	public ASMLModel getAsmlModel() {
		return asmlModel;
	}

}
