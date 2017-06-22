package de.cooperateproject.modeling.textual.xtext.runtime.editor;

import net.winklerweb.cdoxtext.runtime.IFeatureFilter;

public interface FeatureFilterMixin {

    default Class<? extends IFeatureFilter> bindIFeatureFilter() {
        return DefaultFeatureFilter.class;
    }

}
