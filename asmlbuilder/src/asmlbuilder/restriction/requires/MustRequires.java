package asmlbuilder.restriction.requires;

import java.util.Set;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class MustRequires extends RestricionChecker {

	public MustRequires(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction) {
			anyComponentAMustRequiresCompontB(restriction);
	}

	private void anyComponentAMustRequiresCompontB(Restriction restriction) {
		AbstractComponent componentA =  (AbstractComponent) restriction.eContainer();
		AbstractComponent componentB = restriction.getComponentB().get(0);
		Set<ComponentInstance> instancesA = componentA.getInstances();
		Set<ComponentInstance> instancesB = componentB.getInstances();
		exrenal_for:
		for (ComponentInstance componentInstanceA : instancesA) {
			for (ComponentInstance componentInstanceB : instancesB) {
				if (componentInstanceA.getRawName().equalsIgnoreCase(componentInstanceB.getRawName())) {
					continue exrenal_for;
				}
			}
			String message = "Todo componente " + componentA.getName() + " requer um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + componentA.getName();
			addViolation(restriction, 0, componentInstanceA, message);
		}
	}

	public String removeTokens(String name) {
		Set<String> tokes = asmlContext.getSufixAndPrefixNameConventionConvention();
		for (String toke : tokes) {
			name = name.replace(toke, "");
		}
		return name;
	}
	
	public String removeFileExtension(String name, String fileExtension) {
			if(fileExtension!=null)
			name = name.replace("."+fileExtension, "");
		return name;
	}

}
