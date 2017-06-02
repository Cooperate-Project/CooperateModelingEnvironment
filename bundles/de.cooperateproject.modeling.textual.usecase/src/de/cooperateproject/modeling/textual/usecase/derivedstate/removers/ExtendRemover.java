package de.cooperateproject.modeling.textual.usecase.derivedstate.removers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Extend} elements.
 */
@Applicability(applicabilities = CLEANING)
public class ExtendRemover extends AtomicDerivedStateProcessorBase<Extend> {

    /**
     * Instantiates remover.
     */
    public ExtendRemover() {
        super(Extend.class);
    }

    @Override
    protected void applyTyped(Extend object) {
        if (object.getReferencedElement() != null) {
            object.eUnset(UsecasePackage.Literals.EXTEND__CONDITION);
            object.eUnset(UsecasePackage.Literals.EXTEND__EXTENDED_CASE);
            object.eUnset(UsecasePackage.Literals.EXTEND__EXTENSION);
            object.eUnset(UsecasePackage.Literals.EXTEND__EXTENSION_LOCATION);
        }
    }

}
