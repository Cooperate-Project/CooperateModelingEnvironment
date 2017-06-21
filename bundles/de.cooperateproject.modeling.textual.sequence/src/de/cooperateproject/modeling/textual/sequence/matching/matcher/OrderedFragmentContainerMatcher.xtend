package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.InteractionOperand

class OrderedFragmentContainerMatcher extends AbstractElementMatcherBase<OrderedFragmentContainer, InteractionOperand> {
    new() {
        super(OrderedFragmentContainer, InteractionOperand)
    }
    
    override match() {
        #[
            is([l, r | (l.condition === null && r.guard?.specification?.stringValue === null) 
                || l.condition.condition == r.guard?.specification?.stringValue]),
            matches([fragments], [fragments])    
        ]
    }
    
}