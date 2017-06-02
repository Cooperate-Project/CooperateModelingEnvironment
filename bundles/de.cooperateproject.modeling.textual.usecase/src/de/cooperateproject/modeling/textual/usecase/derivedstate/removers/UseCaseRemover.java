package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Removes the state of {@link UseCase} elements.
 */
@Applicability(applicabilities = CLEANING)
public class UseCaseRemover extends AtomicDerivedStateProcessorBase<UseCase> {

    /**
     * Instantiates the remover.
     */
    public UseCaseRemover() {
        super(UseCase.class);
    }

    @Override
    protected void applyTyped(UseCase object) {
        if (object.getReferencedElement() != null) {
            object.unsetAbstract();
        }
    }

}
