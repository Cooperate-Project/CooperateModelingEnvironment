/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.util;

import de.cooperateproject.modeling.textual.sequence.sequence.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage
 * @generated
 */
public class SequenceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SequencePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SequencePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SequencePackage.SEQUENCE_DIAGRAM:
      {
        SequenceDiagram sequenceDiagram = (SequenceDiagram)theEObject;
        T result = caseSequenceDiagram(sequenceDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.ROOT_PACKAGE:
      {
        RootPackage rootPackage = (RootPackage)theEObject;
        T result = caseRootPackage(rootPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.INTERACTION_FRAGMENT:
      {
        InteractionFragment interactionFragment = (InteractionFragment)theEObject;
        T result = caseInteractionFragment(interactionFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseInteractionFragment(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.FOUND_MESSAGE:
      {
        FoundMessage foundMessage = (FoundMessage)theEObject;
        T result = caseFoundMessage(foundMessage);
        if (result == null) result = caseMessage(foundMessage);
        if (result == null) result = caseInteractionFragment(foundMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.LOST_MESSAGE:
      {
        LostMessage lostMessage = (LostMessage)theEObject;
        T result = caseLostMessage(lostMessage);
        if (result == null) result = caseMessage(lostMessage);
        if (result == null) result = caseInteractionFragment(lostMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.OCCURENCE_SPECIFICATION:
      {
        OccurenceSpecification occurenceSpecification = (OccurenceSpecification)theEObject;
        T result = caseOccurenceSpecification(occurenceSpecification);
        if (result == null) result = caseInteractionFragment(occurenceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.DESTRUCTION_OCCURENCE_SPECIFICATION:
      {
        DestructionOccurenceSpecification destructionOccurenceSpecification = (DestructionOccurenceSpecification)theEObject;
        T result = caseDestructionOccurenceSpecification(destructionOccurenceSpecification);
        if (result == null) result = caseOccurenceSpecification(destructionOccurenceSpecification);
        if (result == null) result = caseInteractionFragment(destructionOccurenceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencePackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceDiagram(SequenceDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRootPackage(RootPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFragment(InteractionFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Found Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Found Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFoundMessage(FoundMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lost Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lost Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLostMessage(LostMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occurence Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOccurenceSpecification(OccurenceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestructionOccurenceSpecification(DestructionOccurenceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SequenceSwitch
