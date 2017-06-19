package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.xtext.ui.MarkerTypes;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.ui.validation.LanguageAwareMarkerTypeProvider;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;

/**
 * A annotation model listener that can handle issues in virtual Cooperate resources. The implementation delegates the
 * markers to a specified resource.
 */
public class CooperateAnnotationModelListener implements IResourceDelegatingAnnotationModelListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CooperateAnnotationModelListener.class);
    private static final Collection<String> AVAILABLE_MARKER_TYPES = getAvailableMarkerTypes();
    private final IFile associatedFile;

    @Inject
    private MarkerCreator markerCreator;

    @Inject
    private LanguageAwareMarkerTypeProvider markerTypeProvider;

    /**
     * Constructs the listener.
     * 
     * @param annotationFile
     *            The file to delegate the markers to.
     */
    public CooperateAnnotationModelListener(IFile annotationFile) {
        this.associatedFile = annotationFile;
    }

    @Override
    public void modelChanged(IAnnotationModel model) {
        deleteAllXtextMarkers();
        Iterators.filter(model.getAnnotationIterator(), XtextAnnotation.class)
                .forEachRemaining(this::createXtextAnnotationMarker);
    }

    @Override
    public void disconnect() {
        deleteAllXtextMarkers();
    }

    private void createXtextAnnotationMarker(XtextAnnotation annotation) {
        Issue xtextIssue = annotation.getIssue();
        String markerType = markerTypeProvider.getMarkerType(xtextIssue);
        try {
            markerCreator.createMarker(xtextIssue, associatedFile, markerType);
        } catch (CoreException e) {
            LOGGER.warn("Could not create marker on {}.", associatedFile, e);
        }
    }

    private void deleteAllXtextMarkers() {
        AVAILABLE_MARKER_TYPES.forEach(this::deleteMarkerQuietly);
    }

    private void deleteMarkerQuietly(String markerType) {
        try {
            associatedFile.deleteMarkers(markerType, true, IResource.DEPTH_INFINITE);
        } catch (CoreException e) {
            LOGGER.warn("Could not delete markers on {}.", associatedFile, e);
        }
    }

    private static Collection<String> getAvailableMarkerTypes() {
        return Collections.unmodifiableCollection(
                Arrays.asList(CheckType.values()).stream().map(MarkerTypes::forCheckType).collect(Collectors.toSet()));
    }

}
