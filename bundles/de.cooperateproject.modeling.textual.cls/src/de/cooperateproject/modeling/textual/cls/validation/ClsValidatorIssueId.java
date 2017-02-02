package de.cooperateproject.modeling.textual.cls.validation;

import java.util.Arrays;

public enum ClsValidatorIssueId {

    NO_CLASS_REFERENCE(ClsValidatorConstants.NO_CLASS_REFERENCE),
    NO_INTERFACE_REFERENCE(ClsValidatorConstants.NO_INTERFACE_REFERENCE),
    NO_PACKAGE_REFERENCE(ClsValidatorConstants.NO_PACKAGE_REFERENCE),
    NO_IMPORT_REFERENCE(ClsValidatorConstants.NO_IMPORT_REFERENCE),
    NO_PROPERTY_REFERENCE(ClsValidatorConstants.NO_PROPERTY_REFERENCE),
    WRONG_PROPERTY_TYPE(ClsValidatorConstants.WRONG_PROPERTY_TYPE),
    WRONG_PROPERTY_STATIC_QUALIFIER(ClsValidatorConstants.WRONG_PROPERTY_STATIC_QUALIFIER),
    WRONG_ABSTRACT_QUALIFIER(ClsValidatorConstants.WRONG_ABSTRACT_QUALIFIER),
    NO_OPERATION_REFERENCE(ClsValidatorConstants.NO_OPERATION_REFERENCE),
    NO_ASSOCIATION_REFERENCE(ClsValidatorConstants.NO_ASSOCIATION_REFERENCE),
    NO_GENERALIZATION_REFERENCE(ClsValidatorConstants.NO_GENERALIZATION_REFERENCE),
    NO_REALIZATION_REFERENCE(ClsValidatorConstants.NO_REALIZATION_REFERENCE),
    NO_ALIAS_NAME(ClsValidatorConstants.NO_ALIAS_NAME),
    WRONG_ALIAS_NAME(ClsValidatorConstants.WRONG_ALIAS_NAME),
    NO_COMMENT_REFERENCE(ClsValidatorConstants.NO_COMMENT_REFERENCE),
    ALIAS_EXISTS(ClsValidatorConstants.ALIAS_EXISTS),
    NOT_AN_INTERFACE(ClsValidatorConstants.NOT_AN_INTERFACE),
    NOT_A_CLASS(ClsValidatorConstants.NOT_A_CLASS);

    private final String id;

    private ClsValidatorIssueId(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static boolean isContained(String id) {
        return Arrays.stream(ClsValidatorIssueId.values()).anyMatch(literal -> literal.getID().equals(id));
    }
}
