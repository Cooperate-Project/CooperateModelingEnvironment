package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.OccurrenceSpecification
import org.eclipse.uml2.uml.UMLFactory

import static extension de.cooperateproject.modeling.textual.sequence.issues.SequenceDiagramIssueUtils.determineIndexOfFinishExecutionOnLifelineAfter

class SequenceMessageHasInconsistentExecutionSpecificationResolution extends AutomatedIssueResolutionBase<Message> {
    
    new(Message problematicElement, IResolvableChecker<Message> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        if (!resolvePossible) return;
        
        val idx = problematicElement.containingSequence.UMLFragmentSequence.indexOf(problematicElement.arrivalEvent.occurenceSpecification.referencedElement);
        problematicElement.containingSequence.UMLFragmentSequence.add(idx + 1, UMLFactory.eINSTANCE.createBehaviorExecutionSpecification => [
          start = problematicElement.arrivalEvent.occurenceSpecification.referencedElement
          finish = problematicElement.getOrCreateFinishOccurrence
          covereds.add(start.covered)
       ]);   
    }
    
    private def dispatch OccurrenceSpecification getOrCreateFinishOccurrence(Message message) {
        throw new UnsupportedOperationException("Unsupported message type");
    }    
    
    private def dispatch OccurrenceSpecification getOrCreateFinishOccurrence(StandardMessage message) {
        val rsp = SequenceUtils.getResponseCorrespondingToSynchronousMessage(message)
        
        return if (rsp.isPresent) {
            rsp.get.sendEvent.occurenceSpecification.referencedElement
        } else {
            UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification => [
                covered = message.right.referencedElement
                message.containingSequence.UMLFragmentSequence.add(message.right.determineIndexOfFinishExecutionOnLifelineAfter(message), it)
            ]
        }
    }
    

}