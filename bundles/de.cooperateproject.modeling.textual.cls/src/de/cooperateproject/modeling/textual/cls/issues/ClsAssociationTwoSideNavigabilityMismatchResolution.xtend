package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation

class ClsAssociationTwoSideNavigabilityMismatchResolution extends AutomatedIssueResolutionBase<XtextAssociation> {
	
	new(XtextAssociation problematicElement, IResolvableChecker<XtextAssociation> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (!resolvableChecker.isResolvable(problematicElement)) {
			return
		}
		
		problematicElement.memberEnds.forEach[memberEnd | memberEnd.resolve]
	}
	
	private def resolve(AssociationMemberEnd element) {
		element.referencedElement.isNavigable = element.navigable
	}
	
}