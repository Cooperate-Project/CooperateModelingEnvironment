package de.cooperateproject.modeling.textual.sequence.generator;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.xtext.runtime.generator.AbstractDerivedStateGenerator;

public class SequenceDerivedStateComputer extends AbstractDerivedStateGenerator {

    @Override
    protected Comparator<EObject> getContentComparator() {
        return new Comparator<EObject>() {

            @Override
            public int compare(EObject o1, EObject o2) {
                // TODO Auto-generated method stub
                return 0;
            }
        };
    }

}
