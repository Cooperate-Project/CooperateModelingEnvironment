package de.cooperateproject.modeling.textual.xtext.generator.outline;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;

import com.google.inject.name.Names;

import de.cooperateproject.modeling.textual.common.outline.FlatOutlineViewContribution;
import de.cooperateproject.modeling.textual.common.outline.OutlineFlattenFilterAndSorter;
import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;

@SuppressWarnings("restriction")
public class OutlineFragment2 extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Override
    public void generate() {
        registerGuiceBindingsUi();
    }

    private void registerGuiceBindingsUi() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(OutlineFilterAndSorter.class), typeRef(OutlineFlattenFilterAndSorter.class))
                .addConfiguredBinding("ToggleOutlineViewContribution", new StringConcatenationClient() {
                    @Override
                    protected void appendTo(TargetStringConcatenation target) {
                        target.append("binder.bind(");
                        target.append(typeRef(IOutlineContribution.class));
                        target.append(".class).annotatedWith(");
                        target.append(typeRef(Names.class));
                        target.append(".named(\"ToogleOutlineView\")).to(");
                        target.append(typeRef(FlatOutlineViewContribution.class));
                        target.append(".class);");
                    }
                }).contributeTo(getLanguage().getEclipsePluginGenModule());
        getProjectConfig().getEclipsePlugin().getManifest().getRequiredBundles()
                .add("de.cooperateproject.modeling.textual.common");
    }

}
