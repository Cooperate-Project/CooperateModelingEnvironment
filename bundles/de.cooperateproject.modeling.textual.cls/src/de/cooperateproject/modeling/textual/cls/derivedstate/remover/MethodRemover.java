package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Method} elements.
 */
@Applicability(applicabilities = CLEANING)
public class MethodRemover extends AtomicDerivedStateProcessorBase<Method> {

    /**
     * Instantiates the remover.
     */
    public MethodRemover() {
        super(Method.class);
    }

    @Override
    protected void applyTyped(Method object) {
        if (object.getReferencedElement() != null) {
            object.unsetAbstract();
        }
    }

}
