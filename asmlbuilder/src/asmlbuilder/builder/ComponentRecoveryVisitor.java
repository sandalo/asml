package asmlbuilder.builder;

import br.ufmg.dcc.asml.ComponentVisitor;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class ComponentRecoveryVisitor implements ComponentVisitor {

	private ASMLContext asmlContext;

	public ComponentRecoveryVisitor(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
	}
	
	@Override
	public void visit(AbstractComponent abstractComponent) {
		asmlContext.addDeclaredComponents(abstractComponent);
	}

}
