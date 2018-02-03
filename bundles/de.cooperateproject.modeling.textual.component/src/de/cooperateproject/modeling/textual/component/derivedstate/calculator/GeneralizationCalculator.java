package de.cooperateproject.modeling.textual.component.derivedstate.calculator;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.component.cmp.Generalization;
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
        if (object.getLeftClassifier() != null && object.getLeftClassifier().getReferencedElement() != null && object.getRightClassifier() != null
                && object.getRightClassifier().getReferencedElement() != null) {
            org.eclipse.uml2.uml.Generalization umlGeneralization = object.getLeftClassifier().getReferencedElement()
                    .getGeneralization(object.getRightClassifier().getReferencedElement());
            object.setReferencedElement(umlGeneralization);
            return;
        }
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}