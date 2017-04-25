package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import org.eclipse.uml2.uml.UMLPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsVisibilityCheckFactory extends ClsAutomatedIssueResolutionFactoryBase<Classifier<org.eclipse.uml2.uml.Classifier>> {
	
	static val ISSUE_CODE = "classifierVisibilityMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], Classifier as Class<?> as Class<Classifier<org.eclipse.uml2.uml.Classifier>>)
	}
	
	private static def isResolvable(Classifier<? extends org.eclipse.uml2.uml.Classifier> element) {
		element.hasReferencedElement
	}
	
	override protected createInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		new ClsVisibilityCheckResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		"The visibility of the element does not match the visibility of the according UML element."
	}
	
	override protected getIssueFeatureInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
	    new IssueLocator(ClsPackage.Literals.CLASSIFIER__VISIBILITY, element)
	}
	
	override protected getResolutionNameInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		return "Set visibility in UML to the visibility currently used."
	}
	
	override protected hasIssueInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		if (!element.hasReferencedElement) {
			return false
		}
		val umlVisibilityIsSet = element.referencedElement.eIsSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY)
		val clsClassVisibility = element.visibility.convert
		if (!umlVisibilityIsSet && clsClassVisibility === null) {
			return false
		}
		val umlClassVisibility = element.referencedElement.visibility
		return clsClassVisibility !== umlClassVisibility
	}
	
}