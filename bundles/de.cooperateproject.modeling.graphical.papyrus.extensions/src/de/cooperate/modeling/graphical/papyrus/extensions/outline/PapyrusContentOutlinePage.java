package de.cooperate.modeling.graphical.papyrus.extensions.outline;

import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.core.editor.BackboneException;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IEditorPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.IPage;
import org.eclipse.papyrus.infra.core.sasheditor.editor.ISashWindowsContainer;
import org.eclipse.papyrus.infra.ui.contentoutline.IPapyrusContentOutlinePage;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import de.cooperate.modeling.graphical.papyrus.extensions.outline.util.NOPPageLifeCycleEventsListener2;

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

    private final PageChangeListener pageChangeListener = new PageChangeListener();
    private TreeViewer viewer;
    private IMultiDiagramEditor editor;

    @Override
    public void init(IMultiDiagramEditor arg0) throws BackboneException {
        editor = arg0;
        ISashWindowsContainer sashWindowsContainer = arg0.getAdapter(ISashWindowsContainer.class);
        sashWindowsContainer.addPageLifeCycleListener(pageChangeListener);
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

}
