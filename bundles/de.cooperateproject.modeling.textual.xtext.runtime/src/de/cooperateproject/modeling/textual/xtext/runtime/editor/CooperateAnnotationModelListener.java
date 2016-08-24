package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelListener;
import org.eclipse.xtext.ui.MarkerTypes;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.ui.validation.MarkerTypeProvider;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Iterators;

public class CooperateAnnotationModelListener implements IAnnotationModelListener {

	private static final Logger LOGGER = Logger.getLogger(CooperateAnnotationModelListener.class);
	private static final MarkerCreator MARKER_CREATOR = new MarkerCreator();
	private static final MarkerTypeProvider MARKER_TYPE_PROVIDER = new MarkerTypeProvider();
	private static final Collection<String> AVAILABLE_MARKER_TYPES = getAvailableMarkerTypes();
	private final IFile associatedFile;

	public CooperateAnnotationModelListener(IFile annotationFile) {
		this.associatedFile = annotationFile;
	}

	@Override
	public void modelChanged(IAnnotationModel model) {
		deleteAllXtextMarkers();
		Iterators.filter(model.getAnnotationIterator(), XtextAnnotation.class)
				.forEachRemaining(this::createXtextAnnotationMarker);
	}
	
	public void disconnect() {
		deleteAllXtextMarkers();
	}

	private void createXtextAnnotationMarker(XtextAnnotation annotation) {
		Issue xtextIssue = annotation.getIssue();
		String markerType = MARKER_TYPE_PROVIDER.getMarkerType(xtextIssue);
		try {
			MARKER_CREATOR.createMarker(xtextIssue, associatedFile, markerType);
		} catch (CoreException e) {
			LOGGER.warn(String.format("Could not create marker on %s.", associatedFile), e);
		}
	}

	private void deleteAllXtextMarkers() {
		AVAILABLE_MARKER_TYPES.forEach(this::deleteMarkerQuietly);
	}

	private void deleteMarkerQuietly(String markerType) {
		try {
			associatedFile.deleteMarkers(markerType, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			LOGGER.warn(String.format("Could not delete markers on %s.", associatedFile), e);
		}
	}

	private static Collection<String> getAvailableMarkerTypes() {
		return Collections.unmodifiableCollection(Arrays.asList(CheckType.values()).stream()
				.map(t -> MarkerTypes.forCheckType(t)).collect(Collectors.toSet()));
	}

}
