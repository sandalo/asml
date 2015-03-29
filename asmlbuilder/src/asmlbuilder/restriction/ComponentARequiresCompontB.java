package asmlbuilder.restriction;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import asmlbuilder.matching.FileMatching;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.File;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public class ComponentARequiresCompontB extends RestricionChecker {

	public ComponentARequiresCompontB(ASMLContext asmlContext) {
		super(asmlContext);
	}

	@Override
	public void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		if ((restriction.getGroupClause().equals(GroupClause.NULL)||(restriction.getGroupClause().equals(GroupClause.ANY)))
		&& (restriction.getPermissionClause().equals(PermissionClause.NULL)||restriction.getPermissionClause().equals(PermissionClause.MUST)) 
		&& restriction.getRelactionType().equals(RelactionType.REQUIRES)) {
			anyComponentAMustRequiresCompontB(restriction, componentA, componentB);
		}
	}

	private void anyComponentAMustRequiresCompontB(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB) {
		Set<ASMLResource> instances = asmlContext.getInstancesByComponent(componentA);
		for (ASMLResource iResource : instances) {
			boolean found = false;
			if (componentB instanceof MetaClass && componentA instanceof MetaClass) {
				MetaClass classeB = (MetaClass) componentB;
				MetaClass classeA = (MetaClass) componentA;
				AbstractNameConvetion matchingA = classeA.getMatching();
				Set<MetaClass> subClasses = new HashSet<MetaClass>();
				Set<MetaClass> set = asmlContext.getSublMetaClasses().get(classeB);
				if (set != null)
					subClasses.addAll(set);
				subClasses.add(classeB);
				for (MetaClass metaClass : subClasses) {
					if (metaClass.getMatching() instanceof ClassMatching && matchingA instanceof ClassMatching) {
						ClassMatching classMatchigA = (ClassMatching) matchingA;
						ClassMatching classMatchigB = (ClassMatching) metaClass.getMatching();
						String resourcetName = iResource.getResource().getName();
						if (classMatchigB.getExpressionMatching().equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
							resourcetName = FileMatching.extractResourceNameIndexed(iResource.getResource());
							resourcetName = resourcetName.replaceAll(classMatchigA.getParameter(), classMatchigB.getParameter());
							if (asmlContext.existInstancesOfComponentWithName(resourcetName, metaClass.getName())) {
								found = true;
								break;
							}
						}
					}
				}
				if (!found) {
					String message = "Todo componente " + componentA.getName() + "  depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName() + ": " + classeA.getDescription() + ". " + "Descrição do componente " + classeB.getName() + ": " + classeB.getDescription() + ".";
					asmlContext.getViolations().add(new Violation(iResource.getResource(), message, 1, IMarker.SEVERITY_ERROR));
				}
			}
			if (componentB instanceof MetaClass && componentA instanceof File) {
				MetaClass classeB = (MetaClass) componentB;
				File classeA = (File) componentA;
				AbstractNameConvetion matchingB = classeB.getMatching();
				AbstractNameConvetion matchingA = classeA.getMatching();
				if (matchingB instanceof ClassMatching && matchingA instanceof ClassMatching) {
					ClassMatching classMatchigB = (ClassMatching) matchingB;
					ClassMatching classMatchigA = (ClassMatching) matchingA;
					String resourcetName = iResource.getResource().getName();
					if (classMatchigB.getExpressionMatching().equals(ExpressionMatchingClause.NAME_ENDS_WITH)) {
						resourcetName = FileMatching.extractResourceNameIndexed(iResource.getResource());
						resourcetName = resourcetName.replaceAll(classMatchigA.getParameter(), classMatchigB.getParameter());
						if (!asmlContext.existInstancesOfComponentWithName(resourcetName, componentB.getName())) {
							String message = "Todo componente " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName() + ": " + "Implmentar descrição" + ". " + "Descrição do componente " + classeB.getName() + ": " + classeB.getDescription() + ".";
							asmlContext.getViolations().add(new Violation(iResource.getResource(), message, 1, IMarker.SEVERITY_ERROR));
						}
					}
				}
			}
			if (componentB instanceof MetaClass && componentA instanceof MetaModule) {
				MetaClass classeB = (MetaClass) componentB;
				MetaModule classeA = (MetaModule) componentA;
				Set<MetaClass> subClasses = new HashSet<MetaClass>();
				Set<MetaClass> set = asmlContext.getSublMetaClasses().get(classeB);
				if (set != null)
					subClasses.addAll(set);
				subClasses.add(classeB);
				for (MetaClass metaClass : subClasses) {
					if (metaClass.getMatching() instanceof ClassMatching) {
						ClassMatching classMatchigB = (ClassMatching) metaClass.getMatching();
						String resourcetName = iResource.getResource().getName();
						resourcetName = FileMatching.extractResourceNameIndexed(iResource.getResource());
						resourcetName = resourcetName + classMatchigB.getParameter();
						if (asmlContext.existInstancesOfComponentWithName(resourcetName, metaClass.getName())) {
							found = true;
							break;
						}
					}
				}
				if (!found) {
					String message = "Todo componente  " + componentA.getName() + " depende da existência de um componente " + componentB.getName() + " de mesmo nome. Descrição do componente " + classeA.getName();
					asmlContext.getViolations().add(new Violation(iResource.getResource(), message, 1, IMarker.SEVERITY_ERROR));
				}
			}
		}
	}
}
