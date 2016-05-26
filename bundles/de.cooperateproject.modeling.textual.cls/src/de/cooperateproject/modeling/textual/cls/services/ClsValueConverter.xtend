package de.cooperateproject.modeling.textual.cls.services

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class ClsValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule="CardinalityBound")
	public def convertCardinalityBound() {
		return new AbstractNullSafeConverter<Integer>() {

			override protected internalToString(Integer value) {
				if (value < 0) {
					return "*"
				}
				return value.toString
			}

			override protected internalToValue(String string, INode node) throws ValueConverterException {
				if ("*".equals(string)) {
					return -1
				}
				return Integer.parseInt(string)
			}

		}
	}

}
