package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class SequenceMessageHasInconsistentExecutionSpecificationChecker implements IResolvableChecker<Message> {
    
    override isResolvable(Message element) {
        element.hasReferencedElement && element.isMessageResolvable
    }
    
    private def dispatch boolean isMessageResolvable(Message element)  {
        false
    }
    
    private def dispatch boolean isMessageResolvable(StandardMessage msg)  {
        (msg.type == MessageType.ASYNC)
            || {
                val rsp = SequenceUtils.getResponseCorrespondingToSynchronousMessage(msg)
                (!rsp.present || rsp.get.hasReferencedElement)
            }
    }    
    
    
    
        
}