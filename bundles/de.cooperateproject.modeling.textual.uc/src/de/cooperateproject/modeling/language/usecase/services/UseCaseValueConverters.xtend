package de.cooperateproject.modeling.language.usecase.services

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService
import org.eclipse.xtext.nodemodel.INode

class UseCaseValueConverters extends AbstractDeclarativeValueConverterService {

	@ValueConverter(rule="Name")
	def IValueConverter<String> getNameNameConverter() {
		return new IValueConverter<String>() {

			override toString(String value) throws ValueConverterException {
				if (value.matches("^?[a-zA-Z_][a-zA-Z_0-9]*")) {
					return value;
				}
				return String.format("\"%s\"", value);
			}

			override toValue(String value, INode node) throws ValueConverterException {
				if (value == null) {
					throw new ValueConverterException("null value", node, null);
				}
				if (value.matches("\\\".*\\\"")) {
					return value.subSequence(1, value.length - 1).toString;
				}
				return value;
			}

		}
	}
	
	@ValueConverter(rule="MultiplicityElement")
	def IValueConverter<Integer> getMultiplicityElementConverter() {
		return new IValueConverter<Integer>() {
			
			override toString(Integer value) throws ValueConverterException {
				if (value < 0) {
					return "*";
				}
				return value.toString;
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if ("*".equals(string)) {
					return -1;
				}
				try {
					return Integer.parseInt(string);					
				} catch (Exception e) {
					throw new ValueConverterException("Failed to convert multiplicity value to integer.", node, e);
				}
			}
			
		}
	}
	
	@ValueConverter(rule="ImportURI")
	def IValueConverter<String> getUseImportUriConverter() {
		return new IValueConverter<String>() {
			
			override toString(String value) throws ValueConverterException {
				return "\""+value+"\""
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				return string.substring(1, string.length - 1)
			}

		}
	}

}
