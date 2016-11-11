package de.cooperateproject.modeling.textual.cls.formatting2

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2
import de.cooperateproject.util.eclipse.ExtensionPointHelper
import com.google.inject.Guice
import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule
import de.cooperateproject.modeling.textual.cls.Activator

class FormatterContext extends AbstractFormatter2 {
	
	override format(Object obj, IFormattableDocument document) {
		
		var formatter = Activator.instance.getFormatter()
		var injector = Guice.createInjector(new ClsRuntimeModule())
        injector.injectMembers(formatter)
        
        formatter.format(textRegionExtensions, obj, document)		
	}
	
}
