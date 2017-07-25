package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EObject

class SequenceFragmentSequenceHasWrongOrderChecker implements IResolvableChecker<FragmentSequence> {
    
    override isResolvable(FragmentSequence problematicElement) {
        problematicElement.fragments.forall[isElementResolvable]
    }
    
    private def dispatch boolean isElementResolvable(EObject obj) {
        throw new UnsupportedOperationException('''Fragment of type «obj.class» is unknown to the fragment sequence order checker''')
    }
    
    private def dispatch boolean isElementResolvable(Message msg) {
        (msg.left === null ||
            msg.sendEvent.occurenceSpecification.isElementResolvable)
        && (msg.right === null ||
            msg.arrivalEvent.occurenceSpecification.isElementResolvable)
    }
    
    private def dispatch boolean isElementResolvable(UMLReferencingElement<?> obj) {
        obj.referencedElement !== null
    }
}