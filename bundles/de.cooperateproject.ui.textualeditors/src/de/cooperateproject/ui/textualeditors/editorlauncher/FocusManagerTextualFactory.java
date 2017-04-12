package de.cooperateproject.ui.textualeditors.editorlauncher;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextEditor;
import de.cooperateproject.ui.focus.manager.IFocusManager;
import de.cooperateproject.ui.focus.manager.IFocusManagerFactory;
import de.cooperateproject.util.editor.ILauncherFileEditorInput;

public class FocusManagerTextualFactory implements IFocusManagerFactory {

    @Override
    public boolean canHandle(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof CooperateCDOXtextEditor) {
            IEditorInput editorInput = ((CooperateCDOXtextEditor) workbenchPart).getEditorInput();
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
