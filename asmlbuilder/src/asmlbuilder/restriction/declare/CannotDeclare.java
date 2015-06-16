package asmlbuilder.restriction.declare;

import java.util.Set;

import org.eclipse.jdt.core.dom.FieldDeclaration;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class CannotDeclare extends RestricionChecker {

	public CannotDeclare(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction) {
		componentACannnotDeclareCompontB(restriction);
	}

	void componentACannnotDeclareCompontB(Restriction restriction) {
		AbstractComponent componentA =  (AbstractComponent) restriction.eContainer();
		AbstractComponent componentB = null;//restriction.getComponentB();
		for (ComponentInstance componentInstance : componentA.getAllComponentInstances()) {
			Set<ComponentInstanceReference> references = componentInstance.getReferencesToOthersComponentInstances(RelactionType.DECLARE);
			for (ComponentInstanceReference reference : references) {
				ComponentInstance componentInstanceReferenced = reference.getComponentInstanceReferenced();
				if (componentInstanceReferenced == null)
					continue;
				AbstractComponent componentReferenced = componentInstanceReferenced.getComponent();
				if ((componentReferenced.equals(componentB)) || componentReferenced.isChild(componentB)) {
					addViolation(restriction, reference.getLineNumber(), componentInstance, "Componente n�o pode declar " + componentB.getName());
				}
			}
		}
	}

}
