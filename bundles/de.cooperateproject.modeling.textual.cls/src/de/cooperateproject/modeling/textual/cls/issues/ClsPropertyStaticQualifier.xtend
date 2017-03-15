package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Attribute
import org.eclipse.emf.ecore.EObject
import org.apache.log4j.Logger

class ClsPropertyStaticQualifier extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	public static val ISSUE_CODE = "classStaticQualifierWrong"
	private static val LOGGER = Logger.getLogger(ClsPropertyStaticQualifier)

	new(UMLReferencingElement<Element> problematicElement) {
		super(problematicElement)
	}
	
	public static def hasIssues(Attribute element) {
		val umlAttributeStatic = element.referencedElement.static

		val clsAttributeStatic = element.static
		return umlAttributeStatic != clsAttributeStatic
	}
	
	public static def hasIssues(Method element) {		
		val umlMethodStatic = element.referencedElement.static
		val clsMethodStatic = element.static
		 
		return umlMethodStatic != clsMethodStatic
	}

	override resolvePossible() {
		problematicElement.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
		
	private def dispatch fixQualifier(Attribute element) {
		element.referencedElement.isStatic = element.static
	}
	
	private def dispatch fixQualifier(Method element) {
		element.referencedElement.isStatic = element.static
	}
	
	private def dispatch fixQualifier(EObject element) {
		LOGGER.warn("Object does not have static qualifier.")
	}
}
