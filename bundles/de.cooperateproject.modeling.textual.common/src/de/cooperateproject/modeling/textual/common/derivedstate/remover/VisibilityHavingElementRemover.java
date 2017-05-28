package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State remover for VisibilityHavingElement.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CLEANING)
public class VisibilityHavingElementRemover extends AtomicDerivedStateProcessorBase<VisibilityHavingElement> {

    /**
     * Constructs the remover.
     */
    public VisibilityHavingElementRemover() {
        super(VisibilityHavingElement.class);
    }

    @Override
    protected void applyTyped(VisibilityHavingElement object) {
        object.unsetVisibility();
    }

}
