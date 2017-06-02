package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;

/**
 * Element sorter for the class diagram language to be used in conjunction with derived state calculation.
 * 
 * The implementation prioritizes classifiers.
 */
public class ClsDerivedStateElementComparator implements IDerivedStateComputerSorter {

    @Override
    public int compare(EObject o1, EObject o2) {
        int prio1 = o1 instanceof Classifier ? 1 : 0;
        int prio2 = o2 instanceof Classifier ? 1 : 0;
        return prio2 - prio1;
    }

}
