package de.cooperateproject.modeling.textual.cls.provider;

import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ClsQualifiedNameProvider extends CooperateQualifiedNameProvider {

    /*
     * protected QualifiedName qualifiedName(PackageBase element) {
     * Element referencedElement = element.getReferencedElement();
     * if (referencedElement instanceof Model) {
     * return QualifiedName.create(((Model) referencedElement).getName());
     * }
     * return null;
     * }
     */

    /*
     * protected QualifiedName qualifiedName(Classifier<? extends org.eclipse.uml2.uml.Classifier> element) {
     * // TODO: cant get owning package...
     * Package owningPackage = element.getOwningPackage();
     * QualifiedName create = QualifiedName.create("RootElement");
     * return create.append(QualifiedName.create(element.getName()));
     * }
     */
    protected QualifiedName qualifiedName(de.cooperateproject.modeling.textual.cls.cls.Package element) {
        // TODO: cant get owning package...
        if (element.getOwningPackage() == null) {
            return qualifiedName(element.getReferencedElement());
            // return QualifiedName.create(element.getReferencedElement().getName());
        }
        return null;
    }

}
