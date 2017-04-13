package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage

import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsAssociationMemberEndRoleNameFactory extends ClsAutomatedIssueResolutionFactoryBase<AssociationMemberEnd> {
	
    static final val ISSUE_CODE = "associationMemberEndRoleNameMismatch";

    new() {
        super(ISSUE_CODE, [isResolvable], AssociationMemberEnd);
    }

	static def isResolvable(AssociationMemberEnd element) {
		element.hasReferencedElement && element.association.hasReferencedElement
	}

    override hasIssueInternal(AssociationMemberEnd element) {
        if (element.referencedElement !== null) {
        	return element.name != element.referencedElement.name
        }
        return false;
    }

    override createInternal(AssociationMemberEnd element) {
        return new ClsAssociationMemberEndRoleNameResolution(element, getResolvableChecker());
    }

    override getResolutionNameInternal(AssociationMemberEnd element) {
        "Set name in UML model to currently used name.";
    }

    override getIssueDescriptionInternal(AssociationMemberEnd eObject) {
        "The role name does not match the role name in the UML model.";
    }

    override getIssueFeatureInternal(AssociationMemberEnd eObject) {
        ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES;
    }
	
}