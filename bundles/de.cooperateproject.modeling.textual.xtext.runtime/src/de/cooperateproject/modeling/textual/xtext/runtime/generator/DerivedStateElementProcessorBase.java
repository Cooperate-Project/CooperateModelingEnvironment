package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class DerivedStateElementProcessorBase<T> implements IDerivedStateElementProcessor {

    protected interface IInternalDerivedStateElementProcessor<T> {

        T apply(EClass clz, EObject obj);

        boolean supports(EPackage pkg);
    }

    private final IInternalDerivedStateElementProcessor<T> calculator;
    private final IInternalDerivedStateElementProcessor<T> remover;

    public DerivedStateElementProcessorBase(IInternalDerivedStateElementProcessor<T> calculator,
            IInternalDerivedStateElementProcessor<T> remover) {
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

    private boolean execute(EClass clazz, EObject object, IInternalDerivedStateElementProcessor<T> processor) {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException("The object is not a valid instance of the provided class");
        }
        return (processor.apply(clazz, object) != null);
    }

}
