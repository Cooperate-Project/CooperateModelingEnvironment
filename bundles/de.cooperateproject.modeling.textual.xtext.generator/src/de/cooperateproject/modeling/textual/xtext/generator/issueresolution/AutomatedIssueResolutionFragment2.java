package de.cooperateproject.modeling.textual.xtext.generator.issueresolution;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.AutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.CooperateAutomatedValidator;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

@SuppressWarnings("restriction")
public class AutomatedIssueResolutionFragment2 extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Inject
    private Grammar grammar;

    @Inject
    private XtextGeneratorNaming naming;

    @Inject
    private FileAccessFactory fileAccessFactory;

    @Override
    public void generate() {
        generateIAutomatedIssueResolutionProvider();
        generateAutomatedIssueResolutionFactoryBase();
        registerGuiceBindingsRt();
    }

    private void registerGuiceBindingsRt() {
        // TODO Move stuff not related to resources to a new fragment
        new GuiceModuleAccess.BindingFactory()
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
