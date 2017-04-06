package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsAssociationMemberEndRoleNameResolution extends AutomatedIssueResolutionBase<AssociationMemberEnd> {
	
	new(AssociationMemberEnd problematicElement, IResolvableChecker<AssociationMemberEnd> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			problematicElement.referencedElement.name = problematicElement.name
		}
	}
	
}