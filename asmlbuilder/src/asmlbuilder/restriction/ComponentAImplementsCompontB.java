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

public class ComponentAImplementsCompontB extends RestricionChecker {

	public ComponentAImplementsCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getGroupClause().equals(GroupClause.ANY) && restriction.getPermissionClause().equals(PermissionClause.MUST) && restriction.getRelactionType().equals(RelactionType.IMPLEMENT)) {
			anyComponentAMustImplementCompontB(restriction, componentA, componentB);
		}
		if (restriction.getGroupClause().equals(GroupClause.ONLY) && restriction.getPermissionClause().equals(PermissionClause.CAN) && restriction.getRelactionType().equals(RelactionType.IMPLEMENT)) {
			onlyComponentACanImplementComponentB(restriction, componentA, componentB);
		}
	}

	private void anyComponentAMustImplementCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		int lineNumber = 0;
		for (ComponentInstance instancesOfA : componentA.getAllComponentInstances()) {
			boolean extend = false;
			String typeName2 = componentB.getName();
			if (instancesOfA.getResource() instanceof IFile) {
				Set<ComponentInstanceReference> referencesOfInstaceOfA = instancesOfA.getReferencesToOthersComponentInstances(TypeDeclaration.class);
				for (ComponentInstanceReference typeDeclarationInResourceA : referencesOfInstaceOfA) {
					ComponentInstance resourceDeclaredInA = typeDeclarationInResourceA.getComponentInstanceOwner();
					extend = resourceDeclaredInA.extendsAtLeastOneOf(componentB);
					if (extend) {
						break;
					}
					lineNumber = typeDeclarationInResourceA.getLineNumber();
				}
			}
			if (!extend) {
				String defaultMessage = "Classes  do tipo   " + componentA.getName() + " devem implementar a classe " + typeName2;
				addViolation(restriction, componentA, componentB, lineNumber, instancesOfA, defaultMessage);
			}
		}
	}

	private void onlyComponentACanImplementComponentB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		int lineNumber = 0;
		for (ComponentInstance instance : asmlContext.getComponentInstances()) {
			boolean extend = false;
			boolean isA = false;
			Set<ComponentInstanceReference> references = instance.getReferencesToOthersComponentInstances(TypeDeclaration.class);
			for (ComponentInstanceReference reference : references) {
				ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
				extend = componentInstanceReferenced.extendsAtLeastOneOf(componentB);
				if (extend) {
					isA = componentInstanceReferenced.instanceOf(componentA);
					if (!isA) {
						lineNumber = reference.getLineNumber();
						String defaultMessage = "Somente  classes do tipo  " + componentA.getName() + " podem herdar de classe do tipo " + componentB.getName();
						addViolation(restriction, componentA, componentB, lineNumber, instance, defaultMessage);
					}
				}
			}
		}
	}

}
