package de.cooperateproject.ui.util;

import org.eclipse.core.databinding.conversion.IConverter;

public class NumberToStringConverter implements IConverter {
	
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
}