package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.emf.common.util.EList;

public class ASMLResourceVisitor implements IResourceVisitor {
	protected CacheASML cacheASML;

	public ASMLResourceVisitor(CacheASML cacheASML) {
		this.cacheASML = cacheASML;
	}

	public boolean visit(IResource resource) {
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

		
		this.cacheASML.getResources().add(resource);
		return true;
	}

	protected boolean ignoreResource(IResource resource) {
		boolean ignoreResource = false;
		EList<String> ignores = cacheASML.getAsmlModel().getIgnore();
		try {
			for (String ignore : ignores) {
				String segment = resource.getFullPath().segment(resource.getFullPath().segments().length-1);
				if(segment.equals(ignore.replace("*", ""))){
					ignoreResource = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ignoreResource;
	}
	
	protected boolean deep(IResource resource) {
		boolean ignoreResource = false;
		EList<String> ignores = cacheASML.getAsmlModel().getIgnore();
		try {
			for (String ignore : ignores) {
				String segment = resource.getFullPath().segment(resource.getFullPath().segments().length-1);
				if(segment.equals(ignore.replace("*", ""))){
					ignoreResource = ignore.endsWith("*");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ignoreResource;
	}

}