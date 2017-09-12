package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element

class CommonStereotypeApplicationMissingStereotypeResolution extends AutomatedIssueResolutionBase<StereotypeApplication> {

	new(StereotypeApplication element, IResolvableChecker<StereotypeApplication> resolvableChecker) {
		super(element, resolvableChecker)
	}
	
	override resolve() {
		val stereotypeName = problematicElement.stereotype
		
		val umlElement = problematicElement.parentUML
		val stereotype = getApplicableStereotype(umlElement, stereotypeName)

		if(stereotype.present)
			problematicElement.referencedElement = umlElement.applyStereotype(stereotype.get)		
	}
	
	def static getApplicableStereotype(Element umlElement, String stereotypeName) {
		return umlElement.applicableStereotypes.stream.filter[name == stereotypeName].findFirst
	}
	
	def static getParentUML(EObject element) {
		element.eContainer.UMLElement
	}
	
	def static dispatch getUMLElement(UMLReferencingElement<Element> element) {
		return element.referencedElement
	}
	
	def static dispatch getUMLElement(EObject element) {
		return null
	}

	
}
