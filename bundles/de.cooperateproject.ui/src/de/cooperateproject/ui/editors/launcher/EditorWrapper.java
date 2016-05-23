package de.cooperateproject.ui.editors.launcher;

public class EditorWrapper {
/*
	private static final Map<String, IEditorOpenInformation> EXTENSION_TO_EDITOR = createExtensionToEditorMap();
	private final CDOSession cdoSession;
	private final ConcreteSyntaxModel concreteSyntaxModel;
	private IEditorPart editorPart;
	private DisposedListener disposedListener;

	public EditorWrapper(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		cdoSession = openCDOSession(launcherFile.getProject());
		Diagram launcherModel = loadDiagram(cdoSession, launcherFile);
		Optional<ConcreteSyntaxModel> model = selectConcreteSyntaxModel(launcherModel, editorType);
		if (!model.isPresent()) {
			throw new ConcreteSyntaxTypeNotAvailableException(
					"The concrete syntax type " + editorType + " is not available.");
		}
		concreteSyntaxModel = model.get();
	}

	public void openEditor() throws PartInitException {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorOpenInformation editorOpen = EXTENSION_TO_EDITOR.get(concreteSyntaxModel.getExtension());
		IEditorInput input = editorOpen.createEditorInput(concreteSyntaxModel.getRootElement());
		editorPart = IDE.openEditor(page, input, editorOpen.getEditorID());
		disposedListener = new DisposedListener(editorPart, (p -> editorClosed(p)));
		page.addPartListener(disposedListener);
		try {
			editorOpen.adjustEditor(editorPart, concreteSyntaxModel.getRootElement());
		} catch (EditorAdjustmentException e) {
			throw new PartInitException("Error in adjusting the already opened editor.", e);
		}
	}

	protected void editorClosed(IWorkbenchPage iWorkbenchPage) {
		iWorkbenchPage.removePartListener(disposedListener);
		closeCDOSession(cdoSession);
	}

	private static CDOSession openCDOSession(IProject project) {
		return RepositoryManager.getInstance().getSession(project);
	}

	private static Optional<ConcreteSyntaxModel> selectConcreteSyntaxModel(Diagram launcherModel,
			EditorType editorType) {
		return Iterables.tryFind(launcherModel.getConcreteSyntaxModels(), m -> editorType.getSupportedSyntaxModels()
				.stream().anyMatch(t -> t.isAssignableFrom(m.getClass())));
	}

	private static Diagram loadDiagram(CDOSession cdoSession, IFile launcherFile) throws IOException {
		CDOView view = cdoSession.openView();
		ResourceSet rs = view.getResourceSet();
		URI fileUri = URI.createPlatformResourceURI(launcherFile.getFullPath().toString(), true);
		Resource r = rs.createResource(fileUri, UIConstants.LAUNCHER_EXTENSION);
		r.load(Collections.emptyMap());
		EObject rootObject = r.getContents().get(0);
		if (!(rootObject instanceof Diagram)) {
			throw new IllegalArgumentException("");
		}
		return (Diagram) rootObject;
	}

	private static void closeCDOSession(CDOSession cdoSession) {
		RepositoryManager.getInstance().releaseSession(cdoSession);
	}

	private static Map<String, IEditorOpenInformation> createExtensionToEditorMap() {
		Map<String, IEditorOpenInformation> map = Maps.newHashMap();

		map.put(UIConstants.EDITOR_EXTENSION_TEXTUAL_CLASS,
				new EditorOpenInformation(UIConstants.EDITOR_ID_TEXTUAL_CLASS));
		map.put(UIConstants.EDITOR_EXTENSION_GRAPHICAL, new EditorOpenInformation(UIConstants.EDITOR_ID_GRAPHICAL) {
			@Override
			public void adjustEditor(IEditorPart part, EObject rootObject) throws EditorAdjustmentException, PartInitException {				
//				ServicesRegistry servicesRegistry = part.getAdapter(ServicesRegistry.class);
//				if (servicesRegistry == null) {
//					return;
//				}
//				try {
//					servicesRegistry.startRegistry();
//					OpenElementService openElementService = servicesRegistry.getService(OpenElementService.class);
//					openElementService.openSemanticElement(rootObject);
//				} catch (ServiceException e) {
//					throw new EditorAdjustmentException("Could not select the specific diagram.", e);
//				}
			}
			@Override
			public IEditorInput createEditorInput(EObject rootElement) {
				Resource r = rootElement.eResource();
				if (r instanceof CDOResource) {
					CDOResource cdoResource = (CDOResource)r;
					
					CDORepository repo = CDOExplorerUtil.getRepositoryManager().getRepository(cdoResource.cdoView().getSession());
					CDOCheckout checkout = CDOHelper.createCheckout(repo);
					checkout.open();
					cdoResource = (CDOResource) checkout.openView().getObject(cdoResource.cdoID());
					
					
					CDOResourceFolder folder = cdoResource.getFolder();
					String resourceName = cdoResource.getName();
					String resourceExtension = cdoResource.getExtension();
					String plainName = resourceName.replaceFirst("\\." + resourceExtension + "$", "");
					String launcherName = plainName + ".di";
					CDOResourceNode launcherNode = folder.getNode(launcherName);
					URI launcherNodeURI = launcherNode.getURI();
					SessionManager.getInstance().registerSessionWithKey(cdoResource.cdoView().getSession(), launcherNodeURI);
					return new URIEditorInput(launcherNodeURI);
					//return new CDOLobEditorInput((CDOResource)launcherNode, false);
				}
				
				URI resourceURI = rootElement.eResource().getURI();
				IFile resourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
				String plainName = resourceFile.getName().replaceFirst("\\." + resourceFile.getFileExtension() + "$", "");
				resourceFile.getParent().getFile(new Path(plainName + ".di"));
				return new FileEditorInput(resourceFile);
			}
		});

		return map;
	}*/
}
