package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.Feature;

import de.cooperateproject.modeling.textual.component.cmp.Member;
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
        Optional<org.eclipse.uml2.uml.Feature> umlmember = Optional.ofNullable(object.getReferencedElement());
        if (umlmember.map(member -> member.isStatic() == object.isStatic()).orElse(false)) {
            object.unsetStatic();
        } else if (!object.isSetStatic() && undergoesAutomatedIssueResolution(object)) {
            object.setStatic(false);
        }
    }

}
