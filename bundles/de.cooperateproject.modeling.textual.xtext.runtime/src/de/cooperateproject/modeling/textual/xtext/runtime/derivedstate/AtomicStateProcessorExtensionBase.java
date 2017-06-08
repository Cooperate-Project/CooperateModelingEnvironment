package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

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

    private static final Logger LOGGER = Logger.getLogger(AtomicStateProcessorExtensionBase.class);
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
            LOGGER.error(String.format("An element compatible to %s was expected but got %s", clazz.getSimpleName(),
                    object.getClass().getSimpleName()));
        }
        return false;
    }

    protected abstract Boolean applyTyped(T object);

    @Override
    public Class<T> getSupportedType() {
        return clazz;
    }

}
