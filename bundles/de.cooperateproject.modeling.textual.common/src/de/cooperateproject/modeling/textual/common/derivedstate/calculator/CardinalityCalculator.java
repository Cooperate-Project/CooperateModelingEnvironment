package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculation for {@link Cardinality} elements.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class CardinalityCalculator extends AtomicDerivedStateProcessorBase<Cardinality> {

    /**
     * Instantiates the calculator.
     */
    public CardinalityCalculator() {
        super(Cardinality.class);
    }

    @Override
    protected void applyTyped(Cardinality object) {
        if (isUnlimited(object.getLowerBound())) {
            object.setLowerBound(0);
            object.setUpperBound(-1);
        } else if (isLess(object.getUpperBound(), object.getLowerBound())) {
            object.setUpperBound(object.getLowerBound());
        }
    }

    private static boolean isLess(int boundA, int boundB) {
        if (isUnlimited(boundA)) {
            return false;
        }
        if (isUnlimited(boundB)) {
            return true;
        }
        return boundA < boundB;
    }

    private static boolean isUnlimited(int bound) {
        return bound < 0;
    }

}
