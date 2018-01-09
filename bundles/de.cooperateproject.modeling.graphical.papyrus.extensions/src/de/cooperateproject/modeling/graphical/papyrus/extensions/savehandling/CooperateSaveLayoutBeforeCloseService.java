package de.cooperateproject.modeling.graphical.papyrus.extensions.savehandling;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.services.SaveLayoutBeforeClose;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;

/**
 * Implementation of {@link SaveLayoutBeforeClose} that does not save the layout if a Cooperate diagram is shown.
 * 
 * The implementation disabled the existing service in order to replace it.
 * 
 * @see SaveLayoutBeforeClose
 */
public class CooperateSaveLayoutBeforeCloseService extends SaveLayoutBeforeClose {

    protected ServicesRegistry registry;

    @Override
    public void init(ServicesRegistry servicesRegistry) throws ServiceException {
        super.init(servicesRegistry);
        this.registry = servicesRegistry;
    }

    @Override
    public void startService() throws ServiceException {
        super.startService();
        removeOldService();
    }

    protected void removeOldService() throws ServiceException {
        SaveLayoutBeforeClose service = registry.getService(SaveLayoutBeforeClose.class);
        if (service != null) {
            service.disposeService();
        }
    }

    @Override
    public void saveBeforeClose(IMultiDiagramEditor editor) {
        if (editor.getEditorInput() instanceof ILauncherFileEditorInput) {
            return;
        } else {
            super.saveBeforeClose(editor);
        }
    }

}
