/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl;

import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getAppliedStereotypes <em>Applied Stereotypes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl extends ElementImpl implements Extend {
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
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsecasePackage.Literals.EXTEND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Extend getReferencedElement() {
        return (org.eclipse.uml2.uml.Extend)eDynamicGet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Extend basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Extend)eDynamicGet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(org.eclipse.uml2.uml.Extend newReferencedElement) {
        eDynamicSet(UsecasePackage.EXTEND__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<StereotypeApplication> getAppliedStereotypes() {
        return (EList<StereotypeApplication>)eDynamicGet(UsecasePackage.EXTEND__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getExtension() {
        return (UseCase)eDynamicGet(UsecasePackage.EXTEND__EXTENSION, UsecasePackage.Literals.EXTEND__EXTENSION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetExtension() {
        return (UseCase)eDynamicGet(UsecasePackage.EXTEND__EXTENSION, UsecasePackage.Literals.EXTEND__EXTENSION, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(UseCase newExtension) {
        eDynamicSet(UsecasePackage.EXTEND__EXTENSION, UsecasePackage.Literals.EXTEND__EXTENSION, newExtension);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getExtendedCase() {
        return (UseCase)eDynamicGet(UsecasePackage.EXTEND__EXTENDED_CASE, UsecasePackage.Literals.EXTEND__EXTENDED_CASE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetExtendedCase() {
        return (UseCase)eDynamicGet(UsecasePackage.EXTEND__EXTENDED_CASE, UsecasePackage.Literals.EXTEND__EXTENDED_CASE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtendedCase(UseCase newExtendedCase) {
        eDynamicSet(UsecasePackage.EXTEND__EXTENDED_CASE, UsecasePackage.Literals.EXTEND__EXTENDED_CASE, newExtendedCase);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionPoint getExtensionLocation() {
        return (ExtensionPoint)eDynamicGet(UsecasePackage.EXTEND__EXTENSION_LOCATION, UsecasePackage.Literals.EXTEND__EXTENSION_LOCATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionPoint basicGetExtensionLocation() {
        return (ExtensionPoint)eDynamicGet(UsecasePackage.EXTEND__EXTENSION_LOCATION, UsecasePackage.Literals.EXTEND__EXTENSION_LOCATION, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtensionLocation(ExtensionPoint newExtensionLocation) {
        eDynamicSet(UsecasePackage.EXTEND__EXTENSION_LOCATION, UsecasePackage.Literals.EXTEND__EXTENSION_LOCATION, newExtensionLocation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCondition() {
        return (String)eDynamicGet(UsecasePackage.EXTEND__CONDITION, UsecasePackage.Literals.EXTEND__CONDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(String newCondition) {
        eDynamicSet(UsecasePackage.EXTEND__CONDITION, UsecasePackage.Literals.EXTEND__CONDITION, newCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.EXTEND__APPLIED_STEREOTYPES:
                return getAppliedStereotypes();
            case UsecasePackage.EXTEND__EXTENSION:
                if (resolve) return getExtension();
                return basicGetExtension();
            case UsecasePackage.EXTEND__EXTENDED_CASE:
                if (resolve) return getExtendedCase();
                return basicGetExtendedCase();
            case UsecasePackage.EXTEND__EXTENSION_LOCATION:
                if (resolve) return getExtensionLocation();
                return basicGetExtensionLocation();
            case UsecasePackage.EXTEND__CONDITION:
                return getCondition();
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
            case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Extend)newValue);
                return;
            case UsecasePackage.EXTEND__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
                getAppliedStereotypes().addAll((Collection<? extends StereotypeApplication>)newValue);
                return;
            case UsecasePackage.EXTEND__EXTENSION:
                setExtension((UseCase)newValue);
                return;
            case UsecasePackage.EXTEND__EXTENDED_CASE:
                setExtendedCase((UseCase)newValue);
                return;
            case UsecasePackage.EXTEND__EXTENSION_LOCATION:
                setExtensionLocation((ExtensionPoint)newValue);
                return;
            case UsecasePackage.EXTEND__CONDITION:
                setCondition((String)newValue);
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
            case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Extend)null);
                return;
            case UsecasePackage.EXTEND__APPLIED_STEREOTYPES:
                getAppliedStereotypes().clear();
                return;
            case UsecasePackage.EXTEND__EXTENSION:
                setExtension((UseCase)null);
                return;
            case UsecasePackage.EXTEND__EXTENDED_CASE:
                setExtendedCase((UseCase)null);
                return;
            case UsecasePackage.EXTEND__EXTENSION_LOCATION:
                setExtensionLocation((ExtensionPoint)null);
                return;
            case UsecasePackage.EXTEND__CONDITION:
                setCondition(CONDITION_EDEFAULT);
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
            case UsecasePackage.EXTEND__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case UsecasePackage.EXTEND__APPLIED_STEREOTYPES:
                return !getAppliedStereotypes().isEmpty();
            case UsecasePackage.EXTEND__EXTENSION:
                return basicGetExtension() != null;
            case UsecasePackage.EXTEND__EXTENDED_CASE:
                return basicGetExtendedCase() != null;
            case UsecasePackage.EXTEND__EXTENSION_LOCATION:
                return basicGetExtensionLocation() != null;
            case UsecasePackage.EXTEND__CONDITION:
                return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.EXTEND__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                case UsecasePackage.EXTEND__APPLIED_STEREOTYPES: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.EXTEND__REFERENCED_ELEMENT;
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES: return UsecasePackage.EXTEND__APPLIED_STEREOTYPES;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ExtendImpl
