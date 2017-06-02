package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import org.eclipse.uml2.uml.DirectedRelationship;

import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * Dummy implementation to enforce providing specific initializers for subtypes of {@link TypedConnector}.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.INITIALIZATION)
public class TypedConnectorInitializer extends AtomicDerivedStateProcessorBase<TypedConnector<DirectedRelationship>> {

    /**
     * Instantiates the initializer.
     */
    @SuppressWarnings("unchecked")
    public TypedConnectorInitializer() {
        super((Class<TypedConnector<DirectedRelationship>>) (Class<?>) TypedConnector.class);
    }

    @Override
    protected void applyTyped(TypedConnector<DirectedRelationship> object) {
        throw new IllegalStateException(String.format(
                "You have to provide specific state processors for the subclasses of %s and replace this one.",
                TypedConnector.class.getSimpleName()));
    }

}
