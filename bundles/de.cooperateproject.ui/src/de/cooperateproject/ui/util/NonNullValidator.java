package de.cooperateproject.ui.util;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Validates that the given value is not null.
 */
public class NonNullValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
        return value == null ? Status.CANCEL_STATUS : Status.OK_STATUS;
    }

}
