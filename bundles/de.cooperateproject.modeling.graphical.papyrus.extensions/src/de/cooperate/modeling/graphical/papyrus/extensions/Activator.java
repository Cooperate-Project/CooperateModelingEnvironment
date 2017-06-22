package de.cooperate.modeling.graphical.papyrus.extensions;

import java.util.Collection;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.papyrus.infra.properties.contexts.Context;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint;
import org.eclipse.papyrus.infra.viewpoints.iso42010.Stakeholder;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.WeightedConfiguration;
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
        registerCooperateConfiguration();
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

    private static void registerCooperateConfiguration() {
        WeightedConfiguration weightedConfig = WeightedConfiguration.getTopConfiguration();
        if (null != weightedConfig) {
            PapyrusConfiguration config = weightedConfig.getConfiguration();
            Stakeholder stakeholder = config.getStakeholders().stream()
                    .filter(sh -> "Cooperate Modeler".equals(sh.getName())).findFirst()
                    .orElse(PolicyChecker.getCurrent().getStakeholder());
            PapyrusViewpoint viewpoint = (PapyrusViewpoint) stakeholder.getViewpoints().stream()
                    .filter(v -> "Cooperate Viewpoint".equals(v.getName())).findFirst()
                    .orElse(PolicyChecker.getCurrent().getViewpoint());
            PolicyChecker newPolicy = new PolicyChecker(config, viewpoint, false);
            PolicyChecker.setCurrent(newPolicy);
        }
    }

    public static void enableCooperatePropertyContext() {
        Collection<Context> contexts = ConfigurationManager.getInstance().getContexts();
        contexts.forEach(ctx -> {
            if (!"CooperateProperties".equals(ctx.getName())) {
                ConfigurationManager.getInstance().disableContext(ctx, true);
            } else {
                ConfigurationManager.getInstance().enableContext(ctx, true);
            }
        });
    }

}
