package de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal;

import com.google.inject.Injector;

public class InjectingFactoryImpl implements IInjectingFactory {

    private final Injector injector;

    public InjectingFactoryImpl(Injector injector) {
        super();
        this.injector = injector;
    }

    @Override
    public <T> T inject(T element) {
        injector.injectMembers(element);
        return element;
    }

    @Override
    public <T> T inject(Class<T> element) {
        return injector.getInstance(element);
    }

}
