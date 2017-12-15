package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.component.cmp.Method

class ComponentMethodAbstractQualifierResolution extends AutomatedIssueResolutionBase<Method> {
	
	new(Method problematicElement, IResolvableChecker<Method> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
	private def fixQualifier(Method element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
}