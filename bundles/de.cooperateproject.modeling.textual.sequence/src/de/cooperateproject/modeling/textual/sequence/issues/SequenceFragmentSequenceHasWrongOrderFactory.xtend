package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceReference
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import java.util.Iterator
import org.eclipse.uml2.uml.InteractionFragment
import org.eclipse.uml2.uml.MessageOccurrenceSpecification

class SequenceFragmentSequenceHasWrongOrderFactory extends SequenceAutomatedIssueResolutionFactoryBase<FragmentSequence> {
	
	private static val ISSUE_CODE = "fragmentSequenceHasWrongOrder"
	
	new() {
		super(ISSUE_CODE, new SequenceFragmentSequenceHasWrongOrderChecker(), FragmentSequence)
	}
	
	override protected createInternal(FragmentSequence element) {
        new SequenceFragmentSequenceHasWrongOrderResolution(element, resolvableChecker)
    }
    
    override protected getIssueDescriptionInternal(FragmentSequence element) {
        "The order of the textual elements does not comply with the order in the uml model."
    }
    
    override protected getIssueFeatureInternal(FragmentSequence element) {
        new IssueLocator(SequencePackage.eINSTANCE.fragmentSequence_Fragments, element)
    }
    
    override protected getResolutionNameInternal(FragmentSequence element) {
            "Adapt order of UML interaction fragments to comply with the textual description";
    }
    
    override protected hasIssueInternal(FragmentSequence element) {
        val umlIter = element.UMLFragmentSequence.iterator
        
        !element.fragments.forall[elementsInOrder(umlIter)]
    }
    
    private def dispatch boolean elementsInOrder(Fragment seqFrag, Iterator<InteractionFragment> umlFrag) {
        true
    }
    
    private def dispatch boolean elementsInOrder(Message seqMsg, Iterator<InteractionFragment> umlFrag) {
        (seqMsg.left === null || 
            seqMsg.sendEvent === null ||
            seqMsg.sendEvent.occurenceSpecification.referencedElement === null ||
            seqMsg.sendEvent.occurenceSpecification.referencedElement == umlFrag.nextRelevantUMLElement
        )
        && (seqMsg.right === null || 
            seqMsg.arrivalEvent === null ||
            seqMsg.arrivalEvent instanceof ExplicitArrivalOccurenceReference ||
            seqMsg.arrivalEvent.occurenceSpecification.referencedElement === null || 
            seqMsg.arrivalEvent.occurenceSpecification.referencedElement == umlFrag.nextRelevantUMLElement
        )
    }
    
    private def dispatch boolean elementsInOrder(UMLReferencingElement<?> seqElement, Iterator<InteractionFragment> umlFrag) {
        seqElement.referencedElement === null || seqElement.referencedElement === umlFrag.nextRelevantUMLElement
    }
    
    
    private def InteractionFragment getNextRelevantUMLElement(Iterator<InteractionFragment> iterator) {
        iterator.findFirst[isRelevantUMLElement]
    }
    
    
    private def dispatch boolean isRelevantUMLElement(InteractionFragment obj) {
        false
    }
    
    private def dispatch boolean isRelevantUMLElement(MessageOccurrenceSpecification obj) {
        true
    }
    
    private def dispatch boolean isRelevantUMLElement(CombinedFragment obj) {
        true
    }
    

	
}
