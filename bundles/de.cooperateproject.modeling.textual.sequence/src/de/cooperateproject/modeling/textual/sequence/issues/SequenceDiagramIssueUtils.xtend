package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.InteractionFragment
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage

class SequenceDiagramIssueUtils {
    public static def int determineIndexOfFinishExecutionOnLifelineAfter(Actor actor, Fragment fragment) {
        val baseIter = EcoreUtil.getAllContents(fragment.containingSequence, true).filter(Fragment)
        val startObject = fragment.getElementDeterminingStart
        val fragmentIter = baseIter.dropWhile[it !== startObject]
        
        val Set<Fragment> expectedFragments = new HashSet
        
        var Fragment oldFragment = fragmentIter.next
        var continueIteration = fragmentIter.hasNext
        while (continueIteration) {
            val currentFragment = fragmentIter.next
            
            if (expectedFragments.remove(currentFragment) ||
                currentFragment.fragmentKeepsActivationAlive(fragment, expectedFragments)) {
                oldFragment = currentFragment
            }
            
            continueIteration = fragmentIter.hasNext 
                && (!expectedFragments.empty)
                && (!actor.isIncomingEdge(currentFragment))
        }
        
        oldFragment.getNextIndexInUMLContainment(fragment.containingSequence.UMLFragmentSequence)
    }
    
    
    private static def dispatch EObject getElementDeterminingStart(EObject fragment) {
        null
    }
    
    private static def dispatch EObject getElementDeterminingStart(Fragment fragment) {
        fragment
    }
    
    private static def dispatch EObject getElementDeterminingStart(Message fragment) {
        return if(fragment.arrivalEvent.occurenceSpecification instanceof ExplicitArrivalOccurenceSpecification)
            fragment.arrivalEvent.occurenceSpecification
        else fragment
    }
    
    
    private static def dispatch EObject getUMLElementDeterminingEnd(EObject fragment) {
        null
    }
    
    private static def dispatch EObject getUMLElementDeterminingEnd(UMLReferencingElement<?> fragment) {
        fragment.referencedElement
    }
    
    private static def dispatch EObject getUMLElementDeterminingEnd(Message fragment) {
        fragment.arrivalEvent.occurenceSpecification.referencedElement
    }
    
    
    private static def dispatch boolean fragmentKeepsActivationAlive(Fragment fragment, Fragment startFragment, Set<Fragment> expectedFragments) {
        false
    }
    
    private static def dispatch boolean fragmentKeepsActivationAlive(Message fragment, Message message, Set<Fragment> expectedFragments) {
        (fragment.left == message.right)
    }
    
    private static def dispatch boolean fragmentKeepsActivationAlive(StandardMessage fragment, Message message, Set<Fragment> expectedFragments) {
        if (fragment.type == MessageType.SYNC && fragment.left == message.right) {
            val rsp = SequenceUtils.getResponseCorrespondingToSynchronousMessage(fragment);
            if (rsp.isPresent) expectedFragments.add(rsp.get)
        } 
        _fragmentKeepsActivationAlive(fragment as Message, message, expectedFragments)
    }
    
    private static def dispatch boolean isIncomingEdge(Actor actor, Fragment fragment) {
        false
    }
    
    private static def dispatch boolean isIncomingEdge(Actor actor, Message fragment) {
        fragment.right == actor
    }
    
    private static def dispatch boolean isIncomingEdge(Actor actor, ResponseMessage fragment) {
        false
    }
    
    
    private static def dispatch int getNextIndexInUMLContainment(EObject element, List<InteractionFragment> umlContainment) {
        umlContainment.indexOf(element.getUMLElementDeterminingEnd) + 1
    }
}