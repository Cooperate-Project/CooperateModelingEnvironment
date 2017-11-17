package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Parameter
import de.cooperateproject.modeling.textual.cls.cls.Property
import org.eclipse.uml2.uml.NamedElement

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsPropertyTypeMismatchFactory extends ClsAutomatedIssueResolutionFactoryBase<Property<? extends NamedElement>> {
	
	static val ISSUE_CODE = "clsPropertyTypeMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], ((Property as Class<?>)as Class<Property<? extends NamedElement>>))
	}
	
	private static def isResolvable(Property<? extends NamedElement> element) {
		element.hasReferencedElement
	}
	
	override protected hasIssueInternal(Property<? extends NamedElement> element) {
		element.hasReferencedElement && element.UMLType != element.type
	}
	
	override protected createInternal(Property<? extends NamedElement> element) {
		new ClsPropertyTypeMismatchResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(Property<? extends NamedElement> element) {
		"The type of the element does not match the type in the UML model."
	}
	
	override protected getIssueFeatureInternal(Property<? extends NamedElement> element) {
		new IssueLocator(ClsPackage.Literals.PROPERTY__TYPE, element)
	}
	
	override protected getResolutionNameInternal(Property<? extends NamedElement> element) {
		"Set the type in the UML model to the currently used type"
	}
	
	private static def dispatch getUMLType(Method element) {
		element.referencedElement.type
	}
	
	private static def dispatch getUMLType(Attribute element) {
		element.referencedElement.type
	}
	
	private static def dispatch getUMLType(Parameter element) {
		element.referencedElement.type
	}
	
}