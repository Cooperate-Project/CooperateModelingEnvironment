package de.cooperateproject.modeling.textual.sequence.matching.matcher

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.xtext.runtime.matching.matcher.AbstractElementMatcherBase
import org.eclipse.uml2.uml.InteractionOperand
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import org.eclipse.uml2.uml.UMLPackage

class OrderedFragmentContainerMatcher extends AbstractElementMatcherBase<OrderedFragmentContainer, InteractionOperand> {
    new() {
        super(SequencePackage.eINSTANCE.orderedFragmentContainer, UMLPackage.eINSTANCE.interactionOperand)
    }
    
    override match() {
        #[
            is([l, r | (l.condition === null && r.guard?.specification?.stringValue === null) 
                || l.condition.condition == r.guard?.specification?.stringValue]),
            matchesExist([fragments], [fragments])    
        ]
    }
    
}