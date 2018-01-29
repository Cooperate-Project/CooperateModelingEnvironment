/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.Component;
import de.cooperateproject.modeling.textual.component.cmp.ComponentDiagram;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.cmp.Generalization;
import de.cooperateproject.modeling.textual.component.cmp.Interface;
import de.cooperateproject.modeling.textual.component.cmp.Method;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.component.cmp.Provide;
import de.cooperateproject.modeling.textual.component.cmp.Require;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ComponentSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CmpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CmpPackage.ATTRIBUTE:
				if (rule == grammarAccess.getMemberRule()
						|| rule == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getComponentTypeAttributeRule()) {
					sequence_ComponentTypeAttribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CmpPackage.CLASS:
				sequence_Class(context, (de.cooperateproject.modeling.textual.component.cmp.Class) semanticObject); 
				return; 
			case CmpPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case CmpPackage.COMPONENT_DIAGRAM:
				sequence_ComponentDiagram(context, (ComponentDiagram) semanticObject); 
				return; 
			case CmpPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case CmpPackage.CONNECTOR_END:
				sequence_ConnectorEnd(context, (ConnectorEnd) semanticObject); 
				return; 
			case CmpPackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case CmpPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case CmpPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case CmpPackage.PARAMETER:
				sequence_Parameter(context, (de.cooperateproject.modeling.textual.component.cmp.Parameter) semanticObject); 
				return; 
			case CmpPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case CmpPackage.PROVIDE:
				sequence_Provide(context, (Provide) semanticObject); 
				return; 
			case CmpPackage.REQUIRE:
				sequence_Require(context, (Require) semanticObject); 
				return; 
			case CmpPackage.ROOT_PACKAGE:
				sequence_RootPackage(context, (RootPackage) semanticObject); 
				return; 
			}
		else if (epackage == TextualCommonsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualCommonsPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Member returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=[Classifier|FQN])
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     ((name=ID | (alias=ID name=STRING)) (comments+=Comment | (comments+=Comment? interfaceRelation+=InterfaceRelation*))?)
	 */
	protected void sequence_Class(ISerializationContext context, de.cooperateproject.modeling.textual.component.cmp.Class semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     body=STRING
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getBodySTRINGTerminalRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentDiagram returns ComponentDiagram
	 *
	 * Constraint:
	 *     (title=STRING rootpackage=RootPackage)
	 */
	protected void sequence_ComponentDiagram(ISerializationContext context, ComponentDiagram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, CmpPackage.Literals.COMPONENT_DIAGRAM__TITLE));
			if (transientValues.isValueTransient((EObject) semanticObject, CmpPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, CmpPackage.Literals.COMPONENT_DIAGRAM__ROOTPACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getComponentDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getComponentDiagramAccess().getRootpackageRootPackageParserRuleCall_3_0(), semanticObject.getRootpackage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentTypeAttribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=[Component|FQN])
	 */
	protected void sequence_ComponentTypeAttribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, CmpPackage.Literals.PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, CmpPackage.Literals.PROPERTY__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getComponentTypeAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentTypeAttributeAccess().getTypeComponentFQNParserRuleCall_2_0_1(), semanticObject.eGet(CmpPackage.Literals.PROPERTY__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         (name=ID | (alias=ID name=STRING)) 
	 *         (
	 *             comments+=Comment | 
	 *             (
	 *                 comments+=Comment? 
	 *                 interfaceRelation+=InterfaceRelation* 
	 *                 port+=Port* 
	 *                 attributes+=ComponentTypeAttribute* 
	 *                 connectors+=Connector* 
	 *                 packagedElements+=Classifier*
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConnectorEnd returns ConnectorEnd
	 *
	 * Constraint:
	 *     (part=[Attribute|ID]? role=[Port|ID])
	 */
	protected void sequence_ConnectorEnd(ISerializationContext context, ConnectorEnd semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     ((name=ID | (alias=ID name=STRING)) connectorEnds+=ConnectorEnd connectorEnds+=ConnectorEnd*)
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassifierRelation returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (leftClassifier=[Classifier|ID] rightClassifier=[Classifier|ID])
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER));
			if (transientValues.isValueTransient((EObject) semanticObject, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getLeftClassifierClassifierIDTerminalRuleCall_2_0_1(), semanticObject.eGet(CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER, false));
		feeder.accept(grammarAccess.getGeneralizationAccess().getRightClassifierClassifierIDTerminalRuleCall_4_0_1(), semanticObject.eGet(CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     ((name=ID | (alias=ID name=STRING)) (comments+=Comment | (comments+=Comment? members+=Member*))?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         name=ID 
	 *         (parameters+=Parameter parameters+=Parameter*)* 
	 *         type=[Classifier|FQN]?
	 *     )
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (visibility=Visibility? name=ID type=[Classifier|FQN])
	 */
	protected void sequence_Parameter(ISerializationContext context, de.cooperateproject.modeling.textual.component.cmp.Parameter semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Port returns Port
	 *
	 * Constraint:
	 *     (visibility=Visibility? name=ID (conjugated?='~' | conjugated?='conjugated')? realizedClassifier=[Classifier|ID])
	 */
	protected void sequence_Port(ISerializationContext context, Port semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceRelation returns Provide
	 *     Provide returns Provide
	 *
	 * Constraint:
	 *     ((name=ID | (alias=ID name=STRING)) interface=[Interface|FQN])
	 */
	protected void sequence_Provide(ISerializationContext context, Provide semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceRelation returns Require
	 *     Require returns Require
	 *
	 * Constraint:
	 *     ((name=ID | (alias=ID name=STRING)) interface=[Interface|FQN])
	 */
	protected void sequence_Require(ISerializationContext context, Require semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootPackage returns RootPackage
	 *
	 * Constraint:
	 *     (name=FQN? classifiers+=Classifier* relations+=ClassifierRelation*)
	 */
	protected void sequence_RootPackage(ISerializationContext context, RootPackage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
}
