package de.cooperateproject.ui.focus.textual;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.ui.focus.manager.IFocusManager;
import de.cooperateproject.ui.focus.manager.IFocusManagerFactory;

/**
 * Factory for the textual focus manager.
 * 
 * @author czogalik
 *
 */
public class FocusManagerTextualFactory implements IFocusManagerFactory {

    @Override
    public boolean canHandle(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof XtextEditor) {
            IEditorInput editorInput = ((XtextEditor) workbenchPart).getEditorInput();
            ILauncherFileEditorInput typedEditorInput = editorInput.getAdapter(ILauncherFileEditorInput.class);
            return typedEditorInput != null && typedEditorInput.getAssociatedLauncherFile() != null;
        }
        return false;
    }

    @Override
    public IFocusManager create(IWorkbenchPart workbenchPart) {
        if (canHandle(workbenchPart)) {
            return new FocusManagerTextual((XtextEditor) workbenchPart);
        }
        throw new IllegalArgumentException(
                String.format("The given workbench part %s is not compatible with this factory.", workbenchPart));
    }

}
