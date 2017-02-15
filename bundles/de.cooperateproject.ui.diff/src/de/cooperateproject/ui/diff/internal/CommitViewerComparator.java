package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/**
 * Comparator for comparing two commitInfos by time in order to sort them in
 * descending order.
 * 
 * @author Jasmin
 *
 */
public class CommitViewerComparator extends ViewerComparator {

	public int compare(Viewer viewer, Object o1, Object o2) {
		int compare;

		if (o1 instanceof CDOCommitInfo && o2 instanceof CDOCommitInfo) {
			Long long1 = ((CDOCommitInfo) o1).getTimeStamp();
			Long long2 = ((CDOCommitInfo) o2).getTimeStamp();
			compare = long2.compareTo(long1);
		} else {
			compare = o2.toString().compareTo(o1.toString());
		}
		return compare;
	}
}
