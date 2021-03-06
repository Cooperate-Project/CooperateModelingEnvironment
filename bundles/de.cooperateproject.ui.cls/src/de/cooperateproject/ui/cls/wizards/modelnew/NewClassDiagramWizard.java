package de.cooperateproject.ui.cls.wizards.modelnew;

import de.cooperateproject.modeling.common.types.DiagramTypeRegistry;
import de.cooperateproject.modeling.common.types.DiagramTypesDeprecated;
import de.cooperateproject.ui.wizards.modelnew.AbstractNewDiagramWizard;

public class NewClassDiagramWizard extends AbstractNewDiagramWizard {

    public NewClassDiagramWizard() {
        super(DiagramTypeRegistry.getInstance().getByDiagramTypeDeprecated(DiagramTypesDeprecated.CLASS).get());
    }
}
