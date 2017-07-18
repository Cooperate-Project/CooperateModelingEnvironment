package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link UseCase} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class UseCaseInitializer extends AtomicDerivedStateProcessorBase<UseCase> {

    /**
     * Instantiates the initializer.
     */
    public UseCaseInitializer() {
        super(UseCase.class);
    }

    @Override
    protected void applyTyped(UseCase object) {
        if (!object.isSetAbstract() && object.getReferencedElement() != null) {
            object.setAbstract(object.getReferencedElement().isAbstract());
        }
    }

}
