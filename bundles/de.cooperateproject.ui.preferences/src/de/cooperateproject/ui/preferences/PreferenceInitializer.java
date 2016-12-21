package de.cooperateproject.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;


public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PreferenceActivator.getDefault().getPreferenceStore();
		
		store.setDefault(PreferenceHandler.INSTANCE.getErrorIndicatorPreferenceStore(),
				ErrorIndicatorSettings.NONE.toString());
	}

}
