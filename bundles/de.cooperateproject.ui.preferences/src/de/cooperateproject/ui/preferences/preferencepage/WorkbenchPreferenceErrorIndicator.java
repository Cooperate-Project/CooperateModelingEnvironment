package de.cooperateproject.ui.preferences.preferencepage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.BooleanFieldEditor;
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

import de.cooperateproject.ui.preferences.ErrorIndicatorPreferenceHandler;
import de.cooperateproject.ui.preferences.impl.PreferenceActivator;

/**
 * Preference page for error indicator.
 * 
 * @author czogalik
 *
 */
public class WorkbenchPreferenceErrorIndicator extends PreferencePage implements IWorkbenchPreferencePage {

    private List<FieldEditor> fields;
    private static final String PREFERENCE_PAGE_TITLE = "Preference Page for Cooperate";
    private static final String AUDIO_ERROR_INDICATOR_TITLE = "Audio Error Indicator";
    private static final String LINE_INDICATOR_LABEL = "Line Audio Indicator";
    private static final String AREA_INDICATOR_LABEL = "Area Audio Indicator";

    @Override
    public void init(IWorkbench workbench) {
        setDescription(PREFERENCE_PAGE_TITLE);
        fields = new ArrayList<>();
    }

    @Override
    protected Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.FILL);

        top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        top.setLayout(new GridLayout());

        fields.addAll(createErrorIndicatorBooleanFields(top));
        for (FieldEditor field : fields) {
            initPreferenceStore(field);
        }

        return top;
    }

    private static List<? extends FieldEditor> createErrorIndicatorBooleanFields(Composite parent) {
        Group group = new Group(parent, SWT.FILL);

        group.setText(AUDIO_ERROR_INDICATOR_TITLE);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        group.setLayout(new GridLayout());

        return getErrorIndicatorBooleanFields(group);
    }

    private static List<BooleanFieldEditor> getErrorIndicatorBooleanFields(Group group) {
        List<BooleanFieldEditor> booleanFields = new ArrayList<>();
        booleanFields.add(
                new BooleanFieldEditor(ErrorIndicatorPreferenceHandler.INSTANCE.getLineErrorIndicatorPreferenceStore(),
                        LINE_INDICATOR_LABEL, group));
        booleanFields.add(
                new BooleanFieldEditor(ErrorIndicatorPreferenceHandler.INSTANCE.getAreaErrorIndicatorPreferenceStore(),
                        AREA_INDICATOR_LABEL, group));
        return booleanFields;
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