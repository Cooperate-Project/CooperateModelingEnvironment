package de.cooperateproject.ui.util.editor;

import org.eclipse.swt.widgets.Display;

/**
 * Utility class for actions regarding the UI thread.
 */
public final class UIThreadActionUtil {

    private UIThreadActionUtil() {
        // intentionally left blank
    }

    /**
     * Executes the given {@link Runnable} in the UI thread.
     * 
     * @param runnable
     *            The action to be performed.
     */
    public static void perform(Runnable runnable) {
        if (Display.getCurrent() == null) {
            Display.getDefault().syncExec(runnable);
        } else {
            runnable.run();
        }
    }

}
