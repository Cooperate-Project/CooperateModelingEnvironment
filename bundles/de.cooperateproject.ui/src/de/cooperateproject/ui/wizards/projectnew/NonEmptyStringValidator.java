package de.cooperateproject.ui.wizards.projectnew;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.ui.Activator;

public class NonEmptyStringValidator implements IValidator {

	@Override
	public IStatus validate(Object value) {
		if (!(value instanceof String)) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The value must be a string.");
		}
		
		if (StringUtils.isEmpty((String)value)) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The value must not be empty.");
		}

		return Status.OK_STATUS;
	}

}
