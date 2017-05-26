package de.cooperateproject.ui.nature;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;

/**
 * Handler which provides logic for deleting all selected projects with CooperateProjectNature from the workspace and
 * repository.
 * 
 * @author persch
 *
 */
public class DeleteProjectFromRepositoryCommand extends AbstractHandler {

    private static final Logger LOGGER = Logger.getLogger(DeleteProjectFromRepositoryCommand.class);
    private static final String ERRMSG = "Could not delete project ";
    private boolean confirmation = false;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (!getSelectedProjects().isEmpty()) {

            showDialog();
            if (!confirmation) {
                return null;
            }
            for (IProject project : getSelectedProjects()) {
                if (!deleteProject(project)) {
                    LOGGER.error(ERRMSG + project.getName() + ".");
                }
            }
        }
        return null;
    }

    private static boolean deleteProject(IProject project) {
        try {
            if (project.hasNature(CooperateProjectNature.NATURE_ID) && deleteProjectFromRepository(project)) {
                return deleteProjectFromWorkspace(project);
            }
        } catch (CoreException e) {
            LOGGER.error("Can't access project " + project.getName() + ". Please make sure the project is opened.", e);
        }
        return false;
    }

    private static boolean deleteProjectFromRepository(IProject project) {
        CDOSession session = null;
        try {
            session = CDOConnectionManager.getInstance().acquireSession(project);
            CDOTransaction transaction = session.openTransaction();
            CDOResourceFolder resource = transaction.getResourceFolder(project.getName());
            if (resource == null) {
                LOGGER.error("Project " + project + " doesn't exist in repository.");
                return false;
            }
            EcoreUtil.delete(resource);
            try {
                transaction.commit();
            } catch (ConcurrentAccessException e) {
                LOGGER.error(ERRMSG + project.getName() + " from repository.", e);
                return false;
            } catch (CommitException e) {
                LOGGER.error(ERRMSG + project.getName() + " from repository.", e);
                return false;
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
        return true;
    }

    private static boolean deleteProjectFromWorkspace(IProject project) {
        try {
            ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).delete(true, true,
                    new NullProgressMonitor());
        } catch (CoreException e) {
            LOGGER.error(ERRMSG + project.getName() + " from workspace.", e);
            return false;
        }
        return true;
    }

    private static List<IProject> getSelectedProjects() {
        List<IProject> projectList = new LinkedList<>();
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null) {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            for (int i = 0; i < selection.size(); i++) {
                if (selection.toList().get(i) instanceof IAdaptable) {
                    projectList.add((IProject) ((IAdaptable) selection.toList().get(i)).getAdapter(IProject.class));
                }
            }
        }
        return projectList;
    }

    private void showDialog() {
        PlatformUI.getWorkbench().getDisplay()
                .syncExec(() -> confirmation = MessageDialog.openConfirm(
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Delete Resources",
                        "Are you sure you want to remove the selected resources from the workspace and repository?"
                                + " This cannot be undone."));
    }

}
