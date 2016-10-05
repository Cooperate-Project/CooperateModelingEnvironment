package de.cooperateproject.modeling.common.types;

import java.util.Arrays;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

public enum ConcreteSyntaxTypes {

	TEXTUAL,
	GRAPHICAL;
	
	@Override
	public String toString() {
		return StringUtils.capitalize(StringUtils.lowerCase(super.toString()));
	}
	
	public static Optional<ConcreteSyntaxTypes> getByName(String name) {
		return Arrays.stream(values()).filter(t -> t.toString().equals(name)).findFirst();
	}
	
}
