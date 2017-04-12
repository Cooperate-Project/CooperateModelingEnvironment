package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.Association
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.Include
import de.cooperateproject.modeling.textual.usecase.usecase.System
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Element

import static extension de.cooperateproject.modeling.textual.usecase.issues.UsecaseIssueResolutionUtilities.*

class UsecaseUMLReferencingElementMissingElementChecker implements IResolvableChecker<UMLReferencingElement<Element>> {
	
	override isResolvable(UMLReferencingElement<Element> element) {
		element.resolvePossible
	}	
	
	private def dispatch resolvePossible(Actor element) {
		return element.hasValidRootPackageParent
	}
	
	private def dispatch resolvePossible(System element) {
		return element.hasValidRootPackageParent;	
	}
	
	private def dispatch resolvePossible(UseCase element) {
		return element.hasValidParent(UsecasePackage.Literals.SYSTEM);	
	}
	
	private def dispatch resolvePossible(ExtensionPoint element) {
		return element.hasValidParent(UsecasePackage.Literals.USE_CASE);	
	}
	
	private def dispatch resolvePossible(Extend element) {
		return
			element.extension !== null &&
			element.extendedCase !== null &&
			element.extensionLocation !== null &&
			element.extendedCase.hasReferencedElement &&
			element.extensionLocation.hasReferencedElement &&
			element.extension.hasReferencedElement;
	}
	
	private def dispatch resolvePossible(Include element) {
		return
			element.includingCase !== null &&
			element.addition !== null &&
			element.includingCase.hasReferencedElement &&
			element.addition.hasReferencedElement
	}

	private def dispatch resolvePossible(Generalization element) {
		 return
		 	element.specific !== null &&
		 	element.general !== null &&
		 	element.specific.hasReferencedElement &&
		 	element.general.hasReferencedElement
	}
	
	private def dispatch resolvePossible(Association element) {
		return
			element.actor !== null &&
			element.usecase !== null &&
			element.actor.hasReferencedElement &&
			element.usecase.hasReferencedElement
	}
	
	private def dispatch resolvePossible(Comment element) {
		return
			element.commentedElement instanceof UMLReferencingElement<?> &&
			(element.commentedElement as UMLReferencingElement<?>).referencedElement instanceof Element
	}
	
}