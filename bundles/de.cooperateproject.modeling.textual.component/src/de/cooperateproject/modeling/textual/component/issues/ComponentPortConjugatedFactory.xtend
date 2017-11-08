package de.cooperateproject.modeling.textual.component.issues


import org.eclipse.emf.ecore.EObject
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import de.cooperateproject.modeling.textual.component.cmp.Port
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage

class ComponentPortConjugatedFactory extends ComponentAutomatedIssueResolutionFactoryBase<Port> {

	public static val ISSUE_CODE = "mismatchingPortConjugated";

	new() {
		super(ISSUE_CODE, [isResolvable], Port)
	}
	
	private static def isResolvable(Port element) {
		element.hasReferencedElement
	}

	override protected createInternal(Port element) {
		return new ComponentPortConjugatedResolution(element, resolvableChecker)
	}

	override protected getIssueDescriptionInternal(Port element) {
		return "The conjugated property of the port is different to the value used in UML."
	}

	override protected getIssueFeatureInternal(Port element) {
	    new IssueLocator(element.getIssueFeatureTyped, element)
	}

	private def getIssueFeatureTyped(Port port) {
		return CmpPackage.Literals.PORT__CONJUGATED
	}

	override protected getResolutionNameInternal(Port element) {
		return "Set conjugated property in UML to the value currently used."
	}

	override protected hasIssueInternal(Port element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.hasIssueTyped
	}

	private def dispatch hasIssueTyped(Port port) {
		val umlPortConjugated = port.referencedElement.conjugated
		val cmpPortConjugated = port.conjugated
		return umlPortConjugated != cmpPortConjugated
	}

	

	private def dispatch hasIssueTyped(EObject element) {
		return false
	}

}
