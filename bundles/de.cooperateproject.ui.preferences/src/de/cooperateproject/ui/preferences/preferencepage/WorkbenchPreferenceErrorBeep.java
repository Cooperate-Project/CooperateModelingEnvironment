package de.cooperateproject.ui.preferences.preferencepage;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cooperateproject.ui.preferences.PreferenceActivator;

public class WorkbenchPreferenceErrorBeep extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String NO_SIGNALIZATION = "no_signalization";
	public static final String AREA_SIGNALIZATION = "area_signalization";
	public static final String LINE_SIGNALIZATION = "line_signalization";

	public static final String ERROR_BEEP_PREFERENCE_NAME = "error_beep_choice";

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(PreferenceActivator.getDefault().getPreferenceStore());
		setDescription("Error signalization");
	}

	@Override
	protected void createFieldEditors() {
		addField(new ComboFieldEditor(ERROR_BEEP_PREFERENCE_NAME,
				"Choose Error signalization", new String[][] { { "No Signalization", NO_SIGNALIZATION },
						{ "Line Signalization", LINE_SIGNALIZATION }, { "Area Signalization", AREA_SIGNALIZATION } },
				getFieldEditorParent()));
	}
}
