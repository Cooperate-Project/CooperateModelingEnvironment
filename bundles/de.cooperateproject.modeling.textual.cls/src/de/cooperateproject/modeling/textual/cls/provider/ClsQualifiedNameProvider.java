package de.cooperateproject.modeling.textual.cls.provider;

import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ClsQualifiedNameProvider extends CooperateQualifiedNameProvider {

    /**
     * Returns the qualified name of the referenced element if the given package is the root package.
     * 
     * @param element
     *            the given package.
     * @return the qualified name of the referenced element or null.
     */
    protected QualifiedName qualifiedName(Package element) {
        if (element.getOwningPackage() == null) {
            return qualifiedName(element.getReferencedElement());
        }
        return null;
    }

}
