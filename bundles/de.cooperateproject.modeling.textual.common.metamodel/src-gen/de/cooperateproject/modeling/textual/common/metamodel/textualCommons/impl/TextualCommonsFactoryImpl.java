/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.*;

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
public class TextualCommonsFactoryImpl extends EFactoryImpl implements TextualCommonsFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TextualCommonsFactory init() {
        try {
            TextualCommonsFactory theTextualCommonsFactory = (TextualCommonsFactory)EPackage.Registry.INSTANCE.getEFactory(TextualCommonsPackage.eNS_URI);
            if (theTextualCommonsFactory != null) {
                return theTextualCommonsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TextualCommonsFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextualCommonsFactoryImpl() {
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
            case TextualCommonsPackage.COMMENT: return (EObject)createComment();
            case TextualCommonsPackage.CARDINALITY: return (EObject)createCardinality();
            case TextualCommonsPackage.PACKAGE_IMPORT: return (EObject)createPackageImport();
            case TextualCommonsPackage.STEREOTYPE_APPLICATION: return (EObject)createStereotypeApplication();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Comment createComment() {
        CommentImpl comment = new CommentImpl();
        return comment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Cardinality createCardinality() {
        CardinalityImpl cardinality = new CardinalityImpl();
        return cardinality;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PackageImport createPackageImport() {
        PackageImportImpl packageImport = new PackageImportImpl();
        return packageImport;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeApplication createStereotypeApplication() {
        StereotypeApplicationImpl stereotypeApplication = new StereotypeApplicationImpl();
        return stereotypeApplication;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextualCommonsPackage getTextualCommonsPackage() {
        return (TextualCommonsPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static TextualCommonsPackage getPackage() {
        return TextualCommonsPackage.eINSTANCE;
    }

} //TextualCommonsFactoryImpl
