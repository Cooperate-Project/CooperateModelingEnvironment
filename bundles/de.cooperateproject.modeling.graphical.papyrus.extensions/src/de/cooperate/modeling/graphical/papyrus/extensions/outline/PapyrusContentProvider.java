package de.cooperate.modeling.graphical.papyrus.extensions.outline;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Provides the content of the Papyrus outline.
 */
public class PapyrusContentProvider implements ITreeContentProvider {

    private static class ElementComparator implements Comparator<Element> {

        @Override
        public int compare(Element o1, Element o2) {
            int typeComparison = o1.eClass().getName().compareTo(o2.eClass().getName());
            if (typeComparison != 0) {
                return typeComparison;
            }

            String name1 = determineName(o1);
            String name2 = determineName(o2);
            return name1.compareTo(name2);
        }

        private static String determineName(Element o1) {
            return Optional.of(o1).filter(NamedElement.class::isInstance).map(NamedElement.class::cast)
                    .map(NamedElement::getName).orElse("");
        }

    }

    private static final Comparator<Element> COMPARATOR = new ElementComparator();
    private Collection<EObject> relevantUMLElements = Collections.emptySet();

    @Override
    public Object[] getElements(Object input) {
        Optional<Diagram> diagram = Optional.ofNullable(input).filter(Diagram.class::isInstance)
                .map(Diagram.class::cast);

        relevantUMLElements = diagram.map(PapyrusContentProvider::getTransitiveViews)
                .map(c -> c.stream().map(View::getElement).collect(Collectors.toSet())).orElse(Collections.emptySet());

        Optional<Element> diagramRoot = diagram.map(Diagram::getElement).filter(Element.class::isInstance)
                .map(Element.class::cast);

        if (!diagramRoot.isPresent()) {
            return new Object[0];
        }
        return diagramRoot.get().getOwnedElements().stream().filter(relevantUMLElements::contains).sorted(COMPARATOR)
                .collect(Collectors.toList()).toArray();
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Element) {
            return ((Element) parentElement).getOwnedElements().stream().filter(relevantUMLElements::contains)
                    .sorted(COMPARATOR).toArray();
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
            return ((EObject) element).eContents().stream().filter(relevantUMLElements::contains).findAny().isPresent();
        }
        return false;
    }

    private static Collection<View> getTransitiveViews(Diagram diagram) {
        Collection<View> views = new HashSet<>();
        views.add(diagram);
        for (TreeIterator<EObject> it = diagram.eAllContents(); it.hasNext();) {
            Optional.of(it.next()).filter(View.class::isInstance).map(View.class::cast).ifPresent(views::add);
        }
        return views;
    }
}
