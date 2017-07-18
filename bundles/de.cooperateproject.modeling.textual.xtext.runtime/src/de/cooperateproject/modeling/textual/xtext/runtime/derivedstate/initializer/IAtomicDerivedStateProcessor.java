package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

/**
 * Atomic state processor.
 * 
 * @param <T>
 *            The type of the element that can be handled.
 */
public interface IAtomicDerivedStateProcessor<T extends EObject> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t
     *            the input argument
     */
    void accept(EObject t);

    /**
     * @return The type that this processor can process.
     */
    Class<T> getType();

    /**
     * 
     * @return The types of other required processors that have to run before this processor.
     */
    Collection<Class<? extends EObject>> getRequirements();

    /**
     * @return The types of other processors that are replaced by this processor.
     */
    Collection<Class<? extends EObject>> getReplacements();

}
