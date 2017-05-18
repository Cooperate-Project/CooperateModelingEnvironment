package de.cooperateproject.ui.focus.manager;

import org.eclipse.ui.IWorkbenchPart;

public interface IFocusManagerFactory {

    boolean canHandle(IWorkbenchPart workbenchPart);

    IFocusManager create(IWorkbenchPart workbenchPart);

}
