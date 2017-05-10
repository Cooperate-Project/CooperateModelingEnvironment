package de.cooperateproject.ui.nature;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler which provides logic for adding the CooperateProjectNature to a project.
 * 
 * @author seifermann, persch
 *
 */
public class AddProjectNatureCommand extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
        if (currentSelection instanceof IStructuredSelection) {

            Object firstElement = ((IStructuredSelection) currentSelection).getFirstElement();
            IAdapterManager adapterManager = Platform.getAdapterManager();
            IResource resourceAdapter = adapterManager.getAdapter(firstElement, IResource.class);

            if (resourceAdapter != null) {
                IResource resource = resourceAdapter;
                IProject project = resource.getProject();
                try {
                    NatureUtils.addNatureToProject(project, CooperateProjectNature.NATURE_ID);
                } catch (CoreException e) {
                    throw new ExecutionException(e.getMessage(), e);
                }

                try {
                    project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
                    return Status.OK_STATUS;
                } catch (CoreException e) {
                    throw new ExecutionException(e.getMessage(), e);
                }
            }
        }

        return Status.OK_STATUS;
    }

}
