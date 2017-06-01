package de.cooperateproject.modeling.textual.common.util;

import java.util.Optional;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

/**
 * Utility class for looking up {@link UMLReferencingElement} elements.
 */
public class UMLReferencingElementFinder {

    private final EObject rootElement;

    protected UMLReferencingElementFinder(EObject rootElement) {
        this.rootElement = rootElement;
    }

    /**
     * Creates a new instance of {@link UMLReferencingElementFinder}.
     * 
     * @param rootElement
     *            The root element of the model to be checked. This has to be the model that contains
     *            {@link UMLReferencingElement} elements.
     * @return The instance of the finder.
     */
    public static UMLReferencingElementFinder create(EObject rootElement) {
        return new UMLReferencingElementFinder(rootElement);
    }

    /**
     * Finds a {@link UMLReferencingElement} element by its referenced UML element.
     * 
     * @param umlElement
     *            The element referenced by the wanted {@link UMLReferencingElement}.
     * @return The found element or {@link Optional#empty()} if no such element could be found.
     */
    @SuppressWarnings("unchecked")
    public <T extends Element> Optional<UMLReferencingElement<? extends T>> findElement(T umlElement) {
        for (TreeIterator<EObject> contentIter = rootElement.eAllContents(); contentIter.hasNext();) {
            EObject contentElement = contentIter.next();
            if (!TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT.isInstance(contentElement)) {
                continue;
            }

            Object referencedUMlElement = contentElement
                    .eGet(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
            if (referencedUMlElement == umlElement) {
                return Optional.of((UMLReferencingElement<? extends T>) contentElement);
            }
        }

        return Optional.empty();
    }

}
