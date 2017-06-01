package de.cooperate.modeling.graphical.papyrus.extensions;

import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusConfiguration;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusViewpoint;
import org.eclipse.papyrus.infra.viewpoints.iso42010.Stakeholder;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.WeightedConfiguration;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
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

}
