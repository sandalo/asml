package br.ufmg.dcc.asml;

import org.eclipse.jdt.core.dom.ASTNode;

public class ASMLASTNode {
	private ASTNode astNode;
	private ASMLResource resource;

	public ASTNode getAstNode() {
		return astNode;
	}

	public void setAstNode(ASTNode astNode) {
		this.astNode = astNode;
	}

	public ASMLResource getResource() {
		return resource;
	}

	public void setResource(ASMLResource asmlResource) {
		this.resource = asmlResource;
	}

}
