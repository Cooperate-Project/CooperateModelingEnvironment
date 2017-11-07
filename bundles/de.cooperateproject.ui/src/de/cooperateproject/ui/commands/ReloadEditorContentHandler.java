package de.cooperateproject.ui.commands;

import de.cooperateproject.ui.constants.UIConstants;

/**
 * Handler for reload requests originating from open editors.
 */
public class ReloadEditorContentHandler extends EditorNotifierHandlerBase {

    /**
     * Constructs the handler.
     */
    public ReloadEditorContentHandler() {
        super(UIConstants.PART_PROPERTY_KEY_RELOAD_REQUEST);
    }

}
