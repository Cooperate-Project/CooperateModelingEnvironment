package de.cooperateproject.modeling.textual.cls.ui;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import de.cooperateproject.modeling.textual.cls.formatting2.IFormatterSelector;

public class FormatterPropertyChangedListener implements IPropertyChangeListener {

	private final IFormatterSelector formatterSelector;
	
	public FormatterPropertyChangedListener(IFormatterSelector formatterSelector) {
		this.formatterSelector = formatterSelector;
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if (FormatterPreferencePage.FORMATTER_PREFERENCE_NAME.equals(event.getProperty())) {
			formatterSelector.setSelectedFormatter((String)event.getNewValue());
		}
	}

}
