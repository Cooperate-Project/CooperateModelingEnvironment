package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class CooperateQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider implements IAlternativeNameProvider {

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

	@Override
	public Optional<QualifiedName> getAlternativeFullyQualifiedName(EObject obj) {
		if (obj instanceof NamedElement) {
			NamedElement ne = (NamedElement)obj;
			if (ne.getNameExpression() != null) {
				String alternativeName = ne.getNameExpression().getName();
				if (alternativeName != null) {
					LinkedList<String> segments = Lists.newLinkedList(qualifiedName(ne).getSegments());
					if (!segments.isEmpty()) {
						segments.removeLast();
						segments.addLast(alternativeName);
						return Optional.of(QualifiedName.create(Lists.newArrayList(segments)));
					}
				}
			}
		}

		return Optional.absent();
	}

}
