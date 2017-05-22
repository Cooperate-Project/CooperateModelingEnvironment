package de.cooperateproject.modeling.textual.common.derivedstate.calculator;

import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculator for visibility having elements.
 */
public class VisibilityHavingElementCalculator extends AtomicStateProcessorExtensionBase<VisibilityHavingElement> {

    /**
     * Constructs the calculator.
     */
    public VisibilityHavingElementCalculator() {
        super(VisibilityHavingElement.class);
    }

    @Override
    protected Boolean applyTyped(VisibilityHavingElement object) {
        if (object.isSetVisibility() || !(object instanceof UMLReferencingElement)) {
            return false;
        }

        @SuppressWarnings("unchecked")
        NamedElement referencedElement = ((UMLReferencingElement<NamedElement>) object).getReferencedElement();
        if (referencedElement == null) {
            return false;
        }

        if (referencedElement.isSetVisibility()) {
            object.setVisibility(referencedElement.getVisibility());
        } else {
            object.unsetVisibility();
        }
        return true;
    }
}
