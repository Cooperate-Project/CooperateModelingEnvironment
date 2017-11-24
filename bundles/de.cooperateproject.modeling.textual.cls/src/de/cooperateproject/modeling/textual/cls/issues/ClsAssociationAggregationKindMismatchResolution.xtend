package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation
import de.cooperateproject.modeling.textual.cls.utils.ClsConversionUtilities
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsAssociationAggregationKindMismatchResolution extends AutomatedIssueResolutionBase<XtextAssociation> {
	
	new(XtextAssociation problematicElement, IResolvableChecker<XtextAssociation> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
        if (!resolvePossible) {
        	return
        }
        problematicElement.referencedElement.memberEnds.get(0).aggregation = ClsConversionUtilities.convert(problematicElement.twoSideAggregationKind)
	}
	
}