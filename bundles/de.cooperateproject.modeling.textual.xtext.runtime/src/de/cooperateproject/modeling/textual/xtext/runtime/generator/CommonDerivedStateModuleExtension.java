package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

@SuppressWarnings("all")
public interface CommonDerivedStateModuleExtension {

    public default void configureCommonsElementProcessor(final Binder binder) {
        final Multibinder<IDerivedStateElementProcessor> mb = Multibinder.<IDerivedStateElementProcessor> newSetBinder(
                binder, IDerivedStateElementProcessor.class, Names.named("processor"));
        LinkedBindingBuilder<IDerivedStateElementProcessor> _addBinding = mb.addBinding();
        _addBinding.to(TextualCommonsDerivedStateElementProcessor.class);
    }

    public default void configureComposedDerivedElementProcessor(final Binder binder) {
        binder.bind(IDerivedStateElementProcessor.class).annotatedWith(Names.named("MainProcessor"))
                .to(ComposedDerivedStateElementProcessor.class);
    }

}
