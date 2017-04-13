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

import de.cooperateproject.modeling.textual.common.scoping.ConventionalUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextDocumentProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateXtextDocument;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.resources.CooperateResourceSet;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.DefaultUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLPrimitiveTypeSelector;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.CooperateAutomatedValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

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
        generateAutomatedIssueResolutionFactoryBase();
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
                .addTypeToType(typeRef(IIssueCodeRegistry.class), typeRef(IssueCodeRegistry.class))
                .addTypeToType(typeRef(ICooperateAutomatedValidator.class), typeRef(CooperateAutomatedValidator.class))
                .addTypeToType(typeRef(IAutomatedIssueResolutionFactoryRegistry.class),
                        typeRef(AutomatedIssueResolutionFactoryRegistry.class))
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

    private void generateIAutomatedIssueResolutionProvider() {
        JavaFileAccess jva = fileAccessFactory.createJavaFile(typeRef(getAutomatedIssueResolutionProviderName()));
        AutomatedIssueResolutionProviderGenerator generator = new AutomatedIssueResolutionProviderGenerator(naming,
                grammar);
        generator.create(jva, getAutomatedIssueResolutionProviderSimpleName());
        jva.writeTo(getProjectConfig().getRuntime().getSrc());
        getProjectConfig().getRuntime().getManifest().getExportedPackages().add(getIssuesPackageName());
    }

    private void generateAutomatedIssueResolutionFactoryBase() {
        TypeReference tr = typeRef(getAutomatedIssueResolutionFactoryBaseName());
        JavaFileAccess jva = fileAccessFactory.createJavaFile(tr);
        AutomatedIssueResolutionFactoryBaseGenerator generator = new AutomatedIssueResolutionFactoryBaseGenerator(
                naming, grammar);
        generator.create(jva, tr.getSimpleName());
        jva.writeTo(getProjectConfig().getRuntime().getSrc());
        getProjectConfig().getRuntime().getManifest().getExportedPackages().add(getIssuesPackageName());
    }

    private String getAutomatedIssueResolutionFactoryBaseName() {
        return getIssuesPackageName() + "." + GrammarUtil.getSimpleName(grammar)
                + "AutomatedIssueResolutionFactoryBase";
    }

    private String getAutomatedIssueResolutionProviderName() {
        return getIssuesPackageName() + "." + getAutomatedIssueResolutionProviderSimpleName();
    }

    private String getIssuesPackageName() {
        return naming.getRuntimeBasePackage(grammar) + ".issues";
    }

    private String getAutomatedIssueResolutionProviderSimpleName() {
        return GrammarUtil.getSimpleName(grammar) + "AutomatedIssueResolutionProvider";
    }
}
