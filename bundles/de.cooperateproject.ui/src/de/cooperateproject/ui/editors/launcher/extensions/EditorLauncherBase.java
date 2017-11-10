package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout.State;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckoutManager.CheckoutStateEvent;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.WorkbenchPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;
import de.cooperateproject.ui.editors.launcher.impl.CheckoutListenerManager;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.util.LockStateInfo;
import de.cooperateproject.ui.util.editor.UIThreadActionUtil;

/**
 * Base class for editor launchers that use CDO resources as inputs.
 * 
 * This class handles
 * <ul>
 * <li>the creation of CDO sessions and views</li>
 * <li>parsing of the selected launcher file</li>
 * <li>triggering of transformations on save events</li>
 * </ul>
 */
public abstract class EditorLauncherBase implements IEditorLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorLauncherBase.class);
    private final Collection<PropertyChangeHandlerBase> propertyChangeHandlers = new HashSet<PropertyChangeHandlerBase>();
    private final CDOCheckout cdoCheckout;
    private final CDOView cdoView;
    private final CDOTransaction cdoMainView;
    private final ConcreteSyntaxModel concreteSyntaxModel;
    private final IFile launcherFile;
    private final ITransformationManager transformationManager;
    private final boolean isReadOnly;
    private Optional<IPartListener2> disposeListener = Optional.empty();

    /**
     * Instantiates the editor launcher.
     * 
     * @param launcherFile
     *            The selected launcher file that contains the information about the diagram to open.
     * @param editorType
     *            The type of the selected editor.
     * @param readOnlyView
     *            True if the editor shall be opened read-only, false otherwise.
     * @throws IOException
     *             In case of an error while reading and interpreting the launcher file.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown, if the requested editor type is not available in the launcher file.
     */
    public EditorLauncherBase(IFile launcherFile, EditorType editorType)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        isReadOnly = LockStateInfo.isReadOnlyRequired(launcherFile);
        cdoCheckout = createCheckout(launcherFile.getProject(), isReadOnly);
        cdoView = cdoCheckout.openView(isReadOnly);
        cdoMainView = cdoView.getSession().openTransaction(cdoView.getBranch().getBranchManager().getMainBranch());
        ensureViewClosingOnCheckoutDelete(cdoCheckout, Arrays.asList(cdoView, cdoMainView));
        Diagram launcherModel = LockStateInfo.loadDiagram(cdoView, launcherFile);
        concreteSyntaxModel = launcherModel.getConcreteSyntaxModel(editorType.getSupportedSyntaxModel());
        Collection<URI> relevantURIs = Arrays.asList(LockStateInfo.determineUMLURI(launcherModel));
        doLockRelevantModels(cdoMainView, relevantURIs);
        transformationManager = createTransformationManager(cdoMainView, cdoView, relevantURIs);
        this.launcherFile = launcherFile;
    }

    @Override
    public IEditorPart openEditor() throws PartInitException {
        displayReadOnlyWarning();
        IEditorPart newEditorPart = doOpenEditor();
        registerListener(newEditorPart);
        addPropertyChangeHandler(createMergeHandler());
        addPropertyChangeHandler(createReloadHandler());
        return newEditorPart;
    }

    protected abstract IEditorPart doOpenEditor() throws PartInitException;

    protected CDOView getCDOView() {
        return cdoView;
    }

    protected boolean isReadOnly() {
        return isReadOnly;
    }

    protected CDOCheckout getCDOCheckout() {
        return cdoCheckout;
    }

    protected ConcreteSyntaxModel getConcreteSyntaxModel() {
        return concreteSyntaxModel;
    }

    protected IFile getLauncherFile() {
        return launcherFile;
    }

    protected void registerListener(IEditorPart editorPart) {
        Validate.notNull(editorPart);

        disposeListener = createDisposeListener(editorPart);
        disposeListener.ifPresent(editorPart.getSite().getPage()::addPartListener);

        Optional.of(editorPart).filter(WorkbenchPart.class::isInstance).map(WorkbenchPart.class::cast)
                .ifPresent(e -> e.addPartPropertyListener(this::propertyChanged));
    }

    private void propertyChanged(PropertyChangeEvent event) {
        propertyChangeHandlers.forEach(handler -> handler.propertyChange(event));
    }

    protected void addPropertyChangeHandler(PropertyChangeHandlerBase handler) {
        propertyChangeHandlers.add(handler);
    }

    private PropertyChangeHandlerBase createMergeHandler() {
        return new PropertyChangeHandlerBase(UIConstants.PART_PROPERTY_KEY_MERGE_REQUEST) {
            @Override
            protected void handleChange(IWorkbenchPart source, String oldValue, String newValue) {
                if (newValue != null) {
                    promptForCommit(source);
                }
            }
        };
    }

    private PropertyChangeHandlerBase createReloadHandler() {
        return new PropertyChangeHandlerBase(UIConstants.PART_PROPERTY_KEY_RELOAD_REQUEST) {
            @Override
            protected void handleChange(IWorkbenchPart source, String oldValue, String newValue) {
                if (!isReadOnly()) {
                    return;
                }
                cdoView.setTimeStamp(getCDOView().getBranch().getHead().getTimeStamp());
                reloadEditorContentAfterViewChange(source);
            }
        };
    }

    protected void reloadEditorContentAfterViewChange(IWorkbenchPart source) {

        return;
    }

    private void promptForCommit(IWorkbenchPart part) {
        if (!transformationManager.isMergeNecessary()) {
            return;
        }

        Shell shell = part.getSite().getShell();
        UIThreadActionUtil.perform(() -> promptForCommitInsideDisplayThread(shell));
    }

    private void promptForCommitInsideDisplayThread(Shell shell) {
        InputDialog dialog = new InputDialog(shell, "Commit Message", "Please enter a commit message.", "",
                EditorLauncherBase::isValidCommitMessage);
        dialog.setBlockOnOpen(true);
        if (dialog.open() != InputDialog.OK) {
            return;
        }
        String commitMessage = dialog.getValue();
        try {
            transformationManager.handleEditorMerge(commitMessage);
        } catch (CommitException e) {
            LOGGER.error("Failed to merge branch into master.", e);
            ErrorDialog.openError(shell, "Commit failed",
                    "The requested commit failed. "
                            + "The changes stay in the temporary branch but will not appear on the master branch.",
                    new Status(Status.ERROR, null, "Merging of branches failed.", e));
        }
    }

    private static String isValidCommitMessage(String string) {
        if (StringUtils.isBlank(string)) {
            return "The commit message must not be empty.";
        }
        return null;
    }

    protected Optional<IPartListener2> createDisposeListener(IEditorPart editorPart) {
        return Optional.of(new DisposedListener(editorPart, this::editorClosed));
    }

    protected void editorClosed(IWorkbenchPage p) {
        Validate.notNull(p);

        promptForCommit(p.getActivePart());

        disposeListener.ifPresent(p::removePartListener);
        disposeListener = Optional.empty();

        IOUtil.closeSilent(cdoMainView);
        IOUtil.closeSilent(cdoView);

        cdoCheckout.close();
        CDOConnectionManager.getInstance().deleteCDOCheckout(cdoCheckout);
    }

    protected void handleEditorSave(IEditorPart editorPart) {
        Validate.notNull(editorPart);

        try {
            transformationManager.handleEditorSave(editorPart.getEditorInput());
        } catch (TransformationException e) {
            LOGGER.error("Failed to handle editor save event.", e);
            UIThreadActionUtil.perform(() -> ErrorDialog.openError(editorPart.getEditorSite().getShell(), "Save failed",
                    "The requested save failed because the transformation to other representations failed.",
                    new Status(Status.ERROR, null, "Transformation of changes failed.", e)));
        }
    }

    protected static LauncherModelWrapper loadLauncherModelReadOnly(IFile launcherFile) throws IOException {
        return new LauncherModelWrapper(launcherFile);
    }

    protected void ensureActionOnEditorDestruction(Runnable runnable) {
        registerOneTimeAction(runnable, getCDOCheckout());
    }

    protected static class LauncherModelWrapper implements Closeable {

        private final CDOView cdoView;
        private final Diagram launcherDiagram;

        public LauncherModelWrapper(IFile launcherFile) throws IOException {
            cdoView = openCDOView(launcherFile.getProject());
            try {
                launcherDiagram = LockStateInfo.loadDiagram(cdoView, launcherFile);
            } catch (Exception e) {
                closeCDOView(cdoView);
                throw e;
            }
        }

        public Diagram getDiagram() {
            return launcherDiagram;
        }

        @Override
        public void close() throws IOException {
            closeCDOView(cdoView);
        }

        private static CDOView openCDOView(IProject project) {
            CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
            try {
                return session.openView();
            } catch (Exception e) {
                CDOConnectionManager.getInstance().releaseSession(session);
                throw e;
            }
        }

        private static void closeCDOView(CDOView cdoView) {
            Optional<CDOSession> cdoSession = Optional.ofNullable(cdoView).map(CDOView::getSession);
            IOUtil.closeSilent(cdoView);
            cdoSession.ifPresent(CDOConnectionManager.getInstance()::releaseSession);
        }

    }

    private void displayReadOnlyWarning() {
        if (isReadOnly) {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Read-only mode",
                    "Another user is editing this model. The editor will open in read-only mode. "
                            + "You cannot do nor persist any changes.");
        }
    }

    private static CDOCheckout createCheckout(IProject project, boolean isReadOnly) {
        CDOCheckout checkout = CDOConnectionManager.getInstance().createCDOCheckout(project, !isReadOnly, isReadOnly);
        checkout.open();
        return checkout;
    }

    private static void ensureViewClosingOnCheckoutDelete(CDOCheckout checkout, Collection<CDOView> views) {
        registerOneTimeAction(() -> views.stream().forEach(IOUtil::closeSilent), checkout);
    }

    private static void registerOneTimeAction(Runnable runnable, CDOCheckout checkout) {
        CheckoutListenerManager.INSTANCE.registerOneTimeAction(event -> {
            if (event instanceof CheckoutStateEvent) {
                CheckoutStateEvent stateChange = (CheckoutStateEvent) event;
                if (stateChange.getCheckout().getID().equals(checkout.getID())
                        && stateChange.getNewState() == State.Closed) {
                    runnable.run();
                    return true;
                }
            }
            return false;
        });
    }

    @SuppressWarnings("squid:S2222")
    private static boolean doLockRelevantModels(CDOView cdoMainView, Iterable<URI> relevantModels) {
        boolean result = true;
        for (URI modelURI : relevantModels) {
            CDOLock lock = LockStateInfo.getWriteLock(cdoMainView, modelURI);
            // the lock will be released automatically as soon as the corresponding view is closed
            result &= !lock.isLockedByOthers() && lock.tryLock();
        }
        return result;
    }

    private static ITransformationManager createTransformationManager(CDOTransaction mainView, CDOView branchView,
            Collection<URI> relevantURIs) {
        if (branchView instanceof CDOTransaction) {
            return new TransformationManager(mainView, (CDOTransaction) branchView,
                    transaction -> doLockRelevantModels(transaction, relevantURIs));
        } else {
            return new NOOPTransformationManager();
        }
    }

}
