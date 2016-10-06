package de.cooperateproject.modeling.textual.cls.tests.scoping.util;

import de.cooperateproject.modeling.textual.cls.ClsInjectorProvider;
import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;

public class ClsCustomizedInjectorProvider extends ClsInjectorProvider {

	public static class DefaultProvider extends ClsCustomizedInjectorProvider {

		public DefaultProvider() {
			super(ClsCustomizedRuntimeModule.class);
		}
		
	}
	
	private final ClsRuntimeModule module;
	
	public ClsCustomizedInjectorProvider(ClsRuntimeModule module) {
		this.module = module;
	}
	
	public ClsCustomizedInjectorProvider(Class<? extends ClsRuntimeModule> moduleClass) {
		try {
			this.module = moduleClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected ClsRuntimeModule createRuntimeModule() {
		return module;
	}
	
}
