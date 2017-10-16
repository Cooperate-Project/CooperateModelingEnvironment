package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.changes;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Change that renames a UML element.
 */
public class UMLElementRenameChange extends Change {

    private final String newName;
    private final NamedElement umlElement;

    /**
     * Initializes the change.
     * 
     * @param umlElement
     *            The element to be renamed.
     * @param newName
     *            The new name of the element.
     */
    public UMLElementRenameChange(NamedElement umlElement, String newName) {
        this.umlElement = umlElement;
        this.newName = newName;
    }

    @Override
    public String getName() {
        return String.format("Rename UML element %s to %s.", umlElement.getName(), newName);
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
        pm.beginTask(getName(), 0);
        try {
            String oldName = umlElement.getName();
            if (StringUtils.isBlank(newName)) {
                umlElement.unsetName();
            } else {
                umlElement.setName(newName);
            }
            return new UMLElementRenameChange(umlElement, oldName);
        } finally {
            pm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return umlElement;
    }

}
