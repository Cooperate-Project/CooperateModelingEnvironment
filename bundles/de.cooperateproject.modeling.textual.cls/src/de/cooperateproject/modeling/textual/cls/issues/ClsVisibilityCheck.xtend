package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Class
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.Interface

class ClsVisibilityCheck extends AutomatedIssueResolutionBase<Classifier> {

	public static val ISSUE_CODE = "visibilityWrong"

	new(Classifier problematicElement) {
		super(problematicElement)
	}

	public static def hasIssues(Class element) {
		val umlClassVisibility = element.referencedElement.visibility.getName.toLowerCase
		val clsClassVisibility = ClsIssueResolutionUtilities.convert(element.visibility).getName.toLowerCase
				
		return !clsClassVisibility.equals(umlClassVisibility)
	}
	
	public static def hasIssues(Interface element) {
		val umlInterfaceVisibility = element.referencedElement.visibility.getName.toLowerCase
		val clsInterfaceVisibility = ClsIssueResolutionUtilities.convert(element.visibility).getName.toLowerCase
		
		return !clsInterfaceVisibility.equals(umlInterfaceVisibility)
	}
	
	override resolvePossible() {
		problematicElement.hasReferencedElement
	}

	override resolve() {
		if (resolvePossible) {
			fixVisibility(problematicElement)
		}
	}
	
	private def dispatch fixVisibility(Class element) {
		ClsIssueResolutionUtilities.setVisibility(element.referencedElement, element.visibility)
	}
	
	private def dispatch fixVisibility(Interface element) {
		ClsIssueResolutionUtilities.setVisibility(element.referencedElement, element.visibility)
	}
}
