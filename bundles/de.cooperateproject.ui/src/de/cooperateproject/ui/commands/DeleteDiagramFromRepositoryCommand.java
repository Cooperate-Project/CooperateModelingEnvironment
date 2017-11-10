package de.cooperateproject.ui.commands;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;
import de.cooperateproject.ui.util.LockStateInfo;

/**
 * Command for deleting a diagram from a repository. This deletes all resources associated with the diagram except for
 * elements in the UML model.
 */
public class DeleteDiagramFromRepositoryCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteDiagramFromRepositoryCommand.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Collection<IFile> selectedLaunchers = getSelectedLaunchers();
        if (!selectedLaunchers.isEmpty()) {

            if (!checkIfNotLocked(selectedLaunchers)) {
                MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                        "Resources currently in use.",
                        "One of the resources to be deleted is currently used by another user.");
                return null;
            }

            if (!confirmDelete()) {
                return null;
            }

            for (IFile launcher : selectedLaunchers) {
                if (!delete(launcher)) {
                    LOGGER.error("Could not delete diagram {}.", launcher.getName());
                }
            }
        }
        return null;
    }

    private static boolean delete(IFile launcher) {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(launcher.getProject());
        try {
            CDOTransaction transaction = session.openTransaction();
            try {
                if (delete(launcher, transaction)) {
                    transaction.commit();
                    return true;
                }
                return false;
            } catch (CommitException e) {
                LOGGER.error("Could not commit changes.", e);
                return false;
            } finally {
                IOUtil.closeSilent(transaction);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
    }

    private static boolean delete(IFile launcher, CDOTransaction transaction) {
        Diagram launcherModel;
        try {
            launcherModel = LauncherModelHelper.loadDiagram(transaction.getResourceSet(), launcher);
        } catch (IOException e) {
            LOGGER.error("Could not read launcher file {}.", launcher.getName(), e);
            return false;
        }

        try {
            TextualConcreteSyntaxModel textualModel = launcherModel
                    .getConcreteSyntaxModel(TextualConcreteSyntaxModel.class);
            delete(textualModel);
        } catch (ConcreteSyntaxTypeNotAvailableException e) {
            LOGGER.warn("Could not find textual concrete syntax model.", e);
        }

        launcherModel.getConcreteSyntaxModels().stream().filter(s -> s.getRootElement().eResource() != null)
                .map(ConcreteSyntaxModel::getRootElement).forEach(DeleteDiagramFromRepositoryCommand::delete);
        return true;
    }

    private static void delete(TextualConcreteSyntaxModel textualModel) {
        CDOResource textualResource = (CDOResource) textualModel.getRootElement().eResource();
        Collection<CDOResourceNode> nodesToDelete = textualResource.getFolder().getNodes().stream()
                .filter(n -> n.getName().contains(textualResource.getURI().lastSegment())).collect(Collectors.toList());
        deleteSilent(nodesToDelete);
    }

    private static void delete(EObject rootElement) {
        Resource r = rootElement.eResource();
        EcoreUtil.delete(rootElement);
        if (r.getContents().isEmpty() && r instanceof CDOResource) {
            Collection<CDOResourceNode> resourcesToDelete = Optional.of((CDOResource) r).map(CDOResource::getFolder)
                    .map(CDOResourceFolder::getNodes).map(Collection::stream)
                    .map(s -> s.filter(n -> n.getURI().trimFileExtension().lastSegment()
                            .equals(r.getURI().trimFileExtension().lastSegment())).collect(Collectors.toList()))
                    .orElse(Collections.emptyList());
            deleteSilent(resourcesToDelete);
        }
    }

    private static void deleteSilent(Iterable<CDOResourceNode> nodes) {
        for (CDOResourceNode resourceToDelete : nodes) {
            try {
                resourceToDelete.delete(Collections.emptyMap());
            } catch (IOException e) {
                LOGGER.error("Could not delete {}", resourceToDelete.getName(), e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static Collection<IFile> getSelectedLaunchers() {
        return Optional.ofNullable(PlatformUI.getWorkbench()).map(IWorkbench::getActiveWorkbenchWindow)
                .map(IWorkbenchWindow::getSelectionService).map(ISelectionService::getSelection)
                .filter(IStructuredSelection.class::isInstance).map(IStructuredSelection.class::cast)
                .map(IStructuredSelection::toList).map(Collection::stream)
                .map(s -> s.filter(IFile.class::isInstance).map(IFile.class::cast)
                        .filter(f -> LauncherModelHelper.FILE_EXTENSION.equals(((IFile) f).getFileExtension()))
                        .filter(f -> CDOConnectionManager.getInstance().getProjects()
                                .contains(((IResource) f).getProject()))
                        .collect(Collectors.toList()))
                .map(l -> (Collection<IFile>) l).orElse(Collections.emptyList());
    }

    private static boolean checkIfNotLocked(Collection<IFile> selectedLaunchers) {
        for (IFile file : selectedLaunchers) {
            try {
                if (LockStateInfo.isReadOnlyRequired(file)) {
                    return false;
                }
            } catch (IOException | ConcreteSyntaxTypeNotAvailableException e) {
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
