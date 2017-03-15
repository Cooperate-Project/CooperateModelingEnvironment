package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Attribute

class ClsPropertyQualifier extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	public static val ISSUE_CODE = "classAbstractQualifierWrong"

	new(UMLReferencingElement<Element> problematicElement) {
		super(problematicElement)
	}

	public static def hasIssues(Class element) {
		val umlClassAbstract = element.referencedElement.abstract

		val clsClassAbstract = element.abstract
		return umlClassAbstract != clsClassAbstract
	}
	
	public static def hasIssues(Attribute element) {
		val umlAttributeStatic = element.referencedElement.static

		val clsAttributeStatic = element.static
		return umlAttributeStatic != clsAttributeStatic
	}
	
	public static def hasIssues(Method element) {
		val umlMethodAbstract = element.referencedElement.abstract
		val clsMethodAbstract = element.abstract
		
		val umlMethodStatic = element.referencedElement.static
		val clsMethodStatic = element.static
		 
		return umlMethodAbstract != clsMethodAbstract || umlMethodStatic != clsMethodStatic
	}

	override resolvePossible() {
		problematicElement.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
	def dispatch fixQualifier(Class element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
	def dispatch fixQualifier(Attribute element) {
		element.referencedElement.isStatic = element.static
	}
	
	def dispatch fixQualifier(Method element) {
		element.referencedElement.isStatic = element.static
		element.referencedElement.isAbstract = element.abstract
	}
}
