package de.cooperateproject.ui.diff.internal;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/** 
 * Comparator for comparing two commitInfos by time in order to sort them in descending order.
 * @author Jasmin
 *
 */
public class CommitViewerComparator extends ViewerComparator{
	
	public int compare(Viewer viewer, Object o1, Object o2){
		int compare;

		if(o1 instanceof CommitInfo && o2 instanceof CommitInfo){
			Long long1 = ((CommitInfo)o1).getCDOCommitInfo().getTimeStamp();
			Long long2 = ((CommitInfo)o2).getCDOCommitInfo().getTimeStamp();
			compare = long2.compareTo(long1);
		} else{
			compare = o2.toString().compareTo(o1.toString());
		}
		return compare;
	}
}
