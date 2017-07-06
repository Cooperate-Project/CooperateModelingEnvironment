package de.cooperateproject.modeling.textual.sequence.sequence.util;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperatorKind;

import de.cooperateproject.modeling.textual.sequence.sequence.Alternative;
import de.cooperateproject.modeling.textual.sequence.sequence.CoRegion;
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment;
import de.cooperateproject.modeling.textual.sequence.sequence.Critical;
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment;
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentSequence;
import de.cooperateproject.modeling.textual.sequence.sequence.Loop;
import de.cooperateproject.modeling.textual.sequence.sequence.Message;
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType;
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceReference;
import de.cooperateproject.modeling.textual.sequence.sequence.OccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.Option;
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.Parallel;
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage;

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
        return Optional.<Message>ofNullable(getClosestParentOfType(SequencePackage.eINSTANCE.getMessage(), spec))
                .map(Message::getArrivalEvent)
                .map(OccurenceReference::getOccurenceSpecification)
                .map(e -> e.equals(spec)).orElse(false);
    }
    
    public static boolean isSendOccurrence(OccurenceSpecification<?> spec) {
        return Optional.<Message>ofNullable(getClosestParentOfType(SequencePackage.eINSTANCE.getMessage(), spec))
                .map(Message::getSendEvent)
                .map(OccurenceReference::getOccurenceSpecification)
                .map(e -> e.equals(spec)).orElse(false);
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
    
    private static Fragment getFragmentOfParentSequence(Fragment element, FragmentSequence parentSequence) {
        EObject result = element;
        while (result != null && result.eContainer() != parentSequence) {
            result = result.eContainer();
        }
        
        return (Fragment) result;
    }
    
    private static boolean isPotentialRequestResponsePair(StandardMessage m1, ResponseMessage m2) {
        return m1.getLeft() == m2.getRight()
                && m1.getRight() == m2.getLeft()
                && m1.getType() == MessageType.SYNC;
    }
    
    private static boolean isSimilarResponse(ResponseMessage m1, ResponseMessage m2) {
        return m1.getLeft() == m2.getLeft()
                && m1.getRight() == m2.getRight();
    }
    
    public static StandardMessage getSynchronousMessageCorrespondingToResponse(ResponseMessage response) {
        Deque<Message> relevantMessages = new LinkedList<>();
        Deque<Message> localMessages = new LinkedList<>();
        
        SequenceSwitch<Void> fragmentFilter = new SequenceSwitch<Void>() {
            public Void caseStandardMessage(StandardMessage candidate) {
                if (isPotentialRequestResponsePair(candidate, response)) {
                    localMessages.push(candidate);
                }
                return null;
            };
            
            public Void caseResponseMessage(ResponseMessage alternative) {
                if (isSimilarResponse(alternative, response)) {
                    localMessages.push(alternative);
                }
                return null;
            };
        };

        FragmentSequence parent = determineClosestContainingFragmentSequence(response);
        while (parent != null) {
            Fragment containedElement = getFragmentOfParentSequence(response, parent);
            for (Fragment frag : parent.getFragments()) {
                if (frag == containedElement) break;
                fragmentFilter.doSwitch(frag);
            }
            
            relevantMessages.addAll(localMessages);
            localMessages.clear();
            
            parent = getClosestParentOfType(SequencePackage.eINSTANCE.getFragmentSequence(), parent);
        }
        
        int levelCounter = 0;
        while (!relevantMessages.isEmpty()) {
            Message m = relevantMessages.poll();
            if (SequencePackage.eINSTANCE.getStandardMessage().isInstance(m)) {
                if (levelCounter == 0) {
                    return (StandardMessage) m;
                } else levelCounter--;
            } else {
                levelCounter++;
            }
        }
        return null;
    }
    
    private static final SequenceSwitch<InteractionOperatorKind> COMBINED_FRAGMENT_KIND_SWITCH = new SequenceSwitch<InteractionOperatorKind>() {
        @Override
        public InteractionOperatorKind caseAlternative(Alternative object) {
            return InteractionOperatorKind.ALT_LITERAL;
        }
        @Override
        public InteractionOperatorKind caseCoRegion(CoRegion object) {
            return InteractionOperatorKind.PAR_LITERAL;
        }
        @Override
        public InteractionOperatorKind caseCritical(Critical object) {
            return InteractionOperatorKind.CRITICAL_LITERAL;
        }
        @Override
        public InteractionOperatorKind caseLoop(Loop e) {
            return InteractionOperatorKind.LOOP_LITERAL;
        }
        @Override
        public InteractionOperatorKind caseOption(Option object) {
            return InteractionOperatorKind.OPT_LITERAL;
        }
        @Override
        public InteractionOperatorKind caseParallel(Parallel object) {
            return InteractionOperatorKind.PAR_LITERAL;
        }
        
    };
    
    public static InteractionOperatorKind getInteractionOperatorKindOfCombinedFragment(CombinedFragment fragment) {
        return COMBINED_FRAGMENT_KIND_SWITCH.doSwitch(fragment);
    }

}
