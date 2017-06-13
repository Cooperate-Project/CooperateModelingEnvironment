package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.DirectedRelationship;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link TypedConnector} elements.
 */
@Applicability(applicabilities = CLEANING)
public class TypedConnectorRemover extends AtomicDerivedStateProcessorBase<TypedConnector<DirectedRelationship>> {

    /**
     * Instantiates the remover.
     */
    @SuppressWarnings("unchecked")
    public TypedConnectorRemover() {
        super((Class<TypedConnector<DirectedRelationship>>) (Class<?>) TypedConnector.class);
    }

    @Override
    protected void applyTyped(TypedConnector<DirectedRelationship> object) {
        if (object.getReferencedElement() != null) {
            if (Optional.ofNullable(object.getLeft()).map(Classifier::getReferencedElement)
                    .equals(Optional.ofNullable(object.getReferencedElement()).map(DirectedRelationship::getSources)
                            .flatMap(l -> l.stream().findFirst()))) {
                object.eUnset(ClsPackage.Literals.TYPED_CONNECTOR__LEFT);
            }

            if (Optional.ofNullable(object.getRight()).map(Classifier::getReferencedElement)
                    .equals(Optional.ofNullable(object.getReferencedElement()).map(DirectedRelationship::getTargets)
                            .flatMap(l -> l.stream().findFirst()))) {
                object.eUnset(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT);
            }
        }
    }

}
