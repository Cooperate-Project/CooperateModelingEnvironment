package de.cooperateproject.modeling.textual.component.tests.util;

import de.cooperateproject.modeling.textual.component.tests.scoping.util.ComponentCustomizedRuntimeModule;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

public class ComponentTestRuntimeModule extends ComponentCustomizedRuntimeModule {

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return StaticUMLURIFinder.class;
    }

}
