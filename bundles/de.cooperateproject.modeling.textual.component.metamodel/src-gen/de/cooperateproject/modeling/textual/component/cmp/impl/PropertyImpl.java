/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Property;

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
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PropertyImpl#getType <em>Type</em>}</li>
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
        return CmpPackage.Literals.PROPERTY;
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
        return (String)eDynamicGet(CmpPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(CmpPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        eDynamicUnset(CmpPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return eDynamicIsSet(CmpPackage.PROPERTY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(CmpPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(CmpPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(CmpPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(CmpPackage.PROPERTY__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return (Boolean)eDynamicGet(CmpPackage.PROPERTY__STATIC, CmpPackage.Literals.PROPERTY__STATIC, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        eDynamicSet(CmpPackage.PROPERTY__STATIC, CmpPackage.Literals.PROPERTY__STATIC, newStatic);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier getType() {
        return (Classifier)eDynamicGet(CmpPackage.PROPERTY__TYPE, CmpPackage.Literals.PROPERTY__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier basicGetType() {
        return (Classifier)eDynamicGet(CmpPackage.PROPERTY__TYPE, CmpPackage.Literals.PROPERTY__TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Classifier newType) {
        eDynamicSet(CmpPackage.PROPERTY__TYPE, CmpPackage.Literals.PROPERTY__TYPE, newType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType() {
        eDynamicUnset(CmpPackage.PROPERTY__TYPE, CmpPackage.Literals.PROPERTY__TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType() {
        return eDynamicIsSet(CmpPackage.PROPERTY__TYPE, CmpPackage.Literals.PROPERTY__TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.PROPERTY__NAME:
                return getName();
            case CmpPackage.PROPERTY__VISIBILITY:
                return getVisibility();
            case CmpPackage.PROPERTY__STATIC:
                return isStatic();
            case CmpPackage.PROPERTY__TYPE:
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
            case CmpPackage.PROPERTY__NAME:
                setName((String)newValue);
                return;
            case CmpPackage.PROPERTY__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case CmpPackage.PROPERTY__STATIC:
                setStatic((Boolean)newValue);
                return;
            case CmpPackage.PROPERTY__TYPE:
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
            case CmpPackage.PROPERTY__NAME:
                unsetName();
                return;
            case CmpPackage.PROPERTY__VISIBILITY:
                unsetVisibility();
                return;
            case CmpPackage.PROPERTY__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case CmpPackage.PROPERTY__TYPE:
                unsetType();
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
            case CmpPackage.PROPERTY__NAME:
                return isSetName();
            case CmpPackage.PROPERTY__VISIBILITY:
                return isSetVisibility();
            case CmpPackage.PROPERTY__STATIC:
                return isStatic() != STATIC_EDEFAULT;
            case CmpPackage.PROPERTY__TYPE:
                return isSetType();
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
                case CmpPackage.PROPERTY__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (derivedFeatureID) {
                case CmpPackage.PROPERTY__VISIBILITY: return TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY;
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
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return CmpPackage.PROPERTY__NAME;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY: return CmpPackage.PROPERTY__VISIBILITY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //PropertyImpl
