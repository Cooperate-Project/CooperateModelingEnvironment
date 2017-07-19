/**
 */
package de.cooperateproject.modeling.textual.component.metamodel.component.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.metamodel.component.Require;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.metamodel.component.impl.RequireImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireImpl extends InterfaceRelationImpl implements Require {
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
    protected RequireImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.REQUIRE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency getReferencedElement() {
        return (Dependency)eDynamicGet(ComponentPackage.REQUIRE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency basicGetReferencedElement() {
        return (Dependency)eDynamicGet(ComponentPackage.REQUIRE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(Dependency newReferencedElement) {
        eDynamicSet(ComponentPackage.REQUIRE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageBase<?> getNearestPackage() {
        EObject parent = this;
        while (parent != null && !(parent instanceof PackageBase)) {
            parent = parent.eContainer();
        }
        return (PackageBase<?>)parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.REQUIRE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
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
            case ComponentPackage.REQUIRE__REFERENCED_ELEMENT:
                setReferencedElement((Dependency)newValue);
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
            case ComponentPackage.REQUIRE__REFERENCED_ELEMENT:
                setReferencedElement((Dependency)null);
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
            case ComponentPackage.REQUIRE__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case ComponentPackage.REQUIRE__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ComponentPackage.REQUIRE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (baseOperationID) {
                case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ComponentPackage.REQUIRE___GET_NEAREST_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ComponentPackage.REQUIRE___GET_NEAREST_PACKAGE:
                return getNearestPackage();
        }
        return super.eInvoke(operationID, arguments);
    }

} //RequireImpl
