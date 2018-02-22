package de.cooperateproject.modeling.textual.activity.tests.scoping.util;

import de.cooperateproject.modeling.textual.activity.ActRuntimeModule;
import de.cooperateproject.modeling.textual.activity.tests.ActInjectorProvider;

public class ActivityCustomizedInjectorProvider extends ActInjectorProvider {

    public static class DefaultProvider extends ActivityCustomizedInjectorProvider {

        public DefaultProvider() {
            super(ActivityCustomizedRuntimeModule.class);
        }

    }

    private final ActRuntimeModule module;

    public ActivityCustomizedInjectorProvider(ActRuntimeModule module) {
        this.module = module;
    }

    public ActivityCustomizedInjectorProvider(Class<? extends ActRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected ActRuntimeModule createRuntimeModule() {
        return module;
    }

}
