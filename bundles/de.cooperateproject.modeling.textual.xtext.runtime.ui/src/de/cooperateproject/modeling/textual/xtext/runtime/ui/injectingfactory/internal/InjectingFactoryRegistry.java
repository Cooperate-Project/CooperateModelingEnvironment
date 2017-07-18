package de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;

import de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.IInjectorProvider;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum InjectingFactoryRegistry {
    INSTANCE;

    private static final String EP_ID = "de.cooperateproject.modeling.textual.xtext.runtime.ui.injectingfactory.providers";
    private static final String EP_ATTR_NAME = "class";
    private final Map<EPackage, IInjectingFactory> injectors;

    private InjectingFactoryRegistry() {
        injectors = collectInjectors();
    }

    public static InjectingFactoryRegistry getInstance() {
        return INSTANCE;
    }

    private static Map<EPackage, IInjectingFactory> collectInjectors() {
        Collection<IInjectorProvider> extensions = ExtensionPointHelper.getExtensions(EP_ID, EP_ATTR_NAME,
                IInjectorProvider.class);
        return Collections.unmodifiableMap(extensions.stream()
                .collect(Collectors.toMap(IInjectorProvider::getEPackage, InjectingFactoryRegistry::createFactory)));
    }

    private static IInjectingFactory createFactory(IInjectorProvider provider) {
        return new InjectingFactoryImpl(provider.getInjector());
    }

    public Optional<IInjectingFactory> getFactory(EPackage ePackage) {
        return Optional.ofNullable(injectors.getOrDefault(ePackage, null));
    }

}
