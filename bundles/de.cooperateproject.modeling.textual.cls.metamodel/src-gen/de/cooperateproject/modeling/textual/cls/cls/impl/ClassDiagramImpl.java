/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Connector;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.ClassDiagramImpl#getRootPackage <em>Root Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDiagramImpl extends CDOObjectImpl implements ClassDiagram {
    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassDiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClsPackage.Literals.CLASS_DIAGRAM;
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
    public String getTitle() {
        return (String)eDynamicGet(ClsPackage.CLASS_DIAGRAM__TITLE, ClsPackage.Literals.CLASS_DIAGRAM__TITLE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        eDynamicSet(ClsPackage.CLASS_DIAGRAM__TITLE, ClsPackage.Literals.CLASS_DIAGRAM__TITLE, newTitle);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.cls.cls.Package getRootPackage() {
        return (de.cooperateproject.modeling.textual.cls.cls.Package)eDynamicGet(ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE, ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package newRootPackage, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newRootPackage, ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootPackage(de.cooperateproject.modeling.textual.cls.cls.Package newRootPackage) {
        eDynamicSet(ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE, ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE, newRootPackage);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Connector> getAllTransitiveConnectors() {
        EList<Connector> transitiveConnectors = new BasicEList<Connector>();
        
        LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();
        queue.add(getRootPackage());
        while (!queue.isEmpty()) {
            de.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();
            queue.addAll(0, currentPackage.getPackages());
            transitiveConnectors.addAll(currentPackage.getConnectors());
        }
        
        return transitiveConnectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<de.cooperateproject.modeling.textual.cls.cls.Package> getAllTransitivePackages() {
        EList<de.cooperateproject.modeling.textual.cls.cls.Package> transitivePackages = new BasicEList<de.cooperateproject.modeling.textual.cls.cls.Package>();
        
        LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();
        queue.add(getRootPackage());
        while (!queue.isEmpty()) {
            de.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();
            queue.addAll(0, currentPackage.getPackages());
            transitivePackages.add(currentPackage);
        }
        
        return transitivePackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier<? extends org.eclipse.uml2.uml.Classifier>> getAllTransitiveClassifiers() {
        EList<de.cooperateproject.modeling.textual.cls.cls.Classifier<? extends org.eclipse.uml2.uml.Classifier>> transitiveClassifiers = new BasicEList<de.cooperateproject.modeling.textual.cls.cls.Classifier<? extends org.eclipse.uml2.uml.Classifier>>();
        
        LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package> queue = new LinkedList<de.cooperateproject.modeling.textual.cls.cls.Package>();
        queue.add(getRootPackage());
        while (!queue.isEmpty()) {
            de.cooperateproject.modeling.textual.cls.cls.Package currentPackage = queue.pop();
            queue.addAll(0, currentPackage.getPackages());
            transitiveClassifiers.addAll(currentPackage.getClassifiers());
        }
        
        return transitiveClassifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE:
                return basicSetRootPackage(null, msgs);
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
            case ClsPackage.CLASS_DIAGRAM__TITLE:
                return getTitle();
            case ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE:
                return getRootPackage();
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
            case ClsPackage.CLASS_DIAGRAM__TITLE:
                setTitle((String)newValue);
                return;
            case ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE:
                setRootPackage((de.cooperateproject.modeling.textual.cls.cls.Package)newValue);
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
            case ClsPackage.CLASS_DIAGRAM__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE:
                setRootPackage((de.cooperateproject.modeling.textual.cls.cls.Package)null);
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
            case ClsPackage.CLASS_DIAGRAM__TITLE:
                return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
            case ClsPackage.CLASS_DIAGRAM__ROOT_PACKAGE:
                return getRootPackage() != null;
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
            case ClsPackage.CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CONNECTORS:
                return getAllTransitiveConnectors();
            case ClsPackage.CLASS_DIAGRAM___GET_ALL_TRANSITIVE_PACKAGES:
                return getAllTransitivePackages();
            case ClsPackage.CLASS_DIAGRAM___GET_ALL_TRANSITIVE_CLASSIFIERS:
                return getAllTransitiveClassifiers();
        }
        return super.eInvoke(operationID, arguments);
    }

} //ClassDiagramImpl
