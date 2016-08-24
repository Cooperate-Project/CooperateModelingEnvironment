package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelListener;

import com.google.common.collect.Maps;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.input.CooperateCDOLobEditorInput;
import net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider;

public class CooperateCDOXtextDocumentProvider extends CDOXtextDocumentProvider {

	private final Map<Object, CooperateAnnotationModelListener> annotationModelListeners = Maps.newHashMap();

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
			IFile f = ((CooperateCDOLobEditorInput)element).getAssociatedLauncherFile();
			CooperateAnnotationModelListener listener = new CooperateAnnotationModelListener(f);
			annotationModelListeners.put(element, listener);
		}
		return super.createElementInfo(element);
	}

	@Override
	protected void disposeElementInfo(Object element, ElementInfo info) {
		CooperateAnnotationModelListener listener = annotationModelListeners.get(element);
		if (listener != null) {
			listener.disconnect();
			IAnnotationModel annotationModel = getAnnotationModel(element);
			if (annotationModel != null) {
				annotationModel.removeAnnotationModelListener(listener);
			}
		}
		super.disposeElementInfo(element, info);
	}

}
