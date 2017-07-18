package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsAssociationMemberEndTypeFactory extends ClsAutomatedIssueResolutionFactoryBase<AssociationMemberEnd> {

    static final val ISSUE_CODE = "associationMemberEndTypeMismatch";

    new() {
        super(ISSUE_CODE, [isResolvable], AssociationMemberEnd);
    }

    static def isResolvable(AssociationMemberEnd element) {
        element.association.hasReferencedElement
    }

    override hasIssueInternal(AssociationMemberEnd element) {
        if (element.hasReferencedElement) {
            return element.type.referencedElement != element.referencedElement.type
        }
        return false;
    }

    override createInternal(AssociationMemberEnd element) {
        return new ClsAssociationMemberEndTypeResolution(element, getResolvableChecker());
    }

    override getResolutionNameInternal(AssociationMemberEnd element) {
        "Set type in UML model to currently type.";
    }

    override getIssueDescriptionInternal(AssociationMemberEnd eObject) {
        "The type does not match the type in the UML model.";
    }

    override getIssueFeatureInternal(AssociationMemberEnd eObject) {
        val index = eObject.association.memberEnds.indexOf(eObject)
        return new IssueLocator(ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES, index, eObject.association, eObject)
    }

}
