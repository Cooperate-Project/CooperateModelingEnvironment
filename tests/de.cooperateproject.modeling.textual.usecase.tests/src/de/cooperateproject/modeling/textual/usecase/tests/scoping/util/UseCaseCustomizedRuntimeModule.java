package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class UseCaseCustomizedRuntimeModule extends UsecaseRuntimeModule {

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return UsecaseInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

}
