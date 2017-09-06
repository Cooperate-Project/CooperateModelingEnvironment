/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.cooperateproject.modeling.textual.sequence.metamodel/model/Sequence_Intermediate.ecore
 * using:
 *   /de.cooperateproject.modeling.textual.sequence.metamodel/model/Sequence_Intermediate.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.cooperateproject.modeling.textual.sequence.sequenceintermediate;

import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorTypeParameter;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * SequenceIntermediateTables provides the dispatch tables for the sequenceintermediate for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class SequenceIntermediateTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SequenceIntermediatePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.cooperateproject.de/modeling/textual/sequence/SequenceIntermediate", null, de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediatePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_FinishDeterminesPointInTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("FinishDeterminesPointInTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_FragmentIndexPointInTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("FragmentIndexPointInTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MaximumPointInTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("MaximumPointInTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MinimumPointInTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("MinimumPointInTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_PointInTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("PointInTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SIDiagram = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SIDiagram", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SIExecution = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SIExecution", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SIExecutionContainer = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SIExecutionContainer", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SILifeline = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SILifeline", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SIMessage = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SIMessage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SIRegion = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SIRegion", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_SITimedElement = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("SITimedElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_StartDeterminesPointIntTime = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_cooperateproject_de_s_modeling_s_textual_s_sequence_s_SequenceIntermediate.getClassId("StartDeterminesPointIntTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_SIExecution_c_c_containerMustReferenceTheSameLifelineAsContainedExe = "SIExecution::containerMustReferenceTheSameLifelineAsContainedExecutions";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_FinishDeterminesPointInTime = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_FinishDeterminesPointInTime);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_MaximumPointInTime = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_MaximumPointInTime);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_MinimumPointInTime = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_MinimumPointInTime);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_SIExecution = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SIExecution);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_SITimedElement = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SITimedElement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_StartDeterminesPointIntTime = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_StartDeterminesPointIntTime);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_PointInTime = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_PointInTime);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_SIExecution = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SIExecution);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_SILifeline = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SILifeline);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_SIMessage = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SIMessage);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_SIRegion = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_SIRegion);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_PointInTime = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateTables.CLSSid_PointInTime);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SequenceIntermediateTables.init();
		}

		public static final /*@NonNull*/ ExecutorTypeParameter _SIElementWithTextualReference_ElementType = new ExecutorTypeParameter(TypeId.T_1, "ElementType");

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _FinishDeterminesPointInTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.FINISH_DETERMINES_POINT_IN_TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _FragmentIndexPointInTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.FRAGMENT_INDEX_POINT_IN_TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MaximumPointInTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.MAXIMUM_POINT_IN_TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MinimumPointInTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.MINIMUM_POINT_IN_TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PointInTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.POINT_IN_TIME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SIDiagram = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_DIAGRAM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SIElementWithTextualReference = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_ELEMENT_WITH_TEXTUAL_REFERENCE, PACKAGE, 0, TypeParameters._SIElementWithTextualReference_ElementType);
		public static final /*@NonNull*/ EcoreExecutorType _SIExecution = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_EXECUTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SIExecutionContainer = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_EXECUTION_CONTAINER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _SILifeline = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_LIFELINE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SIMessage = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_MESSAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SIRegion = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_REGION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _SITimedElement = new EcoreExecutorType(SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _StartDeterminesPointIntTime = new EcoreExecutorType(SequenceIntermediatePackage.Literals.START_DETERMINES_POINT_INT_TIME, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_FinishDeterminesPointInTime,
			_FragmentIndexPointInTime,
			_MaximumPointInTime,
			_MinimumPointInTime,
			_PointInTime,
			_SIDiagram,
			_SIElementWithTextualReference,
			_SIExecution,
			_SIExecutionContainer,
			_SILifeline,
			_SIMessage,
			_SIRegion,
			_SITimedElement,
			_StartDeterminesPointIntTime
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _FinishDeterminesPointInTime__FinishDeterminesPointInTime = new ExecutorFragment(Types._FinishDeterminesPointInTime, SequenceIntermediateTables.Types._FinishDeterminesPointInTime);
		private static final /*@NonNull*/ ExecutorFragment _FinishDeterminesPointInTime__OclAny = new ExecutorFragment(Types._FinishDeterminesPointInTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FinishDeterminesPointInTime__OclElement = new ExecutorFragment(Types._FinishDeterminesPointInTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _FinishDeterminesPointInTime__PointInTime = new ExecutorFragment(Types._FinishDeterminesPointInTime, SequenceIntermediateTables.Types._PointInTime);

		private static final /*@NonNull*/ ExecutorFragment _FragmentIndexPointInTime__FragmentIndexPointInTime = new ExecutorFragment(Types._FragmentIndexPointInTime, SequenceIntermediateTables.Types._FragmentIndexPointInTime);
		private static final /*@NonNull*/ ExecutorFragment _FragmentIndexPointInTime__OclAny = new ExecutorFragment(Types._FragmentIndexPointInTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FragmentIndexPointInTime__OclElement = new ExecutorFragment(Types._FragmentIndexPointInTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _FragmentIndexPointInTime__PointInTime = new ExecutorFragment(Types._FragmentIndexPointInTime, SequenceIntermediateTables.Types._PointInTime);
		private static final /*@NonNull*/ ExecutorFragment _FragmentIndexPointInTime__SIElementWithTextualReference = new ExecutorFragment(Types._FragmentIndexPointInTime, SequenceIntermediateTables.Types._SIElementWithTextualReference);

		private static final /*@NonNull*/ ExecutorFragment _MaximumPointInTime__MaximumPointInTime = new ExecutorFragment(Types._MaximumPointInTime, SequenceIntermediateTables.Types._MaximumPointInTime);
		private static final /*@NonNull*/ ExecutorFragment _MaximumPointInTime__OclAny = new ExecutorFragment(Types._MaximumPointInTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MaximumPointInTime__OclElement = new ExecutorFragment(Types._MaximumPointInTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MaximumPointInTime__PointInTime = new ExecutorFragment(Types._MaximumPointInTime, SequenceIntermediateTables.Types._PointInTime);

		private static final /*@NonNull*/ ExecutorFragment _MinimumPointInTime__MinimumPointInTime = new ExecutorFragment(Types._MinimumPointInTime, SequenceIntermediateTables.Types._MinimumPointInTime);
		private static final /*@NonNull*/ ExecutorFragment _MinimumPointInTime__OclAny = new ExecutorFragment(Types._MinimumPointInTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MinimumPointInTime__OclElement = new ExecutorFragment(Types._MinimumPointInTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _MinimumPointInTime__PointInTime = new ExecutorFragment(Types._MinimumPointInTime, SequenceIntermediateTables.Types._PointInTime);

		private static final /*@NonNull*/ ExecutorFragment _PointInTime__OclAny = new ExecutorFragment(Types._PointInTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PointInTime__OclElement = new ExecutorFragment(Types._PointInTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PointInTime__PointInTime = new ExecutorFragment(Types._PointInTime, SequenceIntermediateTables.Types._PointInTime);

		private static final /*@NonNull*/ ExecutorFragment _SIDiagram__OclAny = new ExecutorFragment(Types._SIDiagram, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIDiagram__OclElement = new ExecutorFragment(Types._SIDiagram, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIDiagram__SIDiagram = new ExecutorFragment(Types._SIDiagram, SequenceIntermediateTables.Types._SIDiagram);
		private static final /*@NonNull*/ ExecutorFragment _SIDiagram__SIElementWithTextualReference = new ExecutorFragment(Types._SIDiagram, SequenceIntermediateTables.Types._SIElementWithTextualReference);
		private static final /*@NonNull*/ ExecutorFragment _SIDiagram__SIExecutionContainer = new ExecutorFragment(Types._SIDiagram, SequenceIntermediateTables.Types._SIExecutionContainer);

		private static final /*@NonNull*/ ExecutorFragment _SIElementWithTextualReference__OclAny = new ExecutorFragment(Types._SIElementWithTextualReference, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIElementWithTextualReference__OclElement = new ExecutorFragment(Types._SIElementWithTextualReference, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIElementWithTextualReference__SIElementWithTextualReference = new ExecutorFragment(Types._SIElementWithTextualReference, SequenceIntermediateTables.Types._SIElementWithTextualReference);

		private static final /*@NonNull*/ ExecutorFragment _SIExecution__OclAny = new ExecutorFragment(Types._SIExecution, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIExecution__OclElement = new ExecutorFragment(Types._SIExecution, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIExecution__SIExecution = new ExecutorFragment(Types._SIExecution, SequenceIntermediateTables.Types._SIExecution);
		private static final /*@NonNull*/ ExecutorFragment _SIExecution__SIExecutionContainer = new ExecutorFragment(Types._SIExecution, SequenceIntermediateTables.Types._SIExecutionContainer);
		private static final /*@NonNull*/ ExecutorFragment _SIExecution__SITimedElement = new ExecutorFragment(Types._SIExecution, SequenceIntermediateTables.Types._SITimedElement);

		private static final /*@NonNull*/ ExecutorFragment _SIExecutionContainer__OclAny = new ExecutorFragment(Types._SIExecutionContainer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIExecutionContainer__OclElement = new ExecutorFragment(Types._SIExecutionContainer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIExecutionContainer__SIExecutionContainer = new ExecutorFragment(Types._SIExecutionContainer, SequenceIntermediateTables.Types._SIExecutionContainer);

		private static final /*@NonNull*/ ExecutorFragment _SILifeline__OclAny = new ExecutorFragment(Types._SILifeline, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SILifeline__OclElement = new ExecutorFragment(Types._SILifeline, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SILifeline__SIElementWithTextualReference = new ExecutorFragment(Types._SILifeline, SequenceIntermediateTables.Types._SIElementWithTextualReference);
		private static final /*@NonNull*/ ExecutorFragment _SILifeline__SILifeline = new ExecutorFragment(Types._SILifeline, SequenceIntermediateTables.Types._SILifeline);
		private static final /*@NonNull*/ ExecutorFragment _SILifeline__SITimedElement = new ExecutorFragment(Types._SILifeline, SequenceIntermediateTables.Types._SITimedElement);

		private static final /*@NonNull*/ ExecutorFragment _SIMessage__OclAny = new ExecutorFragment(Types._SIMessage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIMessage__OclElement = new ExecutorFragment(Types._SIMessage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIMessage__SIElementWithTextualReference = new ExecutorFragment(Types._SIMessage, SequenceIntermediateTables.Types._SIElementWithTextualReference);
		private static final /*@NonNull*/ ExecutorFragment _SIMessage__SIMessage = new ExecutorFragment(Types._SIMessage, SequenceIntermediateTables.Types._SIMessage);
		private static final /*@NonNull*/ ExecutorFragment _SIMessage__SITimedElement = new ExecutorFragment(Types._SIMessage, SequenceIntermediateTables.Types._SITimedElement);

		private static final /*@NonNull*/ ExecutorFragment _SIRegion__OclAny = new ExecutorFragment(Types._SIRegion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SIRegion__OclElement = new ExecutorFragment(Types._SIRegion, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SIRegion__SIElementWithTextualReference = new ExecutorFragment(Types._SIRegion, SequenceIntermediateTables.Types._SIElementWithTextualReference);
		private static final /*@NonNull*/ ExecutorFragment _SIRegion__SIExecutionContainer = new ExecutorFragment(Types._SIRegion, SequenceIntermediateTables.Types._SIExecutionContainer);
		private static final /*@NonNull*/ ExecutorFragment _SIRegion__SIRegion = new ExecutorFragment(Types._SIRegion, SequenceIntermediateTables.Types._SIRegion);
		private static final /*@NonNull*/ ExecutorFragment _SIRegion__SITimedElement = new ExecutorFragment(Types._SIRegion, SequenceIntermediateTables.Types._SITimedElement);

		private static final /*@NonNull*/ ExecutorFragment _SITimedElement__OclAny = new ExecutorFragment(Types._SITimedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SITimedElement__OclElement = new ExecutorFragment(Types._SITimedElement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SITimedElement__SITimedElement = new ExecutorFragment(Types._SITimedElement, SequenceIntermediateTables.Types._SITimedElement);

		private static final /*@NonNull*/ ExecutorFragment _StartDeterminesPointIntTime__OclAny = new ExecutorFragment(Types._StartDeterminesPointIntTime, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StartDeterminesPointIntTime__OclElement = new ExecutorFragment(Types._StartDeterminesPointIntTime, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StartDeterminesPointIntTime__PointInTime = new ExecutorFragment(Types._StartDeterminesPointIntTime, SequenceIntermediateTables.Types._PointInTime);
		private static final /*@NonNull*/ ExecutorFragment _StartDeterminesPointIntTime__StartDeterminesPointIntTime = new ExecutorFragment(Types._StartDeterminesPointIntTime, SequenceIntermediateTables.Types._StartDeterminesPointIntTime);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
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
		 * Force initialization of the fields of SequenceIntermediateTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _FinishDeterminesPointInTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._FinishDeterminesPointInTime,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _FragmentIndexPointInTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._FragmentIndexPointInTime,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _MaximumPointInTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._MaximumPointInTime,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _MinimumPointInTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._MinimumPointInTime,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _PointInTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PointInTime,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _StartDeterminesPointIntTime__getTimeInternal = new ExecutorOperation("getTimeInternal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._StartDeterminesPointIntTime,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _FinishDeterminesPointInTime__timedElement = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT, Types._FinishDeterminesPointInTime, 0);

		public static final /*@NonNull*/ ExecutorProperty _FragmentIndexPointInTime__fragmentIndex = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.FRAGMENT_INDEX_POINT_IN_TIME__FRAGMENT_INDEX, Types._FragmentIndexPointInTime, 0);

		public static final /*@NonNull*/ ExecutorProperty _MaximumPointInTime__elements = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.MAXIMUM_POINT_IN_TIME__ELEMENTS, Types._MaximumPointInTime, 0);

		public static final /*@NonNull*/ ExecutorProperty _MinimumPointInTime__elements = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.MINIMUM_POINT_IN_TIME__ELEMENTS, Types._MinimumPointInTime, 0);

		public static final /*@NonNull*/ ExecutorProperty _PointInTime__time = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.POINT_IN_TIME__TIME, Types._PointInTime, 0);
		public static final /*@NonNull*/ ExecutorProperty _PointInTime__MaximumPointInTime__elements = new ExecutorPropertyWithImplementation("MaximumPointInTime", Types._PointInTime, 1, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.MAXIMUM_POINT_IN_TIME__ELEMENTS));
		public static final /*@NonNull*/ ExecutorProperty _PointInTime__MinimumPointInTime__elements = new ExecutorPropertyWithImplementation("MinimumPointInTime", Types._PointInTime, 2, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.MINIMUM_POINT_IN_TIME__ELEMENTS));
		public static final /*@NonNull*/ ExecutorProperty _PointInTime__SITimedElement__finish = new ExecutorPropertyWithImplementation("SITimedElement", Types._PointInTime, 3, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT__FINISH));
		public static final /*@NonNull*/ ExecutorProperty _PointInTime__SITimedElement__start = new ExecutorPropertyWithImplementation("SITimedElement", Types._PointInTime, 4, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT__START));

		public static final /*@NonNull*/ ExecutorProperty _SIDiagram__lifelines = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_DIAGRAM__LIFELINES, Types._SIDiagram, 0);
		public static final /*@NonNull*/ ExecutorProperty _SIDiagram__regions = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_DIAGRAM__REGIONS, Types._SIDiagram, 1);

		public static final /*@NonNull*/ ExecutorProperty _SIElementWithTextualReference__referencedElement = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_ELEMENT_WITH_TEXTUAL_REFERENCE__REFERENCED_ELEMENT, Types._SIElementWithTextualReference, 0);

		public static final /*@NonNull*/ ExecutorProperty _SIExecution__callstack = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__CALLSTACK, Types._SIExecution, 0);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__container = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__CONTAINER, Types._SIExecution, 1);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__executionCause = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__EXECUTION_CAUSE, Types._SIExecution, 2);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__lifeline = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__LIFELINE, Types._SIExecution, 3);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__messages = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__MESSAGES, Types._SIExecution, 4);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__syncReply = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__SYNC_REPLY, Types._SIExecution, 5);
		public static final /*@NonNull*/ ExecutorProperty _SIExecution__SIExecution__callstack = new ExecutorPropertyWithImplementation("SIExecution", Types._SIExecution, 6, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__CALLSTACK));

		public static final /*@NonNull*/ ExecutorProperty _SIExecutionContainer__executions = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION_CONTAINER__EXECUTIONS, Types._SIExecutionContainer, 0);

		public static final /*@NonNull*/ ExecutorProperty _SILifeline__diagram = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_LIFELINE__DIAGRAM, Types._SILifeline, 0);
		public static final /*@NonNull*/ ExecutorProperty _SILifeline__SIExecution__lifeline = new ExecutorPropertyWithImplementation("SIExecution", Types._SILifeline, 1, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__LIFELINE));

		public static final /*@NonNull*/ ExecutorProperty _SIMessage__causesExecution = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_MESSAGE__CAUSES_EXECUTION, Types._SIMessage, 0);
		public static final /*@NonNull*/ ExecutorProperty _SIMessage__origin = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_MESSAGE__ORIGIN, Types._SIMessage, 1);
		public static final /*@NonNull*/ ExecutorProperty _SIMessage__SIExecution__syncReply = new ExecutorPropertyWithImplementation("SIExecution", Types._SIMessage, 2, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.SI_EXECUTION__SYNC_REPLY));

		public static final /*@NonNull*/ ExecutorProperty _SIRegion__diagram = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_REGION__DIAGRAM, Types._SIRegion, 0);

		public static final /*@NonNull*/ ExecutorProperty _SITimedElement__finish = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT__FINISH, Types._SITimedElement, 0);
		public static final /*@NonNull*/ ExecutorProperty _SITimedElement__start = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.SI_TIMED_ELEMENT__START, Types._SITimedElement, 1);
		public static final /*@NonNull*/ ExecutorProperty _SITimedElement__FinishDeterminesPointInTime__timedElement = new ExecutorPropertyWithImplementation("FinishDeterminesPointInTime", Types._SITimedElement, 2, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.FINISH_DETERMINES_POINT_IN_TIME__TIMED_ELEMENT));
		public static final /*@NonNull*/ ExecutorProperty _SITimedElement__StartDeterminesPointIntTime__timedElement = new ExecutorPropertyWithImplementation("StartDeterminesPointIntTime", Types._SITimedElement, 3, new EcoreLibraryOppositeProperty(SequenceIntermediatePackage.Literals.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT));

		public static final /*@NonNull*/ ExecutorProperty _StartDeterminesPointIntTime__timedElement = new EcoreExecutorProperty(SequenceIntermediatePackage.Literals.START_DETERMINES_POINT_INT_TIME__TIMED_ELEMENT, Types._StartDeterminesPointIntTime, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FinishDeterminesPointInTime =
		{
			Fragments._FinishDeterminesPointInTime__OclAny /* 0 */,
			Fragments._FinishDeterminesPointInTime__OclElement /* 1 */,
			Fragments._FinishDeterminesPointInTime__PointInTime /* 2 */,
			Fragments._FinishDeterminesPointInTime__FinishDeterminesPointInTime /* 3 */
		};
		private static final int /*@NonNull*/ [] __FinishDeterminesPointInTime = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FragmentIndexPointInTime =
		{
			Fragments._FragmentIndexPointInTime__OclAny /* 0 */,
			Fragments._FragmentIndexPointInTime__OclElement /* 1 */,
			Fragments._FragmentIndexPointInTime__PointInTime /* 2 */,
			Fragments._FragmentIndexPointInTime__SIElementWithTextualReference /* 2 */,
			Fragments._FragmentIndexPointInTime__FragmentIndexPointInTime /* 3 */
		};
		private static final int /*@NonNull*/ [] __FragmentIndexPointInTime = { 1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MaximumPointInTime =
		{
			Fragments._MaximumPointInTime__OclAny /* 0 */,
			Fragments._MaximumPointInTime__OclElement /* 1 */,
			Fragments._MaximumPointInTime__PointInTime /* 2 */,
			Fragments._MaximumPointInTime__MaximumPointInTime /* 3 */
		};
		private static final int /*@NonNull*/ [] __MaximumPointInTime = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MinimumPointInTime =
		{
			Fragments._MinimumPointInTime__OclAny /* 0 */,
			Fragments._MinimumPointInTime__OclElement /* 1 */,
			Fragments._MinimumPointInTime__PointInTime /* 2 */,
			Fragments._MinimumPointInTime__MinimumPointInTime /* 3 */
		};
		private static final int /*@NonNull*/ [] __MinimumPointInTime = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PointInTime =
		{
			Fragments._PointInTime__OclAny /* 0 */,
			Fragments._PointInTime__OclElement /* 1 */,
			Fragments._PointInTime__PointInTime /* 2 */
		};
		private static final int /*@NonNull*/ [] __PointInTime = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIDiagram =
		{
			Fragments._SIDiagram__OclAny /* 0 */,
			Fragments._SIDiagram__OclElement /* 1 */,
			Fragments._SIDiagram__SIElementWithTextualReference /* 2 */,
			Fragments._SIDiagram__SIExecutionContainer /* 2 */,
			Fragments._SIDiagram__SIDiagram /* 3 */
		};
		private static final int /*@NonNull*/ [] __SIDiagram = { 1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIElementWithTextualReference =
		{
			Fragments._SIElementWithTextualReference__OclAny /* 0 */,
			Fragments._SIElementWithTextualReference__OclElement /* 1 */,
			Fragments._SIElementWithTextualReference__SIElementWithTextualReference /* 2 */
		};
		private static final int /*@NonNull*/ [] __SIElementWithTextualReference = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIExecution =
		{
			Fragments._SIExecution__OclAny /* 0 */,
			Fragments._SIExecution__OclElement /* 1 */,
			Fragments._SIExecution__SIExecutionContainer /* 2 */,
			Fragments._SIExecution__SITimedElement /* 2 */,
			Fragments._SIExecution__SIExecution /* 3 */
		};
		private static final int /*@NonNull*/ [] __SIExecution = { 1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIExecutionContainer =
		{
			Fragments._SIExecutionContainer__OclAny /* 0 */,
			Fragments._SIExecutionContainer__OclElement /* 1 */,
			Fragments._SIExecutionContainer__SIExecutionContainer /* 2 */
		};
		private static final int /*@NonNull*/ [] __SIExecutionContainer = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SILifeline =
		{
			Fragments._SILifeline__OclAny /* 0 */,
			Fragments._SILifeline__OclElement /* 1 */,
			Fragments._SILifeline__SIElementWithTextualReference /* 2 */,
			Fragments._SILifeline__SITimedElement /* 2 */,
			Fragments._SILifeline__SILifeline /* 3 */
		};
		private static final int /*@NonNull*/ [] __SILifeline = { 1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIMessage =
		{
			Fragments._SIMessage__OclAny /* 0 */,
			Fragments._SIMessage__OclElement /* 1 */,
			Fragments._SIMessage__SIElementWithTextualReference /* 2 */,
			Fragments._SIMessage__SITimedElement /* 2 */,
			Fragments._SIMessage__SIMessage /* 3 */
		};
		private static final int /*@NonNull*/ [] __SIMessage = { 1,1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SIRegion =
		{
			Fragments._SIRegion__OclAny /* 0 */,
			Fragments._SIRegion__OclElement /* 1 */,
			Fragments._SIRegion__SIElementWithTextualReference /* 2 */,
			Fragments._SIRegion__SIExecutionContainer /* 2 */,
			Fragments._SIRegion__SITimedElement /* 2 */,
			Fragments._SIRegion__SIRegion /* 3 */
		};
		private static final int /*@NonNull*/ [] __SIRegion = { 1,1,3,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SITimedElement =
		{
			Fragments._SITimedElement__OclAny /* 0 */,
			Fragments._SITimedElement__OclElement /* 1 */,
			Fragments._SITimedElement__SITimedElement /* 2 */
		};
		private static final int /*@NonNull*/ [] __SITimedElement = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StartDeterminesPointIntTime =
		{
			Fragments._StartDeterminesPointIntTime__OclAny /* 0 */,
			Fragments._StartDeterminesPointIntTime__OclElement /* 1 */,
			Fragments._StartDeterminesPointIntTime__PointInTime /* 2 */,
			Fragments._StartDeterminesPointIntTime__StartDeterminesPointIntTime /* 3 */
		};
		private static final int /*@NonNull*/ [] __StartDeterminesPointIntTime = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._FinishDeterminesPointInTime.initFragments(_FinishDeterminesPointInTime, __FinishDeterminesPointInTime);
			Types._FragmentIndexPointInTime.initFragments(_FragmentIndexPointInTime, __FragmentIndexPointInTime);
			Types._MaximumPointInTime.initFragments(_MaximumPointInTime, __MaximumPointInTime);
			Types._MinimumPointInTime.initFragments(_MinimumPointInTime, __MinimumPointInTime);
			Types._PointInTime.initFragments(_PointInTime, __PointInTime);
			Types._SIDiagram.initFragments(_SIDiagram, __SIDiagram);
			Types._SIElementWithTextualReference.initFragments(_SIElementWithTextualReference, __SIElementWithTextualReference);
			Types._SIExecution.initFragments(_SIExecution, __SIExecution);
			Types._SIExecutionContainer.initFragments(_SIExecutionContainer, __SIExecutionContainer);
			Types._SILifeline.initFragments(_SILifeline, __SILifeline);
			Types._SIMessage.initFragments(_SIMessage, __SIMessage);
			Types._SIRegion.initFragments(_SIRegion, __SIRegion);
			Types._SITimedElement.initFragments(_SITimedElement, __SITimedElement);
			Types._StartDeterminesPointIntTime.initFragments(_StartDeterminesPointIntTime, __StartDeterminesPointIntTime);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FinishDeterminesPointInTime__FinishDeterminesPointInTime = {
			SequenceIntermediateTables.Operations._FinishDeterminesPointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FinishDeterminesPointInTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FinishDeterminesPointInTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FinishDeterminesPointInTime__PointInTime = {
			SequenceIntermediateTables.Operations._FinishDeterminesPointInTime__getTimeInternal /* getTimeInternal() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FragmentIndexPointInTime__FragmentIndexPointInTime = {
			SequenceIntermediateTables.Operations._FragmentIndexPointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FragmentIndexPointInTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FragmentIndexPointInTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FragmentIndexPointInTime__PointInTime = {
			SequenceIntermediateTables.Operations._FragmentIndexPointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FragmentIndexPointInTime__SIElementWithTextualReference = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaximumPointInTime__MaximumPointInTime = {
			SequenceIntermediateTables.Operations._MaximumPointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaximumPointInTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaximumPointInTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MaximumPointInTime__PointInTime = {
			SequenceIntermediateTables.Operations._MaximumPointInTime__getTimeInternal /* getTimeInternal() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MinimumPointInTime__MinimumPointInTime = {
			SequenceIntermediateTables.Operations._MinimumPointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MinimumPointInTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MinimumPointInTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MinimumPointInTime__PointInTime = {
			SequenceIntermediateTables.Operations._MinimumPointInTime__getTimeInternal /* getTimeInternal() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointInTime__PointInTime = {
			SequenceIntermediateTables.Operations._PointInTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointInTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PointInTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIDiagram__SIDiagram = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIDiagram__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIDiagram__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIDiagram__SIElementWithTextualReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIDiagram__SIExecutionContainer = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIElementWithTextualReference__SIElementWithTextualReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIElementWithTextualReference__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIElementWithTextualReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecution__SIExecution = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecution__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecution__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecution__SIExecutionContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecution__SITimedElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecutionContainer__SIExecutionContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecutionContainer__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIExecutionContainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SILifeline__SILifeline = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SILifeline__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SILifeline__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SILifeline__SIElementWithTextualReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SILifeline__SITimedElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIMessage__SIMessage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIMessage__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIMessage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIMessage__SIElementWithTextualReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIMessage__SITimedElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__SIRegion = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__SIElementWithTextualReference = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__SIExecutionContainer = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SIRegion__SITimedElement = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SITimedElement__SITimedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SITimedElement__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SITimedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StartDeterminesPointIntTime__StartDeterminesPointIntTime = {
			SequenceIntermediateTables.Operations._StartDeterminesPointIntTime__getTimeInternal /* getTimeInternal() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StartDeterminesPointIntTime__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StartDeterminesPointIntTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StartDeterminesPointIntTime__PointInTime = {
			SequenceIntermediateTables.Operations._StartDeterminesPointIntTime__getTimeInternal /* getTimeInternal() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._FinishDeterminesPointInTime__FinishDeterminesPointInTime.initOperations(_FinishDeterminesPointInTime__FinishDeterminesPointInTime);
			Fragments._FinishDeterminesPointInTime__OclAny.initOperations(_FinishDeterminesPointInTime__OclAny);
			Fragments._FinishDeterminesPointInTime__OclElement.initOperations(_FinishDeterminesPointInTime__OclElement);
			Fragments._FinishDeterminesPointInTime__PointInTime.initOperations(_FinishDeterminesPointInTime__PointInTime);

			Fragments._FragmentIndexPointInTime__FragmentIndexPointInTime.initOperations(_FragmentIndexPointInTime__FragmentIndexPointInTime);
			Fragments._FragmentIndexPointInTime__OclAny.initOperations(_FragmentIndexPointInTime__OclAny);
			Fragments._FragmentIndexPointInTime__OclElement.initOperations(_FragmentIndexPointInTime__OclElement);
			Fragments._FragmentIndexPointInTime__PointInTime.initOperations(_FragmentIndexPointInTime__PointInTime);
			Fragments._FragmentIndexPointInTime__SIElementWithTextualReference.initOperations(_FragmentIndexPointInTime__SIElementWithTextualReference);

			Fragments._MaximumPointInTime__MaximumPointInTime.initOperations(_MaximumPointInTime__MaximumPointInTime);
			Fragments._MaximumPointInTime__OclAny.initOperations(_MaximumPointInTime__OclAny);
			Fragments._MaximumPointInTime__OclElement.initOperations(_MaximumPointInTime__OclElement);
			Fragments._MaximumPointInTime__PointInTime.initOperations(_MaximumPointInTime__PointInTime);

			Fragments._MinimumPointInTime__MinimumPointInTime.initOperations(_MinimumPointInTime__MinimumPointInTime);
			Fragments._MinimumPointInTime__OclAny.initOperations(_MinimumPointInTime__OclAny);
			Fragments._MinimumPointInTime__OclElement.initOperations(_MinimumPointInTime__OclElement);
			Fragments._MinimumPointInTime__PointInTime.initOperations(_MinimumPointInTime__PointInTime);

			Fragments._PointInTime__OclAny.initOperations(_PointInTime__OclAny);
			Fragments._PointInTime__OclElement.initOperations(_PointInTime__OclElement);
			Fragments._PointInTime__PointInTime.initOperations(_PointInTime__PointInTime);

			Fragments._SIDiagram__OclAny.initOperations(_SIDiagram__OclAny);
			Fragments._SIDiagram__OclElement.initOperations(_SIDiagram__OclElement);
			Fragments._SIDiagram__SIDiagram.initOperations(_SIDiagram__SIDiagram);
			Fragments._SIDiagram__SIElementWithTextualReference.initOperations(_SIDiagram__SIElementWithTextualReference);
			Fragments._SIDiagram__SIExecutionContainer.initOperations(_SIDiagram__SIExecutionContainer);

			Fragments._SIElementWithTextualReference__OclAny.initOperations(_SIElementWithTextualReference__OclAny);
			Fragments._SIElementWithTextualReference__OclElement.initOperations(_SIElementWithTextualReference__OclElement);
			Fragments._SIElementWithTextualReference__SIElementWithTextualReference.initOperations(_SIElementWithTextualReference__SIElementWithTextualReference);

			Fragments._SIExecution__OclAny.initOperations(_SIExecution__OclAny);
			Fragments._SIExecution__OclElement.initOperations(_SIExecution__OclElement);
			Fragments._SIExecution__SIExecution.initOperations(_SIExecution__SIExecution);
			Fragments._SIExecution__SIExecutionContainer.initOperations(_SIExecution__SIExecutionContainer);
			Fragments._SIExecution__SITimedElement.initOperations(_SIExecution__SITimedElement);

			Fragments._SIExecutionContainer__OclAny.initOperations(_SIExecutionContainer__OclAny);
			Fragments._SIExecutionContainer__OclElement.initOperations(_SIExecutionContainer__OclElement);
			Fragments._SIExecutionContainer__SIExecutionContainer.initOperations(_SIExecutionContainer__SIExecutionContainer);

			Fragments._SILifeline__OclAny.initOperations(_SILifeline__OclAny);
			Fragments._SILifeline__OclElement.initOperations(_SILifeline__OclElement);
			Fragments._SILifeline__SIElementWithTextualReference.initOperations(_SILifeline__SIElementWithTextualReference);
			Fragments._SILifeline__SILifeline.initOperations(_SILifeline__SILifeline);
			Fragments._SILifeline__SITimedElement.initOperations(_SILifeline__SITimedElement);

			Fragments._SIMessage__OclAny.initOperations(_SIMessage__OclAny);
			Fragments._SIMessage__OclElement.initOperations(_SIMessage__OclElement);
			Fragments._SIMessage__SIElementWithTextualReference.initOperations(_SIMessage__SIElementWithTextualReference);
			Fragments._SIMessage__SIMessage.initOperations(_SIMessage__SIMessage);
			Fragments._SIMessage__SITimedElement.initOperations(_SIMessage__SITimedElement);

			Fragments._SIRegion__OclAny.initOperations(_SIRegion__OclAny);
			Fragments._SIRegion__OclElement.initOperations(_SIRegion__OclElement);
			Fragments._SIRegion__SIElementWithTextualReference.initOperations(_SIRegion__SIElementWithTextualReference);
			Fragments._SIRegion__SIExecutionContainer.initOperations(_SIRegion__SIExecutionContainer);
			Fragments._SIRegion__SIRegion.initOperations(_SIRegion__SIRegion);
			Fragments._SIRegion__SITimedElement.initOperations(_SIRegion__SITimedElement);

			Fragments._SITimedElement__OclAny.initOperations(_SITimedElement__OclAny);
			Fragments._SITimedElement__OclElement.initOperations(_SITimedElement__OclElement);
			Fragments._SITimedElement__SITimedElement.initOperations(_SITimedElement__SITimedElement);

			Fragments._StartDeterminesPointIntTime__OclAny.initOperations(_StartDeterminesPointIntTime__OclAny);
			Fragments._StartDeterminesPointIntTime__OclElement.initOperations(_StartDeterminesPointIntTime__OclElement);
			Fragments._StartDeterminesPointIntTime__PointInTime.initOperations(_StartDeterminesPointIntTime__PointInTime);
			Fragments._StartDeterminesPointIntTime__StartDeterminesPointIntTime.initOperations(_StartDeterminesPointIntTime__StartDeterminesPointIntTime);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FinishDeterminesPointInTime = {
			SequenceIntermediateTables.Properties._PointInTime__time,
			SequenceIntermediateTables.Properties._FinishDeterminesPointInTime__timedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FragmentIndexPointInTime = {
			SequenceIntermediateTables.Properties._FragmentIndexPointInTime__fragmentIndex,
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement,
			SequenceIntermediateTables.Properties._PointInTime__time
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MaximumPointInTime = {
			SequenceIntermediateTables.Properties._MaximumPointInTime__elements,
			SequenceIntermediateTables.Properties._PointInTime__time
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MinimumPointInTime = {
			SequenceIntermediateTables.Properties._MinimumPointInTime__elements,
			SequenceIntermediateTables.Properties._PointInTime__time
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PointInTime = {
			SequenceIntermediateTables.Properties._PointInTime__time
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIDiagram = {
			SequenceIntermediateTables.Properties._SIExecutionContainer__executions,
			SequenceIntermediateTables.Properties._SIDiagram__lifelines,
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement,
			SequenceIntermediateTables.Properties._SIDiagram__regions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIElementWithTextualReference = {
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIExecution = {
			SequenceIntermediateTables.Properties._SIExecution__callstack,
			SequenceIntermediateTables.Properties._SIExecution__container,
			SequenceIntermediateTables.Properties._SIExecution__executionCause,
			SequenceIntermediateTables.Properties._SIExecutionContainer__executions,
			SequenceIntermediateTables.Properties._SITimedElement__finish,
			SequenceIntermediateTables.Properties._SIExecution__lifeline,
			SequenceIntermediateTables.Properties._SIExecution__messages,
			SequenceIntermediateTables.Properties._SITimedElement__start,
			SequenceIntermediateTables.Properties._SIExecution__syncReply
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIExecutionContainer = {
			SequenceIntermediateTables.Properties._SIExecutionContainer__executions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SILifeline = {
			SequenceIntermediateTables.Properties._SILifeline__diagram,
			SequenceIntermediateTables.Properties._SITimedElement__finish,
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement,
			SequenceIntermediateTables.Properties._SITimedElement__start
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIMessage = {
			SequenceIntermediateTables.Properties._SIMessage__causesExecution,
			SequenceIntermediateTables.Properties._SITimedElement__finish,
			SequenceIntermediateTables.Properties._SIMessage__origin,
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement,
			SequenceIntermediateTables.Properties._SITimedElement__start
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SIRegion = {
			SequenceIntermediateTables.Properties._SIRegion__diagram,
			SequenceIntermediateTables.Properties._SIExecutionContainer__executions,
			SequenceIntermediateTables.Properties._SITimedElement__finish,
			SequenceIntermediateTables.Properties._SIElementWithTextualReference__referencedElement,
			SequenceIntermediateTables.Properties._SITimedElement__start
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SITimedElement = {
			SequenceIntermediateTables.Properties._SITimedElement__finish,
			SequenceIntermediateTables.Properties._SITimedElement__start
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StartDeterminesPointIntTime = {
			SequenceIntermediateTables.Properties._PointInTime__time,
			SequenceIntermediateTables.Properties._StartDeterminesPointIntTime__timedElement
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._FinishDeterminesPointInTime__FinishDeterminesPointInTime.initProperties(_FinishDeterminesPointInTime);
			Fragments._FragmentIndexPointInTime__FragmentIndexPointInTime.initProperties(_FragmentIndexPointInTime);
			Fragments._MaximumPointInTime__MaximumPointInTime.initProperties(_MaximumPointInTime);
			Fragments._MinimumPointInTime__MinimumPointInTime.initProperties(_MinimumPointInTime);
			Fragments._PointInTime__PointInTime.initProperties(_PointInTime);
			Fragments._SIDiagram__SIDiagram.initProperties(_SIDiagram);
			Fragments._SIElementWithTextualReference__SIElementWithTextualReference.initProperties(_SIElementWithTextualReference);
			Fragments._SIExecution__SIExecution.initProperties(_SIExecution);
			Fragments._SIExecutionContainer__SIExecutionContainer.initProperties(_SIExecutionContainer);
			Fragments._SILifeline__SILifeline.initProperties(_SILifeline);
			Fragments._SIMessage__SIMessage.initProperties(_SIMessage);
			Fragments._SIRegion__SIRegion.initProperties(_SIRegion);
			Fragments._SITimedElement__SITimedElement.initProperties(_SITimedElement);
			Fragments._StartDeterminesPointIntTime__StartDeterminesPointIntTime.initProperties(_StartDeterminesPointIntTime);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SequenceIntermediateTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of SequenceIntermediateTables::EnumerationLiterals and all preceding sub-packages.
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
