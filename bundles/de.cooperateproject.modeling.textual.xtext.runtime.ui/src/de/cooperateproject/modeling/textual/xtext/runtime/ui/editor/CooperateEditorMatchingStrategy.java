package de.cooperateproject.modeling.textual.xtext.runtime.ui.editor;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.input.CooperateCDOLobEditorInput;

public class CooperateEditorMatchingStrategy implements IEditorMatchingStrategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateEditorMatchingStrategy.class);

    @Override
    public boolean matches(IEditorReference editorRef, IEditorInput input) {
        if (!(input instanceof IFileEditorInput)) {
            return false;
        }

        IFileEditorInput newInput = (IFileEditorInput) input;

        IEditorInput ownInput;
        try {
            ownInput = editorRef.getEditorInput();
        } catch (PartInitException e) {
            LOGGER.error("Error during editor part init operation.", e);
            return false;
        }

        if (ownInput instanceof IFileEditorInput) {
            return ((IFileEditorInput) ownInput).getFile().equals(newInput.getFile());
        }

        if (ownInput instanceof CooperateCDOLobEditorInput) {
            return ((CooperateCDOLobEditorInput) ownInput).getAssociatedLauncherFile().equals(newInput.getFile());
        }

        return false;
    }

}
