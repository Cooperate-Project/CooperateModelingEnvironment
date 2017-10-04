package de.cooperateproject.modeling.common.primitivetypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.uml2.uml.PrimitiveType;

public class DefaultUMLPrimitiveTypeFilter implements IUMLPrimitiveTypeFilter {

    private static final Set<String> ALLOWED_TYPES = new HashSet<>(
            Arrays.asList("EString", "EInt", "EDouble", "EBoolean", "EChar", "EByte", "EShort", "ELong", "EFloat"));

    @Override
    public boolean isAllowed(PrimitiveType type) {
        return ALLOWED_TYPES.contains(type.getName());
    }

}
