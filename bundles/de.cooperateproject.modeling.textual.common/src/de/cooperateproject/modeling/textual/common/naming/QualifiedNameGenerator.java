package de.cooperateproject.modeling.textual.common.naming;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.DynamicTextualCommonsSwitch;

public class QualifiedNameGenerator extends DynamicTextualCommonsSwitch<String> {

    private static final QualifiedNameGenerator QUALIFIED_NAME_GENERATOR = new QualifiedNameGenerator();

    public static QualifiedName getQualifiedName(NamedElement element) {
        return Optional.ofNullable(QUALIFIED_NAME_GENERATOR.doSwitch(element)).map(s -> s.split("\\."))
                .map(QualifiedName::create).orElse(null);
    }

    private QualifiedNameGenerator() {
    }

    @Override
    public String caseNamedElement(NamedElement object) {
        String parentName = doSwitch(object.eContainer());
        if (StringUtils.isNotEmpty(parentName)) {
            return String.format("%s.%s", parentName, getName(object));
        }
        return getName(object);
    }

    private String getName(NamedElement object) {
        if (object instanceof PackageBase && ((PackageBase) object).getOwningPackage() == null
                && StringUtils.isBlank(object.getName())) {
            return Optional
                    .ofNullable(
                            ((UMLReferencingElement<org.eclipse.uml2.uml.NamedElement>) object).getReferencedElement())
                    .map(org.eclipse.uml2.uml.NamedElement::getName).orElse(null);
        }
        return object.getName();
    }

    @Override
    public String defaultCase(EObject object) {
        EObject container = object.eContainer();
        if (container != null) {
            return doSwitch(container);
        }
        return null;
    }

}
