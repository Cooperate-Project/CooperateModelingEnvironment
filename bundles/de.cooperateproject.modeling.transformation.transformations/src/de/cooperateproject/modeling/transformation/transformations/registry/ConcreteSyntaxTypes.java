package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Arrays;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Iterables;

public enum ConcreteSyntaxTypes {

	TEXTUAL,
	GRAPHICAL;
	
	@Override
	public String toString() {
		return StringUtils.capitalize(StringUtils.lowerCase(super.toString()));
	}
	
	public static Optional<ConcreteSyntaxTypes> getByName(String name) {
		com.google.common.base.Optional<ConcreteSyntaxTypes> foundType = Iterables.tryFind(Arrays.asList(values()), t -> t.toString().equals(name));
		if (foundType.isPresent()) {
			Optional.of(foundType.get());
		}
		return Optional.empty();
	}
	
}
