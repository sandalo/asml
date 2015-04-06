package asmlbuilder.matching;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.View;

public class MetaModuleMatching extends AbstraticMatching implements IMatching {

	public MetaModuleMatching(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public boolean matching(ComponentInstance resource, AbstractComponent component) {
		if (resource.getResource() instanceof IFolder || resource.getResource() instanceof IProject) {
			try {

				String fisicalPathComponent = "";
				EObject componentAux = (AbstractComponent) component;
				String[] resourceSegments = resource.getResource().getFullPath().segments();
				while (componentAux != null && !(componentAux instanceof View)) {
					String nameSpace = ModuleMatching.getNameSpace((AbstractComponent) componentAux);
					if (nameSpace.equals(""))
						if (componentAux instanceof MetaModule)
							/**
							 * Este token(MetaModule) será utilizado para que a
							 * lógica ignore a coparações com resources físicos,
							 * pois os meta modulos // são / abstratos
							 */
							fisicalPathComponent = "MetaModule" + "." + fisicalPathComponent;
						else
							fisicalPathComponent = ((AbstractComponent)componentAux).getName() + "." + fisicalPathComponent;
					else
						fisicalPathComponent = nameSpace + "." + fisicalPathComponent;
					componentAux = componentAux.eContainer();
				}
				String[] componenteSegments = fisicalPathComponent.split("\\.");
				
				if(componenteSegments.length!=resourceSegments.length)//Muita atenção neste ponto!!! Este teste é diferente entre modulo e meta-modulo
					return false;
				for (int i = resourceSegments.length - 1; i >= 0; i--) {
					String string = componenteSegments[i];
					if (string.equals("MetaModule")) {
						continue;
					}
					String string2 = resourceSegments[i];
					if (!string.equals(string2)) {
						return false;
					}
				}
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

}
