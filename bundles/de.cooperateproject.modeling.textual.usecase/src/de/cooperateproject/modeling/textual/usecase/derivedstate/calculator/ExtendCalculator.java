package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for extend relationships.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class ExtendCalculator extends AtomicDerivedStateProcessorBase<Extend> {

    /**
     * Constructs the calculator.
     */
    public ExtendCalculator() {
        super(Extend.class);
    }

    @Override
    protected void applyTyped(Extend object) {
        UseCase umlExtendedCase = object.getExtendedCase().getReferencedElement();
        UseCase umlExtension = object.getExtension().getReferencedElement();
        org.eclipse.uml2.uml.ExtensionPoint umlExtensionPoint = object.getExtensionLocation().getReferencedElement();

        if (umlExtendedCase == null || umlExtension == null || umlExtensionPoint == null) {
            return;
        }

        Set<org.eclipse.uml2.uml.Extend> candidates = umlExtension.getExtends().stream()
                .filter(e -> e.getExtensionLocations().contains(umlExtensionPoint)).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return;
        }
    }

}
