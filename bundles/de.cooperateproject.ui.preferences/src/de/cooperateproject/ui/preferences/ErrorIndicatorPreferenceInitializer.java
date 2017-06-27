package de.cooperateproject.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

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

        store.setDefault(ErrorIndicatorPreferenceHandler.INSTANCE.getErrorIndicatorPreferenceStore(),
                ErrorIndicatorSettings.NONE.toString());
    }

}
