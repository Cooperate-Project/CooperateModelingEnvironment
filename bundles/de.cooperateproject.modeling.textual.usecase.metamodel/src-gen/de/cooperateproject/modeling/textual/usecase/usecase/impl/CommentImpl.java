/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.usecase.usecase.Comment;
import de.cooperateproject.modeling.textual.usecase.usecase.Commentable;
import de.cooperateproject.modeling.textual.usecase.usecase.UMLReferencingElement;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.CommentImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.CommentImpl#getCommentedElement <em>Commented Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.CommentImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends RelationshipImpl implements Comment {
	/**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
	protected static final String COMMENT_EDEFAULT = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CommentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsecasePackage.Literals.COMMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Comment getReferencedElement() {
        return (org.eclipse.uml2.uml.Comment)eDynamicGet(UsecasePackage.COMMENT__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public org.eclipse.uml2.uml.Comment basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Comment)eDynamicGet(UsecasePackage.COMMENT__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReferencedElement(org.eclipse.uml2.uml.Comment newReferencedElement) {
        eDynamicSet(UsecasePackage.COMMENT__REFERENCED_ELEMENT, UsecasePackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Commentable getCommentedElement() {
        return (Commentable)eDynamicGet(UsecasePackage.COMMENT__COMMENTED_ELEMENT, UsecasePackage.Literals.COMMENT__COMMENTED_ELEMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Commentable basicGetCommentedElement() {
        return (Commentable)eDynamicGet(UsecasePackage.COMMENT__COMMENTED_ELEMENT, UsecasePackage.Literals.COMMENT__COMMENTED_ELEMENT, false, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCommentedElement(Commentable newCommentedElement) {
        eDynamicSet(UsecasePackage.COMMENT__COMMENTED_ELEMENT, UsecasePackage.Literals.COMMENT__COMMENTED_ELEMENT, newCommentedElement);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getComment() {
        return (String)eDynamicGet(UsecasePackage.COMMENT__COMMENT, UsecasePackage.Literals.COMMENT__COMMENT, true, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setComment(String newComment) {
        eDynamicSet(UsecasePackage.COMMENT__COMMENT, UsecasePackage.Literals.COMMENT__COMMENT, newComment);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.COMMENT__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case UsecasePackage.COMMENT__COMMENTED_ELEMENT:
                if (resolve) return getCommentedElement();
                return basicGetCommentedElement();
            case UsecasePackage.COMMENT__COMMENT:
                return getComment();
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
            case UsecasePackage.COMMENT__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Comment)newValue);
                return;
            case UsecasePackage.COMMENT__COMMENTED_ELEMENT:
                setCommentedElement((Commentable)newValue);
                return;
            case UsecasePackage.COMMENT__COMMENT:
                setComment((String)newValue);
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
            case UsecasePackage.COMMENT__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Comment)null);
                return;
            case UsecasePackage.COMMENT__COMMENTED_ELEMENT:
                setCommentedElement((Commentable)null);
                return;
            case UsecasePackage.COMMENT__COMMENT:
                setComment(COMMENT_EDEFAULT);
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
            case UsecasePackage.COMMENT__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case UsecasePackage.COMMENT__COMMENTED_ELEMENT:
                return basicGetCommentedElement() != null;
            case UsecasePackage.COMMENT__COMMENT:
                return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
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
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.COMMENT__REFERENCED_ELEMENT: return UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
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
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case UsecasePackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return UsecasePackage.COMMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CommentImpl
