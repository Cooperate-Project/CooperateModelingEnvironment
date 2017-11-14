package de.cooperateproject.ui.diff;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import de.cooperateproject.ui.diff.labeling.LabelHandler;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

/**
 * Registry for {@link LabelHandler} elements that are contributed via extension
 * points.
 */
public enum LabelHandlerRegistry {
	INSTANCE;

	private static final String EXTENSION_POINT_ID = "de.cooperateproject.ui.diff.labelHandlers";
	private static final String METAMODEL_ATTRIBUTE_ID = "metamodel";
	private static final String CLASS_ATTRIBUTE_ID = "class";
	private final Map<String, Set<LabelHandler>> labelHandlers;

	private LabelHandlerRegistry() {
		labelHandlers = findLabelHandlers();
	}

	/**
	 * Get label handlers based on the meta model package name.
	 * 
	 * @param metaModelPackage
	 *            The meta model package name.
	 * @return A list of all matching label handlers, which might be empty.
	 */
	public Collection<LabelHandler> getLabelHandlers(String metaModelPackage) {
		return Collections.unmodifiableCollection(labelHandlers.getOrDefault(metaModelPackage, Collections.emptySet()));
	}

	private static Map<String, Set<LabelHandler>> findLabelHandlers() {
		Collection<Pair<LabelHandler, Map<String, String>>> extensions = ExtensionPointHelper
				.getExtensions(EXTENSION_POINT_ID, CLASS_ATTRIBUTE_ID, LabelHandler.class, METAMODEL_ATTRIBUTE_ID);
		return extensions.stream().collect(Collectors.groupingBy(entry -> entry.getValue().get(METAMODEL_ATTRIBUTE_ID),
				Collectors.mapping(Pair::getKey, Collectors.toSet())));
	}

	public static LabelHandlerRegistry getInstance() {
		return INSTANCE;
	}
}
