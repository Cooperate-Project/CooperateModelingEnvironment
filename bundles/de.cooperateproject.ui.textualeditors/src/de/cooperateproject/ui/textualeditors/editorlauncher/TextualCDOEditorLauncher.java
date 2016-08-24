package de.cooperateproject.ui.textualeditors.editorlauncher;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.eresource.CDOResourceLeaf;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.SavePostProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.SaveablePostProcessingSupport;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput;
import de.cooperateproject.ui.editors.launcher.extensions.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;

public class TextualCDOEditorLauncher extends EditorLauncher {

	public TextualCDOEditorLauncher(IFile launcherFile, EditorType editorType)
			throws IOException, ConcreteSyntaxTypeNotAvailableException {
		super(launcherFile, editorType);
	}

	@Override
	protected IEditorPart doOpenEditor() throws PartInitException {
		CDOResourceLeaf cdoResource = (CDOResourceLeaf) getConcreteSyntaxModel().getRootElement().eResource();

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorInput editorInput = new CooperateCDOLobEditorInput(cdoResource, getLauncherFile());
		Optional<TextualCDOEditorIDs> editorId = getEditorId();
		if (!editorId.isPresent()) {
			throw new PartInitException("Could not find appropriate editor.");
		}
		IEditorPart editor = IDE.openEditor(page, editorInput, editorId.get().getId());
		
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

	private Optional<TextualCDOEditorIDs> getEditorId() {
		return TextualCDOEditorIDs.findByExtension(getConcreteSyntaxModel().getExtension());
	}

}
