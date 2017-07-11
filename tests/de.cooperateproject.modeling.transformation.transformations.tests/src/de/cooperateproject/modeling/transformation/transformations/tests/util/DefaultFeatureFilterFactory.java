package de.cooperateproject.modeling.transformation.transformations.tests.util;

import org.eclipse.emf.compare.diff.FeatureFilter;

public class DefaultFeatureFilterFactory implements FeatureFilterFactory {

    @Override
    public FeatureFilter createFeatureFilter() {
        return new FeatureFilter();
    }

}
