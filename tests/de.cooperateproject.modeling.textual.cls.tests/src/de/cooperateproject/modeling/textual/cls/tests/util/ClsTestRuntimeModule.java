package de.cooperateproject.modeling.textual.cls.tests.util;

import de.cooperateproject.modeling.textual.cls.tests.scoping.util.ClsCustomizedRuntimeModule;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class ClsTestRuntimeModule extends ClsCustomizedRuntimeModule {

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return StaticUMLURIFinder.class;
    }

}
