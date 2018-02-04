/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.cls.parser.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsParser;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ClsParser extends AbstractAntlrParser {

	@Inject
	private ClsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalClsParser createParser(XtextTokenStream stream) {
		return new InternalClsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ClassDiagram";
	}

	public ClsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
