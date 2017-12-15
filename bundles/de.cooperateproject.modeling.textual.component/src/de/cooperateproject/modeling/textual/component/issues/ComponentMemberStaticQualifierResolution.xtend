package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.Feature
import de.cooperateproject.modeling.textual.component.cmp.Member
import de.cooperateproject.modeling.textual.component.cmp.Attribute
import de.cooperateproject.modeling.textual.component.cmp.Method

class ComponentMemberStaticQualifierResolution extends AutomatedIssueResolutionBase<Member<? extends Feature>> {
	
	new(Member<? extends Feature> problematicElement, IResolvableChecker<Member<? extends Feature>> checker) {
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