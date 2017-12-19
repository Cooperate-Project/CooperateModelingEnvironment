package de.cooperateproject.modeling.textual.component.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage

class ComponentMissingUMLElementResolutionFactory extends ComponentAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {
	
	static val ISSUE_CODE = "missingUMLReference"
	static val RESOLVABLE_CHECKER = new ComponentMissingUMLElementResolvableChecker()
	
	new() {
		super(ISSUE_CODE, RESOLVABLE_CHECKER, UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		if (element instanceof PackageBase) {
			if (element.owningPackage === null) {
				return false
			}
		}
		return element.referencedElement === null
	}
	
	override protected createInternal(UMLReferencingElement<Element> element) {
		new ComponentMissingUMLElementResolution(element, resolvableChecker)
	}
	
	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
		'''The UML element («element.eClass.name») does not exist yet.'''
	}
	
	override protected getIssueFeatureInternal(UMLReferencingElement<Element> element) {
		new IssueLocator(element.relevantFeature, element)
	}
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		"Create UML element"
	}
	
	protected def dispatch relevantFeature(NamedElement element) {
		TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME
	}

	protected def dispatch relevantFeature(
		de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element element) {
		TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT
	}
	
}