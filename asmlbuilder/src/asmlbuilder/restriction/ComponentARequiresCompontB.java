package asmlbuilder.restriction;

import java.util.Set;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentARequiresCompontB extends RestricionChecker {

	public ComponentARequiresCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (( (restriction.getGroupClause().equals(GroupClause.ANY))) && (restriction.getPermissionClause().equals(PermissionClause.NULL) || restriction.getPermissionClause().equals(PermissionClause.MUST)) && restriction.getRelactionType().equals(RelactionType.REQUIRES)) {
			anyComponentAMustRequiresCompontB(restriction, componentA,componentB);
		}
	}

	private void anyComponentAMustRequiresCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> instancesA = componentA.getInstances();
		Set<ComponentInstance> instancesB = componentB.getInstances();
		exrenal_for:
		for (ComponentInstance componentInstanceA : instancesA) {
			for (ComponentInstance componentInstanceB : instancesB) {
				if (componentInstanceA.getRawName().equalsIgnoreCase(componentInstanceB.getRawName())) {
					continue exrenal_for;
				}
			}
			String message = "Todo componente  " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + componentA.getName();
			addViolation(restriction, componentA, componentB, 0, componentInstanceA, message);
		}
	}

	public String removeTokens(String name) {
		Set<String> tokes = asmlContext.getTokensNameConvention();
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
