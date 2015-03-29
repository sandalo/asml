package asmlbuilder.classpath_util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ClassPathUtil {
	private static final Logger log = Logger.getLogger(ClassPathUtil.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public static String recuperaPathVaccine(IJavaProject javaProject) {
		IClasspathEntry iClasspathEntryVaccine;
		try {
			iClasspathEntryVaccine = ClassPathUtil.recuperaClassPathDaVaccina(javaProject);
			String path_vaccine_in_open_project;
			if (iClasspathEntryVaccine.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				path_vaccine_in_open_project = "jar:file:/" + iClasspathEntryVaccine.getPath() + "!" + "/vaccine.asml";
			} else {
				String workspacePath = javaProject.getProject().getPathVariableManager().getValue("WORKSPACE_LOC").toString();
				path_vaccine_in_open_project = "file:/" + workspacePath + iClasspathEntryVaccine.getPath() + "/src/main/resources/" + "vaccine.asml";
			}
			return path_vaccine_in_open_project;
		} catch (JavaModelException e) {
			String string = "Não achou o path da vaccina";
			log.log(Level.SEVERE,string,e);
			throw new RuntimeException(string);
		}
	}
	
	public static IClasspathEntry recuperaClassPathDaVaccina(IJavaProject javaProject) throws JavaModelException {
		IClasspathContainer classpathMavenContainer = recuperaMavenContainerClassPath(javaProject);
		if (classpathMavenContainer == null) {
			log.info("Não encoutro o classPathContainer Maven.");
			return null;
		}
		IClasspathEntry[] classpathEntryMaven = classpathMavenContainer.getClasspathEntries();
		log.info("Começa a varredura para encontrar iClasspathEntry de vaccine...");
		for (IClasspathEntry iClasspathEntry : classpathEntryMaven) {
			log.info("Encontrou " + iClasspathEntry.getPath().toString());
			IClasspathAttribute attributes[] = iClasspathEntry.getExtraAttributes();
			for (IClasspathAttribute iClasspathAttribute : attributes) {
				if (iClasspathAttribute.getValue().contains("vaccine")) {
					log.info("Encontrou jar ou porjeto maven da vaccine...:" + iClasspathEntry.getPath().toString());
					return iClasspathEntry;
				}
			}
		}
		log.info("Não encontrou iClasspathEntry");
		return null;
	}
	
	public static IClasspathContainer recuperaMavenContainerClassPath(IJavaProject javaProject) throws JavaModelException {
/*		if (asmlContext != null && asmlContext.getClasspathMavenContainer() != null)
			return asmlContext.getClasspathMavenContainer();
*/		IClasspathEntry[] rawClasspath = javaProject.getRawClasspath();
		log.info("rawClasspath encontrados: " + rawClasspath + " size:" + rawClasspath.length);
		IClasspathEntry iClasspathEntryMAVEN = null;
		for (IClasspathEntry iClasspathEntry : rawClasspath) {
			log.info("   encontrou a entrada:" + iClasspathEntry.getPath() + " EntryKind:" + iClasspathEntry.getEntryKind() + " no classpath.");
			if (iClasspathEntry.getPath().toString().contains("MAVEN")) {
				iClasspathEntryMAVEN = iClasspathEntry;
				log.info("      vai recuperar o classpathContainer no path: " + iClasspathEntryMAVEN.getPath() + " size:" + rawClasspath.length);
				IClasspathContainer classpathMavenContainer = JavaCore.getClasspathContainer(iClasspathEntryMAVEN.getPath(), javaProject);
				log.info("       Recuperou o classpathContainer MAVEN");
/*				if (asmlContext != null)
					asmlContext.setClasspathMavenContainer(classpathMavenContainer);
*/				return classpathMavenContainer;
			}
		}
		return null;
	}


}
