package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element

class CommonUMLReferencingElementMissingElementFactory extends CommonAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {

	static val ISSUE_CODE = "missingUMLReference";
	static val RESOLVABLE_CHECKER = new CommonUMLReferencingElementMissingElementResolvableChecker()

	@SuppressWarnings("unchecked")
	new() {
		super(ISSUE_CODE, RESOLVABLE_CHECKER,
			UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>);
	}

	override hasIssueInternal(UMLReferencingElement<Element> element) {
		if (element instanceof PackageBase) {
			if (element.owningPackage === null) {
				return false;
			}
		}
		return element.referencedElement === null;
	}

	override createInternal(UMLReferencingElement<Element> element) {
		new CommonUMLReferencingElementMissingElementResolution(element, resolvableChecker);
	}

	override getResolutionNameInternal(UMLReferencingElement<Element> element) {
		"Create UML element";
	}

	override getIssueDescriptionInternal(UMLReferencingElement<Element> eObject) {
		"The UML element does not exist yet.";
	}

	override getIssueFeatureInternal(UMLReferencingElement<Element> eObject) {
	    new IssueLocator(eObject.relevantFeature, eObject)
		
	}

	protected def dispatch relevantFeature(NamedElement element) {
		TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME
	}

	protected def dispatch relevantFeature(
		de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element element) {
		TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT
	}

}
