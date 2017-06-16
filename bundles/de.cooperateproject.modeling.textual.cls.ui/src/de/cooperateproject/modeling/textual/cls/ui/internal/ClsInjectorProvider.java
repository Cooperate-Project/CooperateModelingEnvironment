package de.cooperateproject.modeling.textual.cls.ui.internal;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider;

public class ClsInjectorProvider implements IInjectorProvider {

    @Inject
    private Injector injector;

    @Override
    public EPackage getEPackage() {
        return ClsPackage.eINSTANCE;
    }

    @Override
    public Injector getInjector() {
        return injector;
    }

}
