package de.cooperate.modeling.graphical.papyrus.extensions;

import java.util.Collection;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.properties.contexts.Context;
import org.eclipse.papyrus.views.properties.runtime.ConfigurationManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activates the bundle.
 */
public class Activator extends AbstractUIPlugin {

    private static final String COOPERATE_DIAGRAMS_ARCHITECTURE = "resource/CooperateDiagrams.architecture";
    private static Plugin instance;

    public static Plugin getPluginInstance() {
        return instance;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        setInstance(this);
        registerCooperateViewpointExtension();
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

    private static void registerCooperateViewpointExtension() {
        String bundleName = Activator.getPluginInstance().getBundle().getSymbolicName();
        String pathName = String.format("/%s/%s", bundleName, COOPERATE_DIAGRAMS_ARCHITECTURE);
        URI architectureURI = URI.createPlatformPluginURI(pathName, true);
        PapyrusViewpointCustomizationHelper.mergeDiagramKinds(architectureURI);

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
