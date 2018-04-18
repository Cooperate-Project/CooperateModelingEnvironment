package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import de.cooperateproject.modeling.textual.component.component.Method;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Method} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class MethodInitializer extends AtomicDerivedStateProcessorBase<Method> {

    /**
     * Instantiates the initializer.
     */
    public MethodInitializer() {
        super(Method.class);
    }

    @Override
    protected void applyTyped(Method object) {
        if (!object.isAbstract() && object.getReferencedElement() != null) {
            object.setAbstract(object.getReferencedElement().isAbstract());
        }
    }

}
