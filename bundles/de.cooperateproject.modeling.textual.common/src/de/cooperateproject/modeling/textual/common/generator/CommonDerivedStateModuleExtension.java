package de.cooperateproject.modeling.textual.common.generator;

import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.AtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor;

@SuppressWarnings("all")
public interface CommonDerivedStateModuleExtension {

    public default void configureCommonsElementProcessor(final Binder binder) {
        final Multibinder<IDerivedStateElementProcessor> mb = Multibinder.<IDerivedStateElementProcessor> newSetBinder(
                binder, IDerivedStateElementProcessor.class,
                Names.named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_CONTRIBUTING_PROCESSOR));
        LinkedBindingBuilder<IDerivedStateElementProcessor> _addBinding = mb.addBinding();
        _addBinding.to(TextualCommonsDerivedStateElementProcessor.class);
    }

    public default void configureComposedDerivedElementProcessor(final Binder binder) {
        binder.bind(IDerivedStateElementProcessor.class)
                .annotatedWith(Names.named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_MAIN_PROCESSOR))
                .to(ComposedDerivedStateElementProcessor.class);
    }

    public default Class<? extends IAtomicStateProcessorRegistry> bindIAtomicStateProcessorRegistry() {
        return AtomicStateProcessorRegistry.class;
    }

}
