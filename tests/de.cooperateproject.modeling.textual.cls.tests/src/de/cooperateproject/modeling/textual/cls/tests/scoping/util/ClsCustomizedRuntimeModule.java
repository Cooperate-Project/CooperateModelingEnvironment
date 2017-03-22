package de.cooperateproject.modeling.textual.cls.tests.scoping.util;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.tests.ClsInjectorProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class ClsCustomizedRuntimeModule extends ClsRuntimeModule {

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return ClsInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

}
