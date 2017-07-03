package de.cooperateproject.modeling.textual.xtext.generator.ui;

import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

import de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextEditor;

/**
 * Fragment for editor-related bindings and code generation with respect to the needs of Cooperate.
 */
@SuppressWarnings("restriction")
public class CooperateEditorFragment extends AbstractXtextGeneratorFragment {

    @Override
    public void generate() {
        registerGuiceBindingsEclipse();
    }

    private void registerGuiceBindingsEclipse() {
        new GuiceModuleAccess.BindingFactory()
                .addTypeToType(typeRef(XtextEditor.class), typeRef(CooperateCDOXtextEditor.class))
                .contributeTo(getLanguage().getEclipsePluginGenModule());
    }

    private static TypeReference typeRef(Class<?> clazz) {
        return TypeReference.typeRef(clazz);
    }

}
