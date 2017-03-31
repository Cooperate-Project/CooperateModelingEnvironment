package de.cooperateproject.modeling.textual.xtext.runtime.scoping;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;

public class QualifiedNameGenerator extends TextualCommonsSwitch<String> {

    private static final QualifiedNameGenerator QUALIFIED_NAME_GENERATOR = new QualifiedNameGenerator();

    public static QualifiedName getQualifiedName(NamedElement element) {
        String qualifiedName = QUALIFIED_NAME_GENERATOR.doSwitch(element);
        String[] qualifiedNameSegments = qualifiedName.split("\\.");
        return QualifiedName.create(qualifiedNameSegments);
    }

    private QualifiedNameGenerator() {
    }

    @Override
    public String caseNamedElement(NamedElement object) {
        String parentName = doSwitch(object.eContainer());
        if (StringUtils.isNotEmpty(parentName)) {
            return String.format("%s.%s", parentName, object.getName());
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
