package de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Provider for the transient status of features as to be used in Xtext.
 * 
 * Xtext only considers displaying information of non-transient features. However, such features might have to be
 * displayed in order to fulfill the requirements of the grammar. Therefore, this status provider can be used to
 * determine features that shall be considered non-transient. On the other side, there might be features that are
 * non-transient in EMF but should be handled transient in Xtext. This status provider provider can be used to determine
 * whether a feature should be considered transient.
 */
public interface ITransientStatusProvider {

    /**
     * Determines if a given feature shall be considered transient in the Xtext handling.
     * 
     * This methods does NOT consider the value of the feature.
     * 
     * @param feature
     *            The feature to check.
     * @return True if the feature shall be considered transient. False otherwise. False does not mean that the feature
     *         must not be considered transient.
     */
    boolean isFeatureConsideredTransient(EStructuralFeature feature);

    /**
     * Determines if a given feature shall be considered non-transient in the Xtext handling.
     * 
     * This methods does NOT consider the value of the feature.
     * 
     * @param feature
     *            The feature to check.
     * @return True if the feature shall be considered non-transient. False otherwise. False does not mean that the
     *         feature must not be considered non-transient.
     */
    boolean isFeatureConsideredNonTransient(EStructuralFeature feature);

}
