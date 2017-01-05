package de.cooperateproject.ui.preferences;

import java.util.Arrays;
import java.util.Optional;

public enum PreferenceHandler {
	INSTANCE;

	private static final String ERROR_BEEP_PREFERENCE_NAME = "error_beep_choice";

	public String getErrorIndicatorPreferenceStore() {
		return ERROR_BEEP_PREFERENCE_NAME;
	}

	public ErrorIndicatorSettings getErrorIndicatorSetting() {
		String preferenceValue = PreferenceActivator.getDefault().getPreferenceStore().getString(ERROR_BEEP_PREFERENCE_NAME);
		Optional<ErrorIndicatorSettings> foundValue = Arrays.stream(ErrorIndicatorSettings.values()).filter(s -> s.name().equals(preferenceValue)).findFirst();
		if (!foundValue.isPresent()) {
			return ErrorIndicatorSettings.NONE;
		}
		return foundValue.get();
	}
}
