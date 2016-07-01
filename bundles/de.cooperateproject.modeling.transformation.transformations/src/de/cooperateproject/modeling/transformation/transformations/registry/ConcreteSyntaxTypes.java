package de.cooperateproject.modeling.transformation.transformations.registry;

import org.apache.commons.lang3.StringUtils;

public enum ConcreteSyntaxTypes {

	TEXTUAL,
	GRAPHICAL;
	
	@Override
	public String toString() {
		return StringUtils.capitalize(StringUtils.lowerCase(super.toString()));
	}
	
}
