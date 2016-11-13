package de.cooperateproject.modeling.textual.cls.ui;

import java.util.Collection;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.formatting2.AbstractClsFormatter;
import de.cooperateproject.modeling.textual.cls.formatting2.FormatterRegistry;
import de.cooperateproject.modeling.textual.cls.formatting2.IFormatterSelector;
import de.cooperateproject.modeling.textual.cls.ui.internal.ClsActivator;

public class FormatterPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String FORMATTER_PREFERENCE_NAME = "FORMATTER_ID";
	
	@Inject
	private IFormatterSelector formatterSelector;
	
	private FormatterPropertyChangedListener propertyChangeListener;
	
	@Override
	public void createFieldEditors() {
		Collection<AbstractClsFormatter> formatters = FormatterRegistry.getInstance().getAllFormatter();
		int counter = 0;
		String[][] content = new String[formatters.size()][2];
		for (AbstractClsFormatter formatter : formatters) {
			content[counter][0] = formatter.getLabel();
			content[counter][1] = formatter.getId();
			counter++;
		}
		addField(new RadioGroupFieldEditor(FORMATTER_PREFERENCE_NAME, "Formatter to choose", 1, content, getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(ClsActivator.getInstance().getPreferenceStore());
		setDescription("Choose a Formatter");
		propertyChangeListener = new FormatterPropertyChangedListener(formatterSelector);
		getPreferenceStore().addPropertyChangeListener(propertyChangeListener);
	}

	@Override
	public void dispose() {
		getPreferenceStore().removePropertyChangeListener(propertyChangeListener);
		super.dispose();
	}

}
