package de.cooperateproject.ui.focus.internal.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cooperateproject.ui.focus.internal.history.HistoryElement;

public class FocusViewLabelProvider extends LabelProvider implements ITableLabelProvider {

    private final DateFormat formatterTime = new SimpleDateFormat("HH:mm:ss");

    @Override
    public String getColumnText(Object obj, int index) {
        String ret = "";

        if (!(obj instanceof HistoryElement)) {
            return ret;
        }
        HistoryElement element = (HistoryElement) obj;
        switch (index) {
        case 0:
            Date date = new Date(element.getTimestamp());
            ret = formatterTime.format(date);
            break;
        case 1:
            ret = LabelUtils.getEObjectLabel(element.getFocusedElement());
        default:
        }

        return ret;
    }

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

}