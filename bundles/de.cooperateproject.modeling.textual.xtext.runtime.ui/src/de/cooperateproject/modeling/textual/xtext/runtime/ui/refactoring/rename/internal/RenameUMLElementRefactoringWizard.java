package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import java.util.Optional;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NameOptional;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * Wizard for the UML element rename refactoring.
 * 
 * The wizard basically only queries the new name and issues the refactoring.
 */
public class RenameUMLElementRefactoringWizard extends RefactoringWizard {

    private final WritableValue<String> newName = new WritableValue<>(null, String.class);
    private final boolean nameMightBeEmpty;

    /**
     * Instantiates the wizard.
     * 
     * @param namedElement
     *            The UML element to be renamed.
     * @param editor
     *            The editor that called the wizard.
     */
    public RenameUMLElementRefactoringWizard(UMLReferencingElement<NamedElement> namedElement, IEditorPart editor) {
        super(new RenameUMLElementRefactoring(), RefactoringWizard.DIALOG_BASED_USER_INTERFACE);
        nameMightBeEmpty = determineIfNameMightBeEmpty(namedElement);
        getTypedRefactoring().setElementToRename(namedElement);
        newName.addChangeListener(e -> getTypedRefactoring().setNewName(newName.getValue()));
        newName.setValue(
                Optional.ofNullable(namedElement.getReferencedElement()).map(NamedElement::getName).orElse(null));
        getTypedRefactoring().setEditor(editor);
    }

    private static boolean determineIfNameMightBeEmpty(UMLReferencingElement<NamedElement> namedElement) {
        return namedElement instanceof NameOptional;
    }

    @Override
    protected void addUserInputPages() {
        addPage(new RenameUMLElementRefactoringWizardUserPage(newName, nameMightBeEmpty));
    }

    protected RenameUMLElementRefactoring getTypedRefactoring() {
        return (RenameUMLElementRefactoring) getRefactoring();
    }

}
