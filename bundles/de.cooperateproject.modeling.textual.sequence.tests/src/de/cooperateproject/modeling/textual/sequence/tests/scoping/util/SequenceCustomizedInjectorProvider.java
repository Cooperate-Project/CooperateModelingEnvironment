package de.cooperateproject.modeling.textual.sequence.tests.scoping.util;

import de.cooperateproject.modeling.textual.sequence.SequenceRuntimeModule;
import de.cooperateproject.modeling.textual.sequence.tests.SequenceInjectorProvider;

public class SequenceCustomizedInjectorProvider extends SequenceInjectorProvider {

    public static class DefaultProvider extends SequenceCustomizedInjectorProvider {

        public DefaultProvider() {
            super(SequenceCustomizedRuntimeModule.class);
        }

    }

    private final SequenceRuntimeModule module;

    public SequenceCustomizedInjectorProvider(SequenceRuntimeModule module) {
        this.module = module;
    }

    public SequenceCustomizedInjectorProvider(Class<? extends SequenceRuntimeModule> moduleClass) {
        try {
            this.module = moduleClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected SequenceRuntimeModule createRuntimeModule() {
        return module;
    }

}
