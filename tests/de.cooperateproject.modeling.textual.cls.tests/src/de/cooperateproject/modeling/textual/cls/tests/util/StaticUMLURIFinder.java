package de.cooperateproject.modeling.textual.cls.tests.util;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class StaticUMLURIFinder implements IUMLUriFinder {
	
	private static final String UML_URI = "testmodels/ClsParserTest.uml";

	@Override
	public Optional<URI> findUMLURI(URI ownUri) {
		URI uri = URI.createFileURI(UML_URI);
		return Optional.of(uri);
	}

}
