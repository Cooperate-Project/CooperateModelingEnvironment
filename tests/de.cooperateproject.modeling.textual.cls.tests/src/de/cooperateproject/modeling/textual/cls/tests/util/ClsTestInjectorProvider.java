package de.cooperateproject.modeling.textual.cls.tests.util;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.tests.ClsInjectorProvider;

public class ClsTestInjectorProvider extends ClsInjectorProvider {

    public static class DefaultProvider extends ClsTestInjectorProvider {

        public DefaultProvider() {
            super(ClsTestRuntimeModule.class);
        }

    }

    private final ClsRuntimeModule module;

    public ClsTestInjectorProvider(ClsRuntimeModule module) {
        this.module = module;
    }

    public ClsTestInjectorProvider(Class<? extends ClsRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ClsRuntimeModule createRuntimeModule() {
        return module;
    }
}
