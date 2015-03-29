package asmlbuilder.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.emf.common.util.EList;

import br.ufmg.dcc.asml.ASMLResource;

public class ASMLResourceVisitor implements IResourceVisitor {
	protected ASMLContext asmlContext;

	public ASMLResourceVisitor(ASMLContext cacheASML) {
		this.asmlContext = cacheASML;
	}

	public boolean visit(IResource resource) {
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

		ASMLResource asmlResource = new ASMLResource();
		asmlResource.setResource(resource);

		this.asmlContext.addResource(asmlResource);
		if(resource instanceof IFile && resource.getFileExtension().equals("java"))
			asmlContext.getAstJavaParser().parse(asmlResource);

		return true;
	}

	protected boolean ignoreResource(IResource resource) {
		boolean ignoreResource = false;
		EList<String> ignores = asmlContext.getAsmlModel().getIgnore();
		try {
			for (String ignore : ignores) {
				String segment = resource.getFullPath().segment(resource.getFullPath().segments().length - 1);
				if (segment.equals(ignore.replace("*", ""))) {
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
		EList<String> ignores = asmlContext.getAsmlModel().getIgnore();
		try {
			for (String ignore : ignores) {
				String segment = resource.getFullPath().segment(resource.getFullPath().segments().length - 1);
				if (segment.equals(ignore.replace("*", ""))) {
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