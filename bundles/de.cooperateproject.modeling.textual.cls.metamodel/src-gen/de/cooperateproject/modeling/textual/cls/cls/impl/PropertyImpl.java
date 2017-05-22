/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Property;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.PropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyImpl<T extends NamedElement> extends UMLReferencingElementImpl<T> implements Property<T> {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

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
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(T newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(ClsPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ClsPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(ClsPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(ClsPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(ClsPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(ClsPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return (Boolean)eDynamicGet(ClsPackage.PROPERTY__STATIC, ClsPackage.Literals.PROPERTY__STATIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        eDynamicSet(ClsPackage.PROPERTY__STATIC, ClsPackage.Literals.PROPERTY__STATIC, newStatic);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getType() {
        return (Classifier)eDynamicGet(ClsPackage.PROPERTY__TYPE, ClsPackage.Literals.PROPERTY__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetType() {
        return (Classifier)eDynamicGet(ClsPackage.PROPERTY__TYPE, ClsPackage.Literals.PROPERTY__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Classifier newType) {
        eDynamicSet(ClsPackage.PROPERTY__TYPE, ClsPackage.Literals.PROPERTY__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.PROPERTY__NAME:
                return getName();
            case ClsPackage.PROPERTY__VISIBILITY:
                return getVisibility();
            case ClsPackage.PROPERTY__STATIC:
                return isStatic();
            case ClsPackage.PROPERTY__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case ClsPackage.PROPERTY__NAME:
                setName((String)newValue);
                return;
            case ClsPackage.PROPERTY__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case ClsPackage.PROPERTY__STATIC:
                setStatic((Boolean)newValue);
                return;
            case ClsPackage.PROPERTY__TYPE:
                setType((Classifier)newValue);
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
            case ClsPackage.PROPERTY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClsPackage.PROPERTY__VISIBILITY:
                unsetVisibility();
                return;
            case ClsPackage.PROPERTY__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case ClsPackage.PROPERTY__TYPE:
                setType((Classifier)null);
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
            case ClsPackage.PROPERTY__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ClsPackage.PROPERTY__VISIBILITY:
                return isSetVisibility();
            case ClsPackage.PROPERTY__STATIC:
                return isStatic() != STATIC_EDEFAULT;
            case ClsPackage.PROPERTY__TYPE:
                return basicGetType() != null;
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
        if (baseClass == de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.PROPERTY__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (derivedFeatureID) {
                case ClsPackage.PROPERTY__VISIBILITY: return TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY;
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
        if (baseClass == de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ClsPackage.PROPERTY__NAME;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY: return ClsPackage.PROPERTY__VISIBILITY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PropertyImpl
