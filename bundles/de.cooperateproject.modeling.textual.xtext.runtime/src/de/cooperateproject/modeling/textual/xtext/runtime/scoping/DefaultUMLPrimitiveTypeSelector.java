package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Set;

import org.eclipse.uml2.uml.PrimitiveType;

import com.google.common.collect.Sets;

public class DefaultUMLPrimitiveTypeSelector implements IUMLPrimitiveTypeSelector {

	private static final Set<String> ALLOWED_TYPES = Sets.newHashSet("EString", "EInt", "EDouble", "EBoolean", "EChar",
			"EByte", "EShort", "ELong", "EFloat");

	@Override
	public boolean isSelected(PrimitiveType type) {
		return ALLOWED_TYPES.contains(type.getName());
	}

}
