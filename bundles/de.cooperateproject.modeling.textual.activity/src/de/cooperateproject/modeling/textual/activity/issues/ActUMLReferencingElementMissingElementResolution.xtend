package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.activity.act.ActionNode
import de.cooperateproject.modeling.textual.activity.act.Activity
import de.cooperateproject.modeling.textual.activity.act.DecisionNode
import de.cooperateproject.modeling.textual.activity.act.FinalNode
import de.cooperateproject.modeling.textual.activity.act.Flow
import de.cooperateproject.modeling.textual.activity.act.FlowFinalNode
import de.cooperateproject.modeling.textual.activity.act.ForkNode
import de.cooperateproject.modeling.textual.activity.act.InitialNode
import de.cooperateproject.modeling.textual.activity.act.JoinNode
import de.cooperateproject.modeling.textual.activity.act.MergeNode
import de.cooperateproject.modeling.textual.activity.act.Node
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.ActivityNode
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory

class ActUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	// FIXME: Find a more generic way to solve this?
	
	private def dispatch fixMissingUMLElement(ActionNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createOpaqueAction
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(InitialNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createInitialNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(FlowFinalNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createFlowFinalNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(FinalNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createActivityFinalNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(DecisionNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createDecisionNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(MergeNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createMergeNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(ForkNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createForkNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(JoinNode element) {
		if(!resolvePossible) return Void
		
		val node = UMLFactory.eINSTANCE.createJoinNode
		setNodesNameAndParent(element, node);
		element.referencedElement = node;
	}
	
	private def dispatch fixMissingUMLElement(Flow element) {
		if(!resolvePossible) return Void
		
		val flow = UMLFactory.eINSTANCE.createControlFlow
		flow.source = element.source.referencedElement
		flow.target = element.target.referencedElement
		
		flow.name = element.name	
		flow.target.incomings.add(flow)
		flow.source.outgoings.add(flow)
		
		val parent = element.eContainer as Activity
		parent.referencedElement.edges.add(flow)
		element.referencedElement = flow
	}
	
	private def setNodesNameAndParent(Node<?> element, ActivityNode node) {	
		// Set name
		node.name = element.name
		
		// Add node to parent activity
		val parent = element.eContainer as Activity
		parent.referencedElement.ownedNodes.add(node)
	}
	
}