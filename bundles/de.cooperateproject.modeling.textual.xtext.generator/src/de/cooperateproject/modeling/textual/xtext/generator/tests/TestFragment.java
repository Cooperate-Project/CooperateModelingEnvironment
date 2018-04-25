package de.cooperateproject.modeling.textual.xtext.generator.tests;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.xtext.generator.util.TypeReferenceMixin;

@SuppressWarnings("restriction")
public class TestFragment extends AbstractXtextGeneratorFragment implements TypeReferenceMixin {

    @Inject
    private Grammar grammar;

    @Inject
    private XtextGeneratorNaming naming;

    @Inject
    private FileAccessFactory fileAccessFactory;

    @Override
    public void generate() {
        generateCustomizedInjectorProvider();
        generateAbstractTest();
        generateSameNameUMLURIFinder();
        generateFormatterTest();
        generateCustomizedRuntimeModule();
    }

    private void generateFormatterTest() {
        // generate AbstractFormatterTest
        String directoryPath = "testmodels/formatting/";
        JavaFileAccess abstrJva = fileAccessFactory.createXtendFile(typeRef(getAbstractFormatterTestProviderName()));
        AbstractFormatterTestGenerator abstrGenerator = new AbstractFormatterTestGenerator(naming, grammar,
                directoryPath);
        abstrGenerator.create(abstrJva);
        abstrJva.writeTo(getProjectConfig().getRuntimeTest().getSrcGen());

        // generate FormatterTest
        String completeDirectoryPath = getProjectConfig().getRuntimeTest().getRoot().getPath()
                + "/testmodels/formatting/";
        File dir = new File(completeDirectoryPath);
        if (dir.listFiles() != null) {
            String fileExtension = getLanguage().getFileExtensions().get(0);
            List<File> dirList = Arrays.asList(dir.listFiles()).stream()
                    .filter(file -> file.getName().contains(("." + fileExtension))).collect(Collectors.toList());
            JavaFileAccess jva = fileAccessFactory.createXtendFile(typeRef(getFormatterTestProviderName()));
            FormatterTestGenerator generator = new FormatterTestGenerator(naming, grammar, dirList, fileExtension);
            generator.create(jva);
            jva.writeTo(getProjectConfig().getRuntimeTest().getSrc());
            getProjectConfig().getRuntimeTest().getManifest().getExportedPackages().add(getFormatterPackageName());
        }
    }

    private void generateCustomizedRuntimeModule() {
        // generate AbstractCustomizedRuntimeModule
        JavaFileAccess abstrJva = fileAccessFactory
                .createJavaFile(typeRef(getAbstractCustomizedRuntimeModuleProviderName()));
        AbstractCustomizedRuntimeModuleGenerator abstrGenerator = new AbstractCustomizedRuntimeModuleGenerator(naming,
                grammar);
        abstrGenerator.create(abstrJva, getAbstractCustomizedRuntimeModuleSimpleName());
        abstrJva.writeTo(getProjectConfig().getRuntimeTest().getSrcGen());

        // generate CustomizedRuntimeModule
        JavaFileAccess jva = fileAccessFactory.createJavaFile(typeRef(getCustomizedRuntimeModuleProviderName()));
        CustomizedRuntimeModuleGenerator generator = new CustomizedRuntimeModuleGenerator(naming, grammar);
        generator.create(jva, getCustomizedRuntimeModuleSimpleName());
        jva.writeTo(getProjectConfig().getRuntimeTest().getSrc());
        getProjectConfig().getRuntimeTest().getManifest().getExportedPackages().add(getScopingUtilPackageName());
    }

    private String getAbstractCustomizedRuntimeModuleSimpleName() {
        return "Abstract" + GrammarUtil.getSimpleName(grammar) + "CustomizedRuntimeModule";
    }

    private String getAbstractCustomizedRuntimeModuleProviderName() {
        return getScopingUtilPackageName() + "." + getAbstractCustomizedRuntimeModuleSimpleName();
    }

    private String getCustomizedRuntimeModuleSimpleName() {
        return GrammarUtil.getSimpleName(grammar) + "CustomizedRuntimeModule";
    }

    private String getCustomizedRuntimeModuleProviderName() {
        return getScopingUtilPackageName() + "." + getCustomizedRuntimeModuleSimpleName();
    }

    private String getFormatterPackageName() {
        return naming.getRuntimeTestBasePackage(grammar) + ".formatter";
    }

    private String getAbstractFormatterTestSimpleName() {
        return "AbstractFormatterTest";
    }

    private String getFormatterTestSimpleName() {
        return "FormatterTest";
    }

    private String getAbstractFormatterTestProviderName() {
        return getFormatterPackageName() + "." + getAbstractFormatterTestSimpleName();
    }

    private String getFormatterTestProviderName() {
        return getFormatterPackageName() + "." + getFormatterTestSimpleName();
    }

    private void generateSameNameUMLURIFinder() {
        JavaFileAccess jva = fileAccessFactory.createJavaFile(typeRef(getSameNameUMLURIFinderProviderName()));
        SameNameUMLURIFinderGenerator generator = new SameNameUMLURIFinderGenerator(naming, grammar);
        generator.create(jva, getSameNameUMLURIFinderSimpleName());
        jva.writeTo(getProjectConfig().getRuntimeTest().getSrc());
        getProjectConfig().getRuntimeTest().getManifest().getExportedPackages().add(getScopingUtilPackageName());
    }

    private void generateCustomizedInjectorProvider() {
        JavaFileAccess jva = fileAccessFactory.createJavaFile(typeRef(getCustomizedInjectorProviderName()));
        CustomizedInjectorProviderGenerator generator = new CustomizedInjectorProviderGenerator(naming, grammar);
        generator.create(jva, getCustomizedInjectorProviderSimpleName());
        jva.writeTo(getProjectConfig().getRuntimeTest().getSrc());
        getProjectConfig().getRuntimeTest().getManifest().getExportedPackages().add(getScopingUtilPackageName());
    }

    private void generateAbstractTest() {
        JavaFileAccess jva = fileAccessFactory.createXtendFile(typeRef(getAbstractTestProviderName()));
        AbstractTestGenerator generator = new AbstractTestGenerator(naming, grammar);
        generator.create(jva, getAbstractTestSimpleName());
        jva.writeTo(getProjectConfig().getRuntimeTest().getSrc());
        getProjectConfig().getRuntimeTest().getManifest().getExportedPackages().add(getTestsPackageName());

    }

    private String getSameNameUMLURIFinderProviderName() {
        return getScopingUtilPackageName() + "." + getSameNameUMLURIFinderSimpleName();
    }

    private String getSameNameUMLURIFinderSimpleName() {
        return "SameNameUMLURIFinder";
    }

    private String getCustomizedInjectorProviderName() {
        return getScopingUtilPackageName() + "." + getCustomizedInjectorProviderSimpleName();
    }

    private String getCustomizedInjectorProviderSimpleName() {
        return GrammarUtil.getSimpleName(grammar) + "CustomizedInjectorProvider";
    }

    private String getScopingUtilPackageName() {
        return naming.getRuntimeTestBasePackage(grammar) + ".scoping.util";
    }

    private String getAbstractTestProviderName() {
        return getTestsPackageName() + "." + getAbstractTestSimpleName();
    }

    private String getAbstractTestSimpleName() {
        return "Abstract" + GrammarUtil.getSimpleName(grammar) + "Test";
    }

    private String getTestsPackageName() {
        return naming.getRuntimeTestBasePackage(grammar);
    }

}
