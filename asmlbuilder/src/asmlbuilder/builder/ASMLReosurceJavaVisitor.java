package asmlbuilder.builder;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentInstanceReference;

public class ASMLReosurceJavaVisitor extends ASTVisitor {

	private ASMLContext cacheASML;
	private ComponentInstance componentInstance;

	public ASMLReosurceJavaVisitor(ASMLContext cacheASML) {
		this.cacheASML = cacheASML;
	}

	public boolean visitNode(ASTNode node) {
		ComponentInstanceReference componentInstanceReference = new ComponentInstanceReference();
		componentInstanceReference.setAstNode(node);
		componentInstanceReference.setComponentInstanceOwner(componentInstance);
		ComponentInstance resource = componentInstanceReference.getComponentInstanceOwner();
		resource.addReference(componentInstanceReference);
		return true; // do not continue
	}

	@Override
	public boolean visit(AnnotationTypeDeclaration node) {
		visitNode(node);
		return true;
	}
	@Override
	public boolean visit(AnnotationTypeMemberDeclaration node) {
		visitNode(node);
		return super.visit(node);
	}
	
	@Override
	public boolean visit(SingleMemberAnnotation node) {
		visitNode(node);
		return super.visit(node);
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		visitNode(node);
		return true;
	}
	
	@Override
	public boolean visit(SingleVariableDeclaration node) {
		visitNode(node);
		return true;
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

	@Override
	public boolean visit(ThrowStatement node) {
		visitNode(node);
		return true;
	}
	
	public void setComponentInstance(ComponentInstance componentInstance) {
		this.componentInstance = componentInstance;
	}

}