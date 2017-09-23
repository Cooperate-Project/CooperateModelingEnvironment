package de.cooperateproject.modeling.transformation.usecase;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class UsecaseActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cooperateproject.modeling.transformation.usecase";

	// The shared instance
	private static UsecaseActivator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		setPluginInstance(this);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		setPluginInstance(null);
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static UsecaseActivator getDefault() {
		return plugin;
	}
	
	private static void setPluginInstance(UsecaseActivator instance) {
		plugin = instance;
	}

}
