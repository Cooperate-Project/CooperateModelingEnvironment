package de.cooperateproject.ui.preferences.preferencepage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cooperateproject.ui.preferences.CDOServerPreferenceHandler;
import de.cooperateproject.ui.preferences.PreferenceActivator;

/**
 * Preference Page for the CDO Server Credentials.
 * 
 * @author czogalik
 *
 */
public class CDOServerConnectionPreference extends PreferencePage implements IWorkbenchPreferencePage {

    private List<FieldEditor> fields;

    @Override
    public void init(IWorkbench workbench) {
        setDescription("Preference Page for the Cooperate CDO Server Credentials");
        fields = new ArrayList<>();
    }

    @Override
    public boolean performOk() {
        for (FieldEditor field : fields) {
            if (field.isValid()) {
                field.store();
                setErrorMessage(null);
            } else {
                setErrorMessage("Some fields do not have valid values!");
            }
        }
        return super.performOk();
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.FILL);

        top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        top.setLayout(new GridLayout());

        createCDOConfigurationComposite(top);

        initFieldEditors();
        return top;
    }

    @Override
    protected void performDefaults() {
        for (FieldEditor field : fields) {
            field.loadDefault();
        }
        super.performDefaults();
    }

    private void initFieldEditors() {
        for (FieldEditor field : fields) {
            initPreferenceStore(field);
        }
    }

    private void createCDOConfigurationComposite(Composite parent) {
        parent.setLayout(new GridLayout(1, false));

        Group group = new Group(parent, SWT.FILL);

        group.setText("CDO Server Credentials");
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        group.setLayout(new GridLayout());

        addFieldEditorsToGroup(group);

    }

    private void addFieldEditorsToGroup(Group group) {
        fields.add(new StringFieldEditor(CDOServerPreferenceHandler.INSTANCE.getCDOServerHostnamePreference(),
                "Hostname:", group));
        fields.add(new IntegerFieldEditor(CDOServerPreferenceHandler.INSTANCE.getCdoServerPortPreference(), "Port:",
                group));
        fields.add(new StringFieldEditor(CDOServerPreferenceHandler.INSTANCE.getCdoServerRepositoryPreference(),
                "Repository:", group));
        fields.add(new IntegerFieldEditor(CDOServerPreferenceHandler.INSTANCE.getCdoServerMessageBrokerPreference(),
                "Message Server Port:", group));
    }

    private static void initPreferenceStore(FieldEditor field) {
        field.setPreferenceStore(PreferenceActivator.getDefault().getPreferenceStore());
        field.load();
    }

}
