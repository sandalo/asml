package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ASMLASTNode;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
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
		}
	}

	private void onlyComponentACanAccessCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ASMLResource> allInstances = asmlContext.getResources();
		int lineNumber = 1;
		for (ASMLResource asmlResource : allInstances) {
			IResource resource = asmlResource.getResource();
			if (resource instanceof IFile) {
				if (componentB instanceof MetaClass && (resource.getFileExtension() + "").equals("java")) {
					Set<ASMLASTNode> methodsInvocationsFromResource = asmlResource.getASTNodeByType(MethodInvocation.class);
					for (ASMLASTNode methodInvocationResource : methodsInvocationsFromResource) {
						String nameOfClassAccessed = getNameOfClasseAccessed(methodInvocationResource);
						if(nameOfClassAccessed.equals(""))
							continue;
						lineNumber = asmlResource.getCompilationUnitAST().getLineNumber(methodInvocationResource.getAstNode().getStartPosition());
						if (asmlContext.getInstanceByName(componentB, nameOfClassAccessed) != null) {
							Set<ASMLResource> resourcesOfA = asmlContext.getInstancesByComponentHierarchy(componentA);
							for (ASMLResource resourceThatCanAcessResourceB : resourcesOfA) {
								if (resource.equals(resourceThatCanAcessResourceB.getResource())) {
									break;
								}
							}
							addViolation(restriction, componentA, componentB, lineNumber, asmlResource,"Somente classes do componente "+componentA.getName()+" podem acessar classes do componete "+componentB.getName());
						}
					}
				}
			}
		}
	}


	private String getNameOfClasseAccessed(ASMLASTNode methodInvocationResource) {
		MethodInvocation methodInvocation = (MethodInvocation) methodInvocationResource.getAstNode();
		ITypeBinding typeBinding = methodInvocation.getExpression().resolveTypeBinding();
		if(typeBinding==null)
			return "";
		String nameOfClassAccessed = typeBinding.getJavaElement().getElementName();
		return nameOfClassAccessed;
	}

}
