package br.ufmg.dcc.asml;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import br.ufmg.dcc.asml.aSMLModel.RelactionType;

public class ComponentInstanceReference {
	private ASTNode astNode;
	private ComponentInstance componentInstanceOwner;
	private ComponentInstance componentInstanceReferenced;
	private RelactionType relactionType;
	public ASTNode getAstNode() {
		return astNode;
	}

	public void setAstNode(ASTNode astNode) {
		this.astNode = astNode;
	}

	public ComponentInstance getComponentInstanceOwner() {
		return componentInstanceOwner;
	}

	public void setComponentInstanceOwner(ComponentInstance componentInstance) {
		this.componentInstanceOwner = componentInstance;
	}

	public int getLineNumber() {
		int lineNumber;
		ASTNode astNode = (ASTNode) getAstNode();
		lineNumber = componentInstanceOwner.getCompilationUnitAST().getLineNumber(astNode.getStartPosition());
		return lineNumber;
	}

	public void setComponentInstanceReferenced(ComponentInstance componentInstanceReferenced) {
		this.componentInstanceReferenced = componentInstanceReferenced;
	}

	
	public ComponentInstance getComponentInstanceReferenced() {
/*		ComponentInstance componentInstanceReferenced = null;
		try {
			if (astNode instanceof SingleMemberAnnotation)
				componentInstanceReferenced = getTypeInSingleMemberAnnotation();
			else if (astNode instanceof TypeDeclaration)
				componentInstanceReferenced = getTypeInTypeDeclaration();
			else if (astNode instanceof FieldDeclaration)
				componentInstanceReferenced = getTypeInFieldDeclaration();
			else if (astNode instanceof NormalAnnotation)
				componentInstanceReferenced = getTypeInNormalAnnotation();
			else if (astNode instanceof MethodInvocation)
				componentInstanceReferenced = getTypeInMethodInvocation();
			else if (astNode instanceof MarkerAnnotation)
				componentInstanceReferenced = getTypeInMarkerAnnotation();
			return componentInstanceReferenced;
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
*/		return componentInstanceReferenced;
	}

/*	private ComponentInstance getTypeInSingleMemberAnnotation() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		SingleMemberAnnotation annotation = (SingleMemberAnnotation) this.getAstNode();
		IAnnotationBinding annotationBinding = annotation.resolveAnnotationBinding();
		findType = javaProject.findType(annotationBinding.getAnnotationType().getQualifiedName());
		ComponentInstance componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}*/

/*	private ComponentInstance getTypeInTypeDeclaration() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		TypeDeclaration typeDeclaration = (TypeDeclaration) this.getAstNode();
		ITypeBinding typeDeclarationBinding = typeDeclaration.resolveBinding();
		findType = javaProject.findType(typeDeclarationBinding.getQualifiedName());
		ComponentInstance componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}*/

/*	private ComponentInstance getTypeInMethodInvocation() {
		ComponentInstance componentInstanceReferenced = null;
		try {

			IType findType;
			IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
			MethodInvocation methodInvocation = (MethodInvocation) this.getAstNode();
			ITypeBinding typeDeclarationBinding = methodInvocation.getExpression().resolveTypeBinding();
			findType = javaProject.findType(typeDeclarationBinding.getQualifiedName());
			componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return componentInstanceReferenced;
	}*/

/*	private ComponentInstance getTypeInFieldDeclaration() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		FieldDeclaration fieldDeclaration = (FieldDeclaration) this.getAstNode();
		ITypeBinding typeDeclarationBinding = fieldDeclaration.getType().resolveBinding();
		findType = javaProject.findType(typeDeclarationBinding.getBinaryName());
		ComponentInstance componentInstanceReferenced = null;
		if (findType != null)
			componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}*/

/*	private ComponentInstance getTypeInNormalAnnotation() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		NormalAnnotation normalAnnotation = (NormalAnnotation) astNode;
		ITypeBinding typeDeclarationBinding = normalAnnotation.resolveTypeBinding();
		findType = javaProject.findType(typeDeclarationBinding.getQualifiedName());
		ComponentInstance componentInstanceReferenced = null;
		if (findType != null)
			componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}*/

/*	private ComponentInstance getTypeInMarkerAnnotation() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		MarkerAnnotation normalAnnotation = (MarkerAnnotation) astNode;
		ITypeBinding typeDeclarationBinding = normalAnnotation.resolveTypeBinding();
		findType = javaProject.findType(typeDeclarationBinding.getQualifiedName());
		ComponentInstance componentInstanceReferenced = null;
		if (findType != null)
			componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}*/

	
	@Override
	public String toString() {
		if (getAstNode() != null)
			return "" + getAstNode().toString();
		return "";
	}

	public RelactionType getRelactionType() {
		return relactionType;
	}

	public void setRelactionType(RelactionType relactionType) {
		this.relactionType = relactionType;
	}

}
