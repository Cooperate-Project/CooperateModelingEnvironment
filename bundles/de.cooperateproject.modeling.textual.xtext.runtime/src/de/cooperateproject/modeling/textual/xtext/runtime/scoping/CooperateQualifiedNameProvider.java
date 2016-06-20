package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class CooperateQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName qualifiedName(NamedElement element) {
		return QualifiedName.create(element.getQualifiedName().split(element.separator()));
	}

}
