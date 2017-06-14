package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ui.IEditorPart;

public class SaveEditorChange extends Change {

    private final IEditorPart editor;

    public SaveEditorChange(IEditorPart editor) {
        super();
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Save editor";
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
        SubMonitor subMonitor = SubMonitor.convert(pm);
        try {
            SubMonitor childMonitor = subMonitor.newChild(0);
            editor.doSave(childMonitor);
        } finally {
            SubMonitor.done(subMonitor);
        }
        return null;
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
