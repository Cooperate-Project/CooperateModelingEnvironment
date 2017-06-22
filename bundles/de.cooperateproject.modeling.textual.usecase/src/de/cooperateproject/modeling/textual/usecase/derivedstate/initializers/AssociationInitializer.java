package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.UseCase;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Association} elements including {@link Cardinality} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class AssociationInitializer extends AtomicDerivedStateProcessorBase<Association> {

    /**
     * Instantiates the initializer.
     */
    public AssociationInitializer() {
        super(Association.class);
    }

    @Override
    protected void applyTyped(Association object) {
        if (object.getReferencedElement() != null) {
            if (object.getActor() == null) {
                processActor(object);
            }
            if (object.getUsecase() == null) {
                processUseCase(object);
            }
        }

        process(object.getActorCardinality());
        process(object.getUseCaseCardinality());
    }

    private static void processUseCase(Association object) {
        UMLReferencingElementFinder elementFinder = UMLReferencingElementFinder
                .create(EcoreUtil.getRootContainer(object));
        object.getReferencedElement().getMemberEnds().stream()
                .filter(memberEnd -> memberEnd.getType() instanceof UseCase).findFirst()
                .ifPresent(memberEnd -> elementFinder
                        .findElement(memberEnd.getType(),
                                de.cooperateproject.modeling.textual.usecase.usecase.UseCase.class)
                        .ifPresent(object::setUsecase));
    }

    private static void processActor(Association object) {
        UMLReferencingElementFinder elementFinder = UMLReferencingElementFinder
                .create(EcoreUtil.getRootContainer(object));
        object.getReferencedElement().getMemberEnds().stream().filter(memberEnd -> memberEnd.getType() instanceof Actor)
                .findFirst()
                .ifPresent(memberEnd -> elementFinder
                        .findElement(memberEnd.getType(),
                                de.cooperateproject.modeling.textual.usecase.usecase.Actor.class)
                        .ifPresent(object::setActor));
    }

    private static void process(Cardinality cardinality) {
        if (cardinality == null) {
            return;
        }
        if (!cardinality.isSetLowerBound()) {
            Optional.ofNullable(cardinality.getReferencedElement()).map(MultiplicityElement::getLower)
                    .ifPresent(cardinality::setLowerBound);
        }
        if (!cardinality.isSetUpperBound()) {
            Optional.ofNullable(cardinality.getReferencedElement()).map(MultiplicityElement::getUpper)
                    .ifPresent(cardinality::setUpperBound);
        }
    }

}
