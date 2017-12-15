package de.cooperateproject.modeling.textual.xtext.generator.templates;

import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;

import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.templates.CooperateTemplateProposalProvider;

@SuppressWarnings("restriction")
public class TemplateFragment2 extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Override
    public void generate() {
        registerGuiceBindingsUi();
    }

    private void registerGuiceBindingsUi() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(DefaultTemplateProposalProvider.class),
                        typeRef(CooperateTemplateProposalProvider.class))
                .contributeTo(getLanguage().getEclipsePluginGenModule());
        getProjectConfig().getEclipsePlugin().getManifest().getRequiredBundles()
                .add("de.cooperateproject.modeling.textual.xtext.runtime.ui");
    }

}
