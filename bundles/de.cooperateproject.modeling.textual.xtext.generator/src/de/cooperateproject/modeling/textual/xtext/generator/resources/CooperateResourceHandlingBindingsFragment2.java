package de.cooperateproject.modeling.textual.xtext.generator.resources;

import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextDocumentProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateXtextDocument;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

@SuppressWarnings("restriction")
public class CooperateResourceHandlingBindingsFragment2 extends AbstractXtextGeneratorFragment {

    @Override
    public void generate() {
        registerGuiceBindingsUi();
        registerGuiceBindingsRt();
    }

    private static TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(XtextResourceSet.class), typeRef(CooperateResourceSet.class))
                .addTypeToType(typeRef(IGlobalScopeProvider.class), typeRef(CooperateGlobalScopeProvider.class))
                .addTypeToType(typeRef(IUMLUriFinder.class), typeRef(ConventionalUMLUriFinder.class))
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
    }

}
