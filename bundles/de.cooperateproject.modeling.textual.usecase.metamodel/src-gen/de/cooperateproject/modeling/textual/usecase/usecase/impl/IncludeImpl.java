/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.IncludeImpl#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends CDOObjectImpl implements Include {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IncludeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.INCLUDE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Include getReferencedElement() {
        return (org.eclipse.uml2.uml.Include)eDynamicGet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Include basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Include)eDynamicGet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.Include newReferencedElement) {
        eDynamicSet(UsecasePackage.INCLUDE__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getAddition() {
        return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__ADDITION, UsecasePackage.Literals.INCLUDE__ADDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetAddition() {
        return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__ADDITION, UsecasePackage.Literals.INCLUDE__ADDITION, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddition(UseCase newAddition) {
        eDynamicSet(UsecasePackage.INCLUDE__ADDITION, UsecasePackage.Literals.INCLUDE__ADDITION, newAddition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase getIncludingCase() {
        return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__INCLUDING_CASE, UsecasePackage.Literals.INCLUDE__INCLUDING_CASE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase basicGetIncludingCase() {
        return (UseCase)eDynamicGet(UsecasePackage.INCLUDE__INCLUDING_CASE, UsecasePackage.Literals.INCLUDE__INCLUDING_CASE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncludingCase(UseCase newIncludingCase) {
        eDynamicSet(UsecasePackage.INCLUDE__INCLUDING_CASE, UsecasePackage.Literals.INCLUDE__INCLUDING_CASE, newIncludingCase);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.INCLUDE__ADDITION:
                if (resolve) return getAddition();
                return basicGetAddition();
            case UsecasePackage.INCLUDE__INCLUDING_CASE:
                if (resolve) return getIncludingCase();
                return basicGetIncludingCase();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Include)newValue);
                return;
            case UsecasePackage.INCLUDE__ADDITION:
                setAddition((UseCase)newValue);
                return;
            case UsecasePackage.INCLUDE__INCLUDING_CASE:
                setIncludingCase((UseCase)newValue);
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
            case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Include)null);
                return;
            case UsecasePackage.INCLUDE__ADDITION:
                setAddition((UseCase)null);
                return;
            case UsecasePackage.INCLUDE__INCLUDING_CASE:
                setIncludingCase((UseCase)null);
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
            case UsecasePackage.INCLUDE__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case UsecasePackage.INCLUDE__ADDITION:
                return basicGetAddition() != null;
            case UsecasePackage.INCLUDE__INCLUDING_CASE:
                return basicGetIncludingCase() != null;
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
                case UsecasePackage.INCLUDE__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
                case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.INCLUDE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //IncludeImpl
