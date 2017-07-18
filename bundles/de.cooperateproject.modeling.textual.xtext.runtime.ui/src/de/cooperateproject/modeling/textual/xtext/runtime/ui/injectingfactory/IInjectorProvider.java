package de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

/**
 * Provider for {@link Injector} that match the language for a specific {@link EPackage}.
 */
public interface IInjectorProvider {

    /**
     * @return The {@link EPackage} that the language of the {@link Injector} is about.
     */
    EPackage getEPackage();

    /**
     * @return The {@link Injector} for the specified language.
     */
    Injector getInjector();

}
