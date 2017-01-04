package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.lifecycleevents.ILifeCycleEventsProvider;
import org.eclipse.papyrus.infra.ui.services.EditorLifecycleEventListener;
import org.eclipse.papyrus.infra.ui.services.EditorLifecycleManager;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.resource.UMLResource;

import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.papyrus.editor.CooperatePapyrusEditor;
import de.cooperateproject.ui.util.EditorFinderUtil;

public class PapyrusCDOLauncher extends EditorLauncher {

	//private static final String EDITOR_ID_GRAPHICAL = "org.eclipse.papyrus.infra.core.papyrusEditor";
	private static final String EDITOR_ID_GRAPHICAL = CooperatePapyrusEditor.ID;
	private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	private static final Logger LOGGER = Logger.getLogger(PapyrusCDOLauncher.class);
	
	private final EditorLifecycleEventListener editorCloseListener = new EditorLifecycleEventListener() {
		
		@Override
		public void postInit(IMultiDiagramEditor arg0) {
			// intentionally do nothing
			return;
		}
		
		@Override
		public void postDisplay(IMultiDiagramEditor arg0) {
			// intentionally do nothing
			return;
		}
		
		@Override
		public void beforeClose(IMultiDiagramEditor arg0) {
			handleEditorAboutToBeClosed(arg0);
		}
		
	};
	
	public PapyrusCDOLauncher(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		super(launcherFile, editorType, true);
	}
	
	@Override
	protected IEditorPart doOpenEditor() throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorInput editorInput = createEditorInput();
		IEditorPart editorPart = IDE.openEditor(page, editorInput, EDITOR_ID_GRAPHICAL);
		selectAppropriateModel(editorPart);
		registerPostSaveListener(editorPart);
		return editorPart;
	}

	private void selectAppropriateModel(IEditorPart editorPart) throws PartInitException {
		try {
			ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
			EObject rootObject = getConcreteSyntaxModel().getRootElement();
			CDOObject rootObjectCDO = CDOUtil.getCDOObject(rootObject);
			final CDOID rootObjectID = rootObjectCDO.cdoID();
			IPageManager pageManager = servicesRegistry.getService(IPageManager.class);
			Optional<CDOObject> pagedElement = pageManager.allPages().stream().filter(p -> p instanceof EObject)
					.map(p -> (EObject) p).map(CDOUtil::getCDOObject)
					.filter(o -> rootObjectID.equals(o.cdoID())).findFirst();
			
			if (pagedElement.isPresent()) {
				pageManager.closeOtherPages(pagedElement.get());
				rootObject = pagedElement.get();
			}

			// enforce loading of primitive types
			ResourceSet rs = rootObject.eResource().getResourceSet();
			if (rs != null) {
				rs.getResource(UML_PRIMITIVE_TYPES_URI, true);
			} else {
				LOGGER.warn("The element about to be selected is not contained in a resource set.");
			}
			
			OpenElementService openElementService = servicesRegistry.getService(OpenElementService.class);
			openElementService.openElement(rootObject);
		} catch (ServiceException e) {
			throw new PartInitException("Could not select the correct diagram.", e);
		}
	}

	private void registerPostSaveListener(IEditorPart editorPart) throws PartInitException {
		try {
			ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
			SaveEventListener saveListener = new SaveEventListener(this::handleEditorSave);
			servicesRegistry.getService(ILifeCycleEventsProvider.class).addPostDoSaveListener(saveListener);
		} catch (ServiceException e) {
			throw new PartInitException("Could not add save listener.", e);
		}
	}

	private static ServicesRegistry getServicesRegistery(IEditorPart editorPart) throws ServiceException {
		return getServicesRegistery(editorPart, true);
	}
	
	private static ServicesRegistry getServicesRegistery(IEditorPart editorPart, boolean startOnDemand) throws ServiceException {
		ServicesRegistry servicesRegistry = editorPart.getAdapter(ServicesRegistry.class);
		if (servicesRegistry == null) {
			throw new ServiceException("Editor does not support service registry.");
		}
		if (startOnDemand) {
			servicesRegistry.startRegistry();			
		}
		return servicesRegistry;
	}

	private IEditorInput createEditorInput() {
		EObject rootElement = getConcreteSyntaxModel().getRootElement();

		Resource r = createPlainResource(rootElement);
		if (rootElement.eResource() instanceof CDOResource) {
			r = createCDOResource(rootElement);
		}

		URI originalUri = r.getURI();
		String[] segments = originalUri.segments();
		String modelName = segments[segments.length - 1];
		String resourceExtension = originalUri.fileExtension();
		String plainName = modelName.replaceFirst("\\." + resourceExtension + "$", "");
		String launcherName = plainName + ".di";
		segments[segments.length - 1] = launcherName;
		URI uriToLaunch = URI.createHierarchicalURI(originalUri.scheme(), originalUri.authority(), originalUri.device(),
				segments, originalUri.query(), originalUri.fragment());
		return new URIEditorInput(uriToLaunch);
	}

	private Resource createPlainResource(EObject rootElement) {
		return rootElement.eResource();
	}

	private Resource createCDOResource(EObject rootelement) {
		CDOResource cdoResource = (CDOResource) rootelement.eResource();
		return (CDOResource) getCDOView().getObject(cdoResource.cdoID());
	}

	public static Optional<IEditorPart> findExistingEditor(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		LauncherModelWrapper diagram = loadLauncherModelReadOnly(launcherFile);
		try {
			ConcreteSyntaxModel concreteSyntaxModel = selectConcreteSyntaxModel(diagram.getDiagram(), editorType);
			URI ownURI = EcoreUtil.getURI(concreteSyntaxModel.getRootElement());
			return EditorFinderUtil.findEditor(EDITOR_ID_GRAPHICAL, i -> compareEditorInputs(ownURI, i));
		} finally {
			IOUtil.closeSilent(diagram);
		}
	}
	
	private static boolean compareEditorInputs(URI diagramURI, IEditorInput editorInput) {
		if (!(editorInput instanceof URIEditorInput)) {
			return false;
		}
		
		URIEditorInput uriInput = (URIEditorInput)editorInput;
		URI otherURI = uriInput.getURI();
		
		if (otherURI.scheme() == null || !otherURI.scheme().startsWith("cdo")) {
			return false;
		}
		
		if (!ArrayUtils.isEquals(diagramURI.segments(), otherURI.trimFileExtension().appendFileExtension("notation").segments())) {
			return false;
		}
		
		return true;
	}

	@Override
	protected void registerListener(IEditorPart editorPart) {
		super.registerListener(editorPart);
		try {
			ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
			EditorLifecycleManager lifecycleManager = servicesRegistry.getService(EditorLifecycleManager.class);
			lifecycleManager.addEditorLifecycleEventsListener(editorCloseListener);
		} catch (ServiceException e) {
			LOGGER.error("Could not add editor close listener.");
			// we should change the control flow based on this...
		}
	}
	
	

	@Override
	protected DisposedListener createDisposeListener(IEditorPart editorPart) {
		return new DisposedListener(editorPart, this::editorClosed, this::editorDisposed);
	}

//	private void deregisterListener(IEditorPart editorPart) {
//		try {
//			ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
//			EditorLifecycleManager lifecycleManager = servicesRegistry.getService(EditorLifecycleManager.class);
//			lifecycleManager.removeEditorLifecycleEventsListener(editorCloseListener);
//		} catch (ServiceException e) {
//			LOGGER.error("Could not remove editor close listener.");
//			// we should change the control flow based on this...
//		}
//	}
	
	private void handleEditorAboutToBeClosed(IEditorPart editorPart) {
		// TODO we cannot deregister the listener here because of a concurrent modification exception
		getCDOView().close();
	}
	
	private boolean editorDisposed(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(false);
		if (part == null || !(part instanceof IEditorPart)) {
			return true;
		}
		return false;
	}
	
}
