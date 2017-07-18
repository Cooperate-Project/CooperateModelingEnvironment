package de.cooperateproject.ui.diff.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateProcessor;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum DerivedStateCalculatorRegistry {
	
	INSTANCE;

	private static final String EXTENSION_ID = "de.cooperateproject.ui.diff.derivedcalculator";
	private static final String EXTENSION_ATTRIBUTE = "class";
	private Map<String, IDerivedStateProcessor> extensions;

	public static DerivedStateCalculatorRegistry getInstance() {
		return INSTANCE;
	}

	private DerivedStateCalculatorRegistry() {
		Collection<Pair<IDerivedStateProcessor,Map<String,String>>> extensionPairs = ExtensionPointHelper.getExtensions(EXTENSION_ID, EXTENSION_ATTRIBUTE, IDerivedStateProcessor.class, "ns_uri");
		extensions = extensionPairs.stream().collect(Collectors.toMap(x -> x.getValue().get("ns_uri"), Pair::getKey));
	}

	public Optional<IDerivedStateProcessor> getExtension(String nsUri) {
		return Optional.ofNullable(extensions.getOrDefault(nsUri, null));
	}

}
