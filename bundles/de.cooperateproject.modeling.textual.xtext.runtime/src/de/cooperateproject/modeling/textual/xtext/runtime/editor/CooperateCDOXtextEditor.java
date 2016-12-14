package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.google.common.collect.Sets;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.errorsignalization.ErrorSignalContext;
import de.cooperateproject.ui.preferences.PreferenceActivator;
import de.cooperateproject.ui.preferences.preferencepage.WorkbenchPreferenceErrorBeep;
import net.winklerweb.cdoxtext.runtime.CDOXtextEditor;

public class CooperateCDOXtextEditor extends CDOXtextEditor {

	private static class PostProcessorHandler implements SaveablePostProcessingSupport {

		private final Set<SavePostProcessor> processors = Sets.newHashSet();

		@Override
		public void register(SavePostProcessor postProcessor) {
			processors.add(postProcessor);
		}

		@Override
		public void unregister(SavePostProcessor postProcessor) {
			processors.remove(postProcessor);
		}

		private void executePostProcessors() throws Exception {
			for (SavePostProcessor processor : processors) {
				processor.processAfterSafe();
			}
		}

	}

	private final PostProcessorHandler postProcessorHandler = new PostProcessorHandler();
	private final ErrorSignalContext errorSignalContext = new ErrorSignalContext();

	@Override
	protected void handleCursorPositionChanged() {
		super.handleCursorPositionChanged();
		IXtextDocument document = getDocument();
		CooperateXtextDocument cooperateXtextDocument = document.getAdapter(CooperateXtextDocument.class);

		String signalType = PreferenceActivator.getDefault().getPreferenceStore()
				.getString(WorkbenchPreferenceErrorBeep.ERROR_BEEP_PREFERENCE_NAME);
		EList<Diagnostic> errors = cooperateXtextDocument.getResource().getErrors();

		errorSignalContext.createSignal(errors, getCursorPosition(), signalType);
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		IXtextDocument document = getDocument();
		CooperateXtextDocument cooperateXtextDocument = document.getAdapter(CooperateXtextDocument.class);
		IStatus status = scheduleValidation(cooperateXtextDocument);
		if (status.isOK()) {
			List<Diagnostic> errors = cooperateXtextDocument.getResource().getErrors();
			if (!errors.isEmpty()) {
				openErrorDialog("Save Error", "Can't save because of editor errors");
				return;
			}
			saveDocument(progressMonitor);
		} else if (status.matches(IStatus.CANCEL)) {
			openErrorDialog("Wait for validation", "Wait for Validation to finish before saving!");
			return;
		}
	}

	private void saveDocument(IProgressMonitor progressMonitor) {
		if (getDocument() != null) {
			saveAllAssociated(getDocument());
		}
		super.doSave(progressMonitor);
		try {
			postProcessorHandler.executePostProcessors();
		} catch (Exception e) {
			throw new RuntimeException("Error during post processing.", e);
		}
	}

	private IStatus scheduleValidation(CooperateXtextDocument cooperateXtextDocument) {
		Job validationJob = cooperateXtextDocument.getValidationJob();
		validationJob.schedule();
		try {
			validationJob.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return validationJob.getResult();
	}

	private void openErrorDialog(String title, String body) {
		MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(), title, null, body,
				MessageDialog.ERROR, new String[] { "OK" }, 0);
		dialog.open();
	}

	private void saveAllAssociated(IXtextDocument iXtextDocument) {
		CooperateXtextDocument cooperateXtextDocument = getDocument().getAdapter(CooperateXtextDocument.class);
		if (cooperateXtextDocument != null) {
			saveAllAssociated(cooperateXtextDocument);
		}
	}

	private void saveAllAssociated(CooperateXtextDocument document) {
		ResourceSet rs = document.getResource().getResourceSet();
		List<Resource> resourcesToBeSaved = rs.getResources().stream().filter(r -> r != document.getResource())
				.filter(r -> !r.isTrackingModification() || r.isModified()).collect(Collectors.toList());

		for (Resource r : resourcesToBeSaved) {
			try {
				r.save(Collections.emptyMap());
			} catch (IOException e) {
				throw new RuntimeException("Error during save of associated resources.", e);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class requestedClass) {
		if (SaveablePostProcessingSupport.class.isAssignableFrom(requestedClass)) {
			return postProcessorHandler;
		}
		return super.getAdapter(requestedClass);
	}

}
