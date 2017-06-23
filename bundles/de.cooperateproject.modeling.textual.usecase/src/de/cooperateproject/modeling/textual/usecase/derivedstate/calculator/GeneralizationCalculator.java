package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Optional;

import org.eclipse.uml2.uml.Classifier;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
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
        Optional<Classifier> umlSpecific = Optional.ofNullable(object.getSpecific())
                .map(UMLReferencingElement::getReferencedElement);
        Optional<Classifier> umlGeneral = Optional.ofNullable(object.getGeneral())
                .map(UMLReferencingElement::getReferencedElement);

        if (!umlSpecific.isPresent() || !umlGeneral.isPresent()) {
            return;
        }

        org.eclipse.uml2.uml.Generalization umlGeneralization = umlSpecific.get().getGeneralization(umlGeneral.get());
        if (umlGeneralization != null) {
            object.setReferencedElement(umlGeneralization);
        }
    }

}
