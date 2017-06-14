package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class ReloadXtextEditorContent extends Change {

    @Override
    public String getName() {
        return "Reload editor content.";
    }

    @Override
    public void initializeValidationData(IProgressMonitor pm) {
        // TODO Auto-generated method stub

    }

    @Override
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
