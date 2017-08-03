package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.InteractionFragment
import org.eclipse.uml2.uml.ExecutionSpecification
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification

class SequenceFragmentSequenceHasWrongOrderResolution extends AutomatedIssueResolutionBase<FragmentSequence> {
    new(FragmentSequence problematicElement, IResolvableChecker<FragmentSequence> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        if (!resolvePossible) return;
        
        problematicElement.fragments.fold(0, [idx, frag |
            frag.checkAndFix(idx).skipUMLElementsIfNecessary
        ])
    }
    
    private def dispatch int checkAndFix(Fragment fragment, int umlIndex) {
        throw new UnsupportedOperationException('''The fragment type «fragment.class» is not supported by the resolver''')
    }
    
    
    private def dispatch int checkAndFix(CombinedFragment fragment, int umlIndex) {
        fragment.checkAndFixUMLReferencingElement(umlIndex)
    } 
    
    private def dispatch int checkAndFix(Message msg, int umlIndex) {
        var index = umlIndex
        if (msg.left !== null) {
            index = msg.sendEvent.occurenceSpecification.checkAndFixUMLReferencingElement(index)
        }
        if (msg.right !== null) {
            index = msg.arrivalEvent.occurenceSpecification.checkAndFixUMLReferencingElement(index)
        }
        index
    } 
    
    private def int checkAndFixUMLReferencingElement(UMLReferencingElement<? extends InteractionFragment> element, int umlIndex) {
        if (problematicElement.UMLFragmentSequence.get(umlIndex) !== element.referencedElement) {
            val idx = problematicElement.UMLFragmentSequence.indexOf(element.referencedElement)
            if (idx == -1) {
                problematicElement.UMLFragmentSequence.add(umlIndex, element.referencedElement)
            } else {
                problematicElement.UMLFragmentSequence.move(umlIndex, idx)   
            }
        }
        umlIndex + 1
    }
    
    private def int skipUMLElementsIfNecessary(int umlIndex) {
        var index = umlIndex
        while (index < problematicElement.UMLFragmentSequence.length &&
            problematicElement.UMLFragmentSequence.get(index).skipUMLElement) {
            index++
        }
        index
    }
    
    private def dispatch boolean skipUMLElement(InteractionFragment frag) {
        false
    }
    
    private def dispatch boolean skipUMLElement(ExecutionSpecification frag) {
        true
    }
    
    private def dispatch boolean skipUMLElement(ExecutionOccurrenceSpecification frag) {
        true
    }
    
}