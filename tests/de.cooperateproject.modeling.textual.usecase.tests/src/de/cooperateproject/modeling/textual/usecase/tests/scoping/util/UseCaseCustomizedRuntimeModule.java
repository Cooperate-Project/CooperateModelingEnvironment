package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorExtension;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class UseCaseCustomizedRuntimeModule extends UsecaseRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {

        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(UsecasePackage.eINSTANCE);
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

        private static final String[] CALCULATOR_PKG_NAMES = {
                "de.cooperateproject.modeling.textual.usecase.derivedstate.calculator",
                "de.cooperateproject.modeling.textual.common.derivedstate.calculator" };
        private static final String[] REMOVER_PKG_NAMES = {};
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
                throws InstantiationException, IllegalAccessException, IOException {
            return getProcessors(injector, CALCULATOR_PKG_NAMES);
        }

        private static Map<Class<?>, IAtomicStateProcessor> getRemovers(Injector injector)
                throws InstantiationException, IllegalAccessException, IOException {
            return getProcessors(injector, REMOVER_PKG_NAMES);
        }

        private static Map<Class<?>, IAtomicStateProcessor> getProcessors(Injector injector, String... packageNames)
                throws IOException, InstantiationException, IllegalAccessException {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            Set<ClassInfo> processors = Sets.newHashSet();
            for (String packageName : packageNames) {
                processors.addAll(ClassPath.from(cl).getTopLevelClasses(packageName));
            }
            Map<Class<?>, IAtomicStateProcessor> processorInstances = Maps.newHashMap();
            Set<Class<?>> processorClasses = processors.stream().map(ClassInfo::load)
                    .filter(IAtomicStateProcessorExtension.class::isAssignableFrom).collect(Collectors.toSet());
            for (Class<?> c : processorClasses) {
                IAtomicStateProcessorExtension<?> instance = (IAtomicStateProcessorExtension<?>) c.newInstance();
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
        return UsecaseInjectorProvider.class.getClassLoader();
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
