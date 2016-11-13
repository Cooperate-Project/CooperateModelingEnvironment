package de.cooperateproject.modeling.textual.cls.formatting2;

import java.util.Optional;

public class FormatterSelector implements IFormatterSelector {

	private AbstractClsFormatter selectedFormatter;
	
	/* (non-Javadoc)
	 * @see de.cooperateproject.modeling.textual.cls.formatting2.IFormatterSelector#getSelectedFormatter()
	 */
	@Override
	public AbstractClsFormatter getSelectedFormatter() {
		if (selectedFormatter == null) {
			return FormatterRegistry.getInstance().getDefaultFormatter();
		}
		return selectedFormatter;
	}
	
	/* (non-Javadoc)
	 * @see de.cooperateproject.modeling.textual.cls.formatting2.IFormatterSelector#setSelectedFormatter(de.cooperateproject.modeling.textual.cls.formatting2.AbstractClsFormatter)
	 */
	@Override
	public void setSelectedFormatter(AbstractClsFormatter formatter) {
		selectedFormatter = formatter;
	}
	
	/* (non-Javadoc)
	 * @see de.cooperateproject.modeling.textual.cls.formatting2.IFormatterSelector#setSelectedFormatter(java.lang.String)
	 */
	@Override
	public boolean setSelectedFormatter(String formatterId) {
		Optional<AbstractClsFormatter> formatter = FormatterRegistry.getInstance().getFormatter(formatterId);
		if (formatter.isPresent()) {
			setSelectedFormatter(formatter.get());
			return true;
		}
		return false;
	}
	
}
