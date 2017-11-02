package de.cooperateproject.modeling.cdo.commithistory;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;

import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

public interface ICommitHistoryManager {
	
	Collection<CDOCommitInfo> getCommitsForLauncher(IFile file) throws IOException, ConcreteSyntaxTypeNotAvailableException;
	
	Collection<CDOCommitInfo> getCommitsForLauncher(IFile file, long from, long to) throws IOException, ConcreteSyntaxTypeNotAvailableException;
	
}
