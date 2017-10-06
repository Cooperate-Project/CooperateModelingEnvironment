package de.cooperateproject.modeling.textual.usecase.issues

import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class UsecaseExtendConditionFactory extends UsecaseAutomatedIssueResolutionFactoryBase<Extend> {
	
	private static val ISSUE_CODE = "usecase_extendConditionDiffers"
	
	new() {
		super(ISSUE_CODE, [isResolvable], Extend)
	}
	
	private static def isResolvable(Extend element) {
		element.hasReferencedElement
	}
	
	override protected createInternal(Extend element) {
		new UsecaseExtendConditionResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(Extend element) {
		"The condition in the UML model does not match the given condition."
	}
	
	override protected getIssueFeatureInternal(Extend element) {
		new IssueLocator(UsecasePackage.eINSTANCE.extend_Condition, element)
	}
	
	override protected getResolutionNameInternal(Extend element) {
		"Set condition in the UML model to the currently used condition."
	}
	
	override protected hasIssueInternal(Extend element) {
		if (!element.hasReferencedElement) {
			return false
		}
		
		val elementCondition = element.condition
		val umlCondition = element.referencedElement?.condition?.specification?.stringValue
		
		elementCondition != umlCondition
	}
	
}