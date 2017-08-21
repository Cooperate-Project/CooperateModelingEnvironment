package de.cooperateproject.modeling.textual.xtext.runtime.ui.quickfix;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.quickfix.MarkerResolutionGenerator;

import de.cooperateproject.modeling.common.editorInput.ILauncherFileEditorInput;
import de.cooperateproject.ui.util.editor.EditorFinderUtil;

/**
 * Marker generator that finds editors that match a resource by comparing the launcher files.
 */
public class CooperateMarkerResolutionGenerator extends MarkerResolutionGenerator {

    @Override
    public XtextEditor getEditor(IResource resource) {
        Collection<XtextEditor> editorCandidates = EditorFinderUtil
                .findEditor(input -> CooperateMarkerResolutionGenerator.isMatchingEditorInput(resource, input)).stream()
                .filter(XtextEditor.class::isInstance).map(XtextEditor.class::cast).collect(Collectors.toList());
        if (editorCandidates.size() != 1) {
            return super.getEditor(resource);
        }
        return editorCandidates.iterator().next();
    }

    private static final boolean isMatchingEditorInput(IResource resource, IEditorInput input) {
        Optional<ILauncherFileEditorInput> typedEditorInput = Optional.ofNullable(input)
                .map(i -> i.getAdapter(ILauncherFileEditorInput.class));
        return typedEditorInput.map(i -> i.getAssociatedLauncherFile().equals(resource)).orElse(false);

    }

}
