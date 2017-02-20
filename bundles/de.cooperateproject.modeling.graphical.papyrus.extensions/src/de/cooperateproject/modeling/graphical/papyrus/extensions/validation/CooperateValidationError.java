package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.eclipse.emf.ecore.EObject;

public class CooperateValidationError {

    private String message;

    private EObject invalidObject;

    public CooperateValidationError(String message, EObject invalidObject) {
        super();
        this.message = message;
        this.invalidObject = invalidObject;
    }

    public String getMessage() {
        return message;
    }

    public EObject getInvalidObject() {
        return invalidObject;
    }

}
