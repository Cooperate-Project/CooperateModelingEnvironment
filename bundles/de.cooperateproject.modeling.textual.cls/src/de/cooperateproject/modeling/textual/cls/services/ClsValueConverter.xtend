package de.cooperateproject.modeling.textual.cls.services

import de.cooperateproject.modeling.textual.common.scoping.CooperateValueConverterBase
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractValueConverter
import org.eclipse.xtext.nodemodel.INode

class ClsValueConverter extends CooperateValueConverterBase {
	
	@ValueConverter(rule="RoleName")
	public def convertRoleName() {
	    return new AbstractValueConverter<String>() {
        
            private static val NULL_KEYWORD = "_"
        
            override toString(String value) throws ValueConverterException {
                if (value === null) {
                    return NULL_KEYWORD
                }
                return value
            }
            
            override toValue(String string, INode node) throws ValueConverterException {
                if (NULL_KEYWORD.equals(string)) {
                    return null
                }
                return string
            }
	    }
	}

}