package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;

public class UseCaseCustomizedInjectorProvider extends UsecaseInjectorProvider {

    public static class DefaultProvider extends UseCaseCustomizedInjectorProvider {

        public DefaultProvider() {
            super(UseCaseCustomizedRuntimeModule.class);
        }

    }

    private final UsecaseRuntimeModule module;

    public UseCaseCustomizedInjectorProvider(UsecaseRuntimeModule module) {
        this.module = module;
    }

    public UseCaseCustomizedInjectorProvider(Class<? extends UsecaseRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected UsecaseRuntimeModule createRuntimeModule() {
        return module;
    }

}
