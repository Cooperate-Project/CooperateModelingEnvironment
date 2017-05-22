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

import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.usecase.usecase.impl.UseCaseImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends UMLReferencingElementImpl<UseCase> implements de.cooperateproject.modeling.textual.usecase.usecase.UseCase {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UseCaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsecasePackage.Literals.USE_CASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setReferencedElement(UseCase newReferencedElement) {
        super.setReferencedElement(newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Comment> getComments() {
        return (EList<Comment>)eDynamicGet(UsecasePackage.USE_CASE__COMMENTS, TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(UsecasePackage.USE_CASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(UsecasePackage.USE_CASE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAlias() {
        return (String)eDynamicGet(UsecasePackage.USE_CASE__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlias(String newAlias) {
        eDynamicSet(UsecasePackage.USE_CASE__ALIAS, TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, newAlias);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind getVisibility() {
        return (VisibilityKind)eDynamicGet(UsecasePackage.USE_CASE__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityKind newVisibility) {
        eDynamicSet(UsecasePackage.USE_CASE__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, newVisibility);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility() {
        eDynamicUnset(UsecasePackage.USE_CASE__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility() {
        return eDynamicIsSet(UsecasePackage.USE_CASE__VISIBILITY, TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return (Boolean)eDynamicGet(UsecasePackage.USE_CASE__ABSTRACT, UsecasePackage.Literals.USE_CASE__ABSTRACT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        eDynamicSet(UsecasePackage.USE_CASE__ABSTRACT, UsecasePackage.Literals.USE_CASE__ABSTRACT, newAbstract);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ExtensionPoint> getExtensionPoints() {
        return (EList<ExtensionPoint>)eDynamicGet(UsecasePackage.USE_CASE__EXTENSION_POINTS, UsecasePackage.Literals.USE_CASE__EXTENSION_POINTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.usecase.usecase.System getSystem() {
        return (de.cooperateproject.modeling.textual.usecase.usecase.System)eDynamicGet(UsecasePackage.USE_CASE__SYSTEM, UsecasePackage.Literals.USE_CASE__SYSTEM, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSystem(de.cooperateproject.modeling.textual.usecase.usecase.System newSystem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSystem, UsecasePackage.USE_CASE__SYSTEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystem(de.cooperateproject.modeling.textual.usecase.usecase.System newSystem) {
        eDynamicSet(UsecasePackage.USE_CASE__SYSTEM, UsecasePackage.Literals.USE_CASE__SYSTEM, newSystem);
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
            case UsecasePackage.USE_CASE__COMMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionPoints()).basicAdd(otherEnd, msgs);
            case UsecasePackage.USE_CASE__SYSTEM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)otherEnd, msgs);
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
            case UsecasePackage.USE_CASE__COMMENTS:
                return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
            case UsecasePackage.USE_CASE__SYSTEM:
                return basicSetSystem(null, msgs);
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
            case UsecasePackage.USE_CASE__SYSTEM:
                return eInternalContainer().eInverseRemove(this, UsecasePackage.SYSTEM__USECASES, de.cooperateproject.modeling.textual.usecase.usecase.System.class, msgs);
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
            case UsecasePackage.USE_CASE__COMMENTS:
                return getComments();
            case UsecasePackage.USE_CASE__NAME:
                return getName();
            case UsecasePackage.USE_CASE__ALIAS:
                return getAlias();
            case UsecasePackage.USE_CASE__VISIBILITY:
                return getVisibility();
            case UsecasePackage.USE_CASE__ABSTRACT:
                return isAbstract();
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return getExtensionPoints();
            case UsecasePackage.USE_CASE__SYSTEM:
                return getSystem();
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
            case UsecasePackage.USE_CASE__COMMENTS:
                getComments().clear();
                getComments().addAll((Collection<? extends Comment>)newValue);
                return;
            case UsecasePackage.USE_CASE__NAME:
                setName((String)newValue);
                return;
            case UsecasePackage.USE_CASE__ALIAS:
                setAlias((String)newValue);
                return;
            case UsecasePackage.USE_CASE__VISIBILITY:
                setVisibility((VisibilityKind)newValue);
                return;
            case UsecasePackage.USE_CASE__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                getExtensionPoints().clear();
                getExtensionPoints().addAll((Collection<? extends ExtensionPoint>)newValue);
                return;
            case UsecasePackage.USE_CASE__SYSTEM:
                setSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)newValue);
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
            case UsecasePackage.USE_CASE__COMMENTS:
                getComments().clear();
                return;
            case UsecasePackage.USE_CASE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UsecasePackage.USE_CASE__ALIAS:
                setAlias(ALIAS_EDEFAULT);
                return;
            case UsecasePackage.USE_CASE__VISIBILITY:
                unsetVisibility();
                return;
            case UsecasePackage.USE_CASE__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
                return;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                getExtensionPoints().clear();
                return;
            case UsecasePackage.USE_CASE__SYSTEM:
                setSystem((de.cooperateproject.modeling.textual.usecase.usecase.System)null);
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
            case UsecasePackage.USE_CASE__COMMENTS:
                return !getComments().isEmpty();
            case UsecasePackage.USE_CASE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case UsecasePackage.USE_CASE__ALIAS:
                return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
            case UsecasePackage.USE_CASE__VISIBILITY:
                return isSetVisibility();
            case UsecasePackage.USE_CASE__ABSTRACT:
                return isAbstract() != ABSTRACT_EDEFAULT;
            case UsecasePackage.USE_CASE__EXTENSION_POINTS:
                return !getExtensionPoints().isEmpty();
            case UsecasePackage.USE_CASE__SYSTEM:
                return getSystem() != null;
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
                case UsecasePackage.USE_CASE__COMMENTS: return TextualCommonsPackage.COMMENTABLE__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.USE_CASE__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.USE_CASE__ALIAS: return TextualCommonsPackage.ALIASED_ELEMENT__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (derivedFeatureID) {
                case UsecasePackage.USE_CASE__VISIBILITY: return TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY;
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
                case TextualCommonsPackage.COMMENTABLE__COMMENTS: return UsecasePackage.USE_CASE__COMMENTS;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return UsecasePackage.USE_CASE__NAME;
                default: return -1;
            }
        }
        if (baseClass == AliasedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.ALIASED_ELEMENT__ALIAS: return UsecasePackage.USE_CASE__ALIAS;
                default: return -1;
            }
        }
        if (baseClass == VisibilityHavingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.VISIBILITY_HAVING_ELEMENT__VISIBILITY: return UsecasePackage.USE_CASE__VISIBILITY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //UseCaseImpl
