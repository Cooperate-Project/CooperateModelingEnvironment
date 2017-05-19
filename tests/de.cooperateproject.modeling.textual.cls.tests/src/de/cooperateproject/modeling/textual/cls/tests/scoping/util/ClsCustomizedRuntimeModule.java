package de.cooperateproject.modeling.textual.cls.tests.scoping.util;

import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.derivedstate.calculator.AssociationMemberEndCalculator;
import de.cooperateproject.modeling.textual.cls.derivedstate.remover.XtextAssociationRemover;
import de.cooperateproject.modeling.textual.cls.tests.ClsInjectorProvider;
import de.cooperateproject.modeling.textual.common.derivedstate.calculator.UMLReferencingElementCalculator;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorExtension;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

/**
 * Runtime module for cls diagrams that injects test mocks.
 * 
 * This module enables running the tests as JUnit tests rather than plugin tests.
 */
public class ClsCustomizedRuntimeModule extends ClsRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {
        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(ClsPackage.eINSTANCE, TextualCommonsPackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages,
                String issueId) {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages) {
            return Collections.emptyList();
        }

    }

    private static class DummyAtomicProcessorRegistry implements IAtomicStateProcessorRegistry {

        private static final Class<?> BASE_CLS = IAtomicStateProcessorExtension.class;
        private static final Class<?>[] CALCULATOR_CLS = { AssociationMemberEndCalculator.class,
                UMLReferencingElementCalculator.class };
        private static final Class<?>[] REMOVER_CLS = { XtextAssociationRemover.class };
        private final Map<Class<?>, IAtomicStateProcessor> calculators;
        private final Map<Class<?>, IAtomicStateProcessor> removers;

        @Inject
        public DummyAtomicProcessorRegistry(Injector injector) {
            try {
                calculators = getCalculators(injector);
                removers = getRemovers(injector);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        private static Map<Class<?>, IAtomicStateProcessor> getCalculators(Injector injector)
                throws InstantiationException, IllegalAccessException {
            return getProcessors(injector, CALCULATOR_CLS);
        }

        private static Map<Class<?>, IAtomicStateProcessor> getRemovers(Injector injector)
                throws InstantiationException, IllegalAccessException {
            return getProcessors(injector, REMOVER_CLS);
        }

        @SuppressWarnings("rawtypes")
        private static Map<Class<?>, IAtomicStateProcessor> getProcessors(Injector injector,
                Class<?>... relevantClasses) throws InstantiationException, IllegalAccessException {
            Collection<Class<?>> packageProvidingClasses = Sets.newHashSet(relevantClasses);
            packageProvidingClasses.add(BASE_CLS);
            Collection<URL> urls = packageProvidingClasses.stream()
                    .map(cls -> ClasspathHelper.forPackage(cls.getPackage().getName(), cls.getClassLoader()))
                    .flatMap(Collection::stream).collect(Collectors.toSet());
            String[] packageNames = packageProvidingClasses.stream().map(Class::getPackage).map(Package::getName)
                    .collect(Collectors.toSet()).toArray(new String[0]);
            Reflections reflections = new Reflections(
                    new ConfigurationBuilder().setUrls(urls).setScanners(new SubTypesScanner(false))
                            .filterInputsBy(new FilterBuilder().includePackage(packageNames)));
            Set<Class<? extends IAtomicStateProcessorExtension>> subTypes = reflections
                    .getSubTypesOf(IAtomicStateProcessorExtension.class).stream().filter(c -> !c.isInterface()
                            && !Modifier.isAbstract(c.getModifiers()) && Modifier.isPublic(c.getModifiers()))
                    .collect(Collectors.toSet());

            Map<Class<?>, IAtomicStateProcessor> processorInstances = Maps.newHashMap();
            for (Class<? extends IAtomicStateProcessorExtension> type : subTypes) {
                IAtomicStateProcessorExtension<?> instance = type.newInstance();
                injector.injectMembers(instance);
                processorInstances.put(instance.getSupportedType(), instance);
            }

            return processorInstances;
        }

        @Override
        public Optional<IAtomicStateProcessor> getCalculator(Class<?> clz) {
            return Optional.ofNullable(calculators.getOrDefault(clz, null));
        }

        @Override
        public Optional<IAtomicStateProcessor> getRemover(Class<?> clz) {
            return Optional.ofNullable(removers.getOrDefault(clz, null));
        }

    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return ClsInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

    @Override
    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
        return DummyFactoryRegistry.class;
    }

    @Override
    public Class<? extends IAtomicStateProcessorRegistry> bindIAtomicStateProcessorRegistry() {
        return DummyAtomicProcessorRegistry.class;
    }

}
