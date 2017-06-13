package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Actor} elements.
 */
@Applicability(applicabilities = CLEANING)
public class ActorRemover extends AtomicDerivedStateProcessorBase<Actor> {

    /**
     * Instantiates the initializer.
     */
    public ActorRemover() {
        super(Actor.class);
    }

    @Override
    protected void applyTyped(Actor object) {
        if (object.getReferencedElement() != null) {
            object.unsetAbstract();
        }
    }

}
