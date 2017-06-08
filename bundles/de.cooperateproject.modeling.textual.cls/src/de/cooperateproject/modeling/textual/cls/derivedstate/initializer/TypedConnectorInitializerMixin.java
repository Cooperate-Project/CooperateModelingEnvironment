package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.DirectedRelationship;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
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
    default void initTypedConnector(TypedConnector<? extends DirectedRelationship> object,
            org.eclipse.uml2.uml.Classifier left, org.eclipse.uml2.uml.Classifier right, Logger logger) {
        UMLReferencingElementFinder finder = UMLReferencingElementFinder.create(EcoreUtil.getRootContainer(object));
        Optional<Classifier<? extends org.eclipse.uml2.uml.Classifier>> leftElement = finder.findElement(left,
                getQueryClass());
        Optional<Classifier<? extends org.eclipse.uml2.uml.Classifier>> rightElement = finder.findElement(right,
                getQueryClass());
        if (leftElement.isPresent() && rightElement.isPresent()) {
            leftElement.ifPresent(object::setLeft);
            rightElement.ifPresent(object::setRight);
        } else {
            logger.error(String.format("The element %s refers to classifiers %s and %s which are not both available.",
                    object, right, left));
        }
    }

    /**
     * @return The type of the left and right features.
     */
    @SuppressWarnings({ "unchecked", "squid:S1452" })
    static Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getQueryClass() {
        return (Class<Classifier<? extends org.eclipse.uml2.uml.Classifier>>) (Class<?>) Classifier.class;
    }

}
