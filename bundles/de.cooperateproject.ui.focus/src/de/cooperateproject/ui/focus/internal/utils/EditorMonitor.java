package de.cooperateproject.ui.focus.internal.utils;

import java.util.Optional;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;

public class EditorMonitor {

    private class WorkspaceListener implements IPartListener2 {

        private IEditorPart activeEditor;

        private Optional<IEditorPart> getEditorPart(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part instanceof IEditorPart) {
                return Optional.of((IEditorPart) part);
            }
            return Optional.empty();
        }

        @Override
        public void partActivated(IWorkbenchPartReference partRef) {
            Optional<IEditorPart> editorPart = getEditorPart(partRef);
            if (editorPart.isPresent()) {
                if (editorPart.get() != activeEditor) {
                    editorListener.editorActivated(editorPart.get());
                }
            }
        }

        @Override
        public void partBroughtToTop(IWorkbenchPartReference partRef) {
            partActivated(partRef);
        }

        @Override
        public void partClosed(IWorkbenchPartReference partRef) {
            Optional<IEditorPart> editorPart = getEditorPart(partRef);
            if (editorPart.isPresent()) {
                editorListener.editorClosed(editorPart.get());
            }
        }

        @Override
        public void partDeactivated(IWorkbenchPartReference partRef) {
            return;
        }

        @Override
        public void partOpened(IWorkbenchPartReference partRef) {
            partActivated(partRef);
        }

        @Override
        public void partHidden(IWorkbenchPartReference partRef) {
            return;
        }

        @Override
        public void partVisible(IWorkbenchPartReference partRef) {
            partActivated(partRef);
        }

        @Override
        public void partInputChanged(IWorkbenchPartReference partRef) {
            return;
        }

    }

    private final WorkspaceListener workspaceListener = new WorkspaceListener();
    private final IEditorListener editorListener;

    public EditorMonitor(IEditorListener listener) {
        this.editorListener = listener;
    }

    public void start() {
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(workspaceListener);
    }

    public void stop() {
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().removePartListener(workspaceListener);
    }

}
