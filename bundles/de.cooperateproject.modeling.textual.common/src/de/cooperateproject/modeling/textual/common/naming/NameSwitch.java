package de.cooperateproject.modeling.textual.common.naming;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.TextualCommonsSwitch;

public class NameSwitch extends TextualCommonsSwitch<String> {

    @Override
    public String casePackageImport(PackageImport object) {
        return determineNameOfReferencedNamedElement(object,
                TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
    }

    @Override
    public String caseNamedElement(
            de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement object) {
        Object result = object.eGet(TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, false);
        if (result != null) {
            return (String) result;
        }

        return determineNameOfReferencedNamedElement(object,
                TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
    }

    private String determineNameOfReferencedNamedElement(EObject object, EReference umlReference) {
        List<INode> nodes = NodeModelUtils.findNodesForFeature(object, umlReference);
        if (!nodes.isEmpty()) {
            return normalizeNodeName(NodeModelUtils.getTokenText(nodes.get(0)));
        }

        Object referencedElement = object.eGet(umlReference, false);
        if (referencedElement instanceof NamedElement) {
            return ((NamedElement) referencedElement).getName();
        }

        return null;
    }

    private static String normalizeNodeName(String nodeName) {
        if (nodeName != null && nodeName.matches("\\\".*\\\"")) {
            return nodeName.subSequence(1, nodeName.length() - 1).toString();
        }
        return nodeName;
    }
}
