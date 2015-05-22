package asmlbuilder.validation;

import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentVisitor;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ValidatorVisitor implements ComponentVisitor {

	private ASMLContext asmlContext;

	public ValidatorVisitor(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
	}
	
	@Override
	public void visit(AbstractComponent abstractComponent) {
		validateComponentRestrictions(abstractComponent);
		validateLocalization(abstractComponent);
	}
	
	
	void validateComponentRestrictions(AbstractComponent abstractComponent) {
		EList<Restriction> restrictions = ASMLContext.getRestrictions(abstractComponent);
		for (Restriction restriction : restrictions) {
			EList<AbstractComponent> componentsA = new BasicEList<AbstractComponent>();
			if(!restriction.getComponentA().isEmpty()){
				componentsA = restriction.getComponentA();
			}else{
				componentsA.add(abstractComponent);
			}
			AbstractComponent componentB = restriction.getComponentB();
			for (AbstractComponent componentA : componentsA) {
				RestricionChecker restricionChecker = asmlContext.getAsmlBinder().getBindRestrictionChecker().get(restriction.getRelactionType());
				if (restricionChecker != null) {
					try {
						restricionChecker.checker(restriction, componentA, componentB);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Restriction checker ainda não implementado.");
				}
			}
		}
	}

	void validateLocalization(AbstractComponent abstractComponent) {
		Set<ComponentInstance> resourcesFilho = abstractComponent.getInstances();
		for (ComponentInstance resourceFilho : resourcesFilho) {
			if (!localizacaoCorreta(abstractComponent, resourceFilho.getResource())) {
				String message = "O  componente  " + abstractComponent.getName() + " esta localizado no lugar errado";
				asmlContext.getViolations().add(new Violation(resourceFilho.getResource(), message, 1, IMarker.SEVERITY_ERROR));
			}
		}
	}
	
	private boolean localizacaoCorreta(AbstractComponent component, IResource resource) {
		boolean matching = true;
		return matching;
	}
}
