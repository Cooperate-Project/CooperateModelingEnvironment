package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.cls.cls.Method

class ClsPropertyAbstractQualifier extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {

	public static val ISSUE_CODE = "classAbstractQualifierWrong"

	new(UMLReferencingElement<Element> problematicElement) {
		super(problematicElement)
	}

	public static def hasIssues(Class element) {
		val umlClassAbstract = element.referencedElement.abstract

		val clsClassAbstract = element.abstract
		return umlClassAbstract != clsClassAbstract
	}
	
	public static def hasIssues(Method element) {
		val umlMethodAbstract = element.referencedElement.abstract
		val clsMethodAbstract = element.abstract
		 
		return umlMethodAbstract != clsMethodAbstract
	}

	override resolvePossible() {
		problematicElement.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
	private def dispatch fixQualifier(Class element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
	private def dispatch fixQualifier(Method element) {
		element.referencedElement.isAbstract = element.abstract
	}
}
