package de.cooperateproject.modeling.textual.xtext.runtime.editor;

/**
 * Listener for post save events.
 */
@FunctionalInterface
public interface IPostSaveListener {

    /**
     * Called by the subject after a save event has been happened and been processed.
     */
    public void saveEventHappened();

}
