package de.cooperateproject.ui.preferences;

import de.cooperateproject.ui.preferences.impl.PreferenceActivator;

/**
 * Preference Handler for the Error Indicator Preference Page.
 * 
 * @author czogalik
 *
 */
public enum ErrorIndicatorPreferenceHandler {
    INSTANCE;

    private static final String ERROR_BEEP_PREFERENCE_LINE = "line_beep_choice";
    private static final String ERROR_BEEP_PREFERENCE_AREA = "area_beep_choice";

    public String getLineErrorIndicatorPreferenceStore() {
        return ERROR_BEEP_PREFERENCE_LINE;
    }

    public String getAreaErrorIndicatorPreferenceStore() {
        return ERROR_BEEP_PREFERENCE_AREA;
    }

    public boolean getErrorLineIndicatorSetting() {
        return PreferenceActivator.getDefault().getPreferenceStore().getBoolean(ERROR_BEEP_PREFERENCE_LINE);
    }

    public boolean getErrorAreaIndicatorSetting() {
        return PreferenceActivator.getDefault().getPreferenceStore().getBoolean(ERROR_BEEP_PREFERENCE_AREA);
    }
}
