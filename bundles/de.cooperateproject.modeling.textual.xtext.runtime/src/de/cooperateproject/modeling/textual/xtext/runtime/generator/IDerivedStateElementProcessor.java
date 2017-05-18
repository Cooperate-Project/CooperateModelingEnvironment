package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Sets;

/**
 * State processor that can calculate and remove states from elements.
 */
public interface IDerivedStateElementProcessor {

    /**
     * The name of the major processor that can delegate calls to other processors.
     */
    public static final String DERIVED_STATE_PROCESSOR_MAIN_PROCESSOR = "de.cooperateproject.modeling.stateprocessor.MainProcessor";

    /**
     * The name of contribution processors that can handle specific processing steps.
     */
    public static final String DERIVED_STATE_PROCESSOR_CONTRIBUTING_PROCESSOR = "de.cooperateproject.modeling.stateprocessor.ContributingProcessor";

    /**
     * Checks if the passed object can be handled by the processor.
     * 
     * @param clazz
     *            The class that shall be processed.
     * @return Captures the actual type
     *         which is compatible with the processor (the type itself, or one of its super types). If the processor
     *         is not compatible with the object an empty optional is returned.
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

    /**
     * Checks if the processor can directly handle the given class.
     * 
     * @param eClass
     *            The class to be checked.
     * @return True if the processor can handle the class. False otherwise.
     */
    boolean isDirectlyCompatibleWith(EClass eClass);

    /**
     * Tries to process the element and returns true if processing was possible.
     * 
     * @param object
     *            The element to be processed.
     * @return True if the processor can handle the class. False otherwise.
     */
    default boolean processElement(EObject object) {
        return this.processElementUsingType(object.eClass(), object);
    }

    /**
     * Tries to process the element and returns true if processing was possible.
     * 
     * @param clazz
     *            The class to be used to process the object. The class has to be compatible to the object and vice
     *            versa.
     * @param object
     *            The element to be processed.
     * @return True if the element could be processed. False otherwise.
     */
    boolean processElementUsingType(EClass clazz, EObject object);

    /**
     * Simulates a reloading of a resource by removing states that are not recalculated automatically.
     * 
     * @param object
     *            The element to be processed.
     * @return True if the element could be processed. False otherwise.
     */
    default boolean simulateReload(EObject object) {
        return this.simulateReloadUsingType(object.eClass(), object);
    }

    /**
     * Simulates a reloading of a resource by removing states that are not recalculated automatically.
     * 
     * @param clazz
     *            The class to be used to process the object. The class has to be compatible to the object and vice
     *            versa.
     * @param object
     *            The element to be processed.
     * @return True if the element could be processed. False otherwise.
     */
    boolean simulateReloadUsingType(EClass clazz, EObject object);
}
