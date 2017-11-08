package de.cooperateproject.ui.commands;

import de.cooperateproject.ui.constants.UIConstants;

/**
 * Handler for merge requests originating from open editors.
 */
public class MergeEditorChangesHandler extends EditorNotifierHandlerBase {

    /**
     * Constructs the handler.
     */
    public MergeEditorChangesHandler() {
        super(UIConstants.PART_PROPERTY_KEY_MERGE_REQUEST);
    }

}
