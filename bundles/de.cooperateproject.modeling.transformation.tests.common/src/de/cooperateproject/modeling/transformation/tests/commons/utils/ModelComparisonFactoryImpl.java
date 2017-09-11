package de.cooperateproject.modeling.transformation.tests.commons.utils;

import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;

public class ModelComparisonFactoryImpl implements ModelComparisonFactory {
    FeatureFilterFactory featureFilterFactory = null;

    public ModelComparisonFactoryImpl() {
        featureFilterFactory = new DefaultFeatureFilterFactory();
    }

    @Override
    public IDiffEngine createEMFCompareDiffEngine(IDiffProcessor processor) {
        return new DefaultDiffEngine(processor) {
            @Override
            protected FeatureFilter createFeatureFilter() {
                return featureFilterFactory.createFeatureFilter();
            }
        };
    }

    public void setFeatureFilterFactory(FeatureFilterFactory featureFilterFactory) {
        this.featureFilterFactory = featureFilterFactory;
    }
}
