package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.Type;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentADeclareCompontB extends RestricionChecker {

	public ComponentADeclareCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		boolean anyA = (restriction.getGroupClause().equals(GroupClause.NULL))||(restriction.getGroupClause().equals(GroupClause.ANY));
		boolean onlyA = (restriction.getGroupClause().equals(GroupClause.ONLY));
		boolean can = restriction.getPermissionClause().equals(PermissionClause.CAN);
		boolean onlyB = restriction.getGroupClauseB().equals(GroupClause.ONLY);
		if (anyA && can && onlyB) {
			anyComponentACanOnlyDeclareCompontB(restriction, componentA, componentB);
		}else if(onlyA && can){
			onlyComponentACanDeclareCompontB(restriction, componentA, componentB);
		}
	}

	void anyComponentACanOnlyDeclareCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstancesOfA = componentA.getInstances();
		for (ComponentInstance componentInstanceA : allInstancesOfA) {
			IResource resource = componentInstanceA.getResource();
			if (resource instanceof IFile) {
				if (componentB instanceof MetaClass && (resource.getFileExtension() + "").equals("java")) {
					Set<ComponentInstanceReference> fieldDeclarationsFromResource = componentInstanceA.getReferencesByNodeType(FieldDeclaration.class);
					for (ComponentInstanceReference fieldDeclarationFromResource : fieldDeclarationsFromResource) {
						FieldDeclaration fieldDeclaration = (FieldDeclaration) fieldDeclarationFromResource.getAstNode();
						Type type = fieldDeclaration.getType();
						ITypeBinding resolveBinding = type.resolveBinding();
						if (resolveBinding == null)
							continue;
						String qualifiedName = resolveBinding.getQualifiedName();
						if (!componentB.containsType(qualifiedName)) {
							String defaultMessage = "Classes do componente" + componentA.getName() + " podem somente declarar classes do componente " + componentB.getName();
							addViolation(restriction, componentA, componentB, fieldDeclarationFromResource.getLineNumber(), fieldDeclarationFromResource.getComponentInstanceOwner(), defaultMessage);
						}
					}
				}
			}
		}
	}

	void onlyComponentACanDeclareCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstances = asmlContext.getComponentInstances();
		int lineNumber = 1;
		for (ComponentInstance componentInstance : allInstances) {
			IResource resource = componentInstance.getResource();
			if (resource instanceof IFile) {
				if (componentB instanceof MetaClass && (resource.getFileExtension() + "").equals("java")) {
					Set<ComponentInstanceReference> fieldDeclarationFromResource = componentInstance.getReferencesByNodeType(FieldDeclaration.class);
					for2: for (ComponentInstanceReference fieldDeclaration : fieldDeclarationFromResource) {
						String nameOfClassDeclared = getNameOfClasseDeclared((FieldDeclaration) fieldDeclaration.getAstNode());
						if (nameOfClassDeclared.equals(""))
							continue;
						lineNumber = fieldDeclaration.getLineNumber();
						if (componentB.containsType(nameOfClassDeclared)) {
							Set<ComponentInstance> resourcesOfA = componentA.getAllComponentInstances();
							for (ComponentInstance resourceThatCanAcessResourceB : resourcesOfA) {
								if (resource.equals(resourceThatCanAcessResourceB.getResource())) {
									break for2;
								}
							}
							addViolation(restriction, componentA, componentB, lineNumber, componentInstance, "Somente classes do componente " + componentA.getName() + " podem declarar classes do componete " + componentB.getName());
						}
					}
				}
			}
		}
	}

	protected String getNameOfClasseDeclared(FieldDeclaration fieldDeclaration) {
		ITypeBinding typeBinding = fieldDeclaration.getType().resolveBinding();
		if (typeBinding == null)
			return "";
		String name = typeBinding.getQualifiedName();
		return name;
	}

}
