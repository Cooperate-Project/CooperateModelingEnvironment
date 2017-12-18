package de.cooperateproject.ui.preferences.impl;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.cooperateproject.ui.preferences.CDOServerPreferenceHandler;

/**
 * Preference Initializer for the CDO Server Credentials Preference Page.
 * 
 * @author czogalik
 *
 */
public class CDOServerPreferenceInitializer extends AbstractPreferenceInitializer {

    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = PreferenceActivator.getDefault().getPreferenceStore();

        store.setDefault(CDOServerPreferenceHandler.INSTANCE.getCDOServerHostnamePreference(), "localhost");
        store.setDefault(CDOServerPreferenceHandler.INSTANCE.getCdoServerPortPreference(), 2036);
        store.setDefault(CDOServerPreferenceHandler.INSTANCE.getCdoServerRepositoryPreference(), "repo1");
        store.setDefault(CDOServerPreferenceHandler.INSTANCE.getCdoServerMessageBrokerPreference(), 61616);
    }

}
