package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import org.eclipse.uml2.uml.ExecutionSpecification

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class SequenceFragmentWithoutOriginatingExecutionSpecificationFactory extends SequenceAutomatedIssueResolutionFactoryBase<Fragment> {
	
	private static val ISSUE_CODE = "fragmentWithoutOriginatingExecutionSpecification"
	
	new() {
		super(ISSUE_CODE, new SequenceFragmentWithoutOriginatingExecutionSpecificationChecker(), Fragment)
	}
	
	override protected createInternal(Fragment element) {
        new SequenceFragmentWithoutOriginatingExecutionSpecificationResolution(element, resolvableChecker)
    }
    
    override protected getIssueDescriptionInternal(Fragment element) {
        '''The fragment «element.toString» occures on a lifeline without an execution specification'''
    }
    
    override protected getIssueFeatureInternal(Fragment element) {
        val index = element.containingSequence.fragments.indexOf(element)
        new IssueLocator(SequencePackage.eINSTANCE.fragmentSequence_Fragments, index, element.containingSequence, element)
    }
    
    override protected getResolutionNameInternal(Fragment element) {
        '''Create root execution specification for originating actor''';
    }
    
    override protected hasIssueInternal(Fragment element) {
        element.fragmentHasIssue  
    }   
    
    private def dispatch boolean fragmentHasIssue(Fragment element) {
        false
    } 
    
    private def dispatch boolean fragmentHasIssue(Message element) {
        if (element.sendEvent?.occurenceSpecification?.referencedElement === null 
            || !(element.containingSequence as UMLReferencingElement<?>).hasReferencedElement) return false
        
        val executionSpecifications = element.containingSequence.UMLFragmentSequence
            .filter(ExecutionSpecification)
            .filter[it.start.covered == element.left.referencedElement]
            .map[#[true->it.start, false->it.finish]]
            .flatten
            .toList
        executionSpecifications.add(true -> element.sendEvent.occurenceSpecification.referencedElement)
            
        executionSpecifications
            .sortWith([a, b| 
                    element.containingSequence.UMLFragmentSequence.indexOf(a.value)
                        .compareTo(element.containingSequence.UMLFragmentSequence.indexOf(b.value))])
            .fold(0->false, [c, e| 
                if (!c.value && e.value !== element.sendEvent.occurenceSpecification.referencedElement) {
                    (if (e.key) c.key+1 else c.key-1)->false
                } else {
                    c.key->true
                }
            ]).key <= 0
    }
    
}
