package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.activity.act.ActionNode
import de.cooperateproject.modeling.textual.activity.act.Flow
import de.cooperateproject.modeling.textual.activity.act.RootPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory
import java.util.Optional

class ActUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	// Assuming, that a papyrus diagram always has one (is created while initialization, cannot be created in editor)
	// TODO: Check this in Checker!
	private def Optional<Activity> getMainActivity(RootPackage rootPackage) {
		val activities = rootPackage.referencedElement.packagedElements.filter(Activity)
		if(activities.length == 0) {
			return Optional.empty
		} else {
			return Optional.of(activities.get(0) as Activity);
		}
	}
	
	private def dispatch fixMissingUMLElement(ActionNode element) {
		if(!resolvePossible) return Void
		
		// Create node
		val actionNode = UMLFactory.eINSTANCE.createOpaqueAction
		actionNode.name = element.name
		
		// Get main activity
		val parent = element.eContainer as RootPackage
		val activity = getMainActivity(parent);
		
		if(activity.present) {
			activity.get.ownedNodes.add(actionNode)
			element.referencedElement = actionNode;
		}
	}
	
	private def dispatch fixMissingUMLElement(Flow element) {
		if(!resolvePossible) return Void
	}
	
}