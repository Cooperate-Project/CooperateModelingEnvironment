package de.cooperateproject.modeling.textual.xtext.generator.derivedstate;

import java.util.Set;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.services.BasicCooperateTransientValueService;
import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DefaultDerivedStateComputer;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.InitializingStateAwareResource;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.DelegatingTransientStatusProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.ITransientStatusProvider;
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateHandler;

@SuppressWarnings("restriction")
public class DerivedStateCalculationFragment2 extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Inject
    private Grammar grammar;

    @Inject
    private XtextGeneratorNaming naming;

    @Inject
    private FileAccessFactory fileAccessFactory;

    @Override
    public void generate() {
        generateDerivedStateElementComparator();
        registerGuiceBindingsRt();
    }

    private void generateDerivedStateElementComparator() {
        TypeReference tr = getDerivedStateElementComparatorName();
        JavaFileAccess jva = fileAccessFactory.createJavaFile(tr);
        DerivedStateElementComparatorGenerator generator = new DerivedStateElementComparatorGenerator();
        generator.create(jva, tr.getSimpleName());
        jva.writeTo(getProjectConfig().getRuntime().getSrc());
    }

    private TypeReference getDerivedStateElementComparatorName() {
        return typeRef(naming.getRuntimeBasePackage(grammar) + ".derivedstate.calculator."
                + GrammarUtil.getSimpleName(grammar) + "DerivedStateElementComparator");
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(IAtomicDerivedStateProcessorRegistry.class),
                        typeRef(AtomicDerivedStateProcessorRegistry.class))
                .addTypeToType(typeRef(IDerivedStateProcessor.class), typeRef(DerivedStateProcessor.class))
                .addTypeToType(typeRef(ICDOResourceStateHandler.class), typeRef(DerivedStateProcessor.class))
                .addTypeToType(typeRef(IDerivedStateComputer.class), typeRef(DefaultDerivedStateComputer.class))
                .addTypeToType(typeRef(IDerivedStateComputerSorter.class), getDerivedStateElementComparatorName())

                .addTypeToType(typeRef(ITransientStatusProvider.class),
                        typeRef(DelegatingTransientStatusProvider.class))
                .addTypeToType(typeRef(ITransientValueService.class),
                        typeRef(BasicCooperateTransientValueService.class))
                .addConfiguredBinding(ITransientValueService.class.getSimpleName(), new StringConcatenationClient() {
                    @Override
                    protected void appendTo(StringConcatenationClient.TargetStringConcatenation builder) {
                        builder.append("binder.bind(");
                        builder.append(org.eclipse.xtext.serializer.sequencer.ITransientValueService.class.getName());
                        builder.append(".class).to(");
                        builder.append(BasicCooperateTransientValueService.class.getName());
                        builder.append(".class);");
                    }
                })

                .addTypeToType(typeRef(XtextResource.class), typeRef(InitializingStateAwareResource.class))
                .addTypeToType(typeRef(IResourceDescription.Manager.class),
                        typeRef(DerivedStateAwareResourceDescriptionManager.class))
                .contributeTo(getLanguage().getRuntimeGenModule());

        Set<String> requiredBundles = getProjectConfig().getRuntime().getManifest().getRequiredBundles();

        requiredBundles.add("de.cooperateproject.modeling.textual.xtext.runtime;visibility:=reexport");
        requiredBundles.add("de.cooperateproject.modeling.textual.common;visibility:=reexport");
    }

}
