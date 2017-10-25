package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.cdo.commithistory.ICommitHistoryManager;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

@Component
public class CommitHistoryManagerImpl implements ICommitHistoryManager {


	@Override
	public Collection<CDOCommitInfo> getCommitsForLauncher(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		try (AllCommitsForFileFinder commitFinder = new AllCommitsForFileFinder(launcherFile)) {
			return commitFinder.getCommits();
		}
	}

}
