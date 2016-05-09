package de.cooperateproject.ui.util;

import org.eclipse.core.databinding.conversion.IConverter;

public class StringToNumberConverter implements IConverter {
	private final IConverter converter = org.eclipse.core.databinding.conversion.StringToNumberConverter.toInteger(true);

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
}