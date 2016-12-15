package de.cooperateproject.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cooperateproject.ui.preferences.preferencepage.WorkbenchPreferenceErrorBeep;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PreferenceActivator.getDefault().getPreferenceStore();
		
		store.setDefault(WorkbenchPreferenceErrorBeep.ERROR_BEEP_PREFERENCE_NAME,
				WorkbenchPreferenceErrorBeep.NO_SIGNALIZATION);
	}

}
