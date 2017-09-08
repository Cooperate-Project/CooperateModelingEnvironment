/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl#getAppliedStereotypes <em>Applied Stereotypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UMLReferencingElementImpl<UMLType extends Element> extends ElementImpl implements UMLReferencingElement<UMLType> {
	/**
     * The cached setting delegate for the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate REFERENCED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).getSettingDelegate();

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected UMLReferencingElementImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	public UMLType getReferencedElement() {
        return (UMLType)eDynamicGet(TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UMLType basicGetReferencedElement() {
        return (UMLType)eDynamicGet(TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(UMLType newReferencedElement) {
        eDynamicSet(TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<StereotypeApplication> getAppliedStereotypes() {
        return (EList<StereotypeApplication>)eDynamicGet(TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                return getAppliedStereotypes();
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
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                setReferencedElement((UMLType)newValue);
                return;
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
                getAppliedStereotypes().addAll((Collection<? extends StereotypeApplication>)newValue);
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
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                setReferencedElement((UMLType)null);
                return;
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
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
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                return !getAppliedStereotypes().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //UMLReferencingElementImpl
