package de.cooperateproject.ui.commands;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.nature.CooperateProjectNature;
import de.cooperateproject.ui.util.LockStateInfo;

/**
 * Handler which provides logic for deleting all selected projects with CooperateProjectNature from the workspace and
 * repository.
 * 
 * @author persch
 *
 */
public class DeleteProjectFromRepositoryCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteProjectFromRepositoryCommand.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        List<IProject> selectedProjects = getSelectedProjects();
        if (!selectedProjects.isEmpty()) {
            if (!checkIfNotLocked(selectedProjects)) {
                MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                        "Resources currently in use.",
                        "One of the resources to be deleted is currently used by another user.");
                return null;
            }
            if (!confirmDelete()) {
                return null;
            }
            for (IProject project : selectedProjects) {
                if (!deleteProject(project)) {
                    LOGGER.error("Could not delete project {}.", project.getName());
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
            LOGGER.error("Can't access project {}. Please make sure the project is opened.", project.getName(), e);
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
                LOGGER.error("Project {} doesn't exist in repository.", project);
                return false;
            }
            EcoreUtil.delete(resource);
            try {
                transaction.commit();
            } catch (CommitException e) {
                LOGGER.error("Could not delete project {} from repository.", project.getName(), e);
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
            LOGGER.error("Could not delete project {} from workspace.", project.getName(), e);
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
                if (selection.toList().get(i) instanceof IProject) {
                    projectList.add((IProject) selection.toList().get(i));
                }
            }
        }
        return projectList;
    }

    private static boolean checkIfNotLocked(List<IProject> selectedProjects) {
        for (IProject project : selectedProjects) {
            try {
                for (IResource file : project.getFolder("models").members()) {
                    if (file instanceof IFile && LockStateInfo.isReadOnlyRequired((IFile) file)) {
                        return false;
                    }
                }
            } catch (CoreException | IOException | ConcreteSyntaxTypeNotAvailableException e) {
                LOGGER.warn("Error while checking preconditions.", e);
            }

        }
        return true;
    }

    private static boolean confirmDelete() {
        AtomicReference<Boolean> reference = new AtomicReference<>(false);
        PlatformUI.getWorkbench().getDisplay()
                .syncExec(() -> reference.set(MessageDialog.openConfirm(
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Delete Resources",
                        "Are you sure you want to remove the selected resources from the workspace and repository?"
                                + " This cannot be undone.")));
        return reference.get();
    }

}
