package de.cooperateproject.modeling.textual.cls.provider;

import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ClsQualifiedNameProvider extends CooperateQualifiedNameProvider {

    protected QualifiedName qualifiedName(PackageBase element) {
        /*
         * if (element.eContainer() == null && StringUtils.isBlank(element.getName())) {
         * return (element.getReferencedElement().getName();
         * return QualifiedName.create(element.getQualifiedName().split(element.separator()));
         * }
         */
        Element referencedElement = element.getReferencedElement();
        // QualifiedName create = QualifiedName.create(referencedElement.get);
        return null;

    }

}
