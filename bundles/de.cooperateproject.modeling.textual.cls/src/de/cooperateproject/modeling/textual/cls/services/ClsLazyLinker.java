package de.cooperateproject.modeling.textual.cls.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;

/**
 * Customized version of the lazy linker that correctly handles transient features according to the way used in
 * Cooperate.
 */
public class ClsLazyLinker extends LazyLinker {

    @Override
    protected void clearReference(EObject obj, EReference ref) {
        if (shallBeKept(ref)) {
            return;
        }
        super.clearReference(obj, ref);
        if (shallBeUnsetAdditionally(ref)) {
            obj.eUnset(ref);
        }
    }

    private static boolean shallBeKept(EReference ref) {
        return ref == ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE;
    }

    @SuppressWarnings("squid:S1067")
    private static boolean shallBeUnsetAdditionally(EReference ref) {
        return !ref.isContainment() && !ref.isContainer() && !ref.isDerived() && ref.isChangeable()
                && ref.isTransient();
    }

}
