package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.InternalSettingDelegateSingleEObjectResolving;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

public class DuplicatedSetFilteringSettingDelegateFactory
        implements EStructuralFeature.Internal.SettingDelegate.Factory {

    private static class DuplicateFilteringInternalSettingDelegateSingleEObjectResolving
            extends InternalSettingDelegateSingleEObjectResolving {

        public DuplicateFilteringInternalSettingDelegateSingleEObjectResolving(EClass eClass,
                EStructuralFeature feature) {
            super(eClass, feature);
        }

        @Override
        public boolean dynamicIsSet(InternalEObject owner, DynamicValueHolder settings, int index) {
            if (settings == null) {
                return owner.eGet(feature, false) != null;
            }
            return super.dynamicIsSet(owner, settings, index);
        }

        @Override
        public void dynamicSet(InternalEObject owner, DynamicValueHolder settings, int index, Object newValue) {
            Object oldValue = settings.dynamicGet(index);
            if (newValue == oldValue) {
                return;
            }
            super.dynamicSet(owner, settings, index, newValue);
        }

    }

    public static final String URI = "http://cooperate-project.de/ecore/settingdelegate/duplicatefiltering";

    @Override
    public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
        if (eStructuralFeature == TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT) {
            return new DuplicateFilteringInternalSettingDelegateSingleEObjectResolving(
                    (EClass) eStructuralFeature.getEType(), eStructuralFeature);
        }
        return null;
    }

}
