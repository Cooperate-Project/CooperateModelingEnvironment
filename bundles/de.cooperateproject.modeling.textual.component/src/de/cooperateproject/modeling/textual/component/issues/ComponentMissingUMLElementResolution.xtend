package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage
import de.cooperateproject.modeling.textual.cmp.cmp.Component
import de.cooperateproject.modeling.textual.cmp.cmp.RootPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

class ComponentMissingUMLElementResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		getProblematicElement.fixMissingUMLElement
	}
	
	private def dispatch fixMissingUMLElement(UMLReferencingElement element) {
	    
	    val referencedType = element.eClass.getFeatureType(TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier as EClass
	    
	    if (UMLPackage.eINSTANCE.classifier.isSuperTypeOf(referencedType) &&
	           CmpPackage.eINSTANCE.classifier.isInstance(element)) {
	       (element as de.cooperateproject.modeling.textual.cmp.cmp.Classifier).fixMissingUMLElementClassifier([UMLFactory.eINSTANCE.create(referencedType) as Classifier])       
	    }
	}
	
	
	private static def <UMLType extends Classifier, T extends de.cooperateproject.modeling.textual.cmp.cmp.Classifier<UMLType>> fixMissingUMLElementClassifier(T element, ()=>UMLType factoryMethod) {
		element.elementReference = factoryMethod.apply => [
		    name = element.name
		    if (element.alias !== null) {
                it.createNameExpression(element.alias, null)
            }
		]
	}
	
	private static def <UMLType extends Classifier> void setElementReference(UMLReferencingElement<UMLType> element, UMLType newElement) {
		val parent = element.eContainer
		if (parent instanceof Component) {
			(parent as Component).referencedElement.packagedElements += newElement
		} else if (parent instanceof RootPackage) {
			(parent as RootPackage).referencedElement.packagedElements += newElement
		}
		element.referencedElement = newElement
	}
	
	
}