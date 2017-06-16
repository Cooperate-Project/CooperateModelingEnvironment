package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import java.util.Optional;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

public class RenameRefactoringWizard extends RefactoringWizard {

    private final WritableValue<String> newName = new WritableValue<>(null, String.class);

    public RenameRefactoringWizard(UMLReferencingElement<NamedElement> namedElement, IEditorPart editor) {
        super(new RenameRefactoring(), RefactoringWizard.DIALOG_BASED_USER_INTERFACE);
        getTypedRefactoring().setElementToRename(namedElement);
        newName.addChangeListener(e -> getTypedRefactoring().setNewName(newName.getValue()));
        newName.setValue(
                Optional.ofNullable(namedElement.getReferencedElement()).map(NamedElement::getName).orElse(null));
        getTypedRefactoring().setEditor(editor);
    }

    @Override
    protected void addUserInputPages() {
        addPage(new RenameRefactoringWizardUserPage(newName));
    }

    protected RenameRefactoring getTypedRefactoring() {
        return (RenameRefactoring) getRefactoring();
    }

}
