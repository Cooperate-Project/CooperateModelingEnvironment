package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorExtension;

public class IncludeCalculator implements IAtomicStateProcessorExtension<Include> {

    @Override
    public Boolean apply(Include object) {
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

    @Override
    public Class<Include> getSupportedType() {
        return Include.class;
    }

}
