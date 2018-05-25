package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.activity.act.Activity
import de.cooperateproject.modeling.textual.activity.act.Flow
import de.cooperateproject.modeling.textual.activity.act.Node
import de.cooperateproject.modeling.textual.activity.act.RootPackage
import de.cooperateproject.modeling.textual.activity.act.Swimlane
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.ActivityNode
import org.eclipse.uml2.uml.ActivityPartition
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory

class ActUMLReferencingElementMissingElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}

	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}

	// TODO: Swimlane support
	private def dispatch fixMissingUMLElement(Node<?> element) {
		if(!resolvePossible) return Void

		val parent = element.eContainer as Activity
		
		// Filter generic super types to find the referencing element classifier
		val superTypes = element.eClass.EGenericSuperTypes.stream.filter(superType | superType.EClassifier.name.endsWith("Node")).distinct.collect(Collectors.toList)
		if(superTypes.length == 1) {
			val nodeClassifier = superTypes.get(0).ETypeArguments.get(0).EClassifier as EClass
			
			// Create a new node with the given classifier
			parent.referencedElement.createOwnedNode(element.name, nodeClassifier)
		}
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

	private def dispatch fixMissingUMLElement(Swimlane element) {
		if(!resolvePossible) return Void

		val partition = UMLFactory.eINSTANCE.createActivityPartition
		partition.name = element.name

		val parent = element.eContainer as Activity
		parent.referencedElement.partitions.add(partition)

		element.referencedElement = partition;
	}

	private def dispatch fixMissingUMLElement(Activity element) {
		if(!resolvePossible) return Void

		val activity = UMLFactory.eINSTANCE.createActivity
		activity.name = element.name

		val parent = element.eContainer as RootPackage
		activity.package = parent.referencedElement
	}

	private def setNodesNameAndParent(Node<?> element, ActivityNode node) {
		// Set name
		node.name = element.name

		// Set swimlane
		if (element.eContainer instanceof Swimlane) {
			val swimlane = element.eContainer as Swimlane
			val partition = swimlane.referencedElement as ActivityPartition
			partition.nodes.add(node)
			node.inPartitions.add(partition)

			// Add node to swimlanes parent activity
			val parent = swimlane.eContainer as Activity
			parent.referencedElement.ownedNodes.add(node)
		} else {
			// Add node to parent activity
			val parent = element.eContainer as Activity
			parent.referencedElement.ownedNodes.add(node)
		}
	}

}
