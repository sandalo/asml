package asmlbuilder.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import br.ufmg.dcc.asml.ComponentInstance;

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

		ComponentInstance componentInstance = new ComponentInstance();
		componentInstance.setResource(resource);
		this.asmlContext.addComponentInstance(componentInstance);
		if (resource instanceof IFile && resource.getFileExtension().equals("java"))
			parse(componentInstance);
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

	// use ASTParse to parse string
	protected void parse(ComponentInstance componentInstance) {
		try {
			ICompilationUnit element = (ICompilationUnit) JavaCore.create(componentInstance.getResource());
			ASTParser parser = ASTParser.newParser(AST.JLS8);
			parser.setSource(element);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			parser.setResolveBindings(true);
			final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
			componentInstance.setCompilationUnitAST(cu);
			componentInstance.setType(element.getTypes()[0]);//TODO - Considera apenas um tipo por arquivo...
			ASMLReosurceJavaVisitor reosurceJavaVisitor = asmlContext.getReosurceJavaVisitor();
			reosurceJavaVisitor.setComponentInstance(componentInstance);
			cu.accept(reosurceJavaVisitor);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

}