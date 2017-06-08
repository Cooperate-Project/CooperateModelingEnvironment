package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for atomic state processor extensions.
 * 
 * This base class verifies that the element passed to the application method is compatible with the processor.
 * Otherwise, the event is logged and the processor states that processing failed.
 *
 * @param <T>
 *            The type of the supported elements.
 */
public abstract class AtomicStateProcessorExtensionBase<T extends EObject>
        implements IAtomicStateProcessorExtension<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtomicStateProcessorExtensionBase.class);
    private final Class<T> clazz;

    /**
     * Constructor for the base class.
     * 
     * @param clazz
     *            The class the extension is registered for and that can be handled by the processor.
     */
    public AtomicStateProcessorExtensionBase(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Boolean apply(EObject object) {
        if (clazz.isInstance(object)) {
            return applyTyped((T) object);
        }
        if (object != null) {
            LOGGER.error("An element compatible to {} was expected but got {}", clazz.getSimpleName(),
                    object.getClass().getSimpleName());
        }
        return false;
    }

    protected abstract Boolean applyTyped(T object);

    @Override
    public Class<T> getSupportedType() {
        return clazz;
    }

}
