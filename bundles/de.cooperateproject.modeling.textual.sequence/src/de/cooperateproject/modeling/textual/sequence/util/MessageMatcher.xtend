package de.cooperateproject.modeling.textual.sequence.util

import com.google.common.base.Strings
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitMessageOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Interaction
import org.eclipse.uml2.uml.InteractionOperand
import org.eclipse.uml2.uml.MessageOccurrenceSpecification
import org.eclipse.uml2.uml.NamedElement

class MessageMatcher {
    val UMLReferencingElement<? extends NamedElement> context
    new (UMLReferencingElement<? extends NamedElement> context) {
        this.context = context
    }
    
    def getIndexOfMessageSendAmongSimilarMessages(Message message) {
        val index = context.messageFragments.filter[it.messageIsSimilar(message)].takeWhile[it != message].length
        
        return if (index < context.messageFragments.length) index else -1
    }
    
    def getIndexOfMessageReceiveAmongSimilarMessages(Message message) {
        val index = context.messageArrivalFragments.filter[it.messageForArrival.messageIsSimilar(message)].takeWhile[it != message].length
        
        return if (index < context.messageArrivalFragments.length) index else -1
    }
    
    def getSendEventOccurenceSpecification(Message message) {
        context.referencedElement?.messageOccurrenceSpecifications
            ?.filter[it.isSend]
            ?.filter[it.covered == message.left.referencedElement]
            ?.filter[it.message.messageMatches(message)]
            ?.drop(message.indexOfMessageSendAmongSimilarMessages)
            ?.head            
    }
    
    def getReceiveEventOccurenceSpecification(Message message) {
        val index = message.indexOfMessageReceiveAmongSimilarMessages
        context.referencedElement?.messageOccurrenceSpecifications
            ?.filter[m | 
                m.isReceive
            ]
            ?.filter[m | 
                m.covered == message.right.referencedElement
            ]
            ?.filter[m | 
                m.message.messageMatches(message)
                ]
            ?.drop(index)
            ?.head
    }
    
    private def dispatch getMessageFragments(FragmentSequence container) {
        container.fragments.filter(Message)
    }
    
    private def dispatch getMessageFragments(EObject container) {
        Collections.emptyList
    }
    
    private def dispatch getMessageArrivalFragments(FragmentSequence container) {
        container.fragments.filter[it.fragmentSpecifiesArrival]
    }
    
    private def dispatch getMessageArrivalFragments(EObject container) {
        Collections.emptyList
    }
    
    private def dispatch fragmentSpecifiesArrival(Message message) {
        return message.arrivalEvent instanceof ImplicitMessageOccurenceSpecification
    }
    
    private def dispatch fragmentSpecifiesArrival(ExplicitArrivalOccurenceSpecification ref) {
        return true
    }
    
    private def dispatch fragmentSpecifiesArrival(Fragment message) {
        return false
    }
    
    private def dispatch getMessageForArrival(ExplicitArrivalOccurenceSpecification spec) {
        spec.occurenceReference.eContainer as Message
    }
    
    private def dispatch getMessageForArrival(Message msg) {
        msg
    }
    
    
    private def dispatch getMessageOccurrenceSpecifications(Interaction container) {
        container.fragments.filter(MessageOccurrenceSpecification)
    }
    
    private def dispatch getMessageOccurrenceSpecifications(InteractionOperand container) {
        container.fragments.filter(MessageOccurrenceSpecification)
    }
    
    private def messageIsSimilar(Message reference, Message textualMessage) {
        return (reference.name == textualMessage.name) 
            && ((Strings.isNullOrEmpty(textualMessage.alias) && Strings.isNullOrEmpty(reference.name) ) 
                  || reference.alias == textualMessage.alias)
            && reference.left == textualMessage.left
            && reference.right == textualMessage.right
    }
    
    private def messageMatches(org.eclipse.uml2.uml.Message umlMessage, Message textualMessage) {
        val res = (umlMessage.name == textualMessage.name) 
            && ((Strings.isNullOrEmpty(textualMessage.alias) && Strings.isNullOrEmpty(umlMessage.nameExpression?.name) ) 
                  || umlMessage.nameExpression.name == textualMessage.alias
            )
        res
    }
    
}