package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Classifier
import static extension de.cooperateproject.modeling.textual.cls.issues.ClsIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import org.eclipse.uml2.uml.UMLPackage

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
		ClsPackage.Literals.CLASSIFIER__VISIBILITY
	}
	
	override protected getResolutionNameInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		return "Set visibility in UML to the visibility currently used."
	}
	
	override protected hasIssueInternal(Classifier<org.eclipse.uml2.uml.Classifier> element) {
		val umlVisibilityIsSet = element.referencedElement.eIsSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY)
		val clsClassVisibility = ClsIssueResolutionUtilities.convert(element.visibility)
		if (!umlVisibilityIsSet && clsClassVisibility === null) {
			return false
		}
		val umlClassVisibility = element.referencedElement.visibility
		return clsClassVisibility !== umlClassVisibility
	}
	
}