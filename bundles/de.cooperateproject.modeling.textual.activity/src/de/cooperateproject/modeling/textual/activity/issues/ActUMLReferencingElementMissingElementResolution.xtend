package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.activity.act.ActionNode
import de.cooperateproject.modeling.textual.activity.act.Activity
import de.cooperateproject.modeling.textual.activity.act.Flow
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory

class ActUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	private def dispatch fixMissingUMLElement(ActionNode element) {
		if(!resolvePossible) return Void
		
		// Create node
		val actionNode = UMLFactory.eINSTANCE.createOpaqueAction
		actionNode.name = element.name
		
		// Add node to parent activity
		val parent = element.eContainer as Activity
		parent.referencedElement.ownedNodes.add(actionNode)

		// Finish by linking the new node
		element.referencedElement = actionNode;
	}
	
	private def dispatch fixMissingUMLElement(Flow element) {
		if(!resolvePossible) return Void
	}
	
}