package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import net.winklerweb.cdoxtext.runtime.IStateCalculationActivator;

/**
 * Content provider for resources that circumvents derived state calculation.
 */
public interface IStateCalculationOptionalizer extends IStateCalculationActivator {

    /**
     * Returns the same as {@link Resource#getContents()} but prohibits derived state calculation.
     * 
     * @return The contents of the resource.
     */
    Collection<EObject> getContentsWithoutStateCalculation();

    /**
     * Activates or deactivates the state calculation based on the given parameter.
     * 
     * @enable Flag to indicate if the state calculation shall be enabled.
     * @throws IllegalStateException
     *             The implementation might throw an exception if state calculation cannot be enabled.
     */
    void setStateCalculation(boolean enable);

    /**
     * Enables the state calculation.
     * 
     * @throws IllegalStateException
     *             The implementation might throw an exception if state calculation cannot be enabled.
     */
    default void enableStateCalculation() {
        setStateCalculation(true);
    }

    /**
     * Disabled the state calculation.
     */
    default void disableStateCalculation() {
        setStateCalculation(false);
    }

}