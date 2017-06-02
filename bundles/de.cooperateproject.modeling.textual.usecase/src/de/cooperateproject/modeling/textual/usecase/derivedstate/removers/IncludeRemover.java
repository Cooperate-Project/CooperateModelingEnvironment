package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

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
            object.eUnset(UsecasePackage.Literals.INCLUDE__ADDITION);
            object.eUnset(UsecasePackage.Literals.INCLUDE__INCLUDING_CASE);
        }
    }

}
