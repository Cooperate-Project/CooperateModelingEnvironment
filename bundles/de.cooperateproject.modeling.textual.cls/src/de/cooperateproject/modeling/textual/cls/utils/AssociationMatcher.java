package de.cooperateproject.modeling.textual.cls.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
        Optional<List<org.eclipse.uml2.uml.Classifier>> txtUMLTypes = findUMLTypes(txtAssociation);
        if (!txtUMLTypes.isPresent()) {
            return false;
        }
        List<Type> umlUMLTypes = umlAssociation.getMemberEnds().stream().map(Property::getType)
                .collect(Collectors.toList());
        if (txtUMLTypes.get().size() != umlUMLTypes.size() || txtUMLTypes.get().stream().anyMatch(Objects::isNull)) {
            return false;
        }

        for (int i = 0; i < txtUMLTypes.get().size(); ++i) {
            if (txtUMLTypes.get().get(i) != umlUMLTypes.get(mapIndexTxt2Uml(i, txtUMLTypes.get().size()))) {
                return false;
            }
        }
        return true;
    }

    private static Optional<List<org.eclipse.uml2.uml.Classifier>> findUMLTypes(XtextAssociation association) {
        List<org.eclipse.uml2.uml.Classifier> results = new ArrayList<>();
        for (XtextAssociationMemberEndReferencedType type : association.getMemberEndTypes()) {
            Optional<org.eclipse.uml2.uml.Classifier> foundUMLType = Optional.ofNullable(type.getType())
                    .map(Classifier::getReferencedElement);
            if (!foundUMLType.isPresent()) {
                return Optional.empty();
            }
            foundUMLType.ifPresent(results::add);
        }
        return Optional.of(results);
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
