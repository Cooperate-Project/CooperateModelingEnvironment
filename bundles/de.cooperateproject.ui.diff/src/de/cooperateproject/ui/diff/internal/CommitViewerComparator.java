package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comparator for comparing two commitInfos by time in order to sort them in descending order.
 * 
 * @author Jasmin
 *
 */
public class CommitViewerComparator extends ViewerComparator {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommitViewerComparator.class);
    @Override
    public int compare(Viewer viewer, Object o1, Object o2) {
        int compare = 0;

        if (o1 instanceof CDOCommitInfo && o2 instanceof CDOCommitInfo) {
            Long long1 = ((CDOCommitInfo) o1).getTimeStamp();
            Long long2 = ((CDOCommitInfo) o2).getTimeStamp();
            compare = long2.compareTo(long1);
        } else {
            // This shouldn't happen.
            LOGGER.info("CommitViewerComparator: Tried to compare objects of type " + o1.getClass() + " and "
                    + o2.getClass() + " instead of objects of type CDOCommitInfo");
        }
        return compare;
    }
}
