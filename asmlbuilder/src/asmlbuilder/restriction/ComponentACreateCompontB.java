package asmlbuilder.restriction;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ASMLASTNode;
import br.ufmg.dcc.asml.ASMLResource;
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
		if (restriction.getGroupClause().equals(GroupClause.ONLY) && restriction.getPermissionClause().equals(PermissionClause.CAN) ) {
			onlyComponentACanCreateCompontB(restriction, componentA, componentB);
		}
	}

	private void onlyComponentACanCreateCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ASMLResource> allInstances = asmlContext.getResources();
		int lineNumber = 1;
		for (ASMLResource asmlResource : allInstances) {
			if (componentB instanceof MetaClass && (asmlResource.getResource().getFileExtension()+"").equals("java")) {
				if (asmlResource.getResource() instanceof IFile) {
					Set<ASMLASTNode> asmlASTNodes = asmlResource.getASTNodeByType(ClassInstanceCreation.class);
					if(asmlASTNodes==null||asmlASTNodes.isEmpty())
						continue;
					for (ASMLASTNode asmlastNode : asmlASTNodes) {
						boolean achou = false;
						ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) asmlastNode.getAstNode();
						if(asmlContext.getInstanceByName(componentB, classInstanceCreation.getType()+"")!=null){
							Set<ASMLResource> resourcesOfA = asmlContext.getInstancesByComponentHierarchy(componentA);
							for (ASMLResource iResource2 : resourcesOfA) {
								if(asmlResource.getResource().equals(iResource2.getResource())){
									achou=true;
								}
							}
						}
						if (!achou) {
							String message = "";
							if (restriction.getDescription() != null)
								message = restriction.getDescription();
							else
								message = "Somente classes do tipo " + componentA.getName() + " podem criar " + componentB.getName();
							asmlContext.getViolations().add(new Violation(asmlResource.getResource(), message, lineNumber, IMarker.SEVERITY_ERROR));
						}
					}
				}
			}
		}
	}

}
