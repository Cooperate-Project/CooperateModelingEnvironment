package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import org.eclipse.uml2.uml.DirectedRelationship;

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
            object.eUnset(ClsPackage.Literals.TYPED_CONNECTOR__LEFT);
            object.eUnset(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT);
        }
    }

}
