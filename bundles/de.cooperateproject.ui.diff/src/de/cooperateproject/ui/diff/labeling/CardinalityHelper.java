package de.cooperateproject.ui.diff.labeling;

/**
 * Helps converting the Integers coming from Cardinality into String.
 * 
 * @author Jasmin
 *
 */
public class CardinalityHelper {

	public String convertToString(Integer number) {
		String ret;
		if (number == -1) {
			ret = "*";
		} else {
			ret = number.toString();
		}
		return ret;
	}
}
