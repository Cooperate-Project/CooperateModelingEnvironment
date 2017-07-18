package de.cooperateproject.modeling.textual.xtext.runtime.editor;

/**
 * Interface for elements that support, i.e. notify {@link IPostSaveListener} elements.
 */
public interface IPostSaveListenerSupport {
    /**
     * Registers a listener.
     * 
     * @param listener
     *            The listener to register.
     */
    public void register(IPostSaveListener listener);

    /**
     * Unregisters a listener.
     * 
     * @param listener
     *            The listener to unregister.
     */
    public void unregister(IPostSaveListener listener);

}
