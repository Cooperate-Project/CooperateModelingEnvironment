package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

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
        UseCase umlIncludingCase = object.getIncludingCase().getReferencedElement();
        UseCase umlAddition = object.getAddition().getReferencedElement();

        if (umlIncludingCase == null || umlAddition == null) {
            return;
        }

        Set<org.eclipse.uml2.uml.Include> candidates = umlIncludingCase.getIncludes().stream()
                .filter(i -> umlAddition == i.getAddition()).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return;
        }
    }

}
