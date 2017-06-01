package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class SequenceUMLElementOutOfOrderResolution extends AutomatedIssueResolutionBase<OrderedFragmentContainer> {
    
    new(OrderedFragmentContainer problematicElement, IResolvableChecker<OrderedFragmentContainer> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}