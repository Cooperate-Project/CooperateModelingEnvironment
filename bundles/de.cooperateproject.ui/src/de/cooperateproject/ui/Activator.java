package de.cooperateproject.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import de.cooperateproject.modeling.cdo.commithistory.ICommitHistoryManager;
import de.cooperateproject.modeling.transformation.common.ITransformationExecutor;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cooperateproject.ui"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    private ITransformationExecutor transformationExecutor;

    private ICommitHistoryManager commitHistoryManager;

    /**
     * The constructor
     */
    public Activator() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setPlugin(this);

        ServiceReference<ITransformationExecutor> transEx = context.getServiceReference(ITransformationExecutor.class);
        this.transformationExecutor = context.getService(transEx);

        ServiceReference<ICommitHistoryManager> comHistMan = context.getServiceReference(ICommitHistoryManager.class);
        this.commitHistoryManager = context.getService(comHistMan);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
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

    public ITransformationExecutor getTransformationExecutor() {
        return this.transformationExecutor;
    }

    public ICommitHistoryManager getCommitHistoryManager() {
        return this.commitHistoryManager;
    }

}
