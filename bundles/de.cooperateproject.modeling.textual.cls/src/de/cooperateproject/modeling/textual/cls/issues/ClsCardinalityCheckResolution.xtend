package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsCardinalityCheckResolution extends AutomatedIssueResolutionBase<AssociationMemberEnd> {

	new(AssociationMemberEnd problematicElement, IResolvableChecker<AssociationMemberEnd> checker) {
		super(problematicElement, checker)
	}

	override resolve() {
		if (resolvePossible) {
			val property = problematicElement.referencedElement

			val lower = problematicElement.cardinality.lowerBound
			val upper = problematicElement.cardinality.upperBound

			if (lower < 0) {
				// [*]
				property.lower = 0
				property.upper = -1
			} else {
				property.lower = lower
				if (lower > upper) {
					if (upper < 0) {
						// [x..*]
						property.upper = -1
					} else {
						// [x]
						property.upper = lower
					}
				} else {
					// [x..y], x < y
					property.upper = upper
				}
			}
		}
	}

}
