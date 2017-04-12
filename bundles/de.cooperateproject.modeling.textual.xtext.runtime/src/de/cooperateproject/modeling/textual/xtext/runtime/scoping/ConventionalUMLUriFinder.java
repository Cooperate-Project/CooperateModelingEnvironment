package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.textual.common.conventions.ModelNamingConventions;

public class ConventionalUMLUriFinder implements IUMLUriFinder {

    private static final Logger LOGGER = Logger.getLogger(ConventionalUMLUriFinder.class);

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
