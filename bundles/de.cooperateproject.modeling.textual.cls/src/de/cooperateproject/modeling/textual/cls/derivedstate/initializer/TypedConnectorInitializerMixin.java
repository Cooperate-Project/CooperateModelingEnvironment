package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;

import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;

/**
 * Mixin that provides utility methods for initializing a {@link TypedConnector} element.
 */
public interface TypedConnectorInitializerMixin {

    /**
     * Initializes the features of a typed connector.
     * 
     * This initializes {@link TypedConnector#getLeft()} and {@link TypedConnector#getRight()}.
     * 
     * @param object
     *            The typed connector to initialize.
     * @param left
     *            The UML element on the left side.
     * @param right
     *            The UML element on the right side.
     * @param logger
     *            A logger to log errors during initialization.
     */
    @SuppressWarnings("unchecked")
    default void initTypedConnector(TypedConnector<? extends DirectedRelationship> object, Element left, Element right,
            Logger logger) {
        UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
        Optional<UMLReferencingElement<? extends Element>> leftElement = finder.findElement(left);
        Optional<UMLReferencingElement<? extends Element>> rightElement = finder.findElement(right);
        if (leftElement.isPresent() && rightElement.isPresent()) {
            object.setLeft((de.cooperateproject.modeling.textual.cls.cls.Classifier<Classifier>) leftElement.get());
            object.setRight((de.cooperateproject.modeling.textual.cls.cls.Classifier<Classifier>) rightElement.get());
        } else {
            logger.error(String.format("The element %s refers to classifiers %s and %s which are not both available.",
                    object, right, left));
        }
    }

}
