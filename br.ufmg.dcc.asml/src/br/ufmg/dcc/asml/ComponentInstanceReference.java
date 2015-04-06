package br.ufmg.dcc.asml;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;

public class ComponentInstanceReference {
	private ASTNode astNode;
	private ComponentInstance componentInstanceOwner;

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
		ASTNode typeDeclaration = (ASTNode) getAstNode();
		lineNumber = componentInstanceOwner.getCompilationUnitAST().getLineNumber(typeDeclaration.getStartPosition());
		return lineNumber;
	}

	public ComponentInstance getComponentInstanceReferenced() {
		ComponentInstance componentInstanceReferenced = null;
		try {
			if (astNode instanceof SingleMemberAnnotation)
				componentInstanceReferenced = getTypeInSingleMemberAnnotation();
			return componentInstanceReferenced;
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return componentInstanceReferenced;
	}

	private ComponentInstance getTypeInSingleMemberAnnotation() throws JavaModelException {
		IType findType;
		IJavaProject javaProject = componentInstanceOwner.getType().getJavaProject();
		SingleMemberAnnotation annotation = (SingleMemberAnnotation) this.getAstNode();
		IAnnotationBinding annotationBinding = annotation.resolveAnnotationBinding();
		findType = javaProject.findType(annotationBinding.getAnnotationType().getQualifiedName());
		ComponentInstance componentInstanceReferenced = ComponentInstance.getComponentInstanceByITypeName(findType);
		return componentInstanceReferenced;
	}

}
