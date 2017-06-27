package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Removes the state of {@link Include} elements.
 */
@Applicability(applicabilities = CLEANING)
public class IncludeRemover extends AtomicDerivedStateProcessorBase<Include> {

    /**
     * Instantiates the remover.
     */
    public IncludeRemover() {
        super(Include.class);
    }

    @Override
    protected void applyTyped(Include object) {
        if (object.getReferencedElement() != null) {
            if (Optional.ofNullable(object.getReferencedElement()).map(org.eclipse.uml2.uml.Include::getAddition)
                    .orElse(null) == Optional.ofNullable(object.getAddition())
                            .map(BehavioredClassifier::getReferencedElement).orElse(null)) {
                object.eUnset(UsecasePackage.Literals.INCLUDE__ADDITION);
            }
            if (Optional.ofNullable(object.getReferencedElement()).map(org.eclipse.uml2.uml.Include::getIncludingCase)
                    .orElse(null) == Optional.ofNullable(object.getIncludingCase())
                            .map(BehavioredClassifier::getReferencedElement).orElse(null)) {
                object.eUnset(UsecasePackage.Literals.INCLUDE__INCLUDING_CASE);
            }
        }
    }

}
