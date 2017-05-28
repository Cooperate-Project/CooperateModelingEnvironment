package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for associations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class AssociationCalculator extends AtomicDerivedStateProcessorBase<Association> {

    /**
     * Constructs the calculator.
     */
    public AssociationCalculator() {
        super(Association.class);
    }

    @Override
    protected void applyTyped(Association object) {
        if (object.getActor() == null || object.getUsecase() == null) {
            return;
        }

        Actor actor = object.getActor().getReferencedElement();
        UseCase usecase = object.getUsecase().getReferencedElement();

        if (actor == null || usecase == null) {
            return;
        }

        Set<org.eclipse.uml2.uml.Association> matchingAssociations = actor.getAssociations().stream()
                .filter(a -> isAssociationBetween(a, actor, usecase)).collect(Collectors.toSet());
        if (matchingAssociations.size() == 1) {
            object.setReferencedElement(matchingAssociations.iterator().next());
            return;
        }
    }

    private static boolean isAssociationBetween(org.eclipse.uml2.uml.Association a, Classifier c1, Classifier c2) {
        if (a.getMemberEnds().size() == 2) {
            HashSet<Classifier> candidates = Sets.newHashSet(c1, c2);
            long matchingMemberEnds = a.getMemberEnds().stream().map(Property::getType).filter(candidates::contains)
                    .count();
            return matchingMemberEnds == 2;
        }
        return false;
    }

}
