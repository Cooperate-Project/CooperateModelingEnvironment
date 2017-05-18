package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
import org.eclipse.emf.ecore.EObject
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.hasValidParent;

class UsecaseIssueResolutionUtilities {
	
	static def hasValidRootPackageParent(EObject element) {
		return element.hasValidParent(UsecasePackage.Literals.ROOT_PACKAGE)
	}

}