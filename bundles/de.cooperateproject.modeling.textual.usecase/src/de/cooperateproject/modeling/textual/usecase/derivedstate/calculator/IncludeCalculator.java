package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for include relationships.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class IncludeCalculator extends AtomicDerivedStateProcessorBase<Include> {

    /**
     * Constructs the calculator.
     */
    public IncludeCalculator() {
        super(Include.class);
    }

    @Override
    protected void applyTyped(Include object) {
        Optional<UseCase> umlIncludingCase = Optional.of(object).map(Include::getIncludingCase)
                .map(UMLReferencingElement::getReferencedElement);
        Optional<UseCase> umlAddition = Optional.of(object).map(Include::getAddition)
                .map(UMLReferencingElement::getReferencedElement);

        if (!(umlIncludingCase.isPresent() && umlAddition.isPresent())) {
            return;
        }

        Set<org.eclipse.uml2.uml.Include> candidates = umlIncludingCase.get().getIncludes().stream()
                .filter(i -> umlAddition.get() == i.getAddition()).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return;
        }
    }

}
