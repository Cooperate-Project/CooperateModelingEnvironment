package de.cooperateproject.modeling.textual.cls;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

import de.cooperateproject.modeling.textual.cls.formatting2.AbstractClsFormatter;
import de.cooperateproject.modeling.textual.cls.formatting2.FormatterRegistry;

public class Activator extends AbstractUIPlugin {
	
		private static final String CLS_UI_PLUGIN_ID = "de.cooperateproject.modeling.textual.cls.ui";
		
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
		
		public AbstractClsFormatter getFormatter() {			
			IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, CLS_UI_PLUGIN_ID);
			String choosenFormatterName = store.getString("CHOICE");
			
			return FormatterRegistry.getInstance().getFormatter(choosenFormatterName);
		}
}
