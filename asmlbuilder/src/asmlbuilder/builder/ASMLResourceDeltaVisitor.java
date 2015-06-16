package asmlbuilder.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

import br.ufmg.dcc.asml.ComponentInstance;

public class ASMLResourceDeltaVisitor extends ASMLResourceVisitor implements IResourceDeltaVisitor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
	 * .core.resources.IResourceDelta)
	 */

	public ASMLResourceDeltaVisitor(ASMLContext cacheASML) {
		super(cacheASML);
	}

	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource resource = delta.getResource();
		if ((resource.getFileExtension() + "").equals("class")) {
			return false;
		}
		boolean deep = deep(resource);
		boolean ignoreResource = ignoreResource(resource);

		if (ignoreResource && deep) {
			return false;
		}

		if (ignoreResource) {
			return true;
		}

		ComponentInstance componentInstance = null;
		switch (delta.getKind()) {
		case IResourceDelta.ADDED:
			componentInstance = new ComponentInstance();
			componentInstance.setExternal(false);
			componentInstance.setResource(resource);
			asmlContext.addComponentInstance(componentInstance);
			break;
		case IResourceDelta.REMOVED:
			componentInstance = (ComponentInstance) ComponentInstance.getComponentInstanceByIResourceName(resource);
			if(componentInstance ==null)
				return false;
			asmlContext.removeComponentInstance(componentInstance);
			break;
		case IResourceDelta.CHANGED:
			componentInstance = (ComponentInstance) ComponentInstance.getComponentInstanceByIResourceName(resource);
			if(componentInstance ==null)
				return false;
			componentInstance.setResource(resource);
			break;
		}
		if (resource instanceof IFile && resource.getFileExtension().equals("java"))
			parse(componentInstance);
		return true;
	}
}
