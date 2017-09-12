package de.cooperateproject.ui.editors.launcher.extensions;

import java.util.Arrays;
import java.util.Optional;

import de.cooperateproject.modeling.common.types.ConcreteSyntaxTypes;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;

public enum EditorType {

    GRAPHICAL(GraphicalConcreteSyntaxModel.class, ConcreteSyntaxTypes.GRAPHICAL),
    TEXTUAL(TextualConcreteSyntaxModel.class, ConcreteSyntaxTypes.TEXTUAL);

    private final Class<? extends ConcreteSyntaxModel> supportedSyntaxModel;
    private final ConcreteSyntaxTypes concreteSyntaxType;

    private EditorType(Class<? extends ConcreteSyntaxModel> supportedSyntaxModel,
            ConcreteSyntaxTypes concreteSyntaxType) {
        this.supportedSyntaxModel = supportedSyntaxModel;
        this.concreteSyntaxType = concreteSyntaxType;
    }

    public Class<? extends ConcreteSyntaxModel> getSupportedSyntaxModel() {
        return supportedSyntaxModel;
    }

    public static Optional<EditorType> getEditorType(ConcreteSyntaxTypes concreteSyntaxType) {
        return Arrays.stream(EditorType.values()).filter(e -> e.concreteSyntaxType == concreteSyntaxType).findFirst();
    }
}
