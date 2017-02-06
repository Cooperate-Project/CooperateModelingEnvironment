package de.cooperateproject.modeling.textual.xtext.generator.naming;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IAlternativeNameProvider;

@SuppressWarnings("restriction")
public class CooperateNamingBindingsFragment2 extends AbstractXtextGeneratorFragment {

    @Override
    public void generate() {
        registerGuiceBindingsRt();
    }

    private void registerGuiceBindingsRt() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(IQualifiedNameProvider.class), typeRef(CooperateQualifiedNameProvider.class))
                .addTypeToType(typeRef(IAlternativeNameProvider.class), typeRef(CooperateQualifiedNameProvider.class))
                .contributeTo(getLanguage().getRuntimeGenModule());
    }

    private static TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

}
