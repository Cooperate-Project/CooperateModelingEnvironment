/**
 */
package de.cooperateproject.modeling.textual.usecase.usecase.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl;

import de.cooperateproject.modeling.textual.usecase.usecase.ActorType;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.ActorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends UMLReferencingElementImpl<Actor> implements de.cooperateproject.modeling.textual.usecase.usecase.Actor {
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
     * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlias()
     * @generated
     * @ordered
     */
    protected static final String ALIAS_EDEFAULT = null;

    /**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ActorType TYPE_EDEFAULT = ActorType.UNDEFINED;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsecasePackage.Literals.ACTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(Actor newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Comment> getComments() {
        return (EList<Comment>)eDynamicGet(UsecasePackage.ACTOR__COMMENTS, TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(UsecasePackage.ACTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(UsecasePackage.ACTOR__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(UsecasePackage.ACTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(UsecasePackage.ACTOR__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(UsecasePackage.ACTOR__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(UsecasePackage.ACTOR__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(UsecasePackage.ACTOR__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(UsecasePackage.ACTOR__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return (Boolean)eDynamicGet(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        eDynamicSet(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT, newAbstract);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAbstract() {
        eDynamicUnset(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAbstract() {
        return eDynamicIsSet(UsecasePackage.ACTOR__ABSTRACT, UsecasePackage.Literals.ACTOR__ABSTRACT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActorType getType() {
        return (ActorType)eDynamicGet(UsecasePackage.ACTOR__TYPE, UsecasePackage.Literals.ACTOR__TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ActorType newType) {
        eDynamicSet(UsecasePackage.ACTOR__TYPE, UsecasePackage.Literals.ACTOR__TYPE, newType);
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
            case UsecasePackage.ACTOR__COMMENTS:
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
            case UsecasePackage.ACTOR__COMMENTS:
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsecasePackage.ACTOR__COMMENTS:
                return getComments();
            case UsecasePackage.ACTOR__NAME:
                return getName();
            case UsecasePackage.ACTOR__ALIAS:
                return getAlias();
            case UsecasePackage.ACTOR__VISIBILITY:
                return getVisibility();
            case UsecasePackage.ACTOR__ABSTRACT:
                return isAbstract();
            case UsecasePackage.ACTOR__TYPE:
                return getType();
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
            case UsecasePackage.ACTOR__COMMENTS:
                getComments().clear();
                getComments().addAll((Collection<? extends Comment>)newValue);
                return;
            case UsecasePackage.ACTOR__NAME:
                setName((String)newValue);
                return;
            case UsecasePackage.ACTOR__ALIAS:
                setAlias((String)newValue);
                return;
            case UsecasePackage.ACTOR__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case UsecasePackage.ACTOR__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case UsecasePackage.ACTOR__TYPE:
                setType((ActorType)newValue);
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
            case UsecasePackage.ACTOR__COMMENTS:
                getComments().clear();
                return;
            case UsecasePackage.ACTOR__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UsecasePackage.ACTOR__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case UsecasePackage.ACTOR__VISIBILITY:
                unsetVisibility();
                return;
            case UsecasePackage.ACTOR__ABSTRACT:
                unsetAbstract();
                return;
            case UsecasePackage.ACTOR__TYPE:
                setType(TYPE_EDEFAULT);
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
            case UsecasePackage.ACTOR__COMMENTS:
                return !getComments().isEmpty();
            case UsecasePackage.ACTOR__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case UsecasePackage.ACTOR__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case UsecasePackage.ACTOR__VISIBILITY:
                return isSetVisibility();
            case UsecasePackage.ACTOR__ABSTRACT:
                return isSetAbstract();
            case UsecasePackage.ACTOR__TYPE:
                return getType() != TYPE_EDEFAULT;
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
                case UsecasePackage.ACTOR__COMMENTS: return TextualCommonsPackage.COMMENTABLE__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.ACTOR__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.ACTOR__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.ACTOR__VISIBILITY: return TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY;
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
                case TextualCommonsPackage.COMMENTABLE__COMMENTS: return UsecasePackage.ACTOR__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return UsecasePackage.ACTOR__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return UsecasePackage.ACTOR__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY: return UsecasePackage.ACTOR__VISIBILITY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //ActorImpl
