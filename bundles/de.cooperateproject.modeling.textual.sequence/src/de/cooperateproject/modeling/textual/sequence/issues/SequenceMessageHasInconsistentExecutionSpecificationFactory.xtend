package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import org.eclipse.uml2.uml.ExecutionSpecification
import org.eclipse.uml2.uml.OccurrenceSpecification

class SequenceMessageHasInconsistentExecutionSpecificationFactory extends SequenceAutomatedIssueResolutionFactoryBase<Message> {
	
	public static val ISSUE_CODE = "fragmentSequenceHasInconsistentExecutionSpecification"
	
	new() {
		super(ISSUE_CODE, new SequenceMessageHasInconsistentExecutionSpecificationChecker(), Message)
	}
	
	override protected createInternal(Message element) {
        new SequenceMessageHasInconsistentExecutionSpecificationResolution(element, resolvableChecker)
    }
    
    override protected getIssueDescriptionInternal(Message element) {
        '''The message «element.name» has an inconsistent execution specification'''
    }
    
    override protected getIssueFeatureInternal(Message element) {
        val index = element.containingSequence.fragments.indexOf(element)
        new IssueLocator(SequencePackage.eINSTANCE.fragmentSequence_Fragments, index, element.containingSequence, element)
    }
    
    override protected getResolutionNameInternal(Message element) {
        '''Correct execution specification for «element.name».''';
    }
    
    override protected hasIssueInternal(Message element) {
        element.messageHasIssue
    }
    
    private def dispatch messageHasIssue(ResponseMessage msg) {
        val umlOcc = msg.sendEvent?.occurenceSpecification?.referencedElement
        if (umlOcc === null) return false
        val request = msg.correspondingRequest
        
        umlOcc.getExecutionSpecification[finish] != 
            request.arrivalEvent.occurenceSpecification.referencedElement.getExecutionSpecification[start]
    }
    
    private def dispatch messageHasIssue(Message msg) {
        val umlOcc = msg.arrivalEvent?.occurenceSpecification?.referencedElement
        if (umlOcc === null) return false
        
        umlOcc.getExecutionSpecification[start] === null
    }
    
    private def ExecutionSpecification getExecutionSpecification(OccurrenceSpecification occSpec, (ExecutionSpecification)=>OccurrenceSpecification featureGet) {
        var container = occSpec.eContainer
        
        while(container !== null) {
            val cand = container.eContents.filter(ExecutionSpecification).findFirst[featureGet.apply(it) == occSpec]
            if (cand !== null) return cand
            container = container.eContainer
        }
        
        null
    }
    
    
    
}
