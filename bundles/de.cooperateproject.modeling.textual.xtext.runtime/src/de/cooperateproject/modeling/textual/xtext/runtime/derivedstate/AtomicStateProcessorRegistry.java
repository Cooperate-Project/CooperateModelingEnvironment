package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Implementation of the atomic state processor registry.
 * 
 * The processors are gathered from the extension points {@link #EXTENSION_POINT_ID_CALCULATOR} and
 * {@link #EXTENSION_POINT_ID_REMOVER}. If multiple processors support the exactly same class, all but one processors
 * will be discarded non-deterministically.
 *
 */
public class AtomicStateProcessorRegistry implements IAtomicStateProcessorRegistry {

    private static final String EXTENSION_POINT_ID_CALCULATOR = "de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.calculator";
    private static final String EXTENSION_POINT_ID_REMOVER = "de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.remover";
    private static final String EXTENSION_POINT_ATTRIBUTE_NAME = "class";

    private final Map<Class<? extends EObject>, IAtomicStateProcessor<EObject>> stateCalculators;
    private final Map<Class<? extends EObject>, IAtomicStateProcessor<EObject>> stateRemovers;

    /**
     * Constructs the atomic state processor registry.
     * 
     * @param injector
     *            The injector to be used to inject members into the managed processors.
     */
    @Inject
    public AtomicStateProcessorRegistry(Injector injector) {
        stateCalculators = initStateCalculators(injector);
        stateRemovers = initStateRemovers(injector);
    }

    @Override
    public Optional<IAtomicStateProcessor<? extends EObject>> getCalculator(Class<?> clz) {
        return Optional.ofNullable(stateCalculators.getOrDefault(clz, null));
    }

    @Override
    public Optional<IAtomicStateProcessor<? extends EObject>> getRemover(Class<?> clz) {
        return Optional.ofNullable(stateRemovers.getOrDefault(clz, null));
    }

    private static Map<Class<? extends EObject>, IAtomicStateProcessor<EObject>> initStateCalculators(
            Injector injector) {
        return getProcessors(injector, EXTENSION_POINT_ID_CALCULATOR);
    }

    private static Map<Class<? extends EObject>, IAtomicStateProcessor<EObject>> initStateRemovers(Injector injector) {
        return getProcessors(injector, EXTENSION_POINT_ID_REMOVER);
    }

    private static Map<Class<? extends EObject>, IAtomicStateProcessor<EObject>> getProcessors(Injector injector,
            String extensionPointId) {
        Collection<IAtomicStateProcessorExtension> extensions = ExtensionPointHelper.getExtensions(extensionPointId,
                EXTENSION_POINT_ATTRIBUTE_NAME, IAtomicStateProcessorExtension.class);
        return extensions.stream().collect(Collectors.toMap(IAtomicStateProcessorExtension::getSupportedType,
                e -> getInjectedProcessor(injector, e)));
    }

    private static IAtomicStateProcessor<EObject> getInjectedProcessor(Injector injector,
            IAtomicStateProcessor<EObject> processor) {
        injector.injectMembers(processor);
        return processor;
    }
}
