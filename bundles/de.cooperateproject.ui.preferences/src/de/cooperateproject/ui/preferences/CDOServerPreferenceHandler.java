package de.cooperateproject.ui.preferences;

import de.cooperateproject.ui.preferences.impl.PreferenceActivator;

/**
 * Preference Handler for the CDO Server Credentials Preference Page.
 * 
 * @author czogalik
 *
 */
public enum CDOServerPreferenceHandler {
    INSTANCE;

    private static final String CDO_SERVER_HOSTNAME_PREFERENCE = "cdo_server_hostname_pref";
    private static final String CDO_SERVER_PORT_PREFERENCE = "cdo_server_port_pref";
    private static final String CDO_SERVER_REPOSITORY_PREFERENCE = "cdo_server_repository_pref";

    public String getCDOServerHostnamePreference() {
        return CDO_SERVER_HOSTNAME_PREFERENCE;
    }

    public String getCdoServerPortPreference() {
        return CDO_SERVER_PORT_PREFERENCE;
    }

    public String getCdoServerRepositoryPreference() {
        return CDO_SERVER_REPOSITORY_PREFERENCE;
    }

    public String getCDOServerHostnameSetting() {
        String preferenceValue = PreferenceActivator.getDefault().getPreferenceStore()
                .getString(CDO_SERVER_HOSTNAME_PREFERENCE);

        if (preferenceValue == null || "".equals(preferenceValue)) {
            return "localhost";
        }
        return preferenceValue;
    }

    public int getCDOServerPortSetting() {

        return PreferenceActivator.getDefault().getPreferenceStore().getInt(CDO_SERVER_PORT_PREFERENCE);
    }

    public String getCDOServerRepositorySetting() {
        String preferenceValue = PreferenceActivator.getDefault().getPreferenceStore()
                .getString(CDO_SERVER_REPOSITORY_PREFERENCE);

        if (preferenceValue == null || "".equals(preferenceValue)) {
            return "repo1";
        }
        return preferenceValue;
    }

}
