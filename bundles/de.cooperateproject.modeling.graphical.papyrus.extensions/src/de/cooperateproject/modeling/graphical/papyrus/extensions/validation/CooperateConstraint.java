package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.ui.lifecycleevents.ISaveAndDirtyService;

public abstract class CooperateConstraint extends AbstractModelConstraint {

    private static final Logger LOGGER = Logger.getLogger(CooperateConstraint.class);

    @Override
    public final IStatus validate(IValidationContext ctx) {
        IStatus status = validateCooperateModel(ctx);
        if (!status.isOK()) {
            try {
                // Tell SaveAndDirtyService not to save the invalid model
                ServicesRegistry serviceRegistry = ServiceUtilsForEObject.getInstance()
                        .getServiceRegistry(ctx.getTarget());
                ISaveAndDirtyService saveAndDirtyService = serviceRegistry.getService(ISaveAndDirtyService.class);
                if (saveAndDirtyService instanceof CooperateSaveAndDirtyService) {
                    CooperateSaveAndDirtyService cooperateService = (CooperateSaveAndDirtyService) saveAndDirtyService;
                    cooperateService
                            .setModelInconsistent(new CooperateValidationError(status.getMessage(), ctx.getTarget()));
                }
            } catch (ServiceException e) {
                LOGGER.error("Could not get ServicesRegistry on validation", e);
            }
        }
        return status;
    }

    public abstract IStatus validateCooperateModel(IValidationContext ctx);
}
