package de.cooperateproject.ui.usecase.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.ui.wizards.modelnew.AbstractNewDiagramWizard;

public class NewUsecaseDiagramWizard extends AbstractNewDiagramWizard {

    public NewUsecaseDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.USECASE).get());
    }
}
