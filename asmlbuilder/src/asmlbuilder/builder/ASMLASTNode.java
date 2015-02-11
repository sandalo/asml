package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ASMLASTNode {
	private ASTNode astNode;
	private CompilationUnit compilationUnit;
	private IResource resource;

	public ASTNode getAstNode() {
		return astNode;
	}

	public void setAstNode(ASTNode astNode) {
		this.astNode = astNode;
	}

	public CompilationUnit getCompilationUnit() {
		return compilationUnit;
	}

	public void setCompilationUnit(CompilationUnit compilationUnit) {
		this.compilationUnit = compilationUnit;
	}

	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		this.resource = resource;
	}

}
