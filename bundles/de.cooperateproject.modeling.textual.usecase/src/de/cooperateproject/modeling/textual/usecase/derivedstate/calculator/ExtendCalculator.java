package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorExtension;

public class ExtendCalculator implements IAtomicStateProcessorExtension<Extend> {

    @Override
    public Boolean apply(Extend object) {
        UseCase umlExtendedCase = object.getExtendedCase().getReferencedElement();
        UseCase umlExtension = object.getExtension().getReferencedElement();
        org.eclipse.uml2.uml.ExtensionPoint umlExtensionPoint = object.getExtensionLocation().getReferencedElement();

        if (umlExtendedCase == null || umlExtension == null || umlExtensionPoint == null) {
            return false;
        }

        Set<org.eclipse.uml2.uml.Extend> candidates = umlExtension.getExtends().stream()
                .filter(e -> e.getExtensionLocations().contains(umlExtensionPoint)).collect(Collectors.toSet());
        if (candidates.size() == 1) {
            object.setReferencedElement(candidates.iterator().next());
            return true;
        }

        return false;
    }

    @Override
    public Class<Extend> getSupportedType() {
        return Extend.class;
    }

}
