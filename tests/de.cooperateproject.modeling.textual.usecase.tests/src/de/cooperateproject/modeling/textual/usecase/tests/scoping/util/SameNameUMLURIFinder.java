package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class SameNameUMLURIFinder implements IUMLUriFinder {

	@Override
	public Optional<URI> findUMLURI(URI ownUri) {
		return Optional.of(ownUri.trimFileExtension().appendFileExtension("uml"));
	}

}
