package de.cooperateproject.modeling.transformation.common;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class Activator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cooperateproject.modeling.transformation.common";

    // The shared instance
    private static Activator plugin;

    private ServiceTracker<IQVTOResourceProvider, IQVTOResourceProvider> qvtoResourceProvider;

    /**
     * The constructor
     */
    public Activator() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
     * BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setPlugin(this);
        qvtoResourceProvider = new ServiceTracker<>(context, IQVTOResourceProvider.class, null);
        qvtoResourceProvider.open();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
     * BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        qvtoResourceProvider.close();
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

    public IQVTOResourceProvider getQVTOResourceProvider() {
        return qvtoResourceProvider.getService();
    }

}
