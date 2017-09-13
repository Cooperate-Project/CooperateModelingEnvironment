/**
 */
package dummy.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import dummy.DummyPackage;
import dummy.ReferencingElement;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dummy.impl.ReferencingElementImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link dummy.impl.ReferencingElementImpl#getAppliedStereotypes <em>Applied Stereotypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencingElementImpl extends CDOObjectImpl implements ReferencingElement {
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
	protected ReferencingElementImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DummyPackage.Literals.REFERENCING_ELEMENT;
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
	public Element getReferencedElement() {
        return (Element)eDynamicGet(DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element basicGetReferencedElement() {
        return (Element)eDynamicGet(DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(Element newReferencedElement) {
        eDynamicSet(DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<StereotypeApplication> getAppliedStereotypes() {
        return (EList<StereotypeApplication>)eDynamicGet(DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAppliedStereotypes() {
        eDynamicUnset(DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAppliedStereotypes() {
        return eDynamicIsSet(DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES);
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                return ((InternalEList<?>)getAppliedStereotypes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
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
            case DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                setReferencedElement((Element)newValue);
                return;
            case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
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
            case DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                setReferencedElement((Element)null);
                return;
            case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                unsetAppliedStereotypes();
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
            case DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT:
                return REFERENCED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
            case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES:
                return isSetAppliedStereotypes();
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
        if (baseClass == de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                case DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;
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
        if (baseClass == de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return DummyPackage.REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES: return DummyPackage.REFERENCING_ELEMENT__APPLIED_STEREOTYPES;
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
        if (baseClass == de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element.class) {
            switch (baseOperationID) {
                case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return DummyPackage.REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case DummyPackage.REFERENCING_ELEMENT___GET_NEAREST_PACKAGE:
                return getNearestPackage();
        }
        return super.eInvoke(operationID, arguments);
    }

} //ReferencingElementImpl
