package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage
import de.cooperateproject.modeling.textual.component.cmp.Component
import de.cooperateproject.modeling.textual.component.cmp.RootPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage
import de.cooperateproject.modeling.textual.component.cmp.Provide
import org.eclipse.emf.ecore.EObject
import java.util.Optional
import org.eclipse.uml2.uml.BehavioredClassifier
import de.cooperateproject.modeling.textual.component.cmp.Require
import de.cooperateproject.modeling.textual.component.cmp.Attribute
import org.eclipse.uml2.uml.StructuredClassifier
import de.cooperateproject.modeling.textual.component.cmp.Port
import de.cooperateproject.modeling.textual.component.cmp.Connector
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.AttributeOwner
import de.cooperateproject.modeling.textual.component.cmp.Parameter
import org.eclipse.uml2.uml.BehavioralFeature
import de.cooperateproject.modeling.textual.component.cmp.Method
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.OperationOwner
import org.eclipse.uml2.uml.Interface

class ComponentMissingUMLElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}

	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}

	private def dispatch fixMissingUMLElement(UMLReferencingElement element) {

		val referencedType = element.eClass.getFeatureType(
			TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier as EClass

		if (UMLPackage.eINSTANCE.classifier.isSuperTypeOf(referencedType) &&
			CmpPackage.eINSTANCE.classifier.isInstance(element)) {
			(element as de.cooperateproject.modeling.textual.component.cmp.Classifier).fixMissingUMLElementClassifier([
				UMLFactory.eINSTANCE.create(referencedType) as Classifier
			])
		}
	}

	private def dispatch fixMissingUMLElement(Attribute element) {
		var type = element.type
		val umlParent = element.umlParent(AttributeOwner)
		if (umlParent.present && type instanceof Classifier) {
			val umlType = type as Classifier
			val prop = umlParent.get.createOwnedAttribute(element.name, umlType)
			element.referencedElement = prop
		}
	}
	
	private def dispatch fixMissingUMLElement(Method element) {
		if(!resolvePossible) return Void
		val umlClassifier = element.umlParent(OperationOwner)
		val parameterNames = new BasicEList(element.parameters.map[name])
		val parameterTypes = new BasicEList(element.parameters.map[type].map[type|type as Type])
		val umlOperation = umlClassifier.get.createOwnedOperation(element.name, parameterNames, parameterTypes,
			element.type)
		umlOperation.visibility = element.visibility
		umlOperation.isStatic = element.static
		umlOperation.isAbstract = element.abstract
		element.referencedElement = umlOperation
	}
	/* method in cls:
	 * if(!resolvePossible) return Void
		val umlClassifier = element.owner.referencedElement as OperationOwner
		val parameterNames = new BasicEList(element.parameters.map[name])
		val parameterTypes = new BasicEList(element.parameters.map[type].map[type|type as Type])
		val umlOperation = umlClassifier.createOwnedOperation(element.name, parameterNames, parameterTypes,
			element.type)
		umlOperation.visibility = element.visibility
		umlOperation.isStatic = element.static
		umlOperation.isAbstract = element.abstract
		element.referencedElement = umlOperation
	 */
	 
	private def dispatch fixMissingUMLElement(Parameter element) {
		if(!resolvePossible) return Void
		val umlMethod = element.umlParent(BehavioralFeature)
		if (umlMethod.present) {
			val parameterIndex = element.owner.parameters.indexOf(element)
			val umlParameter = umlMethod.get.createOwnedParameter(element.name, element.type)
			umlMethod.get.ownedParameters.move(parameterIndex, umlParameter)
			element.referencedElement = umlParameter
		}
		/*
		 * method in cls:
		if(!resolvePossible) return Void
		val method = element.owner
		val umlMethod = method.referencedElement
		val parameterIndex = method.parameters.indexOf(element)
		val umlParameter = umlMethod.createOwnedParameter(element.name, element.type)
		umlMethod.ownedParameters.move(parameterIndex, umlParameter)
		element.referencedElement = umlParameter
		*/
	}
	
	
	private def dispatch fixMissingUMLElement(Connector element) {
		
		val umlComponent = element.umlParent(org.eclipse.uml2.uml.Component)
		if (umlComponent.present) {
			val umlConnector = umlComponent.get.createOwnedConnector(element.name)
			element.referencedElement = umlConnector
		}
	}
	
	private def dispatch fixMissingUMLElement(ConnectorEnd element) {
		
		val umlConnector = element.umlParent(org.eclipse.uml2.uml.Connector)
		if (umlConnector.present) {
			val umlEnd = umlConnector.get.createEnd
			umlEnd.role = element.role.referencedElement
			if (element.part.hasReferencedElement)
				umlEnd.partWithPort = element.part.referencedElement
			
			element.referencedElement = umlEnd
		}
	}	
	
	private def dispatch fixMissingUMLElement(Port element) {
		var type = element.realizedClassifier
		val umlParent = element.umlParent(org.eclipse.uml2.uml.Component)
		if (umlParent.present) {
			val umlType = type.referencedElement as Classifier
			val port = umlParent.get.createOwnedPort(element.name, umlType);
			port.aggregation = AggregationKind.COMPOSITE_LITERAL
			element.referencedElement = port
		}
	}

	private def dispatch fixMissingUMLElement(Provide element) {
		val interface = element.interface;
		val umlParent = element.umlParent(BehavioredClassifier)
		if (umlParent.present && interface !== null) {
			val classifier = umlParent.get
			if (classifier instanceof BehavioredClassifier) {
				val umlInterfaceRealization = classifier.createInterfaceRealization(element.name,
					interface.referencedElement)
				element.referencedElement = umlInterfaceRealization
			}
		}
	}

	private def dispatch fixMissingUMLElement(Require element) {
		val interface = element.interface;
		val umlParent = element.umlParent(Classifier)
		if (umlParent.present && interface !== null) {
			val classifier = umlParent.get
			val umlInterfaceUsage = classifier.createUsage(interface.referencedElement)
			umlInterfaceUsage.name = element.name
			element.referencedElement = umlInterfaceUsage
		}
	}

	private static def <T> umlParent(EObject element, Class<T> f) {
		val context = element.eContainer
		if (context instanceof UMLReferencingElement<?>) {
			return Optional.ofNullable((context as UMLReferencingElement<?>).referencedElement).filter(e | f.isInstance(e)).map(e | f.cast(e));
		}
		return Optional.empty
	}

	private static def <UMLType extends Classifier, T extends de.cooperateproject.modeling.textual.component.cmp.Classifier<UMLType>> fixMissingUMLElementClassifier(
		T element, ()=>UMLType factoryMethod) {
		element.elementReference = factoryMethod.apply => [
			name = element.name
			if (element.alias !== null) {
				it.createNameExpression(element.alias, null)
			}
		]
	}

	private static def <UMLType extends Classifier> void setElementReference(UMLReferencingElement<UMLType> element,
		UMLType newElement) {
		val parent = element.eContainer
		if (parent instanceof Component) {
			(parent as Component).referencedElement.packagedElements += newElement
		} else if (parent instanceof RootPackage) {
			(parent as RootPackage).referencedElement.packagedElements += newElement
		}
		element.referencedElement = newElement
	}

}
