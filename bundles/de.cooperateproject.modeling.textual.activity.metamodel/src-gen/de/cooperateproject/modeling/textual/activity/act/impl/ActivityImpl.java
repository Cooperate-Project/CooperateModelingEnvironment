/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.Node;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.ActivityImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends UMLReferencingElementImpl<Activity> implements de.cooperateproject.modeling.textual.activity.act.Activity {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setReferencedElement(Activity newReferencedElement) {
		super.setReferencedElement(newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ActPackage.ACTIVITY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ActPackage.ACTIVITY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eDynamicUnset(ActPackage.ACTIVITY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eDynamicIsSet(ActPackage.ACTIVITY__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node<ActivityNode>> getNodes() {
		return (EList<Node<ActivityNode>>)eDynamicGet(ActPackage.ACTIVITY__NODES, ActPackage.Literals.CONTAINER__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Flow> getRelations() {
		return (EList<Flow>)eDynamicGet(ActPackage.ACTIVITY__RELATIONS, ActPackage.Literals.ACTIVITY__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<de.cooperateproject.modeling.textual.activity.act.Container> getChildren() {
		return (EList<de.cooperateproject.modeling.textual.activity.act.Container>)eDynamicGet(ActPackage.ACTIVITY__CHILDREN, ActPackage.Literals.ACTIVITY__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActPackage.ACTIVITY__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ActPackage.ACTIVITY__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ActPackage.ACTIVITY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ActPackage.ACTIVITY__NAME:
				return getName();
			case ActPackage.ACTIVITY__NODES:
				return getNodes();
			case ActPackage.ACTIVITY__RELATIONS:
				return getRelations();
			case ActPackage.ACTIVITY__CHILDREN:
				return getChildren();
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
			case ActPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ActPackage.ACTIVITY__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node<ActivityNode>>)newValue);
				return;
			case ActPackage.ACTIVITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Flow>)newValue);
				return;
			case ActPackage.ACTIVITY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends de.cooperateproject.modeling.textual.activity.act.Container>)newValue);
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
			case ActPackage.ACTIVITY__NAME:
				unsetName();
				return;
			case ActPackage.ACTIVITY__NODES:
				getNodes().clear();
				return;
			case ActPackage.ACTIVITY__RELATIONS:
				getRelations().clear();
				return;
			case ActPackage.ACTIVITY__CHILDREN:
				getChildren().clear();
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
			case ActPackage.ACTIVITY__NAME:
				return isSetName();
			case ActPackage.ACTIVITY__NODES:
				return !getNodes().isEmpty();
			case ActPackage.ACTIVITY__RELATIONS:
				return !getRelations().isEmpty();
			case ActPackage.ACTIVITY__CHILDREN:
				return !getChildren().isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ActPackage.ACTIVITY__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == de.cooperateproject.modeling.textual.activity.act.Container.class) {
			switch (derivedFeatureID) {
				case ActPackage.ACTIVITY__NODES: return ActPackage.CONTAINER__NODES;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ActPackage.ACTIVITY__NAME;
				default: return -1;
			}
		}
		if (baseClass == de.cooperateproject.modeling.textual.activity.act.Container.class) {
			switch (baseFeatureID) {
				case ActPackage.CONTAINER__NODES: return ActPackage.ACTIVITY__NODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
