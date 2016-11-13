package de.cooperateproject.modeling.textual.cls.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class FormatterContext extends AbstractFormatter2 {
	
	@Inject
	var IFormatterSelector formatterSelector
	
	override format(Object obj, IFormattableDocument document) {
		val formatter = formatterSelector.selectedFormatter        
        formatter.format(textRegionExtensions, obj, document)		
	}
	
}
