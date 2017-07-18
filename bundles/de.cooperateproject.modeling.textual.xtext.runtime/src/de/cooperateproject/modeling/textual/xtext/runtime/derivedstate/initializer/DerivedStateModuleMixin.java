package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.xtext.resource.IDerivedStateComputer;

import net.winklerweb.cdoxtext.runtime.ICDOResourceStateHandler;

public interface DerivedStateModuleMixin {

    default Class<? extends IAtomicDerivedStateProcessorRegistry> bindIAtomicDerivedStateProcessorRegistry() {
        return AtomicDerivedStateProcessorRegistry.class;
    }

    default Class<? extends IDerivedStateProcessor> bindIDerivedStateProcessor() {
        return DerivedStateProcessor.class;
    }

    default Class<? extends ICDOResourceStateHandler> bindICDOResourceStateHandler() {
        return DerivedStateProcessor.class;
    }

    default Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
        return DefaultDerivedStateComputer.class;
    }

}
