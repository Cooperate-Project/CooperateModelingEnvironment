/**
 */
package de.cooperateproject.ui.launchermodel.Launcher.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.launchermodel.Launcher.LauncherPackage;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.ui.launchermodel.Launcher.impl.DiagramImpl#getConcreteSyntaxModels <em>Concrete Syntax Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
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
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getConcreteSyntaxModels() <em>Concrete Syntax Models</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteSyntaxModels()
     * @generated
     * @ordered
     */
    protected EList<ConcreteSyntaxModel> concreteSyntaxModels;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LauncherPackage.Literals.DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LauncherPackage.DIAGRAM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteSyntaxModel> getConcreteSyntaxModels() {
        if (concreteSyntaxModels == null) {
            concreteSyntaxModels = new EObjectContainmentEList<ConcreteSyntaxModel>(ConcreteSyntaxModel.class, this, LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS);
        }
        return concreteSyntaxModels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public <T extends ConcreteSyntaxModel> T getConcreteSyntaxModel(final Class<T> type) throws ConcreteSyntaxTypeNotAvailableException {
        Validate.notNull(type);
        
        Set<T> matchingModels = getConcreteSyntaxModels().stream().filter(type::isInstance).map(type::cast).collect(Collectors.toSet());
        if (matchingModels.size() != 1) {
            throw new ConcreteSyntaxTypeNotAvailableException("The concrete syntax type " + type.getSimpleName() + " is not available.");
        }
        return matchingModels.iterator().next();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS:
                return ((InternalEList<?>)getConcreteSyntaxModels()).basicRemove(otherEnd, msgs);
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
            case LauncherPackage.DIAGRAM__NAME:
                return getName();
            case LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS:
                return getConcreteSyntaxModels();
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
            case LauncherPackage.DIAGRAM__NAME:
                setName((String)newValue);
                return;
            case LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS:
                getConcreteSyntaxModels().clear();
                getConcreteSyntaxModels().addAll((Collection<? extends ConcreteSyntaxModel>)newValue);
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
            case LauncherPackage.DIAGRAM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS:
                getConcreteSyntaxModels().clear();
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
            case LauncherPackage.DIAGRAM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case LauncherPackage.DIAGRAM__CONCRETE_SYNTAX_MODELS:
                return concreteSyntaxModels != null && !concreteSyntaxModels.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case LauncherPackage.DIAGRAM___GET_CONCRETE_SYNTAX_MODEL__CLASS:
                try {
                    return getConcreteSyntaxModel((Class)arguments.get(0));
                }
                catch (Throwable throwable) {
                    throw new InvocationTargetException(throwable);
                }
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} // DiagramImpl
