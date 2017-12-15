package de.cooperateproject.modeling.textual.xtext.generator.services

import de.cooperateproject.modeling.textual.common.scoping.CooperateValueConverterBase
import org.eclipse.xtext.xtext.generator.model.TextFileAccess

import static org.eclipse.xtext.xtext.generator.model.TypeReference.*

class ValueConverterGenerator {
	
		def create(TextFileAccess tfa, String simpleName) {
		tfa.content = '''		
			public class «simpleName» extends «typeRef(CooperateValueConverterBase)» {

			}
		'''	
	}
	
}