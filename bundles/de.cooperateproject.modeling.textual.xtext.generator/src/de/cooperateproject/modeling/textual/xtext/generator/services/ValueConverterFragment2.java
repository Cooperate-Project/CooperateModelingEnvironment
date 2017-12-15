package de.cooperateproject.modeling.textual.xtext.generator.services;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TextFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;

@SuppressWarnings("restriction")
public class ValueConverterFragment2 extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Inject
    private Grammar grammar;

    @Inject
    private XtextGeneratorNaming naming;

    @Inject
    private FileAccessFactory fileAccessFactory;

    @Override
    public void generate() {
        generateValueConverter();
        registerGuiceBindingsRt();
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(IValueConverterService.class), getValueConverterName())
                .contributeTo(getLanguage().getRuntimeGenModule());

        Set<String> requiredBundles = getProjectConfig().getRuntime().getManifest().getRequiredBundles();

        requiredBundles.add("de.cooperateproject.modeling.textual.common;visibility:=reexport");
    }

    private void generateValueConverter() {
        TypeReference tr = getValueConverterName();
        TextFileAccess tfa = fileAccessFactory.createXtendFile(tr);
        ValueConverterGenerator generator = new ValueConverterGenerator();
        generator.create(tfa, tr.getSimpleName());
        tfa.writeTo(getProjectConfig().getRuntime().getSrc());
    }

    private TypeReference getValueConverterName() {
        return typeRef(naming.getRuntimeBasePackage(grammar) + ".services." + GrammarUtil.getSimpleName(grammar)
                + "ValueConverter");
    }

}
