package de.cooperateproject.ui.papyrus.editorlauncher;

import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import de.cooperateproject.ui.focus.manager.IFocusManager;
import de.cooperateproject.ui.focus.manager.IFocusManagerFactory;
import de.cooperateproject.util.editor.ILauncherFileEditorInput;

public class FocusManagerGraphicalFactory implements IFocusManagerFactory {

    @Override
    public boolean canHandle(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof PapyrusMultiDiagramEditor) {
            IEditorPart editor = (IEditorPart) workbenchPart;
            ILauncherFileEditorInput typedEditorInput = editor.getEditorInput()
                    .getAdapter(ILauncherFileEditorInput.class);
            return typedEditorInput != null && typedEditorInput.getAssociatedLauncherFile() != null;
        }
        return false;
    }

    @Override
    public IFocusManager create(IWorkbenchPart workbenchPart) {
        if (canHandle(workbenchPart)) {
            return new FocusManagerGraphical((PapyrusMultiDiagramEditor) workbenchPart);
        }
        throw new IllegalArgumentException(
                String.format("The given workbench part %s is not compatible with this factory.", workbenchPart));
    }

}
