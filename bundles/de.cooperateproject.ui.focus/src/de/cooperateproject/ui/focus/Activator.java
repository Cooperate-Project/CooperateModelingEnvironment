package de.cooperateproject.ui.focus;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import de.cooperateproject.modeling.cdo.focustransfer.IFocusTransferManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    public static final String PLUGIN_ID = "de.cooperateproject.ui.focus";
    private static Activator instance;
    private IFocusTransferManager focusTransferManager;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setInstance(this);

        ServiceReference<IFocusTransferManager> focusTransferManagerReference = context
                .getServiceReference(IFocusTransferManager.class);
        this.focusTransferManager = context.getService(focusTransferManagerReference);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        setInstance(null);
        super.stop(context);
    }

    public IFocusTransferManager getFocusTransferManager() {
        return focusTransferManager;
    }

    private static void setInstance(Activator instance) {
        Activator.instance = instance;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return instance;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path
     *
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
}
