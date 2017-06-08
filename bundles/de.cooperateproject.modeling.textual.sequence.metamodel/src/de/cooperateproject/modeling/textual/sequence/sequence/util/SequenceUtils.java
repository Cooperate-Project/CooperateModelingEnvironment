package de.cooperateproject.modeling.textual.sequence.sequence.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.InteractionFragment;

import de.cooperateproject.modeling.textual.sequence.sequence.Fragment;
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence;
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

public class SequenceUtils {
    private SequenceUtils() {
    }
    
    
    @SuppressWarnings("unchecked")
    public static <T extends EObject> T getClosestParentOfType(final EClass clazz, final EObject element) {
        EObject res = element.eContainer();
        while (res != null && !(clazz.isInstance(res))) {
            res = res.eContainer();
        }
        return (T) res;
    }
    
    public static FragmentSequence determineClosestContainingFragmentSequence(Fragment fragment) {
        return (FragmentSequence) getClosestParentOfType(SequencePackage.eINSTANCE.getFragmentSequence(), fragment);
    }

    public static EList<InteractionFragment> getUMLFragmentSequence(FragmentSequence sequenceDiagram) {
        throw new UnsupportedOperationException("The abstract type FragmentSequence does not define a UML equivalent");
    }
    
    public static boolean isArrivalOccurrence(OccurenceSpecification<?> spec) {
        EObject m = getClosestParentOfType(SequencePackage.eINSTANCE.getMessage(), spec);
        return m != null && m.eGet(SequencePackage.eINSTANCE.getMessage_ArrivalEvent()).equals(spec.getOccurenceReference());
    }
    
    public static boolean isSendOccurrence(OccurenceSpecification<?> spec) {
        EObject m = getClosestParentOfType(SequencePackage.eINSTANCE.getMessage(), spec);
        return m != null && m.eGet(SequencePackage.eINSTANCE.getMessage_SendEvent()).equals(spec.getOccurenceReference());
    }
    
    public static EList<InteractionFragment> getUMLFragmentSequence(SequenceDiagram sequenceDiagram) {
        if (sequenceDiagram.getReferencedElement() != null) {
            return sequenceDiagram.getReferencedElement().getFragments();
        }
        return null;
    }
    
    public static EList<InteractionFragment> getUMLFragmentSequence(OrderedFragmentContainer container) {
        if (container.getReferencedElement() != null) {
            return container.getReferencedElement().getFragments();
        }
        return null;
    }

}
