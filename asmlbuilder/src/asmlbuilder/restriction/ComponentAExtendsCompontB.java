package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAExtendsCompontB extends RestricionChecker {

	public ComponentAExtendsCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getGroupClause().equals(GroupClause.ANY) && restriction.getPermissionClause().equals(PermissionClause.MUST) && restriction.getRelactionType().equals(RelactionType.EXTEND)) {
			anyComponentAMustExtendCompontB(restriction, componentA, componentB);
		}
	}

	private void anyComponentAMustExtendCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		int lineNumber = 0;
		for (ComponentInstance resourceOfComponentA : componentA.getAllComponentInstances()) {
			boolean extend = false;
			String typeName2 = componentB.getName();
			if (resourceOfComponentA.getResource() instanceof IFile) {
				Set<ComponentInstanceReference> typeDeclarationsInResourcesA = resourceOfComponentA.getReferencesByNodeType(TypeDeclaration.class);
				for (ComponentInstanceReference typeDeclarationInResourceA : typeDeclarationsInResourcesA) {
					ComponentInstance resourceDeclaredInA = typeDeclarationInResourceA.getComponentInstanceOwner();
					extend = resourceDeclaredInA.extendsAtLeastOneOf(componentB);
					if (extend) {
						break;
					}
					lineNumber = typeDeclarationInResourceA.getLineNumber();
				}
			}
			if (!extend) {
				String defaultMessage = "Classes  do tipo   " + componentA.getName() + " devem herdar da classe " + typeName2;
				addViolation(restriction, componentA, componentB, lineNumber, resourceOfComponentA, defaultMessage);
			}
		}
	}


}
