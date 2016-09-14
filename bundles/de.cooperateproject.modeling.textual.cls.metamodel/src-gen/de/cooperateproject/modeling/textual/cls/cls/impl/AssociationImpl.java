/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Commentable;
import de.cooperateproject.modeling.textual.cls.cls.Connector;
import de.cooperateproject.modeling.textual.cls.cls.TypedConnector;

import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.AssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends NamedElementImpl<Association> implements de.cooperateproject.modeling.textual.cls.cls.Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLTypeReference getLeft() {
		return (UMLTypeReference)eGet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(UMLTypeReference newLeft) {
		eSet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLTypeReference getRight() {
		return (UMLTypeReference)eGet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(UMLTypeReference newRight) {
		eSet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		return (Comment)eGet(ClsPackage.Literals.COMMENTABLE__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(Comment newComment) {
		eSet(ClsPackage.Literals.COMMENTABLE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationProperties getProperties() {
		return (AssociationProperties)eGet(ClsPackage.Literals.ASSOCIATION__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(AssociationProperties newProperties) {
		eSet(ClsPackage.Literals.ASSOCIATION__PROPERTIES, newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregationKind() {
		return (AggregationKind)eGet(ClsPackage.Literals.ASSOCIATION__AGGREGATION_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationKind(AggregationKind newAggregationKind) {
		eSet(ClsPackage.Literals.ASSOCIATION__AGGREGATION_KIND, newAggregationKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return (Boolean)eGet(ClsPackage.Literals.ASSOCIATION__BIDIRECTIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		eSet(ClsPackage.Literals.ASSOCIATION__BIDIRECTIONAL, newBidirectional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getCommentedElement() {
		return getReferencedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedConnector.class) {
			switch (derivedFeatureID) {
				case ClsPackage.ASSOCIATION__LEFT: return ClsPackage.TYPED_CONNECTOR__LEFT;
				case ClsPackage.ASSOCIATION__RIGHT: return ClsPackage.TYPED_CONNECTOR__RIGHT;
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case ClsPackage.ASSOCIATION__COMMENT: return ClsPackage.COMMENTABLE__COMMENT;
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
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedConnector.class) {
			switch (baseFeatureID) {
				case ClsPackage.TYPED_CONNECTOR__LEFT: return ClsPackage.ASSOCIATION__LEFT;
				case ClsPackage.TYPED_CONNECTOR__RIGHT: return ClsPackage.ASSOCIATION__RIGHT;
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case ClsPackage.COMMENTABLE__COMMENT: return ClsPackage.ASSOCIATION__COMMENT;
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
		if (baseClass == Connector.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TypedConnector.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Commentable.class) {
			switch (baseOperationID) {
				case ClsPackage.COMMENTABLE___GET_COMMENTED_ELEMENT: return ClsPackage.ASSOCIATION___GET_COMMENTED_ELEMENT;
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
			case ClsPackage.ASSOCIATION___GET_COMMENTED_ELEMENT:
				return getCommentedElement();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssociationImpl
