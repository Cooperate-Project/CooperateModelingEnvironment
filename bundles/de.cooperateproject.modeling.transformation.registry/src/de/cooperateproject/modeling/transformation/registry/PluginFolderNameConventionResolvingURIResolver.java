package de.cooperateproject.modeling.transformation.registry;

import de.cooperateproject.modeling.transformation.common.registry.NameConventionPlatformURIResolver;

public class PluginFolderNameConventionResolvingURIResolver extends NameConventionPlatformURIResolver {

    public PluginFolderNameConventionResolvingURIResolver(String pluginname, String foldername) {
        
        super(String.format("%s/%s", pluginname.replace("/", ""), foldername));
    }

}
