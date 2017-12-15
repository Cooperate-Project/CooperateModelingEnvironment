package de.cooperateproject.modeling.textual.component.issues

import org.eclipse.emf.ecore.EObject
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage
import de.cooperateproject.modeling.textual.component.cmp.Method

class ComponentMethodAbstractQualifierFactory extends ComponentAutomatedIssueResolutionFactoryBase<Method> {

	public static val ISSUE_CODE = "mismatchingAbstractQualifier";

	new() {
		super(ISSUE_CODE, [isResolvable], Method)
	}
	
	private static def isResolvable(Method element) {
		element.hasReferencedElement
	}

	override protected createInternal(Method element) {
		return new ComponentMethodAbstractQualifierResolution(element, resolvableChecker)
	}

	override protected getIssueDescriptionInternal(Method element) {
		return "The abstractness of the element is different to the abstractness used in UML."
	}

	override protected getIssueFeatureInternal(Method element) {
	    new IssueLocator(element.getIssueFeatureTyped, element)
	}

	private def getIssueFeatureTyped(Method clz) {
		return CmpPackage.Literals.METHOD__ABSTRACT
	}
	
	override protected getResolutionNameInternal(Method element) {
		return "Set abstract modifier in UML to the modifier currently used."
	}

	override protected hasIssueInternal(Method element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.hasIssueTyped
	}

	private def dispatch hasIssueTyped(Method method) {
		val umlMethodAbstract = method.referencedElement.abstract
		val cmpMethodAbstract = method.abstract
		return umlMethodAbstract != cmpMethodAbstract
	}

	private def dispatch hasIssueTyped(EObject element) {
		return false
	}

}
