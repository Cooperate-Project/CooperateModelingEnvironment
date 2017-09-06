/**
 */
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.MinimumPointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.PointInTime;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage;
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;

import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum Point In Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequenceintermediate.impl.MinimumPointInTimeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimumPointInTimeImpl extends PointInTimeImpl implements MinimumPointInTime {
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<PointInTime> elements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MinimumPointInTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequenceIntermediatePackage.Literals.MINIMUM_POINT_IN_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PointInTime> getElements() {
        if (elements == null) {
            elements = new EObjectResolvingEList<PointInTime>(PointInTime.class, this, SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME__ELEMENTS);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTimeInternal() {
        /**
         * self.elements->sortedBy(time)->first().time
         */
        final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
        final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
        final /*@NonInvalid*/ List<PointInTime> elements = this.getElements();
        final /*@NonInvalid*/ SetValue BOXED_elements = idResolver.createSetOfAll(SequenceIntermediateTables.SET_CLSSid_PointInTime, elements);
        final org.eclipse.ocl.pivot.Class TYPE_sortedBy_0 = executor.getStaticTypeOf(BOXED_elements);
        final LibraryIteration.LibraryIterationExtension IMPL_sortedBy_0 = (LibraryIteration.LibraryIterationExtension)TYPE_sortedBy_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__sortedBy);
        final /*@NonNull*/ Object ACC_sortedBy_0 = IMPL_sortedBy_0.createAccumulatorValue(executor, SequenceIntermediateTables.ORD_CLSSid_PointInTime, SequenceIntermediateTables.DATAid_EInt);
        /**
         * Implementation of the iterator body.
         */
        final /*@NonNull*/ AbstractBinaryOperation BODY_sortedBy_0 = new AbstractBinaryOperation() {
            /**
             * time
             */
            @Override
            public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object BOXED_elements, final /*@NonInvalid*/ Object _1) {
                final /*@NonInvalid*/ PointInTime symbol_0 = (PointInTime)_1;
                if (symbol_0 == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate\'::PointInTime::time\'");
                }
                final /*@Thrown*/ int time = symbol_0.getTime();
                final /*@Thrown*/ IntegerValue BOXED_time = ValueUtil.integerValueOf(time);
                return BOXED_time;
            }
        };
        final /*@NonNull*/  ExecutorSingleIterationManager MGR_sortedBy_0 = new ExecutorSingleIterationManager(executor, SequenceIntermediateTables.ORD_CLSSid_PointInTime, BODY_sortedBy_0, BOXED_elements, ACC_sortedBy_0);
        final /*@Thrown*/ OrderedSetValue sortedBy = ClassUtil.nonNullState((OrderedSetValue)IMPL_sortedBy_0.evaluateIteration(MGR_sortedBy_0));
        final /*@Thrown*/ PointInTime first = (PointInTime)OrderedCollectionFirstOperation.INSTANCE.evaluate(sortedBy);
        if (first == null) {
            throw new InvalidValueException("Null source for \'\'http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate\'::PointInTime::time\'");
        }
        final /*@Thrown*/ int time_0 = first.getTime();
        return time_0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME__ELEMENTS:
                return getElements();
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
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends PointInTime>)newValue);
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
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME__ELEMENTS:
                getElements().clear();
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
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME__ELEMENTS:
                return elements != null && !elements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == PointInTime.class) {
            switch (baseOperationID) {
                case SequenceIntermediatePackage.POINT_IN_TIME___GET_TIME_INTERNAL: return SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME___GET_TIME_INTERNAL;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
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
            case SequenceIntermediatePackage.MINIMUM_POINT_IN_TIME___GET_TIME_INTERNAL:
                return getTimeInternal();
        }
        return super.eInvoke(operationID, arguments);
    }

} //MinimumPointInTimeImpl
