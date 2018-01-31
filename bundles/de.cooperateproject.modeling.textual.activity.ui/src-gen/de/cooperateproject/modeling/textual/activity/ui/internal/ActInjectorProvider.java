/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.ui.internal;

import com.google.inject.Inject;
import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider;

/**
 * Language-specific injector provider.
 */
public class ActInjectorProvider implements IInjectorProvider {

    @Inject
    private Injector injector;

    @Override
    public ActPackage getEPackage() {
        return ActPackage.eINSTANCE;
    }

    @Override
    public Injector getInjector() {
        return injector;
    }

}
