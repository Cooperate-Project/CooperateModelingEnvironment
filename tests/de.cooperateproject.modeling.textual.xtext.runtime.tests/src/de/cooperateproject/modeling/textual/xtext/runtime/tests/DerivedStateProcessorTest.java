package de.cooperateproject.modeling.textual.xtext.runtime.tests;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.createStrictControl;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.easymock.IMocksControl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class DerivedStateProcessorTest {

    private static class DerivedStateProcessorModule extends AbstractModule {

        private IAtomicDerivedStateProcessorRegistry registryInstance;

        public DerivedStateProcessorModule(Map<Class, IAtomicDerivedStateProcessor> initializerMocks,
                Map<Class, IAtomicDerivedStateProcessor> calculatorMocks,
                Map<Class, IAtomicDerivedStateProcessor> removerMocks) {
            registryInstance = new AtomicDerivedStateProcessorRegistry(initializerMocks, calculatorMocks, removerMocks);
        }

        @Override
        protected void configure() {
            bind(IDerivedStateComputerSorter.class).toInstance((o1, o2) -> 0);
            bind(IAtomicDerivedStateProcessorRegistry.class).toInstance(registryInstance);
        }

    }

    private static class AtomicDerivedStateProcessorRegistry implements IAtomicDerivedStateProcessorRegistry {

        private Map<Class, IAtomicDerivedStateProcessor> initializerMocks;
        private Map<Class, IAtomicDerivedStateProcessor> calculatorMocks;
        private Map<Class, IAtomicDerivedStateProcessor> removerMocks;

        public AtomicDerivedStateProcessorRegistry(Map<Class, IAtomicDerivedStateProcessor> initializerMocks,
                Map<Class, IAtomicDerivedStateProcessor> calculatorMocks,
                Map<Class, IAtomicDerivedStateProcessor> removerMocks) {
            this.initializerMocks = initializerMocks;
            this.calculatorMocks = calculatorMocks;
            this.removerMocks = removerMocks;
        }

        @Override
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type) {
            return Optional.ofNullable(initializerMocks.getOrDefault(type, null));
        }

        @Override
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type) {
            return Optional.ofNullable(removerMocks.getOrDefault(type, null));
        }

        @Override
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type) {
            return Optional.ofNullable(calculatorMocks.getOrDefault(type, null));
        }

    }

    private Map<Class, IAtomicDerivedStateProcessor> initializerMocks;
    private Map<Class, IAtomicDerivedStateProcessor> calculatorMocks;
    private Map<Class, IAtomicDerivedStateProcessor> removerMocks;
    private DerivedStateProcessor subject;

    @Before
    public void setUp() throws Exception {
        initializerMocks = new HashMap<>();
        calculatorMocks = new HashMap<>();
        removerMocks = new HashMap<>();
        Injector injector = Guice
                .createInjector(new DerivedStateProcessorModule(initializerMocks, calculatorMocks, removerMocks));
        subject = injector.getInstance(DerivedStateProcessor.class);
    }

    @Test
    public void testSimpleGetInitializer() {
        Model model = UMLFactory.eINSTANCE.createModel();

        IAtomicDerivedStateProcessor simpleProcessor = createMock(IAtomicDerivedStateProcessor.class);
        expect(simpleProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(simpleProcessor.getRequirements()).andReturn(Collections.emptyList());
        simpleProcessor.accept(model);
        replay(simpleProcessor);
        initializerMocks.put(Model.class, simpleProcessor);

        subject.initState(model);
        subject.calculateState(model);
        subject.cleanState(model);

        verify(simpleProcessor);
    }

    @Test
    public void testRequirementOrderingInitializer() {
        Model model = UMLFactory.eINSTANCE.createModel();

        IMocksControl ctrl = createStrictControl();

        IAtomicDerivedStateProcessor modelProcessor = ctrl.createMock("model", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor packageProcessor = ctrl.createMock("package", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor elementProcessor = ctrl.createMock("element", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor namedElementProcessor = ctrl.createMock("namedelement",
                IAtomicDerivedStateProcessor.class);

        ctrl.checkOrder(false);

        expect(modelProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(packageProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(namedElementProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(elementProcessor.getReplacements()).andReturn(Collections.emptyList());

        expect(modelProcessor.getRequirements())
                .andReturn(Arrays.asList(Element.class, org.eclipse.uml2.uml.Package.class));
        expect(packageProcessor.getRequirements()).andReturn(Arrays.asList(NamedElement.class));
        expect(namedElementProcessor.getRequirements()).andReturn(Arrays.asList(Element.class));
        expect(elementProcessor.getRequirements()).andReturn(Collections.emptyList());

        ctrl.checkOrder(true);

        elementProcessor.accept(model);
        namedElementProcessor.accept(model);
        packageProcessor.accept(model);
        modelProcessor.accept(model);

        ctrl.replay();

        initializerMocks.put(Model.class, modelProcessor);
        initializerMocks.put(org.eclipse.uml2.uml.Package.class, packageProcessor);
        initializerMocks.put(NamedElement.class, namedElementProcessor);
        initializerMocks.put(Element.class, elementProcessor);

        subject.initState(model);
        subject.calculateState(model);
        subject.cleanState(model);

        ctrl.verify();
    }

    @Test
    public void testReplacementInitializer() {
        Model model = UMLFactory.eINSTANCE.createModel();

        IMocksControl ctrl = createStrictControl();

        IAtomicDerivedStateProcessor modelProcessor = ctrl.createMock("model", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor packageProcessor = ctrl.createMock("package", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor elementProcessor = ctrl.createMock("element", IAtomicDerivedStateProcessor.class);
        IAtomicDerivedStateProcessor namedElementProcessor = ctrl.createMock("namedelement",
                IAtomicDerivedStateProcessor.class);

        ctrl.checkOrder(false);

        expect(modelProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(packageProcessor.getReplacements()).andReturn(Arrays.asList(Element.class));
        expect(namedElementProcessor.getReplacements()).andReturn(Collections.emptyList());
        expect(elementProcessor.getReplacements()).andReturn(Collections.emptyList());

        expect(modelProcessor.getRequirements()).andReturn(Arrays.asList(org.eclipse.uml2.uml.Package.class));
        expect(packageProcessor.getRequirements()).andReturn(Collections.emptyList());
        expect(namedElementProcessor.getRequirements()).andReturn(Arrays.asList(Element.class));
        expect(elementProcessor.getRequirements()).andReturn(Collections.emptyList());

        ctrl.checkOrder(true);

        packageProcessor.accept(model);
        ctrl.checkOrder(false);
        namedElementProcessor.accept(model);
        modelProcessor.accept(model);

        ctrl.replay();

        initializerMocks.put(Model.class, modelProcessor);
        initializerMocks.put(org.eclipse.uml2.uml.Package.class, packageProcessor);
        initializerMocks.put(NamedElement.class, namedElementProcessor);
        initializerMocks.put(Element.class, elementProcessor);

        subject.initState(model);
        subject.calculateState(model);
        subject.cleanState(model);

        ctrl.verify();
    }

}
