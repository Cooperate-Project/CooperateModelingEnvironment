/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Element;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.PackageableElement;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassifierImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl<T extends Classifier> extends NamedElementAliasedImpl<T> implements de.cooperateproject.modeling.textual.cls.cls.Classifier<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return (Visibility)eGet(ClsPackage.Literals.CLASSIFIER__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eSet(ClsPackage.Literals.CLASSIFIER__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member<?>> getMembers() {
		return (EList<Member<?>>)eGet(ClsPackage.Literals.CLASSIFIER__MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cooperateproject.modeling.textual.cls.cls.Package getNearestPackage() {
		EObject focus = this;
		while (focus != null && !(focus instanceof de.cooperateproject.modeling.textual.cls.cls.Package)) {
			focus = focus.eContainer();
		}
		return (de.cooperateproject.modeling.textual.cls.cls.Package)focus;
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
				case ClsPackage.ELEMENT___GET_NEAREST_PACKAGE: return ClsPackage.CLASSIFIER___GET_NEAREST_PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
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
			case ClsPackage.CLASSIFIER___GET_NEAREST_PACKAGE:
				return getNearestPackage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClassifierImpl
