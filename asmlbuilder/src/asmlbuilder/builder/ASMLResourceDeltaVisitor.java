package asmlbuilder.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

import br.ufmg.dcc.asml.ASMLResource;

public 	class ASMLResourceDeltaVisitor extends ASMLResourceVisitor implements IResourceDeltaVisitor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
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
		
		if(ignoreResource && deep){
			return false;
		}
		
		if(ignoreResource){
			return true;
		}
		
		ASMLResource asmlResource =  new ASMLResource();
		asmlResource.setResource(resource);

		switch (delta.getKind()) {
		case IResourceDelta.ADDED:
			asmlContext.addResource(asmlResource);
			break;
		case IResourceDelta.REMOVED:
			asmlContext.removeResource(asmlResource);
			break;
		case IResourceDelta.CHANGED:
			asmlContext.removeResource(asmlResource);
			asmlContext.addResource(asmlResource);
			break;
		}
		if(resource instanceof IFile && resource.getFileExtension().equals("java"))
			asmlContext.getAstJavaParser().parse(asmlResource);

		// return true to continue visiting children.
		return true;
	}
}
