package de.cooperateproject.modeling.textual.xtext.generator.util;

import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("restriction")
public interface TypeReferenceMixin {

    default TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

    default TypeReference typeRef(String fqn) {
        return TypeReference.typeRef(fqn);
    }

}
