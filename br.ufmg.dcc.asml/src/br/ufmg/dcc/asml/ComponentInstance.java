package br.ufmg.dcc.asml;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class ComponentInstance implements Comparable<ComponentInstance> {
	private static final Map<String, ComponentInstance> componentInstanceIResourceName = new HashMap<String, ComponentInstance>();
	private static final Map<String, ComponentInstance> componentInstanceITypeName = new HashMap<String, ComponentInstance>();
	private IResource resource;
	private final Set<AbstractComponent> components = new HashSet<AbstractComponent>();
	private Map<Class<? extends ASTNode>, Set<ComponentInstanceReference>> componentInstanceReferences = new HashMap<Class<? extends ASTNode>, Set<ComponentInstanceReference>>();
	private CompilationUnit compilationUnitAST;
	private IType iType;

	public CompilationUnit getCompilationUnitAST() {
		return compilationUnitAST;
	}

	public void setCompilationUnitAST(CompilationUnit compilationUnit) {
		this.compilationUnitAST = compilationUnit;
	}

	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		String key = resource.getFullPath().toString();
		addCache(resource, key);
		this.resource = resource;
	}

	public void setResource(IResource resource, String key) {
		addCache(resource, key);
		this.resource = resource;
	}

	private void addCache(IResource resource, String key) {
		componentInstanceIResourceName.remove(key);
		componentInstanceIResourceName.put(key, this);
	}

	public Set<AbstractComponent> getComponents() {
		return Collections.unmodifiableSet(components);
	}

	public void addComponents(AbstractComponent component) {
		this.components.add(component);
	}

	public void componentClear() {
		components.clear();
	}

	public void componentRemove(AbstractComponent component) {
		components.remove(component);
	}

	@Override
	public int compareTo(ComponentInstance o) {
		if (resource != null && o.getResource() != null)
			return resource.getFullPath().toString().compareTo(o.getResource().getFullPath().toString());
		return -1;
	}

	@Override
	public String toString() {
		if (resource != null)
			return resource.toString();
		return "undefined";
	}

	public boolean addReference(ComponentInstanceReference componentInstanceReference) {
		Class<? extends ASTNode> classOfNode = componentInstanceReference.getAstNode().getClass();
		boolean add = false;
		Set<ComponentInstanceReference> astNodes = (Set<ComponentInstanceReference>) componentInstanceReferences.get(classOfNode);
		if (astNodes == null) {
			astNodes = new HashSet<ComponentInstanceReference>();
			componentInstanceReferences.put(classOfNode, astNodes);
		}
		add = astNodes.add(componentInstanceReference);
		return add;
	}

	public Set<ComponentInstanceReference> getReferencesByNodeType(Class<? extends ASTNode> classOfNode) {
		Set<ComponentInstanceReference> astNodes = componentInstanceReferences.get(classOfNode);
		if (astNodes != null)
			return Collections.unmodifiableSet(astNodes);
		return new HashSet<ComponentInstanceReference>();
	}

	public void setType(IType iType) {
		this.iType = iType;
		componentInstanceITypeName.put(getTypeFullQualifyName(), this);
	}

	public IType getType() {
		return iType;
	}

	protected String getTypeFullQualifyName() {
		return iType.getFullyQualifiedName();
	}

	public String[] getAllSupertypesNames() {
		IType iType = this.getType();
		ITypeHierarchy typeHierarchy_;
		String[] iTypesNames = null;
		IType[] iTypes = null;
		try {
			typeHierarchy_ = iType.newSupertypeHierarchy(new NullProgressMonitor());
			iTypes = typeHierarchy_.getAllSupertypes(iType);
			iTypesNames = new String[iTypes.length];
			int i = 0;
			for (IType iType2 : iTypes) {
				iTypesNames[i++] = iType2.getFullyQualifiedName();
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return iTypesNames;
	}

	public static String[] getResourcesTypesNames(Set<ComponentInstance> componentInstancesB) {
		String[] names = new String[componentInstancesB.size()];
		int i = 0;
		for (ComponentInstance componentInstance : componentInstancesB) {
			IType iTypeB;
			iTypeB = componentInstance.getType();
			names[i] = iTypeB.getFullyQualifiedName();
		}
		return names;
	}

	public boolean extendsAtLeastOneOf(AbstractComponent componentB) {
		boolean extend;
		String[] typeNamesOfA = this.getAllSupertypesNames();
		String[] typeNamesOfB = componentB.getAllTypesNames();
		extend = containsType(typeNamesOfA, typeNamesOfB);
		return extend;
	}

	public static boolean containsType(String[] fullQualifyNames1, String[] fullQualifyNames2) {
		boolean contains = false;
		external: for (String fullQualifyName1 : fullQualifyNames1) {
			for (int i = 0; i < fullQualifyNames2.length; i++) {
				if (fullQualifyName1.equals(fullQualifyNames2[i])) {
					contains = true;
					break external;
				}
			}
		}
		return contains;
	}

	public boolean isResourceOf(AbstractComponent componentB) {
		boolean extend;
		String[] typeNamesOfA = new String[] { this.getType().getFullyQualifiedName() };
		String[] typeNamesOfB = componentB.getAllTypesNames();
		extend = containsType(typeNamesOfA, typeNamesOfB);
		return extend;
	}

	public static ComponentInstance getComponentInstanceByIResourceName(IResource resource) {
		return componentInstanceIResourceName.get(resource.getFullPath().toString());
	}

	public static ComponentInstance getComponentInstanceByITypeName(IType type) {
		String fullyQualifiedName = type.getFullyQualifiedName();
		return componentInstanceITypeName.get(fullyQualifiedName);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComponentInstance) {
			ComponentInstance componentInstance = (ComponentInstance) obj;
			if (resource != null && componentInstance.getResource() != null)
				return resource.getFullPath().toString().equals(componentInstance.getResource().getFullPath().toString());
			return super.equals(obj);
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (resource != null)
			return resource.hashCode();
		return super.hashCode();
	}

	public boolean instanceOf(AbstractComponent abstractComponent) {
		Set<AbstractComponent> components = getComponents();
		for (AbstractComponent abstractComponent2 : components) {
			if (abstractComponent2.getName().equals(abstractComponent.getName()))
				return true;
		}
		return false;
	}
}
