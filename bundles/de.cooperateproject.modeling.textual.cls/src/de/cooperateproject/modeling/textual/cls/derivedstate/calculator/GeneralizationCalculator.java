package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for generalizations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class GeneralizationCalculator extends AtomicDerivedStateProcessorBase<Generalization> {

    /**
     * Constructs the calculator.
     */
    public GeneralizationCalculator() {
        super(Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {
        if (object.getLeft() != null && object.getLeft().getReferencedElement() != null && object.getRight() != null
                && object.getRight().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getLeft().getReferencedElement()
                    .getGeneralization(object.getRight().getReferencedElement());
            object.setReferencedElement(umlGeneralization);
            return;
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
