package de.cooperateproject.ui.diff.action;

/**
 * Action concerning in toggling live updating diff view.
 * @author czogalik
 *
 */
@FunctionalInterface
public interface IToggleAction {

    /**
     * Returns true if user wants live updates, false otherwise.
     * @return true if user wants live updates, false otherwise.
     */
    boolean isLiveActivated();
}
