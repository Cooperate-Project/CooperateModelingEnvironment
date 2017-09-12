package de.cooperateproject.modeling.transformation.tests.commons.utils;

import org.eclipse.emf.compare.diff.FeatureFilter;

public class DefaultFeatureFilterFactory implements FeatureFilterFactory {

    @Override
    public FeatureFilter createFeatureFilter() {
        return new FeatureFilter();
    }

}
