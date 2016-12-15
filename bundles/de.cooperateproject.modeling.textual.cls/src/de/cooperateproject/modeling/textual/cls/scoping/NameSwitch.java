package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class NameSwitch extends ClsSwitch<String> {
	
	@Override
	public String casePackageImport(PackageImport object) {
		return determineNameOfReferencedNamedElement(object, ClsPackage.Literals.PACKAGE_IMPORT__REFERENCED_ELEMENT);
	}

	@Override
	public <T extends NamedElement> String caseNamedElement(
			de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> object) {
		Object result = object.eGet(ClsPackage.Literals.NAMED_ELEMENT_OPTIONAL__NAME, false);
		if (result != null) {
			return (String)result;
		}
		
		return determineNameOfReferencedNamedElement(object, ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
	}
	
	private String determineNameOfReferencedNamedElement(EObject object, EReference umlReference) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(object, umlReference);
		if (!nodes.isEmpty()) {
			return normalizeNodeName(NodeModelUtils.getTokenText(nodes.get(0)));
		}
		
		Object referencedElement = object.eGet(umlReference, false);
		if (referencedElement instanceof NamedElement) {
			return ((NamedElement)referencedElement).getName();
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
