package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality

class UsecaseInteractionCardinalityResolution extends AutomatedIssueResolutionBase<Cardinality> {

	new(Cardinality problematicElement, IResolvableChecker<Cardinality> checker) {
		super(problematicElement, checker)
	}

	override resolve() {
		if (resolvePossible) {
			val property = problematicElement.referencedElement
			var upper = 0
			var lower = 0

		{


					lower = problematicElement.lowerBound
					upper = problematicElement.upperBound

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

}
