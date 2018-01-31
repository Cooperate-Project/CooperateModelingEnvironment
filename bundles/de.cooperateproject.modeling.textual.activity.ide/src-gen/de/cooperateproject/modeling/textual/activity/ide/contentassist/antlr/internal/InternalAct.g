/*
 * generated by Xtext 2.12.0
 */
grammar InternalAct;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;

}
@parser::members {
	private ActGrammarAccess grammarAccess;

	public void setGrammarAccess(ActGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleActivityDiagram
entryRuleActivityDiagram
:
{ before(grammarAccess.getActivityDiagramRule()); }
	 ruleActivityDiagram
{ after(grammarAccess.getActivityDiagramRule()); } 
	 EOF 
;

// Rule ActivityDiagram
ruleActivityDiagram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActivityDiagramAccess().getGroup()); }
		(rule__ActivityDiagram__Group__0)
		{ after(grammarAccess.getActivityDiagramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityDiagram__Group__0__Impl
	rule__ActivityDiagram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); }
	()
	{ after(grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityDiagram__Group__1__Impl
	rule__ActivityDiagram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); }
	'@start-actd'
	{ after(grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityDiagram__Group__2__Impl
	rule__ActivityDiagram__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); }
	(rule__ActivityDiagram__TitleAssignment_2)
	{ after(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActivityDiagram__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActivityDiagram__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_3()); }
	'@end-actd'
	{ after(grammarAccess.getActivityDiagramAccess().getEndActdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActivityDiagram__TitleAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
