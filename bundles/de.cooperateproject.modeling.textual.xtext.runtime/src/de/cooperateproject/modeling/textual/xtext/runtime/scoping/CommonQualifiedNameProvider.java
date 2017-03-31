package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;

public class CommonQualifiedNameProvider extends CooperateQualifiedNameProvider {

    protected QualifiedName qualifiedName(EObject element) {
        if (element instanceof NamedElement) {
            return QualifiedNameGenerator.getQualifiedName((NamedElement) element);
        }
        return null;
    }

}
