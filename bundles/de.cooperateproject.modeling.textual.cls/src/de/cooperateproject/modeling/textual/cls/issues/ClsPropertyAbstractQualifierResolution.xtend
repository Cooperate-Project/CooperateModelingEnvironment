package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Method

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsPropertyAbstractQualifierResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
	
	private def dispatch fixQualifier(de.cooperateproject.modeling.textual.cls.cls.Class element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
	private def dispatch fixQualifier(Method element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
}