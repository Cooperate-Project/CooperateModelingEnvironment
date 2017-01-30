package de.cooperateproject.ui.diff.labeling;

/**
 * Helps converting the Integers coming from Cardinality into String.
 * @author Jasmin
 *
 */
public class CardinalityHelper {
	
	public String convertToString(Integer number){
		String ret = "";
		switch(number){
			case -1: ret = "*"; break;
			default: ret = number.toString();
		}
		return ret;
	}
}
