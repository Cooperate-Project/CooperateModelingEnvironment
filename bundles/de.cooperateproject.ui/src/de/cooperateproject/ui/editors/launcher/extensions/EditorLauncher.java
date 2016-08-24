package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;

public abstract class EditorLauncher implements IEditorLauncher {
	
	private static final Logger LOGGER = Logger.getLogger(EditorLauncher.class);
	private final CDOCheckout cdoCheckout;
	private final CDOView cdoView;
	private final ConcreteSyntaxModel concreteSyntaxModel;
	private final IFile launcherFile;
	private final TransformationManager transformationManager;
	private DisposedListener disposeListener;
	
	public EditorLauncher(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		cdoCheckout = CDOConnectionManager.getInstance().createCDOCheckout(launcherFile.getProject(), true);
		cdoCheckout.open();
		cdoView = cdoCheckout.openView();
		this.launcherFile = launcherFile;
		Diagram launcherModel = loadDiagram(cdoView, launcherFile);
		Optional<ConcreteSyntaxModel> model = selectConcreteSyntaxModel(launcherModel, editorType);
		if (!model.isPresent()) {
			throw new ConcreteSyntaxTypeNotAvailableException(
					"The concrete syntax type " + editorType + " is not available.");
		}
		concreteSyntaxModel = model.get();
		transformationManager = new TransformationManager(cdoCheckout);
	}
	
	@Override
	public void openEditor() throws PartInitException {
		IEditorPart editorPart = doOpenEditor();
		registerListener(editorPart);
	}

	protected abstract IEditorPart doOpenEditor() throws PartInitException;
	
	protected CDOView getCDOView() {
		return cdoView;
	}
	
	protected ConcreteSyntaxModel getConcreteSyntaxModel() {
		return concreteSyntaxModel;
	}
	
	protected IFile getLauncherFile() {
		return launcherFile;
	}
	
	private void registerListener(IEditorPart editorPart) {
		disposeListener = new DisposedListener(editorPart, this::editorClosed);
		editorPart.getSite().getPage().addPartListener(disposeListener);
	}
	
	protected void editorClosed(IWorkbenchPage p) {
		p.removePartListener(disposeListener);
		cdoCheckout.close();
		CDOConnectionManager.getInstance().deleteCDOCheckout(cdoCheckout);
	}
	
	protected void handleEditorSave(IEditorPart editorPart) {
		try {
			transformationManager.handleEditorSave(editorPart.getEditorInput());
		} catch (TransformationException e) {
			// TODO inform user
			LOGGER.error("Failed to handle editor save event.", e);
		}
	}
	
	private static Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
		ResourceSet rs = cdoView.getResourceSet();
		URI fileUri = URI.createPlatformResourceURI(launcherFile.getFullPath().toString(), true);
		Resource r = rs.createResource(fileUri, UIConstants.LAUNCHER_EXTENSION);
		r.load(Collections.emptyMap());
		EObject rootObject = r.getContents().get(0);
		if (!(rootObject instanceof Diagram)) {
			throw new IllegalArgumentException("");
		}
		return (Diagram) rootObject;
	}
	
	private static Optional<ConcreteSyntaxModel> selectConcreteSyntaxModel(Diagram launcherModel,
			EditorType editorType) {
		return Iterables.tryFind(launcherModel.getConcreteSyntaxModels(), m -> editorType.getSupportedSyntaxModels()
				.stream().anyMatch(t -> t.isAssignableFrom(m.getClass())));
	}

}
