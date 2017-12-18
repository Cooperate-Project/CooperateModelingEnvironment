package de.cooperateproject.ui.diff.labeling.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * Label Provider for a table view which lists all found commits to one diagram.
 * 
 * @author Jasmin, czogalik
 *
 */
public class CommitLabelProvider extends LabelProvider implements ITableLabelProvider {

    private final DateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");
    private final DateFormat formatterDate = new SimpleDateFormat("d. MMMM yyyy", Locale.ENGLISH);

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnText(Object element, int columnIndex) {
        if (!(element instanceof CDOCommitInfo)) {
            return "";
        }
        return getColumnText((CDOCommitInfo) element, columnIndex);
    }

    private String getColumnText(CDOCommitInfo element, int columnIndex) {
        Date date = new Date(element.getTimeStamp());

        switch (columnIndex) {
        case 0:
            return formatterDate.format(date);
        case 1:
            return formatterTime.format(date);
        case 2:
            return element.getComment();
        default:
            return "";
        }
    }
}
