/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIElementWithTextualReference;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Element With Textual Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.SIElementWithTextualReferenceImpl#getUniqueIdentifierOfReferencedElement <em>Unique Identifier Of Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIElementWithTextualReferenceImpl<ElementType> extends MinimalEObjectImpl.Container implements SIElementWithTextualReference<ElementType> {
    /**
     * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected ElementType referencedElement;

    /**
     * The default value of the '{@link #getUniqueIdentifierOfReferencedElement() <em>Unique Identifier Of Referenced Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUniqueIdentifierOfReferencedElement()
     * @generated
     * @ordered
     */
    protected static final String UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getUniqueIdentifierOfReferencedElement() <em>Unique Identifier Of Referenced Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUniqueIdentifierOfReferencedElement()
     * @generated
     * @ordered
     */
    protected String uniqueIdentifierOfReferencedElement = UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SIElementWithTextualReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.SI_ELEMENT_WITH_TEXTUAL_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public ElementType getReferencedElement() {
        if (referencedElement != null && ((EObject)referencedElement).eIsProxy()) {
            InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
            referencedElement = (ElementType)eResolveProxy(oldReferencedElement);
            if (referencedElement != oldReferencedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
            }
        }
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementType basicGetReferencedElement() {
        return referencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(ElementType newReferencedElement) {
        ElementType oldReferencedElement = referencedElement;
        referencedElement = newReferencedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUniqueIdentifierOfReferencedElement() {
        return uniqueIdentifierOfReferencedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUniqueIdentifierOfReferencedElement(String newUniqueIdentifierOfReferencedElement) {
        String oldUniqueIdentifierOfReferencedElement = uniqueIdentifierOfReferencedElement;
        uniqueIdentifierOfReferencedElement = newUniqueIdentifierOfReferencedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT, oldUniqueIdentifierOfReferencedElement, uniqueIdentifierOfReferencedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String calculateUniqueIdentifier() {
        return de.cooperateproject.modeling.textual.sequence.sequence.util.SequenceUtils.getUniqueIdentifierForSequenceElement(this.getReferencedElement());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                return getUniqueIdentifierOfReferencedElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT:
                setReferencedElement((ElementType)newValue);
                return;
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                setUniqueIdentifierOfReferencedElement((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT:
                setReferencedElement((ElementType)null);
                return;
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                setUniqueIdentifierOfReferencedElement(UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT:
                return referencedElement != null;
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT:
                return UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT == null ? uniqueIdentifierOfReferencedElement != null : !UNIQUE_IDENTIFIER_OF_REFERENCED_ELEMENT_EDEFAULT.equals(uniqueIdentifierOfReferencedElement);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SequenceIntermediatePackage.SI_ELEMENT_WITH_TEXTUAL_REFERENCE___CALCULATE_UNIQUE_IDENTIFIER:
                return calculateUniqueIdentifier();
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (uniqueIdentifierOfReferencedElement: ");
        result.append(uniqueIdentifierOfReferencedElement);
        result.append(')');
        return result.toString();
    }

} //SIElementWithTextualReferenceImpl
