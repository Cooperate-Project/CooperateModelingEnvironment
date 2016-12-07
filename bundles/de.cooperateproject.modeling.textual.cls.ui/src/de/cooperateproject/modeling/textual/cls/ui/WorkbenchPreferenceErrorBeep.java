package de.cooperateproject.modeling.textual.cls.ui;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;


public class WorkbenchPreferenceErrorBeep extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(ConfigurationScope.INSTANCE, ConfigurationScope.SCOPE));
        setDescription("Error signalization");
	}

	@Override
	protected void createFieldEditors() {
		addField(new ComboFieldEditor("CHOICE", "Choose Error signalization",
                new String[][] { { "No Signalization", "0" },
			{ "Line Signalization", "LINE" }, { "Area Signalization", "AREA" } }, getFieldEditorParent()));		
	}
}
