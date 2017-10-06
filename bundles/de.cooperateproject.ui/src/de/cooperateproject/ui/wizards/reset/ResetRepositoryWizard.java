package de.cooperateproject.ui.wizards.reset;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.jface.wizard.Wizard;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.commands.ResetToPreviousStateCommand;

public class ResetRepositoryWizard extends Wizard {

    private ResetRepositoryPage resetPage;
    private IResource resourceToReset;

    public ResetRepositoryWizard(IResource resource) {
        super();
        setWindowTitle("Reset to previous state");
        this.resourceToReset = resource;
    }

    @Override
    public void addPages() {
        super.addPages();
        resetPage = new ResetRepositoryPage(resourceToReset);
        addPage(resetPage);
    }

    @Override
    public boolean performFinish() {
        if (!canFinish()) {
            return false;
        }
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(resourceToReset.getProject());
        try {
            ResetToPreviousStateCommand.reset(session, ResetRepositoryComposite.getSelectedCommit(), resourceToReset);
        } finally {
            CDOConnectionManager.getInstance().releaseSession(session);
        }
        return true;
    }

}
