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
        if (!(obj instanceof HistoryElement)) {
            return "";
        }
        HistoryElement element = (HistoryElement) obj;
        return getTextFromHistoryElement(index, element);
    }

    private String getTextFromHistoryElement(int index, HistoryElement element) {
        switch (index) {
        case 0:
            Date date = new Date(element.getTimestamp());
            return formatterTime.format(date);
        case 1:
            return LabelUtils.getEObjectLabel(element.getFocusedElement());
        default:
            return "";
        }
    }

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

}