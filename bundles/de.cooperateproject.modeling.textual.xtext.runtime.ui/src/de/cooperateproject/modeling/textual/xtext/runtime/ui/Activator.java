package de.cooperateproject.modeling.textual.xtext.runtime.ui;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * Activates the bundle.
 */
public class Activator extends Plugin {

    private static Plugin instance;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setInstance(this);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        super.stop(context);
        setInstance(null);
    }

    /**
     * Sets the active bundle instance.
     * 
     * @param instance
     *            The active bundle instance.
     */
    public static void setInstance(Plugin instance) {
        Activator.instance = instance;
    }

    /**
     * Gets the active bundle instance.
     * 
     * @return The active bundle instance;
     */
    public static Plugin getInstance() {
        return Activator.instance;
    }

}
