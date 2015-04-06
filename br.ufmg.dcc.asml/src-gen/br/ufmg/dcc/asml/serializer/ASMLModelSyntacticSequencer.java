package br.ufmg.dcc.asml.serializer;

import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ASMLModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ASMLModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ASMLModel_CommaKeyword_5_1_1_q;
	protected AbstractElementAlias match_ASMLModel___IgnoreKeyword_5_0_SemicolonKeyword_5_2__q;
	protected AbstractElementAlias match_ExternalModule_CommaKeyword_3_0_2_q;
	protected AbstractElementAlias match_ExternalModule_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_ExternalModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_MetaModule_CommaKeyword_3_0_2_q;
	protected AbstractElementAlias match_MetaModule_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_MetaModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_Module_CommaKeyword_3_0_2_q;
	protected AbstractElementAlias match_Module_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_Module___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_View_CommaKeyword_3_0_2_q;
	protected AbstractElementAlias match_View_SemicolonKeyword_3_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ASMLModelGrammarAccess) access;
		match_ASMLModel_CommaKeyword_5_1_1_q = new TokenAlias(false, true, grammarAccess.getASMLModelAccess().getCommaKeyword_5_1_1());
		match_ASMLModel___IgnoreKeyword_5_0_SemicolonKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getASMLModelAccess().getIgnoreKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getASMLModelAccess().getSemicolonKeyword_5_2()));
		match_ExternalModule_CommaKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getExternalModuleAccess().getCommaKeyword_3_0_2());
		match_ExternalModule_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getExternalModuleAccess().getSemicolonKeyword_3_1());
		match_ExternalModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExternalModuleAccess().getRestrictionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getExternalModuleAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getExternalModuleAccess().getRightCurlyBracketKeyword_6_3()));
		match_MetaModule_CommaKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2());
		match_MetaModule_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1());
		match_MetaModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMetaModuleAccess().getRestrictionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_6_3()));
		match_Module_CommaKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getModuleAccess().getCommaKeyword_3_0_2());
		match_Module_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getModuleAccess().getSemicolonKeyword_3_1());
		match_Module___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getModuleAccess().getRestrictionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6_3()));
		match_View_CommaKeyword_3_0_2_q = new TokenAlias(false, true, grammarAccess.getViewAccess().getCommaKeyword_3_0_2());
		match_View_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getViewAccess().getSemicolonKeyword_3_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ASMLModel_CommaKeyword_5_1_1_q.equals(syntax))
				emit_ASMLModel_CommaKeyword_5_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ASMLModel___IgnoreKeyword_5_0_SemicolonKeyword_5_2__q.equals(syntax))
				emit_ASMLModel___IgnoreKeyword_5_0_SemicolonKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternalModule_CommaKeyword_3_0_2_q.equals(syntax))
				emit_ExternalModule_CommaKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternalModule_SemicolonKeyword_3_1_q.equals(syntax))
				emit_ExternalModule_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExternalModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_ExternalModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetaModule_CommaKeyword_3_0_2_q.equals(syntax))
				emit_MetaModule_CommaKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetaModule_SemicolonKeyword_3_1_q.equals(syntax))
				emit_MetaModule_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetaModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_MetaModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Module_CommaKeyword_3_0_2_q.equals(syntax))
				emit_Module_CommaKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Module_SemicolonKeyword_3_1_q.equals(syntax))
				emit_Module_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Module___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Module___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_View_CommaKeyword_3_0_2_q.equals(syntax))
				emit_View_CommaKeyword_3_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_View_SemicolonKeyword_3_1_q.equals(syntax))
				emit_View_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ASMLModel_CommaKeyword_5_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ignore' ';')?
	 */
	protected void emit_ASMLModel___IgnoreKeyword_5_0_SemicolonKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ExternalModule_CommaKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ExternalModule_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('restrictions' '{' '}')?
	 */
	protected void emit_ExternalModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_MetaModule_CommaKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_MetaModule_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('restrictions' '{' '}')?
	 */
	protected void emit_MetaModule___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Module_CommaKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Module_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('restrictions' '{' '}')?
	 */
	protected void emit_Module___RestrictionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_View_CommaKeyword_3_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_View_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
