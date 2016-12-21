package de.cooperateproject.ui.preferences.preferencepage;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cooperateproject.ui.preferences.ErrorIndicatorSettings;
import de.cooperateproject.ui.preferences.PreferenceActivator;
import de.cooperateproject.ui.preferences.PreferenceHandler;

public class WorkbenchPreferenceErrorIndicator extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(PreferenceActivator.getDefault().getPreferenceStore());
		setDescription("Audio Error Indicator");
	}

	@Override
	protected void createFieldEditors() {
		addField(new ComboFieldEditor(PreferenceHandler.INSTANCE.getErrorIndicatorPreferenceStore(),
				"Choose An Audio Error Indicator",
				new String[][] { { "No Audio Indicator", ErrorIndicatorSettings.NONE.toString() },
						{ "Line Audio Indicator", ErrorIndicatorSettings.LINE.toString() },
						{ "Area Audio Indicator", ErrorIndicatorSettings.AREA.toString() } },
				getFieldEditorParent()));
		
	}
}
