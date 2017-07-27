package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier
import de.cooperateproject.modeling.textual.component.metamodel.component.Component
import de.cooperateproject.modeling.textual.component.metamodel.component.Interface
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import java.util.concurrent.Callable
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Namespace
import org.eclipse.uml2.uml.UMLFactory
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
import java.util.function.BiConsumer
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase
import de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage
import java.util.function.Consumer

class ComponentMissingUMLElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	private def dispatch fixMissingUMLElement(UMLReferencingElement element) {
		return Void
	}
	
	private def dispatch fixMissingUMLElement(Component element) {
		if(!resolvePossible) return Void
		element.fixMissingUMLElementClassifier([UMLFactory.eINSTANCE.createComponent])
	}
	
	private def dispatch fixMissingUMLElement(Interface element) {
		if(!resolvePossible) return Void
		element.fixMissingUMLElementClassifier([UMLFactory.eINSTANCE.createInterface])
	}
	
	private static def <UMLType extends org.eclipse.uml2.uml.Classifier, T extends Classifier<UMLType>> fixMissingUMLElementClassifier(T element, Callable<UMLType> factoryMethod) {
		val setter = element.createSetter
		val umlclassifier = factoryMethod.call
		umlclassifier.name = element.name
		if (element.alias !== null) {
			umlclassifier.createNameExpression(element.alias, null)
		}
		setter.accept(umlclassifier)
		
		element.referencedElement = umlclassifier
	}
	
	private static def <UMLType extends org.eclipse.uml2.uml.Classifier> Consumer<UMLType> createSetter(UMLReferencingElement<UMLType> element) {
		val parent = element.eContainer
		if (parent instanceof Component) {
			return [newElement | (parent as Component).referencedElement.packagedElements += newElement]
		} else if (parent instanceof RootPackage) {
			return [newElement | (parent as RootPackage).referencedElement.packagedElements += newElement]
		}
	}
	
	
}