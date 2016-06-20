/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Member;
import de.cooperateproject.modeling.textual.cls.cls.Visibility;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
public abstract class ClassifierImpl<T extends Classifier> extends NamedElementLongNameImpl<T> implements de.cooperateproject.modeling.textual.cls.cls.Classifier<T> {
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

} //ClassifierImpl
