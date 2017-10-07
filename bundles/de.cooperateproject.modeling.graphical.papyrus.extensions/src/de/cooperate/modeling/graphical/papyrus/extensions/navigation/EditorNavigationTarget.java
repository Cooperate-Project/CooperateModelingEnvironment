package de.cooperate.modeling.graphical.papyrus.extensions.navigation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.infra.gmfdiag.common.SemanticFromGMFElement;
import org.eclipse.papyrus.infra.gmfdiag.common.SynchronizableGmfDiagramEditor;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;

/**
 * Copy of the reveal features of {@link SynchronizableGmfDiagramEditor} except for a bug fix that prohibits not
 * selectable elements from beeing selected.
 */
public class EditorNavigationTarget implements NavigationTarget {

    private final SynchronizableGmfDiagramEditor editor;

    /**
     * Constructs the navigation target.
     * 
     * @param editor
     *            The editor that contains the edit parts to be navigated to.
     */
    public EditorNavigationTarget(SynchronizableGmfDiagramEditor editor) {
        this.editor = editor;
    }

    @Override
    public boolean revealElement(Object element) {
        return revealElement(Collections.singleton(element));
    }

    @Override
    public boolean revealElement(Collection<?> elements) {
        // create an instance that can get semantic element from gmf
        SemanticFromGMFElement semanticFromGMFElement = new SemanticFromGMFElement();

        // get the graphical viewer
        GraphicalViewer graphicalViewer = (GraphicalViewer) editor.getAdapter(GraphicalViewer.class);
        if (graphicalViewer != null) {

            // look amidst all edit part if the semantic is contained in the list
            Iterator<?> iter = graphicalViewer.getEditPartRegistry().values().iterator();
            IGraphicalEditPart researchedEditPart = null;
            List<?> clonedList = new ArrayList<>(elements);
            List<IGraphicalEditPart> partSelection = new ArrayList<>();

            while (iter.hasNext() && !clonedList.isEmpty()) {
                Object currentEditPart = iter.next();
                // look only amidst IPrimary editpart to avoid compartment and labels of links
                if (currentEditPart instanceof IPrimaryEditPart && !skipEditPart(currentEditPart)) {
                    Object currentElement = semanticFromGMFElement.getSemanticElement(currentEditPart);
                    if (clonedList.contains(currentElement)) {
                        clonedList.remove(currentElement);
                        researchedEditPart = ((IGraphicalEditPart) currentEditPart);
                        partSelection.add(researchedEditPart);

                    }
                }
            }

            // We may also search for a GMF View (Instead of a semantic model Element)
            if (!clonedList.isEmpty()) {
                for (Iterator<?> iterator = clonedList.iterator(); iterator.hasNext();) {
                    Object element = iterator.next();
                    if (graphicalViewer.getEditPartRegistry().containsKey(element) && !clonedList.isEmpty()) {
                        iterator.remove();
                        researchedEditPart = (IGraphicalEditPart) graphicalViewer.getEditPartRegistry().get(element);
                        partSelection.add(researchedEditPart);
                    }
                }
            }

            // the second test, as the model element is not a PrimaryEditPart, is to allow the selection even if the
            // user selected it with other elements
            // and reset the selection if only the model is selected
            if (clonedList.isEmpty()
                    || (clonedList.size() == 1 && clonedList.get(0) == editor.getDiagram().getElement())) {
                // all parts have been found
                IStructuredSelection sSelection = new StructuredSelection(partSelection);
                // this is used instead of graphicalViewer.select(IGraphicalEditPart) as the later only allows the
                // selection of a single element
                graphicalViewer.setSelection(sSelection);
                if (!partSelection.isEmpty()) {
                    graphicalViewer.reveal(partSelection.get(0));
                }
                return true;
            }
        }

        return false;
    }

    private static boolean skipEditPart(Object currentEditPart) {
        Optional<View> view = Optional.of(currentEditPart).filter(IGraphicalEditPart.class::isInstance)
                .map(IGraphicalEditPart.class::cast).map(IGraphicalEditPart::getModel).filter(View.class::isInstance)
                .map(View.class::cast);
        return view.map(View::getElement).equals(view.map(EObject::eContainer).filter(View.class::isInstance)
                .map(View.class::cast).map(View::getElement));
    }

}
