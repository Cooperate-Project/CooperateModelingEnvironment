package de.cooperate.modeling.graphical.papyrus.extensions.outline;

import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.uml2.uml.Element;

/**
 * Provides the content of the Papyrus outline.
 */
public class PapyrusContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getElements(Object input) {
        Optional<Element> diagramRoot = Optional.ofNullable(input).filter(Diagram.class::isInstance)
                .map(Diagram.class::cast).map(Diagram::getElement).filter(Element.class::isInstance)
                .map(Element.class::cast);

        if (!diagramRoot.isPresent()) {
            return new Object[0];
        }
        return diagramRoot.get().getOwnedElements().stream().collect(Collectors.toList()).toArray();
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Element) {
            return ((Element) parentElement).getOwnedElements().toArray();
        }
        return new Object[0];
    }

    @Override
    public Object getParent(Object element) {
        if (element instanceof Element) {
            return ((Element) element).getOwner();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof EObject) {
            return !((EObject) element).eContents().isEmpty();
        }
        return false;
    }

}
