package de.cooperateproject.ui.papyrus.editorlauncher;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.modeling.graphical.common.conventions.NotationDiagramTypes;
import de.cooperateproject.ui.focus.manager.FocusManagerBase;

public class FocusManagerGraphical extends FocusManagerBase<PapyrusMultiDiagramEditor> {

    private static final Logger LOGGER = Logger.getLogger(FocusManagerGraphical.class);

    public FocusManagerGraphical(PapyrusMultiDiagramEditor editorPart) {
        super(editorPart);
    }

    @Override
    public void setFocusedElement(EObject element) {
        try {
            OpenElementService openService = getEditorPart().getServicesRegistry().getService(OpenElementService.class);
            openService.openSemanticElement(element);
            getEditorPart().setFocus();
        } catch (PartInitException | ServiceException e) {
            LOGGER.error("Something went wrong while programmatically setting a focus in the Papyrus editor.", e);
        }

    }

    @Override
    public Optional<Element> getFocusedElement() {
        ISelection selection = getEditorPart().getSite().getSelectionProvider().getSelection();
        Object selectedObject = null;
        if (selection instanceof IStructuredSelection) {
            selectedObject = ((IStructuredSelection) selection).getFirstElement();
            return Optional.ofNullable(getSelectedUmlObject(selectedObject));
        }
        return Optional.empty();
    }

    private NamedElement getSelectedUmlObject(Object selection) {
        NamedElement result = null;
        if (selection != null) {
            if (selection instanceof IAdaptable) {
                result = ((IAdaptable) selection).getAdapter(NamedElement.class);
            } else {
                result = Platform.getAdapterManager().getAdapter(selection, NamedElement.class);
            }
        }
        return result;
    }

    @Override
    public IFile getCooperateLauncherFile() {
        IEditorInput editorInput = getEditorPart().getEditorInput();
        if (editorInput instanceof CooperateURIEditorInput) {
            return ((CooperateURIEditorInput) editorInput).getAssociatedLauncherFile();
        }
        throw new IllegalStateException("The editor input is not compatible.");
    }

    @Override
    public Optional<CDOView> getCDOView() {
        try {
            IPageManager pageManager = getEditorPart().getServicesRegistry().getService(IPageManager.class);
            Set<CDOView> cdoViews = pageManager.allPages().stream().filter(EObject.class::isInstance)
                    .map(EObject.class::cast).map(EObject::eResource).filter(CDOResource.class::isInstance)
                    .map(CDOResource.class::cast).map(CDOResource::cdoView).filter(Objects::nonNull)
                    .collect(Collectors.toSet());
            if (cdoViews.isEmpty()) {
                LOGGER.warn("Could not find CDO view.");
            } else {
                if (cdoViews.size() > 1) {
                    LOGGER.warn("Got multiple CDO views. Taking the first one.");
                }
                return Optional.of(cdoViews.iterator().next());
            }
        } catch (ServiceException e) {
            LOGGER.warn("Could not load services registry.", e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<DiagramTypes> getDiagramType() {
        try {
            IPageManager pageManager = getEditorPart().getServicesRegistry().getService(IPageManager.class);
            Collection<DiagramTypes> diagramTypes = pageManager.allPages().stream().filter(Diagram.class::isInstance)
                    .map(Diagram.class::cast).map(Diagram::getType).distinct()
                    .map(NotationDiagramTypes::getByNotationDiagramType).filter(Optional::isPresent).map(Optional::get)
                    .map(NotationDiagramTypes::getDiagramType).collect(Collectors.toSet());
            if (diagramTypes.size() == 1) {
                return Optional.of(diagramTypes.iterator().next());
            }
        } catch (ServiceException e) {
            LOGGER.warn("Could not load services registry.", e);
        }
        return Optional.empty();
    }

}
