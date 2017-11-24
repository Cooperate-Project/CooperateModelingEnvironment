package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NameOptional;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * Wizard for the UML element rename refactoring.
 * 
 * The wizard basically only queries the new name and issues the refactoring.
 */
public class RenameUMLElementRefactoringWizard extends RefactoringWizard {

    private final WritableValue<String> newName = new WritableValue<>(null, String.class);
    private final WritableValue<String> newAlias = new WritableValue<>(null, String.class);
    private final boolean nameMightBeEmpty;
    private boolean aliasIsAvailable;

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
        aliasIsAvailable = determineIfAliasIsAvailable(namedElement);
        getTypedRefactoring().setElementToRename(namedElement);

        Optional<String> umlName = Optional.ofNullable(namedElement.getReferencedElement()).map(NamedElement::getName);
        Optional<String> umlAlias = Optional.ofNullable(namedElement.getReferencedElement())
                .map(NamedElement::getNameExpression).map(StringExpression::getName);
        String aliasToShow;
        String nameToShow;
        // please refer to handleValuesChanged() for an explanation of this piece of code
        if (umlAlias.isPresent()) {
            aliasToShow = umlName.orElse(null);
            nameToShow = umlAlias.orElse(null);
        } else {
            nameToShow = umlName.orElse(null);
            aliasToShow = null;
        }

        newAlias.setValue(aliasToShow);
        newAlias.addChangeListener(e -> handleValuesChanged());
        newName.setValue(nameToShow);
        newName.addChangeListener(e -> handleValuesChanged());
        getTypedRefactoring().setEditor(editor);
    }

    /**
     * Handles a value change for name or alias.
     * 
     * Attention: The meaning of alias and name of the meta-model is different from the meaning the user
     * knows. For the user, the name is always the ID. The alias is a potential long name. However, in
     * Papyrus we want to display the long name as name and handle the alias as internal ID for the
     * textual view. Therefore, we have to swap alias and name in case of the presence of an alias.
     */
    private void handleValuesChanged() {
        RenameUMLElementRefactoring refactoring = getTypedRefactoring();
        if (StringUtils.isNotBlank(newAlias.getValue())) {
            refactoring.setNewName(newAlias.getValue());
            refactoring.setNewAlias(newName.getValue());
        } else {
            refactoring.setNewName(newName.getValue());
            refactoring.setNewAlias(null);
        }
    }

    private static boolean determineIfNameMightBeEmpty(UMLReferencingElement<NamedElement> namedElement) {
        return namedElement instanceof NameOptional;
    }

    private static boolean determineIfAliasIsAvailable(UMLReferencingElement<NamedElement> namedElement) {
        return namedElement instanceof AliasedElement;
    }

    @Override
    protected void addUserInputPages() {
        addPage(new RenameUMLElementRefactoringWizardUserPage(newName, newAlias, nameMightBeEmpty, aliasIsAvailable));
    }

    protected RenameUMLElementRefactoring getTypedRefactoring() {
        return (RenameUMLElementRefactoring) getRefactoring();
    }

}
