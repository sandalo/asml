package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentACreateCompontB extends RestricionChecker {

	public ComponentACreateCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		boolean onlyA = restriction.getGroupClause().equals(GroupClause.ONLY);
		boolean can_create_B = restriction.getPermissionClause().equals(PermissionClause.CAN);
		if (onlyA && can_create_B ) {
			onlyComponentACanCreateCompontB(restriction, componentA, componentB);
		} else if(true){
			
		}
	}

	private void onlyComponentACanCreateCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstances = asmlContext.getComponentInstances();
		int lineNumber = 1;
		for (ComponentInstance componentInstance : allInstances) {
			if (componentB instanceof MetaClass && (componentInstance.getResource().getFileExtension()+"").equals("java")) {
				if (componentInstance.getResource() instanceof IFile) {
					Set<ComponentInstanceReference> asmlASTNodes = componentInstance.getReferencesByNodeType(ClassInstanceCreation.class);
					if(asmlASTNodes==null||asmlASTNodes.isEmpty())
						continue;
					for (ComponentInstanceReference asmlastNode : asmlASTNodes) {
						ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) asmlastNode.getAstNode();
						lineNumber = asmlastNode.getLineNumber();
						String nameOfClasseInstanciate = getNameOfClasseInstanciate(classInstanceCreation);
						boolean isB_component = componentB.containsType(nameOfClasseInstanciate);
						if(isB_component){
							String nameOfClasseInvocator = componentInstance.getType().getFullyQualifiedName();
							boolean isA_component = componentA.containsType(nameOfClasseInvocator);
							if (!isA_component) {
								String message = "";
								if (restriction.getDescription() != null)
									message = restriction.getDescription();
								else
									message = "Somente classes do tipo " + componentA.getName() + " podem criar " + componentB.getName();
								asmlContext.getViolations().add(new Violation(componentInstance.getResource(), message, lineNumber, IMarker.SEVERITY_ERROR));
							}
						}
					}
				}
			}
		}
	}

	protected String getNameOfClasseInstanciate(ClassInstanceCreation classInstanceCreation) {
		ITypeBinding typeBinding = classInstanceCreation.getType().resolveBinding();
		if (typeBinding == null)
			return "";
		String name = typeBinding.getQualifiedName();
		return name;
	}
}
