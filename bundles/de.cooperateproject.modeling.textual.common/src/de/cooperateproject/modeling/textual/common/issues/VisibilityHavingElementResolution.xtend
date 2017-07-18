package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.NamedElement

class VisibilityHavingElementResolution extends AutomatedIssueResolutionBase<VisibilityHavingElement> {
    
    new(VisibilityHavingElement problematicElement, IResolvableChecker<VisibilityHavingElement> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        if (resolvePossible) {
        	val referencedElement = (problematicElement as UMLReferencingElement<NamedElement>).referencedElement
        	if (problematicElement.isSetVisibility) {
            	referencedElement.setVisibility(problematicElement.visibility)        		
        	} else {
        		referencedElement.unsetVisibility
        	}
        }
    }
    
}