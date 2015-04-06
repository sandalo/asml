package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.ThrowStatement;

import asmlbuilder.builder.ASMLContext;
import br.ufmg.dcc.asml.ComponentInstanceReference;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAThrowCompontB extends RestricionChecker {

	public ComponentAThrowCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		boolean cannot = restriction.getPermissionClause().equals(PermissionClause.CANNOT);
		if (cannot) {
			anyComponentACannotThrowCompontB(restriction, componentA, componentB);
		}
	}

	void anyComponentACannotThrowCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ComponentInstance> allInstances = componentA.getAllComponentInstances();
		int lineNumber = 1;
		for (ComponentInstance componentInstance : allInstances) {
			IResource resource = componentInstance.getResource();
			if (resource instanceof IFile) {
				Set<ComponentInstanceReference> throwStatementFromResource = componentInstance.getReferencesByNodeType(ThrowStatement.class);
				for (ComponentInstanceReference throwStatementResource : throwStatementFromResource) {
					String nameOfClassAccessed = getNameOfClasseThrow((ThrowStatement) throwStatementResource.getAstNode());
					if (nameOfClassAccessed.equals(""))
						continue;
					lineNumber = componentInstance.getCompilationUnitAST().getLineNumber(throwStatementResource.getAstNode().getStartPosition());
					if (componentB.containsType(nameOfClassAccessed)) {
						addViolation(restriction, componentA, componentB, lineNumber, componentInstance, "Componentes do tipo " + componentA.getName() + " não podem lançar exceções do tipo: " + componentB.getName());
					}
				}
			}
		}
	}

	protected String getNameOfClasseThrow(ThrowStatement throwStatement) {
		ITypeBinding typeBinding = throwStatement.getExpression().resolveTypeBinding();
		if (typeBinding == null)
			return "";
		String nameOfClassthrowStatement = typeBinding.getQualifiedName();
		return nameOfClassthrowStatement;
	}

}
