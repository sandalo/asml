package asmlbuilder.restriction;

import java.util.Set;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentADependsCompontB extends RestricionChecker {

	public ComponentADependsCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getPermissionClause().equals(PermissionClause.CAN)) {
			onlyComponentACanDependCompontB(restriction, componentA, componentB);
		}
	}

	void onlyComponentACanDependCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstances = asmlContext.getComponentInstances();
		for (ComponentInstance componentInstance : allInstances) {
			Set<ComponentInstanceReference> references = componentInstance.getReferencesToOthersComponentInstances();
			for (ComponentInstanceReference reference : references) {
				ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
				ComponentInstance componentInstanceOwner = reference.getComponentInstanceOwner();
				if(componentInstanceReferenced ==null)
					continue;
				AbstractComponent componentOwner = componentInstanceOwner.getComponent();
				AbstractComponent componentReferenced = componentInstanceReferenced.getComponent();
				if(!componentOwner.equals(componentA) && (componentReferenced.equals(componentB)) || componentReferenced.isChild(componentB)){
					addViolation(restriction, componentA, componentB, reference.getLineNumber(), componentInstance, "Componente não pode depender de "+componentB.getName());
				}
			}
		}
	}
}
