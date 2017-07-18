package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage

class UsecasePropertyAbstractQualifierFactory extends UsecaseAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {
	
	public static val ISSUE_CODE = "mismatchingAbstractUsecaseQualifier";
	
	new() {
		super(ISSUE_CODE, [isResolvable], UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	private static def isResolvable(UMLReferencingElement<Element> element) {
		element.hasReferencedElement
	}
	
	override protected createInternal(UMLReferencingElement<Element> element) {
		return new UsecasePropertyAbstractQualifierResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
		return "The abstractness of the element is different to the abstractness used in UML."
	}
	
	override protected getIssueFeatureInternal(UMLReferencingElement<Element> element) {
		new IssueLocator(element.getIssueFeatureTyped, element)
	}
	
	private def dispatch getIssueFeatureTyped(Actor actor) {
		return UsecasePackage.Literals.ACTOR__ABSTRACT
	}

	private def dispatch getIssueFeatureTyped(UseCase clz) {
		return UsecasePackage.Literals.USE_CASE__ABSTRACT
	}
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		return "Set abstract modifier in UML to the modifier currently used."
	}
	
	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.hasIssueTyped
	}
	
	private def dispatch hasIssueTyped(Actor actor) {
		val umlActorAbstract = actor.referencedElement.abstract
		val usecaseActorAbstract = actor.abstract
		return umlActorAbstract != usecaseActorAbstract
	}

	private def dispatch hasIssueTyped(UseCase useCase) {
		val umlUseCaseAbstract = useCase.referencedElement.abstract
		val clsUseCasebstract = useCase.abstract
		return umlUseCaseAbstract != clsUseCasebstract
	}

	private def dispatch hasIssueTyped(EObject element) {
		return false
	}
	
}
