package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;

/**
 * Marker interface for comparators that can be used to sort the elements before performing the calculation of derived
 * states.
 */
public interface IDerivedStateComputerSorter extends Comparator<EObject> {

}
