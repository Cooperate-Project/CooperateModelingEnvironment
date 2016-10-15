package de.cooperateproject.ui.util;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.cooperateproject.ui.Activator;

public class NumberToStringConverter implements IConverter, IValidator {
	
	@Override
	public Object getFromType() {
		return Integer.class;
	}

	@Override
	public Object getToType() {
		return String.class;
	}

	@Override
	public Object convert(Object fromObject) {
		return Integer.toString((Integer)fromObject);
	}

	@Override
	public IStatus validate(Object value) {
		if (!(value instanceof Integer)) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Only integers are allowed.");
		}		
		return Status.OK_STATUS;
	}
}