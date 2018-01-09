package de.cooperateproject.modeling.textual.xtext.generator.resources;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;

import de.cooperateproject.modeling.common.primitivetypes.DefaultUMLPrimitiveTypeFilter;
import de.cooperateproject.modeling.common.primitivetypes.IUMLPrimitiveTypeFilter;
import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.CooperateCDOXtextDocumentProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.ui.editor.CooperateXtextDocument;

/**
 * Generator fragment that initializes the resource-related tooling for Cooperate Xtext editors.
 */
@SuppressWarnings("restriction")
public class CooperateResourceHandlingBindingsFragment2 extends AbstractXtextGeneratorFragment
        implements TypeReferenceMixin {

    @Override
    public void generate() {
        registerGuiceBindingsUi();
        registerGuiceBindingsRt();
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(XtextResourceSet.class), typeRef(CooperateResourceSet.class))
                .addTypeToType(typeRef(IGlobalScopeProvider.class), typeRef(CooperateGlobalScopeProvider.class))
                .addTypeToType(typeRef(IGlobalScopeTypeQueryProvider.class),
                        typeRef(CooperateGlobalScopeProvider.class))
                .addTypeToType(typeRef(IUMLUriFinder.class), typeRef(ConventionalUMLUriFinder.class))
                .addTypeToType(typeRef(IUMLPrimitiveTypeFilter.class), typeRef(DefaultUMLPrimitiveTypeFilter.class))
                .contributeTo(getLanguage().getRuntimeGenModule());
        getProjectConfig().getRuntime().getManifest().getRequiredBundles()
                .add("de.cooperateproject.modeling.textual.xtext.runtime;visibility:=reexport");
    }

    private void registerGuiceBindingsUi() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(XtextDocument.class), typeRef(CooperateXtextDocument.class))
                .addTypeToType(typeRef(XtextDocumentProvider.class), typeRef(CooperateCDOXtextDocumentProvider.class))
                .addTypeToType(typeRef(IResourceSetProvider.class), typeRef(XtextLiveScopeResourceSetProvider.class))
                .contributeTo(getLanguage().getEclipsePluginGenModule());
        getProjectConfig().getEclipsePlugin().getManifest().getRequiredBundles()
                .add("de.cooperateproject.modeling.textual.xtext.runtime.ui");
    }

}
