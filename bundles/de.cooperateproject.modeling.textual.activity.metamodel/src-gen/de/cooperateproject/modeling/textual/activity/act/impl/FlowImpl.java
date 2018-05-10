/**
 */
package de.cooperateproject.modeling.textual.activity.act.impl;

import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.Flow;
import de.cooperateproject.modeling.textual.activity.act.Node;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.activity.act.impl.FlowImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends UMLReferencingElementImpl<ControlFlow> implements Flow {
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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setReferencedElement(ControlFlow newReferencedElement) {
		super.setReferencedElement(newReferencedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ActPackage.FLOW__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ActPackage.FLOW__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eDynamicUnset(ActPackage.FLOW__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eDynamicIsSet(ActPackage.FLOW__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return (String)eDynamicGet(ActPackage.FLOW__CONDITION, ActPackage.Literals.FLOW__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		eDynamicSet(ActPackage.FLOW__CONDITION, ActPackage.Literals.FLOW__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Node<ActivityNode> getSource() {
		return (Node<ActivityNode>)eDynamicGet(ActPackage.FLOW__SOURCE, ActPackage.Literals.FLOW__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node<ActivityNode> basicGetSource() {
		return (Node<ActivityNode>)eDynamicGet(ActPackage.FLOW__SOURCE, ActPackage.Literals.FLOW__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Node<ActivityNode> newSource) {
		eDynamicSet(ActPackage.FLOW__SOURCE, ActPackage.Literals.FLOW__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Node<ActivityNode> getTarget() {
		return (Node<ActivityNode>)eDynamicGet(ActPackage.FLOW__TARGET, ActPackage.Literals.FLOW__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node<ActivityNode> basicGetTarget() {
		return (Node<ActivityNode>)eDynamicGet(ActPackage.FLOW__TARGET, ActPackage.Literals.FLOW__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Node<ActivityNode> newTarget) {
		eDynamicSet(ActPackage.FLOW__TARGET, ActPackage.Literals.FLOW__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActPackage.FLOW__NAME:
				return getName();
			case ActPackage.FLOW__CONDITION:
				return getCondition();
			case ActPackage.FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActPackage.FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ActPackage.FLOW__NAME:
				setName((String)newValue);
				return;
			case ActPackage.FLOW__CONDITION:
				setCondition((String)newValue);
				return;
			case ActPackage.FLOW__SOURCE:
				setSource((Node<ActivityNode>)newValue);
				return;
			case ActPackage.FLOW__TARGET:
				setTarget((Node<ActivityNode>)newValue);
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
			case ActPackage.FLOW__NAME:
				unsetName();
				return;
			case ActPackage.FLOW__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case ActPackage.FLOW__SOURCE:
				setSource((Node<ActivityNode>)null);
				return;
			case ActPackage.FLOW__TARGET:
				setTarget((Node<ActivityNode>)null);
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
			case ActPackage.FLOW__NAME:
				return isSetName();
			case ActPackage.FLOW__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case ActPackage.FLOW__SOURCE:
				return basicGetSource() != null;
			case ActPackage.FLOW__TARGET:
				return basicGetTarget() != null;
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
				case ActPackage.FLOW__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
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
				case TextualCommonsPackage.NAMED_ELEMENT__NAME: return ActPackage.FLOW__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FlowImpl
