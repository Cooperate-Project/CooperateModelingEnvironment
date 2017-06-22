package de.cooperateproject.modeling.textual.usecase.derivedstate.initializers;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cooperateproject.modeling.textual.common.util.UMLReferencingElementFinder;
import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * Initializes the state of {@link Generalization} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class GeneralizationInitializer extends AtomicDerivedStateProcessorBase<Generalization> {

    /**
     * Instantiates the initializer.
     */
    public GeneralizationInitializer() {
        super(Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {
        if (object.getReferencedElement() != null) {
            UMLReferencingElementFinder elementFinder = UMLReferencingElementFinder
                    .create(EcoreUtil.getRootContainer(object));
            if (object.getGeneral() == null) {
                Optional<BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>> foundElement = elementFinder
                        .findElement(object.getReferencedElement().getSpecific(), getBehavioredClassifierClass());
                foundElement.ifPresent(object::setSpecific);
            }
            if (object.getSpecific() == null) {
                Optional<BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>> foundElement = elementFinder
                        .findElement(object.getReferencedElement().getGeneral(), getBehavioredClassifierClass());
                foundElement.ifPresent(object::setGeneral);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static Class<BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>> getBehavioredClassifierClass() {
        return (Class<BehavioredClassifier<org.eclipse.uml2.uml.BehavioredClassifier>>) (Class<?>) BehavioredClassifier.class;
    }

}
