/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Element With Textual Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIElementWithTextualReference()
 * @model
 * @generated
 */
public interface SIElementWithTextualReference<ElementType> extends EObject {
    /**
     * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Element</em>' reference.
     * @see #setReferencedElement(Object)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIElementWithTextualReference_ReferencedElement()
     * @model kind="reference"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIElementWithTextualReference{ElementType}!referencedElement'"
     * @generated
     */
    ElementType getReferencedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getReferencedElement <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Element</em>' reference.
     * @see #getReferencedElement()
     * @generated
     */
    void setReferencedElement(ElementType value);

} // SIElementWithTextualReference
