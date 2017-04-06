package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsPropertyStaticQualifierResolution extends AutomatedIssueResolutionBase<Member<? extends Element>> {
	
	new(Member<? extends Element> problematicElement, IResolvableChecker<Member<? extends Element>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (resolvePossible) {
			fixQualifier(problematicElement)
		}
	}
		
	private def dispatch fixQualifier(Attribute element) {
		element.referencedElement.isStatic = element.static
	}
	
	private def dispatch fixQualifier(Method element) {
		element.referencedElement.isStatic = element.static
	}
	
}