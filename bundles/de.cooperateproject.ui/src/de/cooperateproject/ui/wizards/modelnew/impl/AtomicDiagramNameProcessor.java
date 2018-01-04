package de.cooperateproject.ui.wizards.modelnew.impl;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.google.common.base.Strings;

import de.cooperateproject.ui.Activator;

public class AtomicDiagramNameProcessor implements IValidator {

    @Override
    public IStatus validate(Object value) {
        String diagramName = (String) value;
        if (Strings.isNullOrEmpty(diagramName)) {
            return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The diagram name must not be empty.");
        }
        return Status.OK_STATUS;
    }

}
