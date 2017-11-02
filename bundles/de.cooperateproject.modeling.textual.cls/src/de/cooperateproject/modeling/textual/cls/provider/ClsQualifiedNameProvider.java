package de.cooperateproject.modeling.textual.cls.provider;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class ClsQualifiedNameProvider extends CooperateQualifiedNameProvider {

    protected QualifiedName qualifiedName(PackageBase element) {
        Element referencedElement = element.getReferencedElement();
        if (referencedElement instanceof Model) {
            return QualifiedName.create(((Model) referencedElement).getName());
        }
        return null;
    }

    protected QualifiedName qualifiedName(Classifier<? extends org.eclipse.uml2.uml.Classifier> element) {
        // TODO: cant get owning package...
        QualifiedName create = QualifiedName.create("RootElement");
        return create.append(QualifiedName.create(element.getName()));
    }

}
