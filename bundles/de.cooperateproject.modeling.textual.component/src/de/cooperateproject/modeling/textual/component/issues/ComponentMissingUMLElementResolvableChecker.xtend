package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage
import de.cooperateproject.modeling.textual.component.cmp.Method
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.component.cmp.InterfaceRelation
import de.cooperateproject.modeling.textual.component.cmp.Attribute
import de.cooperateproject.modeling.textual.component.cmp.Component
import de.cooperateproject.modeling.textual.component.cmp.Member
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.component.cmp.Port
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd
import de.cooperateproject.modeling.textual.component.cmp.Connector
import de.cooperateproject.modeling.textual.component.cmp.Parameter
import org.apache.commons.lang3.StringUtils
import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase

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
	
	private def dispatch resolvePossible(InterfaceRelation element) {
		return element.interface.hasReferencedElement && element.hasValidParent(CmpPackage.eINSTANCE.classifier)
		}
	
	private def dispatch resolvePossible(Attribute element) {
		return element.type !== null && element.hasValidParent(CmpPackage.eINSTANCE.classifier)
	}
	
	private def dispatch resolvePossible(Port element) {
		return element.realizedClassifier.hasReferencedElement && element.hasValidParent(CmpPackage.eINSTANCE.component)
	}
	
	private def dispatch resolvePossible(ConnectorEnd element) {
		return element.role.hasReferencedElement && element.hasValidParent(CmpPackage.eINSTANCE.connector)
	}
	
	private def dispatch resolvePossible(Connector element) {
		return element.name !== null && element.hasValidParent(CmpPackage.eINSTANCE.component)
	}
	
	private def dispatch resolvePossible(Method element) {
		return !element.parameters.map[type].contains(null) && !element.parameters.map[name].contains(null)
	}
	
    private def dispatch resolvePossible(Parameter element) {
        return element.type !== null && element.type.eResource !== null && StringUtils.isNotBlank(element.name)
    }
	
	
	
}