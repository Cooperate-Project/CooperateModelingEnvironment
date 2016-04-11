/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.textual.cls.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDef;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.ConnectorCardinalitiy;
import de.cooperateproject.modeling.textual.cls.cls.ConnectorLabel;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Methode;
import de.cooperateproject.modeling.textual.cls.cls.Name;
import de.cooperateproject.modeling.textual.cls.cls.Type;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
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
public class ClsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ClsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ClsPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case ClsPackage.ASSOCIATION_END:
				sequence_AssociationEnd(context, (AssociationEnd) semanticObject); 
				return; 
			case ClsPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ClsPackage.CLASS:
				sequence_Class(context, (de.cooperateproject.modeling.textual.cls.cls.Class) semanticObject); 
				return; 
			case ClsPackage.CLASS_DEF:
				sequence_ClassDef(context, (ClassDef) semanticObject); 
				return; 
			case ClsPackage.CLASS_DIAGRAM:
				sequence_ClassDiagram(context, (ClassDiagram) semanticObject); 
				return; 
			case ClsPackage.CONNECTOR_CARDINALITIY:
				sequence_ConnectorCardinalitiy(context, (ConnectorCardinalitiy) semanticObject); 
				return; 
			case ClsPackage.CONNECTOR_LABEL:
				sequence_ConnectorLabel(context, (ConnectorLabel) semanticObject); 
				return; 
			case ClsPackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case ClsPackage.IMPLEMENTATION:
				sequence_Implementation(context, (Implementation) semanticObject); 
				return; 
			case ClsPackage.METHODE:
				sequence_Methode(context, (Methode) semanticObject); 
				return; 
			case ClsPackage.NAME:
				sequence_Name(context, (Name) semanticObject); 
				return; 
			case ClsPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AssociationEnd returns AssociationEnd
	 *
	 * Constraint:
	 *     type=[ClassName|ID]
	 */
	protected void sequence_AssociationEnd(ISerializationContext context, AssociationEnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.ASSOCIATION_END__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.ASSOCIATION_END__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssociationEndAccess().getTypeClassNameIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Association
	 *     Connector returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (left=AssociationEnd ((right=AssociationEnd cardinality=ConnectorCardinalitiy? note=Note?) | note=Note))
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? final?='final'? name=ID type=Type)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ClassDef
	 *     ClassDef returns ClassDef
	 *
	 * Constraint:
	 *     (classes+=ClassName classes+=ClassName*)
	 */
	protected void sequence_ClassDef(ISerializationContext context, ClassDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDiagram returns ClassDiagram
	 *
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_ClassDiagram(ISerializationContext context, ClassDiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (abstract?='abstract'? type=[ClassName|ID] members+=Member*)
	 */
	protected void sequence_Class(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConnectorCardinalitiy returns ConnectorCardinalitiy
	 *
	 * Constraint:
	 *     (left=Cardinality? middle=Cardinality? right=ConnectorLabel?)
	 */
	protected void sequence_ConnectorCardinalitiy(ISerializationContext context, ConnectorCardinalitiy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConnectorLabel returns ConnectorLabel
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConnectorLabel(ISerializationContext context, ConnectorLabel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.CONNECTOR_LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.CONNECTOR_LABEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Generalization
	 *     Connector returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (left=AssociationEnd right=AssociationEnd)
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.CONNECTOR__LEFT));
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Implementation
	 *     Connector returns Implementation
	 *     Implementation returns Implementation
	 *
	 * Constraint:
	 *     (left=AssociationEnd right=AssociationEnd)
	 */
	protected void sequence_Implementation(ISerializationContext context, Implementation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.CONNECTOR__LEFT));
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplementationAccess().getLeftAssociationEndParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplementationAccess().getRightAssociationEndParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Methode
	 *     Methode returns Methode
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         final?='final'? 
	 *         name=ID 
	 *         (attributes+=Attribute attributes+=Attribute*)* 
	 *         type=Type?
	 *     )
	 */
	protected void sequence_Methode(ISerializationContext context, Methode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Name
	 *     ClassName returns Name
	 *     Name returns Name
	 *
	 * Constraint:
	 *     (name=ID | ((longname=STRING | longname=ID) name=ID))
	 */
	protected void sequence_Name(ISerializationContext context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     type=DataType
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClsPackage.Literals.TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClsPackage.Literals.TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeDataTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
