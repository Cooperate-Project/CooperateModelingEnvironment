package de.cooperateproject.ui.diff.labeling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.diff.internal.CommitInfo;

/**
 * Label Provider for a table view which lists all found commits to one diagram
 * @author Jasmin
 *
 */
public class CommitLabelProvider extends LabelProvider implements ITableLabelProvider{
	
	private final DateFormat formatterTime = new SimpleDateFormat("HH:mm:s");
	private final DateFormat formatterDate = new SimpleDateFormat("d. MMMM yyyy", Locale.ENGLISH);

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		String info ="";
		if(element instanceof CommitInfo){
			CommitInfo element_temp = ((CommitInfo)element);
			Date date = new Date(element_temp.getCDOCommitInfo().getTimeStamp());
			
			switch(columnIndex){
				case 0: info = formatterDate.format(date); break;
				case 1: info = formatterTime.format(date); break;
				case 2: info = String.valueOf(element_temp.getAmountOfChangedObjects()); break;
				default:
			}
		}
		return info;
	}
}
