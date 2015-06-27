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
	private List<ComponentInstance> componentInstances;
	private boolean internal = true;
	public MatchingVisitor(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
		componentInstances = new ArrayList<ComponentInstance>(asmlContext.getComponentInstances());
		Collections.reverse(componentInstances);
	}
	
	@Override
	public void visit(AbstractComponent abstractComponent) {
		matching(abstractComponent);
	}
	

	protected void matching(AbstractComponent component) {
		boolean matching = false;
		for (ComponentInstance componentInstance : componentInstances) {
			if(internal && componentInstance.isExternal() ||(false/*componentInstance.isExternal() && componentInstance.getComponent()!=null*/ ))
				continue;
			IMatching iMatching = asmlContext.getMatching(component);
			if (iMatching == null)
				continue;
			matching = iMatching.matching(componentInstance, component);
			if (matching) {
				component.addComponentInstance(componentInstance);
				componentInstance.setComponent(component);
			}
		}
	}

	public boolean isInternal() {
		return internal;
	}

	public void setInternal(boolean internal) {
		this.internal = internal;
	}
		
}
