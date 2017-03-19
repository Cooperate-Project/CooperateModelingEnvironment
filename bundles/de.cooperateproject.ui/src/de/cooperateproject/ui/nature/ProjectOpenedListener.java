package de.cooperateproject.ui.nature;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cooperateproject.ui.nature.tasks.BackgroundTasksAdapter;

public class ProjectOpenedListener implements IResourceChangeListener {

    private static final Logger LOGGER = Logger.getLogger(ProjectOpenedListener.class);

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (handleNullOrClosing(event)) {
            return;
        }
        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {
                public boolean visit(final IResourceDelta delta) throws CoreException {
                    if (isRelevantForClean(delta)) {
                        IProject project = (IProject) delta.getResource();
                        Job rebuild = new Job("rebuild") {
                            @Override
                            protected IStatus run(IProgressMonitor monitor) {
                                try {
                                    project.build(IncrementalProjectBuilder.CLEAN_BUILD, null);
                                } catch (CoreException e) {
                                    LOGGER.error("Exception during rebuild after opening of a project", e);
                                    return Status.CANCEL_STATUS;
                                }
                                return Status.OK_STATUS;
                            }
                        };
                        rebuild.schedule();
                    }

                    if (isRelevantForDelete(delta)) {
                        BackgroundTasksAdapter.getManager().deregisterProject((IProject) delta.getResource());
                    }

                    return true;
                }
            });
        } catch (CoreException e) {
            LOGGER.error("Exception during rebuild after opening or closing of a project", e);
        }
    }

    private static boolean isRelevantForClean(IResourceDelta delta) {
        if ((delta.getResource().getType() & IResource.PROJECT) == 0) {
            return false;
        }

        if (delta.getKind() == IResourceDelta.CHANGED && (delta.getFlags() & IResourceDelta.OPEN) != 0) {
            return true;
        }

        return false;
    }

    private static boolean isRelevantForDelete(IResourceDelta delta) {
        if ((delta.getResource().getType() & IResource.PROJECT) == 0) {
            return false;
        }

        if (delta.getKind() == IResourceDelta.REMOVED) {
            return true;
        }

        return false;
    }

    private boolean handleNullOrClosing(IResourceChangeEvent event) {
        if (event == null) {
            return true;
        } else if (event.getDelta() == null) {
            if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
                BackgroundTasksAdapter.getManager().deregisterProject((IProject) event.getResource());
            }
            return true;
        }
        return false;
    }
}
