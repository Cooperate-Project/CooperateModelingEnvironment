package de.cooperateproject.modeling.textual.xtext.generator.resources;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextDocumentProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateXtextDocument;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.DefaultUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

@SuppressWarnings("restriction")
public class CooperateResourceHandlingBindingsFragment2 extends AbstractXtextGeneratorFragment {

    @Inject
    Grammar grammar;

    @Inject
    XtextGeneratorNaming naming;

    @Inject
    FileAccessFactory fileAccessFactory;

    @Override
    public void generate() {
        registerGuiceBindingsUi();
        registerGuiceBindingsRt();
        generateIAutomatedIssueResolutionProvider();
    }

    private static TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

    private static TypeReference typeRef(String fqn) {
        return TypeReference.typeRef(fqn);
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(XtextResourceSet.class), typeRef(CooperateResourceSet.class))
                .addTypeToType(typeRef(IGlobalScopeProvider.class), typeRef(CooperateGlobalScopeProvider.class))
                .addTypeToType(typeRef(IUMLUriFinder.class), typeRef(ConventionalUMLUriFinder.class))
                .addTypeToType(typeRef(IUMLPrimitiveTypeSelector.class), typeRef(DefaultUMLPrimitiveTypeSelector.class))
                .addTypeToType(typeRef(IAutomatedIssueResolutionProvider.class),
                        typeRef(getAutomatedIssueResolutionProviderName()))
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

    private void generateIAutomatedIssueResolutionProvider() {
        JavaFileAccess jva = fileAccessFactory.createJavaFile(typeRef(getAutomatedIssueResolutionProviderName()));
        AutomatedIssueResolutionProviderGenerator.create(jva, getAutomatedIssueResolutionProviderPackageName(),
                getAutomatedIssueResolutionProviderSimpleName());
        jva.writeTo(getProjectConfig().getRuntime().getSrc());
        getProjectConfig().getRuntime().getManifest().getExportedPackages()
                .add(getAutomatedIssueResolutionProviderPackageName());
    }

    private String getAutomatedIssueResolutionProviderName() {
        return getAutomatedIssueResolutionProviderPackageName() + "." + getAutomatedIssueResolutionProviderSimpleName();
    }

    private String getAutomatedIssueResolutionProviderPackageName() {
        return naming.getRuntimeBasePackage(grammar) + ".issues";
    }

    private String getAutomatedIssueResolutionProviderSimpleName() {
        return GrammarUtil.getSimpleName(grammar) + "AutomatedIssueResolutionProvider";
    }
}
