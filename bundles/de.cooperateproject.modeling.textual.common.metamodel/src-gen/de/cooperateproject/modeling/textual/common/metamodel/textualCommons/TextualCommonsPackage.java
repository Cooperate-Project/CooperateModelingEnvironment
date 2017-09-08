/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://cooperate-project.de/ecore/settingdelegate/duplicatefiltering'"
 *        annotation="http://cooperate-project.de/ecore/settingdelegate/implementations http://cooperate-project.de/ecore/settingdelegate/duplicatefiltering='de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.DuplicatedSetFilteringSettingDelegateFactory'"
 * @generated
 */
public interface TextualCommonsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "textualCommons";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cooperateproject.de/modeling/textual/commons";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "txtCmn";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TextualCommonsPackage eINSTANCE = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT___GET_NEAREST_PACKAGE = 0;

    /**
     * The number of operations of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.NamedElementImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl <em>Aliased Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getAliasedElement()
     * @generated
     */
    int ALIASED_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIASED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIASED_ELEMENT__ALIAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Aliased Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIASED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIASED_ELEMENT___GET_NEAREST_PACKAGE = NAMED_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Aliased Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALIASED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl <em>UML Referencing Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getUMLReferencingElement()
     * @generated
     */
    int UML_REFERENCING_ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>UML Referencing Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_REFERENCING_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>UML Referencing Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_REFERENCING_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement <em>Packageable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageableElement()
     * @generated
     */
    int PACKAGEABLE_ELEMENT = 8;

    /**
     * The number of structural features of the '<em>Packageable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGEABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE = ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Packageable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGEABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl <em>Package Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageBase()
     * @generated
     */
    int PACKAGE_BASE = 4;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__REFERENCED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__APPLIED_STEREOTYPES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Owning Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__OWNING_PACKAGE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__PACKAGES = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Package Imports</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE__PACKAGE_IMPORTS = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Package Base</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE___GET_NEAREST_PACKAGE = PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Package Base</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_BASE_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentableImpl <em>Commentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentableImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getCommentable()
     * @generated
     */
    int COMMENTABLE = 5;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE__REFERENCED_ELEMENT = UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE__APPLIED_STEREOTYPES = UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;

    /**
     * The feature id for the '<em><b>Comments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE__COMMENTS = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Commentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE_FEATURE_COUNT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE___GET_NEAREST_PACKAGE = UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Commentable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENTABLE_OPERATION_COUNT = UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getComment()
     * @generated
     */
    int COMMENT = 6;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__REFERENCED_ELEMENT = UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__APPLIED_STEREOTYPES = UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;

    /**
     * The feature id for the '<em><b>Commented Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__COMMENTED_ELEMENT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT__BODY = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_FEATURE_COUNT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT___GET_NEAREST_PACKAGE = UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Comment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMENT_OPERATION_COUNT = UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getCardinality()
     * @generated
     */
    int CARDINALITY = 7;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY__REFERENCED_ELEMENT = UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY__APPLIED_STEREOTYPES = UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;

    /**
     * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY__LOWER_BOUND = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY__UPPER_BOUND = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Cardinality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_FEATURE_COUNT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY___GET_NEAREST_PACKAGE = UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Cardinality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_OPERATION_COUNT = UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl <em>Package Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageImport()
     * @generated
     */
    int PACKAGE_IMPORT = 9;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT__REFERENCED_ELEMENT = UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;

    /**
     * The feature id for the '<em><b>Applied Stereotypes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT__APPLIED_STEREOTYPES = UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES;

    /**
     * The feature id for the '<em><b>Importing Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT__IMPORTING_PACKAGE = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imported Package</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT__IMPORTED_PACKAGE = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Package Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_FEATURE_COUNT = UML_REFERENCING_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Nearest Package</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT___GET_NEAREST_PACKAGE = UML_REFERENCING_ELEMENT___GET_NEAREST_PACKAGE;

    /**
     * The number of operations of the '<em>Package Import</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_OPERATION_COUNT = UML_REFERENCING_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.VisibilityHavingElementImpl <em>Visibility Having Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.VisibilityHavingElementImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getVisibilityHavingElement()
     * @generated
     */
    int VISIBILITY_HAVING_ELEMENT = 10;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBILITY_HAVING_ELEMENT__VISIBILITY = 0;

    /**
     * The number of structural features of the '<em>Visibility Having Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBILITY_HAVING_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Visibility Having Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBILITY_HAVING_ELEMENT_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl <em>Stereotype Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getStereotypeApplication()
     * @generated
     */
    int STEREOTYPE_APPLICATION = 11;

    /**
     * The feature id for the '<em><b>Referenced Element</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_APPLICATION__REFERENCED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_APPLICATION__STEREOTYPE = 1;

    /**
     * The number of structural features of the '<em>Stereotype Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_APPLICATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Stereotype Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_APPLICATION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element#getNearestPackage() <em>Get Nearest Package</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Nearest Package</em>' operation.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element#getNearestPackage()
     * @generated
     */
    EOperation getElement__GetNearestPackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement <em>Aliased Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Aliased Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement
     * @generated
     */
    EClass getAliasedElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement#getAlias <em>Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alias</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement#getAlias()
     * @see #getAliasedElement()
     * @generated
     */
    EAttribute getAliasedElement_Alias();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement <em>UML Referencing Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>UML Referencing Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
     * @generated
     */
    EClass getUMLReferencingElement();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement <em>Referenced Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getReferencedElement()
     * @see #getUMLReferencingElement()
     * @generated
     */
    EReference getUMLReferencingElement_ReferencedElement();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getAppliedStereotypes <em>Applied Stereotypes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Applied Stereotypes</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement#getAppliedStereotypes()
     * @see #getUMLReferencingElement()
     * @generated
     */
    EReference getUMLReferencingElement_AppliedStereotypes();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase <em>Package Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Base</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase
     * @generated
     */
    EClass getPackageBase();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage <em>Owning Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Owning Package</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getOwningPackage()
     * @see #getPackageBase()
     * @generated
     */
    EReference getPackageBase_OwningPackage();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackages()
     * @see #getPackageBase()
     * @generated
     */
    EReference getPackageBase_Packages();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackageImports <em>Package Imports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Package Imports</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase#getPackageImports()
     * @see #getPackageBase()
     * @generated
     */
    EReference getPackageBase_PackageImports();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable <em>Commentable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Commentable</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable
     * @generated
     */
    EClass getCommentable();

    /**
     * Returns the meta object for the containment reference list '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable#getComments <em>Comments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Comments</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable#getComments()
     * @see #getCommentable()
     * @generated
     */
    EReference getCommentable_Comments();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comment</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment
     * @generated
     */
    EClass getComment();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getCommentedElement <em>Commented Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Commented Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getCommentedElement()
     * @see #getComment()
     * @generated
     */
    EReference getComment_CommentedElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment#getBody()
     * @see #getComment()
     * @generated
     */
    EAttribute getComment_Body();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cardinality</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality
     * @generated
     */
    EClass getCardinality();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound <em>Lower Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower Bound</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getLowerBound()
     * @see #getCardinality()
     * @generated
     */
    EAttribute getCardinality_LowerBound();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound <em>Upper Bound</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper Bound</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality#getUpperBound()
     * @see #getCardinality()
     * @generated
     */
    EAttribute getCardinality_UpperBound();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement <em>Packageable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packageable Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
     * @generated
     */
    EClass getPackageableElement();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport <em>Package Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Import</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport
     * @generated
     */
    EClass getPackageImport();

    /**
     * Returns the meta object for the container reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage <em>Importing Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Importing Package</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportingPackage()
     * @see #getPackageImport()
     * @generated
     */
    EReference getPackageImport_ImportingPackage();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportedPackage <em>Imported Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Imported Package</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport#getImportedPackage()
     * @see #getPackageImport()
     * @generated
     */
    EReference getPackageImport_ImportedPackage();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement <em>Visibility Having Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Visibility Having Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement
     * @generated
     */
    EClass getVisibilityHavingElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.VisibilityHavingElement#getVisibility()
     * @see #getVisibilityHavingElement()
     * @generated
     */
    EAttribute getVisibilityHavingElement_Visibility();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication <em>Stereotype Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stereotype Application</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication
     * @generated
     */
    EClass getStereotypeApplication();

    /**
     * Returns the meta object for the reference '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getReferencedElement <em>Referenced Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Element</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getReferencedElement()
     * @see #getStereotypeApplication()
     * @generated
     */
    EReference getStereotypeApplication_ReferencedElement();

    /**
     * Returns the meta object for the attribute '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.StereotypeApplication#getStereotype()
     * @see #getStereotypeApplication()
     * @generated
     */
    EAttribute getStereotypeApplication_Stereotype();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TextualCommonsFactory getTextualCommonsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.ElementImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Get Nearest Package</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ELEMENT___GET_NEAREST_PACKAGE = eINSTANCE.getElement__GetNearestPackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.NamedElementImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl <em>Aliased Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.AliasedElementImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getAliasedElement()
         * @generated
         */
        EClass ALIASED_ELEMENT = eINSTANCE.getAliasedElement();

        /**
         * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALIASED_ELEMENT__ALIAS = eINSTANCE.getAliasedElement_Alias();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl <em>UML Referencing Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.UMLReferencingElementImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getUMLReferencingElement()
         * @generated
         */
        EClass UML_REFERENCING_ELEMENT = eINSTANCE.getUMLReferencingElement();

        /**
         * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT = eINSTANCE.getUMLReferencingElement_ReferencedElement();

        /**
         * The meta object literal for the '<em><b>Applied Stereotypes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_REFERENCING_ELEMENT__APPLIED_STEREOTYPES = eINSTANCE.getUMLReferencingElement_AppliedStereotypes();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl <em>Package Base</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageBaseImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageBase()
         * @generated
         */
        EClass PACKAGE_BASE = eINSTANCE.getPackageBase();

        /**
         * The meta object literal for the '<em><b>Owning Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_BASE__OWNING_PACKAGE = eINSTANCE.getPackageBase_OwningPackage();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_BASE__PACKAGES = eINSTANCE.getPackageBase_Packages();

        /**
         * The meta object literal for the '<em><b>Package Imports</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_BASE__PACKAGE_IMPORTS = eINSTANCE.getPackageBase_PackageImports();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentableImpl <em>Commentable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentableImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getCommentable()
         * @generated
         */
        EClass COMMENTABLE = eINSTANCE.getCommentable();

        /**
         * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMENTABLE__COMMENTS = eINSTANCE.getCommentable_Comments();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentImpl <em>Comment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CommentImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getComment()
         * @generated
         */
        EClass COMMENT = eINSTANCE.getComment();

        /**
         * The meta object literal for the '<em><b>Commented Element</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMENT__COMMENTED_ELEMENT = eINSTANCE.getComment_CommentedElement();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl <em>Cardinality</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.CardinalityImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getCardinality()
         * @generated
         */
        EClass CARDINALITY = eINSTANCE.getCardinality();

        /**
         * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

        /**
         * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement <em>Packageable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageableElement()
         * @generated
         */
        EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl <em>Package Import</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.PackageImportImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getPackageImport()
         * @generated
         */
        EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

        /**
         * The meta object literal for the '<em><b>Importing Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_IMPORT__IMPORTING_PACKAGE = eINSTANCE.getPackageImport_ImportingPackage();

        /**
         * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getPackageImport_ImportedPackage();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.VisibilityHavingElementImpl <em>Visibility Having Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.VisibilityHavingElementImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getVisibilityHavingElement()
         * @generated
         */
        EClass VISIBILITY_HAVING_ELEMENT = eINSTANCE.getVisibilityHavingElement();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VISIBILITY_HAVING_ELEMENT__VISIBILITY = eINSTANCE.getVisibilityHavingElement_Visibility();

        /**
         * The meta object literal for the '{@link de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl <em>Stereotype Application</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.StereotypeApplicationImpl
         * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl.TextualCommonsPackageImpl#getStereotypeApplication()
         * @generated
         */
        EClass STEREOTYPE_APPLICATION = eINSTANCE.getStereotypeApplication();

        /**
         * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STEREOTYPE_APPLICATION__REFERENCED_ELEMENT = eINSTANCE.getStereotypeApplication_ReferencedElement();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STEREOTYPE_APPLICATION__STEREOTYPE = eINSTANCE.getStereotypeApplication_Stereotype();

    }

} //TextualCommonsPackage
