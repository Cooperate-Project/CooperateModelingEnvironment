package de.cooperateproject.modeling.textual.xtext.generator.naming;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import com.google.inject.name.Names;

import de.cooperateproject.modeling.textual.common.naming.CommonQualifiedNameProvider;
import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IAlternativeNameProvider;

@SuppressWarnings("restriction")
public class CooperateNamingBindingsFragment2 extends AbstractXtextGeneratorFragment {

    @Override
    public void generate() {
        registerGuiceBindingsRt();
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(IQualifiedNameProvider.class), typeRef(CommonQualifiedNameProvider.class))
                .addTypeToType(typeRef(IAlternativeNameProvider.class), typeRef(CommonQualifiedNameProvider.class))
                .addConfiguredBinding("IScopeProviderDelegate", new StringConcatenationClient() {
                    @Override
                    protected void appendTo(TargetStringConcatenation target) {
                        target.append("binder.bind(");
                        target.append(typeRef(IScopeProvider.class));
                        target.append(".class).annotatedWith(");
                        target.append(typeRef(Names.class));
                        target.append(".named(");
                        target.append(typeRef(AbstractDeclarativeScopeProvider.class));
                        target.append(".NAMED_DELEGATE)).to(");
                        target.append(typeRef(CooperateImportedNamespaceAwareLocalScopeProvider.class));
                        target.append(".class);");
                    }
                }).contributeTo(getLanguage().getRuntimeGenModule());
    }

    private static TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

}
