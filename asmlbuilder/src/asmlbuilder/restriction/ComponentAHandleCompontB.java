package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IMarker;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAHandleCompontB extends RestricionChecker {

	public ComponentAHandleCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getGroupClause().equals(GroupClause.ONLY) && restriction.getPermissionClause().equals(PermissionClause.CAN)) {
			onlyComponentAHandleCompontB(restriction, componentA, componentB);
		}
	}

	private void onlyComponentAHandleCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ASMLResource> instances = asmlContext.getInstancesByComponent(componentB);
		for (ASMLResource iResource : instances) {
			if (asmlContext.existInstancesOfComponentWithName(iResource.getResource().getName(), componentB.getName())) {
				Set<ASMLResource> resourcesComponenteA = asmlContext.getInstancesByComponent(componentA);
				boolean not_found = true;
				for (ASMLResource resourceComponenteA : resourcesComponenteA) {
					if (resourceComponenteA.getResource().getFullPath().isPrefixOf(iResource.getResource().getFullPath())) {
						not_found = false;
						break;
					}
				}
				if (not_found) {
					String message = "";
					if (restriction.getDescription() != null)
						message = restriction.getDescription();
					else
						message = "Somente componente o " + componentA.getName() + " pode tratar, lidar ou conter componentes " + componentB.getName();
					asmlContext.getViolations().add(new Violation(iResource.getResource(), message, 1, IMarker.SEVERITY_ERROR));
				}
			}
		}
	}
}
