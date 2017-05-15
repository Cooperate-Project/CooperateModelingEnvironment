package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Interaction
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.sequence.sequence.RootPackage

class SequenceUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		(problematicElement as UMLReferencingElement<? extends NamedElement>).fixMissingUMLElement
	}

    private def dispatch fixMissingUMLElement(SequenceDiagram element) {
        if(!resolvePossible) return Void    
        val root = element.rootPackage as UMLReferencingElement<org.eclipse.uml2.uml.Package>
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
	
	protected def handleAliasedElement(NamedElement umlElement, AliasedElement element) {
	    if (!element.alias.isNullOrEmpty) {
	        umlElement.createNameExpression(element.alias, null);
	    }
	}
	
}
				