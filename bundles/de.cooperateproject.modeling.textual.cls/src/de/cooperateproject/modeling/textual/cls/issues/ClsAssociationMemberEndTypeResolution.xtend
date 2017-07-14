package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionBase
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker
import org.eclipse.uml2.uml.UMLPackage.Literals

class ClsAssociationMemberEndTypeResolution extends AutomatedIssueResolutionBase<AssociationMemberEnd> {
	
	new(AssociationMemberEnd problematicElement, IResolvableChecker<AssociationMemberEnd> checker) {
		super(problematicElement, checker)
	}
	
	override resolve() {
        if (resolvePossible) {
            problematicElement.referencedElement.type = problematicElement.type.referencedElement
            if (problematicElement.type === null) {
                problematicElement.referencedElement.eUnset(Literals.TYPED_ELEMENT__TYPE)
            }
        }
    }
	
}