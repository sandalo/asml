package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

public 	class ASMLResourceDeltaVisitor extends ASMLResourceVisitor implements IResourceDeltaVisitor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
	 * .core.resources.IResourceDelta)
	 */

	public ASMLResourceDeltaVisitor(CacheASML cacheASML) {
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

		switch (delta.getKind()) {
		case IResourceDelta.ADDED:
			cacheASML.getResources().add(resource);
			break;
		case IResourceDelta.REMOVED:
			cacheASML.getResources().remove(resource);
			cacheASML.removeResourcesFromComponents(resource);
			break;
		case IResourceDelta.CHANGED:
			cacheASML.getResources().remove(resource);
			cacheASML.getResources().add(resource);
			break;
		}
		// return true to continue visiting children.
		return true;
	}
}
