package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput;
import net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider;
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateHandler;

/**
 * Customized document provider for Xtext documents in conjunction with CDO.
 * 
 * This provider correctly handles
 * <ul>
 * <li>annotation markers</li>
 * <li>document reinitialization</li>
 * </ul>
 */
public class CooperateCDOXtextDocumentProvider extends CDOXtextDocumentProvider
        implements IReinitializingDocumentProvider {

    private final Map<Object, IResourceDelegatingAnnotationModelListener> annotationModelListeners = Maps.newHashMap();
    private final IResourceDelegatingAnnotationModelListenerFactory listenerFactory;

    @Inject
    private ISerializer serializer;

    @Inject
    private ICDOResourceStateHandler resourceStateHandler;

    /**
     * Constructs the document provider.
     * 
     * @param injector
     *            The injector to be used with newly created elements. Will be injected.
     */
    @Inject
    public CooperateCDOXtextDocumentProvider(Injector injector) {
        listenerFactory = createListenerFactory(injector);
    }

    @Override
    public void reinitializeDocumentContent(IDocument document, EObject rootElement) {
        resourceStateHandler.cleanState(rootElement);
        resourceStateHandler.initState(rootElement);
        resourceStateHandler.calculateState(rootElement);
        document.set(serializer.serialize(rootElement));
    }

    @Override
    public IAnnotationModel createAnnotationModel(Object element) {
        IAnnotationModel annotationModel = super.createAnnotationModel(element);
        IAnnotationModelListener listener = annotationModelListeners.get(element);
        if (listener != null) {
            annotationModel.addAnnotationModelListener(listener);
        }
        return annotationModel;
    }

    @Override
    protected ElementInfo createElementInfo(Object element) throws CoreException {
        if (element instanceof CooperateCDOLobEditorInput) {
            IFile f = ((CooperateCDOLobEditorInput) element).getAssociatedLauncherFile();
            IResourceDelegatingAnnotationModelListener listener = listenerFactory.create(f);
            annotationModelListeners.put(element, listener);
        }
        return super.createElementInfo(element);
    }

    @Override
    protected void disposeElementInfo(Object element, ElementInfo info) {
        IResourceDelegatingAnnotationModelListener listener = annotationModelListeners.get(element);
        if (listener != null) {
            listener.disconnect();
            IAnnotationModel annotationModel = getAnnotationModel(element);
            if (annotationModel != null) {
                annotationModel.removeAnnotationModelListener(listener);
            }
        }
        super.disposeElementInfo(element, info);
    }

    private static IResourceDelegatingAnnotationModelListenerFactory createListenerFactory(Injector injector) {
        return delegationTarget -> {
            IResourceDelegatingAnnotationModelListener listener = new CooperateAnnotationModelListener(
                    delegationTarget);
            injector.injectMembers(listener);
            return listener;
        };

    }

    @Override
    public boolean setNotDirty(IEditorInput editorInput) {
        ElementInfo info = getElementInfo(editorInput);
        if (info != null) {
            info.fCanBeSaved = false;
            fireElementDirtyStateChanged(info.fElement, info.fCanBeSaved);
            return true;
        }
        return false;
    }

}
