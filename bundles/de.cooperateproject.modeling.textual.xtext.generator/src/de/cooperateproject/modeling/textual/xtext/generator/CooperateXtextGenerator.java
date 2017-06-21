package de.cooperateproject.modeling.textual.xtext.generator;

import javax.inject.Inject;

import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.xtext.generator.XtextGenerator;
import org.eclipse.xtext.xtext.generator.model.project.BundleProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig;

/**
 * Customized version of Xtext generator that allows changing how things are generated.
 */
@SuppressWarnings("restriction")
@Log
public class CooperateXtextGenerator extends XtextGenerator {

    @Inject
    private IXtextProjectConfig projectConfig;

    @Inject
    private CooperateXtextGeneratorTemplates templates;

    @Override
    protected void generateActivator() {
        if (projectConfig.getEclipsePlugin().getSrcGen() != null && !getLanguageConfigs().isEmpty()) {
            templates.createEclipsePluginActivator(getLanguageConfigs())
                    .writeTo(projectConfig.getEclipsePlugin().getSrcGen());
        }
    }

    @Override
    protected void generateManifests() {
        projectConfig.getEnabledProjects().stream().filter(BundleProjectConfig.class::isInstance)
                .map(BundleProjectConfig.class::cast).map(BundleProjectConfig::getManifest)
                .forEach(m -> m.getImportedPackages().remove("org.apache.log4j"));
        super.generateManifests();
    }

}
