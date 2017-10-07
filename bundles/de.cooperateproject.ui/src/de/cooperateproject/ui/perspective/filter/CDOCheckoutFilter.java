package de.cooperateproject.ui.perspective.filter;

import java.util.Optional;

import org.eclipse.emf.cdo.internal.explorer.checkouts.OnlineCDOCheckout;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cooperateproject.ui.perspective.CooperatePerspective;

/**
 * Filters {@link OnlineCDOCheckout} elements from viewers if the Cooperate perspective is active.
 */
@SuppressWarnings("restriction")
public class CDOCheckoutFilter extends ViewerFilter {

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        return !isCooperatePerspectiveActive() || !(element instanceof OnlineCDOCheckout);
    }

    private static boolean isCooperatePerspectiveActive() {
        return Optional.ofNullable(PlatformUI.getWorkbench()).map(IWorkbench::getActiveWorkbenchWindow)
                .map(IWorkbenchWindow::getActivePage).map(IWorkbenchPage::getPerspective)
                .map(IPerspectiveDescriptor::getId).map(CooperatePerspective.PERSPECTIVE_ID::equals).orElse(false);
    }

}
