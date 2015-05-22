package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.jdt.core.dom.SingleMemberAnnotation;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAUseAnnotationCompontB extends RestricionChecker {

	public ComponentAUseAnnotationCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		boolean any = restriction.getGroupClause().equals(GroupClause.ANY);
		boolean cannot = restriction.getPermissionClause().equals(PermissionClause.CANNOT);
		if (any/** componentA */ && cannot/** use annotation */
		) {
			anyComponentACannotUseAnnotationCompontB(restriction, componentA, componentB);
		}
	}

	private void anyComponentACannotUseAnnotationCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> instancesOfA = componentA.getInstances();
		int lineNumber = 1;
		for (ComponentInstance instanceOfA : instancesOfA) {
			Set<ComponentInstanceReference> references = instanceOfA.getReferencesToOthersComponentInstances(SingleMemberAnnotation.class);
			for (ComponentInstanceReference reference : references) {
				ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
				if (componentInstanceReferenced!=null) {
					if (componentInstanceReferenced.instanceOf(componentB)) {
						lineNumber = reference.getLineNumber();
						addViolation(restriction, componentA, componentB, lineNumber, instanceOfA, "Classes do componete " + componentA.getName() + " não podem usar anotações: " + componentB.getName());
					}
				}
			}
		}
	}
}
