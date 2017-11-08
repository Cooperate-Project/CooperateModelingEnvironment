package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.component.cmp.Port

class ComponentPortConjugatedResolution extends AutomatedIssueResolutionBase<Port> {
	
	new(Port problematicElement, IResolvableChecker<Port> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
	private def fixQualifier(Port element) {
		element.referencedElement.isConjugated = element.conjugated
	}
	
	
}
