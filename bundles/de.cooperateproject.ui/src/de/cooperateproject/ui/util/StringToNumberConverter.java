package de.cooperateproject.ui.util;

import org.apache.commons.lang3.math.NumberUtils;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.ui.Activator;

public class StringToNumberConverter implements IConverter, IValidator {
	private final IConverter converter = org.eclipse.core.databinding.conversion.StringToNumberConverter.toInteger(false);

	@Override
	public Object getFromType() {
		return converter.getFromType();
	}

	@Override
	public Object getToType() {
		return converter.getToType();
	}

	@Override
	public Object convert(Object fromObject) {
		return converter.convert(fromObject);
	}

	@Override
	public IStatus validate(Object value) {
		if (!(value instanceof String)) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Only strings are allowed.");
		}
		try {
			NumberUtils.createInteger((String)value);	
		} catch (NumberFormatException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The string has to represent an integer.", e);
		}
		return Status.OK_STATUS;
	}
}