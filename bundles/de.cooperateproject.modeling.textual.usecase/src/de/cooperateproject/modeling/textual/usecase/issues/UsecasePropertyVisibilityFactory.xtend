package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import org.eclipse.emf.ecore.EObject

class UsecasePropertyVisibilityFactory extends UsecaseAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {
	
	public static val ISSUE_CODE = "mismatchingUsecaseVisibility";
	
	new() {
		super(ISSUE_CODE, [isResolvable], UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	private static def isResolvable(UMLReferencingElement<Element> element) {
		element.hasReferencedElement
	}
	
	override protected createInternal(UMLReferencingElement<Element> element) {
		return new UsecasePropertyVisibilityResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
		return "The visibility of the element is different to the visibility used in UML."
	}
	
	override protected getIssueFeatureInternal(UMLReferencingElement<Element> element) {
		new IssueLocator(element.getIssueFeatureTyped, element)
	}
	
	private def dispatch getIssueFeatureTyped(Actor actor) {
		return TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY
	}
	private def dispatch getIssueFeatureTyped(UseCase actor) {
		return TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY
	}
	
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		return "Set visibility in UML to the visibility currently used."
	}
	
	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.hasIssueTyped
	}
	
	private def dispatch hasIssueTyped(Actor actor) {
		val umlActorVisibility = actor.referencedElement.visibility
		val usecaseActorVisibility = actor.visibility
		return umlActorVisibility != usecaseActorVisibility
	}

	private def dispatch hasIssueTyped(UseCase useCase) {
		val umlUseCaseVisibility = useCase.referencedElement.visibility
		val clsUseCaseVisibility = useCase.visibility
		return umlUseCaseVisibility != clsUseCaseVisibility
	}

	private def dispatch hasIssueTyped(EObject element) {
		return false
	}
	
}