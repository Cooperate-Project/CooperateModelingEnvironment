package de.cooperateproject.modeling.textual.usecase.issues

import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class UsecasePropertyAbstractQualifierResolution extends AutomatedIssueResolutionBase<UMLReferencingElement<Element>> {
	new(UMLReferencingElement<Element> problematicElement, IResolvableChecker<UMLReferencingElement<Element>> checker) {
		super(problematicElement, checker)
	}

	override void resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}

	private def dispatch fixQualifier(Actor element) {
		element.referencedElement.isAbstract = element.abstract
	}
	
	private def dispatch fixQualifier(UseCase element) {
		element.referencedElement.isAbstract = element.abstract
	}
}
