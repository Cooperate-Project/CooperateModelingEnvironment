package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State remover for VisibilityHavingElement.
 */
public class VisibilityHavingElementRemover extends AtomicStateProcessorExtensionBase<VisibilityHavingElement> {

    /**
     * Constructs the remover.
     */
    public VisibilityHavingElementRemover() {
        super(VisibilityHavingElement.class);
    }

    @Override
    protected Boolean applyTyped(VisibilityHavingElement object) {
        object.unsetVisibility();
        return true;
    }

}
