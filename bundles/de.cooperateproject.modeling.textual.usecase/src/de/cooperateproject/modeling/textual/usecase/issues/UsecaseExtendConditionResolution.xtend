package de.cooperateproject.modeling.textual.usecase.issues

import com.google.common.base.Strings
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.OpaqueExpression
import de.cooperateproject.modeling.textual.usecase.derivedstate.initializers.ExtendInitializer

class UsecaseExtendConditionResolution extends AutomatedIssueResolutionBase<Extend> {
	
	new(Extend problematicElement, IResolvableChecker<Extend> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		val umlElement = problematicElement.referencedElement
		val conditionToSet = problematicElement.condition
		if (Strings.isNullOrEmpty(conditionToSet) && umlElement.condition !== null) {
			EcoreUtil.delete(umlElement.condition)
		} else {
			if (umlElement.condition === null) {
				umlElement.createCondition(null, UMLPackage.eINSTANCE.constraint)
			}
			if (umlElement.condition.specification !== null && !(umlElement.condition.specification instanceof OpaqueExpression)) {
				EcoreUtil.delete(umlElement.condition.specification)
			}
			if (umlElement.condition.specification === null) {
				umlElement.condition.createSpecification(null, null, UMLPackage.eINSTANCE.opaqueExpression)
			}
			val conditionExpression = umlElement.condition.specification as OpaqueExpression
			conditionExpression.languages.clear
			conditionExpression.languages += ExtendInitializer.CONDITION_LANGUAGE_NAME
			conditionExpression.bodies.clear
			conditionExpression.bodies += conditionToSet	
		}
	}
	
}