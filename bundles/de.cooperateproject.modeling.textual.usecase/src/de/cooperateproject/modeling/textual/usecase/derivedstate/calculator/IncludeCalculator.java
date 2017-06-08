package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorExtensionBase;

/**
 * State calculator for include relationships.
 */
public class IncludeCalculator extends AtomicStateProcessorExtensionBase<Include> {

    /**
     * Constructs the calculator.
     */
    public IncludeCalculator() {
        super(Include.class);
    }

    @Override
    protected Boolean applyTyped(Include object) {
        UseCase umlIncludingCase = object.getIncludingCase().getReferencedElement();
        UseCase umlAddition = object.getAddition().getReferencedElement();

        if (umlIncludingCase == null || umlAddition == null) {
            return false;
        }

        Set<org.eclipse.uml2.uml.Include> candidates = umlIncludingCase.getIncludes().stream()
                .filter(i -> umlAddition == i.getAddition()).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return true;
        }

        return false;
    }

}
