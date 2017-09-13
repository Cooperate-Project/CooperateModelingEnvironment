package de.cooperateproject.modeling.textual.common.issues


import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication
import org.eclipse.emf.ecore.EObject
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element

class CommonStereotypeApplicationMissingStereotypeFactory extends CommonAutomatedIssueResolutionFactoryBase<StereotypeApplication> {

    static val ONLY_CHECK_FIXABLE_TYPES = true
	static val ISSUE_CODE = "textualCommons_missingUMLStereotype"
	static val RESOLVABLE_CHECKER = new CommonStereotypeApplicationMissingStereotypeResolvableChecker()

	@SuppressWarnings("unchecked")
	new() {
		super(ISSUE_CODE, RESOLVABLE_CHECKER,
			StereotypeApplication);
	}

	override hasIssueInternal(StereotypeApplication app) {
		var umlElement = app.umlElement;
		
		if(umlElement.isStereotypeApplied(app.stereotype))
			return false
		
		return app.referencedElement === null
	}
	
	def getUmlElement(StereotypeApplication application) {
		return (application as EObject).eContainer.reference
	}
	
	def dispatch Element getReference(EObject element) {
		return null
	}
	
	def dispatch Element getReference(UMLReferencingElement<Element> element) {
		return element.referencedElement
	}

	override createInternal(StereotypeApplication element) {
		new CommonStereotypeApplicationMissingStereotypeResolution(element, resolvableChecker);
	}

	override getResolutionNameInternal(StereotypeApplication element) {
		"Add UML stereotype";
	}

	override getIssueDescriptionInternal(StereotypeApplication eObject) 
		'''The UML stereotype («eObject.stereotype») is not applied yet.'''

	override getIssueFeatureInternal(StereotypeApplication eObject) {
	    new IssueLocator(TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE, eObject)
		
	}

	protected def dispatch relevantFeature(StereotypeApplication element) {
		TextualCommonsPackage.Literals.STEREOTYPE_APPLICATION__STEREOTYPE
	}

	protected def dispatch relevantFeature(
		de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element element) {
		TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES
	}

}
