package asmlbuilder.restriction.declare;

import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class CanDeclareOnly extends RestricionChecker {

	public CanDeclareOnly(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction) {
		componentACanDeclareOnlyCompontB(restriction);
	}

	void componentACanDeclareOnlyCompontB(Restriction restriction) {
		AbstractComponent componentA = (AbstractComponent) restriction.eContainer();
		Set<ComponentInstance> allInstancesOfA = componentA.getAllComponentInstances();
		String fullyQualifiedName = "";
		for (ComponentInstance componentInstanceA : allInstancesOfA) {
			IResource resource = componentInstanceA.getResource();
			if ((resource.getFileExtension() + "").equals("java")) {
				Set<ComponentInstanceReference> references = componentInstanceA.getReferencesToOthersComponentInstances(RelactionType.DECLARE);
				boolean valideReference = false;
				for (ComponentInstanceReference reference : references) {
					ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
					if (componentInstanceReferenced == null) {
						continue;
					}
					AbstractComponent component = componentInstanceReferenced.getComponent();
					if(component==null)
						continue;
					if(component.isChild(componentA))
						continue;
					EList<AbstractComponent> componentesB = restriction.getComponentB();
					fullyQualifiedName = componentInstanceReferenced.getType().getFullyQualifiedName();
					componenteB: for (AbstractComponent componentB : componentesB) {
						if (componentB.containsType(fullyQualifiedName)) {
							valideReference = true;
							break componenteB;
						}
					}
					if (!valideReference) {
						String defaultMessage = "Classes do  componente  " + componentA.getName() + "  n�o podem declarar "+ fullyQualifiedName+"."+
								" Classes do componente  " + componentA.getName() + " podem declarar somente classes do(s) componente(s) " + getComponentNames(restriction);
						addViolation(restriction, reference.getLineNumber(), reference.getComponentInstanceOwner(), defaultMessage);
					}
				}
			}
		}
	}

}
