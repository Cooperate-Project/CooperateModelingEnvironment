package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Sets;

public interface IDerivedStateElementProcessor {
    /**
     * Checks if the passed object can be handled by the processor. The return value captures the actual type
     * which is compatible with the processor (the type itself, or one of its super types). If the processor
     * is not compatible with the object an empty optional is returned.
     */
    default Optional<EClass> hasCapabilitiesForHandling(EClass clazz) {
        if (isDirectlyCompatibleWith(clazz)) {
            return Optional.of(clazz);
        } else {
            Set<EClass> superClasses = Sets.newHashSet(clazz);
            do {
                superClasses = superClasses.stream().flatMap(c -> c.getESuperTypes().stream())
                        .collect(Collectors.toSet());
                Optional<EClass> cls = superClasses.stream().filter(this::isDirectlyCompatibleWith).findFirst();
                if (cls.isPresent()) {
                    return cls;
                }

            } while (!superClasses.isEmpty());
        }
        return Optional.empty();
    }

    boolean isDirectlyCompatibleWith(EClass eClass);

    /**
     * Tries to process the element and returns true if processing was possible.
     */
    default boolean processElement(EObject object) {
        return this.processElementUsingType(object.eClass(), object);
    }

    boolean processElementUsingType(EClass clazz, EObject object);
}
