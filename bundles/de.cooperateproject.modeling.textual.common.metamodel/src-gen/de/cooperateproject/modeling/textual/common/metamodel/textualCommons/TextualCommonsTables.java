/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.cooperateproject.modeling.textual.common.metamodel/model/textualCommons.ecore
 * using:
 *   /de.cooperateproject.modeling.textual.common.metamodel/model/textualCommons.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * TextualCommonsTables provides the dispatch tables for the textualCommons for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class TextualCommonsTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TextualCommonsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_commons = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.cooperateproject.de/modeling/textual/commons", null, de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Orphanage", "orphanage", null);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_5_0_0_s_UML = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/uml2/5.0.0/UML", null, org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Comment = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_commons.getClassId("Comment", 1);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Commentable = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage.getClassId("Commentable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Package = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_5_0_0_s_UML.getClassId("Package", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PackageBase = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Orphanage.getClassId("PackageBase", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PackageImport = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_commons.getClassId("PackageImport", 1);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_VisibilityKind = de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.PACKid_http_c_s_s_www_eclipse_org_s_uml2_s_5_0_0_s_UML.getEnumerationId("VisibilityKind");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_TMPLid_ = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.ocl.pivot.ids.IdManager.getTemplateParameterId(0));
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Comment = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.CLSSid_Comment);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_PackageImport = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsTables.CLSSid_PackageImport);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TextualCommonsTables.init();
		}

		public static final /*@NonNull*/ ExecutorTypeParameter _Commentable_CommentableUMLType = new ExecutorTypeParameter(TypeId.T_1, "CommentableUMLType");

		public static final /*@NonNull*/ ExecutorTypeParameter _PackageBase_PackageType = new ExecutorTypeParameter(TypeId.T_1, "PackageType");

		public static final /*@NonNull*/ ExecutorTypeParameter _UMLReferencingElement_UMLType = new ExecutorTypeParameter(TypeId.T_1, "UMLType");

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _AliasedElement = new EcoreExecutorType(TextualCommonsPackage.Literals.ALIASED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Cardinality = new EcoreExecutorType(TextualCommonsPackage.Literals.CARDINALITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Comment = new EcoreExecutorType(TextualCommonsPackage.Literals.COMMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Commentable = new EcoreExecutorType(TextualCommonsPackage.Literals.COMMENTABLE, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._Commentable_CommentableUMLType);
		public static final /*@NonNull*/ EcoreExecutorType _Element = new EcoreExecutorType(TextualCommonsPackage.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _NamedElement = new EcoreExecutorType(TextualCommonsPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _PackageBase = new EcoreExecutorType(TextualCommonsPackage.Literals.PACKAGE_BASE, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._PackageBase_PackageType);
		public static final /*@NonNull*/ EcoreExecutorType _PackageImport = new EcoreExecutorType(TextualCommonsPackage.Literals.PACKAGE_IMPORT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PackageableElement = new EcoreExecutorType(TextualCommonsPackage.Literals.PACKAGEABLE_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _UMLReferencingElement = new EcoreExecutorType(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT, TypeParameters._UMLReferencingElement_UMLType);
		public static final /*@NonNull*/ EcoreExecutorType _VisibilityHavingElement = new EcoreExecutorType(TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_AliasedElement,
			_Cardinality,
			_Comment,
			_Commentable,
			_Element,
			_NamedElement,
			_PackageBase,
			_PackageImport,
			_PackageableElement,
			_UMLReferencingElement,
			_VisibilityHavingElement
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _AliasedElement__AliasedElement = new ExecutorFragment(Types._AliasedElement, TextualCommonsTables.Types._AliasedElement);
		private static final /*@NonNull*/ ExecutorFragment _AliasedElement__Element = new ExecutorFragment(Types._AliasedElement, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _AliasedElement__NamedElement = new ExecutorFragment(Types._AliasedElement, TextualCommonsTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _AliasedElement__OclAny = new ExecutorFragment(Types._AliasedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AliasedElement__OclElement = new ExecutorFragment(Types._AliasedElement, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cardinality__Cardinality = new ExecutorFragment(Types._Cardinality, TextualCommonsTables.Types._Cardinality);
		private static final /*@NonNull*/ ExecutorFragment _Cardinality__Element = new ExecutorFragment(Types._Cardinality, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Cardinality__OclAny = new ExecutorFragment(Types._Cardinality, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cardinality__OclElement = new ExecutorFragment(Types._Cardinality, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cardinality__UMLReferencingElement = new ExecutorFragment(Types._Cardinality, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _Comment__Comment = new ExecutorFragment(Types._Comment, TextualCommonsTables.Types._Comment);
		private static final /*@NonNull*/ ExecutorFragment _Comment__Element = new ExecutorFragment(Types._Comment, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Comment__OclAny = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Comment__OclElement = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Comment__UMLReferencingElement = new ExecutorFragment(Types._Comment, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _Commentable__Commentable = new ExecutorFragment(Types._Commentable, TextualCommonsTables.Types._Commentable);
		private static final /*@NonNull*/ ExecutorFragment _Commentable__Element = new ExecutorFragment(Types._Commentable, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Commentable__OclAny = new ExecutorFragment(Types._Commentable, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Commentable__OclElement = new ExecutorFragment(Types._Commentable, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Commentable__UMLReferencingElement = new ExecutorFragment(Types._Commentable, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NamedElement__Element = new ExecutorFragment(Types._NamedElement, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, TextualCommonsTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _PackageBase__Element = new ExecutorFragment(Types._PackageBase, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__NamedElement = new ExecutorFragment(Types._PackageBase, TextualCommonsTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__OclAny = new ExecutorFragment(Types._PackageBase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__OclElement = new ExecutorFragment(Types._PackageBase, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__PackageBase = new ExecutorFragment(Types._PackageBase, TextualCommonsTables.Types._PackageBase);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__PackageableElement = new ExecutorFragment(Types._PackageBase, TextualCommonsTables.Types._PackageableElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageBase__UMLReferencingElement = new ExecutorFragment(Types._PackageBase, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _PackageImport__Element = new ExecutorFragment(Types._PackageImport, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _PackageImport__OclAny = new ExecutorFragment(Types._PackageImport, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PackageImport__OclElement = new ExecutorFragment(Types._PackageImport, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageImport__PackageImport = new ExecutorFragment(Types._PackageImport, TextualCommonsTables.Types._PackageImport);
		private static final /*@NonNull*/ ExecutorFragment _PackageImport__UMLReferencingElement = new ExecutorFragment(Types._PackageImport, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _PackageableElement__Element = new ExecutorFragment(Types._PackageableElement, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _PackageableElement__OclAny = new ExecutorFragment(Types._PackageableElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PackageableElement__OclElement = new ExecutorFragment(Types._PackageableElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PackageableElement__PackageableElement = new ExecutorFragment(Types._PackageableElement, TextualCommonsTables.Types._PackageableElement);

		private static final /*@NonNull*/ ExecutorFragment _UMLReferencingElement__Element = new ExecutorFragment(Types._UMLReferencingElement, TextualCommonsTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _UMLReferencingElement__OclAny = new ExecutorFragment(Types._UMLReferencingElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _UMLReferencingElement__OclElement = new ExecutorFragment(Types._UMLReferencingElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _UMLReferencingElement__UMLReferencingElement = new ExecutorFragment(Types._UMLReferencingElement, TextualCommonsTables.Types._UMLReferencingElement);

		private static final /*@NonNull*/ ExecutorFragment _VisibilityHavingElement__OclAny = new ExecutorFragment(Types._VisibilityHavingElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityHavingElement__OclElement = new ExecutorFragment(Types._VisibilityHavingElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VisibilityHavingElement__VisibilityHavingElement = new ExecutorFragment(Types._VisibilityHavingElement, TextualCommonsTables.Types._VisibilityHavingElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Element__getNearestPackage = new ExecutorOperation("getNearestPackage", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Element,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _AliasedElement__alias = new EcoreExecutorProperty(TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, Types._AliasedElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _Cardinality__lowerBound = new EcoreExecutorProperty(TextualCommonsPackage.Literals.CARDINALITY__LOWER_BOUND, Types._Cardinality, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cardinality__upperBound = new EcoreExecutorProperty(TextualCommonsPackage.Literals.CARDINALITY__UPPER_BOUND, Types._Cardinality, 1);

		public static final /*@NonNull*/ ExecutorProperty _Comment__body = new EcoreExecutorProperty(TextualCommonsPackage.Literals.COMMENT__BODY, Types._Comment, 0);
		public static final /*@NonNull*/ ExecutorProperty _Comment__commentedElement = new EcoreExecutorProperty(TextualCommonsPackage.Literals.COMMENT__COMMENTED_ELEMENT, Types._Comment, 1);

		public static final /*@NonNull*/ ExecutorProperty _Commentable__comments = new EcoreExecutorProperty(TextualCommonsPackage.Literals.COMMENTABLE__COMMENTS, Types._Commentable, 0);

		public static final /*@NonNull*/ ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _PackageBase__owningPackage = new EcoreExecutorProperty(TextualCommonsPackage.Literals.PACKAGE_BASE__OWNING_PACKAGE, Types._PackageBase, 0);
		public static final /*@NonNull*/ ExecutorProperty _PackageBase__packageImports = new EcoreExecutorProperty(TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGE_IMPORTS, Types._PackageBase, 1);
		public static final /*@NonNull*/ ExecutorProperty _PackageBase__packages = new EcoreExecutorProperty(TextualCommonsPackage.Literals.PACKAGE_BASE__PACKAGES, Types._PackageBase, 2);

		public static final /*@NonNull*/ ExecutorProperty _PackageImport__importedPackage = new EcoreExecutorProperty(TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE, Types._PackageImport, 0);
		public static final /*@NonNull*/ ExecutorProperty _PackageImport__importingPackage = new EcoreExecutorProperty(TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTING_PACKAGE, Types._PackageImport, 1);

		public static final /*@NonNull*/ ExecutorProperty _UMLReferencingElement__referencedElement = new EcoreExecutorProperty(TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, Types._UMLReferencingElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _VisibilityHavingElement__visibility = new EcoreExecutorProperty(TextualCommonsPackage.Literals.VISIBILITY_HAVING_ELEMENT__VISIBILITY, Types._VisibilityHavingElement, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AliasedElement =
		{
			Fragments._AliasedElement__OclAny /* 0 */,
			Fragments._AliasedElement__OclElement /* 1 */,
			Fragments._AliasedElement__Element /* 2 */,
			Fragments._AliasedElement__NamedElement /* 3 */,
			Fragments._AliasedElement__AliasedElement /* 4 */
		};
		private static final int /*@NonNull*/ [] __AliasedElement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cardinality =
		{
			Fragments._Cardinality__OclAny /* 0 */,
			Fragments._Cardinality__OclElement /* 1 */,
			Fragments._Cardinality__Element /* 2 */,
			Fragments._Cardinality__UMLReferencingElement /* 3 */,
			Fragments._Cardinality__Cardinality /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cardinality = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Comment =
		{
			Fragments._Comment__OclAny /* 0 */,
			Fragments._Comment__OclElement /* 1 */,
			Fragments._Comment__Element /* 2 */,
			Fragments._Comment__UMLReferencingElement /* 3 */,
			Fragments._Comment__Comment /* 4 */
		};
		private static final int /*@NonNull*/ [] __Comment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Commentable =
		{
			Fragments._Commentable__OclAny /* 0 */,
			Fragments._Commentable__OclElement /* 1 */,
			Fragments._Commentable__Element /* 2 */,
			Fragments._Commentable__UMLReferencingElement /* 3 */,
			Fragments._Commentable__Commentable /* 4 */
		};
		private static final int /*@NonNull*/ [] __Commentable = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Element =
		{
			Fragments._Element__OclAny /* 0 */,
			Fragments._Element__OclElement /* 1 */,
			Fragments._Element__Element /* 2 */
		};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NamedElement =
		{
			Fragments._NamedElement__OclAny /* 0 */,
			Fragments._NamedElement__OclElement /* 1 */,
			Fragments._NamedElement__Element /* 2 */,
			Fragments._NamedElement__NamedElement /* 3 */
		};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PackageBase =
		{
			Fragments._PackageBase__OclAny /* 0 */,
			Fragments._PackageBase__OclElement /* 1 */,
			Fragments._PackageBase__Element /* 2 */,
			Fragments._PackageBase__NamedElement /* 3 */,
			Fragments._PackageBase__PackageableElement /* 3 */,
			Fragments._PackageBase__UMLReferencingElement /* 3 */,
			Fragments._PackageBase__PackageBase /* 4 */
		};
		private static final int /*@NonNull*/ [] __PackageBase = { 1,1,1,3,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PackageImport =
		{
			Fragments._PackageImport__OclAny /* 0 */,
			Fragments._PackageImport__OclElement /* 1 */,
			Fragments._PackageImport__Element /* 2 */,
			Fragments._PackageImport__UMLReferencingElement /* 3 */,
			Fragments._PackageImport__PackageImport /* 4 */
		};
		private static final int /*@NonNull*/ [] __PackageImport = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PackageableElement =
		{
			Fragments._PackageableElement__OclAny /* 0 */,
			Fragments._PackageableElement__OclElement /* 1 */,
			Fragments._PackageableElement__Element /* 2 */,
			Fragments._PackageableElement__PackageableElement /* 3 */
		};
		private static final int /*@NonNull*/ [] __PackageableElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _UMLReferencingElement =
		{
			Fragments._UMLReferencingElement__OclAny /* 0 */,
			Fragments._UMLReferencingElement__OclElement /* 1 */,
			Fragments._UMLReferencingElement__Element /* 2 */,
			Fragments._UMLReferencingElement__UMLReferencingElement /* 3 */
		};
		private static final int /*@NonNull*/ [] __UMLReferencingElement = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VisibilityHavingElement =
		{
			Fragments._VisibilityHavingElement__OclAny /* 0 */,
			Fragments._VisibilityHavingElement__OclElement /* 1 */,
			Fragments._VisibilityHavingElement__VisibilityHavingElement /* 2 */
		};
		private static final int /*@NonNull*/ [] __VisibilityHavingElement = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AliasedElement.initFragments(_AliasedElement, __AliasedElement);
			Types._Cardinality.initFragments(_Cardinality, __Cardinality);
			Types._Comment.initFragments(_Comment, __Comment);
			Types._Commentable.initFragments(_Commentable, __Commentable);
			Types._Element.initFragments(_Element, __Element);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._PackageBase.initFragments(_PackageBase, __PackageBase);
			Types._PackageImport.initFragments(_PackageImport, __PackageImport);
			Types._PackageableElement.initFragments(_PackageableElement, __PackageableElement);
			Types._UMLReferencingElement.initFragments(_UMLReferencingElement, __UMLReferencingElement);
			Types._VisibilityHavingElement.initFragments(_VisibilityHavingElement, __VisibilityHavingElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AliasedElement__AliasedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AliasedElement__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AliasedElement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AliasedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AliasedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cardinality__Cardinality = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cardinality__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cardinality__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cardinality__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cardinality__UMLReferencingElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__Comment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Comment__UMLReferencingElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Commentable__Commentable = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Commentable__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Commentable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Commentable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Commentable__UMLReferencingElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Element__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__PackageBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__PackageableElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageBase__UMLReferencingElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageImport__PackageImport = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageImport__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageImport__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageImport__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageImport__UMLReferencingElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageableElement__PackageableElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageableElement__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageableElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PackageableElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UMLReferencingElement__UMLReferencingElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UMLReferencingElement__Element = {
			TextualCommonsTables.Operations._Element__getNearestPackage /* getNearestPackage() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UMLReferencingElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _UMLReferencingElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityHavingElement__VisibilityHavingElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityHavingElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VisibilityHavingElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AliasedElement__AliasedElement.initOperations(_AliasedElement__AliasedElement);
			Fragments._AliasedElement__Element.initOperations(_AliasedElement__Element);
			Fragments._AliasedElement__NamedElement.initOperations(_AliasedElement__NamedElement);
			Fragments._AliasedElement__OclAny.initOperations(_AliasedElement__OclAny);
			Fragments._AliasedElement__OclElement.initOperations(_AliasedElement__OclElement);

			Fragments._Cardinality__Cardinality.initOperations(_Cardinality__Cardinality);
			Fragments._Cardinality__Element.initOperations(_Cardinality__Element);
			Fragments._Cardinality__OclAny.initOperations(_Cardinality__OclAny);
			Fragments._Cardinality__OclElement.initOperations(_Cardinality__OclElement);
			Fragments._Cardinality__UMLReferencingElement.initOperations(_Cardinality__UMLReferencingElement);

			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__Element.initOperations(_Comment__Element);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__OclElement.initOperations(_Comment__OclElement);
			Fragments._Comment__UMLReferencingElement.initOperations(_Comment__UMLReferencingElement);

			Fragments._Commentable__Commentable.initOperations(_Commentable__Commentable);
			Fragments._Commentable__Element.initOperations(_Commentable__Element);
			Fragments._Commentable__OclAny.initOperations(_Commentable__OclAny);
			Fragments._Commentable__OclElement.initOperations(_Commentable__OclElement);
			Fragments._Commentable__UMLReferencingElement.initOperations(_Commentable__UMLReferencingElement);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._NamedElement__Element.initOperations(_NamedElement__Element);
			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._PackageBase__Element.initOperations(_PackageBase__Element);
			Fragments._PackageBase__NamedElement.initOperations(_PackageBase__NamedElement);
			Fragments._PackageBase__OclAny.initOperations(_PackageBase__OclAny);
			Fragments._PackageBase__OclElement.initOperations(_PackageBase__OclElement);
			Fragments._PackageBase__PackageBase.initOperations(_PackageBase__PackageBase);
			Fragments._PackageBase__PackageableElement.initOperations(_PackageBase__PackageableElement);
			Fragments._PackageBase__UMLReferencingElement.initOperations(_PackageBase__UMLReferencingElement);

			Fragments._PackageImport__Element.initOperations(_PackageImport__Element);
			Fragments._PackageImport__OclAny.initOperations(_PackageImport__OclAny);
			Fragments._PackageImport__OclElement.initOperations(_PackageImport__OclElement);
			Fragments._PackageImport__PackageImport.initOperations(_PackageImport__PackageImport);
			Fragments._PackageImport__UMLReferencingElement.initOperations(_PackageImport__UMLReferencingElement);

			Fragments._PackageableElement__Element.initOperations(_PackageableElement__Element);
			Fragments._PackageableElement__OclAny.initOperations(_PackageableElement__OclAny);
			Fragments._PackageableElement__OclElement.initOperations(_PackageableElement__OclElement);
			Fragments._PackageableElement__PackageableElement.initOperations(_PackageableElement__PackageableElement);

			Fragments._UMLReferencingElement__Element.initOperations(_UMLReferencingElement__Element);
			Fragments._UMLReferencingElement__OclAny.initOperations(_UMLReferencingElement__OclAny);
			Fragments._UMLReferencingElement__OclElement.initOperations(_UMLReferencingElement__OclElement);
			Fragments._UMLReferencingElement__UMLReferencingElement.initOperations(_UMLReferencingElement__UMLReferencingElement);

			Fragments._VisibilityHavingElement__OclAny.initOperations(_VisibilityHavingElement__OclAny);
			Fragments._VisibilityHavingElement__OclElement.initOperations(_VisibilityHavingElement__OclElement);
			Fragments._VisibilityHavingElement__VisibilityHavingElement.initOperations(_VisibilityHavingElement__VisibilityHavingElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AliasedElement = {
			TextualCommonsTables.Properties._AliasedElement__alias,
			TextualCommonsTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cardinality = {
			TextualCommonsTables.Properties._Cardinality__lowerBound,
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement,
			TextualCommonsTables.Properties._Cardinality__upperBound
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Comment = {
			TextualCommonsTables.Properties._Comment__body,
			TextualCommonsTables.Properties._Comment__commentedElement,
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Commentable = {
			TextualCommonsTables.Properties._Commentable__comments,
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Element = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			TextualCommonsTables.Properties._NamedElement__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PackageBase = {
			TextualCommonsTables.Properties._NamedElement__name,
			TextualCommonsTables.Properties._PackageBase__owningPackage,
			TextualCommonsTables.Properties._PackageBase__packageImports,
			TextualCommonsTables.Properties._PackageBase__packages,
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PackageImport = {
			TextualCommonsTables.Properties._PackageImport__importedPackage,
			TextualCommonsTables.Properties._PackageImport__importingPackage,
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PackageableElement = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _UMLReferencingElement = {
			TextualCommonsTables.Properties._UMLReferencingElement__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VisibilityHavingElement = {
			TextualCommonsTables.Properties._VisibilityHavingElement__visibility
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AliasedElement__AliasedElement.initProperties(_AliasedElement);
			Fragments._Cardinality__Cardinality.initProperties(_Cardinality);
			Fragments._Comment__Comment.initProperties(_Comment);
			Fragments._Commentable__Commentable.initProperties(_Commentable);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._PackageBase__PackageBase.initProperties(_PackageBase);
			Fragments._PackageImport__PackageImport.initProperties(_PackageImport);
			Fragments._PackageableElement__PackageableElement.initProperties(_PackageableElement);
			Fragments._UMLReferencingElement__UMLReferencingElement.initProperties(_UMLReferencingElement);
			Fragments._VisibilityHavingElement__VisibilityHavingElement.initProperties(_VisibilityHavingElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TextualCommonsTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
