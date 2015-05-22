package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IMarker;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAHandleCompontB extends RestricionChecker {

	private ComponentAAccessCompontB componentAAccessCompontB;
	private ComponentADeclareCompontB componentADeclareCompontB;
	 
	public ComponentAHandleCompontB(ASMLContext asmlContext) {
		super(asmlContext);
		this.componentAAccessCompontB = new ComponentAAccessCompontB(asmlContext);
		this.componentADeclareCompontB = new ComponentADeclareCompontB(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		boolean any = restriction.getGroupClause().equals(GroupClause.ONLY);
		boolean can = restriction.getPermissionClause().equals(PermissionClause.CAN);
		boolean onlyB = restriction.getGroupClauseB().equals(GroupClause.ONLY);
		if (any && can && onlyB) {
			componentAAccessCompontB.checker(restriction, componentA, componentB);
			componentADeclareCompontB.checker(restriction, componentA, componentB);
		}
	}

	private void onlyComponentAHandleCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> instances = componentB.getAllComponentInstances();
		for (ComponentInstance iResource : instances) {
			if (asmlContext.existInstancesOfComponentWithName(iResource.getResource().getName(), componentB.getName())) {
				Set<ComponentInstance> resourcesComponenteA = componentA.getAllComponentInstances();
				boolean not_found = true;
				for (ComponentInstance resourceComponenteA : resourcesComponenteA) {
					if (resourceComponenteA.getResource().getFullPath().isPrefixOf(iResource.getResource().getFullPath())) {
						not_found = false;
						break;
					}
				}
				if (not_found) {
					String message = "";
					if (restriction.getMessage() != null)
						message = restriction.getMessage();
					else
						message = "Somente componente o " + componentA.getName() + " pode tratar, lidar ou conter componentes " + componentB.getName();
					asmlContext.getViolations().add(new Violation(iResource.getResource(), message, 1, IMarker.SEVERITY_ERROR));
				}
			}
		}
	}
}
