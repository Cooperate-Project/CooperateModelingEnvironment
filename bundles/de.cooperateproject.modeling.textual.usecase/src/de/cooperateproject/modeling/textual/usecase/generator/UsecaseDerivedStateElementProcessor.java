package de.cooperateproject.modeling.textual.usecase.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.util.UsecaseSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.DerivedStateElementProcessorBase;

public class UsecaseDerivedStateElementProcessor extends DerivedStateElementProcessorBase {

    @Inject
    public UsecaseDerivedStateElementProcessor(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
        super(new DerivedStateCalculator(atomicStateProcessorRegistry),
                new DerivedStateRemover(atomicStateProcessorRegistry));
    }

    private static class DerivedStateCalculator extends UsecaseSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateCalculator(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseExtend(Extend object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Extend.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseGeneralization(Generalization object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Generalization.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseInclude(Include object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Include.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseAssociation(Association object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Association.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EClass clz, EObject obj) {
            return doSwitch(clz, obj);
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

    }

    private static class DerivedStateRemover extends UsecaseSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        @SuppressWarnings("unused")
        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateRemover(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EClass clz, EObject obj) {
            return doSwitch(clz, obj);
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

    }
}
