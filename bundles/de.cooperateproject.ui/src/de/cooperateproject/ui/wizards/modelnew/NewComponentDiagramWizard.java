package de.cooperateproject.ui.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;

public class NewComponentDiagramWizard extends AbstractNewDiagramWizard {

    public NewComponentDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.COMPONENT).get());
    }
}
