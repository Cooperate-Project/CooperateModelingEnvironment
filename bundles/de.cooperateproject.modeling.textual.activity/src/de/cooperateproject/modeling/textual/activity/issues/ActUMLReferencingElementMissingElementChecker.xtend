package de.cooperateproject.modeling.textual.activity.issues;

import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase


import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.activity.act.Node
import de.cooperateproject.modeling.textual.activity.act.ActPackage
import de.cooperateproject.modeling.textual.activity.act.Flow

class ActUMLReferencingElementMissingElementChecker extends DependingElementMissingElementResolvableCheckerBase {
	
	protected def dispatch localResolutionPossible(Node<?> element) {
		return element.hasValidParent(ActPackage.Literals.ACTIVITY)
	}
	
	protected def dispatch localResolutionPossible(Flow element) {
		return true;
	}
	
	protected def dispatch getDependencies(Flow element) {
		#[element.source, element.target]
	}
	
}