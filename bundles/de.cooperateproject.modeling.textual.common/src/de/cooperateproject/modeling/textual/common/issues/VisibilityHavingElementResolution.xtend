package de.cooperateproject.modeling.textual.common.issues

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.uml2.uml.NamedElement
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class VisibilityHavingElementResolution extends AutomatedIssueResolutionBase<VisibilityHavingElement> {
    
    new(VisibilityHavingElement problematicElement, IResolvableChecker<VisibilityHavingElement> checker) {
        super(problematicElement, checker)
    }
    
    override resolve() {
        if (resolvePossible) {
            (problematicElement as UMLReferencingElement<NamedElement>).referencedElement.setVisibility(problematicElement.visibility);
        }
    }
    
}