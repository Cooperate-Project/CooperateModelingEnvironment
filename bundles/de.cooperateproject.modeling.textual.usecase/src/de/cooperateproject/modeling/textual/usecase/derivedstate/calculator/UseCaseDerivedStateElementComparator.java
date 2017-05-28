package de.cooperateproject.modeling.textual.usecase.derivedstate.calculator;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;

public class UseCaseDerivedStateElementComparator implements IDerivedStateComputerSorter {

    @Override
    public int compare(EObject o1, EObject o2) {
        boolean o1Prioritized = o1 instanceof BehavioredClassifier;
        boolean o2Prioritized = o2 instanceof BehavioredClassifier;

        if (o1Prioritized == o2Prioritized) {
            return 0;
        }

        return o1Prioritized ? -1 : 1;
    }

}
