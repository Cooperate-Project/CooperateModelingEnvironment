package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;

/**
 * Base class for derived state processors that allows removal and calculation of state based on elements.
 * 
 * Implementing subclasses are required to provide an state calculator and remover.
 */
public abstract class DerivedStateElementProcessorBase implements IDerivedStateElementProcessor {

    protected interface IInternalDerivedStateElementProcessor {

        /**
         * Applies the processor to the given element.
         * 
         * @param clz
         *            The {@link EClass} of the element to be processed. The class must match the given element and vice
         *            versa.
         * @param obj
         *            The element to be processed.
         * @return A set of atomic processors that have to be executed for correctly processing the element.
         */
        Iterable<IAtomicStateProcessor> apply(EClass clz, EObject obj);

        /**
         * Indicates if the processor supports elements of a given package.
         * 
         * @param pkg
         *            The {@link EPackage} of the elements to be processed.
         * @return True if the element is supported.
         */
        boolean supports(EPackage pkg);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(DerivedStateElementProcessorBase.class);
    private final IInternalDerivedStateElementProcessor calculator;
    private final IInternalDerivedStateElementProcessor remover;

    /**
     * Constructs the element processor.
     * 
     * @param calculator
     *            The state processor that calculates states.
     * @param remover
     *            The state processor that removes states.
     */
    public DerivedStateElementProcessorBase(IInternalDerivedStateElementProcessor calculator,
            IInternalDerivedStateElementProcessor remover) {
        this.calculator = calculator;
        this.remover = remover;
    }

    @Override
    public boolean isDirectlyCompatibleWith(EClass eClass) {
        return calculator.supports(eClass.getEPackage()) && remover.supports(eClass.getEPackage());
    }

    @Override
    public boolean processElementUsingType(EClass clazz, EObject object) {
        return execute(clazz, object, calculator);
    }

    @Override
    public boolean simulateReloadUsingType(EClass clazz, EObject object) {
        return execute(clazz, object, remover);
    }

    private static boolean execute(EClass clazz, EObject object, IInternalDerivedStateElementProcessor processor) {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException("The object is not a valid instance of the provided class");
        }
        Iterable<IAtomicStateProcessor> functionsToApply = processor.apply(clazz, object);
        if (functionsToApply != null && functionsToApply.iterator().hasNext()) {
            StreamSupport.stream(functionsToApply.spliterator(), false).map(IAtomicStateProcessor.class::cast)
                    .forEach(p -> p.apply(object));
            return true;
        }
        return false;
    }

    protected static Iterable<IAtomicStateProcessor> getAtomicCalculators(
            IAtomicStateProcessorRegistry atomicStateProcessorRegistry, Class<?>... classes) {
        return getAtomicProcessors(atomicStateProcessorRegistry::getCalculator, classes);
    }

    protected static Iterable<IAtomicStateProcessor> getAtomicRemovers(
            IAtomicStateProcessorRegistry atomicStateProcessorRegistry, Class<?>... classes) {
        return getAtomicProcessors(atomicStateProcessorRegistry::getRemover, classes);
    }

    private static Iterable<IAtomicStateProcessor> getAtomicProcessors(
            Function<Class<?>, Optional<IAtomicStateProcessor>> fn, Class<?>... classes) {
        List<IAtomicStateProcessor> foundProcessors = Arrays.stream(classes).map(fn::apply).filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toList());
        if (foundProcessors.size() != classes.length) {
            IllegalStateException e = new IllegalStateException(
                    String.format("The requested classes %s where not completely available in the registry.",
                            Arrays.stream(classes).map(Class::getSimpleName).collect(Collectors.joining(", "))));
            LOGGER.error(e.getMessage(), e);
            throw e;
        }
        return foundProcessors;
    }

}
