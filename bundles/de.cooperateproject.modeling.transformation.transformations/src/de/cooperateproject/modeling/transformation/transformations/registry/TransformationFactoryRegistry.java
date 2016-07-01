package de.cooperateproject.modeling.transformation.transformations.registry;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.collect.Sets;

public enum TransformationFactoryRegistry {

	INSTANCE;

	public static TransformationFactoryRegistry getInstance() {
		return INSTANCE;
	}

	private final Set<TransformationFactory> factories = Sets.newHashSet();

	public void registerTransformation(TransformationFactory factory) {
		factories.add(factory);
	}
	
	public Collection<TransformationFactory> findTransformationFactory(URI changedModelURI, ResourceSet resourceSet) {
		return factories.stream().filter(t -> t.canHandle(changedModelURI)).collect(Collectors.toSet());
	}

}
