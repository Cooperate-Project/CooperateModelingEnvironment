package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

import de.cooperateproject.ui.cdo.sessions.RepositoryManager;
import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;

public abstract class EditorLauncher implements IEditorLauncher {
	
	@FunctionalInterface
	public interface PartSavedHandler {
		public void partSaved(IEditorPart part);
	}
	
	private final PartSavedHandler savedHandler;
	private final CDOSession cdoSession;
	private final CDOView cdoView;
	private final ConcreteSyntaxModel concreteSyntaxModel;
	private DisposedListener disposeListener;
	
	public EditorLauncher(IFile launcherFile, EditorType editorType, PartSavedHandler savedHandler) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		cdoSession = openCDOSession(launcherFile.getProject());
		cdoView = cdoSession.openView();
		Diagram launcherModel = loadDiagram(cdoView, launcherFile);
		Optional<ConcreteSyntaxModel> model = selectConcreteSyntaxModel(launcherModel, editorType);
		if (!model.isPresent()) {
			throw new ConcreteSyntaxTypeNotAvailableException(
					"The concrete syntax type " + editorType + " is not available.");
		}
		concreteSyntaxModel = model.get();
		this.savedHandler = savedHandler;
	}
	
	@Override
	public void openEditor() throws PartInitException {
		IEditorPart editorPart = doOpenEditor();
		registerListener(editorPart);
	}

	protected abstract IEditorPart doOpenEditor() throws PartInitException;
	
	protected PartSavedHandler getPartSavedHandler() {
		return savedHandler;
	}
	
	protected ConcreteSyntaxModel getConcreteSyntaxModel() {
		return concreteSyntaxModel;
	}
	
	protected CDOSession getCDOSession() {
		return cdoSession;
	}
	
	private void registerListener(IEditorPart editorPart) {
		disposeListener = new DisposedListener(editorPart, this::editorClosed);
		editorPart.getSite().getPage().addPartListener(disposeListener);
	}
	
	protected void editorClosed(IWorkbenchPage p) {
		p.removePartListener(disposeListener);
		closeCDOSession(cdoSession, cdoView);
	}

	private static CDOSession openCDOSession(IProject project) {
		return RepositoryManager.getInstance().getSession(project);
	}
	
	private static void closeCDOSession(CDOSession cdoSession, CDOView cdoView) {
		IOUtil.closeSilent(cdoView);
		RepositoryManager.getInstance().releaseSession(cdoSession);
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
