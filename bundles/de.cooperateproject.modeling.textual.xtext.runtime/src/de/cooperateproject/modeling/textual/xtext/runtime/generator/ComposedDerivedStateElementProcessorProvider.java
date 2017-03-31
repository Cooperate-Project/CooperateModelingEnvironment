package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.Switch;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ComposedDerivedStateElementProcessorProvider implements Provider<IComposedDerivedStateElementProcessor> {

    @Inject
    Set<IDerivedStateElementProcessor> derivedStateProcessors;

    private class ComposedProcessor extends ComposedSwitch<Void> implements IComposedDerivedStateElementProcessor {
        public ComposedProcessor(Collection<? extends Switch<Void>> switches) {
            super(switches);
        }

        @Override
        public boolean isCompatibleWith(EPackage ePackage) {
            return isSwitchFor(ePackage);
        }

        @Override
        public void processElement(EObject object) {
            doSwitch(object);
        }

    }

    @Override
    public IComposedDerivedStateElementProcessor get() {
        @SuppressWarnings("unchecked")
        Collection<Switch<Void>> switches = derivedStateProcessors.stream().map(proc -> {
            if (proc instanceof Switch) {
                return (Switch<Void>) proc;
            } else {
                return new Switch<Void>() {
                    @Override
                    protected boolean isSwitchFor(EPackage ePackage) {
                        return proc.isCompatibleWith(ePackage);
                    }

                    @Override
                    public Void doSwitch(EObject eObject) {
                        proc.processElement(eObject);
                        return null;
                    }
                };
            }
        }).collect(Collectors.toList());
        return new ComposedProcessor(switches);
    }

}
