package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

/**
 * Registry for {@link IAtomicDerivedStateProcessor} elements.
 * 
 * Implementations must prohibit registering multiple processors for a given type.
 */
public interface IAtomicDerivedStateProcessorRegistry {

    /**
     * Finds an initializer for the given type.
     * 
     * This method does not handle inheritance but only looks for processors that can handle exactly the given type.
     * 
     * @param type
     *            The type that the initializer shall be able to process.
     * @return The found initializer or {@link Optional#empty()} otherwise.
     */
    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type);

    /**
     * Finds a calculator for the given type.
     * 
     * This method does not handle inheritance but only looks for processors that can handle exactly the given type.
     * 
     * @param type
     *            The type that the calculator shall be able to process.
     * @return The found calculator or {@link Optional#empty()} otherwise.
     */
    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type);

    /**
     * Finds a remover for the given type.
     * 
     * This method does not handle inheritance but only looks for processors that can handle exactly the given type.
     * 
     * @param type
     *            The type that the remover shall be able to process.
     * @return The found remover or {@link Optional#empty()} otherwise.
     */
    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type);

}
