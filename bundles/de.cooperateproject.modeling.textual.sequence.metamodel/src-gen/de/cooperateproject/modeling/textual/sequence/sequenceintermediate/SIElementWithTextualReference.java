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
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getUniqueIdentifierOfReferencedElement <em>Unique Identifier Of Referenced Element</em>}</li>
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
     * @model kind="reference" transient="true"
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

    /**
     * Returns the value of the '<em><b>Unique Identifier Of Referenced Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique Identifier Of Referenced Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique Identifier Of Referenced Element</em>' attribute.
     * @see #setUniqueIdentifierOfReferencedElement(String)
     * @see de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage#getSIElementWithTextualReference_UniqueIdentifierOfReferencedElement()
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate!SIElementWithTextualReference{ElementType}!uniqueIdentifierOfReferencedElement'"
     * @generated
     */
    String getUniqueIdentifierOfReferencedElement();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference#getUniqueIdentifierOfReferencedElement <em>Unique Identifier Of Referenced Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique Identifier Of Referenced Element</em>' attribute.
     * @see #getUniqueIdentifierOfReferencedElement()
     * @generated
     */
    void setUniqueIdentifierOfReferencedElement(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils.getUniqueIdentifierForSequenceElement(this.getReferencedElement());'"
     * @generated
     */
    String calculateUniqueIdentifier();

} // SIElementWithTextualReference
