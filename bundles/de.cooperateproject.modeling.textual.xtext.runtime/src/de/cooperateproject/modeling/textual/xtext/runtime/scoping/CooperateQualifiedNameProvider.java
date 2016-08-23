package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class CooperateQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	/**
	 * Converts a UML named element to a qualified name.
	 * 
	 * Internal: This method does intentionally not use a qualified name
	 * converter because the UML model elements might use another separator than
	 * '.'.
	 * 
	 * @param element
	 *            The named element to be converted.
	 * @return The qualified name.
	 */
	protected QualifiedName qualifiedName(NamedElement element) {
		return QualifiedName.create(element.getQualifiedName().split(element.separator()));
	}

	/**
	 * Converts a UML comment to a qualified name object. The result is NO
	 * qualified name because a comment does not have a name. Instead, we simply
	 * return the body.
	 * 
	 * Internal: This method does intentionally not use a qualified name
	 * converter because we do not want to treat the dot '.' as a separator for
	 * name segments.
	 * 
	 * @param element
	 *            The comment to be converted.
	 * @return The qualified name.
	 */
	protected QualifiedName qualifiedName(Comment element) {
		return QualifiedName.create(element.getBody());
	}

}
