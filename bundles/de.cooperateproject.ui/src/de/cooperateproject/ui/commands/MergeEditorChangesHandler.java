package de.cooperateproject.ui.commands;

import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.WorkbenchPart;

/**
 * Handler for merge requests originating from open editors.
 */
public class MergeEditorChangesHandler extends AbstractHandler {

    public static final String PART_PROPERTY_KEY = "COOPERATE_PERFORM_MERGE";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Optional.ofNullable(HandlerUtil.getActivePartChecked(event)).filter(WorkbenchPart.class::isInstance)
                .map(WorkbenchPart.class::cast).ifPresent(MergeEditorChangesHandler::notifyEditorAboutCommitRequest);
        return null;
    }

    private static void notifyEditorAboutCommitRequest(WorkbenchPart part) {
        part.setPartProperty(PART_PROPERTY_KEY, null);
        part.setPartProperty(PART_PROPERTY_KEY, Boolean.TRUE.toString());
    }

}
