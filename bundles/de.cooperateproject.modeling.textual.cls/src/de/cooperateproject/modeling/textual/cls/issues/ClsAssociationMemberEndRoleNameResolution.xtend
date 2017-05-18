package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.UMLPackage.Literals

class ClsAssociationMemberEndRoleNameResolution extends AutomatedIssueResolutionBase<AssociationMemberEnd> {
	
	new(AssociationMemberEnd problematicElement, IResolvableChecker<AssociationMemberEnd> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
        if (resolvePossible) {
            problematicElement.referencedElement.name = problematicElement.name
            if (problematicElement.name === null) {
                problematicElement.referencedElement.eUnset(Literals.NAMED_ELEMENT__NAME)
            }
        }
    }
	
}