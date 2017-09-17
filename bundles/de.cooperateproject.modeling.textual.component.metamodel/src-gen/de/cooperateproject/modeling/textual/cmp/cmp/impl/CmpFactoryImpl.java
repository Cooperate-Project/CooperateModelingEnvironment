/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.impl;

import de.cooperateproject.modeling.textual.cmp.cmp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmpFactoryImpl extends EFactoryImpl implements CmpFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CmpFactory init() {
        try {
            CmpFactory theCmpFactory = (CmpFactory)EPackage.Registry.INSTANCE.getEFactory(CmpPackage.eNS_URI);
            if (theCmpFactory != null) {
                return theCmpFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CmpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpFactoryImpl() {
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
            case CmpPackage.COMPONENT_DIAGRAM: return (EObject)createComponentDiagram();
            case CmpPackage.ROOT_PACKAGE: return (EObject)createRootPackage();
            case CmpPackage.CONNECTOR: return (EObject)createConnector();
            case CmpPackage.GENERALIZATION: return (EObject)createGeneralization();
            case CmpPackage.ABSTRACTION: return (EObject)createAbstraction();
            case CmpPackage.MANIFESTATION: return (EObject)createManifestation();
            case CmpPackage.SUBSTITUTION: return (EObject)createSubstitution();
            case CmpPackage.DEPENDENCY: return (EObject)createDependency();
            case CmpPackage.COMPONENT: return (EObject)createComponent();
            case CmpPackage.INTERFACE: return (EObject)createInterface();
            case CmpPackage.METHOD: return (EObject)createMethod();
            case CmpPackage.PARAMETER: return (EObject)createParameter();
            case CmpPackage.ATTRIBUTE: return (EObject)createAttribute();
            case CmpPackage.PROVIDE: return (EObject)createProvide();
            case CmpPackage.REQUIRE: return (EObject)createRequire();
            case CmpPackage.PORT: return (EObject)createPort();
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
    public Generalization createGeneralization() {
        GeneralizationImpl generalization = new GeneralizationImpl();
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Abstraction createAbstraction() {
        AbstractionImpl abstraction = new AbstractionImpl();
        return abstraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Manifestation createManifestation() {
        ManifestationImpl manifestation = new ManifestationImpl();
        return manifestation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substitution createSubstitution() {
        SubstitutionImpl substitution = new SubstitutionImpl();
        return substitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency createDependency() {
        DependencyImpl dependency = new DependencyImpl();
        return dependency;
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
    public <realizeClassifierUMLType extends Classifier> Port<realizeClassifierUMLType> createPort() {
        PortImpl<realizeClassifierUMLType> port = new PortImpl<realizeClassifierUMLType>();
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpPackage getCmpPackage() {
        return (CmpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CmpPackage getPackage() {
        return CmpPackage.eINSTANCE;
    }

} //CmpFactoryImpl
