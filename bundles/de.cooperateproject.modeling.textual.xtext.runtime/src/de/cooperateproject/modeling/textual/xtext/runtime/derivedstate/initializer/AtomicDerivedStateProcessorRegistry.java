package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public class AtomicDerivedStateProcessorRegistry implements IAtomicDerivedStateProcessorRegistry {

    private static final String EP_ID = "de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.processor";
    private static final String EP_ATTR_NAME = "class";
    private final Map<DerivedStateProcessorApplicability, Map<Class<? extends EObject>, IAtomicDerivedStateProcessor<EObject>>> processors;

    @Inject
    public AtomicDerivedStateProcessorRegistry(Injector injector) {
        processors = createProcessors(injector);
    }

    private static Map<DerivedStateProcessorApplicability, Map<Class<? extends EObject>, IAtomicDerivedStateProcessor<EObject>>> createProcessors(
            Injector injector) {
        Map<DerivedStateProcessorApplicability, Map<Class<? extends EObject>, IAtomicDerivedStateProcessor<EObject>>> categories = new HashMap<>();
        for (DerivedStateProcessorApplicability applicability : DerivedStateProcessorApplicability.values()) {
            categories.put(applicability, new HashMap<>());
        }
        @SuppressWarnings("unchecked")
        Collection<IAtomicDerivedStateProcessor<EObject>> extensions = ExtensionPointHelper.getExtensions(EP_ID,
                EP_ATTR_NAME,
                (Class<IAtomicDerivedStateProcessor<EObject>>) (Class<?>) IAtomicDerivedStateProcessor.class);
        for (IAtomicDerivedStateProcessor<EObject> extension : extensions) {
            injector.injectMembers(extension);
            Applicability annotation = extension.getClass().getAnnotation(Applicability.class);
            for (DerivedStateProcessorApplicability applicability : annotation.applicabilities()) {
                categories.get(applicability).put(extension.getType(), extension);
            }
        }
        return categories;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type) {
        return Optional.ofNullable((IAtomicDerivedStateProcessor<T>) processors
                .get(DerivedStateProcessorApplicability.INITIALIZATION).getOrDefault(type, null));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type) {
        return Optional.ofNullable((IAtomicDerivedStateProcessor<T>) processors
                .get(DerivedStateProcessorApplicability.CLEANING).getOrDefault(type, null));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type) {
        return Optional.ofNullable((IAtomicDerivedStateProcessor<T>) processors
                .get(DerivedStateProcessorApplicability.CALCULATION).getOrDefault(type, null));
    }

}
