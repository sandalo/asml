package asmlbuilder.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public  class ASMLReosurceJavaVisitor extends ASTVisitor {
	
	private CacheASML cacheASML;
	private ASMLASTNode  asmlastNode;

	public ASMLReosurceJavaVisitor(CacheASML cacheASML) {
		this.cacheASML = cacheASML;
	}
	
	public boolean visitNode(ASTNode node) {
		asmlastNode.setAstNode(node);
		cacheASML.addInstancesOfASTNodeJavaFound(asmlastNode.getResource(), asmlastNode);
		return true; // do not continue
	}
	
	@Override
	public boolean visit(AnnotationTypeDeclaration node) {
		 visitNode(node);
		 return true;
	}
	
	@Override
	public boolean visit(TypeDeclaration node) {
		 visitNode(node);
		 return true;
	}

	public ASMLASTNode getAsmlastNode() {
		return asmlastNode;
	}

	public void setAsmlastNode(ASMLASTNode asmlastNode) {
		this.asmlastNode = asmlastNode;
	}

}