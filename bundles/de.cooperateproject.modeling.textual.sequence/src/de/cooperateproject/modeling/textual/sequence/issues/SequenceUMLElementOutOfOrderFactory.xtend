package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage

class SequenceUMLElementOutOfOrderFactory extends SequenceAutomatedIssueResolutionFactoryBase<OrderedFragmentContainer> {
	
	private static val ISSUE_CODE = "umlElementOutOfOrder"
	
	new() {
		super(ISSUE_CODE, new SequenceUMLElementOutOfOrderChecker(), OrderedFragmentContainer)
	}
	
	override protected hasIssueInternal(OrderedFragmentContainer element) {
		// TODO add exception here after implementing #55
        return false
	}
	
	override protected createInternal(OrderedFragmentContainer element) {
		new SequenceUMLElementOutOfOrderResolution(element, resolvableChecker)
	}
	
	override protected getResolutionNameInternal(OrderedFragmentContainer element) {
		"Create UML element";
	}
	
	override protected getIssueDescriptionInternal(OrderedFragmentContainer element) {
		"The UML element does not exist yet.";
	}
	
    override getIssueFeatureInternal(OrderedFragmentContainer eObject) {
        //new IssueLocator(eObject.relevantFeature, eObject)
    }
    
    protected def dispatch relevantFeature(OrderedFragmentContainer element) {
        //SequencePackage.eINSTANCE.orderedFragmentContainer_Fragments
    }
    
}
