package de.cooperateproject.modeling.textual.component.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.DirectedRelationship;

import de.cooperateproject.modeling.textual.component.component.Classifier;
import de.cooperateproject.modeling.textual.component.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.component.Generalization;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link TypedConnector} elements.
 */
@Applicability(applicabilities = CLEANING)
public class GeneralizationRemover extends AtomicDerivedStateProcessorBase<Generalization> {

    /**
     * Instantiates the remover.
     */
    @SuppressWarnings("unchecked")
    public GeneralizationRemover() {
        super((Class<Generalization>) (Class<?>) Generalization.class);
    }

    @Override
    protected void applyTyped(Generalization object) {
        if (object.getReferencedElement() != null) {
            if (Optional.ofNullable(object.getLeftClassifier()).map(Classifier::getReferencedElement)
                    .equals(Optional.ofNullable(object.getReferencedElement()).map(DirectedRelationship::getSources)
                            .flatMap(l -> l.stream().findFirst()))) {
                object.eUnset(ComponentPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER);
            }

            if (Optional.ofNullable(object.getRightClassifier()).map(Classifier::getReferencedElement)
                    .equals(Optional.ofNullable(object.getReferencedElement()).map(DirectedRelationship::getTargets)
                            .flatMap(l -> l.stream().findFirst()))) {
                object.eUnset(ComponentPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER);
            }
        }
    }
}