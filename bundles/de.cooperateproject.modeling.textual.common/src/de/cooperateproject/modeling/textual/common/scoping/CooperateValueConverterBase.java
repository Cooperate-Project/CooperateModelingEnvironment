package de.cooperateproject.modeling.textual.common.scoping;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class CooperateValueConverterBase extends DefaultTerminalConverters {

    @ValueConverter(rule = "NameString")
    public IValueConverter<String> NameString() {
        return new AbstractNullSafeConverter<String>() {

            @Override
            protected String internalToString(String value) {
                return String.format("\"%s\"", value);
            }

            @Override
            protected String internalToValue(String string, INode node) throws ValueConverterException {
                if (string.matches("\\\".*\\\"")) {
                    return string.subSequence(1, string.length() - 1).toString();
                }
                return string;
            }

        };
    }

    @ValueConverter(rule = "FQN")
    public IValueConverter<String> FQN() {
        return new AbstractNullSafeConverter<String>() {

            @Override
            protected String internalToString(String value) {
                // this prohibits FQNs with spaces to be serialized
                if (value.contains(" ")) {
                    throw new ValueConverterException("Spaces are not allowed inside FQNs.", null, null);
                }
                return value;
            }

            @Override
            protected String internalToValue(String string, INode node) throws ValueConverterException {
                return string;
            }

        };
    }

    // http://pettergraff.blogspot.de/2009/11/xtext-valueconverter.html
    @ValueConverter(rule = "CardinalityBound")
    public IValueConverter<Integer> convertCardinalityBound() {
        return new AbstractNullSafeConverter<Integer>() {

            @Override
            protected String internalToString(Integer value) {
                if (value < 0) {
                    return "*";
                }
                return value.toString();
            }

            @Override
            protected Integer internalToValue(String string, INode node) throws ValueConverterException {
                if ("*".equals(string)) {
                    return -1;
                }
                return Integer.parseInt(string);
            }

        };
    }

    @ValueConverter(rule = "CommentBody")
    public IValueConverter<String> convertCommentBody() {
        return new AbstractNullSafeConverter<String>() {

            @Override
            protected String internalToString(String value) {
                return "\"" + escape(value) + "\"";
            }

            @Override
            protected String internalToValue(String string, INode node) throws ValueConverterException {
                if (string.length() < 2) {
                    throw new ValueConverterException("The given string is too short to be a string.", node,
                            new IllegalArgumentException());
                }
                if (!string.startsWith("\"") || !string.endsWith("\"")) {
                    throw new ValueConverterException("The given string is not quoted.", node,
                            new IllegalArgumentException());
                }
                String unquotedString = string.substring(1, string.length() - 1);
                return unescape(unquotedString);
            }

            private String escape(String value) {
                return StringEscapeUtils.escapeJava(value);
            }

            private String unescape(String value) {
                return StringEscapeUtils.unescapeJava(value);
            }
        };
    }

}
