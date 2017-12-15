package de.cooperateproject.modeling.textual.component.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import org.eclipse.uml2.uml.Feature;

import de.cooperateproject.modeling.textual.component.cmp.Member;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializer for state of {@link Member} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class MemberInitializer extends AtomicDerivedStateProcessorBase<Member<Feature>> {

    /**
     * Instantiates the
     */
    @SuppressWarnings("unchecked")
    public MemberInitializer() {
        super((Class<Member<Feature>>) (Class<?>) Member.class);
    }

    @Override
    protected void applyTyped(Member<Feature> object) {
        if (!object.isStatic() && object.getReferencedElement() != null) {
            object.setStatic(object.getReferencedElement().isStatic());
        }
    }

}
