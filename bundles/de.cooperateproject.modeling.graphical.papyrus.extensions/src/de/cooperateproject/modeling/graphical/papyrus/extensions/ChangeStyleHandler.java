package de.cooperateproject.modeling.graphical.papyrus.extensions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.ServiceUtilsForEditPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ChangeStyleHandler extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChangeStyleHandler.class);

    protected TransactionalEditingDomain transactionalEditingDomain = null;

    protected org.eclipse.uml2.uml.Element selectedElement = null;

    public ChangeStyleHandler() {
        super();
    }

    protected abstract AbstractTransactionalCommand getChangeStyleCommand(final GraphicalEditPart editPart);

    /**
     *
     * @return null or the selected editPart
     */
    protected GraphicalEditPart getSelectedGraphicalEditpart() {
        IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (activeWorkbenchWindow != null) {
            ISelectionService selectionService = activeWorkbenchWindow.getSelectionService();
            ISelection selection = selectionService.getSelection();
            if (selection instanceof IStructuredSelection) {
                Object selectedobject = ((IStructuredSelection) selection).getFirstElement();
                if (selectedobject instanceof GraphicalEditPart) {
                    return (GraphicalEditPart) selectedobject;
                }
            }
        }
        return null;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final GraphicalEditPart editPart = getSelectedGraphicalEditpart();
        ServiceUtilsForEditPart util = ServiceUtilsForEditPart.getInstance();
        try {
            transactionalEditingDomain = util.getTransactionalEditingDomain(editPart);
        } catch (ServiceException e) {
            LOGGER.error("Impossible to get the Transactional Editing Domain.", e);
        }
        try {
            editPart.getEditingDomain().runExclusive(() -> {
                Display.getCurrent().asyncExec(() -> {
                    AbstractTransactionalCommand command = getChangeStyleCommand(editPart);
                    editPart.getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(command));
                });
            });
        } catch (InterruptedException e) {
            LOGGER.error("Error in ChangeStyleHandler.", e);
        }
        return null;
    }

}
