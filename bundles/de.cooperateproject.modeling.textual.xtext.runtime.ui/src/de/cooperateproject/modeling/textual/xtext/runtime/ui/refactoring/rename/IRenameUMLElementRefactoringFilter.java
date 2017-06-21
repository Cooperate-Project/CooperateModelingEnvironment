package de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename;

import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.refactoring.rename.internal.RenameUMLElementRefactoring;

/**
 * Filter to specify the applicability of the {@link RenameUMLElementRefactoring} to objects.
 */
@FunctionalInterface
public interface IRenameUMLElementRefactoringFilter {

    /**
     * Indicates if the given element can be renamed by the refactoring.
     * 
     * @param element
     *            The element to check.
     * @return True, if the element cannot be handled. False, otherwise.
     */
    boolean prohibitRefactoring(UMLReferencingElement<? extends Element> element);

}
