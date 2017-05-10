package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram

class SequenceUMLReferencingElementMissingElementChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}	
	
	private def dispatch resolvePossible(SequenceDiagram element) {
	    return element.rootPackage.hasReferencedElement 
	}
	
	private def dispatch resolvePossible(Actor element) {
		return element.hasValidParent(SequencePackage.Literals.ROOT_PACKAGE)
	}
	
	private def dispatch resolvePossible(ActorClassifierMapping element) {
	    return element.hasValidParent(SequencePackage.Literals.ACTOR) &&
	       element.classifier !== null
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    return false;
	}
}
