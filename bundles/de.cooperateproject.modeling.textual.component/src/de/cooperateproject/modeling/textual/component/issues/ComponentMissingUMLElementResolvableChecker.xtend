package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage
import de.cooperateproject.modeling.textual.cmp.cmp.Method
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ComponentMissingUMLElementResolvableChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}
	
	private def dispatch resolvePossible(UMLReferencingElement element) {
	    val referencedType = element.eClass.getFeatureType(TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier as EClass
	    return (UMLPackage.eINSTANCE.classifier.isSuperTypeOf(referencedType) 
	         && UMLPackage.eINSTANCE.packageableElement.isSuperTypeOf(referencedType)
	         && (element.hasValidParent(CmpPackage.eINSTANCE.component) || element.hasValidParent(CmpPackage.eINSTANCE.rootPackage)))
	}
	
	private def dispatch resolvePossible(Method element) {
		return !element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null)
	}
	
	
	
}