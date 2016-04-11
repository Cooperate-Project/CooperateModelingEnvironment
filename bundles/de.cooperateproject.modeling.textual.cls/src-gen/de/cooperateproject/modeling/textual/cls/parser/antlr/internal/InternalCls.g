/*
 * generated by Xtext 2.9.0
 */
grammar InternalCls;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.cooperateproject.modeling.textual.cls.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.cooperateproject.modeling.textual.cls.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;

}

@parser::members {

 	private ClsGrammarAccess grammarAccess;

    public InternalClsParser(TokenStream input, ClsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ClassDiagram";
   	}

   	@Override
   	protected ClsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleClassDiagram
entryRuleClassDiagram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDiagramRule()); }
	iv_ruleClassDiagram=ruleClassDiagram
	{ $current=$iv_ruleClassDiagram.current; }
	EOF;

// Rule ClassDiagram
ruleClassDiagram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClassDiagramAccess().getClassDiagramAction_0(),
					$current);
			}
		)
		otherlv_1='@startclass'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassDiagramAccess().getStartclassKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDiagramAccess().getElementsElementParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDiagramRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='@endclass'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassDiagramAccess().getEndclassKeyword_3());
		}
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getClassDefParserRuleCall_0());
		}
		this_ClassDef_0=ruleClassDef
		{
			$current = $this_ClassDef_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getClassParserRuleCall_1());
		}
		this_Class_1=ruleClass
		{
			$current = $this_Class_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getConnectorParserRuleCall_2());
		}
		this_Connector_2=ruleConnector
		{
			$current = $this_Connector_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeAccess().getTypeDataTypeEnumRuleCall_0_0());
				}
				lv_type_0_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getClassNameParserRuleCall_1());
		}
		this_ClassName_1=ruleClassName
		{
			$current = $this_ClassName_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClassDef
entryRuleClassDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDefRule()); }
	iv_ruleClassDef=ruleClassDef
	{ $current=$iv_ruleClassDef.current; }
	EOF;

// Rule ClassDef
ruleClassDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='class'
			{
				newLeafNode(otherlv_0, grammarAccess.getClassDefAccess().getClassKeyword_0_0());
			}
			    |
			otherlv_1='interface'
			{
				newLeafNode(otherlv_1, grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1());
			}
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassDefAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_2_0());
				}
				lv_classes_3_0=ruleClassName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDefRule());
					}
					add(
						$current,
						"classes",
						lv_classes_3_0,
						"de.cooperateproject.modeling.textual.cls.Cls.ClassName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getClassDefAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassDefAccess().getClassesClassNameParserRuleCall_3_1_0());
					}
					lv_classes_5_0=ruleClassName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassDefRule());
						}
						add(
							$current,
							"classes",
							lv_classes_5_0,
							"de.cooperateproject.modeling.textual.cls.Cls.ClassName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getClassDefAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleClassName
entryRuleClassName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassNameRule()); }
	iv_ruleClassName=ruleClassName
	{ $current=$iv_ruleClassName.current; }
	EOF;

// Rule ClassName
ruleClassName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getClassNameAccess().getNameParserRuleCall());
	}
	this_Name_0=ruleName
	{
		$current = $this_Name_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleName
entryRuleName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current; }
	EOF;

// Rule Name
ruleName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				(
					(
						lv_longname_1_1=RULE_STRING
						{
							newLeafNode(lv_longname_1_1, grammarAccess.getNameAccess().getLongnameSTRINGTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNameRule());
							}
							setWithLastConsumed(
								$current,
								"longname",
								lv_longname_1_1,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
						    |
						lv_longname_1_2=RULE_ID
						{
							newLeafNode(lv_longname_1_2, grammarAccess.getNameAccess().getLongnameIDTerminalRuleCall_1_0_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNameRule());
							}
							setWithLastConsumed(
								$current,
								"longname",
								lv_longname_1_2,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			otherlv_2=' as '
			{
				newLeafNode(otherlv_2, grammarAccess.getNameAccess().getAsKeyword_1_1());
			}
			(
				(
					lv_name_3_0=RULE_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNameRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_abstract_0_0='abstract'
				{
					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getClassAccess().getTypeClassNameCrossReference_1_0());
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_3_0());
				}
				lv_members_3_0=ruleMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					add(
						$current,
						"members",
						lv_members_3_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Member");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMemberAccess().getAttributeParserRuleCall_0());
		}
		this_Attribute_0=ruleAttribute
		{
			$current = $this_Attribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMemberAccess().getMethodeParserRuleCall_1());
		}
		this_Methode_1=ruleMethode
		{
			$current = $this_Methode_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_static_1_0='static'
				{
					newLeafNode(lv_static_1_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "static", true, "static");
				}
			)
		)?
		(
			(
				lv_final_2_0='final'
				{
					newLeafNode(lv_final_2_0, grammarAccess.getAttributeAccess().getFinalFinalKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "final", true, "final");
				}
			)
		)?
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_5_0());
				}
				lv_type_5_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_5_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMethode
entryRuleMethode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodeRule()); }
	iv_ruleMethode=ruleMethode
	{ $current=$iv_ruleMethode.current; }
	EOF;

// Rule Methode
ruleMethode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodeRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_abstract_1_0='abstract'
				{
					newLeafNode(lv_abstract_1_0, grammarAccess.getMethodeAccess().getAbstractAbstractKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodeRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)?
		(
			(
				lv_static_2_0='static'
				{
					newLeafNode(lv_static_2_0, grammarAccess.getMethodeAccess().getStaticStaticKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodeRule());
					}
					setWithLastConsumed($current, "static", true, "static");
				}
			)
		)?
		(
			(
				lv_final_3_0='final'
				{
					newLeafNode(lv_final_3_0, grammarAccess.getMethodeAccess().getFinalFinalKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodeRule());
					}
					setWithLastConsumed($current, "final", true, "final");
				}
			)
		)?
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='('
		{
			newLeafNode(otherlv_5, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_0_0());
					}
					lv_attributes_6_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodeRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_6_0,
							"de.cooperateproject.modeling.textual.cls.Cls.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getCommaKeyword_6_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodeAccess().getAttributesAttributeParserRuleCall_6_1_1_0());
						}
						lv_attributes_8_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodeRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_8_0,
								"de.cooperateproject.modeling.textual.cls.Cls.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)*
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7());
		}
		(
			otherlv_10=':'
			{
				newLeafNode(otherlv_10, grammarAccess.getMethodeAccess().getColonKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_8_1_0());
					}
					lv_type_11_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodeRule());
						}
						set(
							$current,
							"type",
							lv_type_11_0,
							"de.cooperateproject.modeling.textual.cls.Cls.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleConnector
entryRuleConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorRule()); }
	iv_ruleConnector=ruleConnector
	{ $current=$iv_ruleConnector.current; }
	EOF;

// Rule Connector
ruleConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConnectorAccess().getGeneralizationParserRuleCall_0());
		}
		this_Generalization_0=ruleGeneralization
		{
			$current = $this_Generalization_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConnectorAccess().getAssociationParserRuleCall_1());
		}
		this_Association_1=ruleAssociation
		{
			$current = $this_Association_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConnectorAccess().getImplementationParserRuleCall_2());
		}
		this_Implementation_2=ruleImplementation
		{
			$current = $this_Implementation_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGeneralization
entryRuleGeneralization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationRule()); }
	iv_ruleGeneralization=ruleGeneralization
	{ $current=$iv_ruleGeneralization.current; }
	EOF;

// Rule Generalization
ruleGeneralization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getLeftAssociationEndParserRuleCall_0_0());
				}
				lv_left_0_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneralizationRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='isa'
		{
			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsaKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getRightAssociationEndParserRuleCall_2_0());
				}
				lv_right_2_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneralizationRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImplementation
entryRuleImplementation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImplementationRule()); }
	iv_ruleImplementation=ruleImplementation
	{ $current=$iv_ruleImplementation.current; }
	EOF;

// Rule Implementation
ruleImplementation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationAccess().getLeftAssociationEndParserRuleCall_0_0());
				}
				lv_left_0_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='impl'
		{
			newLeafNode(otherlv_1, grammarAccess.getImplementationAccess().getImplKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImplementationAccess().getRightAssociationEndParserRuleCall_2_0());
				}
				lv_right_2_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImplementationRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getLeftAssociationEndParserRuleCall_0_0());
				}
				lv_left_0_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getAssociationAccess().getRightAssociationEndParserRuleCall_2_0_0_0());
						}
						lv_right_2_0=ruleAssociationEnd
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAssociationRule());
							}
							set(
								$current,
								"right",
								lv_right_2_0,
								"de.cooperateproject.modeling.textual.cls.Cls.AssociationEnd");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAssociationAccess().getCardinalityConnectorCardinalitiyParserRuleCall_2_0_1_0());
						}
						lv_cardinality_3_0=ruleConnectorCardinalitiy
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAssociationRule());
							}
							set(
								$current,
								"cardinality",
								lv_cardinality_3_0,
								"de.cooperateproject.modeling.textual.cls.Cls.ConnectorCardinalitiy");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_0_2_0());
						}
						lv_note_4_0=ruleNote
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAssociationRule());
							}
							set(
								$current,
								"note",
								lv_note_4_0,
								"de.cooperateproject.modeling.textual.cls.Cls.Note");
							afterParserOrEnumRuleCall();
						}
					)
				)?
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAssociationAccess().getNoteNoteParserRuleCall_2_1_0());
					}
					lv_note_5_0=ruleNote
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssociationRule());
						}
						set(
							$current,
							"note",
							lv_note_5_0,
							"de.cooperateproject.modeling.textual.cls.Cls.Note");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleAssociationEnd
entryRuleAssociationEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationEndRule()); }
	iv_ruleAssociationEnd=ruleAssociationEnd
	{ $current=$iv_ruleAssociationEnd.current; }
	EOF;

// Rule AssociationEnd
ruleAssociationEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAssociationEndRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getAssociationEndAccess().getTypeClassNameCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleConnectorLabel
entryRuleConnectorLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorLabelRule()); }
	iv_ruleConnectorLabel=ruleConnectorLabel
	{ $current=$iv_ruleConnectorLabel.current; }
	EOF;

// Rule ConnectorLabel
ruleConnectorLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getConnectorLabelAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConnectorLabelRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleConnectorCardinalitiy
entryRuleConnectorCardinalitiy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorCardinalitiyRule()); }
	iv_ruleConnectorCardinalitiy=ruleConnectorCardinalitiy
	{ $current=$iv_ruleConnectorCardinalitiy.current; }
	EOF;

// Rule ConnectorCardinalitiy
ruleConnectorCardinalitiy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConnectorCardinalitiyAccess().getConnectorCardinalitiyAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectorCardinalitiyAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getLeftCardinalityParserRuleCall_2_0());
				}
				lv_left_2_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
					}
					set(
						$current,
						"left",
						lv_left_2_0,
						"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='|'
			{
				newLeafNode(otherlv_3, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getMiddleCardinalityParserRuleCall_3_1_0());
					}
					lv_middle_4_0=ruleCardinality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
						}
						set(
							$current,
							"middle",
							lv_middle_4_0,
							"de.cooperateproject.modeling.textual.cls.Cls.Cardinality");
						afterParserOrEnumRuleCall();
					}
				)
			)?
		)
		(
			otherlv_5='|'
			{
				newLeafNode(otherlv_5, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConnectorCardinalitiyAccess().getRightConnectorLabelParserRuleCall_4_1_0());
					}
					lv_right_6_0=ruleConnectorLabel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConnectorCardinalitiyRule());
						}
						set(
							$current,
							"right",
							lv_right_6_0,
							"de.cooperateproject.modeling.textual.cls.Cls.ConnectorLabel");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_7='<'
				{
					newLeafNode(otherlv_7, grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0());
				}
				    |
				otherlv_8='>'
				{
					newLeafNode(otherlv_8, grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1());
				}
			)?
		)?
		otherlv_9=']'
		{
			newLeafNode(otherlv_9, grammarAccess.getConnectorCardinalitiyAccess().getRightSquareBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current.getText(); }
	EOF;

// Rule Cardinality
ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_0());
		}
		    |
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_0());
			}
			kw='..'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_1());
			}
			(
				kw='*'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_2_0());
				}
				    |
				this_INT_4=RULE_INT
				{
					$current.merge(this_INT_4);
				}
				{
					newLeafNode(this_INT_4, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_1_2_1());
				}
			)
		)
	)
;

// Entry rule entryRuleNote
entryRuleNote returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNoteRule()); }
	iv_ruleNote=ruleNote
	{ $current=$iv_ruleNote.current.getText(); }
	EOF;

// Rule Note
ruleNote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='note['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNoteAccess().getNoteKeyword_0());
		}
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getNoteAccess().getSTRINGTerminalRuleCall_1());
		}
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getNoteAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='~'
			{
				$current = grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getDEFAULTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='-'
			{
				$current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='#'
			{
				$current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='+'
			{
				$current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule DataType
ruleDataType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='string'
			{
				$current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='int'
			{
				$current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='double'
			{
				$current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='boolean'
			{
				$current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='char'
			{
				$current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='byte'
			{
				$current = grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='short'
			{
				$current = grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='long'
			{
				$current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='float'
			{
				$current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
