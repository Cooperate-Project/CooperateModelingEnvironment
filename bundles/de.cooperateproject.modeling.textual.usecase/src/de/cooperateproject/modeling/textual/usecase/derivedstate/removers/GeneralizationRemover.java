package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Generalization} elements.
 */
@Applicability(applicabilities = CLEANING)
public class GeneralizationRemover extends AtomicDerivedStateProcessorBase<Generalization> {

    /**
     * Instantiates the remover.
     */
    public GeneralizationRemover() {
        super(Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {
        if (object.getReferencedElement() != null) {
            object.eUnset(UsecasePackage.Literals.GENERALIZATION__GENERAL);
            object.eUnset(UsecasePackage.Literals.GENERALIZATION__SPECIFIC);
        }
    }

}
