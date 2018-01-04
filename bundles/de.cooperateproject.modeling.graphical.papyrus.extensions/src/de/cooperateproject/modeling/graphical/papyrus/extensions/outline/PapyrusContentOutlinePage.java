package de.cooperateproject.modeling.graphical.papyrus.extensions.outline;

import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPageLifeCycleEventsListener;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationService;
import org.eclipse.papyrus.infra.ui.contentoutline.IPapyrusContentOutlinePage;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.uml2.uml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.graphical.papyrus.extensions.outline.util.NOPPageLifeCycleEventsListener2;

/**
 * Customized outline page that extends the existing abilities of the default outline of the Papyrus editor.
 */
public class PapyrusContentOutlinePage extends ContentOutlinePage implements IPapyrusContentOutlinePage {

    private class PageChangeListener extends NOPPageLifeCycleEventsListener2 {

        private static final int SMOOTH_DELAY_IN_MILLISECONDS = 500;
        private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        private ScheduledFuture<?> lastTask;

        @Override
        public void pageFirePropertyChange(IPage page, int propertyId) {
            firePageChangeSmooth(page);
        }

        private void firePageChangeSmooth(IPage page) {
            Optional.ofNullable(lastTask).ifPresent(task -> task.cancel(false));
            lastTask = executor.schedule(
                    () -> page.getControl().getDisplay().syncExec(() -> setViewerInputIfPossible(page)),
                    SMOOTH_DELAY_IN_MILLISECONDS, TimeUnit.MILLISECONDS);
        }

    }

    private class SelectionChangeListener implements ISelectionChangedListener {

        @Override
        public void selectionChanged(SelectionChangedEvent event) {
            Optional.of(event.getSelection()).filter(IStructuredSelection.class::isInstance)
                    .map(IStructuredSelection.class::cast).map(IStructuredSelection::getFirstElement)
                    .filter(IAdaptable.class::isInstance).map(IAdaptable.class::cast)
                    .map(a -> a.getAdapter(Element.class)).map(Element.class::cast)
                    .ifPresent(PapyrusContentOutlinePage.this::handleEditorSelectionChange);
        }

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(PapyrusContentOutlinePage.class);
    private final IPageLifeCycleEventsListener pageChangeListener = new PageChangeListener();
    private final ISelectionChangedListener selectionChangeListener = new SelectionChangeListener();
    private TreeViewer viewer;
    private IMultiDiagramEditor editor;

    @Override
    public void init(IMultiDiagramEditor arg0) throws BackboneException {
        editor = arg0;
        ISashWindowsContainer sashWindowsContainer = editor.getAdapter(ISashWindowsContainer.class);
        sashWindowsContainer.addPageLifeCycleListener(pageChangeListener);
        editor.getEditorSite().getSelectionProvider().addSelectionChangedListener(selectionChangeListener);
    }

    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);
        viewer = getTreeViewer();
        viewer.setContentProvider(new PapyrusContentProvider());
        viewer.setLabelProvider(new NonObservableUMLLabelProvider());
        Optional.ofNullable(editor).map(IMultiDiagramEditor::getActiveEditor).ifPresent(this::setViewerInputIfPossible);
    }

    @Override
    public void dispose() {
        ISashWindowsContainer sashWindowsContainer = editor.getAdapter(ISashWindowsContainer.class);
        sashWindowsContainer.removePageLifeCycleListener(pageChangeListener);
        editor.getEditorSite().getSelectionProvider().addSelectionChangedListener(selectionChangeListener);
        super.dispose();
    }

    private void setViewerInputIfPossible(IPage page) {
        if (page instanceof IEditorPage) {
            IEditorPage editorPage = (IEditorPage) page;
            setViewerInputIfPossible(editorPage.getIEditorPart());
        }
    }

    private void setViewerInputIfPossible(IEditorPart editorPart) {
        Optional<Diagram> diagram = Optional.ofNullable(editorPart).filter(DiagramEditor.class::isInstance)
                .map(DiagramEditor.class::cast).map(DiagramEditor::getDiagram);
        diagram.ifPresent(viewer::setInput);
    }

    @Override
    protected void fireSelectionChanged(ISelection selection) {
        super.fireSelectionChanged(selection);
        try {
            Optional<ServicesRegistry> servicesRegistry = Optional.ofNullable(editor)
                    .map(IMultiDiagramEditor::getServicesRegistry);
            if (!servicesRegistry.isPresent()) {
                return;
            }

            Optional<EObject> selectedElement = Optional.of(selection).filter(IStructuredSelection.class::isInstance)
                    .map(IStructuredSelection.class::cast).map(IStructuredSelection::getFirstElement)
                    .filter(EObject.class::isInstance).map(EObject.class::cast);
            if (!selectedElement.isPresent()) {
                return;
            }

            NavigationService navigationService = servicesRegistry.get().getService(NavigationService.class);
            navigationService.navigate(selectedElement.get());

        } catch (ServiceException e) {
            LOGGER.warn("Could not acquire {}.", NavigationService.class, e);
        }
    }

    private void handleEditorSelectionChange(Element semanticElement) {
        if (!Optional.of(getSelection()).filter(IStructuredSelection.class::isInstance)
                .map(IStructuredSelection.class::cast).map(IStructuredSelection::getFirstElement)
                .map(semanticElement::equals).orElse(false)) {
            setSelection(new StructuredSelection(semanticElement));
        }
    }

}
