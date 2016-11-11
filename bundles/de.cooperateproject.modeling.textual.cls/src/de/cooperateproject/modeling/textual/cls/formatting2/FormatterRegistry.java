package de.cooperateproject.modeling.textual.cls.formatting2;

import java.util.Collection;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum FormatterRegistry {
	INSTANCE;

	private static final String FORMATTER_EXTENSION_ID = "de.cooperateproject.modeling.textual.cls.formatter";
	private static final String EXTENSION_ATTRIBUTE = "class";
	private final Collection<AbstractClsFormatter> formatters;

	public static FormatterRegistry getInstance() {
		return INSTANCE;
	}

	private FormatterRegistry() {
		formatters = ExtensionPointHelper.getExtensions(FORMATTER_EXTENSION_ID, EXTENSION_ATTRIBUTE, AbstractClsFormatter.class);
	}
	
	public AbstractClsFormatter getFormatter(String formatter) {
		return formatters.stream()
				.filter(x -> x.getClass().getName().equals(formatter))
				.findFirst()
				.get();
	}
	
	public Collection<AbstractClsFormatter> getAllFormatter() {
		return formatters;
	}
}
