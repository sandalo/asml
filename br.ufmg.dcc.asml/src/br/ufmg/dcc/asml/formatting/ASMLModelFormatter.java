package br.ufmg.dcc.asml.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;

public class ASMLModelFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ASMLModelGrammarAccess f = (ASMLModelGrammarAccess) getGrammarAccess();
 
		c.setAutoLinewrap(300);

		// find common keywords an specify formatting for them
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setSpace("").before(pair.getFirst()); //$NON-NLS-1$
			// indentation between
			c.setLinewrap().after(pair.getFirst());
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap().before(pair.getSecond());
			c.setLinewrap().after(pair.getSecond());
		}
		
		for (Keyword key : f.findKeywords(";")) {
			c.setLinewrap().after(key);
		}

	}
}
