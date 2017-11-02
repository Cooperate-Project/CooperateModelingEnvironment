package de.cooperateproject.ui.editors.launcher.impl;

import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;

import de.cooperateproject.ui.startup.IStartupAction;

public class CheckoutListenerRegistration implements IStartupAction {

    @Override
    public void run() {
        CDOExplorerUtil.getCheckoutManager().addListener(CheckoutListenerManager.INSTANCE);
    }

}
