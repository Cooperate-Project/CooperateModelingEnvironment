package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.common.conventions.ModelNamingConventions;

public class ConventionalUMLUriFinder implements IUMLUriFinder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConventionalUMLUriFinder.class);

    @Override
    public Optional<URI> findUMLURI(URI ownUri) {
        try {
            return Optional.of(ModelNamingConventions.getUMLFromTextualURI(ownUri));
        } catch (IllegalArgumentException e) {
            LOGGER.warn("Could not determine the UML URI on a regular basis.", e);
            return Optional.empty();
        }
    }

}
