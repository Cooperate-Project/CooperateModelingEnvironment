package de.cooperateproject.modeling.textual.sequence.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.Element

class SequenceUMLReferencingElementMissingElementFactory extends SequenceAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {
	
	public static val ISSUE_CODE = "referencedUMLElementMissing"
	
	new() {
		super(ISSUE_CODE, new SequenceUMLReferencingElementMissingElementChecker(), UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		// TODO add exception here after implementing #55
        return element.referencedElement === null;
	}
	
	override protected createInternal(UMLReferencingElement<Element> element) {
		new SequenceUMLReferencingElementMissingElementResolution(element, resolvableChecker)
	}
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		"Create UML element";
	}
	
	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
	    val requiredType = element.eClass.getFeatureType(TextualCommonsPackage.eINSTANCE.UMLReferencingElement_ReferencedElement).EClassifier
		'''The UML element («requiredType.name») does not exist yet.'''
	}
	
    override getIssueFeatureInternal(UMLReferencingElement<Element> eObject) {
        new IssueLocator(eObject.relevantFeature, eObject)
    }
    
    protected def dispatch relevantFeature(NamedElement element) {
    	TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME
    }
    
    protected def dispatch relevantFeature(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element element) {
    	TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT
    }
	
}
