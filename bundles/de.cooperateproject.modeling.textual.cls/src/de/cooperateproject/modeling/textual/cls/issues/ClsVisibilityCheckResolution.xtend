package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
class ClsVisibilityCheckResolution extends AutomatedIssueResolutionBase<Classifier<org.eclipse.uml2.uml.Classifier>> {
	
	new(Classifier<org.eclipse.uml2.uml.Classifier> problematicElement, IResolvableChecker<Classifier<org.eclipse.uml2.uml.Classifier>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			problematicElement.referencedElement.setVisibility(problematicElement.visibility);
		}
	}
	
}