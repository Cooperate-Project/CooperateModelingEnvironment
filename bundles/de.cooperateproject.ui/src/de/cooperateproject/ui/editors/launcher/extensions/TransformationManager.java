package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.common.revision.CDOIDAndVersion;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ObjectNotFoundException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import de.cooperateproject.cdo.util.merger.CustomCDOMerger;
import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.modeling.transformation.common.ITransformationExecutor;
import de.cooperateproject.ui.Activator;
import de.cooperateproject.ui.util.EditorInputSwitch;

/**
 * Handler for editor save events that transforms and merges editor changes.
 */
// TODO this class should be located in another location and/or splitted
public class TransformationManager {

    /**
     * Exception that occured during the transformation or merging of content.
     */
    public static class TransformationException extends Exception {
        private static final long serialVersionUID = -5921359045558510687L;

        /**
         * Instantiates the exception.
         * 
         * @param msg
         *            The error message.
         * @param cause
         *            The cause of the exception.
         */
        public TransformationException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(TransformationManager.class);
    private final CDOCheckout cdoCheckout;
    private long lastMergeTimeBranch;
    private long lastMergeTimeMain;
    private ITransformationExecutor transformationExecutor;

    /**
     * Instantiates the transformation manager.
     * 
     * @param cdoCheckout
     *            The {@link CDOCheckout} into which the transformation and merge results shall be transferred.
     */
    public TransformationManager(CDOCheckout cdoCheckout) {
        this.cdoCheckout = cdoCheckout;
        CDOBranch branch = cdoCheckout.getView().getBranch();
        lastMergeTimeBranch = getTimestampOfBranch(cdoCheckout, branch);
        lastMergeTimeMain = getTimestampOfBranch(cdoCheckout, CDOBranch.MAIN_BRANCH_ID);
    }

    /**
     * Handles the editor save event by triggering according transformations and merging the changes back into the
     * master branch.
     * 
     * @param editorInput
     *            The {@link IEditorInput} that shall be saved.
     * @throws TransformationException
     */
    public void handleEditorSave(IEditorInput editorInput) throws TransformationException {
        try {
            triggerTransformation(editorInput);
            mergeChangesToMaster(getCommitMessage(editorInput));
        } catch (IOException | CommitException e) {
            throw new TransformationException("Could not transform and merge model changes.", e);
        }
    }

    private void mergeChangesToMaster(String commitMessage) throws CommitException {
        CDOBranch editorBranch = cdoCheckout.getBranchPoint().getBranch();
        CDOBranch mainBranch = editorBranch.getBranchManager().getMainBranch();

        CDOTransaction mergeTransaction = cdoCheckout.getView().getSession().openTransaction(mainBranch);
        try {
            CDOBranchPoint sourceFromRevision = editorBranch.getPoint(lastMergeTimeBranch);
            CDOBranchPoint sourceToRevision = editorBranch.getHead();
            CDOBranchPoint targetFromRevision = mainBranch.getPoint(lastMergeTimeMain);
            mergeTransaction.merge(sourceToRevision, sourceFromRevision, targetFromRevision, new CustomCDOMerger());
            mergeTransaction.setCommitComment(commitMessage);
            CDOCommitInfo mergeCommitInfo = mergeTransaction.commit();
            mergeCommitInfo.getTimeStamp();
            lastMergeTimeBranch = getTimestampOfBranch(cdoCheckout, editorBranch);
            lastMergeTimeMain = getTimestampOfBranch(cdoCheckout, mainBranch);
        } finally {
            IOUtil.closeSilent(mergeTransaction);
        }
    }

    private static long getTimestampOfBranch(CDOCheckout cdoCheckout, CDOBranch branch) {
        return getTimestampOfBranch(cdoCheckout, branch.getID());
    }

    private static long getTimestampOfBranch(CDOCheckout cdoCheckout, int branchId) {
        if (cdoCheckout.getView().getBranch().getID() == branchId) {
            CDOView view = cdoCheckout.getView();
            return view.getLastUpdateTime();
        } else {
            CDOView view = cdoCheckout.getView().getSession().openView(branchId);
            try {
                return view.getLastUpdateTime();
            } finally {
                IOUtil.closeSilent(view);
            }
        }
    }

    private void triggerTransformation(IEditorInput editorInput) throws IOException, CommitException {
        URI changedResourceURI = new EditorInputSwitch().doSwitch(editorInput);
        URI normalizedURI = normalizeURI(changedResourceURI, cdoCheckout.getURI());
        triggerTransformation(normalizedURI);
    }

    private void triggerTransformation(URI uri) throws IOException, CommitException {
        if (!uri.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME)) {
            triggerTransformationRegular(uri);
        } else {
            triggerTransformationCDO(uri);
        }
    }

    private void triggerTransformationCDO(URI uri) throws IOException, CommitException {
        CDOTransaction transaction = cdoCheckout.openTransaction();
        ResourceSet rs = transaction.getResourceSet();
        rs.setResourceFactoryRegistry(CDOResourceHandler.createFactoryWrapper(rs.getResourceFactoryRegistry()));
        fixStaleReferences(transaction);

        try {
            triggerTransformation(uri, rs);
            transaction.commit();
        } finally {
            IOUtil.closeSilent(transaction);
        }
    }

    private void fixStaleReferences(CDOTransaction transaction) {
        Collection<CDOCommitInfo> infos = Lists.newArrayList();
        transaction.getSession().getCommitInfoManager().getCommitInfos(transaction.getBranch(), lastMergeTimeBranch,
                CDOView.UNSPECIFIED_DATE, infos::add);
        Set<CrossReferenceSetting> candidates = infos.stream()
                .flatMap(i -> findPossibleStaleReferences(transaction.getSession(), i).stream())
                .collect(Collectors.toSet());
        for (CrossReferenceSetting setting : candidates) {
            try {
                CDOObject eObject = transaction.getObject(setting.getObject());
                fixStaleReference(eObject, setting);
            } catch (ObjectNotFoundException e) {
                LOGGER.warn("Attempt to fix a stale reference on an non existing object.", e);
            }
        }
    }

    private static void fixStaleReference(CDOObject eObject, CrossReferenceSetting setting) {
        EReference eReference = setting.getReference();
        if (eObject == null) {
            return;
        }
        Object value = eObject.eGet(eReference, true);
        if (value instanceof EObject && CDOUtil.isStaleObject(value)) {
            CDOUtil.cleanStaleReference(eObject, eReference);
        } else if (value instanceof List<?>) {
            List<?> list = (List<?>) value;
            for (Object o : list) {
                if (CDOUtil.isStaleObject(o)) {
                    int index = list.indexOf(o);
                    CDOUtil.cleanStaleReference(eObject, eReference, index);
                }
            }
        }
    }

    private static Set<CrossReferenceSetting> findPossibleStaleReferences(CDOSession session,
            CDOCommitInfo commitInfo) {
        CDOView historicView = session.openView(commitInfo.getBranch(), commitInfo.getTimeStamp() - 1);
        try {
            Set<CDOObject> detachedObjects = commitInfo.getDetachedObjects().stream().map(CDOIDAndVersion::getID)
                    .map(historicView::getObject).collect(Collectors.toSet());
            if (detachedObjects.isEmpty()) {
                return Collections.emptySet();
            }
            return historicView.queryXRefs(detachedObjects, new EReference[0]).stream()
                    .map(ref -> new CrossReferenceSetting((EReference) ref.getSourceFeature(),
                            ref.getSourceObject().cdoID()))
                    .collect(Collectors.toSet());
        } finally {
            IOUtil.closeSilent(historicView);
        }
    }

    private static class CrossReferenceSetting {
        private final EReference reference;
        private final CDOID object;

        public CrossReferenceSetting(EReference reference, CDOID object) {
            super();
            this.reference = reference;
            this.object = object;
        }

        public EReference getReference() {
            return reference;
        }

        public CDOID getObject() {
            return object;
        }

    }

    private void triggerTransformationRegular(URI uri) throws IOException {
        ResourceSet rs = new ResourceSetImpl();
        triggerTransformation(uri, rs);
    }

    private void triggerTransformation(URI changedUri, ResourceSet rs) throws IOException {
        Iterable<URI> uris = createRootElementURIs(changedUri, rs);
        for (URI uri : uris) {
            Activator.getDefault().getTransformationExecutor().transformChanged(uri, rs);
        }
    }

    private Iterable<URI> createRootElementURIs(URI normalizedURI, ResourceSet rs) {
        Resource r = rs.getResource(normalizedURI, true);
        return r.getContents().stream().map(r::getURIFragment).map(f -> normalizedURI.trimFragment().appendFragment(f))
                .collect(Collectors.toSet());
    }

    private static URI normalizeURI(URI originalURI, URI cdoBaseUri) {
        Validate.isTrue(originalURI.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME));

        URI processedURI = originalURI;
        if ("di".equals(processedURI.fileExtension())) {
            processedURI = processedURI.trimFileExtension().appendFileExtension("notation");
        }

        URI currentBaseURI = processedURI.trimFileExtension().trimQuery().trimFragment()
                .trimSegments(processedURI.segmentCount());
        processedURI = processedURI.deresolve(currentBaseURI).resolve(cdoBaseUri);

        return processedURI;

    }

    private static String getCommitMessage(IEditorInput editorInput) {
        String resource = editorInput.getAdapter(ILauncherFileEditorInput.class).getAssociatedLauncherFile().getName();
        String editorType = editorInput.getAdapter(ILauncherFileEditorInput.class).getEditorType().toString()
                .toLowerCase();
        return "Diagram " + resource + " in " + editorType + " editor was edited by " + System.getProperty("user.name");
    }

}
