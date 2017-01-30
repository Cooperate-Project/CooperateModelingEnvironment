package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.markerlistener.IPapyrusMarker;
import org.eclipse.papyrus.infra.services.validation.IValidationMarkersService;
import org.eclipse.papyrus.infra.ui.lifecycleevents.SaveAndDirtyService;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class CooperateSaveAndDirtyService extends SaveAndDirtyService {

    private static final Logger LOGGER = Logger.getLogger(CooperateSaveAndDirtyService.class);
    private static final String PLUG_IN_ID = "de.cooperateproject.validation";
    private Set<String> cooperateConstraintIds;
    private ServicesRegistry serviceRegistry;

    @Override
    public void init(ServicesRegistry servicesRegistry) throws ServiceException {
        super.init(servicesRegistry);
        this.serviceRegistry = servicesRegistry;
    }

    @Override
    public void startService() throws ServiceException {
        super.startService();
        cooperateConstraintIds = new HashSet<>();
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        // TODO Command wird nicht ausgeführt, wenn Fokus im Property Fenster ist
        ICommandService commandService = PlatformUI.getWorkbench().getService(ICommandService.class);
        Command validateCommand = commandService.getCommand("org.eclipse.papyrus.validation.ValidateModelCommand");
        try {
            if (validateCommand.isEnabled()) {
                // Validate Model
                validateCommand.executeWithChecks(new ExecutionEvent());
            }
            IValidationMarkersService markerService = serviceRegistry.getService(IValidationMarkersService.class);
            if (cooperateConstraintIds.isEmpty()) {
                // Init list of constraints in the cooperateConstraint category
                initConstraintIdSet();
            }
            for (IPapyrusMarker marker : markerService.getMarkers()) {
                String source = marker.getAttribute(IPapyrusMarker.SOURCE).toString();
                // If a marker is from one of the Cooperate constrains, return without save
                if (cooperateConstraintIds.contains(source)) {
                    showErrorDialog(marker.getAttribute(IPapyrusMarker.MESSAGE).toString());
                    return;
                }
            }
        } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
            LOGGER.error("Error while executing ValidateModelCommand on save of Model", e);
            return; // Do not save when Exception occurs
        } catch (ServiceException e) {
            LOGGER.error("Cannot access required services to validate model on save", e);
            return;
        } catch (CoreException e) {
            LOGGER.error("Unexpected Exception when validating model on save", e);
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

    private void initConstraintIdSet() {
        ConstraintRegistry.getInstance().getAllDescriptors().forEach(descriptor -> {
            cooperateConstraintIds.add(descriptor.getId());
        });
    }
}
