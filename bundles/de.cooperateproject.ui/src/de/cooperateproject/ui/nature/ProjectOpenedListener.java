package de.cooperateproject.ui.nature;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cooperateproject.cdo.util.connection.CDOConnectionSettings;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class ProjectOpenedListener implements IResourceChangeListener {

	private static final Logger LOGGER = Logger.getLogger(ProjectOpenedListener.class);

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if (event == null || event.getDelta() == null) {
			return;
		}
		try {
			event.getDelta().accept(new IResourceDeltaVisitor() {
				public boolean visit(final IResourceDelta delta) throws CoreException {
					IResource resource = delta.getResource();
					if ((resource.getType() & IResource.PROJECT) != 0) {
						if (delta.getKind() == IResourceDelta.CHANGED
								&& ((delta.getFlags() & IResourceDelta.OPEN) != 0)) {
							IProject project = (IProject) resource;
							Job rebuild = new Job("rebuild") {
								@Override
								protected IStatus run(IProgressMonitor monitor) {
									try {
										project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
									} catch (CoreException e) {
										LOGGER.error("Exception during rebuild after opening or closing of a project", e);
										return Status.CANCEL_STATUS;
									}
									return Status.OK_STATUS;
								}
							};
							rebuild.schedule();
						}
						return false;
					}

					return true;
				}
			});
		} catch (CoreException e) {
			LOGGER.error("Exception during rebuild after opening or closing of a project", e);
		}
	}

}
