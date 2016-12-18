package de.cooperateproject.ui.diff.labeling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	private final DateFormat formatter = new SimpleDateFormat("EEE, d. MMM HH:mm:s");

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		String info ="";
		if(element instanceof CommitInfo){
			CommitInfo element_temp = ((CommitInfo)element);
			info = formatter.format(new Date(element_temp.getCDOCommitInfo().getTimeStamp())) + " changes: " + element_temp.getAmountOfChangedObjects();
		
		}
		return info;
	}
	
	

}
