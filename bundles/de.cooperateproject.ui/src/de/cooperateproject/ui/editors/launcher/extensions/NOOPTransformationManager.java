package de.cooperateproject.ui.editors.launcher.extensions;

import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.ui.IEditorInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;

/**
 * Implementation of {@link ITransformationManager} that does nothing.
 */
public class NOOPTransformationManager implements ITransformationManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(NOOPTransformationManager.class);

    @Override
    public void handleEditorSave(IEditorInput editorInput) throws TransformationException {
        logCall();
    }

    @Override
    public void handleEditorMerge(String commitMessage) throws CommitException {
        logCall();
    }

    @Override
    public boolean isMergeNecessary() {
        logCall();
        return false;
    }

    private static void logCall() {
        LOGGER.info("Action on {} requested. Ignoring request.", NOOPTransformationManager.class.getSimpleName());
    }
}
