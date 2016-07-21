package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.branch.CDOBranchPoint;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.spi.cdo.DefaultCDOMerger;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorInput;

import de.cooperateproject.cdo.merge.MergeHelper;
import de.cooperateproject.cdo.util.utils.CDOResourceSet;
import de.cooperateproject.modeling.transformation.engine.executor.TransformationExecutor;
import de.cooperateproject.ui.util.EditorInputSwitch;

public class TransformationManager {
	
	public static class TransformationException extends Exception {
		private static final long serialVersionUID = -5921359045558510687L;
		public TransformationException(String msg, Throwable cause) {
			super(msg, cause);
		}
	}

	private final CDOCheckout cdoCheckout;
	private long lastMergeTimeBranch;
	private long lastMergeTimeMain;
	
	
	public TransformationManager(CDOCheckout cdoCheckout) {
		this.cdoCheckout = cdoCheckout;
		CDOBranch branch = cdoCheckout.getView().getBranch();
		lastMergeTimeBranch = branch.getTimeStamp();
		lastMergeTimeMain = getTimestampOfBranch(cdoCheckout, CDOBranch.MAIN_BRANCH_ID);
	}
	
	public void handleEditorSave(IEditorInput editorInput) throws TransformationException {
		try {
			triggerTransformation(editorInput);
			mergeChangesToMaster();
		} catch (IOException | CommitException e) {
			throw new TransformationException("Could not transform and merge model changes.", e);
		}
	}
	
	private void mergeChangesToMaster() throws CommitException {
		CDOBranch editorBranch = cdoCheckout.getBranchPoint().getBranch();
		CDOBranch mainBranch = editorBranch.getBranchManager().getMainBranch();
		
		CDOTransaction mergeTransaction = cdoCheckout.getView().getSession().openTransaction(mainBranch);
		try {
			CDOBranchPoint sourceFromRevision = editorBranch.getPoint(lastMergeTimeBranch);
			CDOBranchPoint sourceToRevision = editorBranch.getHead();
			CDOBranchPoint targetFromRevision = mainBranch.getPoint(lastMergeTimeMain);
			MergeHelper.merge(mergeTransaction, sourceToRevision, sourceFromRevision, targetFromRevision, new DefaultCDOMerger.PerFeature.ManyValued());
			CDOCommitInfo mergeCommitInfo = mergeTransaction.commit();
			mergeCommitInfo.getTimeStamp();
			lastMergeTimeBranch = cdoCheckout.getView().getLastUpdateTime();
			lastMergeTimeMain = mergeCommitInfo.getTimeStamp();
		} finally {
			IOUtil.closeSilent(mergeTransaction);
		}
	}
	
	private static long getTimestampOfBranch(CDOCheckout cdoCheckout, int branchId) {
		CDOView view = cdoCheckout.getView().getSession().openView(branchId);
		try {
			return view.getLastUpdateTime();
		} finally {
			IOUtil.closeSilent(view);
		}
	}

	private void triggerTransformation(IEditorInput editorInput) throws IOException, CommitException {
		URI changedResourceURI = new EditorInputSwitch().doSwitch(editorInput);
		URI normalizedURI = normalizeURI(changedResourceURI);
		triggerTransformation(normalizedURI);
	}
	
	private void triggerTransformation(URI uri) throws IOException, CommitException {
		if (!uri.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME)) {
			triggerTransformationRegular(uri);
		} else {
			triggerTransformationCDO(uri);
		}
	}
	
	private void triggerTransformationRegular(URI uri) throws IOException {
		ResourceSet rs = new ResourceSetImpl();	
		triggerTransformation(uri, rs);
	}
	
	private void triggerTransformationCDO(URI uri) throws IOException, CommitException {
		CDOTransaction transaction = cdoCheckout.openTransaction();
		ResourceSet rs = new CDOResourceSet(transaction);
		try {
			triggerTransformation(uri, rs);			
			transaction.commit();
		} finally {
			IOUtil.closeSilent(transaction);
		}
	}
	
	private void triggerTransformation(URI changedUri, ResourceSet rs) throws IOException {
		Iterable<URI> uris = createRootElementURIs(changedUri, rs);
		for (URI uri : uris) {
			TransformationExecutor.getInstance().transformChanged(uri, rs);
		}
	}
	
	private static Iterable<URI> createRootElementURIs(URI normalizedURI, ResourceSet rs) {
		Resource r = rs.getResource(normalizedURI, false);
		return r.getContents().stream().map(o -> r.getURIFragment(o)).map(f -> normalizedURI.trimFragment().appendFragment(f)).collect(Collectors.toSet());
	}
	
	private static URI normalizeURI(URI originalURI) {
		Validate.isTrue(originalURI.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME) && originalURI.scheme().endsWith("checkout"));
		
		URI processedURI = originalURI;		
		if ("di".equals(processedURI.fileExtension())) {
			processedURI = processedURI.trimFileExtension().appendFileExtension("notation");
		}
		return processedURI;
		
	}

}
