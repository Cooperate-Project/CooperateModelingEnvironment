/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Having Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.VisibilityHavingElementImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VisibilityHavingElementImpl extends CDOObjectImpl implements VisibilityHavingElement {
    /**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VisibilityHavingElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT;
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
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY:
                return getVisibility();
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
            case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
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
            case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY:
                unsetVisibility();
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
            case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY:
                return isSetVisibility();
        }
        return super.eIsSet(featureID);
    }

} //VisibilityHavingElementImpl
