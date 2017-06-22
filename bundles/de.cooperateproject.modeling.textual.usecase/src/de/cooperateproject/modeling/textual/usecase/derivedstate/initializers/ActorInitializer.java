package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializer for state of {@link Actor} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ActorInitializer extends AtomicDerivedStateProcessorBase<Actor> {

    /**
     * Instantiates initializer.
     */
    public ActorInitializer() {
        super(Actor.class);
    }

    @Override
    protected void applyTyped(Actor object) {
        if (object.getReferencedElement() != null && !object.isSetAbstract()) {
            object.setAbstract(object.getReferencedElement().isAbstract());
        }
    }

}
