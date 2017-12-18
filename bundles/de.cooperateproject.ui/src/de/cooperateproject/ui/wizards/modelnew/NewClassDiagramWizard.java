package de.cooperateproject.ui.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;

public class NewClassDiagramWizard extends AbstractNewDiagramWizard {

    public NewClassDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.CLASS).get());
    }
}
