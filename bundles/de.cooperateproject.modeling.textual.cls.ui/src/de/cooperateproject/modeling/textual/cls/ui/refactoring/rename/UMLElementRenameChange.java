package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.uml2.uml.NamedElement;

public class UMLElementRenameChange extends Change {

    private final String newName;
    private final NamedElement umlElement;

    public UMLElementRenameChange(NamedElement referencedElement, String newName) {
        this.umlElement = referencedElement;
        this.newName = newName;
    }

    @Override
    public String getName() {
        return String.format("Rename UML element %s to %s.", umlElement.getName(), newName);
    }

    @Override
    public void initializeValidationData(IProgressMonitor pm) {
    }

    @Override
    public RefactoringStatus isValid(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        // we should check this, most probably
        return new RefactoringStatus();
    }

    @Override
    public Change perform(IProgressMonitor pm) throws CoreException {
        String oldName = umlElement.getName();
        umlElement.setName(newName);
        return new UMLElementRenameChange(umlElement, oldName);
    }

    @Override
    public Object getModifiedElement() {
        return umlElement;
    }

}
