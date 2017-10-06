package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.issues.DependingElementMissingElementResolvableCheckerBase
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.Association
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.Include
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship
import de.cooperateproject.modeling.textual.usecase.usecase.System
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class UsecaseUMLReferencingElementMissingElementChecker extends DependingElementMissingElementResolvableCheckerBase {
	
	protected def dispatch localResolutionPossible(Actor element) {
		return element.hasValidParent(UsecasePackage.Literals.ROOT_PACKAGE)
	}
	
	protected def dispatch localResolutionPossible(System element) {
		return element.hasValidParent(UsecasePackage.Literals.ROOT_PACKAGE)	
	}
	
	protected def dispatch localResolutionPossible(UseCase element) {
		return element.hasValidParent(UsecasePackage.Literals.SYSTEM);	
	}
	
	protected def dispatch localResolutionPossible(ExtensionPoint element) {
		return element.hasValidParent(UsecasePackage.Literals.USE_CASE);	
	}
	
	protected def dispatch localResolutionPossible(Relationship element) {
        return true;    
    }
	
	protected def dispatch getDependencies(Extend element) {
	   #[element.extendedCase, element.extensionLocation, element.extension]    
	}
	
	protected def dispatch getDependencies(Include element) {
		#[element.includingCase, element.addition]
	}

	protected def dispatch getDependencies(Generalization element) {
		 #[element.specific, element.general]
	}
	
	protected def dispatch getDependencies(Association element) {
		#[element.actor, element.usecase]
	}
}