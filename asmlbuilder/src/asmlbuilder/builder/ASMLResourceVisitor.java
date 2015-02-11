package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;

public class ASMLResourceVisitor implements IResourceVisitor {
	private CacheASML cacheASML;

	public ASMLResourceVisitor(CacheASML cacheASML) {
		this.cacheASML = cacheASML;
	}

	public boolean visit(IResource resource) {
		if ((resource.getFileExtension() + "").equals("class") || 
				resource.getName().equals(".classpath") || 
				resource.getName().equals("target") || 
				resource.getName().equals(".settings")) {
			return false;
		}
		this.cacheASML.getResources().add(resource);
		return true;
	}

}