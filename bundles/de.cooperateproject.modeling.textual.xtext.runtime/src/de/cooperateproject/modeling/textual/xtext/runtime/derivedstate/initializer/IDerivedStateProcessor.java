package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import net.winklerweb.cdoxtext.runtime.ICDOResourceStateHandler;

/**
 * Derived state processor for Xtext resources.
 * 
 * In constrast to {@link IDerivedStateComputer}, this processor distinguishes between an initialization, calculation,
 * and removal step. Initialization and removal has to take place after resource loading and before resource saving,
 * respectively. The calculation is executed during edit operations just like
 * {@link IDerivedStateComputer#installDerivedState(org.eclipse.xtext.resource.DerivedStateAwareResource, boolean)}.
 */
public interface IDerivedStateProcessor extends ICDOResourceStateHandler {

    @Override
    default void initState(EObject o) {
        initState(o, true);
    }

    /**
     * Initializes the state based on the given root object. The state can be calculated for a single element or for the
     * whole tree of elements.
     * 
     * @param o
     *            The root element that shall be initialized.
     * @param recursive
     *            True if the whole element tree shall be processed. False means that the state will be initializes for
     *            the given element only.
     */
    void initState(EObject o, boolean recursive);

    @Override
    default void cleanState(EObject o) {
        cleanState(o, true);
    }

    /**
     * Calculates the state based on the given root object. The state can be calculated for a single element or for the
     * whole tree of elements.
     * 
     * @param o
     *            The root element that shall contain the calculated state.
     * @param recursive
     *            True if the whole element tree shall be processed. False means that the state will be calculated for
     *            the given element only.
     */
    void cleanState(EObject o, boolean recursive);

    @Override
    default void calculateState(EObject o) {
        calculateState(o, true);
    }

    /**
     * Removes the state based on the given root object. The state can be removed for a single element or for the
     * whole tree of elements.
     * 
     * @param o
     *            The root element that shall not contain a calculated state after the execution of the method.
     * @param recursive
     *            True if the whole element tree shall be processed. False means that the state will be removed for
     *            the given element only.
     */
    void calculateState(EObject o, boolean recursive);

}
