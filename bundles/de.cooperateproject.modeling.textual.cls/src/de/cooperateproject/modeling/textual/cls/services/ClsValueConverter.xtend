package de.cooperateproject.modeling.textual.cls.services

import org.apache.commons.lang3.StringEscapeUtils
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.IValueConverter

class ClsValueConverter extends DefaultTerminalConverters {
	//http://pettergraff.blogspot.de/2009/11/xtext-valueconverter.html
	/**
	 * Allows to create classes with strings containing empty spaces as names.
	 * @return The Value of the String containing no quotation marks.
	 */
	@ValueConverter(rule="FQN")
	def IValueConverter<String> FQN() {
		return new IValueConverter<String>() {
			override toString(String value) throws ValueConverterException {
				if (value.matches("^?[a-zA-Z_][a-zA-Z_0-9]*")) {
					return value;
				}
				return String.format("\"%s\"", value)
			}
			override toValue(String value, INode node) throws ValueConverterException {
				if (value == null) {
					throw new ValueConverterException("null value", node, null)
				}
				if (value.matches("\\\".*\\\"")) {
					return value.subSequence(1, value.length - 1).toString;
				}
				return value
			}
		}
	}

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
	
	@ValueConverter(rule="CommentBody")
	public def convertCommentBody() {
		return new AbstractNullSafeConverter<String>() {

			override protected internalToString(String value) {
				return "\"" + escape(value) + "\"";
			}

			override protected internalToValue(String string, INode node) throws ValueConverterException {
				if (string.length < 2) {
					throw new ValueConverterException("The given string is too short to be a string.", node, new IllegalArgumentException);
				}
				if (!string.startsWith("\"") || !string.endsWith("\"")) {
					throw new ValueConverterException("The given string is not quoted.", node, new IllegalArgumentException)
				}
				val unquotedString = string.substring(1, string.length - 1)
				return unescape(unquotedString)
			}
			
			private def escape(String value) {
				return StringEscapeUtils.escapeJava(value)
			}
			
			private def unescape(String value) {
				return StringEscapeUtils.unescapeJava(value)
			}
		}
	}

}