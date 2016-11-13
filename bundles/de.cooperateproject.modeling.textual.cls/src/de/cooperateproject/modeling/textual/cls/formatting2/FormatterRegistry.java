package de.cooperateproject.modeling.textual.cls.formatting2;

import java.util.Collection;
import java.util.Optional;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum FormatterRegistry {
	INSTANCE;

	private static final String FORMATTER_EXTENSION_ID = "de.cooperateproject.modeling.textual.cls.formatter";
	private static final String EXTENSION_ATTRIBUTE = "class";
	private static final String DEFAULT_FORMATTER_ID = ClsFormatter.ID;
	private final Collection<AbstractClsFormatter> formatters;

	public static FormatterRegistry getInstance() {
		return INSTANCE;
	}

	private FormatterRegistry() {
		formatters = ExtensionPointHelper.getExtensions(FORMATTER_EXTENSION_ID, EXTENSION_ATTRIBUTE, AbstractClsFormatter.class);
		formatters.forEach(FormatterRegistry::initFormatter);
	}
	
	private static void initFormatter(Object formatter) {
		Injector injector = Guice.createInjector(new ClsRuntimeModule());
		injector.injectMembers(formatter);
	}
	
	public Optional<AbstractClsFormatter> getFormatter(String formatterId) {
		return formatters.stream()
				.filter(x -> x.getId().equals(formatterId))
				.findFirst();
	}
	
	public Collection<AbstractClsFormatter> getAllFormatter() {
		return formatters;
	}

	public AbstractClsFormatter getDefaultFormatter() {
		return getFormatter(DEFAULT_FORMATTER_ID).orElseGet(null);
	}
}
