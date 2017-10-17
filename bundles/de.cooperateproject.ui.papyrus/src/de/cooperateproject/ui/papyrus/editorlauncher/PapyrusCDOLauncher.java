package de.cooperateproject.ui.papyrus.editorlauncher;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Optional;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.papyrus.cdo.internal.core.resource.CDOSashModelProvider;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.sasheditor.ISashModelProvider;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.ui.editor.CoreMultiDiagramEditor;
import org.eclipse.papyrus.infra.ui.lifecycleevents.ILifeCycleEventsProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.editors.launcher.extensions.EditorLauncher;
import de.cooperateproject.ui.editors.launcher.extensions.EditorType;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;
import de.cooperateproject.ui.util.editor.EditorFinderUtil;

/**
 * Editor launcher for Papyrus editors that use CDO resources.
 */
@SuppressWarnings("restriction")
public class PapyrusCDOLauncher extends EditorLauncher {

    private static final String EDITOR_ID_GRAPHICAL = PapyrusMultiDiagramEditor.EDITOR_ID;
    private static final URI UML_PRIMITIVE_TYPES_URI = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
    private static final Logger LOGGER = LoggerFactory.getLogger(PapyrusCDOLauncher.class);

    /**
     * Instantiates the launcher.
     * 
     * @param launcherFile
     *            The launcher file to be used during initialization of the editor.
     * @throws IOException
     *             In case of an error while reading and interpreting the launcher file.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown, if the requested editor type is not available in the launcher file.
     */
    public PapyrusCDOLauncher(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException {
        super(launcherFile, EditorType.GRAPHICAL);
    }

    @Override
    protected IEditorPart doOpenEditor() throws PartInitException {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorInput editorInput = createEditorInput();

        cleanUpPapyrusSashModel((URIEditorInput) editorInput);

        IEditorPart editorPart = IDE.openEditor(page, editorInput, EDITOR_ID_GRAPHICAL);
        selectAppropriateModel(editorPart);
        registerPostSaveListener(editorPart);
        return editorPart;
    }

    protected void cleanUpPapyrusSashModel(URIEditorInput editorInput) {
        // The SashModel needs to be cleaned as references to old pages contain
        // invalid cdo checkout uris which result in cdo transactions not being closed properly

        // This is very ugly code and probably likely to break in the future, unfortunately
        // Papyrus does not provide a more elegant solution

        try {
            Class<?> sashModelProviderManagerClazz = Class
                    .forName("org.eclipse.papyrus.infra.core.resource.sasheditor.SashModelProviderManager");

            Constructor<?> constr = sashModelProviderManagerClazz.getDeclaredConstructors()[0];
            constr.setAccessible(true);
            Object smpm = constr.newInstance(new Object[] { null });

            Method getter = sashModelProviderManagerClazz.getDeclaredMethod("getSashModelProvider",
                    new Class<?>[] { URI.class });
            getter.setAccessible(true);
            ISashModelProvider provider = (ISashModelProvider) getter.invoke(smpm,
                    new Object[] { editorInput.getURI() });

            if (provider instanceof CDOSashModelProvider) {
                ((CDOSashModelProvider) provider).initialize(getCDOCheckout());
            }

            URI sashModelURI = provider.getSashModelURI(editorInput.getURI());

            ResourceSet tempSet = new ResourceSetImpl();

            Resource r = tempSet.getResource(sashModelURI, true);
            r.getContents().clear();
            r.save(Collections.emptyMap());

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private void selectAppropriateModel(IEditorPart editorPart) throws PartInitException {
        try {
            ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
            EObject rootObject = getConcreteSyntaxModel().getRootElement();
            CDOObject rootObjectCDO = CDOUtil.getCDOObject(rootObject);
            final CDOID rootObjectID = rootObjectCDO.cdoID();
            IPageManager pageManager = servicesRegistry.getService(IPageManager.class);
            Optional<CDOObject> pagedElement = pageManager.allPages().stream().filter(p -> p instanceof EObject)
                    .map(p -> (EObject) p).map(CDOUtil::getCDOObject).filter(o -> rootObjectID.equals(o.cdoID()))
                    .findFirst();

            if (pagedElement.isPresent()) {
                pageManager.closeOtherPages(pagedElement.get());
                rootObject = pagedElement.get();
            }

            // enforce loading of primitive types
            ResourceSet rs = rootObject.eResource().getResourceSet();
            if (rs != null) {
                rs.getResource(UML_PRIMITIVE_TYPES_URI, true);
            } else {
                LOGGER.warn("The element about to be selected is not contained in a resource set.");
            }

            OpenElementService openElementService = servicesRegistry.getService(OpenElementService.class);
            openElementService.openElement(rootObject);
        } catch (ServiceException e) {
            throw new PartInitException("Could not select the correct diagram.", e);
        }
    }

    private void registerPostSaveListener(IEditorPart editorPart) throws PartInitException {
        try {
            ServicesRegistry servicesRegistry = getServicesRegistery(editorPart);
            SaveEventListener saveListener = new SaveEventListener(this::handleEditorSave);
            servicesRegistry.getService(ILifeCycleEventsProvider.class).addPostDoSaveListener(saveListener);
        } catch (ServiceException e) {
            throw new PartInitException("Could not add save listener.", e);
        }
    }

    private static ServicesRegistry getServicesRegistery(IEditorPart editorPart) throws ServiceException {
        return getServicesRegistery(editorPart, true);
    }

    private static ServicesRegistry getServicesRegistery(IEditorPart editorPart, boolean startOnDemand)
            throws ServiceException {
        ServicesRegistry servicesRegistry = editorPart.getAdapter(ServicesRegistry.class);
        if (servicesRegistry == null) {
            throw new ServiceException("Editor does not support service registry.");
        }
        if (startOnDemand) {
            servicesRegistry.startRegistry();
        }
        return servicesRegistry;
    }

    private IEditorInput createEditorInput() {
        EObject rootElement = getConcreteSyntaxModel().getRootElement();

        Resource r = createPlainResource(rootElement);
        if (rootElement.eResource() instanceof CDOResource) {
            r = createCDOResource(rootElement);
        }

        URI originalUri = r.getURI();
        String[] segments = originalUri.segments();
        String modelName = segments[segments.length - 1];
        String resourceExtension = originalUri.fileExtension();
        String plainName = modelName.replaceFirst("\\." + resourceExtension + "$", "");
        String launcherName = plainName + ".di";
        segments[segments.length - 1] = launcherName;
        URI uriToLaunch = URI.createHierarchicalURI(originalUri.scheme(), originalUri.authority(), originalUri.device(),
                segments, originalUri.query(), originalUri.fragment());
        return new CooperateURIEditorInput(uriToLaunch, getLauncherFile());
    }

    private static Resource createPlainResource(EObject rootElement) {
        return rootElement.eResource();
    }

    private Resource createCDOResource(EObject rootelement) {
        CDOResource cdoResource = (CDOResource) rootelement.eResource();
        return (CDOResource) getCDOView().getObject(cdoResource.cdoID());
    }

    /**
     * Finds an existing editor instance for the given launcher file. The found editor has the same type as the one that
     * would be launched for this file by this launcher.
     * 
     * @param launcherFile
     *            The launcher file associated with the wanted editor.
     * @return The found editor or {@link Optional#empty()} otherwise.
     * @throws IOException
     *             In case of an error while reading and interpreting the launcher file.
     * @throws ConcreteSyntaxTypeNotAvailableException
     *             Thrown, if the requested editor type is not available in the launcher file.
     */
    public static Optional<IEditorPart> findExistingEditor(IFile launcherFile)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        LauncherModelWrapper diagram = loadLauncherModelReadOnly(launcherFile);
        try {
            ConcreteSyntaxModel concreteSyntaxModel = diagram.getDiagram()
                    .getConcreteSyntaxModel(EditorType.GRAPHICAL.getSupportedSyntaxModel());
            URI ownURI = EcoreUtil.getURI(concreteSyntaxModel.getRootElement());
            return EditorFinderUtil.findEditor(EDITOR_ID_GRAPHICAL, i -> compareEditorInputs(ownURI, i));
        } finally {
            IOUtil.closeSilent(diagram);
        }
    }

    private static boolean compareEditorInputs(URI diagramURI, IEditorInput editorInput) {
        if (!(editorInput instanceof URIEditorInput)) {
            return false;
        }

        URIEditorInput uriInput = (URIEditorInput) editorInput;
        URI otherURI = uriInput.getURI();

        if (otherURI.scheme() == null || !otherURI.scheme().startsWith("cdo")) {
            return false;
        }

        return ArrayUtils.isEquals(diagramURI.segments(),
                otherURI.trimFileExtension().appendFileExtension("notation").segments());
    }

    @Override
    protected Optional<IPartListener2> createDisposeListener(IEditorPart editorPart) {
        if (editorPart instanceof CoreMultiDiagramEditor) {
            ((CoreMultiDiagramEditor) editorPart).onClose(() -> this.editorClosed(editorPart.getSite().getPage()));
        }
        return Optional.empty();
    }
}
