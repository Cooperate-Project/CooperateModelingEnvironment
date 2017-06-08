package de.cooperateproject.modeling.textual.common.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Element;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.IAtomicStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.DerivedStateElementProcessorBase;

/**
 * Derived state element processor for the textual commons meta model.
 * 
 * You should always use this processor in conjunction with another meta model specific processor. Use
 * {@link CommonDerivedStateModuleExtension} to configure the Guice module correctly.
 */
public class TextualCommonsDerivedStateElementProcessor extends DerivedStateElementProcessorBase {

    /**
     * Constructs the element processor.
     * 
     * @param atomicStateProcessorRegistry
     *            The registry of atomic state processors. This allows reusing existing atomic processors.
     */
    @Inject
    public TextualCommonsDerivedStateElementProcessor(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
        super(new DerivedStateCalculation(atomicStateProcessorRegistry),
                new DerivedStateRemover(atomicStateProcessorRegistry));
    }

    private static class DerivedStateCalculation extends TextualCommonsSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateCalculation(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public Iterable<IAtomicStateProcessor> caseComment(Comment object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, Comment.class);
        }

        @Override
        public <T extends Element> Iterable<IAtomicStateProcessor> caseUMLReferencingElement(
                UMLReferencingElement<T> object) {
            return getAtomicCalculators(atomicStateProcessorRegistry, UMLReferencingElement.class);
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EClass clz, EObject obj) {
            return doSwitch(clz, obj);
        }
    }

    private static class DerivedStateRemover extends TextualCommonsSwitch<Iterable<IAtomicStateProcessor>>
            implements IInternalDerivedStateElementProcessor {

        @SuppressWarnings("unused")
        private final IAtomicStateProcessorRegistry atomicStateProcessorRegistry;

        public DerivedStateRemover(IAtomicStateProcessorRegistry atomicStateProcessorRegistry) {
            this.atomicStateProcessorRegistry = atomicStateProcessorRegistry;
        }

        @Override
        public boolean supports(EPackage pkg) {
            return isSwitchFor(pkg);
        }

        @Override
        public Iterable<IAtomicStateProcessor> apply(EClass clz, EObject obj) {
            return doSwitch(clz, obj);
        }
    }

}
