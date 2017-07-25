package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class SequenceMessageHasInconsistentExecutionSpecificationResolution extends AutomatedIssueResolutionBase<Message> {
    
    new(Message problematicElement, IResolvableChecker<Message> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}