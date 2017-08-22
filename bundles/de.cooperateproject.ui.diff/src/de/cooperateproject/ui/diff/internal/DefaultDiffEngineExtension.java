package de.cooperateproject.ui.diff.internal;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.DelegatingTransientStatusProvider;

/**
 * Compute the differences between the objects mapped .
 * @author czogalik
 *
 */
public final class DefaultDiffEngineExtension extends DefaultDiffEngine {
    @Override
    protected FeatureFilter createFeatureFilter() {
        return new FeatureFilter() {

            @Override
            protected boolean isIgnoredReference(Match match, EReference reference) {
                DelegatingTransientStatusProvider statusProvider = new DelegatingTransientStatusProvider();
                return statusProvider.isFeatureConsideredTransient(reference)
                        || (super.isIgnoredReference(match, reference)
                                && !statusProvider.isFeatureConsideredNonTransient(reference));
            }

            @Override
            protected boolean isIgnoredAttribute(EAttribute attribute) {
                DelegatingTransientStatusProvider statusProvider = new DelegatingTransientStatusProvider();
                return statusProvider.isFeatureConsideredTransient(attribute)
                        || (super.isIgnoredAttribute(attribute)
                                && !statusProvider.isFeatureConsideredNonTransient(attribute));
            }
        };
    }
}