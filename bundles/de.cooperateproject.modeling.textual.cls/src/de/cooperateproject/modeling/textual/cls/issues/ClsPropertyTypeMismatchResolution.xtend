package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.Property
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Type

class ClsPropertyTypeMismatchResolution extends AutomatedIssueResolutionBase<Property<? extends NamedElement>> {
	
	new(Property<? extends NamedElement> problematicElement, IResolvableChecker<Property<? extends NamedElement>> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
		if (!resolvableChecker.isResolvable(problematicElement)) {
			return
		}
		
		problematicElement.typeInUML = problematicElement.type
	}
	
	def dispatch setTypeInUML(Parameter param, Type type) {
		param.referencedElement.type = type
	}
	
	def dispatch setTypeInUML(Method param, Type type) {
		param.referencedElement.type = type
	}
	
	def dispatch setTypeInUML(Attribute param, Type type) {
		param.referencedElement.type = type
	}
	
}