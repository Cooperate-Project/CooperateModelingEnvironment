package de.cooperateproject.modeling.textual.component.tests.util;

import de.cooperateproject.modeling.textual.component.ComponentRuntimeModule;
import de.cooperateproject.modeling.textual.component.tests.ComponentInjectorProvider;

public class ComponentTestInjectorProvider extends ComponentInjectorProvider {

    public static class DefaultProvider extends ComponentTestInjectorProvider {

        public DefaultProvider() {
            super(ComponentTestRuntimeModule.class);
        }

    }

    private final ComponentRuntimeModule module;

    public ComponentTestInjectorProvider(ComponentRuntimeModule module) {
        this.module = module;
    }

    public ComponentTestInjectorProvider(Class<? extends ComponentRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ComponentRuntimeModule createRuntimeModule() {
        return module;
    }
}
