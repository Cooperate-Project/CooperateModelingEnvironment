package de.cooperateproject.ui.component.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.ui.wizards.modelnew.AbstractNewDiagramWizard;

public class NewComponentDiagramWizard extends AbstractNewDiagramWizard {

    public NewComponentDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.COMPONENT).get());
    }
}
