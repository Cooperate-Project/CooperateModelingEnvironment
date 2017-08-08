package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;

/**
 * Constructs the UML model name based on the URI of the textual modeling resource.
 * 
 * @see ModelNamingConventions#getUMLFromTextualURI(URI)
 */
public class ConventionalUMLUriFinder implements IUMLUriFinder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConventionalUMLUriFinder.class);

    @Override
    public Optional<URI> findUMLURI(URI ownUri) {
        try {
            return Optional.of(ModelNamingConventions.getUMLFromTextualURI(ownUri)).map(u -> normalize(ownUri, u));
        } catch (IllegalArgumentException e) {
            LOGGER.warn("Could not determine the UML URI on a regular basis.", e);
            return Optional.empty();
        }
    }

    private static URI normalize(URI ownUri, URI toNormalize) {
        if (isEncoded(ownUri)) {
            return URI.createURI(URI.decode(toNormalize.toString()), false);
        } else {
            return URI.createURI(URI.decode(toNormalize.toString()));
        }
    }

    private static boolean isEncoded(URI uri) {
        String originalUri = uri.toString();
        String decodedUri = URI.decode(originalUri);
        return !originalUri.equals(decodedUri);
    }
}
