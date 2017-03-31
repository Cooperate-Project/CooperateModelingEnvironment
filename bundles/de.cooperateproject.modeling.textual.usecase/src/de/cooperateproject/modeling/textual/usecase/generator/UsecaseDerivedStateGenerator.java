package de.cooperateproject.modeling.textual.usecase.generator;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.usecase.usecase.BehavioredClassifier;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.AbstractDerivedStateGenerator;

public class UsecaseDerivedStateGenerator extends AbstractDerivedStateGenerator {

    private static class UsecaseContentSorter implements Comparator<EObject> {

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

    @Override
    protected Comparator<EObject> getContentComparator() {
        return new UsecaseContentSorter();
    }

}
