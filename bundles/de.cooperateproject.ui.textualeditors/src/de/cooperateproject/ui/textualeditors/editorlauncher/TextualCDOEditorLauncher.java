package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.SavePostProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.SaveablePostProcessingSupport;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.util.EditorFinderUtil;

public class TextualCDOEditorLauncher extends EditorLauncher {

	public TextualCDOEditorLauncher(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		super(launcherFile, editorType, false);
	}

	@Override
	protected IEditorPart doOpenEditor() throws PartInitException {
		CDOResourceLeaf cdoResource = (CDOResourceLeaf) getConcreteSyntaxModel().getRootElement().eResource();
		IEditorInput editorInput = new CooperateCDOLobEditorInput(cdoResource, getLauncherFile());
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		TextualCDOEditorIDs editorId;
		try {
			editorId = getEditorId(getConcreteSyntaxModel());
		} catch (ConcreteSyntaxTypeNotAvailableException e) {
			throw new PartInitException("Error in loading the editor.", e);
		}
		IEditorPart editor = IDE.openEditor(page, editorInput, editorId.getId());
		
		SaveablePostProcessingSupport postProcessingSupport = editor.getAdapter(SaveablePostProcessingSupport.class);
		if (postProcessingSupport != null) {
			postProcessingSupport.register(new SavePostProcessor() {
				@Override
				public void processAfterSafe() throws Exception {
					handleEditorSave(editor);
				}
			});			
		}
		
		return editor;
	}

	private static TextualCDOEditorIDs getEditorId(ConcreteSyntaxModel concreteSyntaxModel) throws ConcreteSyntaxTypeNotAvailableException {
		Optional<TextualCDOEditorIDs> editorId = TextualCDOEditorIDs.findByExtension(concreteSyntaxModel.getExtension());
		if (!editorId.isPresent()) {
			throw new ConcreteSyntaxTypeNotAvailableException("Could not find appropriate editor.");
		}
		return editorId.get();
	}

	public static Optional<IEditorPart> findExistingEditor(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		IEditorInput editorInput = new FileEditorInput(launcherFile);
		Collection<IEditorPart> editorCandidates = EditorFinderUtil.findEditor(editorInput);
		Collection<String> availableEditorIds = Arrays.asList(TextualCDOEditorIDs.values()).stream().map(v -> v.getId()).collect(Collectors.toSet());
		return editorCandidates.stream().filter(e -> availableEditorIds.contains(e.getEditorSite().getId())).findFirst();
	}

}
