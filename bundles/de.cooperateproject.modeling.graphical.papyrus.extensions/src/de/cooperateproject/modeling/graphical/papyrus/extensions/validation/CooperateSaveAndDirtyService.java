package de.cooperateproject.modeling.graphical.papyrus.extensions.validation;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.infra.ui.lifecycleevents.SaveAndDirtyService;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperate.modeling.graphical.papyrus.extensions.Activator;

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
        if (Display.getCurrent() == null) {
            Display.getDefault().syncExec(() -> doSaveIfValid(monitor));
        } else {
            doSaveIfValid(monitor);
        }
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
            Optional<EObject> umlRootElement = getActiveUMLRootElement();
            if (umlRootElement.isPresent()) {
                ValidateModelCommand validateModelCommand = new ValidateModelCommand(umlRootElement.get());
                GMFtoEMFCommandWrapper.wrap(validateModelCommand).execute();
                Diagnostic diagnostic = validateModelCommand.getDiagnostic();
                List<Diagnostic> relevantDiagnostics = diagnostic.getChildren().stream()
                        .filter(d -> CooperateConstraint.isCooperateConstraint(d.getSource()))
                        .collect(Collectors.toList());
                if (!relevantDiagnostics.isEmpty()) {
                    Diagnostic entryToShow = relevantDiagnostics.iterator().next();
                    showErrorDialog(entryToShow.getMessage());
                    OpenElementService openElementService = serviceRegistry.getService(OpenElementService.class);
                    openElementService.openSemanticElement((EObject) entryToShow.getData().get(0));
                    return false;
                }
            }
            return true;
        } catch (ServiceException | PartInitException e) {
            LOGGER.error("Error while validating model", e);
            return false;
        }
    }

    private Optional<EObject> getActiveUMLRootElement() throws ServiceException {
        IPageManager pageManager = serviceRegistry.getService(IPageManager.class);
        Optional<Diagram> activeDiagram = pageManager.allPages().stream().filter(pageManager::isOpen)
                .filter(Diagram.class::isInstance).map(Diagram.class::cast).findFirst();
        @SuppressWarnings("unchecked")
        EObject umlRootElement = activeDiagram.map(Diagram::getStyles)
                .flatMap(styles -> ((Collection<Style>) styles).stream().filter(PapyrusDiagramStyle.class::isInstance)
                        .map(PapyrusDiagramStyle.class::cast).findFirst())
                .map(PapyrusDiagramStyle::getOwner)
                .orElseGet(() -> activeDiagram.map(Diagram::getElement).orElse(null));
        return Optional.ofNullable(umlRootElement);
    }
}
