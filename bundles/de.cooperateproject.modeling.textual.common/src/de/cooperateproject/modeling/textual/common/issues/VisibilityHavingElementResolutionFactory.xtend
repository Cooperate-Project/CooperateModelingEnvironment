package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement
import org.eclipse.uml2.uml.NamedElement

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*
import org.eclipse.uml2.uml.UMLPackage

class VisibilityHavingElementResolutionFactory extends CommonAutomatedIssueResolutionFactoryBase<VisibilityHavingElement> {
    
    static val ISSUE_CODE = "visibilityHavingElement_VisibilityMismatch"
    
    new() {
        super(ISSUE_CODE, [isResolvable], VisibilityHavingElement)
    }
    
    private static def isResolvable(VisibilityHavingElement element) {
        if (element instanceof UMLReferencingElement) {
            element.hasReferencedElementOfType(NamedElement)
        }
    }
    
    override protected createInternal(VisibilityHavingElement element) {
        new VisibilityHavingElementResolution(element, resolvableChecker)
    }
    
    override protected getIssueDescriptionInternal(VisibilityHavingElement element) {
        "The visibility of the element does not match the visibility of the according UML element."
    }
    
    override protected getIssueFeatureInternal(VisibilityHavingElement element) {
        new IssueLocator(TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, element)
    }
    
    override protected getResolutionNameInternal(VisibilityHavingElement element) {
        return "Set visibility in UML to the visibility currently used."
    }
    
    override protected hasIssueInternal(VisibilityHavingElement element) {
        if (!(element instanceof UMLReferencingElement)) {
            return false
        }
        
        var umlReferencingElement = element as UMLReferencingElement<NamedElement>
        if (!umlReferencingElement.hasReferencedElement) {
            return false
        }
        
        val umlVisibilityIsSet = umlReferencingElement.referencedElement.isSetVisibility
        val txtCmnsVisibilityIsSet = element.isSetVisibility
        if (!umlVisibilityIsSet && !txtCmnsVisibilityIsSet) {
            return false
        }
        
        val txtCmnsVisibility = element.visibility
        val umlVisibility = umlReferencingElement.referencedElement.visibility
        return umlVisibilityIsSet !== txtCmnsVisibilityIsSet || txtCmnsVisibility !== umlVisibility
    }
    
}