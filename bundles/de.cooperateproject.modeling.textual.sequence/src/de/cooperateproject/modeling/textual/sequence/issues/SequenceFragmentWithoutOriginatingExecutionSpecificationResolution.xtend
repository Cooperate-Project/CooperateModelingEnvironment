package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import org.eclipse.uml2.uml.UMLFactory

import static extension de.cooperateproject.modeling.textual.sequence.issues.SequenceDiagramIssueUtils.determineIndexOfFinishExecutionOnLifelineAfter

class SequenceFragmentWithoutOriginatingExecutionSpecificationResolution extends AutomatedIssueResolutionBase<Fragment> {
    
    new(Fragment problematicElement, IResolvableChecker<Fragment> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        problematicElement.internalResolve
    }
    
    private def dispatch void internalResolve(Fragment element) {
        throw new UnsupportedOperationException('''The fragment type «element.class.name» is not supported''')
    }
    
    private def dispatch void internalResolve(Message element) {
        if (!resolvePossible) return;
        
        val idx = element.containingSequence.UMLFragmentSequence.indexOf(element.sendEvent.occurenceSpecification.referencedElement)
        element.containingSequence.UMLFragmentSequence.add(idx + 1, UMLFactory.eINSTANCE.createBehaviorExecutionSpecification => [
            start = UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification => [
                element.containingSequence.UMLFragmentSequence.add(idx, it)
                covered = element.left.referencedElement
            ]
            finish = UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification => [
                element.containingSequence.UMLFragmentSequence.add(
                    element.right.determineIndexOfFinishExecutionOnLifelineAfter(element), it
                )
                covered = element.left.referencedElement
            ]
            covereds.add(start.covered)
        ])
    }
}