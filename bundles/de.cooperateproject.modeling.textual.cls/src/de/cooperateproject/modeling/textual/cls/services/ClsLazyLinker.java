package de.cooperateproject.modeling.textual.cls.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class ClsLazyLinker extends LazyLinker {

    @Override
    protected void clearReference(EObject obj, EReference ref) {
        super.clearReference(obj, ref);
        if (!ref.isContainment() && !ref.isContainer() && !ref.isDerived() && ref.isChangeable() && ref.isTransient()) {
            obj.eUnset(ref);
        }
    }

}
