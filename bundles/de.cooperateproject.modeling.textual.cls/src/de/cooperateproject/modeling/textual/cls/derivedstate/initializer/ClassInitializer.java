package de.cooperateproject.modeling.textual.cls.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Class} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class ClassInitializer
        extends AtomicDerivedStateProcessorBase<de.cooperateproject.modeling.textual.cls.cls.Class> {

    /**
     * Constructs the initializer.
     */
    public ClassInitializer() {
        super(de.cooperateproject.modeling.textual.cls.cls.Class.class);
    }

    @Override
    protected void applyTyped(Class object) {
        if (!object.isSetAbstract() && object.getReferencedElement() != null) {
            object.setAbstract(object.getReferencedElement().isAbstract());
        }
    }

}
