package de.cooperateproject.modeling.textual.cls.utils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;

/**
 * Utility class to match textual associations and UML associations.
 */
public final class AssociationMatcher {

    private AssociationMatcher() {

    }

    /**
     * Find a UML association in the given UML package that matches the types of the given textual association.
     * 
     * @param txtAssociation
     *            The textual associations that includes the wanted member end types.
     * @param umlPackage
     *            The package in which the found association shall be located.
     * @return A set of matching associations.
     */
    public static Collection<Association> findUMLElements(XtextAssociation txtAssociation, Package umlPackage) {
        return umlPackage.getMembers().stream().filter(Association.class::isInstance).map(Association.class::cast)
                .filter(a -> AssociationMatcher.match(txtAssociation, a)).collect(Collectors.toSet());
    }

    /**
     * Matches the given textual with the given UML association based on the involved member end types.
     * 
     * @param txtAssociation
     *            The textual association.
     * @param umlAssociation
     *            The UML association.
     * @return True if all types match. False otherwise.
     */
    public static boolean match(XtextAssociation txtAssociation, Association umlAssociation) {
        List<org.eclipse.uml2.uml.Classifier> txtUMLTypes = txtAssociation.getMemberEndTypes().stream()
                .map(XtextAssociationMemberEndReferencedType::getType).map(Classifier::getReferencedElement)
                .collect(Collectors.toList());
        List<Type> umlUMLTypes = umlAssociation.getMemberEnds().stream().map(Property::getType)
                .collect(Collectors.toList());
        if (txtUMLTypes.size() != umlUMLTypes.size() || txtUMLTypes.stream().anyMatch(Objects::isNull)) {
            return false;
        }

        for (int i = 0; i < txtUMLTypes.size(); ++i) {
            if (txtUMLTypes.get(i) != umlUMLTypes.get(mapIndexTxt2Uml(i, txtUMLTypes.size()))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Maps the index of a member end from the textual to the UML model.
     * 
     * @param index
     *            The textual index.
     * @param amountOfMemberEnds
     *            The total amount of member ends.
     * @return The index of the matching member end in the UML model.
     */
    public static int mapIndexTxt2Uml(int index, int amountOfMemberEnds) {
        if (amountOfMemberEnds == 2) {
            return Math.abs(index - 1);
        }
        return index;
    }

}
