package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.changes;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.IReloadingEditor;

/**
 * Default change that prepares the editor for following change operations.
 * 
 * Precondition: The change assumes are clean editor state.
 * 
 * Action: Clean the derived editor state.
 */
public class DefaultEditorPreparationChange extends Change {

    private final IReloadingEditor editor;

    /**
     * Initializes the change.
     * 
     * @param editor
     *            The editor that shall be prepared.
     */
    public DefaultEditorPreparationChange(IReloadingEditor editor) {
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Prepare editor";
    }

    @Override
    public void initializeValidationData(IProgressMonitor pm) {
        return;
    }

    @Override
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException {
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
