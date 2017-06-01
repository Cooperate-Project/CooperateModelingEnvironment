package de.cooperateproject.ui.preferences.preferencepage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cooperateproject.ui.preferences.ErrorIndicatorSettings;
import de.cooperateproject.ui.preferences.PreferenceActivator;
import de.cooperateproject.ui.preferences.PreferenceHandler;

/**
 * Preference page for error indicator.
 * 
 * @author czogalik
 *
 */
public class WorkbenchPreferenceErrorIndicator extends PreferencePage implements IWorkbenchPreferencePage {

    private List<FieldEditor> fields;

    @Override
    public void init(IWorkbench workbench) {
        setDescription("Preference Page for the Cooperate Plug In");
        fields = new ArrayList<>();
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.FILL);

        top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        top.setLayout(new GridLayout());

        fields.add(createErrorIndicatorComboField(top));

        for (FieldEditor field : fields) {
            initPreferenceStore(field);
        }

        return top;
    }

    private static FieldEditor createErrorIndicatorComboField(Composite parent) {
        Group group = new Group(parent, SWT.FILL);

        group.setText("Audio Error Indicator");
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        group.setLayout(new GridLayout());

        return getErrorIndicatorComboField(group);
    }

    private static ComboFieldEditor getErrorIndicatorComboField(Group group) {
        return new ComboFieldEditor(PreferenceHandler.INSTANCE.getErrorIndicatorPreferenceStore(),
                "Choose An Audio Error Indicator",
                new String[][] { { "No Audio Indicator", ErrorIndicatorSettings.NONE.toString() },
                        { "Line Audio Indicator", ErrorIndicatorSettings.LINE.toString() },
                        { "Area Audio Indicator", ErrorIndicatorSettings.AREA.toString() } },
                group);
    }

    private static void initPreferenceStore(FieldEditor field) {
        field.setPreferenceStore(PreferenceActivator.getDefault().getPreferenceStore());
        field.load();
    }

    @Override
    protected void performDefaults() {
        for (FieldEditor field : fields) {
            field.loadDefault();
        }
        super.performDefaults();
    }

    @Override
    public boolean performOk() {
        for (FieldEditor field : fields) {
            field.store();
        }
        return super.performOk();
    }
}