package de.cooperateproject.modeling.textual.cls.scoping;

import java.util.List;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;

public class NameSwitch extends ClsSwitch<String> {

	@Override
	public <T extends NamedElement> String caseNamedElement(
			de.cooperateproject.modeling.textual.cls.cls.NamedElement<T> object) {
		Object result = object.eGet(ClsPackage.eINSTANCE.getNamedElement_Name(), false);
		if (result != null) {
			return (String)result;
		}
		
		List<INode> nodes = NodeModelUtils.findNodesForFeature(object, ClsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement());
		if (!nodes.isEmpty()) {
			return NodeModelUtils.getTokenText(nodes.get(0));
		}
		
		Object referencedElement = object.eGet(ClsPackage.eINSTANCE.getUMLReferencingElement_ReferencedElement(), false);
		if (referencedElement instanceof NamedElement) {
			return ((NamedElement)referencedElement).getName();
		}
		
		return null;
	}

	
	
}
