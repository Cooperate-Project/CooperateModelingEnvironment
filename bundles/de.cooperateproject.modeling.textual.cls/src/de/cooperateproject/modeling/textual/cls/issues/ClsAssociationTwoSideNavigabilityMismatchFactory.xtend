package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsAssociationTwoSideNavigabilityMismatchFactory extends ClsAutomatedIssueResolutionFactoryBase<XtextAssociation> {
	
	static val ISSUE_CODE = "clsAssociationMemberEndNavigabilityMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], XtextAssociation)
	}
	
	private static def isResolvable(XtextAssociation element) {
		element.memberEnds.forall[hasReferencedElement]
	}
	
	override protected hasIssueInternal(XtextAssociation element) {
		return element.memberEnds.size == 2 && element.memberEnds.forall[hasReferencedElement] &&
			!element.memberEnds.forall[navigable == referencedElement.navigable]
	}
	
	override protected createInternal(XtextAssociation element) {
		new ClsAssociationTwoSideNavigabilityMismatchResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(XtextAssociation element) {
		"The bidirectionality of the element and the UML model does not match."
	}
	
	override protected getIssueFeatureInternal(XtextAssociation element) {
		new IssueLocator(ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY, element)
	}
	
	override protected getResolutionNameInternal(XtextAssociation element) {
		"Set the bidirectionality in the UML model to the currently used one."
	}
	
}