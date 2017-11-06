/**
 */
package de.cooperateproject.modeling.textual.component.cmp.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.NamedElementImpl;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl#getRealizedClassifier <em>Realized Classifier</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.component.cmp.impl.PortImpl#isConjugated <em>Conjugated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port {
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
     * The cached setting delegate for the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedElement()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate REFERENCED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).getSettingDelegate();

    /**
     * The default value of the '{@link #isConjugated() <em>Conjugated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConjugated()
     * @generated
     * @ordered
     */
    protected static final boolean CONJUGATED_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CmpPackage.Literals.PORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(CmpPackage.PORT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(CmpPackage.PORT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(CmpPackage.PORT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(CmpPackage.PORT__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Port getReferencedElement() {
        return (org.eclipse.uml2.uml.Port)eDynamicGet(CmpPackage.PORT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Port basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Port)eDynamicGet(CmpPackage.PORT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(org.eclipse.uml2.uml.Port newReferencedElement) {
        eDynamicSet(CmpPackage.PORT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier> getRealizedClassifier() {
        return (de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier>)eDynamicGet(CmpPackage.PORT__REALIZED_CLASSIFIER, CmpPackage.Literals.PORT__REALIZED_CLASSIFIER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier> basicGetRealizedClassifier() {
        return (de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier>)eDynamicGet(CmpPackage.PORT__REALIZED_CLASSIFIER, CmpPackage.Literals.PORT__REALIZED_CLASSIFIER, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealizedClassifier(de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier> newRealizedClassifier) {
        eDynamicSet(CmpPackage.PORT__REALIZED_CLASSIFIER, CmpPackage.Literals.PORT__REALIZED_CLASSIFIER, newRealizedClassifier);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConjugated() {
        return (Boolean)eDynamicGet(CmpPackage.PORT__CONJUGATED, CmpPackage.Literals.PORT__CONJUGATED, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConjugated(boolean newConjugated) {
        eDynamicSet(CmpPackage.PORT__CONJUGATED, CmpPackage.Literals.PORT__CONJUGATED, newConjugated);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConjugated() {
        eDynamicUnset(CmpPackage.PORT__CONJUGATED, CmpPackage.Literals.PORT__CONJUGATED);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConjugated() {
        return eDynamicIsSet(CmpPackage.PORT__CONJUGATED, CmpPackage.Literals.PORT__CONJUGATED);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Namespace getUMLParentNamespace() {
        EObject currentElement = Optional.ofNullable(getReferencedElement()).map(EObject::eContainer).orElse(null);
        while (currentElement != null && !(currentElement instanceof Namespace)) {
            currentElement = currentElement.eContainer();
        }
        return Optional.ofNullable(currentElement).filter(Namespace.class::isInstance).map(Namespace.class::cast).orElse(null);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CmpPackage.PORT__VISIBILITY:
                return getVisibility();
            case CmpPackage.PORT__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case CmpPackage.PORT__REALIZED_CLASSIFIER:
                if (resolve) return getRealizedClassifier();
                return basicGetRealizedClassifier();
            case CmpPackage.PORT__CONJUGATED:
                return isConjugated();
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
            case CmpPackage.PORT__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case CmpPackage.PORT__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Port)newValue);
                return;
            case CmpPackage.PORT__REALIZED_CLASSIFIER:
                setRealizedClassifier((de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier>)newValue);
                return;
            case CmpPackage.PORT__CONJUGATED:
                setConjugated((Boolean)newValue);
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
            case CmpPackage.PORT__VISIBILITY:
                unsetVisibility();
                return;
            case CmpPackage.PORT__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Port)null);
                return;
            case CmpPackage.PORT__REALIZED_CLASSIFIER:
                setRealizedClassifier((de.cooperateproject.modeling.textual.component.cmp.Classifier<Classifier>)null);
                return;
            case CmpPackage.PORT__CONJUGATED:
                unsetConjugated();
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
            case CmpPackage.PORT__VISIBILITY:
                return isSetVisibility();
            case CmpPackage.PORT__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case CmpPackage.PORT__REALIZED_CLASSIFIER:
                return basicGetRealizedClassifier() != null;
            case CmpPackage.PORT__CONJUGATED:
                return isSetConjugated();
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
        if (baseClass == VisibilityHavingElement.class) {
            switch (derivedFeatureID) {
                case CmpPackage.PORT__VISIBILITY: return TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY;
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case CmpPackage.PORT__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY: return CmpPackage.PORT__VISIBILITY;
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return CmpPackage.PORT__REFERENCED_ELEMENT;
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
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseOperationID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE: return CmpPackage.PORT___GET_UML_PARENT_NAMESPACE;
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
            case CmpPackage.PORT___GET_UML_PARENT_NAMESPACE:
                return getUMLParentNamespace();
        }
        return super.eInvoke(operationID, arguments);
    }

} //PortImpl
