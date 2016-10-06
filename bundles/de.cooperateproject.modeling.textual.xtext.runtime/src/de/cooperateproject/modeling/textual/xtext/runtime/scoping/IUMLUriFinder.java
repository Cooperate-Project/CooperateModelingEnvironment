package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.Optional;

import org.eclipse.emf.common.util.URI;

public interface IUMLUriFinder {

	Optional<URI> findUMLURI(URI ownUri); 
	
}
