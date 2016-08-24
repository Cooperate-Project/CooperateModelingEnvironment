package de.cooperateproject.modeling.textual.xtext.runtime;

import java.util.Collection;
import java.util.Collections;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.fileprovider.AnnotationFileProvider;
import de.cooperateproject.util.eclipse.ExtensionPointHelper;

public enum AnnotationFileProviderRegistry {

	INSTANCE;

	public static AnnotationFileProviderRegistry getInstance() {
		return INSTANCE;
	}

	private static final String EXTENSION_POINT_ID = "de.cooperateproject.modeling.textual.xtext.runtime.annotationfileprovider";
	private static final String EXTENSION_POINT_ATTRIBUTE_NAME = "provider";
	private final Collection<AnnotationFileProvider> providers;

	private AnnotationFileProviderRegistry() {
		providers = determineProviders();
	}

	private static Collection<AnnotationFileProvider> determineProviders() {
		return Collections.unmodifiableCollection(ExtensionPointHelper.getExtensions(EXTENSION_POINT_ID,
				EXTENSION_POINT_ATTRIBUTE_NAME, AnnotationFileProvider.class));
	}

	public Collection<AnnotationFileProvider> getProviders() {
		return providers;
	}
}
