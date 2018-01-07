package de.cooperateproject.cdo.util.connection.impl;

import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.internal.explorer.checkouts.CDOCheckoutImpl;

/**
 * Constants required for creating a {@link CDOCheckout}.
 */
@SuppressWarnings("restriction")
public final class CDOCheckoutPropertyConstants {

    public static final String READ_ONLY = CDOCheckoutImpl.PROP_READ_ONLY;
    public static final String REPOSITORY = CDOCheckoutImpl.PROP_REPOSITORY;
    public static final String BRANCH_ID = CDOCheckoutImpl.PROP_BRANCH_ID;
    public static final String TIMESTAMP = CDOCheckoutImpl.PROP_TIME_STAMP;
    public static final String LABEL = CDOCheckoutImpl.PROP_LABEL;

    public static final String TYPE = CDOCheckoutImpl.PROP_TYPE;
    public static final String TYPE_ONLINE_TRANSACTIONAL = CDOCheckoutImpl.TYPE_ONLINE_TRANSACTIONAL;

    private CDOCheckoutPropertyConstants() {
        // intentionally left blank
    }

}
