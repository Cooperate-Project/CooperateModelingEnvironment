package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

public interface IAtomicDerivedStateProcessorRegistry {

    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type);

    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type);

    <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type);

}
