package de.cooperateproject.modeling.textual.xtext.runtime.ui.propertytester;

import java.util.Optional;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal.EditorHandlingUtils;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.IRenameUMLElementRefactoringFilter;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal.RenameUMLElementRefactoringFilterRegistry;

/**
 * Property tester that takes an editor and checks if the currently selected element is of type
 * {@link UMLReferencingElement} and references an element of type {@link NamedElement}.
 * Additionally, it applies instances of {@link IRenameUMLElementRefactoringFilter} given via
 * extension points before reporting its decision.
 */
public class UMLReferencingElementSelectionTester extends PropertyTester {

    /**
     * Instantiates the property tester.
     */
    public UMLReferencingElementSelectionTester() {
        super();
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (!(receiver instanceof XtextEditor)) {
            return false;
        }

        XtextEditor editor = (XtextEditor) receiver;
        ISelection selection = editor.getSelectionProvider().getSelection();
        if (!(selection instanceof ITextSelection)) {
            return false;
        }
        ITextSelection textSelection = (ITextSelection) selection;

        Optional<EObject> foundEObject = EditorHandlingUtils.findEObjectAtPosition(editor, textSelection);
        return foundEObject.filter(UMLReferencingElement.class::isInstance).map(UMLReferencingElement.class::cast)
                .filter(e -> !RenameUMLElementRefactoringFilterRegistry.getInstance().getFilters().stream()
                        .anyMatch(f -> f.prohibitRefactoring(e)))
                .map(UMLReferencingElement::getReferencedElement).map(NamedElement.class::isInstance).orElse(false);
    }

}
