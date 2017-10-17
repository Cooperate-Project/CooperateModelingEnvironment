package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout.State;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckoutManager.CheckoutStateEvent;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;
import de.cooperateproject.ui.editors.launcher.impl.CheckoutListenerManager;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.launchermodel.helper.LauncherModelHelper;

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
public abstract class EditorLauncher implements IEditorLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(EditorLauncher.class);
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
    public EditorLauncher(IFile launcherFile, EditorType editorType)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        isReadOnly = isReadOnlyRequired(launcherFile);
        cdoCheckout = createCheckout(launcherFile.getProject(), isReadOnly);
        cdoView = cdoCheckout.openView(isReadOnly);
        cdoMainView = cdoView.getSession().openTransaction(cdoView.getBranch().getBranchManager().getMainBranch());
        ensureViewClosingOnCheckoutDelete(cdoCheckout, Arrays.asList(cdoView, cdoMainView));
        Diagram launcherModel = loadDiagram(cdoView, launcherFile);
        concreteSyntaxModel = launcherModel.getConcreteSyntaxModel(editorType.getSupportedSyntaxModel());
        Collection<URI> relevantURIs = Arrays.asList(determineUMLURI(launcherModel));
        doLockRelevantModels(cdoMainView, relevantURIs);
        transformationManager = createTransformationManager(cdoMainView, cdoView, relevantURIs);
        this.launcherFile = launcherFile;
    }

    @Override
    public IEditorPart openEditor() throws PartInitException {
        displayReadOnlyWarning();
        IEditorPart newEditorPart = doOpenEditor();
        registerListener(newEditorPart);
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
    }

    protected Optional<IPartListener2> createDisposeListener(IEditorPart editorPart) {
        return Optional.of(new DisposedListener(editorPart, this::editorClosed));
    }

    protected void editorClosed(IWorkbenchPage p) {
        Validate.notNull(p);

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
            // TODO inform user
            LOGGER.error("Failed to handle editor save event.", e);
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
                launcherDiagram = loadDiagram(cdoView, launcherFile);
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
                    "Another user is editing this model. The editor will open in read-only mode. You cannot do nor persist any changes.");
        }
    }

    private static CDOCheckout createCheckout(IProject project, boolean isReadOnly) {
        // TODO consider not creating a branch if in read-only mode
        CDOCheckout checkout = CDOConnectionManager.getInstance().createCDOCheckout(project, true, isReadOnly);
        checkout.open();
        return checkout;
    }

    private static boolean isReadOnlyRequired(IFile launcherFile)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(launcherFile.getProject());
        try {
            CDOView temporaryView = session.openView();
            try {
                Diagram launcherModel = loadDiagram(temporaryView, launcherFile);
                URI umlURI = determineUMLURI(launcherModel);
                return getWriteLock(temporaryView, umlURI).isLockedByOthers();
            } finally {
                IOUtil.closeSilent(temporaryView);
            }
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
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

    private static Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
        Validate.notNull(cdoView);
        return LauncherModelHelper.loadDiagram(cdoView.getResourceSet(), launcherFile);
    }

    private static URI determineUMLURI(Diagram launcherModel) throws ConcreteSyntaxTypeNotAvailableException {
        TextualConcreteSyntaxModel textualConcreteSyntaxModel = launcherModel
                .getConcreteSyntaxModel(TextualConcreteSyntaxModel.class);
        URI textualURI = textualConcreteSyntaxModel.getRootElement().eResource().getURI();
        return ModelNamingConventions.getUMLFromTextualURI(textualURI);
    }

    private static boolean doLockRelevantModels(CDOView cdoMainView, Iterable<URI> relevantModels) {
        boolean result = true;
        for (URI modelURI : relevantModels) {
            CDOLock lock = getWriteLock(cdoMainView, modelURI);
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
            return editorInput -> {
                LOGGER.info("Transformation request received. The model is, however, read-only. Ignoring request.");
            };
        }
    }

    private static CDOLock getWriteLock(CDOView view, URI uri) {
        CDOResource resource = view.getResource(CDOURIUtil.extractResourcePath(uri), true);
        return resource.cdoWriteLock();
    }

}
