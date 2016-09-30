/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.Commentable;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentLinkImpl extends ElementImpl implements CommentLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.COMMENT_LINK;
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
	public UMLTypeReference getLeft() {
		return (UMLTypeReference)eGet(ClsPackage.Literals.COMMENT_LINK__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(UMLTypeReference newLeft) {
		eSet(ClsPackage.Literals.COMMENT_LINK__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasComment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (getComment() == null) {
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic(BasicDiagnostic.ERROR, "hasComment", 1, "A comment link must have a comment.", new Object[]{this});
			diagnostics.add(basicDiagnostic);
			return false;
		}
		diagnostics.add(BasicDiagnostic.OK_INSTANCE);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getCommentedElement() {
		if (getLeft() instanceof UMLTypeReference) {
			return ((UMLTypeReference)getLeft()).getType();
		}
		throw new IllegalStateException("Internal error in determining commented UML element.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Commentable.class) {
			switch (derivedFeatureID) {
				case ClsPackage.COMMENT_LINK__COMMENT: return ClsPackage.COMMENTABLE__COMMENT;
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
		if (baseClass == Commentable.class) {
			switch (baseFeatureID) {
				case ClsPackage.COMMENTABLE__COMMENT: return ClsPackage.COMMENT_LINK__COMMENT;
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
		if (baseClass == Commentable.class) {
			switch (baseOperationID) {
				case ClsPackage.COMMENTABLE___GET_COMMENTED_ELEMENT: return ClsPackage.COMMENT_LINK___GET_COMMENTED_ELEMENT;
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
			case ClsPackage.COMMENT_LINK___HAS_COMMENT__DIAGNOSTICCHAIN_MAP:
				return hasComment((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ClsPackage.COMMENT_LINK___GET_COMMENTED_ELEMENT:
				return getCommentedElement();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommentLinkImpl
