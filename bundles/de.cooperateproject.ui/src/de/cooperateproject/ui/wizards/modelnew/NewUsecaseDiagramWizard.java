package de.cooperateproject.ui.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;

public class NewUsecaseDiagramWizard extends AbstractNewDiagramWizard {

    public NewUsecaseDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.USECASE).get());
    }
}
