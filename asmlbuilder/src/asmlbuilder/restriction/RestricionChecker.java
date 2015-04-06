package asmlbuilder.restriction;

import org.eclipse.core.resources.IMarker;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public abstract class RestricionChecker {
	protected ASMLContext asmlContext;

	public RestricionChecker(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
	}

	public abstract void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB);


	protected void addViolation(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB, int lineNumber, ComponentInstance componentInstance, String defaultMessage) {
		if (restriction.getDescription() != null)
			defaultMessage = restriction.getDescription();
		asmlContext.getViolations().add(new Violation(componentInstance.getResource(), defaultMessage, lineNumber, IMarker.SEVERITY_ERROR));
	}
}
