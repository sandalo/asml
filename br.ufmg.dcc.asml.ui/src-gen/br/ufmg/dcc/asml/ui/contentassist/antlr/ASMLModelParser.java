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
					put(grammarAccess.getConfigurationElementAccess().getAlternatives(), "rule__ConfigurationElement__Alternatives");
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
					put(grammarAccess.getAbstractComponentAccess().getGroup_7(), "rule__AbstractComponent__Group_7__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getClassMatchingAccess().getGroup(), "rule__ClassMatching__Group__0");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getFileAccess().getGroup_3(), "rule__File__Group_3__0");
					put(grammarAccess.getFileAccess().getGroup_4(), "rule__File__Group_4__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup_3(), "rule__Configuration__Group_3__0");
					put(grammarAccess.getConfigurationAccess().getGroup_4(), "rule__Configuration__Group_4__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_4(), "rule__Method__Group_4__0");
					put(grammarAccess.getMetaClassAccess().getGroup(), "rule__MetaClass__Group__0");
					put(grammarAccess.getMetaClassAccess().getGroup_2(), "rule__MetaClass__Group_2__0");
					put(grammarAccess.getMetaClassAccess().getGroup_4(), "rule__MetaClass__Group_4__0");
					put(grammarAccess.getMetaClassAccess().getGroup_5(), "rule__MetaClass__Group_5__0");
					put(grammarAccess.getMetaClassAccess().getGroup_6(), "rule__MetaClass__Group_6__0");
					put(grammarAccess.getExternalClassAccess().getGroup(), "rule__ExternalClass__Group__0");
					put(grammarAccess.getExternalClassAccess().getGroup_3(), "rule__ExternalClass__Group_3__0");
					put(grammarAccess.getExternalClassAccess().getGroup_4(), "rule__ExternalClass__Group_4__0");
					put(grammarAccess.getXmlElementAccess().getGroup(), "rule__XmlElement__Group__0");
					put(grammarAccess.getXmlElementAccess().getGroup_3(), "rule__XmlElement__Group_3__0");
					put(grammarAccess.getXmlElementAccess().getGroup_4(), "rule__XmlElement__Group_4__0");
					put(grammarAccess.getXmlDocumentAccess().getGroup(), "rule__XmlDocument__Group__0");
					put(grammarAccess.getXmlDocumentAccess().getGroup_3(), "rule__XmlDocument__Group_3__0");
					put(grammarAccess.getXmlDocumentAccess().getGroup_4(), "rule__XmlDocument__Group_4__0");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getModuleAccess().getGroup_3(), "rule__Module__Group_3__0");
					put(grammarAccess.getModuleAccess().getGroup_3_0(), "rule__Module__Group_3_0__0");
					put(grammarAccess.getModuleAccess().getGroup_4(), "rule__Module__Group_4__0");
					put(grammarAccess.getMetaModuleAccess().getGroup(), "rule__MetaModule__Group__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_3(), "rule__MetaModule__Group_3__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_3_0(), "rule__MetaModule__Group_3_0__0");
					put(grammarAccess.getMetaModuleAccess().getGroup_4(), "rule__MetaModule__Group_4__0");
					put(grammarAccess.getExternalModuleAccess().getGroup(), "rule__ExternalModule__Group__0");
					put(grammarAccess.getExternalModuleAccess().getGroup_3(), "rule__ExternalModule__Group_3__0");
					put(grammarAccess.getExternalModuleAccess().getGroup_3_0(), "rule__ExternalModule__Group_3_0__0");
					put(grammarAccess.getExternalModuleAccess().getGroup_4(), "rule__ExternalModule__Group_4__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getRestrictionAccess().getGroup(), "rule__Restriction__Group__0");
					put(grammarAccess.getRestrictionAccess().getGroup_7(), "rule__Restriction__Group_7__0");
					put(grammarAccess.getASMLModelAccess().getNameAssignment_1(), "rule__ASMLModel__NameAssignment_1");
					put(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1(), "rule__ASMLModel__ImportURIAssignment_3_1");
					put(grammarAccess.getASMLModelAccess().getViewsAssignment_4(), "rule__ASMLModel__ViewsAssignment_4");
					put(grammarAccess.getASMLModelAccess().getIgnoreAssignment_5_1_0(), "rule__ASMLModel__IgnoreAssignment_5_1_0");
					put(grammarAccess.getViewAccess().getNameAssignment_1(), "rule__View__NameAssignment_1");
					put(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1(), "rule__View__AttributesAssignment_3_0_1");
					put(grammarAccess.getViewAccess().getComponentsAssignment_4(), "rule__View__ComponentsAssignment_4");
					put(grammarAccess.getViewAccess().getRestrictionsAssignment_5(), "rule__View__RestrictionsAssignment_5");
					put(grammarAccess.getAbstractComponentAccess().getRestrictionsAssignment_7_1(), "rule__AbstractComponent__RestrictionsAssignment_7_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
					put(grammarAccess.getExpressionMatchingOperatorAccess().getANDAssignment_0(), "rule__ExpressionMatchingOperator__ANDAssignment_0");
					put(grammarAccess.getExpressionMatchingOperatorAccess().getORAssignment_1(), "rule__ExpressionMatchingOperator__ORAssignment_1");
					put(grammarAccess.getModuleMatchingAccess().getParameterAssignment(), "rule__ModuleMatching__ParameterAssignment");
					put(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0(), "rule__ClassMatching__ExpressionMatchingAssignment_0");
					put(grammarAccess.getClassMatchingAccess().getParameterAssignment_1(), "rule__ClassMatching__ParameterAssignment_1");
					put(grammarAccess.getFileAccess().getNameAssignment_1(), "rule__File__NameAssignment_1");
					put(grammarAccess.getFileAccess().getMatchingAssignment_3_1(), "rule__File__MatchingAssignment_3_1");
					put(grammarAccess.getFileAccess().getCardinalityAssignment_4_1(), "rule__File__CardinalityAssignment_4_1");
					put(grammarAccess.getConfigurationAccess().getNameAssignment_1(), "rule__Configuration__NameAssignment_1");
					put(grammarAccess.getConfigurationAccess().getMatchingAssignment_3_1(), "rule__Configuration__MatchingAssignment_3_1");
					put(grammarAccess.getConfigurationAccess().getCardinalityAssignment_4_1(), "rule__Configuration__CardinalityAssignment_4_1");
					put(grammarAccess.getConfigurationAccess().getConfigurationElementAssignment_5(), "rule__Configuration__ConfigurationElementAssignment_5");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getMatchingAssignment_3_1(), "rule__Method__MatchingAssignment_3_1");
					put(grammarAccess.getMethodAccess().getCardinalityAssignment_4_1(), "rule__Method__CardinalityAssignment_4_1");
					put(grammarAccess.getMetaClassAccess().getNameAssignment_1(), "rule__MetaClass__NameAssignment_1");
					put(grammarAccess.getMetaClassAccess().getExtendsAssignment_2_1(), "rule__MetaClass__ExtendsAssignment_2_1");
					put(grammarAccess.getMetaClassAccess().getDescriptionAssignment_4_1(), "rule__MetaClass__DescriptionAssignment_4_1");
					put(grammarAccess.getMetaClassAccess().getMatchingAssignment_5_1(), "rule__MetaClass__MatchingAssignment_5_1");
					put(grammarAccess.getMetaClassAccess().getCardinalityAssignment_6_1(), "rule__MetaClass__CardinalityAssignment_6_1");
					put(grammarAccess.getMetaClassAccess().getMethodsAssignment_7(), "rule__MetaClass__MethodsAssignment_7");
					put(grammarAccess.getExternalClassAccess().getNameAssignment_1(), "rule__ExternalClass__NameAssignment_1");
					put(grammarAccess.getExternalClassAccess().getDescriptionAssignment_3_1(), "rule__ExternalClass__DescriptionAssignment_3_1");
					put(grammarAccess.getExternalClassAccess().getTypeAssignment_4_1(), "rule__ExternalClass__TypeAssignment_4_1");
					put(grammarAccess.getXmlElementAccess().getNameAssignment_1(), "rule__XmlElement__NameAssignment_1");
					put(grammarAccess.getXmlElementAccess().getMatchingAssignment_3_1(), "rule__XmlElement__MatchingAssignment_3_1");
					put(grammarAccess.getXmlElementAccess().getCardinalityAssignment_4_1(), "rule__XmlElement__CardinalityAssignment_4_1");
					put(grammarAccess.getXmlDocumentAccess().getNameAssignment_1(), "rule__XmlDocument__NameAssignment_1");
					put(grammarAccess.getXmlDocumentAccess().getMatchingAssignment_3_1(), "rule__XmlDocument__MatchingAssignment_3_1");
					put(grammarAccess.getXmlDocumentAccess().getCardinalityAssignment_4_1(), "rule__XmlDocument__CardinalityAssignment_4_1");
					put(grammarAccess.getModuleAccess().getNameAssignment_1(), "rule__Module__NameAssignment_1");
					put(grammarAccess.getModuleAccess().getAttributesAssignment_3_0_1(), "rule__Module__AttributesAssignment_3_0_1");
					put(grammarAccess.getModuleAccess().getMatchingAssignment_4_1(), "rule__Module__MatchingAssignment_4_1");
					put(grammarAccess.getModuleAccess().getComponentsAssignment_5(), "rule__Module__ComponentsAssignment_5");
					put(grammarAccess.getModuleAccess().getRestrictionsAssignment_6(), "rule__Module__RestrictionsAssignment_6");
					put(grammarAccess.getMetaModuleAccess().getNameAssignment_1(), "rule__MetaModule__NameAssignment_1");
					put(grammarAccess.getMetaModuleAccess().getAttributesAssignment_3_0_1(), "rule__MetaModule__AttributesAssignment_3_0_1");
					put(grammarAccess.getMetaModuleAccess().getMatchingAssignment_4_1(), "rule__MetaModule__MatchingAssignment_4_1");
					put(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5(), "rule__MetaModule__ComponentsAssignment_5");
					put(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6(), "rule__MetaModule__RestrictionsAssignment_6");
					put(grammarAccess.getExternalModuleAccess().getNameAssignment_1(), "rule__ExternalModule__NameAssignment_1");
					put(grammarAccess.getExternalModuleAccess().getAttributesAssignment_3_0_1(), "rule__ExternalModule__AttributesAssignment_3_0_1");
					put(grammarAccess.getExternalModuleAccess().getMatchingAssignment_4_1(), "rule__ExternalModule__MatchingAssignment_4_1");
					put(grammarAccess.getExternalModuleAccess().getComponentsAssignment_5(), "rule__ExternalModule__ComponentsAssignment_5");
					put(grammarAccess.getExternalModuleAccess().getRestrictionsAssignment_6(), "rule__ExternalModule__RestrictionsAssignment_6");
					put(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_2(), "rule__Restriction__GroupClauseAssignment_2");
					put(grammarAccess.getRestrictionAccess().getComponentAAssignment_3(), "rule__Restriction__ComponentAAssignment_3");
					put(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_4(), "rule__Restriction__PermissionClauseAssignment_4");
					put(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_5(), "rule__Restriction__RelactionTypeAssignment_5");
					put(grammarAccess.getRestrictionAccess().getComponentBAssignment_6(), "rule__Restriction__ComponentBAssignment_6");
					put(grammarAccess.getRestrictionAccess().getDescriptionAssignment_7_1(), "rule__Restriction__DescriptionAssignment_7_1");
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
