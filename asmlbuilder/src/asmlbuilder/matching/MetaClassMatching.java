package asmlbuilder.matching;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;

public class MetaClassMatching extends AbstraticMatching implements IMatching {

	public MetaClassMatching(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public boolean matching(ASMLResource resource, AbstractComponent component) {
		String fileExtension = resource.getResource().getFileExtension()+"";
		if (component instanceof MetaClass && resource.getResource() instanceof IFile && fileExtension.equals("java")) {
			MetaClass class1 = (MetaClass) component;
			AbstractNameConvetion abstractNameConvetion = class1.getMatching();
			if (abstractNameConvetion instanceof ClassMatching) {
				ClassMatching expressionMatching = (ClassMatching) abstractNameConvetion;
				ExpressionMatchingClause clause = expressionMatching.getExpressionMatching();
				if (clause.equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
					String parameter = expressionMatching.getParameter() + "";
					String resourceName = FileMatching.extractResourceNameIndexed(resource.getResource());
					if (resourceName.endsWith(parameter)) {
						registerInSuperClass(class1);
						return true;
					}
				}
			}
		}
		return false;
	}

	private void registerInSuperClass(MetaClass class1) {
		MetaClass key = class1.getExtends();
		if(key!=null){
			Set<MetaClass>  sublMetaClasses = asmlContext.getSublMetaClasses().get(key);
			if(sublMetaClasses==null){
				sublMetaClasses = new HashSet<MetaClass>();
				asmlContext.getSublMetaClasses().put(key, sublMetaClasses);
			}
			asmlContext.getSublMetaClasses().get(key).add(class1);
		}
	}
}
