package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Change the css style of an actor to the given ActorKind
 * 
 * @author henss
 *
 */
public class ChangeActorStyleCommand extends AbstractTransactionalCommand {
    private ActorKind changeTo;
    protected GraphicalEditPart elementEditPart;

    public ChangeActorStyleCommand(ActorKind changeTo, TransactionalEditingDomain domain, GraphicalEditPart classView) {
        super(domain, "ChangeActorStyleCommand", Collections.EMPTY_LIST);
        this.elementEditPart = classView;
        this.changeTo = changeTo;
    }

    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        View actorview = elementEditPart.getNotationView();
        switch (changeTo) {
        case MACHINE:
            ActorStyles.setActorMachine(actorview);
            break;
        default:
            ActorStyles.setActorSticky(actorview);
        }

        return null;
    }

}
