package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public class MappingChecker {

    private final Collection<EObject> mappedElements;

    public MappingChecker(Collection<EObject> mappedElements) {
        super();
        this.mappedElements = mappedElements;
    }

    public boolean isMapped(EObject object) {
        return mappedElements.contains(object);
    }

}
