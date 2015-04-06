package asmlbuilder.matching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentVisitor;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class MatchingVisitor implements ComponentVisitor {

	private ASMLContext asmlContext;

	public MatchingVisitor(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
	}
	
	@Override
	public void visit(AbstractComponent abstractComponent) {
		matching(abstractComponent);
	}
	

	protected void matching(AbstractComponent component) {
		asmlContext.addMatchingCustom(component);
		List<ComponentInstance> componentInstances = new ArrayList<ComponentInstance>(asmlContext.getComponentInstances());
		Collections.reverse(componentInstances);
		boolean matching = false;
		for (ComponentInstance componentInstance : componentInstances) {
			IMatching iMatching = asmlContext.getMatching(component);
			if (iMatching == null)
				continue;
			matching = iMatching.matching(componentInstance, component);
			if (matching) {
				component.addComponentInstance(componentInstance);
				componentInstance.addComponents(component);
			}
		}
	}
	
}
