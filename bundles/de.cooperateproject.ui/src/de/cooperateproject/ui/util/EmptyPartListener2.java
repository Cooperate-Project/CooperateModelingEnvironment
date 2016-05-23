package de.cooperateproject.ui.util;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;

public abstract class EmptyPartListener2 implements IPartListener2 {

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
	
	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
	
	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
	
	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
	
	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
		
	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// intentionally left black
	}
	
	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// intentionally left black
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		// intentionally left black
	}

}
