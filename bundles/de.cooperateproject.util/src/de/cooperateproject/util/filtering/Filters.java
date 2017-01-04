package de.cooperateproject.util.filtering;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filters {

	public static class FilterException extends Exception {

		private static final long serialVersionUID = -2365906383151733902L;

		public FilterException(String message) {
			super(message);
		}

	}

	public static <T> T getElementOfType(Collection<?> elements, Class<T> wantedType) throws FilterException {
		return getElementOfType(elements.stream(), wantedType, true);
	}

	public static <T> T getElementOfType(Object[] elements, Class<T> wantedType) throws FilterException {
		return getElementOfType(Arrays.stream(elements), wantedType, true);
	}
	
	public static <T> T getAnyElementOfType(Object[] elements, Class<T> wantedType) throws FilterException {
		return getElementOfType(Arrays.stream(elements), wantedType, false);
	}

	private static <T> T getElementOfType(Stream<?> elements, Class<T> wantedType, boolean assertAmbiguities) throws FilterException {
		List<T> foundElements = elements.filter(wantedType::isInstance).map(wantedType::cast)
				.collect(Collectors.toList());
		if (foundElements.size() < 0) {
			throw new FilterException("The given list does not contain an element of this type.");
		} else if (assertAmbiguities && foundElements.size() > 1) {
			throw new FilterException("The given list contains more than one element of this type.");
		}
		return foundElements.get(0);
	}
}
