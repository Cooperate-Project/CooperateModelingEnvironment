package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.changes;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

/**
 * Change that renames a UML element.
 */
public class UMLElementRenameChange extends Change {

    private final String newName;
    private final String newAlias;
    private final NamedElement umlElement;

    /**
     * Initializes the change.
     * 
     * @param umlElement
     *            The element to be renamed.
     * @param newName
     *            The new name of the element.
     * @param newAlias
     */
    public UMLElementRenameChange(NamedElement umlElement, String newName, String newAlias) {
        this.umlElement = umlElement;
        this.newName = newName;
        this.newAlias = newAlias;
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
            String oldAlias = Optional.ofNullable(umlElement.getNameExpression()).map(StringExpression::getName)
                    .orElse(null);
            if (StringUtils.isBlank(newName)) {
                umlElement.unsetName();
            } else {
                umlElement.setName(newName);
            }
            if (StringUtils.isBlank(newAlias)) {
                Optional.ofNullable(umlElement.getNameExpression()).ifPresent(EcoreUtil::delete);
            } else {
                Optional.ofNullable(umlElement.getNameExpression())
                        .orElse(umlElement.createNameExpression(newAlias, null)).setName(newAlias);
            }
            return new UMLElementRenameChange(umlElement, oldName, oldAlias);
        } finally {
            pm.done();
        }
    }

    @Override
    public Object getModifiedElement() {
        return umlElement;
    }

}
