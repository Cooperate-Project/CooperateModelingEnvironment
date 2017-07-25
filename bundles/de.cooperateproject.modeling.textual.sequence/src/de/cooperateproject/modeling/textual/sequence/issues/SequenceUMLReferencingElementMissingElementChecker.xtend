package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment
import de.cooperateproject.modeling.textual.sequence.sequence.Condition
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitMessageOccurenceSpecification
import de.cooperateproject.modeling.textual.sequence.sequence.Message
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class SequenceUMLReferencingElementMissingElementChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}	
	
	private def dispatch boolean resolvePossible(SequenceDiagram element) {
	    return element.rootPackage.hasReferencedElement 
	}
	
	private def dispatch resolvePossible(Actor element) {
		return element.hasValidParent(SequencePackage.Literals.SEQUENCE_DIAGRAM)
	}
	
	private def dispatch resolvePossible(ActorClassifierMapping element) {
	    return element.hasValidParent(SequencePackage.Literals.ACTOR) &&
	       element.classifier !== null
	}
	
	private def dispatch boolean resolvePossible(Message message) {
	    return message.hasValidParent(SequencePackage.Literals.FRAGMENT_SEQUENCE) 
	       && (!(message.left === null && (message.right === null))
           && (message.left === null || (message.left.hasReferencedElement && message.sendEvent?.occurenceSpecification?.occurrenceSpecificationCanBeResolved))
           && (message.right === null || message.right.hasReferencedElement && message.arrivalEvent?.occurenceSpecification?.occurrenceSpecificationCanBeResolved))
	}
	
	private def dispatch boolean occurrenceSpecificationCanBeResolved(ExplicitArrivalOccurenceSpecification spec) {
	    spec.hasReferencedElement
	}
	
	private def dispatch boolean occurrenceSpecificationCanBeResolved(ImplicitMessageOccurenceSpecification spec) {
	    spec.eContainer().hasValidParent(SequencePackage.Literals.FRAGMENT_SEQUENCE)
	}
	
	private def dispatch boolean resolvePossible(ExplicitArrivalOccurenceSpecification spec) {
	    spec.hasValidParent(SequencePackage.Literals.FRAGMENT_SEQUENCE)
	}
	
	private def dispatch resolvePossible(CombinedFragment fragment) {
	    fragment.hasValidParent(SequencePackage.Literals.FRAGMENT_SEQUENCE)
	}
	
	private def dispatch resolvePossible(OrderedFragmentContainer container) {
	    container.hasValidParent(SequencePackage.Literals.COMBINED_FRAGMENT)
	}
	
	private def dispatch resolvePossible(Condition fragment) {
	    fragment.hasValidParent(SequencePackage.Literals.ORDERED_FRAGMENT_CONTAINER)
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    return false;
	}
}
