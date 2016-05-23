package de.cooperateproject.ui.util;

import java.util.Optional;

public class ConversionUtils {

	private ConversionUtils() {
		// intentionally left blank
	}
	
	public static <T> Optional<T> convert(com.google.common.base.Optional<T> optional) {
		if (!optional.isPresent()) {
			Optional.empty();
		}
		return Optional.of(optional.get());
	}
	
}
