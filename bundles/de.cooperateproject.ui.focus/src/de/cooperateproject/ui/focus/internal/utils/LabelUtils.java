package de.cooperateproject.ui.focus.internal.utils;

import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

public final class LabelUtils {

    private LabelUtils() {
        // intentionally left blank
    }

    public static String getEObjectLabel(EObject element) {
        ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
                ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
        EObject realEObject = CDOUtil.getEObject(element);
        return labelProvider.getText(realEObject);
    }

}
