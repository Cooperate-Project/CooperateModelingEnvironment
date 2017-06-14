package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IReusableEditor;

public class EditorReloadingChange extends Change {

    private final IReusableEditor editor;

    public EditorReloadingChange(IReusableEditor editor) {
        super();
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Reload editor contents";
    }

    @Override
    public void initializeValidationData(IProgressMonitor pm) {
        return;
    }

    @Override
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        return new RefactoringStatus();
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        try {
            pm.beginTask("Reloading editor contents", 0);
            IEditorInput editorInput = editor.getEditorInput();
            editor.getEditorSite().getShell().getDisplay().syncExec(() -> editor.setInput(editorInput));
            return new EditorReloadingChange(editor);
        } finally {
            pm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
