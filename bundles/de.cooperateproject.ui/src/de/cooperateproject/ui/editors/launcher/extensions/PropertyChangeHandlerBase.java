package de.cooperateproject.ui.editors.launcher.extensions;

import java.util.Optional;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Base class for handlers of editor based property changes.
 * 
 * This handler only reacts on new values that are not null.
 */
public abstract class PropertyChangeHandlerBase implements IPropertyChangeListener {

    private final String key;

    /**
     * Constructs the handler.
     * 
     * @param key
     *            The key of the changed property to listen to.
     */
    public PropertyChangeHandlerBase(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    protected abstract void handleChange(IWorkbenchPart source, String oldValue, String newValue);

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (!key.equals(event.getProperty())) {
            return;
        }

        Object oldValuePlain = event.getOldValue();
        Object newValuePlain = event.getNewValue();
        if (!isValid(oldValuePlain) || !isValid(newValuePlain)) {
            return;
        }

        Object source = event.getSource();
        if (!(source instanceof IWorkbenchPart)) {
            return;
        }

        handleChange((IWorkbenchPart) source, (String) oldValuePlain, (String) newValuePlain);
    }

    private static boolean isValid(Object value) {
        return value == null || Optional.ofNullable(value).filter(String.class::isInstance).isPresent();
    }

}
