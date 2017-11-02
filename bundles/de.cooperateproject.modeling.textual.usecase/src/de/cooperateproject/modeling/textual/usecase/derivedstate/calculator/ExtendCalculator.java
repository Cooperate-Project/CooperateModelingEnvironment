package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
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

        Optional<UseCase> umlExtendedCase = Optional.of(object).map(Extend::getExtendedCase)
                .map(UMLReferencingElement::getReferencedElement);
        Optional<UseCase> umlExtension = Optional.of(object).map(Extend::getExtension)
                .map(UMLReferencingElement::getReferencedElement);
        Optional<org.eclipse.uml2.uml.ExtensionPoint> umlExtensionPoint = Optional.of(object)
                .map(Extend::getExtensionLocation).map(UMLReferencingElement::getReferencedElement);

        if (!(umlExtendedCase.isPresent() && umlExtension.isPresent() && umlExtensionPoint.isPresent())) {
            return;
        }

        Set<org.eclipse.uml2.uml.Extend> candidates = umlExtension.get().getExtends().stream()
                .filter(e -> e.getExtensionLocations().contains(umlExtensionPoint.get())).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return;
        }
    }

}
