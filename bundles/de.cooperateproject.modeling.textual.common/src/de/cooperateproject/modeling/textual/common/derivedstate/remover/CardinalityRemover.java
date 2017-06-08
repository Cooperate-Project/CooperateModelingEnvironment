package de.cooperateproject.modeling.textual.common.derivedstate.remover;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.CLEANING;

import java.util.Optional;

import org.eclipse.uml2.uml.MultiplicityElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State remover for {@link Cardinality} elements.
 */
@Applicability(applicabilities = CLEANING)
public class CardinalityRemover extends AtomicDerivedStateProcessorBase<Cardinality> {

    /**
     * Instantiates the processor.
     */
    public CardinalityRemover() {
        super(Cardinality.class);
    }

    @Override
    protected void applyTyped(Cardinality object) {
        Optional<MultiplicityElement> umlElement = Optional.ofNullable(object.getReferencedElement());
        if (umlElement.isPresent()) {
            if (umlElement.map(MultiplicityElement::getLower).equals(Optional.ofNullable(object.getLowerBound()))) {
                object.unsetLowerBound();
            }
            if (umlElement.map(MultiplicityElement::getUpper).equals(Optional.ofNullable(object.getUpperBound()))) {
                object.unsetUpperBound();
            }
        }
    }

}
