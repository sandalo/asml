package asmlbuilder.builder;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

public 	class ASMLResourceDeltaVisitor implements IResourceDeltaVisitor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
	 * .core.resources.IResourceDelta)
	 */
	private CacheASML cacheASML;

	public ASMLResourceDeltaVisitor(CacheASML cacheASML) {
		this.cacheASML = cacheASML;
	}
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource resource = delta.getResource();
		if ((resource.getFileExtension() + "").equals("class") || resource.getName().equals(".classpath")  || resource.getName().equals("target") || resource.getName().equals(".settings")) {
			return false;
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
