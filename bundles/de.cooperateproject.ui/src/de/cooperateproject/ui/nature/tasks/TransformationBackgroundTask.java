package de.cooperateproject.ui.nature.tasks;

import java.io.IOException;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.common.protocol.CDOProtocolConstants;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import de.cooperateproject.cdo.util.utils.CDOResourceSet;
import de.cooperateproject.modeling.transformation.engine.executor.TransformationExecutor;
import de.cooperateproject.ui.cdo.sessions.RepositoryManager;
import de.cooperateproject.ui.events.EventHandler;
import de.cooperateproject.ui.events.IEventListener;
import de.cooperateproject.ui.events.NOPEventListener;
import de.cooperateproject.ui.properties.ProjectPropertiesDTO;
import de.cooperateproject.ui.util.EditorInputSwitch;

public class TransformationBackgroundTask extends CooperateProjectBackgroundTask {

	private static final Logger LOGGER = Logger.getLogger(TransformationBackgroundTask.class);
	private final IEventListener eventListener = new NOPEventListener() {
		@Override
		public void postSaveEvent(IEditorPart sender) {
			handleModelSave(sender);
		}
	};
	
	public TransformationBackgroundTask(IProject project, ProjectPropertiesDTO properties) {
		super(project, properties);
	}

	@Override
	public void start() throws TaskException {
		EventHandler.getInstance().registerListener(eventListener);
	}

	@Override
	public void stop() {
		EventHandler.getInstance().unregisterListener(eventListener);
	}
	
	private void handleModelSave(IEditorPart editorPart) {
		IEditorInput editorInput = editorPart.getEditorInput();
		URI changedResourceURI = new EditorInputSwitch().doSwitch(editorInput);
		URI normalizedURI = normalizeURI(changedResourceURI);
		try {
			triggerTransformation(normalizedURI);
		} catch (IOException | CommitException e) {
			//TODO inform user
			LOGGER.error("Error in handling model changes during transformation.", e);
		}
	}
	
	private Iterable<URI> createRootElementURIs(URI normalizedURI, ResourceSet rs) {
		Resource r = rs.getResource(normalizedURI, false);
		return r.getContents().stream().map(o -> r.getURIFragment(o)).map(f -> normalizedURI.trimFragment().appendFragment(f)).collect(Collectors.toSet());
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
		CDOSession cdoSession = RepositoryManager.getInstance().getSession(getProject());
		CDOTransaction transaction = cdoSession.openTransaction();
		ResourceSet rs = new CDOResourceSet(transaction);

		try {
			triggerTransformation(uri, rs);			
			transaction.commit();
		} finally {
			IOUtil.closeSilent(transaction);
			RepositoryManager.getInstance().releaseSession(cdoSession);
		}
	}
	
	private void triggerTransformation(URI changedUri, ResourceSet rs) throws IOException {
		Iterable<URI> uris = createRootElementURIs(changedUri, rs);
		for (URI uri : uris) {
			TransformationExecutor.getInstance().transformChanged(uri, rs);
		}
	}
	
	private static URI normalizeURI(URI originalURI) {
		URI processedURI = originalURI;
		if (processedURI.scheme().startsWith(CDOProtocolConstants.PROTOCOL_NAME)) {
			processedURI = normalizeCDOURI(processedURI);
		}
		
		if ("di".equals(processedURI.fileExtension())) {
			processedURI = processedURI.trimFileExtension().appendFileExtension("notation");
		}
		return processedURI;
		
	}
	
	private static URI normalizeCDOURI(URI originalURI) {
		if (!originalURI.scheme().endsWith("checkout")) {
			return originalURI;
		}
		CDOCheckout cdoCheckout = CDOExplorerUtil.getCheckoutManager().getCheckout(originalURI.authority());
		String repositoryName = cdoCheckout.getRepository().getName();
		
		return URI.createHierarchicalURI(CDOProtocolConstants.PROTOCOL_NAME, repositoryName, null, originalURI.segments(), originalURI.query(), originalURI.fragment());
	}
}

