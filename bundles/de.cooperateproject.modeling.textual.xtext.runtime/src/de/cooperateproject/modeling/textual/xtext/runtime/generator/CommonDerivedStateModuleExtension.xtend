package de.cooperateproject.modeling.textual.xtext.runtime.generator

import com.google.inject.Binder
import com.google.inject.Provider
import com.google.inject.multibindings.Multibinder

interface CommonDerivedStateModuleExtension {
	
	def void configureCommonsElementProcessor(Binder binder) {
		val mb = Multibinder.newSetBinder(binder, IDerivedStateElementProcessor);
		mb.addBinding().to(TextualCommonsDerivedStateElementProcessor);
	}
	
	def Class<? extends Provider<IComposedDerivedStateElementProcessor>> provideComposedDerivedElementProcessor() {
		ComposedDerivedStateElementProcessorProvider
	}
}
