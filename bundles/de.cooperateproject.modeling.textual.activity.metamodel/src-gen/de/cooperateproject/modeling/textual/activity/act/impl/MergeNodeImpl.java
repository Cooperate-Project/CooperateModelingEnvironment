/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.MergeNode;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.MergeNodeImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeNodeImpl extends ControlNodeImpl implements MergeNode {
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
	protected MergeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActPackage.Literals.MERGE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.MergeNode getReferencedElement() {
		return (org.eclipse.uml2.uml.MergeNode)eDynamicGet(ActPackage.MERGE_NODE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.MergeNode basicGetReferencedElement() {
		return (org.eclipse.uml2.uml.MergeNode)eDynamicGet(ActPackage.MERGE_NODE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedElement(org.eclipse.uml2.uml.MergeNode newReferencedElement) {
		eDynamicSet(ActPackage.MERGE_NODE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
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
			case ActPackage.MERGE_NODE__REFERENCED_ELEMENT:
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
			case ActPackage.MERGE_NODE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.MergeNode)newValue);
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
			case ActPackage.MERGE_NODE__REFERENCED_ELEMENT:
				setReferencedElement((org.eclipse.uml2.uml.MergeNode)null);
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
			case ActPackage.MERGE_NODE__REFERENCED_ELEMENT:
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
				case ActPackage.MERGE_NODE__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
				case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return ActPackage.MERGE_NODE__REFERENCED_ELEMENT;
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
				case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ActPackage.MERGE_NODE___GET_NEAREST_PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == UMLReferencingElement.class) {
			switch (baseOperationID) {
				case TextualCommonsPackage.UML_REFERENCING_ELEMENT___GET_UML_PARENT_NAMESPACE: return ActPackage.MERGE_NODE___GET_UML_PARENT_NAMESPACE;
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
			case ActPackage.MERGE_NODE___GET_UML_PARENT_NAMESPACE:
				return getUMLParentNamespace();
			case ActPackage.MERGE_NODE___GET_NEAREST_PACKAGE:
				return getNearestPackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MergeNodeImpl
