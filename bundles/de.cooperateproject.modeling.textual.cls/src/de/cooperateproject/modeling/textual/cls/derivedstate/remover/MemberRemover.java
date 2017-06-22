package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import org.eclipse.uml2.uml.Feature;

import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Member} elements.
 */
@Applicability(applicabilities = CLEANING)
public class MemberRemover extends AtomicDerivedStateProcessorBase<Member<Feature>> {

    /**
     * Instantiates the remover.
     */
    @SuppressWarnings("unchecked")
    public MemberRemover() {
        super((Class<Member<Feature>>) (Class<?>) Member.class);
    }

    @Override
    protected void applyTyped(Member<Feature> object) {
        if (object.getReferencedElement() != null) {
            object.unsetStatic();
        }
    }

}
