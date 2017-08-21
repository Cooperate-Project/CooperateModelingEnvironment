package de.cooperateproject.ui.diff.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.util.io.IOUtil;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;

/**
 * Creates and holds the previous and current CDOView of the selected
 * CDOCommitInfo.
 * 
 * @author Jasmin
 *
 */
public class CommitCDOViewManager {

	private CDOSession session;
	private CDOView previousView;
	private CDOView currentView;

	public CommitCDOViewManager(CDOCommitInfo commit, IFile file) {
		session = CDOConnectionManager.getInstance().acquireSession(file.getProject());
		CDOBranch mainBranch = session.getBranchManager().getMainBranch();

		currentView = session.openView(mainBranch, commit.getTimeStamp());
		previousView = session.openView(mainBranch, commit.getPreviousTimeStamp());
		CDOConnectionManager.getInstance().releaseSession(session);
	}

	/**
	 * Gets the CDOView of the commit's previous state.
	 * 
	 * @return the previous CDOView
	 */
	public CDOView getPreviousView() {
		return previousView;
	}

	/**
	 * Gets the CDOView of the commit's current state.
	 * 
	 * @return the current CDOView
	 */
	public CDOView getCurrentView() {
		return currentView;
	}

	/**
	 * Closes all opened views on the commit.
	 */
	public void closeAllViews() {
		IOUtil.closeSilent(previousView);
		IOUtil.closeSilent(currentView);
	}

}
