package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.sequence.sequence.Message

class SequenceMessageHasInconsistentExecutionSpecificationChecker implements IResolvableChecker<Message> {
    
    override isResolvable(Message element) {
        false
    }
    
}