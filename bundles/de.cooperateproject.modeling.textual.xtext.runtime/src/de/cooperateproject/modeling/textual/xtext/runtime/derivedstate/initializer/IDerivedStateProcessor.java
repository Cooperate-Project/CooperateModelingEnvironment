package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.emf.ecore.EObject;

import net.winklerweb.cdoxtext.runtime.ICDOResourceStateHandler;

public interface IDerivedStateProcessor extends ICDOResourceStateHandler {

    @Override
    default void initState(EObject o) {
        initState(o, true);
    }

    void initState(EObject o, boolean recursive);

    @Override
    default void cleanState(EObject o) {
        cleanState(o, true);
    }

    void cleanState(EObject o, boolean recursive);

    @Override
    default void calculateState(EObject o) {
        calculateState(o, true);
    }

    void calculateState(EObject o, boolean recursive);

}
