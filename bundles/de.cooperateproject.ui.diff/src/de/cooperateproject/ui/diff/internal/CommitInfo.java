package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;

/**
 * Contains the information needed for the diff-viewer in the commit history for one commit.
 * @author Jasmin
 *
 */
public class CommitInfo{
	
	private CDOCommitInfo cdoCommitInfo;
	private int amountOfChangedObjects;
	
	public CommitInfo(CDOCommitInfo info, int changedObjects){
		cdoCommitInfo = info;
		amountOfChangedObjects = changedObjects;
	}
	
	public CDOCommitInfo getCDOCommitInfo(){
		return cdoCommitInfo;
	}
	
	public int getAmountOfChangedObjects(){
		return amountOfChangedObjects;
	}
	
}
