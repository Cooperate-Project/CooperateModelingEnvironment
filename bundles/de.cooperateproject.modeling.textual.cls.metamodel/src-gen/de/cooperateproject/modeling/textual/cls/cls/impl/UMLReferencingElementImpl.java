/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.UMLReferencingElement;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Referencing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.UMLReferencingElementImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UMLReferencingElementImpl<T extends NamedElement> extends CDOObjectImpl implements UMLReferencingElement<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLReferencingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.UML_REFERENCING_ELEMENT;
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
	@Override
	@SuppressWarnings("unchecked")
	public T getReferencedElement() {
		return (T)eGet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedElement(T newReferencedElement) {
		eSet(ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
	}

} //UMLReferencingElementImpl
