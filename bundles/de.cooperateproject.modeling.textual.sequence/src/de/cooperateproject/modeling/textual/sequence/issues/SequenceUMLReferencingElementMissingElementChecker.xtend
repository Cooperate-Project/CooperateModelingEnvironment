package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class SequenceUMLReferencingElementMissingElementChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}	
	
	private def dispatch resolvePossible(SequenceDiagram element) {
	    return element.rootPackage.hasReferencedElement 
	}
	
	private def dispatch resolvePossible(Actor element) {
		return element.hasValidParent(SequencePackage.Literals.SEQUENCE_DIAGRAM)
	}
	
	private def dispatch resolvePossible(ActorClassifierMapping element) {
	    return element.hasValidParent(SequencePackage.Literals.ACTOR) &&
	       element.classifier !== null
	}
	
	private def dispatch resolvePossible(StandardMessage message) {
	    return message.hasValidParent(SequencePackage.Literals.FRAGMENT_SEQUENCE) 
           && (message.left === null || message.left.hasReferencedElement)
           && (message.right === null || message.right.hasReferencedElement)
	}
	
	private def dispatch resolvePossible(OccurenceSpecification spec) {
	    return spec.occurenceReference?.hasValidParent(SequencePackage.Literals.MESSAGE)
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    return false;
	}
}
