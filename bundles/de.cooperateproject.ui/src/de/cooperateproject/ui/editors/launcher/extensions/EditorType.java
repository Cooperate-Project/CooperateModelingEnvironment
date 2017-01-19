package de.cooperateproject.ui.editors.launcher.extensions;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.GraphicalConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.TextualConcreteSyntaxModel;

public enum EditorType {

    GRAPHICAL(GraphicalConcreteSyntaxModel.class),
    TEXTUAL(TextualConcreteSyntaxModel.class);

    private final Class<? extends ConcreteSyntaxModel> supportedSyntaxModel;

    private EditorType(Class<? extends ConcreteSyntaxModel> supportedSyntaxModel) {
        this.supportedSyntaxModel = supportedSyntaxModel;
    }

    public Class<? extends ConcreteSyntaxModel> getSupportedSyntaxModel() {
        return supportedSyntaxModel;
    }

}
