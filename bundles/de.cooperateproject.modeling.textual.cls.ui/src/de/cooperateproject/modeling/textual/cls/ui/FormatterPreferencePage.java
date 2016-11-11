package de.cooperateproject.modeling.textual.cls.ui;

import java.util.Collection;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cooperateproject.modeling.textual.cls.formatting2.AbstractClsFormatter;
import de.cooperateproject.modeling.textual.cls.formatting2.FormatterRegistry;
import de.cooperateproject.modeling.textual.cls.ui.internal.ClsActivator;

public class FormatterPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {


	@Override
	public void createFieldEditors() {
		Collection<AbstractClsFormatter> formatters = FormatterRegistry.getInstance().getAllFormatter();
		int counter = 0;
		String[][] content = new String[formatters.size()][2];
		for (AbstractClsFormatter formatter : formatters) {
			content[counter][0] = getFormatterName(formatter);
			content[counter][1] = formatter.getClass().getTypeName();
			counter++;
		}
		addField(new RadioGroupFieldEditor("CHOICE", "Formatter to choose", 1, content, getFieldEditorParent()));
	}
	
	private String getFormatterName(AbstractClsFormatter formatter) {
		String[] split = formatter.getClass().getTypeName().split("\\.");
		return split[split.length - 1];
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(ClsActivator.getInstance().getPreferenceStore());
		setDescription("Choose a Formatter");
	}

}
