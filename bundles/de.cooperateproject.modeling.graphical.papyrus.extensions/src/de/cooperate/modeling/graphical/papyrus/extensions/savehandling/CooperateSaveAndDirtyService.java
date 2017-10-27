package de.cooperate.modeling.graphical.papyrus.extensions.savehandling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.infra.ui.lifecycleevents.SaveAndDirtyService;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperate.modeling.graphical.papyrus.extensions.Activator;
import de.cooperateproject.modeling.graphical.papyrus.extensions.validation.constraints.general.CooperateConstraintBase;
import de.cooperateproject.ui.util.editor.UIThreadActionUtil;

/**
 * SaveAndDirtyService for papyrus models created in cooperate projects. Provides model
 * validation and custom save logic.
 * 
 * @author faller, persch
 *
 */
public class CooperateSaveAndDirtyService extends SaveAndDirtyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateSaveAndDirtyService.class);
    private ServicesRegistry serviceRegistry;

    @Override
    public void doSave(IProgressMonitor monitor) {
        UIThreadActionUtil.perform(() -> doSaveIfValid(monitor));
    }

    private void doSaveIfValid(IProgressMonitor monitor) {
        SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
        subMonitor.setTaskName("Saving diagram.");
        if (validate()) {
            super.doSave(subMonitor.split(100));
        }
    }

    @Override
    public void init(ServicesRegistry servicesRegistry) throws ServiceException {
        super.init(servicesRegistry);
        this.serviceRegistry = servicesRegistry;
    }

    private static void showErrorDialog(String reason) {
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        ErrorDialog.openError(shell, "Could not save model",
                "The model contains inconsistencies or unsupported elements and cannot be saved in this state.",
                new Status(IStatus.ERROR, Activator.getPluginID(), reason));
    }

    private boolean validate() {
        try {
            Collection<Diagnostic> validationResults = new ArrayList<>();
            getActiveDiagram().map(CooperateSaveAndDirtyService::validate).ifPresent(validationResults::addAll);
            getActiveDiagram().flatMap(CooperateSaveAndDirtyService::getActiveUMLRootElement)
                    .map(CooperateSaveAndDirtyService::validate).ifPresent(validationResults::addAll);

            Collection<Diagnostic> relevantDiagnostics = validationResults.stream()
                    .filter(d -> CooperateConstraintBase.isCooperateConstraint(d.getSource()))
                    .collect(Collectors.toList());
            if (!relevantDiagnostics.isEmpty()) {
                Diagnostic entryToShow = relevantDiagnostics.iterator().next();
                showErrorDialog(entryToShow.getMessage());
                OpenElementService openElementService = serviceRegistry.getService(OpenElementService.class);
                openElementService.openSemanticElement((EObject) entryToShow.getData().get(0));
                return false;
            }

            return true;
        } catch (ServiceException | PartInitException e) {
            LOGGER.error("Error while validating model", e);
            return false;
        }
    }

    private static Collection<Diagnostic> validate(EObject rootObject) {
        try {
            ValidateModelCommand validateModelCommand = new ValidateModelCommand(rootObject);
            validateModelCommand.execute(null, null);
            Diagnostic diagnostic = validateModelCommand.getDiagnostic();
            return diagnostic.getChildren();
        } catch (ExecutionException e) {
            LOGGER.error("Could not validate root object {} of current diagram.", rootObject, e);
            return Collections.emptyList();
        }
    }

    private Optional<Diagram> getActiveDiagram() throws ServiceException {
        IPageManager pageManager = serviceRegistry.getService(IPageManager.class);
        return pageManager.allPages().stream().filter(pageManager::isOpen).filter(Diagram.class::isInstance)
                .map(Diagram.class::cast).findFirst();
    }

    private static Optional<EObject> getActiveUMLRootElement(Diagram activeDiagram) {
        @SuppressWarnings("unchecked")
        EObject umlRootElement = Optional.ofNullable(activeDiagram.getStyles())
                .flatMap(styles -> ((Collection<Style>) styles).stream().filter(PapyrusDiagramStyle.class::isInstance)
                        .map(PapyrusDiagramStyle.class::cast).findFirst())
                .map(PapyrusDiagramStyle::getOwner)
                .orElseGet(() -> Optional.ofNullable(activeDiagram.getElement()).orElse(null));
        return Optional.ofNullable(umlRootElement);
    }

    @Override
    public boolean isSaveAsAllowed() {
        Optional<Diagram> diagram = Optional.empty();
        try {
            diagram = getActiveDiagram();
        } catch (ServiceException e) {
            LOGGER.warn("Could not determine active diagram.", e);
        }
        return diagram.map(EObject::eResource).map(Resource::getURI).map(URI::scheme)
                .map(scheme -> !scheme.startsWith("cdo")).orElse(super.isSaveAsAllowed());
    }

}
