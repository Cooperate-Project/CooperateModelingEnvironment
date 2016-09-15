package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Optional;

public interface IAlternativeNameProvider  {
	
	Optional<QualifiedName> getAlternativeFullyQualifiedName(EObject obj);

}
