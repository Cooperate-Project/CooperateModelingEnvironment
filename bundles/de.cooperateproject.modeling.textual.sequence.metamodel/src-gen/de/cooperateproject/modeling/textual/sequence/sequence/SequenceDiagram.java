/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram#getRootPackage <em>Root Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getSequenceDiagram()
 * @model
 * @generated
 */
public interface SequenceDiagram extends UMLReferencingElement<Interaction>, FragmentSequence {
    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getSequenceDiagram_Title()
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/Sequence!SequenceDiagram!title'"
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Root Package</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Package</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Package</em>' containment reference.
     * @see #setRootPackage(RootPackage)
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getSequenceDiagram_RootPackage()
     * @model containment="true" required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/Sequence!SequenceDiagram!rootPackage'"
     * @generated
     */
    RootPackage getRootPackage();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram#getRootPackage <em>Root Package</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Package</em>' containment reference.
     * @see #getRootPackage()
     * @generated
     */
    void setRootPackage(RootPackage value);

    /**
     * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
     * The list contents are of type {@link de.cooperateproject.modeling.textual.sequence.sequence.Actor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actors</em>' containment reference list.
     * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getSequenceDiagram_Actors()
     * @model containment="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/Sequence!SequenceDiagram!actors'"
     * @generated
     */
    EList<Actor> getActors();

} // SequenceDiagram
