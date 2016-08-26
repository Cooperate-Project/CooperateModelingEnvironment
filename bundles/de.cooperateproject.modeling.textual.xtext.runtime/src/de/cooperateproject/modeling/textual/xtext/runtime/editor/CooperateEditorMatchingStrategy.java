package de.cooperateproject.modeling.textual.xtext.runtime.editor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput;

public class CooperateEditorMatchingStrategy implements IEditorMatchingStrategy {

	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		if (!(input instanceof IFileEditorInput)) {
			return false;
		}
		
		IFileEditorInput newInput = (IFileEditorInput)input;
		
		IEditorInput ownInput;
		try {
			ownInput = editorRef.getEditorInput();
		} catch (PartInitException e) {
			return false;
		}
		
		if (ownInput instanceof IFileEditorInput) {
			return ((IFileEditorInput)ownInput).getFile().equals(newInput.getFile());
		}
		
		if (ownInput instanceof CooperateCDOLobEditorInput) {
			return ((CooperateCDOLobEditorInput)ownInput).getAssociatedLauncherFile().equals(newInput.getFile());
		}
		
		return false;
	}

}
