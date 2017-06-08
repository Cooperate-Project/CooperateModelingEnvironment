package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

/**
 * Processor for atomic states (atomic means the state regarding one element).
 * 
 * @param <T>
 *            The type of the elements that can be processed.
 */
@FunctionalInterface
public interface IAtomicStateProcessor extends Function<EObject, Boolean> {

}
