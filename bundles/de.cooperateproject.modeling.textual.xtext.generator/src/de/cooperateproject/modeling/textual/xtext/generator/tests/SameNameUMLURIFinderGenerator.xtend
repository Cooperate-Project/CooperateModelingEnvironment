package de.cooperateproject.modeling.textual.xtext.generator.tests

import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess

class SameNameUMLURIFinderGenerator {
	private val extension XtextGeneratorNaming naming
	private val Grammar grammar

	new(XtextGeneratorNaming naming, Grammar grammar) {
		this.naming = naming
		this.grammar = grammar
	}

	def create(JavaFileAccess jva, String simpleClassName) {
		jva.content = '''

			import java.util.Optional;
			import org.eclipse.emf.common.util.URI;
			import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

			public class SameNameUMLURIFinder implements IUMLUriFinder {

				@Override
				public Optional<URI> findUMLURI(URI ownUri) {
					return Optional.of(ownUri.trimFileExtension().appendFileExtension("uml"));
				}

			}
			'''

	}

}
