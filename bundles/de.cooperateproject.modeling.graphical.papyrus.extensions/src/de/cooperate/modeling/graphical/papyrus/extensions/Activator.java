package de.cooperate.modeling.graphical.papyrus.extensions;

import java.util.Collection;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.papyrus.infra.properties.contexts.Context;
import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activates the bundle.
 */
public class Activator extends AbstractUIPlugin {

    private static Plugin instance;

    public static Plugin getPluginInstance() {
        return instance;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setInstance(this);
        enableCooperatePropertyContext();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        setInstance(null);
        super.stop(context);
    }

    private static void setInstance(Plugin instance) {
        Activator.instance = instance;
    }

    public static void enableCooperatePropertyContext() {
        Collection<Context> contexts = ConfigurationManager.getInstance().getCustomizableContexts();
        contexts.forEach(ctx -> {
            if (!"CooperateProperties".equals(ctx.getName())) {
                ConfigurationManager.getInstance().disableContext(ctx, true);
            } else {
                ConfigurationManager.getInstance().enableContext(ctx, true);
            }
        });
    }

}
