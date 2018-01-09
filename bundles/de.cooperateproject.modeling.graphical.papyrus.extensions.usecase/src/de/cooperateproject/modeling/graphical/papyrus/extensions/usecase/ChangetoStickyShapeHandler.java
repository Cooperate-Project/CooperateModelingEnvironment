package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase;

import org.eclipse.core.commands.IHandler;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.uml.diagram.usecase.edit.parts.ActorEditPartTN;
import org.eclipse.uml2.uml.Actor;

import de.cooperateproject.modeling.graphical.papyrus.extensions.ChangeStyleHandler;

public class ChangetoStickyShapeHandler extends ChangeStyleHandler implements IHandler {

    @Override
    public boolean isEnabled() {
        GraphicalEditPart editPart = getSelectedGraphicalEditpart();
        if (editPart == null) {
            return false;
        }

        if (((editPart.resolveSemanticElement() instanceof Actor) && (editPart instanceof ActorEditPartTN)
                && ActorStyles.getActorKind(editPart.getNotationView()) == ActorKind.MACHINE)) {
            return true;
        }
        return false;
    }

    @Override
    protected AbstractTransactionalCommand getChangeStyleCommand(GraphicalEditPart editPart) {
        ChangeActorStyleCommand command = new ChangeActorStyleCommand(ActorKind.STICKY, editPart.getEditingDomain(),
                editPart);
        return command;
    }

}
