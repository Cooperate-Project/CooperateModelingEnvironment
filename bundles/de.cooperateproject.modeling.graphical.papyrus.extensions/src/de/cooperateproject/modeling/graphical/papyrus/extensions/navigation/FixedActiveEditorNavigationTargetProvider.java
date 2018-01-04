package de.cooperateproject.modeling.graphical.papyrus.extensions.navigation;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.gmfdiag.common.SynchronizableGmfDiagramEditor;
import org.eclipse.papyrus.infra.services.navigation.provider.NavigationTargetProvider;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.ui.IEditorPart;

/**
 * Copy of {@link FixedActiveEditorNavigationTargetProvider} that delegates to a custom {@link NavigationTarget}
 * element.
 */
public class FixedActiveEditorNavigationTargetProvider implements NavigationTargetProvider {

    @Override
    public NavigationTarget getNavigationTarget(ServicesRegistry registry) {
        IMultiDiagramEditor editor;
        try {
            editor = registry.getService(IMultiDiagramEditor.class);
            if (editor == null) {
                return null;
            }
        } catch (ServiceException ex) {
            // We're not in the context of the multi diagram editor. We have nothing to contribute.
            // Ignore the exception and do not do anything.
            return null;
        }

        IEditorPart activeEditor = editor.getActiveEditor();
        if (activeEditor instanceof SynchronizableGmfDiagramEditor) {
            return new EditorNavigationTarget((SynchronizableGmfDiagramEditor) activeEditor);
        }

        return null;
    }

}
