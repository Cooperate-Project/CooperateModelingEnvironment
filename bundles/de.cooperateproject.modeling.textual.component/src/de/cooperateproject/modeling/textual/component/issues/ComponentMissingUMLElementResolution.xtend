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
		val umlParent = element.umlParent(StructuredClassifier)
		if (umlParent.present && type instanceof Classifier) {
			val umlType = type as Classifier
			val prop = umlParent.get.createOwnedAttribute(element.name, umlType);
			element.referencedElement = prop
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

	private static def <T extends Element> umlParent(EObject element, Class<T> f) {
		val context = element.eContainer
		if (context instanceof UMLReferencingElement<?>) {
			return Optional.ofNullable((context as UMLReferencingElement<T>).referencedElement);
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
