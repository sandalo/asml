/*
* generated by Xtext
*/
package br.ufmg.dcc.asml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;

public class ASMLModelParser extends AbstractContentAssistParser {
	
	@Inject
	private ASMLModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected br.ufmg.dcc.asml.ui.contentassist.antlr.internal.InternalASMLModelParser createParser() {
		br.ufmg.dcc.asml.ui.contentassist.antlr.internal.InternalASMLModelParser result = new br.ufmg.dcc.asml.ui.contentassist.antlr.internal.InternalASMLModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractComponentAccess().getAlternatives(), "rule__AbstractComponent__Alternatives");
					put(grammarAccess.getAbstractNameConvetionAccess().getAlternatives(), "rule__AbstractNameConvetion__Alternatives");
					put(grammarAccess.getExpressionMatchingOperatorAccess().getAlternatives(), "rule__ExpressionMatchingOperator__Alternatives");
					put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
					put(grammarAccess.getExpressionMatchingClauseAccess().getAlternatives(), "rule__ExpressionMatchingClause__Alternatives");
					put(grammarAccess.getModuleMatchingParamenterAccess().getAlternatives(), "rule__ModuleMatchingParamenter__Alternatives");
					put(grammarAccess.getGroupClauseAccess().getAlternatives(), "rule__GroupClause__Alternatives");
					put(grammarAccess.getPermissionClauseAccess().getAlternatives(), "rule__PermissionClause__Alternatives");
					put(grammarAccess.getRelactionTypeAccess().getAlternatives(), "rule__RelactionType__Alternatives");
					put(grammarAccess.getASMLModelAccess().getGroup(), "rule__ASMLModel__Group__0");
					put(grammarAccess.getASMLModelAccess().getGroup_3(), "rule__ASMLModel__Group_3__0");
					put(grammarAccess.getASMLModelAccess().getGroup_5(), "rule__ASMLModel__Group_5__0");
					put(grammarAccess.getASMLModelAccess().getGroup_5_1(), "rule__ASMLModel__Group_5_1__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getViewAccess().getGroup_3(), "rule__View__Group_3__0");
					put(grammarAccess.getViewAccess().getGroup_3_0(), "rule__View__Group_3_0__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getClassMatchingAccess().getGroup(), "rule__ClassMatching__Group__0");
					put(grammarAccess.getMetaModuleAccess().getGroup(), "rule__MetaModule__Group__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_2(), "rule__MetaModule__Group_2__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_2_0(), "rule__MetaModule__Group_2_0__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_3(), "rule__MetaModule__Group_3__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_4(), "rule__MetaModule__Group_4__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_6(), "rule__MetaModule__Group_6__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getRestrictionAccess().getGroup(), "rule__Restriction__Group__0");
					put(grammarAccess.getRestrictionAccess().getGroup_4(), "rule__Restriction__Group_4__0");
					put(grammarAccess.getRestrictionAccess().getGroup_5(), "rule__Restriction__Group_5__0");
					put(grammarAccess.getASMLModelAccess().getNameAssignment_1(), "rule__ASMLModel__NameAssignment_1");
					put(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1(), "rule__ASMLModel__ImportURIAssignment_3_1");
					put(grammarAccess.getASMLModelAccess().getComponentsAssignment_4(), "rule__ASMLModel__ComponentsAssignment_4");
					put(grammarAccess.getASMLModelAccess().getIgnoreAssignment_5_1_0(), "rule__ASMLModel__IgnoreAssignment_5_1_0");
					put(grammarAccess.getViewAccess().getNameAssignment_1(), "rule__View__NameAssignment_1");
					put(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1(), "rule__View__AttributesAssignment_3_0_1");
					put(grammarAccess.getViewAccess().getComponentsAssignment_4(), "rule__View__ComponentsAssignment_4");
					put(grammarAccess.getViewAccess().getRestrictionsAssignment_5(), "rule__View__RestrictionsAssignment_5");
					put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
					put(grammarAccess.getExpressionMatchingOperatorAccess().getANDAssignment_0(), "rule__ExpressionMatchingOperator__ANDAssignment_0");
					put(grammarAccess.getExpressionMatchingOperatorAccess().getORAssignment_1(), "rule__ExpressionMatchingOperator__ORAssignment_1");
					put(grammarAccess.getModuleMatchingAccess().getParameterAssignment(), "rule__ModuleMatching__ParameterAssignment");
					put(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0(), "rule__ClassMatching__ExpressionMatchingAssignment_0");
					put(grammarAccess.getClassMatchingAccess().getParameterAssignment_1(), "rule__ClassMatching__ParameterAssignment_1");
					put(grammarAccess.getMetaModuleAccess().getNameAssignment_0(), "rule__MetaModule__NameAssignment_0");
					put(grammarAccess.getMetaModuleAccess().getAttributesAssignment_2_0_1(), "rule__MetaModule__AttributesAssignment_2_0_1");
					put(grammarAccess.getMetaModuleAccess().getMatchingAssignment_3_1(), "rule__MetaModule__MatchingAssignment_3_1");
					put(grammarAccess.getMetaModuleAccess().getDescriptionAssignment_4_1(), "rule__MetaModule__DescriptionAssignment_4_1");
					put(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5(), "rule__MetaModule__ComponentsAssignment_5");
					put(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6_2(), "rule__MetaModule__RestrictionsAssignment_6_2");
					put(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_0(), "rule__Restriction__GroupClauseAssignment_0");
					put(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_1(), "rule__Restriction__PermissionClauseAssignment_1");
					put(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_2(), "rule__Restriction__RelactionTypeAssignment_2");
					put(grammarAccess.getRestrictionAccess().getGroupClauseBAssignment_3(), "rule__Restriction__GroupClauseBAssignment_3");
					put(grammarAccess.getRestrictionAccess().getComponentBAssignment_4_0(), "rule__Restriction__ComponentBAssignment_4_0");
					put(grammarAccess.getRestrictionAccess().getMessageAssignment_5_1(), "rule__Restriction__MessageAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			br.ufmg.dcc.asml.ui.contentassist.antlr.internal.InternalASMLModelParser typedParser = (br.ufmg.dcc.asml.ui.contentassist.antlr.internal.InternalASMLModelParser) parser;
			typedParser.entryRuleASMLModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ASMLModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ASMLModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
