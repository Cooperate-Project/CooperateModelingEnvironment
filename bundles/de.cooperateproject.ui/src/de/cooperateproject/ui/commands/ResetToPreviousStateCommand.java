package de.cooperateproject.ui.commands;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.merger.CustomCDOMerger;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.IDiagramType;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;
import de.cooperateproject.ui.util.LockStateInfo;
import de.cooperateproject.ui.wizards.reset.ResetRepositoryWizard;

public class ResetToPreviousStateCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResetToPreviousStateCommand.class);
    protected static final String DEFAULT_CHARSET_NAME = "UTF-8";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Optional<IProject> project = getSelectedProject();
        if (project.isPresent()) {
            if (!checkIfProjectNotLocked(project.get())) {
                MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                        "Resources currently in use.",
                        "One of the resources to be reset is currently used by another user.");
                return null;
            }
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(project.get()));
            dialog.open();
        } else if (getSelectedDiagram().isPresent()) {
            IFile file = getSelectedDiagram().get();
            if (!checkIfDiagramNotLocked(file)) {
                MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                        "Resources currently in use.",
                        "One of the resources to be reset is currently used by another user.");
                return null;
            }
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(file));
            dialog.open();
        }
        return null;
    }

    public static boolean reset(CDOSession session, CDOCommitInfo commit, IResource resource) {
        CDOBranch mainBranch = session.getBranchManager().getMainBranch();
        CDOBranch branch = mainBranch.createBranch("revert_" + System.currentTimeMillis());
        boolean result = reset(session, commit, resource, branch);
        if (result) {
            CDOTransaction mergeTransaction = session.openTransaction(mainBranch);
            try {
                String changedObjectLabel = getLabelFor(resource);
                DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
                String commitComment = String.format("Reset of %s to previous commit (%s) by %s.", changedObjectLabel,
                        df.format(new Date(commit.getTimeStamp())), System.getProperty("user.name"));
                mergeTransaction.setCommitComment(commitComment);
                mergeTransaction.merge(branch, new CustomCDOMerger());
                try {
                    mergeTransaction.commit();
                } catch (CommitException e) {
                    LOGGER.error("Merge commit of reverted changes failed.", e);
                    return false;
                }
            } finally {
                IOUtil.closeSilent(mergeTransaction);
            }
        }
        return result;
    }

    private static boolean reset(CDOSession session, CDOCommitInfo commit, IResource resource, CDOBranch branch) {
        CDOView historicView = session.openView(commit.getTimeStamp());
        try {
            CDOTransaction transaction = session.openTransaction(branch);
            try {
                reset(historicView, transaction, resource);
                transaction.commit();
                return true;
            } catch (ConcurrentAccessException e) {
                LOGGER.error("Could not reset repository.", e);
            } catch (CommitException e) {
                LOGGER.error("Could not reset repository.", e);
            } catch (IOException e) {
                LOGGER.error("Could not load/save all resources.", e);
            } catch (ConcreteSyntaxTypeNotAvailableException e) {
                LOGGER.error("The selected launcher file does not contain a graphical model reference.", e);
            } finally {
                IOUtil.closeSilent(transaction);
            }
        } finally {
            IOUtil.closeSilent(historicView);
        }
        return false;
    }

    private static String getLabelFor(IResource resource) {
        return Optional.ofNullable(resource.getAdapter(IProject.class)).map(IResource::getName)
                .map(name -> "project " + name).orElse(Optional.ofNullable(resource.getAdapter(IFile.class))
                        .map(IResource::getName).map(name -> "model " + name).orElse(null));
    }

    private static void reset(CDOView historicView, CDOTransaction transaction, IResource resource)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        // configure resource sets
        ResourceSet historicRS = historicView.getResourceSet();
        ResourceSet currentRS = transaction.getResourceSet();
        historicRS.setResourceFactoryRegistry(
                CDOResourceHandler.createFactoryWrapper(historicRS.getResourceFactoryRegistry()));
        currentRS.setResourceFactoryRegistry(
                CDOResourceHandler.createFactoryWrapper(currentRS.getResourceFactoryRegistry()));

        // determine resources to reset
        Collection<URI> relevantUris;
        if (resource instanceof IFile) {
            relevantUris = findRelevantURIs(transaction, (IFile) resource);
        } else if (resource instanceof IProject) {
            relevantUris = findRelevantURIs(transaction, (IProject) resource);
        } else {
            throw new IllegalArgumentException("The selected resource is neither a project nor a file.");
        }

        reset(historicView, transaction, relevantUris);
    }

    private static Collection<URI> findRelevantURIs(CDOTransaction transaction, IProject project) {
        CDOResourceFolder folder = transaction.getResourceFolder(project.getName());
        return folder.getNodes().stream().map(CDOResourceNode::getURI).collect(Collectors.toList());
    }

    private static Collection<URI> findRelevantURIs(CDOTransaction transaction, IFile file)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        Collection<URI> relevantUris = new HashSet<>();
        ResourceSet currentRS = transaction.getResourceSet();
        Diagram launcherModel = LauncherModelHelper.loadDiagram(currentRS, file);
        GraphicalConcreteSyntaxModel csModel = launcherModel.getConcreteSyntaxModel(GraphicalConcreteSyntaxModel.class);
        URI graphicalResourceUri = csModel.getRootElement().eResource().getURI();
        relevantUris.add(graphicalResourceUri);
        relevantUris.add(ModelNamingConventions.getUMLFromGraphicalURI(graphicalResourceUri));
        relevantUris.add(ModelNamingConventions.getDiFromGraphicalURI(graphicalResourceUri));

        for (org.eclipse.gmf.runtime.notation.Diagram graphicalDiagram : csModel.getRootElement().eResource()
                .getContents().stream().filter(org.eclipse.gmf.runtime.notation.Diagram.class::isInstance)
                .map(org.eclipse.gmf.runtime.notation.Diagram.class::cast).collect(Collectors.toList())) {
            URI graphicalURI = graphicalDiagram.eResource().getURI()
                    .appendFragment(graphicalDiagram.eResource().getURIFragment(graphicalDiagram));
            String diagramName = graphicalDiagram.getName();

            Optional<String> textualFileExtension = DiagramTypeRegistry.getInstance()
                    .getByNotationDiagramType(graphicalDiagram.getType()).map(IDiagramType::getTextualFileExtension);
            if (!textualFileExtension.isPresent()) {
                continue;
            }
            URI textualUri = ModelNamingConventions.getTextualFromGraphicalURI(graphicalURI, diagramName,
                    textualFileExtension.get());
            String textualDiagramName = textualUri.lastSegment();
            String folderPath = textualUri.deresolve(transaction.getRootResource().getURI()).trimSegments(1).toString();
            CDOResourceFolder cdoFolder = transaction.getResourceFolder(folderPath);
            cdoFolder.getNodes().stream().filter(n -> n.getName().contains(textualDiagramName))
                    .map(CDOResourceNode::getURI).forEach(relevantUris::add);
        }

        Resource launcherModelResource = launcherModel.eResource();
        launcherModelResource.unload();
        transaction.getResourceSet().getResources().remove(launcherModelResource);

        return relevantUris;
    }

    private static void reset(CDOView historicView, CDOTransaction transaction, Collection<URI> relevantUris)
            throws IOException {

        Collection<URI> urisToCreate = relevantUris.stream().filter(u -> exists(u, historicView))
                .collect(Collectors.toList());
        ArrayList<URI> urisToDelete = new ArrayList<>(relevantUris);
        urisToDelete.removeAll(urisToCreate);

        // clear resources that shall be reseted
        URI rootUri = transaction.getRootResource().getURI();
        Collection<String> relevantPaths = urisToDelete.stream().map(u -> u.deresolve(rootUri)).map(URI::toString)
                .collect(Collectors.toList());
        relevantPaths.stream().map(transaction::getResourceNode).forEach(r -> {
            try {
                r.delete(Collections.emptyMap());
            } catch (IOException e) {
                LOGGER.warn("Could not delete resource node {}", r.getPath(), e);
            }
        });

        // recreate resources
        ResourceSet currentRS = transaction.getResourceSet();
        ResourceSet historicRS = historicView.getResourceSet();
        Copier copier = new Copier(true);
        for (URI uri : urisToCreate) {
            Optional.ofNullable(historicRS.getResource(uri, true))
                    .ifPresent(r -> createModelResource(copier, currentRS, r));
        }
        copier.copyReferences();

        // save changes to resources (required to textual resources)
        for (Resource r : currentRS.getResources()) {
            r.save(Collections.emptyMap());
        }
    }

    private static boolean returnsNonNull(Callable<Object> call) {
        try {
            return call.call() != null;
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean exists(URI uri, CDOView view) {
        URI baseUri = view.getRootResource().getURI().appendSegment("");
        URI pathUri = uri.deresolve(baseUri);
        String path = pathUri.toString();
        return returnsNonNull(() -> view.getResourceNode(path));
    }

    private static Copier createModelResource(Copier copier, ResourceSet currentResourceSet,
            Resource historicResource) {
        Resource newResource = currentResourceSet.getResource(historicResource.getURI(), true);
        newResource.getContents().clear();
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

    private static boolean checkIfProjectNotLocked(IProject project) {
        try {
            for (IResource file : project.getFolder("models").members()) {
                if (file instanceof IFile && LockStateInfo.isReadOnlyRequired((IFile) file)) {
                    return false;
                }
            }
        } catch (CoreException | IOException | ConcreteSyntaxTypeNotAvailableException e) {
            LOGGER.warn("Error while checking preconditions.", e);
        }

        return true;
    }

    private static boolean checkIfDiagramNotLocked(IFile file) {
        try {
            if (LockStateInfo.isReadOnlyRequired((IFile) file)) {
                return false;
            }

        } catch (IOException | ConcreteSyntaxTypeNotAvailableException e) {
            LOGGER.warn("Error while checking preconditions.", e);
        }

        return true;
    }

}
