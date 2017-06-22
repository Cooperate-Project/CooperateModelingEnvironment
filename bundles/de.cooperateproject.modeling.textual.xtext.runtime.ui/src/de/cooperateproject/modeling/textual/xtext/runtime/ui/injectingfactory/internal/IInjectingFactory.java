package de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal;

public interface IInjectingFactory {

    <T> T inject(T element);

    <T> T inject(Class<T> element);

}
