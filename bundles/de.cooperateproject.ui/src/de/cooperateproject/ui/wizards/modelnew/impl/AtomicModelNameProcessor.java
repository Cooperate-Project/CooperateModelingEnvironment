package de.cooperateproject.ui.wizards.modelnew.impl;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.google.common.base.Strings;

import de.cooperateproject.ui.Activator;

public class AtomicModelNameProcessor implements IValidator {

    @Override
    public IStatus validate(Object value) {
        String modelName = (String) value;
        if (Strings.isNullOrEmpty(modelName)) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The model name must not be empty.");
        }
        return Status.OK_STATUS;
    }

}
