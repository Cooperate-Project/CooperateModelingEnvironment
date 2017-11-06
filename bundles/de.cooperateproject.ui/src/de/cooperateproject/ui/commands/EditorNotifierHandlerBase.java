package de.cooperateproject.ui.commands;

import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.WorkbenchPart;

/**
 * Base class for editor based notifiers.
 */
public abstract class EditorNotifierHandlerBase extends AbstractHandler {

    private final String key;

    /**
     * Constructs the handler.
     * 
     * @param key
     *            The property key to listen for.
     */
    public EditorNotifierHandlerBase(String key) {
        this.key = key;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Optional.ofNullable(HandlerUtil.getActivePartChecked(event)).filter(WorkbenchPart.class::isInstance)
                .map(WorkbenchPart.class::cast).ifPresent(this::notifyEditorAboutRequest);
        return null;
    }

    private void notifyEditorAboutRequest(WorkbenchPart part) {
        part.setPartProperty(key, null);
        part.setPartProperty(key, Boolean.TRUE.toString());
    }

}
