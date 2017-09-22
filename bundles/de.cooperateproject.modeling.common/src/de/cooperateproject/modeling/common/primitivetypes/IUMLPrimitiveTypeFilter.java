package de.cooperateproject.modeling.common.primitivetypes;

import org.eclipse.uml2.uml.PrimitiveType;

public interface IUMLPrimitiveTypeFilter {

	public boolean isAllowed(PrimitiveType type);
	
}
