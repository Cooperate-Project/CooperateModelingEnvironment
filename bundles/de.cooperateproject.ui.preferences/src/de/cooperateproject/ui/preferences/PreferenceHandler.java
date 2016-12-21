package de.cooperateproject.ui.preferences;

public enum PreferenceHandler {
	INSTANCE;

	private static final String ERROR_BEEP_PREFERENCE_NAME = "error_beep_choice";

	public String getErrorIndicatorPreferenceStore() {
		return ERROR_BEEP_PREFERENCE_NAME;
	}

	public ErrorIndicatorSettings getErrorIndicatorSetting() {
		return ErrorIndicatorSettings
				.valueOf(PreferenceActivator.getDefault().getPreferenceStore().getString(ERROR_BEEP_PREFERENCE_NAME));
	}
}
