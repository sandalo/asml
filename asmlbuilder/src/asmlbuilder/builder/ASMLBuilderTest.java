package asmlbuilder.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.ui.wizards.JavaCapabilityConfigurationPage;

class BuilderTest implements IApplication {


	@Override
	public Object start(IApplicationContext arg0) throws Exception {
		try {
			final String string = "C:\\eclipse-luna\\runtime-EclipseApplication\\sistema2\\.project";
			ASMLBuilder builder = new ASMLBuilder();
			final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IPath projectDotProjectFile = new Path(string);
			IProjectDescription projectDescription = workspace.loadProjectDescription(projectDotProjectFile);
			IProject project = workspace.getRoot().getProject(projectDescription.getName());
			JavaCapabilityConfigurationPage.createProject(project, projectDescription.getLocationURI(), null);
			// project.create(null);
			System.out.println(project);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}