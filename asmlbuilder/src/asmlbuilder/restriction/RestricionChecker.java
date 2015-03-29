package asmlbuilder.restriction;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

import asmlbuilder.builder.ASMLContext;
import asmlbuilder.builder.Violation;
import br.ufmg.dcc.asml.ASMLResource;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Restriction;

public abstract class RestricionChecker {
	protected ASMLContext asmlContext;

	public RestricionChecker(ASMLContext asmlContext) {
		this.asmlContext = asmlContext;
	}

	public abstract void checker(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB);

	public static IType getType(IResource resource, ASMLContext asmlContext) {
		IType iType = null;
		try {
			IJavaProject javaProject = asmlContext.getJavaProject();
			IClasspathEntry[] classpathEntries = javaProject.getRawClasspath();
			String logicalName = " ";
			for (IClasspathEntry iClasspathEntry : classpathEntries) {
				if (iClasspathEntry.getPath().isPrefixOf(resource.getFullPath())) {
					logicalName = resource.getFullPath().toString().replace(iClasspathEntry.getPath().toString(), "");
					break;
				}
			}
			logicalName = logicalName.substring(1).replace("/", ".").replace(".java", "");

			iType = javaProject.findType(logicalName);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return iType;
	}

	protected void addViolation(Restriction restriction, AbstractComponent componentA, AbstractComponent componentB, int lineNumber, ASMLResource asmlResource, String defaultMessage) {
		if (restriction.getDescription() != null)
			defaultMessage = restriction.getDescription();
		asmlContext.getViolations().add(new Violation(asmlResource.getResource(), defaultMessage, lineNumber, IMarker.SEVERITY_ERROR));
	}

}
