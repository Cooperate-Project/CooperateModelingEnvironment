/**
 */
package de.cooperateproject.modeling.textual.component.component.impl;

import de.cooperateproject.modeling.textual.component.component.Attribute;
import de.cooperateproject.modeling.textual.component.component.Component;
import de.cooperateproject.modeling.textual.component.component.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.component.ComponentFactory;
import de.cooperateproject.modeling.textual.component.component.ComponentPackage;
import de.cooperateproject.modeling.textual.component.component.Connector;
import de.cooperateproject.modeling.textual.component.component.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.component.Generalization;
import de.cooperateproject.modeling.textual.component.component.Interface;
import de.cooperateproject.modeling.textual.component.component.Method;
import de.cooperateproject.modeling.textual.component.component.Parameter;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.component.component.Provide;
import de.cooperateproject.modeling.textual.component.component.Require;
import de.cooperateproject.modeling.textual.component.component.RootPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentFactoryImpl extends EFactoryImpl implements ComponentFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ComponentFactory init() {
        try {
            ComponentFactory theComponentFactory = (ComponentFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentPackage.eNS_URI);
            if (theComponentFactory != null) {
                return theComponentFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ComponentFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ComponentPackage.COMPONENT_DIAGRAM: return (EObject)createComponentDiagram();
            case ComponentPackage.ROOT_PACKAGE: return (EObject)createRootPackage();
            case ComponentPackage.CONNECTOR: return (EObject)createConnector();
            case ComponentPackage.CONNECTOR_END: return (EObject)createConnectorEnd();
            case ComponentPackage.GENERALIZATION: return (EObject)createGeneralization();
            case ComponentPackage.COMPONENT: return (EObject)createComponent();
            case ComponentPackage.CLASS: return (EObject)createClass();
            case ComponentPackage.INTERFACE: return (EObject)createInterface();
            case ComponentPackage.METHOD: return (EObject)createMethod();
            case ComponentPackage.PARAMETER: return (EObject)createParameter();
            case ComponentPackage.ATTRIBUTE: return (EObject)createAttribute();
            case ComponentPackage.PROVIDE: return (EObject)createProvide();
            case ComponentPackage.REQUIRE: return (EObject)createRequire();
            case ComponentPackage.PORT: return (EObject)createPort();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentDiagram createComponentDiagram() {
        ComponentDiagramImpl componentDiagram = new ComponentDiagramImpl();
        return componentDiagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootPackage createRootPackage() {
        RootPackageImpl rootPackage = new RootPackageImpl();
        return rootPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorEnd createConnectorEnd() {
        ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
        return connectorEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Generalization createGeneralization() {
        GeneralizationImpl generalization = new GeneralizationImpl();
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cooperateproject.modeling.textual.component.component.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Method createMethod() {
        MethodImpl method = new MethodImpl();
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Provide createProvide() {
        ProvideImpl provide = new ProvideImpl();
        return provide;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Require createRequire() {
        RequireImpl require = new RequireImpl();
        return require;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port createPort() {
        PortImpl port = new PortImpl();
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentPackage getComponentPackage() {
        return (ComponentPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ComponentPackage getPackage() {
        return ComponentPackage.eINSTANCE;
    }

} //ComponentFactoryImpl
