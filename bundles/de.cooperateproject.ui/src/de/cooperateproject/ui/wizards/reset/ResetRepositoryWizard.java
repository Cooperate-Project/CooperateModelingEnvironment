package de.cooperateproject.ui.wizards.reset;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.nature.ResetToPreviousStateCommand;

public class ResetRepositoryWizard extends Wizard {

    private ResetRepositoryPage resetPage;
    private IProject project;
    private IFile file;

    public ResetRepositoryWizard(IProject project) {
        super();
        setWindowTitle("Reset to previous state");
        this.project = project;
    }

    public ResetRepositoryWizard(IFile file) {
        super();
        setWindowTitle("Reset to previous state");
        this.file = file;
    }

    @Override
    public void addPages() {
        super.addPages();
        if (file == null) {
            resetPage = new ResetRepositoryPage(project);
        } else {
            resetPage = new ResetRepositoryPage(file);
        }
        addPage(resetPage);
    }

    @Override
    public boolean performFinish() {
        if (!canFinish()) {
            return false;
        }
        CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
        try {
            ResetToPreviousStateCommand.resetProject(session, ResetRepositoryComposite.getSelectedCommit(), project);
        } finally {
            IOUtil.closeSilent(session);
        }
        return true;
    }

}
