/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getCommentedElement <em>Commented Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentLinkImpl extends CDOObjectImpl implements CommentLink {
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
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getOwningPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.COMMENT_LINK__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOwningPackage, ClsPackage.COMMENT_LINK__OWNING_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwningPackage(de.cooperateproject.modeling.textual.cls.cls.Package newOwningPackage) {
        eDynamicSet(ClsPackage.COMMENT_LINK__OWNING_PACKAGE, ClsPackage.Literals.CONNECTOR__OWNING_PACKAGE, newOwningPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Comment> getComments() {
        return (EList<Comment>)eDynamicGet(ClsPackage.COMMENT_LINK__COMMENTS, TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> getCommentedElement() {
        return (Classifier<?>)eDynamicGet(ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT, ClsPackage.Literals.COMMENT_LINK__COMMENTED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier<?> basicGetCommentedElement() {
        return (Classifier<?>)eDynamicGet(ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT, ClsPackage.Literals.COMMENT_LINK__COMMENTED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCommentedElement(Classifier<?> newCommentedElement) {
        eDynamicSet(ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT, ClsPackage.Literals.COMMENT_LINK__COMMENTED_ELEMENT, newCommentedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)otherEnd, msgs);
            case ClsPackage.COMMENT_LINK__COMMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                return basicSetOwningPackage(null, msgs);
            case ClsPackage.COMMENT_LINK__COMMENTS:
                return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                return eInternalContainer().eInverseRemove(this, ClsPackage.PACKAGE__CONNECTORS, de.cooperateproject.modeling.textual.cls.cls.Package.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                return getOwningPackage();
            case ClsPackage.COMMENT_LINK__COMMENTS:
                return getComments();
            case ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT:
                if (resolve) return getCommentedElement();
                return basicGetCommentedElement();
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
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
                return;
            case ClsPackage.COMMENT_LINK__COMMENTS:
                getComments().clear();
                getComments().addAll((Collection<? extends Comment>)newValue);
                return;
            case ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT:
                setCommentedElement((Classifier<?>)newValue);
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
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                setOwningPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
                return;
            case ClsPackage.COMMENT_LINK__COMMENTS:
                getComments().clear();
                return;
            case ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT:
                setCommentedElement((Classifier<?>)null);
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
            case ClsPackage.COMMENT_LINK__OWNING_PACKAGE:
                return getOwningPackage() != null;
            case ClsPackage.COMMENT_LINK__COMMENTS:
                return !getComments().isEmpty();
            case ClsPackage.COMMENT_LINK__COMMENTED_ELEMENT:
                return basicGetCommentedElement() != null;
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
        if (baseClass == Commentable.class) {
            switch (derivedFeatureID) {
                case ClsPackage.COMMENT_LINK__COMMENTS: return TextualCommonsPackage.COMMENTABLE__COMMENTS;
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
                case TextualCommonsPackage.COMMENTABLE__COMMENTS: return ClsPackage.COMMENT_LINK__COMMENTS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CommentLinkImpl
