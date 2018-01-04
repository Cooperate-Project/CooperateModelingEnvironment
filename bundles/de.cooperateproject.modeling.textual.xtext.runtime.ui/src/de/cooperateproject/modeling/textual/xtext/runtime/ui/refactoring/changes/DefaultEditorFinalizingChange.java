package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.changes;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.IReloadingEditor;
import de.cooperateproject.ui.util.editor.UIThreadActionUtil;

/**
 * Default change that finalizes the editor after previous change operations.
 * 
 * Actions:
 * <ul>
 * <li>Reloads the editor contents</li>
 * <li>Saves the editor</li>
 * </ul>
 */
public class DefaultEditorFinalizingChange extends Change {

    private final IReloadingEditor editor;

    /**
     * Instantiates the change.
     * 
     * @param editor
     *            The editor to be finalized.
     */
    public DefaultEditorFinalizingChange(IReloadingEditor editor) {
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
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException {
        return new RefactoringStatus();
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        SubMonitor spm = SubMonitor.convert(pm, getName(), 2);
        try {
            UIThreadActionUtil.perform(() -> {
                spm.split(1);
                editor.reloadDocumentContent();
                SubMonitor childMonitor = spm.split(1);
                editor.doSave(childMonitor);
            });
            return null;
        } finally {
            spm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return null;
    }

}
