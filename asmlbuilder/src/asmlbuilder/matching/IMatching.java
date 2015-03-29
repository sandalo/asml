package asmlbuilder.matching;

import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public interface IMatching {
	public boolean matching (ASMLResource resource, AbstractComponent component);	
}
