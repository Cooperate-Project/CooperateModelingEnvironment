package de.cooperateproject.modeling.textual.cls.generator;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.xtext.runtime.generator.AbstractDerivedStateGenerator;

public class ClsDerivedStateComputer extends AbstractDerivedStateGenerator {

    private static class ClsContentSorter implements Comparator<EObject> {

        @Override
        public int compare(EObject o1, EObject o2) {
            int prio1 = o1 instanceof Classifier ? 1 : 0;
            int prio2 = o2 instanceof Classifier ? 1 : 0;
            return prio2 - prio1;
        }

    }

    @Override
    protected Comparator<EObject> getContentComparator() {
        return new ClsContentSorter();
    }
}
