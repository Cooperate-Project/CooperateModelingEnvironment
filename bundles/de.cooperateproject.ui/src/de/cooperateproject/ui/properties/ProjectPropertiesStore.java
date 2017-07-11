package de.cooperateproject.ui.properties;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import de.cooperateproject.ui.nature.CooperateProjectNature;
import de.cooperateproject.ui.preferences.CDOServerPreferenceHandler;

public class ProjectPropertiesStore {

    private static final StoreAwareStringProperty CDO_HOST = new StoreAwareStringProperty("cdo.host", "localhost");
    private static final StoreAwareIntegerProperty CDO_PORT = new StoreAwareIntegerProperty("cdo.port", 2036);
    private static final StoreAwareStringProperty CDO_REPO = new StoreAwareStringProperty("cdo.repo", "repo1");
    private static final StoreAwareIntegerProperty MSG_PORT = new StoreAwareIntegerProperty("msg.port", 61616);

    private final IPersistentPreferenceStore preferencesStore;
    private ProjectPropertiesDTO preferences;

    public ProjectPropertiesStore(IProject project, ProjectPropertiesDTO preferencesObject) {
        preferences = preferencesObject;
        preferencesStore = createStore(project);
    }

    public ProjectPropertiesStore(IProject project) {
        this(project, new ProjectPropertiesDTO());
    }

    public void setPreferences(ProjectPropertiesDTO preferences) {
        this.preferences = preferences;
    }

    public ProjectPropertiesDTO getPreferences() {
        return this.preferences;
    }

    public void initFromDefaults() {
        initFromPreferenceStore(preferences);
    }

    public void initFromStore() {
        preferences.setCdoHost(CDOServerPreferenceHandler.INSTANCE.getCDOServerHostnameSetting());
        preferences.setCdoPort(CDOServerPreferenceHandler.INSTANCE.getCDOServerPortSetting());
        preferences.setCdoRepo(CDOServerPreferenceHandler.INSTANCE.getCDOServerRepositorySetting());
        preferences.setMsgPort(CDOServerPreferenceHandler.INSTANCE.getCDOServerMessageBrokerSetting());
    }

    public void saveToStore() throws IOException {
        CDO_HOST.setValue(preferencesStore, preferences.getCdoHost());
        CDO_PORT.setValue(preferencesStore, preferences.getCdoPort());
        CDO_REPO.setValue(preferencesStore, preferences.getCdoRepo());
        MSG_PORT.setValue(preferencesStore, preferences.getMsgPort());
        preferencesStore.save();
    }

    private static void initWithDefaults(ProjectPropertiesDTO dto) {
        dto.setCdoHost(CDO_HOST.getDefault());
        dto.setCdoPort(CDO_PORT.getDefault());
        dto.setCdoRepo(CDO_REPO.getDefault());
        dto.setMsgPort(MSG_PORT.getDefault());
    }

    private static IPersistentPreferenceStore createStore(IProject project) {
        IScopeContext projectScope = new ProjectScope(project);
        IPersistentPreferenceStore store = new ScopedPreferenceStore(projectScope, CooperateProjectNature.NATURE_ID);
        CDO_HOST.init(store);
        CDO_PORT.init(store);
        CDO_REPO.init(store);
        MSG_PORT.init(store);
        return store;
    }

    public static ProjectPropertiesDTO getDefaults() {
        ProjectPropertiesDTO dto = new ProjectPropertiesDTO();
        initWithDefaults(dto);
        return dto;
    }

    public static ProjectPropertiesDTO getValuesFromPreferenceStore() {
        ProjectPropertiesDTO dto = new ProjectPropertiesDTO();
        initFromPreferenceStore(dto);
        return dto;
    }

    private static void initFromPreferenceStore(ProjectPropertiesDTO dto) {
        dto.setCdoHost(CDOServerPreferenceHandler.INSTANCE.getCDOServerHostnameSetting());
        dto.setCdoPort(CDOServerPreferenceHandler.INSTANCE.getCDOServerPortSetting());
        dto.setCdoRepo(CDOServerPreferenceHandler.INSTANCE.getCDOServerRepositorySetting());
        dto.setMsgPort(CDOServerPreferenceHandler.INSTANCE.getCDOServerMessageBrokerSetting());

    }

}
