package de.cooperateproject.modeling.textual.cls;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
		
		private static Activator INSTANCE;
		
		/**
		 * The constructor
		 */
		public Activator() {
			super();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		public void start(BundleContext context) throws Exception {
			super.start(context);
			INSTANCE = this;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		public void stop(BundleContext context) throws Exception {
			INSTANCE = null;
			super.stop(context);
		}
		
		public static Activator getInstance() {
			return INSTANCE;
		}

}
