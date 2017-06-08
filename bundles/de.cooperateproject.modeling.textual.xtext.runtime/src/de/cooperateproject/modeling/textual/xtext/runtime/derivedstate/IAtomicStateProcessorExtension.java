package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import org.eclipse.emf.ecore.EObject;

/**
 * Extension that affects the state of one element (so called atomic state).
 * 
 * @param <T>
 *            The type of the elements that can be processed.
 */
public interface IAtomicStateProcessorExtension<T extends EObject> extends IAtomicStateProcessor {

    /**
     * @return The type of elements this processor can process.
     */
    Class<T> getSupportedType();

}
