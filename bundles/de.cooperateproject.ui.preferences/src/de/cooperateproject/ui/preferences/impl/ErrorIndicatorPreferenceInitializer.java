package de.cooperateproject.ui.preferences.impl;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cooperateproject.ui.preferences.ErrorIndicatorPreferenceHandler;

/**
 * Preference Initializer for the Error Indicator Preference Page.
 * 
 * @author czogalik
 *
 */
public class ErrorIndicatorPreferenceInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = PreferenceActivator.getDefault().getPreferenceStore();

        store.setDefault(ErrorIndicatorPreferenceHandler.INSTANCE.getAreaErrorIndicatorPreferenceStore(), false);
        store.setDefault(ErrorIndicatorPreferenceHandler.INSTANCE.getLineErrorIndicatorPreferenceStore(), false);
    }

}
