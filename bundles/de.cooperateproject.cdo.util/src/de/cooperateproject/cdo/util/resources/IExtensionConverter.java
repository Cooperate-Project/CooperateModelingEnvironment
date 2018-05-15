package de.cooperateproject.cdo.util.resources;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;

public interface IExtensionConverter {

    Optional<String> getRelevantExtension(URI uri);

    URI getRealUri(URI uri);

    URI getVirtualUri(URI uri);

}
