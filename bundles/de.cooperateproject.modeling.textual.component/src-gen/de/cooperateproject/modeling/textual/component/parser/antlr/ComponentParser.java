/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component.parser.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.component.parser.antlr.internal.InternalComponentParser;
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ComponentParser extends AbstractAntlrParser {

	@Inject
	private ComponentGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalComponentParser createParser(XtextTokenStream stream) {
		return new InternalComponentParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ComponentDiagram";
	}

	public ComponentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
