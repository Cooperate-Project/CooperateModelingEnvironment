package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.ui.lifecycleevents.SaveAndDirtyService;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class CooperateSaveAndDirtyService extends SaveAndDirtyService {

    private static final Logger LOGGER = Logger.getLogger(CooperateSaveAndDirtyService.class);
    private static final String PLUG_IN_ID = "de.cooperateproject.validation";
    private ServicesRegistry serviceRegistry;
    private CooperateValidationError validationError;

    public synchronized void setModelInconsistent(CooperateValidationError validationError) {
        this.validationError = validationError;
    }

    @Override
    public void init(ServicesRegistry servicesRegistry) throws ServiceException {
        super.init(servicesRegistry);
        this.serviceRegistry = servicesRegistry;
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
        Command validateCommand = commandService.getCommand("org.eclipse.papyrus.validation.ValidateModelCommand");
        try {
            // Open arbitrary element from ModelSet, so ValidateModelCommand can operate
            OpenElementService openElementService = serviceRegistry.getService(OpenElementService.class);
            ModelSet modelSet = serviceRegistry.getService(ModelSet.class);
            // Get .uml file
            Resource resource = modelSet.getResources().stream()
                    .filter(r -> r.getURI().lastSegment().matches(".*\\.uml")).findFirst().get();
            EObject object = resource.getAllContents().next();
            openElementService.openSemanticElement(object);
            if (validateCommand.isEnabled()) {
                // Validate Model
                validateCommand.executeWithChecks(new ExecutionEvent());
            }
            // Synchronize with setModelInconsistent
            synchronized (this) {
                if (null != validationError) {
                    showErrorDialog(validationError.getMessage());
                    // Open view part of invalid element
                    openElementService.openElement(validationError.getInvalidObject());
                    validationError = null;
                    return;
                }
            }
        } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
            LOGGER.error("Error while executing ValidateModelCommand on save of Model", e);
            return; // Do not save when Exception occurs
        } catch (ServiceException e) {
            LOGGER.error("Cannot access required services to validate model on save", e);
            return;
        } catch (PartInitException e) {
            LOGGER.error("Cannot open view part after validation", e);
            return;
        }
        super.doSave(monitor);
    }

    private void showErrorDialog(String reason) {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        ErrorDialog.openError(shell, "Could not save model",
                "The model contains inconsistencies or unsupported elements and cannot be saved in this state.",
                new Status(IStatus.ERROR, PLUG_IN_ID, reason));
    }
}
