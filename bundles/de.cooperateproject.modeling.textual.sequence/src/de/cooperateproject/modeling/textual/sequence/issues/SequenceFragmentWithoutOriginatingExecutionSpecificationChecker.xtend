package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement

class SequenceFragmentWithoutOriginatingExecutionSpecificationChecker implements IResolvableChecker<Fragment> {
    
    override isResolvable(Fragment element) {
        element.internalIsResolvable
    }
    
    private def dispatch internalIsResolvable(Fragment element) {
        false
    }
    
    private def dispatch internalIsResolvable(Message element) {
        element.left !== null && element.left.referencedElement !== null
            && (element.containingSequence as UMLReferencingElement<?>).referencedElement !== null
    }
    
}