package asmlbuilder.matching;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class MetaModuleMatching extends AbstraticMatching implements IMatching {

	public MetaModuleMatching(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public boolean matching(ComponentInstance resource, AbstractComponent component) {
		String matching = component.getMatching();
		if(matching==null)
			return false;
		String curinga = "{name}";
		String index = "[index]";
		int curinga_indexOf = matching.indexOf(curinga);
		boolean isMatch = true;
		if (curinga_indexOf > -1) {
			String token = matching.substring(curinga_indexOf + curinga.length());
			String fileExtension = resource.getResource().getFileExtension();
			String name = resource.getResource().getName();
			if (fileExtension != null)
				name = resource.getResource().getName().replace("." + fileExtension, "");
			int index_indexOf = token.indexOf(index);
			if (index_indexOf > -1) {
				token = token.replace(index, "");
			}

			if (name.endsWith(token)) {
				isMatch = true;
			} else {
				isMatch = false;
			}
		} else {
			isMatch = false;
			String parents[] = matching.split("\\.");
			String segments[] = resource.getResource().getFullPath().segments();
			if (parents[parents.length - 1].equals(segments[segments.length - 1])) {
				if (parents.length > 1) {
					if (parents[parents.length - 2].equals(segments[segments.length - 2])) {
						isMatch = true;
					}
				} else {
					isMatch = true;
				}
			}
		}
		return isMatch;
	}
}
