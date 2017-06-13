/**
 */
package dummy.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import dummy.DummyPackage;
import dummy.ReferencingElement2;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencing Element2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dummy.impl.ReferencingElement2Impl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencingElement2Impl extends CDOObjectImpl implements ReferencingElement2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencingElement2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DummyPackage.Literals.REFERENCING_ELEMENT2;
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
		return (Element)eDynamicGet(DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetReferencedElement() {
		return (Element)eDynamicGet(DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(Element newReferencedElement) {
		eDynamicSet(DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
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
			case DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT:
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
			case DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT:
				setReferencedElement((Element)newValue);
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
			case DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT:
				setReferencedElement((Element)null);
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
			case DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
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
				case DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return DummyPackage.REFERENCING_ELEMENT2__REFERENCED_ELEMENT;
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
				case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return DummyPackage.REFERENCING_ELEMENT2___GET_NEAREST_PACKAGE;
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
			case DummyPackage.REFERENCING_ELEMENT2___GET_NEAREST_PACKAGE:
				return getNearestPackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReferencingElement2Impl
