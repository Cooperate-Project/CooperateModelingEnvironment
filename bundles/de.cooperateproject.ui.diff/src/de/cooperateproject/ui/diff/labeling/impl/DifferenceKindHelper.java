package de.cooperateproject.ui.diff.labeling.impl;

import org.eclipse.emf.compare.DifferenceKind;

/**
 * Converts a DifferenceKind to another String representation
 * 
 * @author Jasmin, czogalik
 *
 */
public final class DifferenceKindHelper {

    private DifferenceKindHelper() {
        // Hide implicit public contructor.
    }

    /**
     * Converts a DifferenceKind to another String representation, a short token.
     * 
     * @param diffKind
     *            The DifferenceKind to be converted
     * @return a short String representation of the DifferenceKind
     */
    public static String convertToToken(DifferenceKind diffKind) {
        switch (diffKind) {
        case ADD:
            return "add";
        case DELETE:
            return "del";
        case MOVE:
            return "mov";
        case CHANGE:
            return "cha";
        default:
            return diffKind.toString();
        }
    }
}
