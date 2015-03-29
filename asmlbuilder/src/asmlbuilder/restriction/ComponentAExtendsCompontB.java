package asmlbuilder.restriction;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ASMLASTNode;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.ExternalClass;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentAExtendsCompontB extends RestricionChecker {

	public ComponentAExtendsCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if (restriction.getGroupClause().equals(GroupClause.ANY) && restriction.getPermissionClause().equals(PermissionClause.MUST) && restriction.getRelactionType().equals(RelactionType.EXTEND)) {
			anyComponentAMustExtendCompontB(restriction, componentA, componentB);
		}
	}

	private void anyComponentAMustExtendCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		try {
			Set<ASMLResource> instances = asmlContext.getInstancesByComponent(componentA);
			int lineNumber = 0;
			for (ASMLResource iResourceClasses : instances) {
				boolean extend = false;
				if (iResourceClasses.getResource() instanceof IFile) {
					if (componentA instanceof MetaClass) {
						if (componentB instanceof ExternalClass) {
							Set<ASMLASTNode> typeDeclarations = iResourceClasses.getASTNodeByType(TypeDeclaration.class);
							for (ASMLASTNode typeDeclarationResource : typeDeclarations) {
								TypeDeclaration typeDeclaration = (TypeDeclaration) typeDeclarationResource.getAstNode();
								lineNumber = iResourceClasses.getCompilationUnitAST().getLineNumber(typeDeclaration.getStartPosition());
								// Só possui uma declacarão pois o
								// compilationUnit só possui um resource
								IType iType = typeDeclarationResource.getResource().getCompilationUnitType().getTypes()[0];
								if (iType == null)
									continue;
								ITypeHierarchy typeHierarchy = iType.newSupertypeHierarchy(new NullProgressMonitor());
								IType[] iTypes = typeHierarchy.getAllSupertypes(iType);
								for (IType superType : iTypes) {
									boolean equals = superType.getFullyQualifiedName().equals(componentB.getName());
									boolean equals2 = superType.getFullyQualifiedName().equals(((ExternalClass) componentB).getType());
									if (equals || equals2) {
										extend = true;
										break;
									}
								}
							}
						} else if (componentB instanceof MetaClass) {
							Set<ASMLASTNode> typeDeclarations = iResourceClasses.getASTNodeByType(TypeDeclaration.class);
							externalfor:
							for (ASMLASTNode typeDeclarationResource : typeDeclarations) {//Sempre um type
								TypeDeclaration typeDeclaration = (TypeDeclaration) typeDeclarationResource.getAstNode();
								lineNumber = iResourceClasses.getCompilationUnitAST().getLineNumber(typeDeclaration.getStartPosition());
								// Só possui uma declacarão pois o compilationUnit só possui um resource
								IType iType = typeDeclarationResource.getResource().getCompilationUnitType().getTypes()[0];
								if (iType == null)
									continue;
								ITypeHierarchy typeHierarchy = iType.newSupertypeHierarchy(new NullProgressMonitor());
								IType[] iTypes = typeHierarchy.getAllSupertypes(iType);
								for (IType superType : iTypes) {
									Set<ASMLResource> resourcesB = componentB.getResources();
									for (ASMLResource asmlResource : resourcesB) {
										IType iTypeB = asmlResource.getCompilationUnitType().getTypes()[0];
										String name = iTypeB.getFullyQualifiedName();
										boolean equals = superType.getFullyQualifiedName().equals(name);
										if (equals) {
											extend = true;
											break externalfor;
										}
									}
								}
							}
						}

					}
				}
				if (!extend) {
					String defaultMessage = "Classes do tipo  " + componentA.getName() + " devem herdar da classe " + componentB.getName();
					addViolation(restriction, componentA, componentB, lineNumber, iResourceClasses, defaultMessage);
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}
}
