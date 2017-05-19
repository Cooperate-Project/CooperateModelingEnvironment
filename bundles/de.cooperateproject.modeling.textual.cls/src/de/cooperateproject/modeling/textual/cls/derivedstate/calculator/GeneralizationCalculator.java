package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculator for generalizations.
 */
public class GeneralizationCalculator extends AtomicStateProcessorExtensionBase<Generalization> {

    /**
     * Constructs the calculator.
     */
    public GeneralizationCalculator() {
        super(Generalization.class);
    }

    @Override
    protected Boolean applyTyped(Generalization object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getLeft().getReferencedElement()
                    .getGeneralization(object.getRight().getReferencedElement());
            object.setReferencedElement(umlGeneralization);
            return true;
        }
        return false;
    }

    @Override
    public Class<Generalization> getSupportedType() {
        return Generalization.class;
    }

}
