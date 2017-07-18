package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.Condition
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage
import de.cooperateproject.modeling.textual.sequence.sequence.DestructionMessage
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType
import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.SingleRegionContainer
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Interaction
import org.eclipse.uml2.uml.LiteralString
import org.eclipse.uml2.uml.MessageOccurrenceSpecification
import org.eclipse.uml2.uml.MessageSort
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.OccurrenceSpecification
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.sequence.issues.SequenceUniqueNameGenerator.ensureUniqueIdentification

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
		
		element.ensureUniqueIdentification
		
		val parent = element.eContainer as SequenceDiagram
		
		val umlLifeline = UMLFactory.eINSTANCE.createLifeline
		umlLifeline.name = element.name
		umlLifeline.interaction = parent.referencedElement
		umlLifeline.handleAliasedElement(element);
				
		element.referencedElement = umlLifeline		
	}
	
	private def dispatch fixMissingUMLElement(ActorClassifierMapping element) {
	    if (!resolvePossible) return Void
	    val parent = element.eContainer as Actor
	    val containingInteraction = parent.eContainer as UMLReferencingElement<Interaction>
	    val prop = UMLFactory.eINSTANCE.createProperty
	    prop.name = element.actor.name
	    prop.type = element.classifier
	    containingInteraction.referencedElement.ownedAttributes += prop;
	    parent.referencedElement.represents = prop
	    element.referencedElement = prop
	}
	
	private def dispatch fixMissingUMLElement(StandardMessage element) {
	    if (!resolvePossible) return Void
	    	    
	    element.ensureUniqueIdentification
	    	 
	    element.createMessage(
	        element.containingSequenceDiagram.referencedElement,
	        switch (element.type) {
                case MessageType.ASYNC: MessageSort.ASYNCH_CALL_LITERAL 
                case MessageType.SYNC:  MessageSort.SYNCH_CALL_LITERAL
            }
	    )
	}
	
	private def dispatch fixMissingUMLElement(ResponseMessage element) {
	    if (!resolvePossible) return Void
	    
	    element.ensureUniqueIdentification
	    
	    element.createMessage(
	        element.containingSequenceDiagram.referencedElement,
	        MessageSort.REPLY_LITERAL
	    )
	}
    
    private def dispatch fixMissingUMLElement(CreateMessage element) {
        if (!resolvePossible) return Void
        
        element.ensureUniqueIdentification
        
        element.createMessage(
            element.containingSequenceDiagram.referencedElement,
            MessageSort.CREATE_MESSAGE_LITERAL
        )
    }
    
    private def dispatch fixMissingUMLElement(OccurenceSpecification<? extends OccurrenceSpecification> element) {
        val occurrenceType = element.eClass().getFeatureType(TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier
        val umlOccurrence = (UMLFactory.eINSTANCE.create(occurrenceType as EClass) as OccurrenceSpecification)
        element.containingSequence.UMLFragmentSequence += umlOccurrence;
        umlOccurrence.setupOccurrenceSpecification(element)
        if (element instanceof AliasedElement) umlOccurrence.handleAliasedElement(element)
        (element as UMLReferencingElement<OccurrenceSpecification>).referencedElement = umlOccurrence
    }
    
    private def dispatch fixMissingUMLElement(CombinedFragment element) {
        val umlElement = UMLFactory.eINSTANCE.createCombinedFragment
        
        element.ensureUniqueIdentification
        
        umlElement.interactionOperator = element.interactionOperatorKind
        element.containingSequence.UMLFragmentSequence += umlElement 
        element.referencedElement = umlElement
        
        if (element instanceof AliasedElement) umlElement.handleAliasedElement(element)
        element.createOperands
    }
    
    private def dispatch void createOperands(SingleRegionContainer container) {
        container.referencedElement.operands += container.region.createFragmentContainer
    }
    
    private def dispatch void createOperands(MultipleRegionContainer container) {
        container.regions.map[createFragmentContainer].forEach[container.referencedElement.operands.add(it)]
    }
    
    private def createFragmentContainer(OrderedFragmentContainer element) {
        UMLFactory.eINSTANCE.createInteractionOperand => [
            element.referencedElement = it
            element.condition?.fixMissingUMLElement
        ]
    }
    
    private def dispatch fixMissingUMLElement(Condition element) {
        val container = (element.eContainer as OrderedFragmentContainer).referencedElement
        container.guard = UMLFactory.eINSTANCE.createInteractionConstraint => [
            createSpecification(null, null, UMLPackage.eINSTANCE.literalString) as LiteralString => [
                value = element.condition
            ]
        ]
    }  
    
    private def dispatch setupOccurrenceSpecification(MessageOccurrenceSpecification spec, OccurenceSpecification<? extends OccurrenceSpecification> element) {
        val message = element.occurenceReference?.eContainer 
        if (message instanceof Message) {
            spec.message = message.referencedElement
            if (message.arrivalEvent?.occurenceSpecification == element) {
                message.referencedElement.receiveEvent = spec
                spec.covered = message.right.referencedElement
                spec.name = '''«message.name»_«spec.covered?.name»_receive'''    
            } else if (message.sendEvent?.occurenceSpecification == element) {
                message.referencedElement.sendEvent = spec
                spec.covered = message.left.referencedElement
                spec.name = '''«message.name»_«spec.covered?.name»_send'''
            }
            if (element instanceof NamedElement) spec.name = element.name
        }
    }
    
    private def dispatch setupOccurrenceSpecification(OccurrenceSpecification spec, OccurenceSpecification<? extends OccurrenceSpecification> element) {
        throw new UnsupportedOperationException('''The type «spec.class.name» is currently not supported by the UML Missing Element Quickfix''')
    }
    
	private def void createMessage(Message element, Interaction interaction, MessageSort sort) {
	    element.referencedElement = UMLFactory.eINSTANCE.createMessage => [
            name = element.name
            messageSort = sort
            it.interaction = interaction
        ]
        element.referencedElement.handleAliasedElement(element)   
        
        element.arrivalEvent?.occurenceSpecification?.fixMissingUMLElement
        element.sendEvent?.occurenceSpecification?.fixMissingUMLElement
	}
	
	protected def handleAliasedElement(NamedElement umlElement, AliasedElement element) {
	    if (!element.alias.isNullOrEmpty) {
	        umlElement.createNameExpression(element.alias, null);
	    }
	}
	
	private static def getContainingSequenceDiagram (Fragment fragment) {
	    var result = fragment as EObject
	    while (result !== null && !(result instanceof SequenceDiagram)) {
	        result = result.eContainer
	    }
	    
	    return result as SequenceDiagram
	}	
}
				