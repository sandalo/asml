package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAAccessCompontB extends RestricionChecker {

	public ComponentAAccessCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getGroupClause().equals(GroupClause.ONLY) && restriction.getPermissionClause().equals(PermissionClause.CAN)) {
			onlyComponentACanAccessCompontB(restriction, componentA, componentB);
		}else
		if (restriction.getPermissionClause().equals(PermissionClause.CANNOT)) {
			componentACannnotAccessCompontB(restriction, componentA, componentB);
		}
	}
	
	
	void componentACannnotAccessCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		for (ComponentInstance componentInstance : componentA.getAllComponentInstances()) {
			Set<ComponentInstanceReference> references = componentInstance.getReferencesToOthersComponentInstances(MethodInvocation.class);
			for (ComponentInstanceReference reference : references) {
				ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
				if(componentInstanceReferenced ==null)
					continue;
				AbstractComponent componentReferenced = componentInstanceReferenced.getComponent();
				if((componentReferenced.equals(componentB)) || componentReferenced.isChild(componentB)){
					addViolation(restriction, componentA, componentB, reference.getLineNumber(), componentInstance, "Componente n�o pode acessas m�todos de "+componentB.getName());
				}
			}
		}
	}

	void onlyComponentACanAccessCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstances = asmlContext.getComponentInstances();
		int lineNumber = 1;
		for (ComponentInstance componentInstance : allInstances) {
			IResource resource = componentInstance.getResource();
			if ((resource.getFileExtension() + "").equals("java")) {
				Set<ComponentInstanceReference> methodsInvocationsFromResource = componentInstance.getReferencesToOthersComponentInstances(MethodInvocation.class);
				for2: for (ComponentInstanceReference methodInvocationResource : methodsInvocationsFromResource) {
					String nameOfClassAccessed = getNameOfClasseAccessed(methodInvocationResource);
					if (nameOfClassAccessed.equals(""))
						continue;
					lineNumber = componentInstance.getCompilationUnitAST().getLineNumber(methodInvocationResource.getAstNode().getStartPosition());
					if (asmlContext.getInstanceByName(componentB, nameOfClassAccessed) != null) {
						Set<ComponentInstance> resourcesOfA = componentA.getAllComponentInstances();
						for (ComponentInstance resourceThatCanAcessResourceB : resourcesOfA) {
							if (resource.equals(resourceThatCanAcessResourceB.getResource())) {
								break for2;
							}
						}
						addViolation(restriction, componentA, componentB, lineNumber, componentInstance, "Somente classes do componente " + componentA.getName() + " podem acessar classes do componete " + componentB.getName());
					}
				}
			}
		}
	}

	protected String getNameOfClasseAccessed(ComponentInstanceReference methodInvocationResource) {
		MethodInvocation methodInvocation = (MethodInvocation) methodInvocationResource.getAstNode();
		ITypeBinding typeBinding = methodInvocation.getExpression().resolveTypeBinding();
		if (typeBinding == null)
			return "";
		String nameOfClassAccessed = typeBinding.getJavaElement().getElementName();
		return nameOfClassAccessed;
	}

}
