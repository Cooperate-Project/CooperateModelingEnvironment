package de.cooperateproject.modeling.textual.common.derivedstate.initializer;

import static de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability.INITIALIZATION;

import java.util.Optional;

import org.eclipse.uml2.uml.MultiplicityElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;

/**
 * State initializer for {@link Cardinality} elements.
 */
@Applicability(applicabilities = INITIALIZATION)
public class CardinalityInitializer extends AtomicDerivedStateProcessorBase<Cardinality> {

    /**
     * Constructs the processor.
     */
    public CardinalityInitializer() {
        super(Cardinality.class);
    }

    @Override
    protected void applyTyped(Cardinality object) {
        if (!object.isSetLowerBound() && !object.isSetUpperBound()) {
            MultiplicityElement umlElement = object.getReferencedElement();
            Optional.ofNullable(umlElement).map(MultiplicityElement::getLower).ifPresent(object::setLowerBound);
            Optional.ofNullable(umlElement).map(MultiplicityElement::getUpper).ifPresent(object::setUpperBound);
        }
    }

}
