package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Association} and contains {@link Cardinality} elements.
 */
@Applicability(applicabilities = CLEANING)
public class AssociationRemover extends AtomicDerivedStateProcessorBase<Association> {

    /**
     * Instantiates the remover.
     */
    public AssociationRemover() {
        super(Association.class);
    }

    @Override
    protected void applyTyped(Association object) {
        process(object.getActorCardinality());
        process(object.getUseCaseCardinality());
    }

    private static void process(Cardinality cardinality) {
        if (cardinality != null && cardinality.getReferencedElement() != null) {
            cardinality.unsetLowerBound();
            cardinality.unsetUpperBound();
        }
    }

}
