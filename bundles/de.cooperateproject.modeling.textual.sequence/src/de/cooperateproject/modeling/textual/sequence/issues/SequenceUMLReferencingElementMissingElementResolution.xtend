package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage
import de.cooperateproject.modeling.textual.sequence.sequence.DestructionMessage
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import java.util.Optional
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Interaction
import org.eclipse.uml2.uml.Lifeline
import org.eclipse.uml2.uml.MessageSort
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLFactory

class SequenceUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		(problematicElement as UMLReferencingElement<? extends NamedElement>).fixMissingUMLElement
	}

    private def dispatch fixMissingUMLElement(SequenceDiagram element) {
        if(!resolvePossible) return Void    
        val root = element.rootPackage as UMLReferencingElement<Package>
        val interaction = UMLFactory.eINSTANCE.createInteraction
        
        interaction.name = element.title
        interaction.package = root.referencedElement   
        element.referencedElement = interaction
    }
    
	private def dispatch fixMissingUMLElement(Actor element) {
		if(!resolvePossible) return Void
		val parent = element.eContainer as SequenceDiagram
		
		val umlLifeline = UMLFactory.eINSTANCE.createLifeline
		umlLifeline.name = element.name
		umlLifeline.interaction = parent.referencedElement
		umlLifeline.handleAliasedElement(element);
				
		element.referencedElement = umlLifeline		
	}
	
	private def dispatch fixMissingUMLElement(ActorClassifierMapping element) {
	    if (!resolvePossible) return Void
	    val parent = element.eContainer as UMLReferencingElement<org.eclipse.uml2.uml.Actor>
	    val containingInteraction = parent.eContainer as UMLReferencingElement<Interaction>
	    val prop = UMLFactory.eINSTANCE.createProperty
	    prop.name = element.actor.name
	    prop.type = element.classifier
	    containingInteraction.referencedElement.ownedAttributes += prop;
	    element.referencedElement = prop
	}
	
	private def dispatch fixMissingUMLElement(StandardMessage element) {
	    if (!resolvePossible) return Void
	    
	    element.createMessage(
	        (element.eContainer as SequenceDiagram).referencedElement,
	        Optional.ofNullable(element.left.referencedElement),
	        Optional.ofNullable(element.right.referencedElement),
	        switch (element.type) {
                case MessageType.ASYNC: MessageSort.ASYNCH_CALL_LITERAL 
                case MessageType.SYNC:  MessageSort.SYNCH_CALL_LITERAL
            }
	    )
	}
    
    private def dispatch fixMissingUMLElement(CreateMessage element) {
        if (!resolvePossible) return Void
        
        element.createMessage(
            (element.eContainer as SequenceDiagram).referencedElement,
            Optional.of(element.left.referencedElement),
            Optional.of(element.right.referencedElement),
            MessageSort.CREATE_MESSAGE_LITERAL
        )
    }
    
    private def dispatch fixMissingUMLElement(DestructionMessage element) {
        if (!resolvePossible) return Void
        
        element.createMessage(
            (element.eContainer as SequenceDiagram).referencedElement,
            Optional.of(element.left.referencedElement),
            Optional.of(element.right.referencedElement),
            MessageSort.DELETE_MESSAGE_LITERAL
        )
    }
	
	private def createMessage(Message element, Interaction interaction, Optional<Lifeline> left, Optional<Lifeline> right, MessageSort sort) {
	    element.referencedElement = UMLFactory.eINSTANCE.createMessage => [
            name = element.name
            messageSort = sort 
            left.ifPresent(
                [Lifeline L | 
                    sendEvent = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification => [
                    name = '''«element.name»_«L.name»_send'''
                    covered = L
                    enclosingInteraction = interaction]
                ]);
            right.ifPresent(
                [Lifeline R | 
                    receiveEvent = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification => [
                    name = '''«element.name»_«R.name»_send'''
                    covered = R
                    enclosingInteraction = interaction]
                ]);
            it.interaction = interaction
        ]   
	}
	
	protected def handleAliasedElement(NamedElement umlElement, AliasedElement element) {
	    if (!element.alias.isNullOrEmpty) {
	        umlElement.createNameExpression(element.alias, null);
	    }
	}
	
}
				