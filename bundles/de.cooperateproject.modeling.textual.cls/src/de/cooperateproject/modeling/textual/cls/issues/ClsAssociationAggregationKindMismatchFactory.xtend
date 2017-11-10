package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.cls.utils.ClsConversionUtilities

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsAssociationAggregationKindMismatchFactory extends ClsAutomatedIssueResolutionFactoryBase<XtextAssociation> {
	
	static val ISSUE_CODE = "classDiagramAggregationKindMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], XtextAssociation)
	}
	
    static def isResolvable(XtextAssociation element) {
        element.hasReferencedElement
    }
	
	override protected createInternal(XtextAssociation element) {
		new ClsAssociationAggregationKindMismatchResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(XtextAssociation element) {
		"The aggregation kind of the association does not match the one used in the UML model"
	}
	
	override protected getIssueFeatureInternal(XtextAssociation element) {
		return new IssueLocator(ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, element)
	}
	
	override protected getResolutionNameInternal(XtextAssociation element) {
		"Set aggregation kind in UML model to currently used aggregation kind."
	}
	
	override protected hasIssueInternal(XtextAssociation element) {
        if (element.hasReferencedElement && element.referencedElement.memberEnds.size == 2) {
            return ClsConversionUtilities.convert(element.twoSideAggregationKind) != element.referencedElement.memberEnds.get(0).aggregation
        }
        return false;
	}

}