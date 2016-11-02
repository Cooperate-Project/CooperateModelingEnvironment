package de.cooperate.modeling.graphical.papyrus.extensions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.uml2.uml.Element;

public class PapyrusContentProvider implements ITreeContentProvider {


	public PapyrusContentProvider() {
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] getElements(Object activeEditor) {
		List<EObject> result = new LinkedList<>();
		if (activeEditor instanceof DiagramEditor) {
			DiagramEditor diagramEditor = (DiagramEditor) activeEditor;
			diagramEditor.getDiagram().getChildren().forEach(child -> {
				result.add(((Node) child).getElement());
			});
			diagramEditor.getDiagram().getEdges().forEach(edge -> {
				result.add(((Edge) edge).getElement());
			});
		}
		return result.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Element) {
			return ((Element) parentElement).allOwnedElements().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof Element) {
			return ((Element) element).getOwner();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EObject){
			return !((EObject) element).eContents().isEmpty();
		}
		return false;
	}

}
