package asmlbuilder.builder;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;

import br.ufmg.dcc.asml.ASMLASTNode;
import br.ufmg.dcc.asml.ASMLResource;

public  class ASMLReosurceJavaVisitor extends ASTVisitor {
	
	private ASMLContext cacheASML;
	private ASMLResource  asmlResource;

	public ASMLReosurceJavaVisitor(ASMLContext cacheASML) {
		this.cacheASML = cacheASML;
	}
	
	public boolean visitNode(ASTNode node) {
		ASMLASTNode asmlastNode = new ASMLASTNode();
		asmlastNode.setAstNode(node);
		asmlastNode.setResource(asmlResource);
		ASMLResource resource = asmlastNode.getResource();
		resource.addInstancesOfASTNodeJavaFound(asmlastNode);
		return true; // do not continue
	}
	
	@Override
	public boolean visit(AnnotationTypeDeclaration node) {
		 visitNode(node);
		 return true;
	}
	
	@Override
	public boolean visit(VariableDeclarationExpression node) {
		 visitNode(node);
		return super.visit(node);
	}
	
	@Override
	public boolean visit(TypeDeclaration node) {
		 visitNode(node);
		 return true;
	}
	
	@Override
	public boolean visit(ClassInstanceCreation node) {
		 visitNode(node);
		 return true;
	}
	

	@Override
	public boolean visit(MethodInvocation node) {
		 visitNode(node);
		return true;
	}

	public void setAsmlResource(ASMLResource asmlResource) {
		this.asmlResource = asmlResource;
	}
	

}