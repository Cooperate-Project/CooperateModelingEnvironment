package de.cooperateproject.modeling.transformation.registry;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import de.cooperateproject.modeling.transformation.common.impl.TransformationContextBuilder;

public class Activator extends Plugin {
    // The shared instance
    private static Activator plugin;
    private BundleContext context;

    /**
     * The constructor
     */
    public Activator() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework. BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setPlugin(this);
        this.context = context;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework. BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        this.context = null;
        setPlugin(null);
        super.stop(context);
    }

    private static void setPlugin(Activator plugin) {
        Activator.plugin = plugin;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public TransformationContextBuilder getContextBuilder() {
        return (new OSGiServiceAwareTransformationContextBuilder()).processBundleContext(this.context);
    }

}
