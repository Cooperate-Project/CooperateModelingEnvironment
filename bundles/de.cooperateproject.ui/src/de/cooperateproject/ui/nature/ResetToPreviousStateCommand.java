package de.cooperateproject.ui.nature;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.ui.wizards.reset.ResetRepositoryWizard;

public class ResetToPreviousStateCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResetToPreviousStateCommand.class);
    protected static final String DEFAULT_CHARSET_NAME = "UTF-8";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Optional<IProject> project = getSelectedProject();
        if (project.isPresent()) {
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(project.get()));
            dialog.open();
        } else if (getSelectedDiagram().isPresent()) {
            IFile file = getSelectedDiagram().get();
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(file));
            dialog.open();
        }
        return null;
    }

    public static boolean resetProject(CDOSession session, CDOCommitInfo commit, IProject project) {
        CDOBranch branch = session.getBranchManager().getMainBranch();
        return resetProject(session, commit, project, branch);
    }

    private static boolean resetProject(CDOSession session, CDOCommitInfo commit, IProject project, CDOBranch branch) {
        CDOView historicView = session.openView(commit.getTimeStamp());
        try {
            CDOTransaction transaction = session.openTransaction(branch);
            try {
                DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
                transaction.setCommitComment("Reset to previous commit (" + df.format(new Date(commit.getTimeStamp()))
                        + ") by " + System.getProperty("user.name") + ".");
                resetProject(historicView, transaction, project.getName());
                transaction.commit();
                project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
                return true;
            } catch (ConcurrentAccessException e) {
                LOGGER.error("Could not reset repository.", e);
            } catch (CommitException e) {
                LOGGER.error("Could not reset repository.", e);
            } catch (CoreException e) {
                LOGGER.error("Could not refresh workspace. Please refresh manually.", e);
            } catch (IOException e) {
                LOGGER.error("Could not save all resources.", e);
            } finally {
                IOUtil.closeSilent(transaction);
            }
        } finally {
            IOUtil.closeSilent(historicView);
        }
        return false;
    }

    private static void resetProject(CDOView historicView, CDOTransaction transaction, String folderName)
            throws IOException {
        // recreate folder
        Optional.ofNullable(transaction.getResourceFolder(folderName)).ifPresent(f -> {
            try {
                f.delete(Collections.emptyMap());
            } catch (IOException e) {
                LOGGER.warn("Could not delete folder {}", folderName, e);
            }
        });
        transaction.createResourceFolder(folderName);

        // configure resource sets
        ResourceSet historicRS = historicView.getResourceSet();
        ResourceSet currentRS = transaction.getResourceSet();
        historicRS.setResourceFactoryRegistry(
                CDOResourceHandler.createFactoryWrapper(historicRS.getResourceFactoryRegistry()));
        currentRS.setResourceFactoryRegistry(
                CDOResourceHandler.createFactoryWrapper(currentRS.getResourceFactoryRegistry()));

        // copy resource nodes
        CDOResourceFolder historicResourceFolder = historicView.getResourceFolder(folderName);
        Copier copier = new Copier(true);
        for (CDOResourceNode historicNode : historicResourceFolder.getNodes()) {
            Optional.ofNullable(historicNode.getURI()).map(uri -> historicRS.getResource(uri, true))
                    .ifPresent(r -> createModelResource(copier, currentRS, r));
        }
        copier.copyReferences();

        // save changes to resources (required to textual resources)
        for (Resource r : currentRS.getResources()) {
            r.save(Collections.emptyMap());
        }
    }

    private static Copier createModelResource(Copier copier, ResourceSet currentResourceSet,
            Resource historicResource) {
        Resource newResource = currentResourceSet.createResource(historicResource.getURI());
        newResource.getContents().addAll(copier.copyAll(historicResource.getContents()));
        return copier;
    }

    private static Optional<IProject> getSelectedProject() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IProject project = null;
        if (window != null) {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            if (selection.size() == 1 && selection.toList().get(0) instanceof IProject) {
                project = (IProject) selection.toList().get(0);
            }
        }
        return Optional.ofNullable(project);
    }

    private static Optional<IFile> getSelectedDiagram() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IFile file = null;
        if (window != null) {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            if (selection.size() == 1 && selection.toList().get(0) instanceof IFile) {
                file = (IFile) selection.toList().get(0);
            }
        }
        return Optional.ofNullable(file);
    }

}
