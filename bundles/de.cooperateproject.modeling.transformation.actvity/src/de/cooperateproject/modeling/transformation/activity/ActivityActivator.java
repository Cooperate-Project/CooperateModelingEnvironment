package de.cooperateproject.modeling.transformation.activity;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ActivityActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cooperateproject.modeling.transformation.activity";

	// The shared instance
	private static ActivityActivator plugin;

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
	public static ActivityActivator getDefault() {
		return plugin;
	}

	private static void setPluginInstance(ActivityActivator instance) {
		plugin = instance;
	}

}