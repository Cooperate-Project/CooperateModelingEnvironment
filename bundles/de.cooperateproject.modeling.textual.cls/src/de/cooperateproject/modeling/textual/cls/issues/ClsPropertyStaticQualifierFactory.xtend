package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Member
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Feature

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsPropertyStaticQualifierFactory extends ClsAutomatedIssueResolutionFactoryBase<Member<? extends Element>> {
	
	public static val ISSUE_CODE = "staticModifierMismatch"
	
	new() {
		super(ISSUE_CODE, [isResolvable], Member as Class<?> as Class<Member<? extends Element>>)
	}
	
	private static def isResolvable(Member<? extends Element> element) {
		return element.hasReferencedElement
	}
	
	override protected createInternal(Member<? extends Element> element) {
		return new ClsPropertyStaticQualifierResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(Member<? extends Element> element) {
		return "The staticness of the element is different to the staticness used in UML."
	}
	
	override protected getIssueFeatureInternal(Member<? extends Element> element) {
	    new IssueLocator(ClsPackage.Literals.PROPERTY__STATIC, element)
	}
	
	override protected getResolutionNameInternal(Member<? extends Element> element) {
		return "Set static modifier to modifier in UML to the modifier currently used."
	}
	
	override protected hasIssueInternal(Member<? extends Element> element) {
		if (element.hasReferencedElementOfType(Feature)) {
			val umlStatic = (element.referencedElement as Feature).static
			val clsAttributeStatic = element.static
			return umlStatic != clsAttributeStatic
		}
		return false
	}
	
}