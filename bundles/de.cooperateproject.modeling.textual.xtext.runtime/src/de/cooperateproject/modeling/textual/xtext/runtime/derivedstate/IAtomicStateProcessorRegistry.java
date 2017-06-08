package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import java.util.Optional;

/**
 * Registry for atomic state processors.
 * 
 * The registry distinguishes processors for calculating and removing states.
 */
public interface IAtomicStateProcessorRegistry {

    /**
     * Gets the calculator that can process objects of the given class.
     * 
     * @param clz
     *            The class that the processor shall process. The class has to match the processors class exactly.
     * @return The found calculator.
     */
    Optional<IAtomicStateProcessor> getCalculator(Class<?> clz);

    /**
     * Gets the state remover that can process objects of the given class.
     * 
     * @param clz
     *            The class that the processor shall process. The class has to match the processors class exactly.
     * @return The found state remover.
     */
    Optional<IAtomicStateProcessor> getRemover(Class<?> clz);

}