/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import de.cooperateproject.modeling.textual.cls.cls.AggregationKind;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xtext Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#getMemberEndTypes <em>Member End Types</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#getMemberEndNames <em>Member End Names</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#getMemberEndCardinalities <em>Member End Cardinalities</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#getMemberEndNavigabilities <em>Member End Navigabilities</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#isTwoSideBidirectionality <em>Two Side Bidirectionality</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.XtextAssociationImpl#getTwoSideAggregationKind <em>Two Side Aggregation Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextAssociationImpl extends AssociationImpl implements XtextAssociation {
    /**
     * The default value of the '{@link #isTwoSideBidirectionality() <em>Two Side Bidirectionality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTwoSideBidirectionality()
     * @generated
     * @ordered
     */
    protected static final boolean TWO_SIDE_BIDIRECTIONALITY_EDEFAULT = false;

    /**
     * The default value of the '{@link #getTwoSideAggregationKind() <em>Two Side Aggregation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwoSideAggregationKind()
     * @generated
     * @ordered
     */
    protected static final AggregationKind TWO_SIDE_AGGREGATION_KIND_EDEFAULT = AggregationKind.NONE;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XtextAssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.XTEXT_ASSOCIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<XtextAssociationMemberEndReferencedType> getMemberEndTypes() {
        return (EList<XtextAssociationMemberEndReferencedType>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES, ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_TYPES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<String> getMemberEndNames() {
        return (EList<String>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAMES, ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Cardinality> getMemberEndCardinalities() {
        return (EList<Cardinality>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES, ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Boolean> getMemberEndNavigabilities() {
        return (EList<Boolean>)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES, ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTwoSideBidirectionality() {
        return (Boolean)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTwoSideBidirectionality(boolean newTwoSideBidirectionality) {
        eDynamicSet(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY, newTwoSideBidirectionality);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationKind getTwoSideAggregationKind() {
        return (AggregationKind)eDynamicGet(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTwoSideAggregationKind(AggregationKind newTwoSideAggregationKind) {
        eDynamicSet(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, newTwoSideAggregationKind);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTwoSideAggregationKind() {
        eDynamicUnset(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTwoSideAggregationKind() {
        return eDynamicIsSet(ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND, ClsPackage.Literals.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier<?>> collectMemberEndTypes() {
        return new BasicEList<Classifier<?>>(getMemberEndTypes().stream() .map(XtextAssociationMemberEndReferencedType::getType).collect(Collectors.toList()));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES:
                return ((InternalEList<?>)getMemberEndTypes()).basicRemove(otherEnd, msgs);
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES:
                return ((InternalEList<?>)getMemberEndCardinalities()).basicRemove(otherEnd, msgs);
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
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES:
                return getMemberEndTypes();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAMES:
                return getMemberEndNames();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES:
                return getMemberEndCardinalities();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES:
                return getMemberEndNavigabilities();
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY:
                return isTwoSideBidirectionality();
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND:
                return getTwoSideAggregationKind();
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
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES:
                getMemberEndTypes().clear();
                getMemberEndTypes().addAll((Collection<? extends XtextAssociationMemberEndReferencedType>)newValue);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAMES:
                getMemberEndNames().clear();
                getMemberEndNames().addAll((Collection<? extends String>)newValue);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES:
                getMemberEndCardinalities().clear();
                getMemberEndCardinalities().addAll((Collection<? extends Cardinality>)newValue);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES:
                getMemberEndNavigabilities().clear();
                getMemberEndNavigabilities().addAll((Collection<? extends Boolean>)newValue);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY:
                setTwoSideBidirectionality((Boolean)newValue);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND:
                setTwoSideAggregationKind((AggregationKind)newValue);
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
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES:
                getMemberEndTypes().clear();
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAMES:
                getMemberEndNames().clear();
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES:
                getMemberEndCardinalities().clear();
                return;
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES:
                getMemberEndNavigabilities().clear();
                return;
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY:
                setTwoSideBidirectionality(TWO_SIDE_BIDIRECTIONALITY_EDEFAULT);
                return;
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND:
                unsetTwoSideAggregationKind();
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
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_TYPES:
                return !getMemberEndTypes().isEmpty();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAMES:
                return !getMemberEndNames().isEmpty();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_CARDINALITIES:
                return !getMemberEndCardinalities().isEmpty();
            case ClsPackage.XTEXT_ASSOCIATION__MEMBER_END_NAVIGABILITIES:
                return !getMemberEndNavigabilities().isEmpty();
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_BIDIRECTIONALITY:
                return isTwoSideBidirectionality() != TWO_SIDE_BIDIRECTIONALITY_EDEFAULT;
            case ClsPackage.XTEXT_ASSOCIATION__TWO_SIDE_AGGREGATION_KIND:
                return isSetTwoSideAggregationKind();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ClsPackage.XTEXT_ASSOCIATION___COLLECT_MEMBER_END_TYPES:
                return collectMemberEndTypes();
        }
        return super.eInvoke(operationID, arguments);
    }

} // XtextAssociationImpl
