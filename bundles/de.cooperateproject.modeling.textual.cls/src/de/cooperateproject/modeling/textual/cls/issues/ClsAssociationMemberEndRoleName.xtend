package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase

import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*

class ClsAssociationMemberEndRoleName extends AutomatedIssueResolutionBase<AssociationMemberEnd> {
	
	public static val ISSUE_CODE = "memberEndRoleNameWrong"
	
	new(AssociationMemberEnd problematicElement) {
		super(problematicElement)
	}
	
	public static def hasIssues(AssociationMemberEnd element) {
		val umlName = element.referencedElement?.name
		val elementName = element.name
		return umlName != elementName
	}
	
	override resolvePossible() {
		problematicElement.hasReferencedElement && problematicElement.association.hasReferencedElement
	}
	
	override resolve() {
		if (resolvePossible) {
			problematicElement.referencedElement.name = problematicElement.name
		}
	}
	
}