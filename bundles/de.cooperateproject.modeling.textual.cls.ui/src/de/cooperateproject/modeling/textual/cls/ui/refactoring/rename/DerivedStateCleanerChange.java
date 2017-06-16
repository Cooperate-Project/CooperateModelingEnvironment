package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.IReloadingEditor;

public class DerivedStateCleanerChange extends Change {

    private final IReloadingEditor editor;

    public DerivedStateCleanerChange(IReloadingEditor editor) {
        super();
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Clean derived state.";
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
            pm.beginTask(getName(), 0);
            editor.cleanDerivedState();
            return null;
        } finally {
            pm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
