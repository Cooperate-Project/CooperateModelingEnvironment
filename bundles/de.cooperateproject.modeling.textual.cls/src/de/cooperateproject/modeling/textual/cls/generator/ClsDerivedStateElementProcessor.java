package de.cooperateproject.modeling.textual.cls.generator;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.DerivedStateElementProcessorBase;

/**
 * Processor for elements with derived states that belong to cls diagrams. The class provides state calculation and
 * removal.
 */
public class ClsDerivedStateElementProcessor extends DerivedStateElementProcessorBase {

    /**
     * Constructs the state processor.
     * 
     * @param atomicStateProcessorRegistry
     *            The registry of atomic state processors to be used to reuse already existing element handlers. This
     *            dependency will be injected automatically.
     */
    @Inject
    public ClsDerivedStateElementProcessor(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
        super(new DerivedStateCalculator(atomicStateProcessorRegistry),
                new DerivedStateRemover(atomicStateProcessorRegistry));
    }

    private static class DerivedStateCalculator extends ClsSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateCalculator(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseGeneralization(Generalization object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Generalization.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseImplementation(Implementation object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Implementation.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseXtextAssociation(XtextAssociation object) {
            IAtomicStateProcessor memberEndCalculator = getAssociationMemberEndCalculator();
            IAtomicStateProcessor allMemberEndProcessor = o -> ((XtextAssociation) o).getMemberEnds().stream()
                    .allMatch(memberEndCalculator::apply);

            List<IAtomicStateProcessor> processors = Lists.newArrayList(getAtomicCalculators(
                    atomicStateProcessorRegistry, XtextAssociation.class, UMLReferencingElement.class));
            processors.add(allMemberEndProcessor);
            return processors;
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseAssociationMemberEnd(AssociationMemberEnd object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, UMLReferencingElement.class,
                    AssociationMemberEnd.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EObject obj) {
            return doSwitch(obj);
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

        private IAtomicStateProcessor getAssociationMemberEndCalculator() {
            Optional<IAtomicStateProcessor> memberEndCalculatorOpt = atomicStateProcessorRegistry
                    .getCalculator(AssociationMemberEnd.class);
            if (!memberEndCalculatorOpt.isPresent()) {
                throw new IllegalStateException(String.format("The calculator for %s could not be found.",
                        AssociationMemberEnd.class.getSimpleName()));
            }
            return memberEndCalculatorOpt.get();
        }

    }

    private static class DerivedStateRemover extends ClsSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateRemover(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseXtextAssociation(XtextAssociation object) {
            return getAtomicRemovers(atomicStateProcessorRegistry, XtextAssociation.class, UMLReferencingElement.class);
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EObject obj) {
            return doSwitch(obj);
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

    }

}
