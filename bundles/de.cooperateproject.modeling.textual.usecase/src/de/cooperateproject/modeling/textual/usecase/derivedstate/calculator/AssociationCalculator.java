package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UseCase;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
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
        Optional<Actor> umlActor = Optional.ofNullable(object.getActor())
                .map(UMLReferencingElement::getReferencedElement);
        Optional<UseCase> umlUsecase = Optional.ofNullable(object.getUsecase())
                .map(UMLReferencingElement::getReferencedElement);

        if (umlActor.isPresent() && umlUsecase.isPresent()) {
            Set<org.eclipse.uml2.uml.Association> candidates = umlActor.get().getAssociations().stream()
                    .filter(a -> isAssociationBetween(a, umlActor.get(), umlUsecase.get())).collect(Collectors.toSet());
            if (candidates.size() == 1) {
                object.setReferencedElement(candidates.iterator().next());
                process(object.getActorCardinality(), umlActor.get());
                process(object.getUseCaseCardinality(), umlUsecase.get());
            } else {
                object.setReferencedElement(null);
            }
        } else {
            object.setReferencedElement(null);
        }
    }

    private static void process(Cardinality cardinality, Classifier relatedElement) {
        if (cardinality != null && relatedElement != null) {
            Association association = (Association) cardinality.eContainer();
            if (association.getReferencedElement() != null) {
                Optional<Property> foundElement = association.getReferencedElement().getMemberEnds().stream()
                        .filter(memberEnd -> memberEnd.getType() == relatedElement).findFirst();
                foundElement.ifPresent(cardinality::setReferencedElement);
            }
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
