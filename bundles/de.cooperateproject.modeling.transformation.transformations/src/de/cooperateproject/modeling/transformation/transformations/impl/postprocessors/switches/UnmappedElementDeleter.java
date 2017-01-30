package de.cooperateproject.modeling.transformation.transformations.impl.postprocessors.switches;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class UnmappedElementDeleter {

    private final Collection<Runnable> requestedChanges = new ArrayList<>();
    private MappingChecker mappingChecker;

    public UnmappedElementDeleter(Collection<EObject> mappedElements) {
        this.mappingChecker = new MappingChecker(mappedElements);
    }

    public Iterable<Runnable> getRequestedChanges() {
        return Collections.unmodifiableCollection(requestedChanges);
    }

    public boolean testRegisterChangeIfNecessary(EObject object) {
        return !mappingChecker.isMapped(object);
    }

    public boolean registerChangeIfNecessary(EObject object) {
        if (testRegisterChangeIfNecessary(object)) {
            requestedChanges.add(() -> EcoreUtil.delete(object));
            return true;
        }
        return false;
    }

}
