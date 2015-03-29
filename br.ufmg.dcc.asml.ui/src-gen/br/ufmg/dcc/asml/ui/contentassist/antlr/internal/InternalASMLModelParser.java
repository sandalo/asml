package br.ufmg.dcc.asml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASMLModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID_ASML", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'0'", "'1..*'", "'0..*'", "'name start with'", "'name ends with'", "'annotated with'", "'by package name'", "'by folder name'", "'by package and folder name'", "'by external implementation'", "'null'", "'only'", "'any'", "'no one'", "'must'", "'can'", "'cannot'", "'access'", "'declare'", "'handle'", "'extend'", "'implement'", "'create'", "'throw'", "'use annotation'", "'depend'", "'requires'", "'architecture'", "'{'", "'}'", "'import'", "';'", "'ignore'", "','", "'view'", "'attributes'", "':'", "'file'", "'matching'", "'cardinality'", "'configuration'", "'method'", "'meta-class'", "'extends'", "'description'", "'matching:'", "'external-class'", "'type'", "'xmlElement'", "'xmlDocument'", "'module'", "'meta-module'", "'external-module'", "'.'", "'restriction'"
    };
    public static final int RULE_ID_ASML=5;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalASMLModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalASMLModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalASMLModelParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g"; }


     
     	private ASMLModelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ASMLModelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleASMLModel"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:60:1: entryRuleASMLModel : ruleASMLModel EOF ;
    public final void entryRuleASMLModel() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:61:1: ( ruleASMLModel EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:62:1: ruleASMLModel EOF
            {
             before(grammarAccess.getASMLModelRule()); 
            pushFollow(FOLLOW_ruleASMLModel_in_entryRuleASMLModel61);
            ruleASMLModel();

            state._fsp--;

             after(grammarAccess.getASMLModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASMLModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleASMLModel"


    // $ANTLR start "ruleASMLModel"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:69:1: ruleASMLModel : ( ( rule__ASMLModel__Group__0 ) ) ;
    public final void ruleASMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:73:2: ( ( ( rule__ASMLModel__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:74:1: ( ( rule__ASMLModel__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:74:1: ( ( rule__ASMLModel__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:75:1: ( rule__ASMLModel__Group__0 )
            {
             before(grammarAccess.getASMLModelAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:76:1: ( rule__ASMLModel__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:76:2: rule__ASMLModel__Group__0
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__0_in_ruleASMLModel94);
            rule__ASMLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getASMLModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASMLModel"


    // $ANTLR start "entryRuleView"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:88:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:89:1: ( ruleView EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:90:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView121);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:97:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:101:2: ( ( ( rule__View__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:102:1: ( ( rule__View__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:102:1: ( ( rule__View__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:103:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:104:1: ( rule__View__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:104:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView154);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleAbstractComponent"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:116:1: entryRuleAbstractComponent : ruleAbstractComponent EOF ;
    public final void entryRuleAbstractComponent() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:117:1: ( ruleAbstractComponent EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:118:1: ruleAbstractComponent EOF
            {
             before(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent181);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getAbstractComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractComponent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:125:1: ruleAbstractComponent : ( ( rule__AbstractComponent__Alternatives ) ) ;
    public final void ruleAbstractComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:129:2: ( ( ( rule__AbstractComponent__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:130:1: ( ( rule__AbstractComponent__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:130:1: ( ( rule__AbstractComponent__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:131:1: ( rule__AbstractComponent__Alternatives )
            {
             before(grammarAccess.getAbstractComponentAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:132:1: ( rule__AbstractComponent__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:132:2: rule__AbstractComponent__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractComponent__Alternatives_in_ruleAbstractComponent214);
            rule__AbstractComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleAttribute"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:144:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:145:1: ( ruleAttribute EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:146:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute241);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:153:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:157:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:158:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:158:1: ( ( rule__Attribute__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:159:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:160:1: ( rule__Attribute__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:160:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute274);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAbstractNameConvetion"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:172:1: entryRuleAbstractNameConvetion : ruleAbstractNameConvetion EOF ;
    public final void entryRuleAbstractNameConvetion() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:173:1: ( ruleAbstractNameConvetion EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:174:1: ruleAbstractNameConvetion EOF
            {
             before(grammarAccess.getAbstractNameConvetionRule()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion301);
            ruleAbstractNameConvetion();

            state._fsp--;

             after(grammarAccess.getAbstractNameConvetionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNameConvetion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractNameConvetion"


    // $ANTLR start "ruleAbstractNameConvetion"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:181:1: ruleAbstractNameConvetion : ( ( rule__AbstractNameConvetion__Alternatives ) ) ;
    public final void ruleAbstractNameConvetion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:185:2: ( ( ( rule__AbstractNameConvetion__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:186:1: ( ( rule__AbstractNameConvetion__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:186:1: ( ( rule__AbstractNameConvetion__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:187:1: ( rule__AbstractNameConvetion__Alternatives )
            {
             before(grammarAccess.getAbstractNameConvetionAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:188:1: ( rule__AbstractNameConvetion__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:188:2: rule__AbstractNameConvetion__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractNameConvetion__Alternatives_in_ruleAbstractNameConvetion334);
            rule__AbstractNameConvetion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNameConvetionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNameConvetion"


    // $ANTLR start "entryRuleModuleMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:202:1: entryRuleModuleMatching : ruleModuleMatching EOF ;
    public final void entryRuleModuleMatching() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:203:1: ( ruleModuleMatching EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:204:1: ruleModuleMatching EOF
            {
             before(grammarAccess.getModuleMatchingRule()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching363);
            ruleModuleMatching();

            state._fsp--;

             after(grammarAccess.getModuleMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleMatching370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModuleMatching"


    // $ANTLR start "ruleModuleMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:211:1: ruleModuleMatching : ( ( rule__ModuleMatching__ParameterAssignment ) ) ;
    public final void ruleModuleMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:215:2: ( ( ( rule__ModuleMatching__ParameterAssignment ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:216:1: ( ( rule__ModuleMatching__ParameterAssignment ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:216:1: ( ( rule__ModuleMatching__ParameterAssignment ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:217:1: ( rule__ModuleMatching__ParameterAssignment )
            {
             before(grammarAccess.getModuleMatchingAccess().getParameterAssignment()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:218:1: ( rule__ModuleMatching__ParameterAssignment )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:218:2: rule__ModuleMatching__ParameterAssignment
            {
            pushFollow(FOLLOW_rule__ModuleMatching__ParameterAssignment_in_ruleModuleMatching396);
            rule__ModuleMatching__ParameterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModuleMatchingAccess().getParameterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleMatching"


    // $ANTLR start "entryRuleClassMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:230:1: entryRuleClassMatching : ruleClassMatching EOF ;
    public final void entryRuleClassMatching() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:231:1: ( ruleClassMatching EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:232:1: ruleClassMatching EOF
            {
             before(grammarAccess.getClassMatchingRule()); 
            pushFollow(FOLLOW_ruleClassMatching_in_entryRuleClassMatching423);
            ruleClassMatching();

            state._fsp--;

             after(grammarAccess.getClassMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMatching430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassMatching"


    // $ANTLR start "ruleClassMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:239:1: ruleClassMatching : ( ( rule__ClassMatching__Group__0 ) ) ;
    public final void ruleClassMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:243:2: ( ( ( rule__ClassMatching__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:244:1: ( ( rule__ClassMatching__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:244:1: ( ( rule__ClassMatching__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:245:1: ( rule__ClassMatching__Group__0 )
            {
             before(grammarAccess.getClassMatchingAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:246:1: ( rule__ClassMatching__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:246:2: rule__ClassMatching__Group__0
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__0_in_ruleClassMatching456);
            rule__ClassMatching__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassMatchingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassMatching"


    // $ANTLR start "entryRuleConfigurationElement"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:258:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:259:1: ( ruleConfigurationElement EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:260:1: ruleConfigurationElement EOF
            {
             before(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement483);
            ruleConfigurationElement();

            state._fsp--;

             after(grammarAccess.getConfigurationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigurationElement"


    // $ANTLR start "ruleConfigurationElement"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:267:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:271:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:272:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:272:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:273:1: ( rule__ConfigurationElement__Alternatives )
            {
             before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:274:1: ( rule__ConfigurationElement__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:274:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement516);
            rule__ConfigurationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleFile"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:286:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:287:1: ( ruleFile EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:288:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile543);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:295:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:299:2: ( ( ( rule__File__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:300:1: ( ( rule__File__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:300:1: ( ( rule__File__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:301:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:302:1: ( rule__File__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:302:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile576);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleConfiguration"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:314:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:315:1: ( ruleConfiguration EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:316:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration603);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:323:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:327:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:328:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:328:1: ( ( rule__Configuration__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:329:1: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:330:1: ( rule__Configuration__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:330:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration636);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleMethod"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:342:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:343:1: ( ruleMethod EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:344:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod663);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:351:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:355:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:356:1: ( ( rule__Method__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:356:1: ( ( rule__Method__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:357:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:358:1: ( rule__Method__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:358:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod696);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMetaClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:370:1: entryRuleMetaClass : ruleMetaClass EOF ;
    public final void entryRuleMetaClass() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:371:1: ( ruleMetaClass EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:372:1: ruleMetaClass EOF
            {
             before(grammarAccess.getMetaClassRule()); 
            pushFollow(FOLLOW_ruleMetaClass_in_entryRuleMetaClass723);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getMetaClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaClass730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:379:1: ruleMetaClass : ( ( rule__MetaClass__Group__0 ) ) ;
    public final void ruleMetaClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:383:2: ( ( ( rule__MetaClass__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:384:1: ( ( rule__MetaClass__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:384:1: ( ( rule__MetaClass__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:385:1: ( rule__MetaClass__Group__0 )
            {
             before(grammarAccess.getMetaClassAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:386:1: ( rule__MetaClass__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:386:2: rule__MetaClass__Group__0
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__0_in_ruleMetaClass756);
            rule__MetaClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleExternalClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:398:1: entryRuleExternalClass : ruleExternalClass EOF ;
    public final void entryRuleExternalClass() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:399:1: ( ruleExternalClass EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:400:1: ruleExternalClass EOF
            {
             before(grammarAccess.getExternalClassRule()); 
            pushFollow(FOLLOW_ruleExternalClass_in_entryRuleExternalClass783);
            ruleExternalClass();

            state._fsp--;

             after(grammarAccess.getExternalClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalClass790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalClass"


    // $ANTLR start "ruleExternalClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:407:1: ruleExternalClass : ( ( rule__ExternalClass__Group__0 ) ) ;
    public final void ruleExternalClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:411:2: ( ( ( rule__ExternalClass__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:412:1: ( ( rule__ExternalClass__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:412:1: ( ( rule__ExternalClass__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:413:1: ( rule__ExternalClass__Group__0 )
            {
             before(grammarAccess.getExternalClassAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:414:1: ( rule__ExternalClass__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:414:2: rule__ExternalClass__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__0_in_ruleExternalClass816);
            rule__ExternalClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalClass"


    // $ANTLR start "entryRuleXmlElement"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:426:1: entryRuleXmlElement : ruleXmlElement EOF ;
    public final void entryRuleXmlElement() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:427:1: ( ruleXmlElement EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:428:1: ruleXmlElement EOF
            {
             before(grammarAccess.getXmlElementRule()); 
            pushFollow(FOLLOW_ruleXmlElement_in_entryRuleXmlElement843);
            ruleXmlElement();

            state._fsp--;

             after(grammarAccess.getXmlElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlElement850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:435:1: ruleXmlElement : ( ( rule__XmlElement__Group__0 ) ) ;
    public final void ruleXmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:439:2: ( ( ( rule__XmlElement__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:440:1: ( ( rule__XmlElement__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:440:1: ( ( rule__XmlElement__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:441:1: ( rule__XmlElement__Group__0 )
            {
             before(grammarAccess.getXmlElementAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:442:1: ( rule__XmlElement__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:442:2: rule__XmlElement__Group__0
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__0_in_ruleXmlElement876);
            rule__XmlElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlDocument"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:454:1: entryRuleXmlDocument : ruleXmlDocument EOF ;
    public final void entryRuleXmlDocument() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:455:1: ( ruleXmlDocument EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:456:1: ruleXmlDocument EOF
            {
             before(grammarAccess.getXmlDocumentRule()); 
            pushFollow(FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument903);
            ruleXmlDocument();

            state._fsp--;

             after(grammarAccess.getXmlDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlDocument910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmlDocument"


    // $ANTLR start "ruleXmlDocument"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:463:1: ruleXmlDocument : ( ( rule__XmlDocument__Group__0 ) ) ;
    public final void ruleXmlDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:467:2: ( ( ( rule__XmlDocument__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:468:1: ( ( rule__XmlDocument__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:468:1: ( ( rule__XmlDocument__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:469:1: ( rule__XmlDocument__Group__0 )
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:470:1: ( rule__XmlDocument__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:470:2: rule__XmlDocument__Group__0
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__0_in_ruleXmlDocument936);
            rule__XmlDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmlDocument"


    // $ANTLR start "entryRuleModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:482:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:483:1: ( ruleModule EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:484:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule963);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:491:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:495:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:496:1: ( ( rule__Module__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:496:1: ( ( rule__Module__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:497:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:498:1: ( rule__Module__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:498:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule996);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleMetaModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:510:1: entryRuleMetaModule : ruleMetaModule EOF ;
    public final void entryRuleMetaModule() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:511:1: ( ruleMetaModule EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:512:1: ruleMetaModule EOF
            {
             before(grammarAccess.getMetaModuleRule()); 
            pushFollow(FOLLOW_ruleMetaModule_in_entryRuleMetaModule1023);
            ruleMetaModule();

            state._fsp--;

             after(grammarAccess.getMetaModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModule1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaModule"


    // $ANTLR start "ruleMetaModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:519:1: ruleMetaModule : ( ( rule__MetaModule__Group__0 ) ) ;
    public final void ruleMetaModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:523:2: ( ( ( rule__MetaModule__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:524:1: ( ( rule__MetaModule__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:524:1: ( ( rule__MetaModule__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:525:1: ( rule__MetaModule__Group__0 )
            {
             before(grammarAccess.getMetaModuleAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:526:1: ( rule__MetaModule__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:526:2: rule__MetaModule__Group__0
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__0_in_ruleMetaModule1056);
            rule__MetaModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaModule"


    // $ANTLR start "entryRuleExternalModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:538:1: entryRuleExternalModule : ruleExternalModule EOF ;
    public final void entryRuleExternalModule() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:539:1: ( ruleExternalModule EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:540:1: ruleExternalModule EOF
            {
             before(grammarAccess.getExternalModuleRule()); 
            pushFollow(FOLLOW_ruleExternalModule_in_entryRuleExternalModule1083);
            ruleExternalModule();

            state._fsp--;

             after(grammarAccess.getExternalModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalModule1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalModule"


    // $ANTLR start "ruleExternalModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:547:1: ruleExternalModule : ( ( rule__ExternalModule__Group__0 ) ) ;
    public final void ruleExternalModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:551:2: ( ( ( rule__ExternalModule__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:552:1: ( ( rule__ExternalModule__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:552:1: ( ( rule__ExternalModule__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:553:1: ( rule__ExternalModule__Group__0 )
            {
             before(grammarAccess.getExternalModuleAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:554:1: ( rule__ExternalModule__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:554:2: rule__ExternalModule__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__0_in_ruleExternalModule1116);
            rule__ExternalModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:566:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:567:1: ( ruleQualifiedName EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:568:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1143);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:575:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:579:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:580:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:580:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:581:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:582:1: ( rule__QualifiedName__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:582:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1176);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRestriction"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:594:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:595:1: ( ruleRestriction EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:596:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction1203);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:603:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:607:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:608:1: ( ( rule__Restriction__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:608:1: ( ( rule__Restriction__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:609:1: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:610:1: ( rule__Restriction__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:610:2: rule__Restriction__Group__0
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0_in_ruleRestriction1236);
            rule__Restriction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "ruleCardinality"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:623:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:627:1: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:628:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:628:1: ( ( rule__Cardinality__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:629:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:630:1: ( rule__Cardinality__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:630:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1273);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "ruleExpressionMatchingClause"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:642:1: ruleExpressionMatchingClause : ( ( rule__ExpressionMatchingClause__Alternatives ) ) ;
    public final void ruleExpressionMatchingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:646:1: ( ( ( rule__ExpressionMatchingClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:647:1: ( ( rule__ExpressionMatchingClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:647:1: ( ( rule__ExpressionMatchingClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:648:1: ( rule__ExpressionMatchingClause__Alternatives )
            {
             before(grammarAccess.getExpressionMatchingClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:649:1: ( rule__ExpressionMatchingClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:649:2: rule__ExpressionMatchingClause__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionMatchingClause__Alternatives_in_ruleExpressionMatchingClause1309);
            rule__ExpressionMatchingClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionMatchingClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionMatchingClause"


    // $ANTLR start "ruleModuleMatchingParamenter"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:661:1: ruleModuleMatchingParamenter : ( ( rule__ModuleMatchingParamenter__Alternatives ) ) ;
    public final void ruleModuleMatchingParamenter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:665:1: ( ( ( rule__ModuleMatchingParamenter__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:666:1: ( ( rule__ModuleMatchingParamenter__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:666:1: ( ( rule__ModuleMatchingParamenter__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:667:1: ( rule__ModuleMatchingParamenter__Alternatives )
            {
             before(grammarAccess.getModuleMatchingParamenterAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:668:1: ( rule__ModuleMatchingParamenter__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:668:2: rule__ModuleMatchingParamenter__Alternatives
            {
            pushFollow(FOLLOW_rule__ModuleMatchingParamenter__Alternatives_in_ruleModuleMatchingParamenter1345);
            rule__ModuleMatchingParamenter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModuleMatchingParamenterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleMatchingParamenter"


    // $ANTLR start "ruleGroupClause"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:680:1: ruleGroupClause : ( ( rule__GroupClause__Alternatives ) ) ;
    public final void ruleGroupClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:684:1: ( ( ( rule__GroupClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:685:1: ( ( rule__GroupClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:685:1: ( ( rule__GroupClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:686:1: ( rule__GroupClause__Alternatives )
            {
             before(grammarAccess.getGroupClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:687:1: ( rule__GroupClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:687:2: rule__GroupClause__Alternatives
            {
            pushFollow(FOLLOW_rule__GroupClause__Alternatives_in_ruleGroupClause1381);
            rule__GroupClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "rulePermissionClause"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:699:1: rulePermissionClause : ( ( rule__PermissionClause__Alternatives ) ) ;
    public final void rulePermissionClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:703:1: ( ( ( rule__PermissionClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:704:1: ( ( rule__PermissionClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:704:1: ( ( rule__PermissionClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:705:1: ( rule__PermissionClause__Alternatives )
            {
             before(grammarAccess.getPermissionClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:706:1: ( rule__PermissionClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:706:2: rule__PermissionClause__Alternatives
            {
            pushFollow(FOLLOW_rule__PermissionClause__Alternatives_in_rulePermissionClause1417);
            rule__PermissionClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPermissionClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionClause"


    // $ANTLR start "ruleRelactionType"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:718:1: ruleRelactionType : ( ( rule__RelactionType__Alternatives ) ) ;
    public final void ruleRelactionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:722:1: ( ( ( rule__RelactionType__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:723:1: ( ( rule__RelactionType__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:723:1: ( ( rule__RelactionType__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:724:1: ( rule__RelactionType__Alternatives )
            {
             before(grammarAccess.getRelactionTypeAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:725:1: ( rule__RelactionType__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:725:2: rule__RelactionType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelactionType__Alternatives_in_ruleRelactionType1453);
            rule__RelactionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelactionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelactionType"


    // $ANTLR start "rule__AbstractComponent__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:736:1: rule__AbstractComponent__Alternatives : ( ( ruleModule ) | ( ruleMetaModule ) | ( ruleExternalModule ) | ( ruleMetaClass ) | ( ruleExternalClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) | ( ( rule__AbstractComponent__Group_7__0 ) ) );
    public final void rule__AbstractComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:740:1: ( ( ruleModule ) | ( ruleMetaModule ) | ( ruleExternalModule ) | ( ruleMetaClass ) | ( ruleExternalClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) | ( ( rule__AbstractComponent__Group_7__0 ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt1=1;
                }
                break;
            case 64:
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            case 55:
                {
                alt1=4;
                }
                break;
            case 59:
                {
                alt1=5;
                }
                break;
            case 54:
                {
                alt1=6;
                }
                break;
            case 50:
            case 53:
            case 61:
            case 62:
                {
                alt1=7;
                }
                break;
            case 47:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:741:1: ( ruleModule )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:741:1: ( ruleModule )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:742:1: ruleModule
                    {
                     before(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__AbstractComponent__Alternatives1488);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:747:6: ( ruleMetaModule )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:747:6: ( ruleMetaModule )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:748:1: ruleMetaModule
                    {
                     before(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMetaModule_in_rule__AbstractComponent__Alternatives1505);
                    ruleMetaModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:753:6: ( ruleExternalModule )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:753:6: ( ruleExternalModule )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:754:1: ruleExternalModule
                    {
                     before(grammarAccess.getAbstractComponentAccess().getExternalModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExternalModule_in_rule__AbstractComponent__Alternatives1522);
                    ruleExternalModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getExternalModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:759:6: ( ruleMetaClass )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:759:6: ( ruleMetaClass )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:760:1: ruleMetaClass
                    {
                     before(grammarAccess.getAbstractComponentAccess().getMetaClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMetaClass_in_rule__AbstractComponent__Alternatives1539);
                    ruleMetaClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getMetaClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:765:6: ( ruleExternalClass )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:765:6: ( ruleExternalClass )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:766:1: ruleExternalClass
                    {
                     before(grammarAccess.getAbstractComponentAccess().getExternalClassParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleExternalClass_in_rule__AbstractComponent__Alternatives1556);
                    ruleExternalClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getExternalClassParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:771:6: ( ruleMethod )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:771:6: ( ruleMethod )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:772:1: ruleMethod
                    {
                     before(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__AbstractComponent__Alternatives1573);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:777:6: ( ruleConfigurationElement )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:777:6: ( ruleConfigurationElement )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:778:1: ruleConfigurationElement
                    {
                     before(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleConfigurationElement_in_rule__AbstractComponent__Alternatives1590);
                    ruleConfigurationElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:783:6: ( ( rule__AbstractComponent__Group_7__0 ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:783:6: ( ( rule__AbstractComponent__Group_7__0 ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:784:1: ( rule__AbstractComponent__Group_7__0 )
                    {
                     before(grammarAccess.getAbstractComponentAccess().getGroup_7()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:785:1: ( rule__AbstractComponent__Group_7__0 )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:785:2: rule__AbstractComponent__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AbstractComponent__Group_7__0_in_rule__AbstractComponent__Alternatives1607);
                    rule__AbstractComponent__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractComponentAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__Alternatives"


    // $ANTLR start "rule__AbstractNameConvetion__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:794:1: rule__AbstractNameConvetion__Alternatives : ( ( RULE_STRING ) | ( ruleClassMatching ) );
    public final void rule__AbstractNameConvetion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:798:1: ( ( RULE_STRING ) | ( ruleClassMatching ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:799:1: ( RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:799:1: ( RULE_STRING )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:800:1: RULE_STRING
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1640); 
                     after(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:805:6: ( ruleClassMatching )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:805:6: ( ruleClassMatching )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:806:1: ruleClassMatching
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1657);
                    ruleClassMatching();

                    state._fsp--;

                     after(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractNameConvetion__Alternatives"


    // $ANTLR start "rule__ConfigurationElement__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:817:1: rule__ConfigurationElement__Alternatives : ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:821:1: ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt3=1;
                }
                break;
            case 62:
                {
                alt3=2;
                }
                break;
            case 61:
                {
                alt3=3;
                }
                break;
            case 50:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:822:1: ( ruleConfiguration )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:822:1: ( ruleConfiguration )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:823:1: ruleConfiguration
                    {
                     before(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1690);
                    ruleConfiguration();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:6: ( ruleXmlDocument )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:6: ( ruleXmlDocument )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:829:1: ruleXmlDocument
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1707);
                    ruleXmlDocument();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:834:6: ( ruleXmlElement )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:834:6: ( ruleXmlElement )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:835:1: ruleXmlElement
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1724);
                    ruleXmlElement();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:840:6: ( ruleFile )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:840:6: ( ruleFile )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:841:1: ruleFile
                    {
                     before(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1741);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationElement__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:851:1: rule__Cardinality__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:855:1: ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:856:1: ( ( '1' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:856:1: ( ( '1' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:857:1: ( '1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:858:1: ( '1' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:858:3: '1'
                    {
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1774); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:863:6: ( ( '0' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:863:6: ( ( '0' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:864:1: ( '0' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:865:1: ( '0' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:865:3: '0'
                    {
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1795); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:870:6: ( ( '1..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:870:6: ( ( '1..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:871:1: ( '1..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:872:1: ( '1..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:872:3: '1..*'
                    {
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1816); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:877:6: ( ( '0..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:877:6: ( ( '0..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:878:1: ( '0..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:879:1: ( '0..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:879:3: '0..*'
                    {
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1837); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__ExpressionMatchingClause__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:889:1: rule__ExpressionMatchingClause__Alternatives : ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) | ( ( 'annotated with' ) ) );
    public final void rule__ExpressionMatchingClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:893:1: ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) | ( ( 'annotated with' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:894:1: ( ( 'name start with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:894:1: ( ( 'name start with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:895:1: ( 'name start with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:896:1: ( 'name start with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:896:3: 'name start with'
                    {
                    match(input,16,FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives1873); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:901:6: ( ( 'name ends with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:901:6: ( ( 'name ends with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:902:1: ( 'name ends with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:903:1: ( 'name ends with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:903:3: 'name ends with'
                    {
                    match(input,17,FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives1894); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:908:6: ( ( 'annotated with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:908:6: ( ( 'annotated with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:909:1: ( 'annotated with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getANNOTATED_WITHEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:910:1: ( 'annotated with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:910:3: 'annotated with'
                    {
                    match(input,18,FOLLOW_18_in_rule__ExpressionMatchingClause__Alternatives1915); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getANNOTATED_WITHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionMatchingClause__Alternatives"


    // $ANTLR start "rule__ModuleMatchingParamenter__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:920:1: rule__ModuleMatchingParamenter__Alternatives : ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) );
    public final void rule__ModuleMatchingParamenter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:924:1: ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:925:1: ( ( 'by package name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:925:1: ( ( 'by package name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:926:1: ( 'by package name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:927:1: ( 'by package name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:927:3: 'by package name'
                    {
                    match(input,19,FOLLOW_19_in_rule__ModuleMatchingParamenter__Alternatives1951); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:932:6: ( ( 'by folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:932:6: ( ( 'by folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:933:1: ( 'by folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:934:1: ( 'by folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:934:3: 'by folder name'
                    {
                    match(input,20,FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives1972); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:939:6: ( ( 'by package and folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:939:6: ( ( 'by package and folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:940:1: ( 'by package and folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:941:1: ( 'by package and folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:941:3: 'by package and folder name'
                    {
                    match(input,21,FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives1993); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:946:6: ( ( 'by external implementation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:946:6: ( ( 'by external implementation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:947:1: ( 'by external implementation' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:948:1: ( 'by external implementation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:948:3: 'by external implementation'
                    {
                    match(input,22,FOLLOW_22_in_rule__ModuleMatchingParamenter__Alternatives2014); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleMatchingParamenter__Alternatives"


    // $ANTLR start "rule__GroupClause__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:958:1: rule__GroupClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) );
    public final void rule__GroupClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:962:1: ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:963:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:963:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:964:1: ( 'null' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:965:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:965:3: 'null'
                    {
                    match(input,23,FOLLOW_23_in_rule__GroupClause__Alternatives2050); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:970:6: ( ( 'only' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:970:6: ( ( 'only' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:971:1: ( 'only' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:972:1: ( 'only' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:972:3: 'only'
                    {
                    match(input,24,FOLLOW_24_in_rule__GroupClause__Alternatives2071); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:977:6: ( ( 'any' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:977:6: ( ( 'any' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:978:1: ( 'any' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:979:1: ( 'any' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:979:3: 'any'
                    {
                    match(input,25,FOLLOW_25_in_rule__GroupClause__Alternatives2092); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:984:6: ( ( 'no one' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:984:6: ( ( 'no one' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:985:1: ( 'no one' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:986:1: ( 'no one' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:986:3: 'no one'
                    {
                    match(input,26,FOLLOW_26_in_rule__GroupClause__Alternatives2113); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Alternatives"


    // $ANTLR start "rule__PermissionClause__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:996:1: rule__PermissionClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) );
    public final void rule__PermissionClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1000:1: ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1001:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1001:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1002:1: ( 'null' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1003:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1003:3: 'null'
                    {
                    match(input,23,FOLLOW_23_in_rule__PermissionClause__Alternatives2149); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1008:6: ( ( 'must' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1008:6: ( ( 'must' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1009:1: ( 'must' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1010:1: ( 'must' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1010:3: 'must'
                    {
                    match(input,27,FOLLOW_27_in_rule__PermissionClause__Alternatives2170); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1015:6: ( ( 'can' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1015:6: ( ( 'can' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1016:1: ( 'can' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1017:1: ( 'can' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1017:3: 'can'
                    {
                    match(input,28,FOLLOW_28_in_rule__PermissionClause__Alternatives2191); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1022:6: ( ( 'cannot' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1022:6: ( ( 'cannot' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1023:1: ( 'cannot' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1024:1: ( 'cannot' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1024:3: 'cannot'
                    {
                    match(input,29,FOLLOW_29_in_rule__PermissionClause__Alternatives2212); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionClause__Alternatives"


    // $ANTLR start "rule__RelactionType__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1034:1: rule__RelactionType__Alternatives : ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) );
    public final void rule__RelactionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1038:1: ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
                {
                alt9=4;
                }
                break;
            case 34:
                {
                alt9=5;
                }
                break;
            case 35:
                {
                alt9=6;
                }
                break;
            case 36:
                {
                alt9=7;
                }
                break;
            case 37:
                {
                alt9=8;
                }
                break;
            case 38:
                {
                alt9=9;
                }
                break;
            case 39:
                {
                alt9=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1039:1: ( ( 'access' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1039:1: ( ( 'access' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1040:1: ( 'access' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1041:1: ( 'access' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1041:3: 'access'
                    {
                    match(input,30,FOLLOW_30_in_rule__RelactionType__Alternatives2248); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1046:6: ( ( 'declare' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1046:6: ( ( 'declare' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1047:1: ( 'declare' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1048:1: ( 'declare' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1048:3: 'declare'
                    {
                    match(input,31,FOLLOW_31_in_rule__RelactionType__Alternatives2269); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1053:6: ( ( 'handle' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1053:6: ( ( 'handle' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1054:1: ( 'handle' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1055:1: ( 'handle' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1055:3: 'handle'
                    {
                    match(input,32,FOLLOW_32_in_rule__RelactionType__Alternatives2290); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1060:6: ( ( 'extend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1060:6: ( ( 'extend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1061:1: ( 'extend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1062:1: ( 'extend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1062:3: 'extend'
                    {
                    match(input,33,FOLLOW_33_in_rule__RelactionType__Alternatives2311); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1067:6: ( ( 'implement' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1067:6: ( ( 'implement' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1068:1: ( 'implement' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1069:1: ( 'implement' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1069:3: 'implement'
                    {
                    match(input,34,FOLLOW_34_in_rule__RelactionType__Alternatives2332); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1074:6: ( ( 'create' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1074:6: ( ( 'create' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1075:1: ( 'create' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1076:1: ( 'create' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1076:3: 'create'
                    {
                    match(input,35,FOLLOW_35_in_rule__RelactionType__Alternatives2353); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1081:6: ( ( 'throw' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1081:6: ( ( 'throw' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1082:1: ( 'throw' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1083:1: ( 'throw' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1083:3: 'throw'
                    {
                    match(input,36,FOLLOW_36_in_rule__RelactionType__Alternatives2374); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1088:6: ( ( 'use annotation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1088:6: ( ( 'use annotation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1089:1: ( 'use annotation' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1090:1: ( 'use annotation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1090:3: 'use annotation'
                    {
                    match(input,37,FOLLOW_37_in_rule__RelactionType__Alternatives2395); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1095:6: ( ( 'depend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1095:6: ( ( 'depend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1096:1: ( 'depend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1097:1: ( 'depend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1097:3: 'depend'
                    {
                    match(input,38,FOLLOW_38_in_rule__RelactionType__Alternatives2416); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1102:6: ( ( 'requires' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1102:6: ( ( 'requires' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1103:1: ( 'requires' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1104:1: ( 'requires' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1104:3: 'requires'
                    {
                    match(input,39,FOLLOW_39_in_rule__RelactionType__Alternatives2437); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelactionType__Alternatives"


    // $ANTLR start "rule__ASMLModel__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1116:1: rule__ASMLModel__Group__0 : rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 ;
    public final void rule__ASMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1120:1: ( rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1121:2: rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02470);
            rule__ASMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02473);
            rule__ASMLModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__0"


    // $ANTLR start "rule__ASMLModel__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1128:1: rule__ASMLModel__Group__0__Impl : ( 'architecture' ) ;
    public final void rule__ASMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1132:1: ( ( 'architecture' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1133:1: ( 'architecture' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1133:1: ( 'architecture' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1134:1: 'architecture'
            {
             before(grammarAccess.getASMLModelAccess().getArchitectureKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__ASMLModel__Group__0__Impl2501); 
             after(grammarAccess.getASMLModelAccess().getArchitectureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__0__Impl"


    // $ANTLR start "rule__ASMLModel__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1147:1: rule__ASMLModel__Group__1 : rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 ;
    public final void rule__ASMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1151:1: ( rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1152:2: rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12532);
            rule__ASMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12535);
            rule__ASMLModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__1"


    // $ANTLR start "rule__ASMLModel__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1159:1: rule__ASMLModel__Group__1__Impl : ( ( rule__ASMLModel__NameAssignment_1 ) ) ;
    public final void rule__ASMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1163:1: ( ( ( rule__ASMLModel__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1164:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1164:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1165:1: ( rule__ASMLModel__NameAssignment_1 )
            {
             before(grammarAccess.getASMLModelAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1166:1: ( rule__ASMLModel__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1166:2: rule__ASMLModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2562);
            rule__ASMLModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getASMLModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__1__Impl"


    // $ANTLR start "rule__ASMLModel__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1176:1: rule__ASMLModel__Group__2 : rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 ;
    public final void rule__ASMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1180:1: ( rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1181:2: rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22592);
            rule__ASMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22595);
            rule__ASMLModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__2"


    // $ANTLR start "rule__ASMLModel__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1188:1: rule__ASMLModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ASMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1192:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1193:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1193:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1194:1: '{'
            {
             before(grammarAccess.getASMLModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__ASMLModel__Group__2__Impl2623); 
             after(grammarAccess.getASMLModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__2__Impl"


    // $ANTLR start "rule__ASMLModel__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1207:1: rule__ASMLModel__Group__3 : rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 ;
    public final void rule__ASMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1211:1: ( rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1212:2: rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32654);
            rule__ASMLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32657);
            rule__ASMLModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__3"


    // $ANTLR start "rule__ASMLModel__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1219:1: rule__ASMLModel__Group__3__Impl : ( ( rule__ASMLModel__Group_3__0 )? ) ;
    public final void rule__ASMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1223:1: ( ( ( rule__ASMLModel__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1224:1: ( ( rule__ASMLModel__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1224:1: ( ( rule__ASMLModel__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1225:1: ( rule__ASMLModel__Group_3__0 )?
            {
             before(grammarAccess.getASMLModelAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1226:1: ( rule__ASMLModel__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1226:2: rule__ASMLModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2684);
                    rule__ASMLModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getASMLModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__3__Impl"


    // $ANTLR start "rule__ASMLModel__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1236:1: rule__ASMLModel__Group__4 : rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 ;
    public final void rule__ASMLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1240:1: ( rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1241:2: rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42715);
            rule__ASMLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42718);
            rule__ASMLModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__4"


    // $ANTLR start "rule__ASMLModel__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1248:1: rule__ASMLModel__Group__4__Impl : ( ( rule__ASMLModel__ViewsAssignment_4 )* ) ;
    public final void rule__ASMLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1252:1: ( ( ( rule__ASMLModel__ViewsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1253:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1253:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1254:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            {
             before(grammarAccess.getASMLModelAccess().getViewsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1255:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1255:2: rule__ASMLModel__ViewsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl2745);
            	    rule__ASMLModel__ViewsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getASMLModelAccess().getViewsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__4__Impl"


    // $ANTLR start "rule__ASMLModel__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1265:1: rule__ASMLModel__Group__5 : rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6 ;
    public final void rule__ASMLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1269:1: ( rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1270:2: rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__52776);
            rule__ASMLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__6_in_rule__ASMLModel__Group__52779);
            rule__ASMLModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__5"


    // $ANTLR start "rule__ASMLModel__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1277:1: rule__ASMLModel__Group__5__Impl : ( ( rule__ASMLModel__Group_5__0 )? ) ;
    public final void rule__ASMLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1281:1: ( ( ( rule__ASMLModel__Group_5__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1282:1: ( ( rule__ASMLModel__Group_5__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1282:1: ( ( rule__ASMLModel__Group_5__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1283:1: ( rule__ASMLModel__Group_5__0 )?
            {
             before(grammarAccess.getASMLModelAccess().getGroup_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1284:1: ( rule__ASMLModel__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1284:2: rule__ASMLModel__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ASMLModel__Group_5__0_in_rule__ASMLModel__Group__5__Impl2806);
                    rule__ASMLModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getASMLModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__5__Impl"


    // $ANTLR start "rule__ASMLModel__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1294:1: rule__ASMLModel__Group__6 : rule__ASMLModel__Group__6__Impl ;
    public final void rule__ASMLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1298:1: ( rule__ASMLModel__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1299:2: rule__ASMLModel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__6__Impl_in_rule__ASMLModel__Group__62837);
            rule__ASMLModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__6"


    // $ANTLR start "rule__ASMLModel__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1305:1: rule__ASMLModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ASMLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1309:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1310:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1310:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1311:1: '}'
            {
             before(grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__ASMLModel__Group__6__Impl2865); 
             after(grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group__6__Impl"


    // $ANTLR start "rule__ASMLModel__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1338:1: rule__ASMLModel__Group_3__0 : rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 ;
    public final void rule__ASMLModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1342:1: ( rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1343:2: rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__02910);
            rule__ASMLModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__02913);
            rule__ASMLModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__0"


    // $ANTLR start "rule__ASMLModel__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1350:1: rule__ASMLModel__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__ASMLModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1354:1: ( ( 'import' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1355:1: ( 'import' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1355:1: ( 'import' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1356:1: 'import'
            {
             before(grammarAccess.getASMLModelAccess().getImportKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__ASMLModel__Group_3__0__Impl2941); 
             after(grammarAccess.getASMLModelAccess().getImportKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__0__Impl"


    // $ANTLR start "rule__ASMLModel__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1369:1: rule__ASMLModel__Group_3__1 : rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 ;
    public final void rule__ASMLModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1373:1: ( rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1374:2: rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__12972);
            rule__ASMLModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__12975);
            rule__ASMLModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__1"


    // $ANTLR start "rule__ASMLModel__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1381:1: rule__ASMLModel__Group_3__1__Impl : ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) ;
    public final void rule__ASMLModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1385:1: ( ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1386:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1386:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1387:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            {
             before(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1388:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1388:2: rule__ASMLModel__ImportURIAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl3002);
            rule__ASMLModel__ImportURIAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__1__Impl"


    // $ANTLR start "rule__ASMLModel__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1398:1: rule__ASMLModel__Group_3__2 : rule__ASMLModel__Group_3__2__Impl ;
    public final void rule__ASMLModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1402:1: ( rule__ASMLModel__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1403:2: rule__ASMLModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__23032);
            rule__ASMLModel__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__2"


    // $ANTLR start "rule__ASMLModel__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1409:1: rule__ASMLModel__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ASMLModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1413:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1414:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1414:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1415:1: ';'
            {
             before(grammarAccess.getASMLModelAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__ASMLModel__Group_3__2__Impl3060); 
             after(grammarAccess.getASMLModelAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_3__2__Impl"


    // $ANTLR start "rule__ASMLModel__Group_5__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1434:1: rule__ASMLModel__Group_5__0 : rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1 ;
    public final void rule__ASMLModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1438:1: ( rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1439:2: rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__0__Impl_in_rule__ASMLModel__Group_5__03097);
            rule__ASMLModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5__1_in_rule__ASMLModel__Group_5__03100);
            rule__ASMLModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__0"


    // $ANTLR start "rule__ASMLModel__Group_5__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1446:1: rule__ASMLModel__Group_5__0__Impl : ( 'ignore' ) ;
    public final void rule__ASMLModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1450:1: ( ( 'ignore' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1451:1: ( 'ignore' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1451:1: ( 'ignore' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1452:1: 'ignore'
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreKeyword_5_0()); 
            match(input,45,FOLLOW_45_in_rule__ASMLModel__Group_5__0__Impl3128); 
             after(grammarAccess.getASMLModelAccess().getIgnoreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__0__Impl"


    // $ANTLR start "rule__ASMLModel__Group_5__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1465:1: rule__ASMLModel__Group_5__1 : rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2 ;
    public final void rule__ASMLModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1469:1: ( rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1470:2: rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__1__Impl_in_rule__ASMLModel__Group_5__13159);
            rule__ASMLModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5__2_in_rule__ASMLModel__Group_5__13162);
            rule__ASMLModel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__1"


    // $ANTLR start "rule__ASMLModel__Group_5__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1477:1: rule__ASMLModel__Group_5__1__Impl : ( ( rule__ASMLModel__Group_5_1__0 )* ) ;
    public final void rule__ASMLModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1481:1: ( ( ( rule__ASMLModel__Group_5_1__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1482:1: ( ( rule__ASMLModel__Group_5_1__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1482:1: ( ( rule__ASMLModel__Group_5_1__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1483:1: ( rule__ASMLModel__Group_5_1__0 )*
            {
             before(grammarAccess.getASMLModelAccess().getGroup_5_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1484:1: ( rule__ASMLModel__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1484:2: rule__ASMLModel__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__0_in_rule__ASMLModel__Group_5__1__Impl3189);
            	    rule__ASMLModel__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getASMLModelAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__1__Impl"


    // $ANTLR start "rule__ASMLModel__Group_5__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1494:1: rule__ASMLModel__Group_5__2 : rule__ASMLModel__Group_5__2__Impl ;
    public final void rule__ASMLModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1498:1: ( rule__ASMLModel__Group_5__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1499:2: rule__ASMLModel__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__2__Impl_in_rule__ASMLModel__Group_5__23220);
            rule__ASMLModel__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__2"


    // $ANTLR start "rule__ASMLModel__Group_5__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1505:1: rule__ASMLModel__Group_5__2__Impl : ( ';' ) ;
    public final void rule__ASMLModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1509:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1510:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1510:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1511:1: ';'
            {
             before(grammarAccess.getASMLModelAccess().getSemicolonKeyword_5_2()); 
            match(input,44,FOLLOW_44_in_rule__ASMLModel__Group_5__2__Impl3248); 
             after(grammarAccess.getASMLModelAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5__2__Impl"


    // $ANTLR start "rule__ASMLModel__Group_5_1__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1530:1: rule__ASMLModel__Group_5_1__0 : rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1 ;
    public final void rule__ASMLModel__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1534:1: ( rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1535:2: rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__0__Impl_in_rule__ASMLModel__Group_5_1__03285);
            rule__ASMLModel__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__1_in_rule__ASMLModel__Group_5_1__03288);
            rule__ASMLModel__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5_1__0"


    // $ANTLR start "rule__ASMLModel__Group_5_1__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1542:1: rule__ASMLModel__Group_5_1__0__Impl : ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) ) ;
    public final void rule__ASMLModel__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1546:1: ( ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1547:1: ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1547:1: ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1548:1: ( rule__ASMLModel__IgnoreAssignment_5_1_0 )
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreAssignment_5_1_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1549:1: ( rule__ASMLModel__IgnoreAssignment_5_1_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1549:2: rule__ASMLModel__IgnoreAssignment_5_1_0
            {
            pushFollow(FOLLOW_rule__ASMLModel__IgnoreAssignment_5_1_0_in_rule__ASMLModel__Group_5_1__0__Impl3315);
            rule__ASMLModel__IgnoreAssignment_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getASMLModelAccess().getIgnoreAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5_1__0__Impl"


    // $ANTLR start "rule__ASMLModel__Group_5_1__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1559:1: rule__ASMLModel__Group_5_1__1 : rule__ASMLModel__Group_5_1__1__Impl ;
    public final void rule__ASMLModel__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1563:1: ( rule__ASMLModel__Group_5_1__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1564:2: rule__ASMLModel__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__1__Impl_in_rule__ASMLModel__Group_5_1__13345);
            rule__ASMLModel__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5_1__1"


    // $ANTLR start "rule__ASMLModel__Group_5_1__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1570:1: rule__ASMLModel__Group_5_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__ASMLModel__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1574:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1575:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1575:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1576:1: ( ',' )?
            {
             before(grammarAccess.getASMLModelAccess().getCommaKeyword_5_1_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1577:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1578:2: ','
                    {
                    match(input,46,FOLLOW_46_in_rule__ASMLModel__Group_5_1__1__Impl3374); 

                    }
                    break;

            }

             after(grammarAccess.getASMLModelAccess().getCommaKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__Group_5_1__1__Impl"


    // $ANTLR start "rule__View__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1593:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1597:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1598:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03411);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__03414);
            rule__View__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1605:1: rule__View__Group__0__Impl : ( 'view' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1609:1: ( ( 'view' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1610:1: ( 'view' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1610:1: ( 'view' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1611:1: 'view'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__View__Group__0__Impl3442); 
             after(grammarAccess.getViewAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1624:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1628:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1629:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13473);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__13476);
            rule__View__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1636:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1640:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1641:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1641:1: ( ( rule__View__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1642:1: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1643:1: ( rule__View__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1643:2: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3503);
            rule__View__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1653:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1657:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1658:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23533);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__23536);
            rule__View__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1665:1: rule__View__Group__2__Impl : ( '{' ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1669:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1670:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1670:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1671:1: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__View__Group__2__Impl3564); 
             after(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1684:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1688:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1689:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33595);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__33598);
            rule__View__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1696:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1700:1: ( ( ( rule__View__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1701:1: ( ( rule__View__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1701:1: ( ( rule__View__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1702:1: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1703:1: ( rule__View__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44||LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1703:2: rule__View__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3625);
                    rule__View__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1713:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1717:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1718:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43656);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__43659);
            rule__View__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1725:1: rule__View__Group__4__Impl : ( ( rule__View__ComponentsAssignment_4 )* ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1729:1: ( ( ( rule__View__ComponentsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1730:1: ( ( rule__View__ComponentsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1730:1: ( ( rule__View__ComponentsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1731:1: ( rule__View__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getViewAccess().getComponentsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1732:1: ( rule__View__ComponentsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47||LA16_0==50||(LA16_0>=53 && LA16_0<=55)||LA16_0==59||(LA16_0>=61 && LA16_0<=65)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1732:2: rule__View__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3686);
            	    rule__View__ComponentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getComponentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1742:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1746:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1747:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53717);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__6_in_rule__View__Group__53720);
            rule__View__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1754:1: rule__View__Group__5__Impl : ( ( rule__View__RestrictionsAssignment_5 )* ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1758:1: ( ( ( rule__View__RestrictionsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1759:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1759:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1760:1: ( rule__View__RestrictionsAssignment_5 )*
            {
             before(grammarAccess.getViewAccess().getRestrictionsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1761:1: ( rule__View__RestrictionsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==67) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1761:2: rule__View__RestrictionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3747);
            	    rule__View__RestrictionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getRestrictionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__View__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1771:1: rule__View__Group__6 : rule__View__Group__6__Impl ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1775:1: ( rule__View__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1776:2: rule__View__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63778);
            rule__View__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6"


    // $ANTLR start "rule__View__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1782:1: rule__View__Group__6__Impl : ( '}' ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1786:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1787:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1787:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1788:1: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__View__Group__6__Impl3806); 
             after(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6__Impl"


    // $ANTLR start "rule__View__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1815:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1819:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1820:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
            {
            pushFollow(FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03851);
            rule__View__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03854);
            rule__View__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__0"


    // $ANTLR start "rule__View__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1827:1: rule__View__Group_3__0__Impl : ( ( rule__View__Group_3_0__0 )* ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1831:1: ( ( ( rule__View__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1832:1: ( ( rule__View__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1832:1: ( ( rule__View__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1833:1: ( rule__View__Group_3_0__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1834:1: ( rule__View__Group_3_0__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1834:2: rule__View__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3881);
            	    rule__View__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__0__Impl"


    // $ANTLR start "rule__View__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1844:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1848:1: ( rule__View__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1849:2: rule__View__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13912);
            rule__View__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__1"


    // $ANTLR start "rule__View__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1855:1: rule__View__Group_3__1__Impl : ( ';' ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1859:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1860:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1860:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1861:1: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_3_1()); 
            match(input,44,FOLLOW_44_in_rule__View__Group_3__1__Impl3940); 
             after(grammarAccess.getViewAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3__1__Impl"


    // $ANTLR start "rule__View__Group_3_0__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1878:1: rule__View__Group_3_0__0 : rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 ;
    public final void rule__View__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1882:1: ( rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1883:2: rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03975);
            rule__View__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03978);
            rule__View__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__0"


    // $ANTLR start "rule__View__Group_3_0__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1890:1: rule__View__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__View__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1894:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1895:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1895:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1896:1: 'attributes'
            {
             before(grammarAccess.getViewAccess().getAttributesKeyword_3_0_0()); 
            match(input,48,FOLLOW_48_in_rule__View__Group_3_0__0__Impl4006); 
             after(grammarAccess.getViewAccess().getAttributesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__0__Impl"


    // $ANTLR start "rule__View__Group_3_0__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1909:1: rule__View__Group_3_0__1 : rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 ;
    public final void rule__View__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1913:1: ( rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1914:2: rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__14037);
            rule__View__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__14040);
            rule__View__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__1"


    // $ANTLR start "rule__View__Group_3_0__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1921:1: rule__View__Group_3_0__1__Impl : ( ( rule__View__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__View__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1925:1: ( ( ( rule__View__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1926:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1926:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1927:1: ( rule__View__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1928:1: ( rule__View__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1928:2: rule__View__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl4067);
            rule__View__AttributesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__1__Impl"


    // $ANTLR start "rule__View__Group_3_0__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1938:1: rule__View__Group_3_0__2 : rule__View__Group_3_0__2__Impl ;
    public final void rule__View__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1942:1: ( rule__View__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1943:2: rule__View__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__24097);
            rule__View__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__2"


    // $ANTLR start "rule__View__Group_3_0__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1949:1: rule__View__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__View__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1953:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1954:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1954:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1955:1: ( ',' )?
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1956:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1957:2: ','
                    {
                    match(input,46,FOLLOW_46_in_rule__View__Group_3_0__2__Impl4126); 

                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getCommaKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_3_0__2__Impl"


    // $ANTLR start "rule__AbstractComponent__Group_7__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1974:1: rule__AbstractComponent__Group_7__0 : rule__AbstractComponent__Group_7__0__Impl rule__AbstractComponent__Group_7__1 ;
    public final void rule__AbstractComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1978:1: ( rule__AbstractComponent__Group_7__0__Impl rule__AbstractComponent__Group_7__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1979:2: rule__AbstractComponent__Group_7__0__Impl rule__AbstractComponent__Group_7__1
            {
            pushFollow(FOLLOW_rule__AbstractComponent__Group_7__0__Impl_in_rule__AbstractComponent__Group_7__04165);
            rule__AbstractComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractComponent__Group_7__1_in_rule__AbstractComponent__Group_7__04168);
            rule__AbstractComponent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__Group_7__0"


    // $ANTLR start "rule__AbstractComponent__Group_7__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1986:1: rule__AbstractComponent__Group_7__0__Impl : ( ruleView ) ;
    public final void rule__AbstractComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1990:1: ( ( ruleView ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1991:1: ( ruleView )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1991:1: ( ruleView )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1992:1: ruleView
            {
             before(grammarAccess.getAbstractComponentAccess().getViewParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__AbstractComponent__Group_7__0__Impl4195);
            ruleView();

            state._fsp--;

             after(grammarAccess.getAbstractComponentAccess().getViewParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__Group_7__0__Impl"


    // $ANTLR start "rule__AbstractComponent__Group_7__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2003:1: rule__AbstractComponent__Group_7__1 : rule__AbstractComponent__Group_7__1__Impl ;
    public final void rule__AbstractComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2007:1: ( rule__AbstractComponent__Group_7__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2008:2: rule__AbstractComponent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractComponent__Group_7__1__Impl_in_rule__AbstractComponent__Group_7__14224);
            rule__AbstractComponent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__Group_7__1"


    // $ANTLR start "rule__AbstractComponent__Group_7__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2014:1: rule__AbstractComponent__Group_7__1__Impl : ( ( rule__AbstractComponent__RestrictionsAssignment_7_1 )* ) ;
    public final void rule__AbstractComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2018:1: ( ( ( rule__AbstractComponent__RestrictionsAssignment_7_1 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2019:1: ( ( rule__AbstractComponent__RestrictionsAssignment_7_1 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2019:1: ( ( rule__AbstractComponent__RestrictionsAssignment_7_1 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2020:1: ( rule__AbstractComponent__RestrictionsAssignment_7_1 )*
            {
             before(grammarAccess.getAbstractComponentAccess().getRestrictionsAssignment_7_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2021:1: ( rule__AbstractComponent__RestrictionsAssignment_7_1 )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2021:2: rule__AbstractComponent__RestrictionsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__AbstractComponent__RestrictionsAssignment_7_1_in_rule__AbstractComponent__Group_7__1__Impl4251);
            	    rule__AbstractComponent__RestrictionsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAbstractComponentAccess().getRestrictionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__Group_7__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2035:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2039:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2040:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04286);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04289);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2047:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2051:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2052:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2052:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2053:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2054:1: ( rule__Attribute__NameAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2054:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4316);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2064:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2068:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2069:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14346);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14349);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2076:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2080:1: ( ( ':' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2081:1: ( ':' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2081:1: ( ':' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2082:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__Attribute__Group__1__Impl4377); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2095:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2099:1: ( rule__Attribute__Group__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2100:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24408);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2106:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2110:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2111:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2111:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2112:1: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2113:1: ( rule__Attribute__ValueAssignment_2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2113:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4435);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__ClassMatching__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2129:1: rule__ClassMatching__Group__0 : rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 ;
    public final void rule__ClassMatching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2133:1: ( rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2134:2: rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__04471);
            rule__ClassMatching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__04474);
            rule__ClassMatching__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__Group__0"


    // $ANTLR start "rule__ClassMatching__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2141:1: rule__ClassMatching__Group__0__Impl : ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) ;
    public final void rule__ClassMatching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2145:1: ( ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2146:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2146:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2147:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2148:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2148:2: rule__ClassMatching__ExpressionMatchingAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl4501);
            rule__ClassMatching__ExpressionMatchingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__Group__0__Impl"


    // $ANTLR start "rule__ClassMatching__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2158:1: rule__ClassMatching__Group__1 : rule__ClassMatching__Group__1__Impl ;
    public final void rule__ClassMatching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2162:1: ( rule__ClassMatching__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2163:2: rule__ClassMatching__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__14531);
            rule__ClassMatching__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__Group__1"


    // $ANTLR start "rule__ClassMatching__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2169:1: rule__ClassMatching__Group__1__Impl : ( ( rule__ClassMatching__ParameterAssignment_1 ) ) ;
    public final void rule__ClassMatching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2173:1: ( ( ( rule__ClassMatching__ParameterAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2174:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2174:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2175:1: ( rule__ClassMatching__ParameterAssignment_1 )
            {
             before(grammarAccess.getClassMatchingAccess().getParameterAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2176:1: ( rule__ClassMatching__ParameterAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2176:2: rule__ClassMatching__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl4558);
            rule__ClassMatching__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassMatchingAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__Group__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2190:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2194:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2195:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__04592);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__04595);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2202:1: rule__File__Group__0__Impl : ( 'file' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2206:1: ( ( 'file' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2207:1: ( 'file' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2207:1: ( 'file' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2208:1: 'file'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__File__Group__0__Impl4623); 
             after(grammarAccess.getFileAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2221:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2225:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2226:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__14654);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__14657);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2233:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2237:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2238:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2238:1: ( ( rule__File__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2239:1: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2240:1: ( rule__File__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2240:2: rule__File__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl4684);
            rule__File__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2250:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2254:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2255:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__24714);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__24717);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2262:1: rule__File__Group__2__Impl : ( '{' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2266:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2267:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2267:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2268:1: '{'
            {
             before(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__File__Group__2__Impl4745); 
             after(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2281:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2285:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2286:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__34776);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__4_in_rule__File__Group__34779);
            rule__File__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2293:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )? ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2297:1: ( ( ( rule__File__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2298:1: ( ( rule__File__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2298:1: ( ( rule__File__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2299:1: ( rule__File__Group_3__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2300:1: ( rule__File__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2300:2: rule__File__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl4806);
                    rule__File__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2310:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2314:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2315:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__44837);
            rule__File__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__5_in_rule__File__Group__44840);
            rule__File__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2322:1: rule__File__Group__4__Impl : ( ( rule__File__Group_4__0 )? ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2326:1: ( ( ( rule__File__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2327:1: ( ( rule__File__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2327:1: ( ( rule__File__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2328:1: ( rule__File__Group_4__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2329:1: ( rule__File__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2329:2: rule__File__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl4867);
                    rule__File__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2339:1: rule__File__Group__5 : rule__File__Group__5__Impl ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2343:1: ( rule__File__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2344:2: rule__File__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__54898);
            rule__File__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5"


    // $ANTLR start "rule__File__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2350:1: rule__File__Group__5__Impl : ( '}' ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2354:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2355:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2355:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2356:1: '}'
            {
             before(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__File__Group__5__Impl4926); 
             after(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__5__Impl"


    // $ANTLR start "rule__File__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2381:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2385:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2386:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__04969);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__04972);
            rule__File__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0"


    // $ANTLR start "rule__File__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2393:1: rule__File__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2397:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2398:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2398:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2399:1: 'matching'
            {
             before(grammarAccess.getFileAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__File__Group_3__0__Impl5000); 
             after(grammarAccess.getFileAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0__Impl"


    // $ANTLR start "rule__File__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2412:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl rule__File__Group_3__2 ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2416:1: ( rule__File__Group_3__1__Impl rule__File__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2417:2: rule__File__Group_3__1__Impl rule__File__Group_3__2
            {
            pushFollow(FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__15031);
            rule__File__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__15034);
            rule__File__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1"


    // $ANTLR start "rule__File__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2424:1: rule__File__Group_3__1__Impl : ( ( rule__File__MatchingAssignment_3_1 ) ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2428:1: ( ( ( rule__File__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2429:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2429:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2430:1: ( rule__File__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getFileAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2431:1: ( rule__File__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2431:2: rule__File__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl5061);
            rule__File__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1__Impl"


    // $ANTLR start "rule__File__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2441:1: rule__File__Group_3__2 : rule__File__Group_3__2__Impl ;
    public final void rule__File__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2445:1: ( rule__File__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2446:2: rule__File__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__25091);
            rule__File__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__2"


    // $ANTLR start "rule__File__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2452:1: rule__File__Group_3__2__Impl : ( ';' ) ;
    public final void rule__File__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2456:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2457:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2457:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2458:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__File__Group_3__2__Impl5119); 
             after(grammarAccess.getFileAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__2__Impl"


    // $ANTLR start "rule__File__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2477:1: rule__File__Group_4__0 : rule__File__Group_4__0__Impl rule__File__Group_4__1 ;
    public final void rule__File__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2481:1: ( rule__File__Group_4__0__Impl rule__File__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2482:2: rule__File__Group_4__0__Impl rule__File__Group_4__1
            {
            pushFollow(FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__05156);
            rule__File__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__05159);
            rule__File__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__0"


    // $ANTLR start "rule__File__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2489:1: rule__File__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__File__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2493:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2494:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2494:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2495:1: 'cardinality'
            {
             before(grammarAccess.getFileAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__File__Group_4__0__Impl5187); 
             after(grammarAccess.getFileAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__0__Impl"


    // $ANTLR start "rule__File__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2508:1: rule__File__Group_4__1 : rule__File__Group_4__1__Impl rule__File__Group_4__2 ;
    public final void rule__File__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2512:1: ( rule__File__Group_4__1__Impl rule__File__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2513:2: rule__File__Group_4__1__Impl rule__File__Group_4__2
            {
            pushFollow(FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__15218);
            rule__File__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__15221);
            rule__File__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__1"


    // $ANTLR start "rule__File__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2520:1: rule__File__Group_4__1__Impl : ( ( rule__File__CardinalityAssignment_4_1 ) ) ;
    public final void rule__File__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2524:1: ( ( ( rule__File__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2525:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2525:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2526:1: ( rule__File__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getFileAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2527:1: ( rule__File__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2527:2: rule__File__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl5248);
            rule__File__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__1__Impl"


    // $ANTLR start "rule__File__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2537:1: rule__File__Group_4__2 : rule__File__Group_4__2__Impl ;
    public final void rule__File__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2541:1: ( rule__File__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2542:2: rule__File__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__25278);
            rule__File__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__2"


    // $ANTLR start "rule__File__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2548:1: rule__File__Group_4__2__Impl : ( ';' ) ;
    public final void rule__File__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2552:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2553:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2553:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2554:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__File__Group_4__2__Impl5306); 
             after(grammarAccess.getFileAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_4__2__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2573:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2577:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2578:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__05343);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__05346);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2585:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2589:1: ( ( 'configuration' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2590:1: ( 'configuration' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2590:1: ( 'configuration' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2591:1: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__Configuration__Group__0__Impl5374); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2604:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2608:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2609:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__15405);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__15408);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2616:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2620:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2621:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2621:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2622:1: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2623:1: ( rule__Configuration__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2623:2: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl5435);
            rule__Configuration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2633:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2637:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2638:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__25465);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__25468);
            rule__Configuration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2645:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2649:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2650:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2650:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2651:1: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Configuration__Group__2__Impl5496); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2664:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2668:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2669:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__35527);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__35530);
            rule__Configuration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3"


    // $ANTLR start "rule__Configuration__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2676:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2680:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2681:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2681:1: ( ( rule__Configuration__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2682:1: ( rule__Configuration__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2683:1: ( rule__Configuration__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2683:2: rule__Configuration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl5557);
                    rule__Configuration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__3__Impl"


    // $ANTLR start "rule__Configuration__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2693:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2697:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2698:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__45588);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__45591);
            rule__Configuration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4"


    // $ANTLR start "rule__Configuration__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2705:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__Group_4__0 )? ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2709:1: ( ( ( rule__Configuration__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2710:1: ( ( rule__Configuration__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2710:1: ( ( rule__Configuration__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2711:1: ( rule__Configuration__Group_4__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2712:1: ( rule__Configuration__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2712:2: rule__Configuration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl5618);
                    rule__Configuration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__4__Impl"


    // $ANTLR start "rule__Configuration__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2722:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2726:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2727:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__55649);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__55652);
            rule__Configuration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5"


    // $ANTLR start "rule__Configuration__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2734:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2738:1: ( ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2739:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2739:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2740:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2741:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50||LA25_0==53||(LA25_0>=61 && LA25_0<=62)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2741:2: rule__Configuration__ConfigurationElementAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl5679);
            	    rule__Configuration__ConfigurationElementAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getConfigurationElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__5__Impl"


    // $ANTLR start "rule__Configuration__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2751:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2755:1: ( rule__Configuration__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2756:2: rule__Configuration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__65710);
            rule__Configuration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6"


    // $ANTLR start "rule__Configuration__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2762:1: rule__Configuration__Group__6__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2766:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2767:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2767:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2768:1: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__Configuration__Group__6__Impl5738); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__6__Impl"


    // $ANTLR start "rule__Configuration__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2795:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2799:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2800:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__05783);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__05786);
            rule__Configuration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0"


    // $ANTLR start "rule__Configuration__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2807:1: rule__Configuration__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2811:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2812:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2812:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2813:1: 'matching'
            {
             before(grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Configuration__Group_3__0__Impl5814); 
             after(grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__0__Impl"


    // $ANTLR start "rule__Configuration__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2826:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2830:1: ( rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2831:2: rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__15845);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__15848);
            rule__Configuration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1"


    // $ANTLR start "rule__Configuration__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2838:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__MatchingAssignment_3_1 ) ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2842:1: ( ( ( rule__Configuration__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2843:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2843:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2844:1: ( rule__Configuration__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2845:1: ( rule__Configuration__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2845:2: rule__Configuration__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl5875);
            rule__Configuration__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__1__Impl"


    // $ANTLR start "rule__Configuration__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2855:1: rule__Configuration__Group_3__2 : rule__Configuration__Group_3__2__Impl ;
    public final void rule__Configuration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2859:1: ( rule__Configuration__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2860:2: rule__Configuration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__25905);
            rule__Configuration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__2"


    // $ANTLR start "rule__Configuration__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2866:1: rule__Configuration__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2870:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2871:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2871:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2872:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__Configuration__Group_3__2__Impl5933); 
             after(grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_3__2__Impl"


    // $ANTLR start "rule__Configuration__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2891:1: rule__Configuration__Group_4__0 : rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 ;
    public final void rule__Configuration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2895:1: ( rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2896:2: rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__05970);
            rule__Configuration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__05973);
            rule__Configuration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__0"


    // $ANTLR start "rule__Configuration__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2903:1: rule__Configuration__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Configuration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2907:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2908:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2908:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2909:1: 'cardinality'
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Configuration__Group_4__0__Impl6001); 
             after(grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__0__Impl"


    // $ANTLR start "rule__Configuration__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2922:1: rule__Configuration__Group_4__1 : rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 ;
    public final void rule__Configuration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2926:1: ( rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2927:2: rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__16032);
            rule__Configuration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__16035);
            rule__Configuration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__1"


    // $ANTLR start "rule__Configuration__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2934:1: rule__Configuration__Group_4__1__Impl : ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Configuration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2938:1: ( ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2939:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2939:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2940:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2941:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2941:2: rule__Configuration__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl6062);
            rule__Configuration__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__1__Impl"


    // $ANTLR start "rule__Configuration__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2951:1: rule__Configuration__Group_4__2 : rule__Configuration__Group_4__2__Impl ;
    public final void rule__Configuration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2955:1: ( rule__Configuration__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2956:2: rule__Configuration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__26092);
            rule__Configuration__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__2"


    // $ANTLR start "rule__Configuration__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2962:1: rule__Configuration__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2966:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2967:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2967:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2968:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__Configuration__Group_4__2__Impl6120); 
             after(grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_4__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2987:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2991:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2992:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__06157);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06160);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2999:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3003:1: ( ( 'method' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3004:1: ( 'method' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3004:1: ( 'method' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3005:1: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Method__Group__0__Impl6188); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3018:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3022:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3023:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16219);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16222);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3030:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3034:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3035:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3035:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3036:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3037:1: ( rule__Method__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3037:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6249);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3047:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3051:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3052:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26279);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26282);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3059:1: rule__Method__Group__2__Impl : ( '{' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3063:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3064:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3064:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3065:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Method__Group__2__Impl6310); 
             after(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3078:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3082:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3083:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36341);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36344);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3090:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3094:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3095:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3095:1: ( ( rule__Method__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3096:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3097:1: ( rule__Method__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3097:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6371);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3107:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3111:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3112:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46402);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46405);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3119:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3123:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3124:1: ( ( rule__Method__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3124:1: ( ( rule__Method__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3125:1: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3126:1: ( rule__Method__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3126:2: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl6432);
                    rule__Method__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3136:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3140:1: ( rule__Method__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3141:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56463);
            rule__Method__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3147:1: rule__Method__Group__5__Impl : ( '}' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3151:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3152:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3152:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3153:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__Method__Group__5__Impl6491); 
             after(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3178:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3182:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3183:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06534);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06537);
            rule__Method__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3190:1: rule__Method__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3194:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3195:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3195:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3196:1: 'matching'
            {
             before(grammarAccess.getMethodAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Method__Group_3__0__Impl6565); 
             after(grammarAccess.getMethodAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3209:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl rule__Method__Group_3__2 ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3213:1: ( rule__Method__Group_3__1__Impl rule__Method__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3214:2: rule__Method__Group_3__1__Impl rule__Method__Group_3__2
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16596);
            rule__Method__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__16599);
            rule__Method__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3221:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__MatchingAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3225:1: ( ( ( rule__Method__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3226:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3226:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3227:1: ( rule__Method__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3228:1: ( rule__Method__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3228:2: rule__Method__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl6626);
            rule__Method__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3238:1: rule__Method__Group_3__2 : rule__Method__Group_3__2__Impl ;
    public final void rule__Method__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3242:1: ( rule__Method__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3243:2: rule__Method__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__26656);
            rule__Method__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__2"


    // $ANTLR start "rule__Method__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3249:1: rule__Method__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3253:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3254:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3254:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3255:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__Method__Group_3__2__Impl6684); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_3__2__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3274:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3278:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3279:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__06721);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__06724);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3286:1: rule__Method__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3290:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3291:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3291:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3292:1: 'cardinality'
            {
             before(grammarAccess.getMethodAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Method__Group_4__0__Impl6752); 
             after(grammarAccess.getMethodAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3305:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl rule__Method__Group_4__2 ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3309:1: ( rule__Method__Group_4__1__Impl rule__Method__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3310:2: rule__Method__Group_4__1__Impl rule__Method__Group_4__2
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__16783);
            rule__Method__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__16786);
            rule__Method__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3317:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3321:1: ( ( ( rule__Method__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3322:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3322:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3323:1: ( rule__Method__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3324:1: ( rule__Method__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3324:2: rule__Method__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl6813);
            rule__Method__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3334:1: rule__Method__Group_4__2 : rule__Method__Group_4__2__Impl ;
    public final void rule__Method__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3338:1: ( rule__Method__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3339:2: rule__Method__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__26843);
            rule__Method__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__2"


    // $ANTLR start "rule__Method__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3345:1: rule__Method__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3349:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3350:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3350:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3351:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__Method__Group_4__2__Impl6871); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__2__Impl"


    // $ANTLR start "rule__MetaClass__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3370:1: rule__MetaClass__Group__0 : rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 ;
    public final void rule__MetaClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3374:1: ( rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3375:2: rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__06908);
            rule__MetaClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__06911);
            rule__MetaClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__0"


    // $ANTLR start "rule__MetaClass__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3382:1: rule__MetaClass__Group__0__Impl : ( 'meta-class' ) ;
    public final void rule__MetaClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3386:1: ( ( 'meta-class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3387:1: ( 'meta-class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3387:1: ( 'meta-class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3388:1: 'meta-class'
            {
             before(grammarAccess.getMetaClassAccess().getMetaClassKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__MetaClass__Group__0__Impl6939); 
             after(grammarAccess.getMetaClassAccess().getMetaClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__0__Impl"


    // $ANTLR start "rule__MetaClass__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3401:1: rule__MetaClass__Group__1 : rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 ;
    public final void rule__MetaClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3405:1: ( rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3406:2: rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__16970);
            rule__MetaClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__16973);
            rule__MetaClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__1"


    // $ANTLR start "rule__MetaClass__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3413:1: rule__MetaClass__Group__1__Impl : ( ( rule__MetaClass__NameAssignment_1 ) ) ;
    public final void rule__MetaClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3417:1: ( ( ( rule__MetaClass__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3418:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3418:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3419:1: ( rule__MetaClass__NameAssignment_1 )
            {
             before(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3420:1: ( rule__MetaClass__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3420:2: rule__MetaClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl7000);
            rule__MetaClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__1__Impl"


    // $ANTLR start "rule__MetaClass__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3430:1: rule__MetaClass__Group__2 : rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 ;
    public final void rule__MetaClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3434:1: ( rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3435:2: rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__27030);
            rule__MetaClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__27033);
            rule__MetaClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__2"


    // $ANTLR start "rule__MetaClass__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3442:1: rule__MetaClass__Group__2__Impl : ( ( rule__MetaClass__Group_2__0 )? ) ;
    public final void rule__MetaClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3446:1: ( ( ( rule__MetaClass__Group_2__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3447:1: ( ( rule__MetaClass__Group_2__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3447:1: ( ( rule__MetaClass__Group_2__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3448:1: ( rule__MetaClass__Group_2__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3449:1: ( rule__MetaClass__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3449:2: rule__MetaClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_2__0_in_rule__MetaClass__Group__2__Impl7060);
                    rule__MetaClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__2__Impl"


    // $ANTLR start "rule__MetaClass__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3459:1: rule__MetaClass__Group__3 : rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 ;
    public final void rule__MetaClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3463:1: ( rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3464:2: rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__37091);
            rule__MetaClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__37094);
            rule__MetaClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__3"


    // $ANTLR start "rule__MetaClass__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3471:1: rule__MetaClass__Group__3__Impl : ( '{' ) ;
    public final void rule__MetaClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3475:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3476:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3476:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3477:1: '{'
            {
             before(grammarAccess.getMetaClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__MetaClass__Group__3__Impl7122); 
             after(grammarAccess.getMetaClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__3__Impl"


    // $ANTLR start "rule__MetaClass__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3490:1: rule__MetaClass__Group__4 : rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 ;
    public final void rule__MetaClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3494:1: ( rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3495:2: rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__47153);
            rule__MetaClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__47156);
            rule__MetaClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__4"


    // $ANTLR start "rule__MetaClass__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3502:1: rule__MetaClass__Group__4__Impl : ( ( rule__MetaClass__Group_4__0 )? ) ;
    public final void rule__MetaClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3506:1: ( ( ( rule__MetaClass__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3507:1: ( ( rule__MetaClass__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3507:1: ( ( rule__MetaClass__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3508:1: ( rule__MetaClass__Group_4__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3509:1: ( rule__MetaClass__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==57) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3509:2: rule__MetaClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_4__0_in_rule__MetaClass__Group__4__Impl7183);
                    rule__MetaClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__4__Impl"


    // $ANTLR start "rule__MetaClass__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3519:1: rule__MetaClass__Group__5 : rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 ;
    public final void rule__MetaClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3523:1: ( rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3524:2: rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__57214);
            rule__MetaClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__57217);
            rule__MetaClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__5"


    // $ANTLR start "rule__MetaClass__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3531:1: rule__MetaClass__Group__5__Impl : ( ( rule__MetaClass__Group_5__0 )? ) ;
    public final void rule__MetaClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3535:1: ( ( ( rule__MetaClass__Group_5__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3536:1: ( ( rule__MetaClass__Group_5__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3536:1: ( ( rule__MetaClass__Group_5__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3537:1: ( rule__MetaClass__Group_5__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3538:1: ( rule__MetaClass__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==58) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3538:2: rule__MetaClass__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_5__0_in_rule__MetaClass__Group__5__Impl7244);
                    rule__MetaClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__5__Impl"


    // $ANTLR start "rule__MetaClass__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3548:1: rule__MetaClass__Group__6 : rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 ;
    public final void rule__MetaClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3552:1: ( rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3553:2: rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__67275);
            rule__MetaClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__67278);
            rule__MetaClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__6"


    // $ANTLR start "rule__MetaClass__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3560:1: rule__MetaClass__Group__6__Impl : ( ( rule__MetaClass__Group_6__0 )? ) ;
    public final void rule__MetaClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3564:1: ( ( ( rule__MetaClass__Group_6__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3565:1: ( ( rule__MetaClass__Group_6__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3565:1: ( ( rule__MetaClass__Group_6__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3566:1: ( rule__MetaClass__Group_6__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3567:1: ( rule__MetaClass__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3567:2: rule__MetaClass__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_6__0_in_rule__MetaClass__Group__6__Impl7305);
                    rule__MetaClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__6__Impl"


    // $ANTLR start "rule__MetaClass__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3577:1: rule__MetaClass__Group__7 : rule__MetaClass__Group__7__Impl rule__MetaClass__Group__8 ;
    public final void rule__MetaClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3581:1: ( rule__MetaClass__Group__7__Impl rule__MetaClass__Group__8 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3582:2: rule__MetaClass__Group__7__Impl rule__MetaClass__Group__8
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__77336);
            rule__MetaClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__8_in_rule__MetaClass__Group__77339);
            rule__MetaClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__7"


    // $ANTLR start "rule__MetaClass__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3589:1: rule__MetaClass__Group__7__Impl : ( ( rule__MetaClass__MethodsAssignment_7 )* ) ;
    public final void rule__MetaClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3593:1: ( ( ( rule__MetaClass__MethodsAssignment_7 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3594:1: ( ( rule__MetaClass__MethodsAssignment_7 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3594:1: ( ( rule__MetaClass__MethodsAssignment_7 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3595:1: ( rule__MetaClass__MethodsAssignment_7 )*
            {
             before(grammarAccess.getMetaClassAccess().getMethodsAssignment_7()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3596:1: ( rule__MetaClass__MethodsAssignment_7 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==54) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3596:2: rule__MetaClass__MethodsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__MetaClass__MethodsAssignment_7_in_rule__MetaClass__Group__7__Impl7366);
            	    rule__MetaClass__MethodsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMetaClassAccess().getMethodsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__7__Impl"


    // $ANTLR start "rule__MetaClass__Group__8"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3606:1: rule__MetaClass__Group__8 : rule__MetaClass__Group__8__Impl ;
    public final void rule__MetaClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3610:1: ( rule__MetaClass__Group__8__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3611:2: rule__MetaClass__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__8__Impl_in_rule__MetaClass__Group__87397);
            rule__MetaClass__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__8"


    // $ANTLR start "rule__MetaClass__Group__8__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3617:1: rule__MetaClass__Group__8__Impl : ( '}' ) ;
    public final void rule__MetaClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3621:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3622:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3622:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3623:1: '}'
            {
             before(grammarAccess.getMetaClassAccess().getRightCurlyBracketKeyword_8()); 
            match(input,42,FOLLOW_42_in_rule__MetaClass__Group__8__Impl7425); 
             after(grammarAccess.getMetaClassAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__8__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3654:1: rule__MetaClass__Group_2__0 : rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 ;
    public final void rule__MetaClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3658:1: ( rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3659:2: rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_2__0__Impl_in_rule__MetaClass__Group_2__07474);
            rule__MetaClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_2__1_in_rule__MetaClass__Group_2__07477);
            rule__MetaClass__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__0"


    // $ANTLR start "rule__MetaClass__Group_2__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3666:1: rule__MetaClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MetaClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3670:1: ( ( 'extends' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3671:1: ( 'extends' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3671:1: ( 'extends' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3672:1: 'extends'
            {
             before(grammarAccess.getMetaClassAccess().getExtendsKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__MetaClass__Group_2__0__Impl7505); 
             after(grammarAccess.getMetaClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3685:1: rule__MetaClass__Group_2__1 : rule__MetaClass__Group_2__1__Impl ;
    public final void rule__MetaClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3689:1: ( rule__MetaClass__Group_2__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3690:2: rule__MetaClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_2__1__Impl_in_rule__MetaClass__Group_2__17536);
            rule__MetaClass__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__1"


    // $ANTLR start "rule__MetaClass__Group_2__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3696:1: rule__MetaClass__Group_2__1__Impl : ( ( rule__MetaClass__ExtendsAssignment_2_1 ) ) ;
    public final void rule__MetaClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3700:1: ( ( ( rule__MetaClass__ExtendsAssignment_2_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3701:1: ( ( rule__MetaClass__ExtendsAssignment_2_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3701:1: ( ( rule__MetaClass__ExtendsAssignment_2_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3702:1: ( rule__MetaClass__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getMetaClassAccess().getExtendsAssignment_2_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3703:1: ( rule__MetaClass__ExtendsAssignment_2_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3703:2: rule__MetaClass__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MetaClass__ExtendsAssignment_2_1_in_rule__MetaClass__Group_2__1__Impl7563);
            rule__MetaClass__ExtendsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3717:1: rule__MetaClass__Group_4__0 : rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1 ;
    public final void rule__MetaClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3721:1: ( rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3722:2: rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__0__Impl_in_rule__MetaClass__Group_4__07597);
            rule__MetaClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_4__1_in_rule__MetaClass__Group_4__07600);
            rule__MetaClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__0"


    // $ANTLR start "rule__MetaClass__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3729:1: rule__MetaClass__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__MetaClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3733:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3734:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3734:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3735:1: 'description'
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionKeyword_4_0()); 
            match(input,57,FOLLOW_57_in_rule__MetaClass__Group_4__0__Impl7628); 
             after(grammarAccess.getMetaClassAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3748:1: rule__MetaClass__Group_4__1 : rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2 ;
    public final void rule__MetaClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3752:1: ( rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3753:2: rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__1__Impl_in_rule__MetaClass__Group_4__17659);
            rule__MetaClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_4__2_in_rule__MetaClass__Group_4__17662);
            rule__MetaClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__1"


    // $ANTLR start "rule__MetaClass__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3760:1: rule__MetaClass__Group_4__1__Impl : ( ( rule__MetaClass__DescriptionAssignment_4_1 ) ) ;
    public final void rule__MetaClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3764:1: ( ( ( rule__MetaClass__DescriptionAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3765:1: ( ( rule__MetaClass__DescriptionAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3765:1: ( ( rule__MetaClass__DescriptionAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3766:1: ( rule__MetaClass__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3767:1: ( rule__MetaClass__DescriptionAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3767:2: rule__MetaClass__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetaClass__DescriptionAssignment_4_1_in_rule__MetaClass__Group_4__1__Impl7689);
            rule__MetaClass__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3777:1: rule__MetaClass__Group_4__2 : rule__MetaClass__Group_4__2__Impl ;
    public final void rule__MetaClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3781:1: ( rule__MetaClass__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3782:2: rule__MetaClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__2__Impl_in_rule__MetaClass__Group_4__27719);
            rule__MetaClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__2"


    // $ANTLR start "rule__MetaClass__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3788:1: rule__MetaClass__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3792:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3793:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3793:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3794:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__MetaClass__Group_4__2__Impl7747); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_4__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_5__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3813:1: rule__MetaClass__Group_5__0 : rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1 ;
    public final void rule__MetaClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3817:1: ( rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3818:2: rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__0__Impl_in_rule__MetaClass__Group_5__07784);
            rule__MetaClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_5__1_in_rule__MetaClass__Group_5__07787);
            rule__MetaClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__0"


    // $ANTLR start "rule__MetaClass__Group_5__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3825:1: rule__MetaClass__Group_5__0__Impl : ( 'matching:' ) ;
    public final void rule__MetaClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3829:1: ( ( 'matching:' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3830:1: ( 'matching:' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3830:1: ( 'matching:' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3831:1: 'matching:'
            {
             before(grammarAccess.getMetaClassAccess().getMatchingKeyword_5_0()); 
            match(input,58,FOLLOW_58_in_rule__MetaClass__Group_5__0__Impl7815); 
             after(grammarAccess.getMetaClassAccess().getMatchingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_5__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3844:1: rule__MetaClass__Group_5__1 : rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2 ;
    public final void rule__MetaClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3848:1: ( rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3849:2: rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__1__Impl_in_rule__MetaClass__Group_5__17846);
            rule__MetaClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_5__2_in_rule__MetaClass__Group_5__17849);
            rule__MetaClass__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__1"


    // $ANTLR start "rule__MetaClass__Group_5__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3856:1: rule__MetaClass__Group_5__1__Impl : ( ( rule__MetaClass__MatchingAssignment_5_1 ) ) ;
    public final void rule__MetaClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3860:1: ( ( ( rule__MetaClass__MatchingAssignment_5_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3861:1: ( ( rule__MetaClass__MatchingAssignment_5_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3861:1: ( ( rule__MetaClass__MatchingAssignment_5_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3862:1: ( rule__MetaClass__MatchingAssignment_5_1 )
            {
             before(grammarAccess.getMetaClassAccess().getMatchingAssignment_5_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3863:1: ( rule__MetaClass__MatchingAssignment_5_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3863:2: rule__MetaClass__MatchingAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MetaClass__MatchingAssignment_5_1_in_rule__MetaClass__Group_5__1__Impl7876);
            rule__MetaClass__MatchingAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getMatchingAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_5__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3873:1: rule__MetaClass__Group_5__2 : rule__MetaClass__Group_5__2__Impl ;
    public final void rule__MetaClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3877:1: ( rule__MetaClass__Group_5__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3878:2: rule__MetaClass__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__2__Impl_in_rule__MetaClass__Group_5__27906);
            rule__MetaClass__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__2"


    // $ANTLR start "rule__MetaClass__Group_5__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3884:1: rule__MetaClass__Group_5__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3888:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3889:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3889:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3890:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_5_2()); 
            match(input,44,FOLLOW_44_in_rule__MetaClass__Group_5__2__Impl7934); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_5__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3909:1: rule__MetaClass__Group_6__0 : rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1 ;
    public final void rule__MetaClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3913:1: ( rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3914:2: rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_6__0__Impl_in_rule__MetaClass__Group_6__07971);
            rule__MetaClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_6__1_in_rule__MetaClass__Group_6__07974);
            rule__MetaClass__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__0"


    // $ANTLR start "rule__MetaClass__Group_6__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3921:1: rule__MetaClass__Group_6__0__Impl : ( 'cardinality' ) ;
    public final void rule__MetaClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3925:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3926:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3926:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3927:1: 'cardinality'
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityKeyword_6_0()); 
            match(input,52,FOLLOW_52_in_rule__MetaClass__Group_6__0__Impl8002); 
             after(grammarAccess.getMetaClassAccess().getCardinalityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3940:1: rule__MetaClass__Group_6__1 : rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2 ;
    public final void rule__MetaClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3944:1: ( rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3945:2: rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_6__1__Impl_in_rule__MetaClass__Group_6__18033);
            rule__MetaClass__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_6__2_in_rule__MetaClass__Group_6__18036);
            rule__MetaClass__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__1"


    // $ANTLR start "rule__MetaClass__Group_6__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3952:1: rule__MetaClass__Group_6__1__Impl : ( ( rule__MetaClass__CardinalityAssignment_6_1 ) ) ;
    public final void rule__MetaClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3956:1: ( ( ( rule__MetaClass__CardinalityAssignment_6_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3957:1: ( ( rule__MetaClass__CardinalityAssignment_6_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3957:1: ( ( rule__MetaClass__CardinalityAssignment_6_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3958:1: ( rule__MetaClass__CardinalityAssignment_6_1 )
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityAssignment_6_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3959:1: ( rule__MetaClass__CardinalityAssignment_6_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3959:2: rule__MetaClass__CardinalityAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MetaClass__CardinalityAssignment_6_1_in_rule__MetaClass__Group_6__1__Impl8063);
            rule__MetaClass__CardinalityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getCardinalityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3969:1: rule__MetaClass__Group_6__2 : rule__MetaClass__Group_6__2__Impl ;
    public final void rule__MetaClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3973:1: ( rule__MetaClass__Group_6__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3974:2: rule__MetaClass__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_6__2__Impl_in_rule__MetaClass__Group_6__28093);
            rule__MetaClass__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__2"


    // $ANTLR start "rule__MetaClass__Group_6__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3980:1: rule__MetaClass__Group_6__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3984:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3985:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3985:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3986:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2()); 
            match(input,44,FOLLOW_44_in_rule__MetaClass__Group_6__2__Impl8121); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__2__Impl"


    // $ANTLR start "rule__ExternalClass__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4005:1: rule__ExternalClass__Group__0 : rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1 ;
    public final void rule__ExternalClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4009:1: ( rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4010:2: rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__0__Impl_in_rule__ExternalClass__Group__08158);
            rule__ExternalClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__1_in_rule__ExternalClass__Group__08161);
            rule__ExternalClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__0"


    // $ANTLR start "rule__ExternalClass__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4017:1: rule__ExternalClass__Group__0__Impl : ( 'external-class' ) ;
    public final void rule__ExternalClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4021:1: ( ( 'external-class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4022:1: ( 'external-class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4022:1: ( 'external-class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4023:1: 'external-class'
            {
             before(grammarAccess.getExternalClassAccess().getExternalClassKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__ExternalClass__Group__0__Impl8189); 
             after(grammarAccess.getExternalClassAccess().getExternalClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__0__Impl"


    // $ANTLR start "rule__ExternalClass__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4036:1: rule__ExternalClass__Group__1 : rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2 ;
    public final void rule__ExternalClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4040:1: ( rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4041:2: rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__1__Impl_in_rule__ExternalClass__Group__18220);
            rule__ExternalClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__2_in_rule__ExternalClass__Group__18223);
            rule__ExternalClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__1"


    // $ANTLR start "rule__ExternalClass__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4048:1: rule__ExternalClass__Group__1__Impl : ( ( rule__ExternalClass__NameAssignment_1 ) ) ;
    public final void rule__ExternalClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4052:1: ( ( ( rule__ExternalClass__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4053:1: ( ( rule__ExternalClass__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4053:1: ( ( rule__ExternalClass__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4054:1: ( rule__ExternalClass__NameAssignment_1 )
            {
             before(grammarAccess.getExternalClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4055:1: ( rule__ExternalClass__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4055:2: rule__ExternalClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__NameAssignment_1_in_rule__ExternalClass__Group__1__Impl8250);
            rule__ExternalClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__1__Impl"


    // $ANTLR start "rule__ExternalClass__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4065:1: rule__ExternalClass__Group__2 : rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3 ;
    public final void rule__ExternalClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4069:1: ( rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4070:2: rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__2__Impl_in_rule__ExternalClass__Group__28280);
            rule__ExternalClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__3_in_rule__ExternalClass__Group__28283);
            rule__ExternalClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__2"


    // $ANTLR start "rule__ExternalClass__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4077:1: rule__ExternalClass__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4081:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4082:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4082:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4083:1: '{'
            {
             before(grammarAccess.getExternalClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__ExternalClass__Group__2__Impl8311); 
             after(grammarAccess.getExternalClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__2__Impl"


    // $ANTLR start "rule__ExternalClass__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4096:1: rule__ExternalClass__Group__3 : rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4 ;
    public final void rule__ExternalClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4100:1: ( rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4101:2: rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__3__Impl_in_rule__ExternalClass__Group__38342);
            rule__ExternalClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__4_in_rule__ExternalClass__Group__38345);
            rule__ExternalClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__3"


    // $ANTLR start "rule__ExternalClass__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4108:1: rule__ExternalClass__Group__3__Impl : ( ( rule__ExternalClass__Group_3__0 )? ) ;
    public final void rule__ExternalClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4112:1: ( ( ( rule__ExternalClass__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4113:1: ( ( rule__ExternalClass__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4113:1: ( ( rule__ExternalClass__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4114:1: ( rule__ExternalClass__Group_3__0 )?
            {
             before(grammarAccess.getExternalClassAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4115:1: ( rule__ExternalClass__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4115:2: rule__ExternalClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExternalClass__Group_3__0_in_rule__ExternalClass__Group__3__Impl8372);
                    rule__ExternalClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__3__Impl"


    // $ANTLR start "rule__ExternalClass__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4125:1: rule__ExternalClass__Group__4 : rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5 ;
    public final void rule__ExternalClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4129:1: ( rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4130:2: rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__4__Impl_in_rule__ExternalClass__Group__48403);
            rule__ExternalClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__5_in_rule__ExternalClass__Group__48406);
            rule__ExternalClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__4"


    // $ANTLR start "rule__ExternalClass__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4137:1: rule__ExternalClass__Group__4__Impl : ( ( rule__ExternalClass__Group_4__0 )? ) ;
    public final void rule__ExternalClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4141:1: ( ( ( rule__ExternalClass__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4142:1: ( ( rule__ExternalClass__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4142:1: ( ( rule__ExternalClass__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4143:1: ( rule__ExternalClass__Group_4__0 )?
            {
             before(grammarAccess.getExternalClassAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4144:1: ( rule__ExternalClass__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4144:2: rule__ExternalClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExternalClass__Group_4__0_in_rule__ExternalClass__Group__4__Impl8433);
                    rule__ExternalClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__4__Impl"


    // $ANTLR start "rule__ExternalClass__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4154:1: rule__ExternalClass__Group__5 : rule__ExternalClass__Group__5__Impl ;
    public final void rule__ExternalClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4158:1: ( rule__ExternalClass__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4159:2: rule__ExternalClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__5__Impl_in_rule__ExternalClass__Group__58464);
            rule__ExternalClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__5"


    // $ANTLR start "rule__ExternalClass__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4165:1: rule__ExternalClass__Group__5__Impl : ( '}' ) ;
    public final void rule__ExternalClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4169:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4170:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4170:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4171:1: '}'
            {
             before(grammarAccess.getExternalClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__ExternalClass__Group__5__Impl8492); 
             after(grammarAccess.getExternalClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group__5__Impl"


    // $ANTLR start "rule__ExternalClass__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4196:1: rule__ExternalClass__Group_3__0 : rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1 ;
    public final void rule__ExternalClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4200:1: ( rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4201:2: rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__0__Impl_in_rule__ExternalClass__Group_3__08535);
            rule__ExternalClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_3__1_in_rule__ExternalClass__Group_3__08538);
            rule__ExternalClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__0"


    // $ANTLR start "rule__ExternalClass__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4208:1: rule__ExternalClass__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__ExternalClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4212:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4213:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4213:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4214:1: 'description'
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionKeyword_3_0()); 
            match(input,57,FOLLOW_57_in_rule__ExternalClass__Group_3__0__Impl8566); 
             after(grammarAccess.getExternalClassAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__0__Impl"


    // $ANTLR start "rule__ExternalClass__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4227:1: rule__ExternalClass__Group_3__1 : rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2 ;
    public final void rule__ExternalClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4231:1: ( rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4232:2: rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__1__Impl_in_rule__ExternalClass__Group_3__18597);
            rule__ExternalClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_3__2_in_rule__ExternalClass__Group_3__18600);
            rule__ExternalClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__1"


    // $ANTLR start "rule__ExternalClass__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4239:1: rule__ExternalClass__Group_3__1__Impl : ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ExternalClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4243:1: ( ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4244:1: ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4244:1: ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4245:1: ( rule__ExternalClass__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4246:1: ( rule__ExternalClass__DescriptionAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4246:2: rule__ExternalClass__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__DescriptionAssignment_3_1_in_rule__ExternalClass__Group_3__1__Impl8627);
            rule__ExternalClass__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalClassAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__1__Impl"


    // $ANTLR start "rule__ExternalClass__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4256:1: rule__ExternalClass__Group_3__2 : rule__ExternalClass__Group_3__2__Impl ;
    public final void rule__ExternalClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4260:1: ( rule__ExternalClass__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4261:2: rule__ExternalClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__2__Impl_in_rule__ExternalClass__Group_3__28657);
            rule__ExternalClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__2"


    // $ANTLR start "rule__ExternalClass__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4267:1: rule__ExternalClass__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ExternalClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4271:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4272:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4272:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4273:1: ';'
            {
             before(grammarAccess.getExternalClassAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__ExternalClass__Group_3__2__Impl8685); 
             after(grammarAccess.getExternalClassAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_3__2__Impl"


    // $ANTLR start "rule__ExternalClass__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4292:1: rule__ExternalClass__Group_4__0 : rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1 ;
    public final void rule__ExternalClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4296:1: ( rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4297:2: rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__0__Impl_in_rule__ExternalClass__Group_4__08722);
            rule__ExternalClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_4__1_in_rule__ExternalClass__Group_4__08725);
            rule__ExternalClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__0"


    // $ANTLR start "rule__ExternalClass__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4304:1: rule__ExternalClass__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__ExternalClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4308:1: ( ( 'type' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4309:1: ( 'type' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4309:1: ( 'type' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4310:1: 'type'
            {
             before(grammarAccess.getExternalClassAccess().getTypeKeyword_4_0()); 
            match(input,60,FOLLOW_60_in_rule__ExternalClass__Group_4__0__Impl8753); 
             after(grammarAccess.getExternalClassAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalClass__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4323:1: rule__ExternalClass__Group_4__1 : rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2 ;
    public final void rule__ExternalClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4327:1: ( rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4328:2: rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__1__Impl_in_rule__ExternalClass__Group_4__18784);
            rule__ExternalClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_4__2_in_rule__ExternalClass__Group_4__18787);
            rule__ExternalClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__1"


    // $ANTLR start "rule__ExternalClass__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4335:1: rule__ExternalClass__Group_4__1__Impl : ( ( rule__ExternalClass__TypeAssignment_4_1 ) ) ;
    public final void rule__ExternalClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4339:1: ( ( ( rule__ExternalClass__TypeAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4340:1: ( ( rule__ExternalClass__TypeAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4340:1: ( ( rule__ExternalClass__TypeAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4341:1: ( rule__ExternalClass__TypeAssignment_4_1 )
            {
             before(grammarAccess.getExternalClassAccess().getTypeAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4342:1: ( rule__ExternalClass__TypeAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4342:2: rule__ExternalClass__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__TypeAssignment_4_1_in_rule__ExternalClass__Group_4__1__Impl8814);
            rule__ExternalClass__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalClassAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalClass__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4352:1: rule__ExternalClass__Group_4__2 : rule__ExternalClass__Group_4__2__Impl ;
    public final void rule__ExternalClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4356:1: ( rule__ExternalClass__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4357:2: rule__ExternalClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__2__Impl_in_rule__ExternalClass__Group_4__28844);
            rule__ExternalClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__2"


    // $ANTLR start "rule__ExternalClass__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4363:1: rule__ExternalClass__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ExternalClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4367:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4368:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4368:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4369:1: ';'
            {
             before(grammarAccess.getExternalClassAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__ExternalClass__Group_4__2__Impl8872); 
             after(grammarAccess.getExternalClassAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__Group_4__2__Impl"


    // $ANTLR start "rule__XmlElement__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4388:1: rule__XmlElement__Group__0 : rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 ;
    public final void rule__XmlElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4392:1: ( rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4393:2: rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__08909);
            rule__XmlElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__08912);
            rule__XmlElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__0"


    // $ANTLR start "rule__XmlElement__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4400:1: rule__XmlElement__Group__0__Impl : ( 'xmlElement' ) ;
    public final void rule__XmlElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4404:1: ( ( 'xmlElement' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4405:1: ( 'xmlElement' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4405:1: ( 'xmlElement' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4406:1: 'xmlElement'
            {
             before(grammarAccess.getXmlElementAccess().getXmlElementKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__XmlElement__Group__0__Impl8940); 
             after(grammarAccess.getXmlElementAccess().getXmlElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__0__Impl"


    // $ANTLR start "rule__XmlElement__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4419:1: rule__XmlElement__Group__1 : rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 ;
    public final void rule__XmlElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4423:1: ( rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4424:2: rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__18971);
            rule__XmlElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__18974);
            rule__XmlElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__1"


    // $ANTLR start "rule__XmlElement__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4431:1: rule__XmlElement__Group__1__Impl : ( ( rule__XmlElement__NameAssignment_1 ) ) ;
    public final void rule__XmlElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4435:1: ( ( ( rule__XmlElement__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4436:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4436:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4437:1: ( rule__XmlElement__NameAssignment_1 )
            {
             before(grammarAccess.getXmlElementAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4438:1: ( rule__XmlElement__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4438:2: rule__XmlElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl9001);
            rule__XmlElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__1__Impl"


    // $ANTLR start "rule__XmlElement__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4448:1: rule__XmlElement__Group__2 : rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 ;
    public final void rule__XmlElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4452:1: ( rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4453:2: rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__29031);
            rule__XmlElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__29034);
            rule__XmlElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__2"


    // $ANTLR start "rule__XmlElement__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4460:1: rule__XmlElement__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4464:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4465:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4465:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4466:1: '{'
            {
             before(grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__XmlElement__Group__2__Impl9062); 
             after(grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__2__Impl"


    // $ANTLR start "rule__XmlElement__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4479:1: rule__XmlElement__Group__3 : rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 ;
    public final void rule__XmlElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4483:1: ( rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4484:2: rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__39093);
            rule__XmlElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__39096);
            rule__XmlElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__3"


    // $ANTLR start "rule__XmlElement__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4491:1: rule__XmlElement__Group__3__Impl : ( ( rule__XmlElement__Group_3__0 )? ) ;
    public final void rule__XmlElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4495:1: ( ( ( rule__XmlElement__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4496:1: ( ( rule__XmlElement__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4496:1: ( ( rule__XmlElement__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4497:1: ( rule__XmlElement__Group_3__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4498:1: ( rule__XmlElement__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4498:2: rule__XmlElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl9123);
                    rule__XmlElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__3__Impl"


    // $ANTLR start "rule__XmlElement__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4508:1: rule__XmlElement__Group__4 : rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 ;
    public final void rule__XmlElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4512:1: ( rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4513:2: rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__49154);
            rule__XmlElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__49157);
            rule__XmlElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__4"


    // $ANTLR start "rule__XmlElement__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4520:1: rule__XmlElement__Group__4__Impl : ( ( rule__XmlElement__Group_4__0 )? ) ;
    public final void rule__XmlElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4524:1: ( ( ( rule__XmlElement__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4525:1: ( ( rule__XmlElement__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4525:1: ( ( rule__XmlElement__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4526:1: ( rule__XmlElement__Group_4__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4527:1: ( rule__XmlElement__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4527:2: rule__XmlElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl9184);
                    rule__XmlElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__4__Impl"


    // $ANTLR start "rule__XmlElement__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4537:1: rule__XmlElement__Group__5 : rule__XmlElement__Group__5__Impl ;
    public final void rule__XmlElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4541:1: ( rule__XmlElement__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4542:2: rule__XmlElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__59215);
            rule__XmlElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__5"


    // $ANTLR start "rule__XmlElement__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4548:1: rule__XmlElement__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4552:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4553:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4553:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4554:1: '}'
            {
             before(grammarAccess.getXmlElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__XmlElement__Group__5__Impl9243); 
             after(grammarAccess.getXmlElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group__5__Impl"


    // $ANTLR start "rule__XmlElement__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4579:1: rule__XmlElement__Group_3__0 : rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 ;
    public final void rule__XmlElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4583:1: ( rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4584:2: rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__09286);
            rule__XmlElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__09289);
            rule__XmlElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__0"


    // $ANTLR start "rule__XmlElement__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4591:1: rule__XmlElement__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4595:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4596:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4596:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4597:1: 'matching'
            {
             before(grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlElement__Group_3__0__Impl9317); 
             after(grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__0__Impl"


    // $ANTLR start "rule__XmlElement__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4610:1: rule__XmlElement__Group_3__1 : rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 ;
    public final void rule__XmlElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4614:1: ( rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4615:2: rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19348);
            rule__XmlElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19351);
            rule__XmlElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__1"


    // $ANTLR start "rule__XmlElement__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4622:1: rule__XmlElement__Group_3__1__Impl : ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4626:1: ( ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4627:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4627:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4628:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlElementAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4629:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4629:2: rule__XmlElement__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9378);
            rule__XmlElement__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlElementAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__1__Impl"


    // $ANTLR start "rule__XmlElement__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4639:1: rule__XmlElement__Group_3__2 : rule__XmlElement__Group_3__2__Impl ;
    public final void rule__XmlElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4643:1: ( rule__XmlElement__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4644:2: rule__XmlElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29408);
            rule__XmlElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__2"


    // $ANTLR start "rule__XmlElement__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4650:1: rule__XmlElement__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4654:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4655:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4655:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4656:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__XmlElement__Group_3__2__Impl9436); 
             after(grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_3__2__Impl"


    // $ANTLR start "rule__XmlElement__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4675:1: rule__XmlElement__Group_4__0 : rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 ;
    public final void rule__XmlElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4679:1: ( rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4680:2: rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__09473);
            rule__XmlElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__09476);
            rule__XmlElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__0"


    // $ANTLR start "rule__XmlElement__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4687:1: rule__XmlElement__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4691:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4692:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4692:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4693:1: 'cardinality'
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__XmlElement__Group_4__0__Impl9504); 
             after(grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__0__Impl"


    // $ANTLR start "rule__XmlElement__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4706:1: rule__XmlElement__Group_4__1 : rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 ;
    public final void rule__XmlElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4710:1: ( rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4711:2: rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__19535);
            rule__XmlElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__19538);
            rule__XmlElement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__1"


    // $ANTLR start "rule__XmlElement__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4718:1: rule__XmlElement__Group_4__1__Impl : ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4722:1: ( ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4723:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4723:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4724:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4725:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4725:2: rule__XmlElement__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl9565);
            rule__XmlElement__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlElementAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__1__Impl"


    // $ANTLR start "rule__XmlElement__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4735:1: rule__XmlElement__Group_4__2 : rule__XmlElement__Group_4__2__Impl ;
    public final void rule__XmlElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4739:1: ( rule__XmlElement__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4740:2: rule__XmlElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__29595);
            rule__XmlElement__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__2"


    // $ANTLR start "rule__XmlElement__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4746:1: rule__XmlElement__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4750:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4751:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4751:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4752:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__XmlElement__Group_4__2__Impl9623); 
             after(grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__Group_4__2__Impl"


    // $ANTLR start "rule__XmlDocument__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4771:1: rule__XmlDocument__Group__0 : rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 ;
    public final void rule__XmlDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4775:1: ( rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4776:2: rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__09660);
            rule__XmlDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__09663);
            rule__XmlDocument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__0"


    // $ANTLR start "rule__XmlDocument__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4783:1: rule__XmlDocument__Group__0__Impl : ( 'xmlDocument' ) ;
    public final void rule__XmlDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4787:1: ( ( 'xmlDocument' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4788:1: ( 'xmlDocument' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4788:1: ( 'xmlDocument' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4789:1: 'xmlDocument'
            {
             before(grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__XmlDocument__Group__0__Impl9691); 
             after(grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__0__Impl"


    // $ANTLR start "rule__XmlDocument__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4802:1: rule__XmlDocument__Group__1 : rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 ;
    public final void rule__XmlDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4806:1: ( rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4807:2: rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__19722);
            rule__XmlDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__19725);
            rule__XmlDocument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__1"


    // $ANTLR start "rule__XmlDocument__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4814:1: rule__XmlDocument__Group__1__Impl : ( ( rule__XmlDocument__NameAssignment_1 ) ) ;
    public final void rule__XmlDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4818:1: ( ( ( rule__XmlDocument__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4819:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4819:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4820:1: ( rule__XmlDocument__NameAssignment_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4821:1: ( rule__XmlDocument__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4821:2: rule__XmlDocument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl9752);
            rule__XmlDocument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlDocumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__1__Impl"


    // $ANTLR start "rule__XmlDocument__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4831:1: rule__XmlDocument__Group__2 : rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 ;
    public final void rule__XmlDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4835:1: ( rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4836:2: rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__29782);
            rule__XmlDocument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__29785);
            rule__XmlDocument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__2"


    // $ANTLR start "rule__XmlDocument__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4843:1: rule__XmlDocument__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4847:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4848:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4848:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4849:1: '{'
            {
             before(grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__XmlDocument__Group__2__Impl9813); 
             after(grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__2__Impl"


    // $ANTLR start "rule__XmlDocument__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4862:1: rule__XmlDocument__Group__3 : rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 ;
    public final void rule__XmlDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4866:1: ( rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4867:2: rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__39844);
            rule__XmlDocument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__39847);
            rule__XmlDocument__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__3"


    // $ANTLR start "rule__XmlDocument__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4874:1: rule__XmlDocument__Group__3__Impl : ( ( rule__XmlDocument__Group_3__0 )? ) ;
    public final void rule__XmlDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4878:1: ( ( ( rule__XmlDocument__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4879:1: ( ( rule__XmlDocument__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4879:1: ( ( rule__XmlDocument__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4880:1: ( rule__XmlDocument__Group_3__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4881:1: ( rule__XmlDocument__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4881:2: rule__XmlDocument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl9874);
                    rule__XmlDocument__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlDocumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__3__Impl"


    // $ANTLR start "rule__XmlDocument__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4891:1: rule__XmlDocument__Group__4 : rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 ;
    public final void rule__XmlDocument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4895:1: ( rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4896:2: rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__49905);
            rule__XmlDocument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__49908);
            rule__XmlDocument__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__4"


    // $ANTLR start "rule__XmlDocument__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4903:1: rule__XmlDocument__Group__4__Impl : ( ( rule__XmlDocument__Group_4__0 )? ) ;
    public final void rule__XmlDocument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4907:1: ( ( ( rule__XmlDocument__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4908:1: ( ( rule__XmlDocument__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4908:1: ( ( rule__XmlDocument__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4909:1: ( rule__XmlDocument__Group_4__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4910:1: ( rule__XmlDocument__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4910:2: rule__XmlDocument__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl9935);
                    rule__XmlDocument__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlDocumentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__4__Impl"


    // $ANTLR start "rule__XmlDocument__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4920:1: rule__XmlDocument__Group__5 : rule__XmlDocument__Group__5__Impl ;
    public final void rule__XmlDocument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4924:1: ( rule__XmlDocument__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4925:2: rule__XmlDocument__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__59966);
            rule__XmlDocument__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__5"


    // $ANTLR start "rule__XmlDocument__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4931:1: rule__XmlDocument__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlDocument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4935:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4936:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4936:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4937:1: '}'
            {
             before(grammarAccess.getXmlDocumentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_42_in_rule__XmlDocument__Group__5__Impl9994); 
             after(grammarAccess.getXmlDocumentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group__5__Impl"


    // $ANTLR start "rule__XmlDocument__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4962:1: rule__XmlDocument__Group_3__0 : rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 ;
    public final void rule__XmlDocument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4966:1: ( rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4967:2: rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__010037);
            rule__XmlDocument__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__010040);
            rule__XmlDocument__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__0"


    // $ANTLR start "rule__XmlDocument__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4974:1: rule__XmlDocument__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlDocument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4978:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4979:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4979:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4980:1: 'matching'
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlDocument__Group_3__0__Impl10068); 
             after(grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__0__Impl"


    // $ANTLR start "rule__XmlDocument__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4993:1: rule__XmlDocument__Group_3__1 : rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 ;
    public final void rule__XmlDocument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4997:1: ( rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4998:2: rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__110099);
            rule__XmlDocument__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__110102);
            rule__XmlDocument__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__1"


    // $ANTLR start "rule__XmlDocument__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5005:1: rule__XmlDocument__Group_3__1__Impl : ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlDocument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5009:1: ( ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5010:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5010:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5011:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5012:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5012:2: rule__XmlDocument__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl10129);
            rule__XmlDocument__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlDocumentAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__1__Impl"


    // $ANTLR start "rule__XmlDocument__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5022:1: rule__XmlDocument__Group_3__2 : rule__XmlDocument__Group_3__2__Impl ;
    public final void rule__XmlDocument__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5026:1: ( rule__XmlDocument__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5027:2: rule__XmlDocument__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__210159);
            rule__XmlDocument__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__2"


    // $ANTLR start "rule__XmlDocument__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5033:1: rule__XmlDocument__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5037:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5038:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5038:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5039:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2()); 
            match(input,44,FOLLOW_44_in_rule__XmlDocument__Group_3__2__Impl10187); 
             after(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_3__2__Impl"


    // $ANTLR start "rule__XmlDocument__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5058:1: rule__XmlDocument__Group_4__0 : rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 ;
    public final void rule__XmlDocument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5062:1: ( rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5063:2: rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__010224);
            rule__XmlDocument__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__010227);
            rule__XmlDocument__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__0"


    // $ANTLR start "rule__XmlDocument__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5070:1: rule__XmlDocument__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlDocument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5074:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5075:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5075:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5076:1: 'cardinality'
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__XmlDocument__Group_4__0__Impl10255); 
             after(grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__0__Impl"


    // $ANTLR start "rule__XmlDocument__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5089:1: rule__XmlDocument__Group_4__1 : rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 ;
    public final void rule__XmlDocument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5093:1: ( rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5094:2: rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__110286);
            rule__XmlDocument__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__110289);
            rule__XmlDocument__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__1"


    // $ANTLR start "rule__XmlDocument__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5101:1: rule__XmlDocument__Group_4__1__Impl : ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlDocument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5105:1: ( ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5106:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5106:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5107:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5108:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5108:2: rule__XmlDocument__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl10316);
            rule__XmlDocument__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlDocumentAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__1__Impl"


    // $ANTLR start "rule__XmlDocument__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5118:1: rule__XmlDocument__Group_4__2 : rule__XmlDocument__Group_4__2__Impl ;
    public final void rule__XmlDocument__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5122:1: ( rule__XmlDocument__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5123:2: rule__XmlDocument__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210346);
            rule__XmlDocument__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__2"


    // $ANTLR start "rule__XmlDocument__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5129:1: rule__XmlDocument__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5133:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5134:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5134:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5135:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__XmlDocument__Group_4__2__Impl10374); 
             after(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__Group_4__2__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5154:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5158:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5159:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__010411);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__010414);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5166:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5170:1: ( ( 'module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5171:1: ( 'module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5171:1: ( 'module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5172:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__Module__Group__0__Impl10442); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5185:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5189:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5190:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__110473);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__110476);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5197:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5201:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5202:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5202:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5203:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5204:1: ( rule__Module__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5204:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl10503);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5214:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5218:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5219:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__210533);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__210536);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5226:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5230:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5231:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5231:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5232:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Module__Group__2__Impl10564); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5245:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5249:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5250:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__310595);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__310598);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5257:1: rule__Module__Group__3__Impl : ( ( rule__Module__Group_3__0 )? ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5261:1: ( ( ( rule__Module__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5262:1: ( ( rule__Module__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5262:1: ( ( rule__Module__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5263:1: ( rule__Module__Group_3__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5264:1: ( rule__Module__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44||LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5264:2: rule__Module__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl10625);
                    rule__Module__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5274:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5278:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5279:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__410656);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__410659);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5286:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5290:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5291:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5291:1: ( ( rule__Module__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5292:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5293:1: ( rule__Module__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5293:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl10686);
                    rule__Module__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5303:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5307:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5308:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__510717);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__510720);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5315:1: rule__Module__Group__5__Impl : ( ( rule__Module__ComponentsAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5319:1: ( ( ( rule__Module__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5320:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5320:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5321:1: ( rule__Module__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5322:1: ( rule__Module__ComponentsAssignment_5 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==47||LA41_0==50||(LA41_0>=53 && LA41_0<=55)||LA41_0==59||(LA41_0>=61 && LA41_0<=65)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5322:2: rule__Module__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl10747);
            	    rule__Module__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5332:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5336:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5337:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__610778);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__610781);
            rule__Module__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5344:1: rule__Module__Group__6__Impl : ( ( rule__Module__RestrictionsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5348:1: ( ( ( rule__Module__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5349:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5349:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5350:1: ( rule__Module__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5351:1: ( rule__Module__RestrictionsAssignment_6 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==67) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5351:2: rule__Module__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl10808);
            	    rule__Module__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getRestrictionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5361:1: rule__Module__Group__7 : rule__Module__Group__7__Impl ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5365:1: ( rule__Module__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5366:2: rule__Module__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__710839);
            rule__Module__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5372:1: rule__Module__Group__7__Impl : ( '}' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5376:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5377:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5377:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5378:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__Module__Group__7__Impl10867); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5407:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5411:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5412:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__010914);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__010917);
            rule__Module__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__0"


    // $ANTLR start "rule__Module__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5419:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__Group_3_0__0 )* ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5423:1: ( ( ( rule__Module__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5424:1: ( ( rule__Module__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5424:1: ( ( rule__Module__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5425:1: ( rule__Module__Group_3_0__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5426:1: ( rule__Module__Group_3_0__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==48) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5426:2: rule__Module__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl10944);
            	    rule__Module__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__0__Impl"


    // $ANTLR start "rule__Module__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5436:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5440:1: ( rule__Module__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5441:2: rule__Module__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__110975);
            rule__Module__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__1"


    // $ANTLR start "rule__Module__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5447:1: rule__Module__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5451:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5452:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5452:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5453:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,44,FOLLOW_44_in_rule__Module__Group_3__1__Impl11003); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__1__Impl"


    // $ANTLR start "rule__Module__Group_3_0__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5470:1: rule__Module__Group_3_0__0 : rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 ;
    public final void rule__Module__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5474:1: ( rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5475:2: rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__011038);
            rule__Module__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__011041);
            rule__Module__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__0"


    // $ANTLR start "rule__Module__Group_3_0__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5482:1: rule__Module__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__Module__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5486:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5487:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5487:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5488:1: 'attributes'
            {
             before(grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Module__Group_3_0__0__Impl11069); 
             after(grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__0__Impl"


    // $ANTLR start "rule__Module__Group_3_0__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5501:1: rule__Module__Group_3_0__1 : rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 ;
    public final void rule__Module__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5505:1: ( rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5506:2: rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__111100);
            rule__Module__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__111103);
            rule__Module__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__1"


    // $ANTLR start "rule__Module__Group_3_0__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5513:1: rule__Module__Group_3_0__1__Impl : ( ( rule__Module__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__Module__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5517:1: ( ( ( rule__Module__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5518:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5518:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5519:1: ( rule__Module__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5520:1: ( rule__Module__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5520:2: rule__Module__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl11130);
            rule__Module__AttributesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getAttributesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__1__Impl"


    // $ANTLR start "rule__Module__Group_3_0__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5530:1: rule__Module__Group_3_0__2 : rule__Module__Group_3_0__2__Impl ;
    public final void rule__Module__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5534:1: ( rule__Module__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5535:2: rule__Module__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__211160);
            rule__Module__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__2"


    // $ANTLR start "rule__Module__Group_3_0__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5541:1: rule__Module__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__Module__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5545:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5546:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5546:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5547:1: ( ',' )?
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5548:1: ( ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5549:2: ','
                    {
                    match(input,46,FOLLOW_46_in_rule__Module__Group_3_0__2__Impl11189); 

                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getCommaKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3_0__2__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5566:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5570:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5571:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__011228);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__011231);
            rule__Module__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5578:1: rule__Module__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5582:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5583:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5583:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5584:1: 'matching'
            {
             before(grammarAccess.getModuleAccess().getMatchingKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__Module__Group_4__0__Impl11259); 
             after(grammarAccess.getModuleAccess().getMatchingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5597:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl rule__Module__Group_4__2 ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5601:1: ( rule__Module__Group_4__1__Impl rule__Module__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5602:2: rule__Module__Group_4__1__Impl rule__Module__Group_4__2
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__111290);
            rule__Module__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__111293);
            rule__Module__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5609:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__MatchingAssignment_4_1 ) ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5613:1: ( ( ( rule__Module__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5614:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5614:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5615:1: ( rule__Module__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5616:1: ( rule__Module__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5616:2: rule__Module__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl11320);
            rule__Module__MatchingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getMatchingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5626:1: rule__Module__Group_4__2 : rule__Module__Group_4__2__Impl ;
    public final void rule__Module__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5630:1: ( rule__Module__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5631:2: rule__Module__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__211350);
            rule__Module__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2"


    // $ANTLR start "rule__Module__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5637:1: rule__Module__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Module__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5641:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5642:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5642:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5643:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__Module__Group_4__2__Impl11378); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__2__Impl"


    // $ANTLR start "rule__MetaModule__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5662:1: rule__MetaModule__Group__0 : rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 ;
    public final void rule__MetaModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5666:1: ( rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5667:2: rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__011415);
            rule__MetaModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__011418);
            rule__MetaModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__0"


    // $ANTLR start "rule__MetaModule__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5674:1: rule__MetaModule__Group__0__Impl : ( 'meta-module' ) ;
    public final void rule__MetaModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5678:1: ( ( 'meta-module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5679:1: ( 'meta-module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5679:1: ( 'meta-module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5680:1: 'meta-module'
            {
             before(grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__MetaModule__Group__0__Impl11446); 
             after(grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__0__Impl"


    // $ANTLR start "rule__MetaModule__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5693:1: rule__MetaModule__Group__1 : rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 ;
    public final void rule__MetaModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5697:1: ( rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5698:2: rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__111477);
            rule__MetaModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__111480);
            rule__MetaModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__1"


    // $ANTLR start "rule__MetaModule__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5705:1: rule__MetaModule__Group__1__Impl : ( ( rule__MetaModule__NameAssignment_1 ) ) ;
    public final void rule__MetaModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5709:1: ( ( ( rule__MetaModule__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5710:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5710:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5711:1: ( rule__MetaModule__NameAssignment_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5712:1: ( rule__MetaModule__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5712:2: rule__MetaModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl11507);
            rule__MetaModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__1__Impl"


    // $ANTLR start "rule__MetaModule__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5722:1: rule__MetaModule__Group__2 : rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 ;
    public final void rule__MetaModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5726:1: ( rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5727:2: rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__211537);
            rule__MetaModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__211540);
            rule__MetaModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__2"


    // $ANTLR start "rule__MetaModule__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5734:1: rule__MetaModule__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5738:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5739:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5739:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5740:1: '{'
            {
             before(grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__MetaModule__Group__2__Impl11568); 
             after(grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__2__Impl"


    // $ANTLR start "rule__MetaModule__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5753:1: rule__MetaModule__Group__3 : rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 ;
    public final void rule__MetaModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5757:1: ( rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5758:2: rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__311599);
            rule__MetaModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__311602);
            rule__MetaModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__3"


    // $ANTLR start "rule__MetaModule__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5765:1: rule__MetaModule__Group__3__Impl : ( ( rule__MetaModule__Group_3__0 )? ) ;
    public final void rule__MetaModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5769:1: ( ( ( rule__MetaModule__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5770:1: ( ( rule__MetaModule__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5770:1: ( ( rule__MetaModule__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5771:1: ( rule__MetaModule__Group_3__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5772:1: ( rule__MetaModule__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44||LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5772:2: rule__MetaModule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl11629);
                    rule__MetaModule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaModuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__3__Impl"


    // $ANTLR start "rule__MetaModule__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5782:1: rule__MetaModule__Group__4 : rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 ;
    public final void rule__MetaModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5786:1: ( rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5787:2: rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__411660);
            rule__MetaModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__411663);
            rule__MetaModule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__4"


    // $ANTLR start "rule__MetaModule__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5794:1: rule__MetaModule__Group__4__Impl : ( ( rule__MetaModule__Group_4__0 )? ) ;
    public final void rule__MetaModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5798:1: ( ( ( rule__MetaModule__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5799:1: ( ( rule__MetaModule__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5799:1: ( ( rule__MetaModule__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5800:1: ( rule__MetaModule__Group_4__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5801:1: ( rule__MetaModule__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5801:2: rule__MetaModule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl11690);
                    rule__MetaModule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__4__Impl"


    // $ANTLR start "rule__MetaModule__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5811:1: rule__MetaModule__Group__5 : rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 ;
    public final void rule__MetaModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5815:1: ( rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5816:2: rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__511721);
            rule__MetaModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__511724);
            rule__MetaModule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__5"


    // $ANTLR start "rule__MetaModule__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5823:1: rule__MetaModule__Group__5__Impl : ( ( rule__MetaModule__ComponentsAssignment_5 )* ) ;
    public final void rule__MetaModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5827:1: ( ( ( rule__MetaModule__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5828:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5828:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5829:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5830:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==47||LA47_0==50||(LA47_0>=53 && LA47_0<=55)||LA47_0==59||(LA47_0>=61 && LA47_0<=65)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5830:2: rule__MetaModule__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl11751);
            	    rule__MetaModule__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__5__Impl"


    // $ANTLR start "rule__MetaModule__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5840:1: rule__MetaModule__Group__6 : rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 ;
    public final void rule__MetaModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5844:1: ( rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5845:2: rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__611782);
            rule__MetaModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__611785);
            rule__MetaModule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__6"


    // $ANTLR start "rule__MetaModule__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5852:1: rule__MetaModule__Group__6__Impl : ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) ;
    public final void rule__MetaModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5856:1: ( ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5857:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5857:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5858:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5859:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==67) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5859:2: rule__MetaModule__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl11812);
            	    rule__MetaModule__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__6__Impl"


    // $ANTLR start "rule__MetaModule__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5869:1: rule__MetaModule__Group__7 : rule__MetaModule__Group__7__Impl ;
    public final void rule__MetaModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5873:1: ( rule__MetaModule__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5874:2: rule__MetaModule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__711843);
            rule__MetaModule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__7"


    // $ANTLR start "rule__MetaModule__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5880:1: rule__MetaModule__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5884:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5885:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5885:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5886:1: '}'
            {
             before(grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__MetaModule__Group__7__Impl11871); 
             after(grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group__7__Impl"


    // $ANTLR start "rule__MetaModule__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5915:1: rule__MetaModule__Group_3__0 : rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 ;
    public final void rule__MetaModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5919:1: ( rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5920:2: rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__011918);
            rule__MetaModule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__011921);
            rule__MetaModule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3__0"


    // $ANTLR start "rule__MetaModule__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5927:1: rule__MetaModule__Group_3__0__Impl : ( ( rule__MetaModule__Group_3_0__0 )* ) ;
    public final void rule__MetaModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5931:1: ( ( ( rule__MetaModule__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5932:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5932:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5933:1: ( rule__MetaModule__Group_3_0__0 )*
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5934:1: ( rule__MetaModule__Group_3_0__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==48) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5934:2: rule__MetaModule__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl11948);
            	    rule__MetaModule__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getMetaModuleAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3__0__Impl"


    // $ANTLR start "rule__MetaModule__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5944:1: rule__MetaModule__Group_3__1 : rule__MetaModule__Group_3__1__Impl ;
    public final void rule__MetaModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5948:1: ( rule__MetaModule__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5949:2: rule__MetaModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__111979);
            rule__MetaModule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3__1"


    // $ANTLR start "rule__MetaModule__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5955:1: rule__MetaModule__Group_3__1__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5959:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5960:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5960:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5961:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,44,FOLLOW_44_in_rule__MetaModule__Group_3__1__Impl12007); 
             after(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3__1__Impl"


    // $ANTLR start "rule__MetaModule__Group_3_0__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5978:1: rule__MetaModule__Group_3_0__0 : rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 ;
    public final void rule__MetaModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5982:1: ( rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5983:2: rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__012042);
            rule__MetaModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__012045);
            rule__MetaModule__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__0"


    // $ANTLR start "rule__MetaModule__Group_3_0__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5990:1: rule__MetaModule__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__MetaModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5994:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5995:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5995:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5996:1: 'attributes'
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,48,FOLLOW_48_in_rule__MetaModule__Group_3_0__0__Impl12073); 
             after(grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__0__Impl"


    // $ANTLR start "rule__MetaModule__Group_3_0__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6009:1: rule__MetaModule__Group_3_0__1 : rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 ;
    public final void rule__MetaModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6013:1: ( rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6014:2: rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__112104);
            rule__MetaModule__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__112107);
            rule__MetaModule__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__1"


    // $ANTLR start "rule__MetaModule__Group_3_0__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6021:1: rule__MetaModule__Group_3_0__1__Impl : ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__MetaModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6025:1: ( ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6026:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6026:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6027:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6028:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6028:2: rule__MetaModule__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl12134);
            rule__MetaModule__AttributesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaModuleAccess().getAttributesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__1__Impl"


    // $ANTLR start "rule__MetaModule__Group_3_0__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6038:1: rule__MetaModule__Group_3_0__2 : rule__MetaModule__Group_3_0__2__Impl ;
    public final void rule__MetaModule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6042:1: ( rule__MetaModule__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6043:2: rule__MetaModule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__212164);
            rule__MetaModule__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__2"


    // $ANTLR start "rule__MetaModule__Group_3_0__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6049:1: rule__MetaModule__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__MetaModule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6053:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6054:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6054:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6055:1: ( ',' )?
            {
             before(grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6056:1: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6057:2: ','
                    {
                    match(input,46,FOLLOW_46_in_rule__MetaModule__Group_3_0__2__Impl12193); 

                    }
                    break;

            }

             after(grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_3_0__2__Impl"


    // $ANTLR start "rule__MetaModule__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6074:1: rule__MetaModule__Group_4__0 : rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 ;
    public final void rule__MetaModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6078:1: ( rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6079:2: rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__012232);
            rule__MetaModule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__012235);
            rule__MetaModule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__0"


    // $ANTLR start "rule__MetaModule__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6086:1: rule__MetaModule__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__MetaModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6090:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6091:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6091:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6092:1: 'matching'
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__MetaModule__Group_4__0__Impl12263); 
             after(grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__0__Impl"


    // $ANTLR start "rule__MetaModule__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6105:1: rule__MetaModule__Group_4__1 : rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 ;
    public final void rule__MetaModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6109:1: ( rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6110:2: rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__112294);
            rule__MetaModule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__112297);
            rule__MetaModule__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__1"


    // $ANTLR start "rule__MetaModule__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6117:1: rule__MetaModule__Group_4__1__Impl : ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) ;
    public final void rule__MetaModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6121:1: ( ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6122:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6122:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6123:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6124:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6124:2: rule__MetaModule__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl12324);
            rule__MetaModule__MatchingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaModuleAccess().getMatchingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__1__Impl"


    // $ANTLR start "rule__MetaModule__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6134:1: rule__MetaModule__Group_4__2 : rule__MetaModule__Group_4__2__Impl ;
    public final void rule__MetaModule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6138:1: ( rule__MetaModule__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6139:2: rule__MetaModule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__212354);
            rule__MetaModule__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__2"


    // $ANTLR start "rule__MetaModule__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6145:1: rule__MetaModule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6149:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6150:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6150:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6151:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__MetaModule__Group_4__2__Impl12382); 
             after(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__Group_4__2__Impl"


    // $ANTLR start "rule__ExternalModule__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6170:1: rule__ExternalModule__Group__0 : rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1 ;
    public final void rule__ExternalModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6174:1: ( rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6175:2: rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__0__Impl_in_rule__ExternalModule__Group__012419);
            rule__ExternalModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__1_in_rule__ExternalModule__Group__012422);
            rule__ExternalModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__0"


    // $ANTLR start "rule__ExternalModule__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6182:1: rule__ExternalModule__Group__0__Impl : ( 'external-module' ) ;
    public final void rule__ExternalModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6186:1: ( ( 'external-module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6187:1: ( 'external-module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6187:1: ( 'external-module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6188:1: 'external-module'
            {
             before(grammarAccess.getExternalModuleAccess().getExternalModuleKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__ExternalModule__Group__0__Impl12450); 
             after(grammarAccess.getExternalModuleAccess().getExternalModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__0__Impl"


    // $ANTLR start "rule__ExternalModule__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6201:1: rule__ExternalModule__Group__1 : rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2 ;
    public final void rule__ExternalModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6205:1: ( rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6206:2: rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__1__Impl_in_rule__ExternalModule__Group__112481);
            rule__ExternalModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__2_in_rule__ExternalModule__Group__112484);
            rule__ExternalModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__1"


    // $ANTLR start "rule__ExternalModule__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6213:1: rule__ExternalModule__Group__1__Impl : ( ( rule__ExternalModule__NameAssignment_1 ) ) ;
    public final void rule__ExternalModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6217:1: ( ( ( rule__ExternalModule__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6218:1: ( ( rule__ExternalModule__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6218:1: ( ( rule__ExternalModule__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6219:1: ( rule__ExternalModule__NameAssignment_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6220:1: ( rule__ExternalModule__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6220:2: rule__ExternalModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__NameAssignment_1_in_rule__ExternalModule__Group__1__Impl12511);
            rule__ExternalModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__1__Impl"


    // $ANTLR start "rule__ExternalModule__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6230:1: rule__ExternalModule__Group__2 : rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3 ;
    public final void rule__ExternalModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6234:1: ( rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6235:2: rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__2__Impl_in_rule__ExternalModule__Group__212541);
            rule__ExternalModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__3_in_rule__ExternalModule__Group__212544);
            rule__ExternalModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__2"


    // $ANTLR start "rule__ExternalModule__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6242:1: rule__ExternalModule__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6246:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6247:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6247:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6248:1: '{'
            {
             before(grammarAccess.getExternalModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__ExternalModule__Group__2__Impl12572); 
             after(grammarAccess.getExternalModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__2__Impl"


    // $ANTLR start "rule__ExternalModule__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6261:1: rule__ExternalModule__Group__3 : rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4 ;
    public final void rule__ExternalModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6265:1: ( rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6266:2: rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__3__Impl_in_rule__ExternalModule__Group__312603);
            rule__ExternalModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__4_in_rule__ExternalModule__Group__312606);
            rule__ExternalModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__3"


    // $ANTLR start "rule__ExternalModule__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6273:1: rule__ExternalModule__Group__3__Impl : ( ( rule__ExternalModule__Group_3__0 )? ) ;
    public final void rule__ExternalModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6277:1: ( ( ( rule__ExternalModule__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6278:1: ( ( rule__ExternalModule__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6278:1: ( ( rule__ExternalModule__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6279:1: ( rule__ExternalModule__Group_3__0 )?
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6280:1: ( rule__ExternalModule__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44||LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6280:2: rule__ExternalModule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExternalModule__Group_3__0_in_rule__ExternalModule__Group__3__Impl12633);
                    rule__ExternalModule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalModuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__3__Impl"


    // $ANTLR start "rule__ExternalModule__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6290:1: rule__ExternalModule__Group__4 : rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5 ;
    public final void rule__ExternalModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6294:1: ( rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6295:2: rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__4__Impl_in_rule__ExternalModule__Group__412664);
            rule__ExternalModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__5_in_rule__ExternalModule__Group__412667);
            rule__ExternalModule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__4"


    // $ANTLR start "rule__ExternalModule__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6302:1: rule__ExternalModule__Group__4__Impl : ( ( rule__ExternalModule__Group_4__0 )? ) ;
    public final void rule__ExternalModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6306:1: ( ( ( rule__ExternalModule__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6307:1: ( ( rule__ExternalModule__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6307:1: ( ( rule__ExternalModule__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6308:1: ( rule__ExternalModule__Group_4__0 )?
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6309:1: ( rule__ExternalModule__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6309:2: rule__ExternalModule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExternalModule__Group_4__0_in_rule__ExternalModule__Group__4__Impl12694);
                    rule__ExternalModule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__4__Impl"


    // $ANTLR start "rule__ExternalModule__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6319:1: rule__ExternalModule__Group__5 : rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6 ;
    public final void rule__ExternalModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6323:1: ( rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6324:2: rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__5__Impl_in_rule__ExternalModule__Group__512725);
            rule__ExternalModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__6_in_rule__ExternalModule__Group__512728);
            rule__ExternalModule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__5"


    // $ANTLR start "rule__ExternalModule__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6331:1: rule__ExternalModule__Group__5__Impl : ( ( rule__ExternalModule__ComponentsAssignment_5 )* ) ;
    public final void rule__ExternalModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6335:1: ( ( ( rule__ExternalModule__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6336:1: ( ( rule__ExternalModule__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6336:1: ( ( rule__ExternalModule__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6337:1: ( rule__ExternalModule__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getExternalModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6338:1: ( rule__ExternalModule__ComponentsAssignment_5 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==47||LA53_0==50||(LA53_0>=53 && LA53_0<=55)||LA53_0==59||(LA53_0>=61 && LA53_0<=65)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6338:2: rule__ExternalModule__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__ComponentsAssignment_5_in_rule__ExternalModule__Group__5__Impl12755);
            	    rule__ExternalModule__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getExternalModuleAccess().getComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__5__Impl"


    // $ANTLR start "rule__ExternalModule__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6348:1: rule__ExternalModule__Group__6 : rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7 ;
    public final void rule__ExternalModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6352:1: ( rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6353:2: rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__6__Impl_in_rule__ExternalModule__Group__612786);
            rule__ExternalModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__7_in_rule__ExternalModule__Group__612789);
            rule__ExternalModule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__6"


    // $ANTLR start "rule__ExternalModule__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6360:1: rule__ExternalModule__Group__6__Impl : ( ( rule__ExternalModule__RestrictionsAssignment_6 )* ) ;
    public final void rule__ExternalModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6364:1: ( ( ( rule__ExternalModule__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6365:1: ( ( rule__ExternalModule__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6365:1: ( ( rule__ExternalModule__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6366:1: ( rule__ExternalModule__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getExternalModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6367:1: ( rule__ExternalModule__RestrictionsAssignment_6 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==67) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6367:2: rule__ExternalModule__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__RestrictionsAssignment_6_in_rule__ExternalModule__Group__6__Impl12816);
            	    rule__ExternalModule__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getExternalModuleAccess().getRestrictionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__6__Impl"


    // $ANTLR start "rule__ExternalModule__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6377:1: rule__ExternalModule__Group__7 : rule__ExternalModule__Group__7__Impl ;
    public final void rule__ExternalModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6381:1: ( rule__ExternalModule__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6382:2: rule__ExternalModule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__7__Impl_in_rule__ExternalModule__Group__712847);
            rule__ExternalModule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__7"


    // $ANTLR start "rule__ExternalModule__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6388:1: rule__ExternalModule__Group__7__Impl : ( '}' ) ;
    public final void rule__ExternalModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6392:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6393:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6393:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6394:1: '}'
            {
             before(grammarAccess.getExternalModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_42_in_rule__ExternalModule__Group__7__Impl12875); 
             after(grammarAccess.getExternalModuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group__7__Impl"


    // $ANTLR start "rule__ExternalModule__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6423:1: rule__ExternalModule__Group_3__0 : rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1 ;
    public final void rule__ExternalModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6427:1: ( rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6428:2: rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3__0__Impl_in_rule__ExternalModule__Group_3__012922);
            rule__ExternalModule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3__1_in_rule__ExternalModule__Group_3__012925);
            rule__ExternalModule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3__0"


    // $ANTLR start "rule__ExternalModule__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6435:1: rule__ExternalModule__Group_3__0__Impl : ( ( rule__ExternalModule__Group_3_0__0 )* ) ;
    public final void rule__ExternalModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6439:1: ( ( ( rule__ExternalModule__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6440:1: ( ( rule__ExternalModule__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6440:1: ( ( rule__ExternalModule__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6441:1: ( rule__ExternalModule__Group_3_0__0 )*
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6442:1: ( rule__ExternalModule__Group_3_0__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==48) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6442:2: rule__ExternalModule__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__0_in_rule__ExternalModule__Group_3__0__Impl12952);
            	    rule__ExternalModule__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getExternalModuleAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3__0__Impl"


    // $ANTLR start "rule__ExternalModule__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6452:1: rule__ExternalModule__Group_3__1 : rule__ExternalModule__Group_3__1__Impl ;
    public final void rule__ExternalModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6456:1: ( rule__ExternalModule__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6457:2: rule__ExternalModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3__1__Impl_in_rule__ExternalModule__Group_3__112983);
            rule__ExternalModule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3__1"


    // $ANTLR start "rule__ExternalModule__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6463:1: rule__ExternalModule__Group_3__1__Impl : ( ';' ) ;
    public final void rule__ExternalModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6467:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6468:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6468:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6469:1: ';'
            {
             before(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,44,FOLLOW_44_in_rule__ExternalModule__Group_3__1__Impl13011); 
             after(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3__1__Impl"


    // $ANTLR start "rule__ExternalModule__Group_3_0__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6486:1: rule__ExternalModule__Group_3_0__0 : rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1 ;
    public final void rule__ExternalModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6490:1: ( rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6491:2: rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__0__Impl_in_rule__ExternalModule__Group_3_0__013046);
            rule__ExternalModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__1_in_rule__ExternalModule__Group_3_0__013049);
            rule__ExternalModule__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__0"


    // $ANTLR start "rule__ExternalModule__Group_3_0__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6498:1: rule__ExternalModule__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__ExternalModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6502:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6503:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6503:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6504:1: 'attributes'
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,48,FOLLOW_48_in_rule__ExternalModule__Group_3_0__0__Impl13077); 
             after(grammarAccess.getExternalModuleAccess().getAttributesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__0__Impl"


    // $ANTLR start "rule__ExternalModule__Group_3_0__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6517:1: rule__ExternalModule__Group_3_0__1 : rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2 ;
    public final void rule__ExternalModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6521:1: ( rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6522:2: rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__1__Impl_in_rule__ExternalModule__Group_3_0__113108);
            rule__ExternalModule__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__2_in_rule__ExternalModule__Group_3_0__113111);
            rule__ExternalModule__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__1"


    // $ANTLR start "rule__ExternalModule__Group_3_0__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6529:1: rule__ExternalModule__Group_3_0__1__Impl : ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__ExternalModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6533:1: ( ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6534:1: ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6534:1: ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6535:1: ( rule__ExternalModule__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6536:1: ( rule__ExternalModule__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6536:2: rule__ExternalModule__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__AttributesAssignment_3_0_1_in_rule__ExternalModule__Group_3_0__1__Impl13138);
            rule__ExternalModule__AttributesAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalModuleAccess().getAttributesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__1__Impl"


    // $ANTLR start "rule__ExternalModule__Group_3_0__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6546:1: rule__ExternalModule__Group_3_0__2 : rule__ExternalModule__Group_3_0__2__Impl ;
    public final void rule__ExternalModule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6550:1: ( rule__ExternalModule__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6551:2: rule__ExternalModule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__2__Impl_in_rule__ExternalModule__Group_3_0__213168);
            rule__ExternalModule__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__2"


    // $ANTLR start "rule__ExternalModule__Group_3_0__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6557:1: rule__ExternalModule__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__ExternalModule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6561:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6562:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6562:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6563:1: ( ',' )?
            {
             before(grammarAccess.getExternalModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6564:1: ( ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6565:2: ','
                    {
                    match(input,46,FOLLOW_46_in_rule__ExternalModule__Group_3_0__2__Impl13197); 

                    }
                    break;

            }

             after(grammarAccess.getExternalModuleAccess().getCommaKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_3_0__2__Impl"


    // $ANTLR start "rule__ExternalModule__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6582:1: rule__ExternalModule__Group_4__0 : rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1 ;
    public final void rule__ExternalModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6586:1: ( rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6587:2: rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__0__Impl_in_rule__ExternalModule__Group_4__013236);
            rule__ExternalModule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_4__1_in_rule__ExternalModule__Group_4__013239);
            rule__ExternalModule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__0"


    // $ANTLR start "rule__ExternalModule__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6594:1: rule__ExternalModule__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__ExternalModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6598:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6599:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6599:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6600:1: 'matching'
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__ExternalModule__Group_4__0__Impl13267); 
             after(grammarAccess.getExternalModuleAccess().getMatchingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalModule__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6613:1: rule__ExternalModule__Group_4__1 : rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2 ;
    public final void rule__ExternalModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6617:1: ( rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6618:2: rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__1__Impl_in_rule__ExternalModule__Group_4__113298);
            rule__ExternalModule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_4__2_in_rule__ExternalModule__Group_4__113301);
            rule__ExternalModule__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__1"


    // $ANTLR start "rule__ExternalModule__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6625:1: rule__ExternalModule__Group_4__1__Impl : ( ( rule__ExternalModule__MatchingAssignment_4_1 ) ) ;
    public final void rule__ExternalModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6629:1: ( ( ( rule__ExternalModule__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6630:1: ( ( rule__ExternalModule__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6630:1: ( ( rule__ExternalModule__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6631:1: ( rule__ExternalModule__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6632:1: ( rule__ExternalModule__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6632:2: rule__ExternalModule__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__MatchingAssignment_4_1_in_rule__ExternalModule__Group_4__1__Impl13328);
            rule__ExternalModule__MatchingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalModuleAccess().getMatchingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__1__Impl"


    // $ANTLR start "rule__ExternalModule__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6642:1: rule__ExternalModule__Group_4__2 : rule__ExternalModule__Group_4__2__Impl ;
    public final void rule__ExternalModule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6646:1: ( rule__ExternalModule__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6647:2: rule__ExternalModule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__2__Impl_in_rule__ExternalModule__Group_4__213358);
            rule__ExternalModule__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__2"


    // $ANTLR start "rule__ExternalModule__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6653:1: rule__ExternalModule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ExternalModule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6657:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6658:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6658:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6659:1: ';'
            {
             before(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,44,FOLLOW_44_in_rule__ExternalModule__Group_4__2__Impl13386); 
             after(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__Group_4__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6678:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6682:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6683:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013423);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013426);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6690:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6694:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6695:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6695:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6696:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13453); 
             after(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6707:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6711:1: ( rule__QualifiedName__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6712:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113482);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6718:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6722:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6723:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6723:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6724:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6725:1: ( rule__QualifiedName__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==66) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6725:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13509);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6739:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6743:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6744:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013544);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013547);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6751:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6755:1: ( ( '.' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6756:1: ( '.' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6756:1: ( '.' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6757:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13575); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6770:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6774:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6775:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113606);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6781:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6785:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6786:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6786:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6787:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13633); 
             after(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Restriction__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6802:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6806:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6807:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013666);
            rule__Restriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013669);
            rule__Restriction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0"


    // $ANTLR start "rule__Restriction__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6814:1: rule__Restriction__Group__0__Impl : ( 'restriction' ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6818:1: ( ( 'restriction' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6819:1: ( 'restriction' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6819:1: ( 'restriction' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6820:1: 'restriction'
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__Restriction__Group__0__Impl13697); 
             after(grammarAccess.getRestrictionAccess().getRestrictionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__0__Impl"


    // $ANTLR start "rule__Restriction__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6833:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6837:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6838:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113728);
            rule__Restriction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113731);
            rule__Restriction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1"


    // $ANTLR start "rule__Restriction__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6845:1: rule__Restriction__Group__1__Impl : ( '{' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6849:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6850:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6850:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6851:1: '{'
            {
             before(grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Restriction__Group__1__Impl13759); 
             after(grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__1__Impl"


    // $ANTLR start "rule__Restriction__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6864:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6868:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6869:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213790);
            rule__Restriction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__213793);
            rule__Restriction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__2"


    // $ANTLR start "rule__Restriction__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6876:1: rule__Restriction__Group__2__Impl : ( ( rule__Restriction__GroupClauseAssignment_2 )? ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6880:1: ( ( ( rule__Restriction__GroupClauseAssignment_2 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6881:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6881:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6882:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6883:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=23 && LA58_0<=26)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6883:2: rule__Restriction__GroupClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl13820);
                    rule__Restriction__GroupClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__2__Impl"


    // $ANTLR start "rule__Restriction__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6893:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl rule__Restriction__Group__4 ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6897:1: ( rule__Restriction__Group__3__Impl rule__Restriction__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6898:2: rule__Restriction__Group__3__Impl rule__Restriction__Group__4
            {
            pushFollow(FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__313851);
            rule__Restriction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__313854);
            rule__Restriction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__3"


    // $ANTLR start "rule__Restriction__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6905:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__ComponentAAssignment_3 )* ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6909:1: ( ( ( rule__Restriction__ComponentAAssignment_3 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6910:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6910:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6911:1: ( rule__Restriction__ComponentAAssignment_3 )*
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAssignment_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6912:1: ( rule__Restriction__ComponentAAssignment_3 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID_ASML) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6912:2: rule__Restriction__ComponentAAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl13881);
            	    rule__Restriction__ComponentAAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getRestrictionAccess().getComponentAAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__3__Impl"


    // $ANTLR start "rule__Restriction__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6922:1: rule__Restriction__Group__4 : rule__Restriction__Group__4__Impl rule__Restriction__Group__5 ;
    public final void rule__Restriction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6926:1: ( rule__Restriction__Group__4__Impl rule__Restriction__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6927:2: rule__Restriction__Group__4__Impl rule__Restriction__Group__5
            {
            pushFollow(FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__413912);
            rule__Restriction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__413915);
            rule__Restriction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__4"


    // $ANTLR start "rule__Restriction__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6934:1: rule__Restriction__Group__4__Impl : ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) ;
    public final void rule__Restriction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6938:1: ( ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6939:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6939:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6940:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6941:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==23||(LA60_0>=27 && LA60_0<=29)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6941:2: rule__Restriction__PermissionClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl13942);
                    rule__Restriction__PermissionClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__4__Impl"


    // $ANTLR start "rule__Restriction__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6951:1: rule__Restriction__Group__5 : rule__Restriction__Group__5__Impl rule__Restriction__Group__6 ;
    public final void rule__Restriction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6955:1: ( rule__Restriction__Group__5__Impl rule__Restriction__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6956:2: rule__Restriction__Group__5__Impl rule__Restriction__Group__6
            {
            pushFollow(FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__513973);
            rule__Restriction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__513976);
            rule__Restriction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__5"


    // $ANTLR start "rule__Restriction__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6963:1: rule__Restriction__Group__5__Impl : ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) ;
    public final void rule__Restriction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6967:1: ( ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6968:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6968:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6969:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6970:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6970:2: rule__Restriction__RelactionTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl14003);
            rule__Restriction__RelactionTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__5__Impl"


    // $ANTLR start "rule__Restriction__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6980:1: rule__Restriction__Group__6 : rule__Restriction__Group__6__Impl rule__Restriction__Group__7 ;
    public final void rule__Restriction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6984:1: ( rule__Restriction__Group__6__Impl rule__Restriction__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6985:2: rule__Restriction__Group__6__Impl rule__Restriction__Group__7
            {
            pushFollow(FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__614033);
            rule__Restriction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__614036);
            rule__Restriction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__6"


    // $ANTLR start "rule__Restriction__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6992:1: rule__Restriction__Group__6__Impl : ( ( rule__Restriction__ComponentBAssignment_6 ) ) ;
    public final void rule__Restriction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6996:1: ( ( ( rule__Restriction__ComponentBAssignment_6 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6997:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6997:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6998:1: ( rule__Restriction__ComponentBAssignment_6 )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6999:1: ( rule__Restriction__ComponentBAssignment_6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6999:2: rule__Restriction__ComponentBAssignment_6
            {
            pushFollow(FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl14063);
            rule__Restriction__ComponentBAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getComponentBAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__6__Impl"


    // $ANTLR start "rule__Restriction__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7009:1: rule__Restriction__Group__7 : rule__Restriction__Group__7__Impl rule__Restriction__Group__8 ;
    public final void rule__Restriction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7013:1: ( rule__Restriction__Group__7__Impl rule__Restriction__Group__8 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7014:2: rule__Restriction__Group__7__Impl rule__Restriction__Group__8
            {
            pushFollow(FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__714093);
            rule__Restriction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__8_in_rule__Restriction__Group__714096);
            rule__Restriction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__7"


    // $ANTLR start "rule__Restriction__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7021:1: rule__Restriction__Group__7__Impl : ( ( rule__Restriction__Group_7__0 )? ) ;
    public final void rule__Restriction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7025:1: ( ( ( rule__Restriction__Group_7__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7026:1: ( ( rule__Restriction__Group_7__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7026:1: ( ( rule__Restriction__Group_7__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7027:1: ( rule__Restriction__Group_7__0 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroup_7()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7028:1: ( rule__Restriction__Group_7__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==57) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7028:2: rule__Restriction__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_7__0_in_rule__Restriction__Group__7__Impl14123);
                    rule__Restriction__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestrictionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__7__Impl"


    // $ANTLR start "rule__Restriction__Group__8"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7038:1: rule__Restriction__Group__8 : rule__Restriction__Group__8__Impl ;
    public final void rule__Restriction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7042:1: ( rule__Restriction__Group__8__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7043:2: rule__Restriction__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group__8__Impl_in_rule__Restriction__Group__814154);
            rule__Restriction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__8"


    // $ANTLR start "rule__Restriction__Group__8__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7049:1: rule__Restriction__Group__8__Impl : ( '}' ) ;
    public final void rule__Restriction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7053:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7054:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7054:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7055:1: '}'
            {
             before(grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,42,FOLLOW_42_in_rule__Restriction__Group__8__Impl14182); 
             after(grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group__8__Impl"


    // $ANTLR start "rule__Restriction__Group_7__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7086:1: rule__Restriction__Group_7__0 : rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1 ;
    public final void rule__Restriction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7090:1: ( rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7091:2: rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_7__0__Impl_in_rule__Restriction__Group_7__014231);
            rule__Restriction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_7__1_in_rule__Restriction__Group_7__014234);
            rule__Restriction__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_7__0"


    // $ANTLR start "rule__Restriction__Group_7__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7098:1: rule__Restriction__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Restriction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7102:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7103:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7103:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7104:1: 'description'
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionKeyword_7_0()); 
            match(input,57,FOLLOW_57_in_rule__Restriction__Group_7__0__Impl14262); 
             after(grammarAccess.getRestrictionAccess().getDescriptionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_7__0__Impl"


    // $ANTLR start "rule__Restriction__Group_7__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7117:1: rule__Restriction__Group_7__1 : rule__Restriction__Group_7__1__Impl ;
    public final void rule__Restriction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7121:1: ( rule__Restriction__Group_7__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7122:2: rule__Restriction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_7__1__Impl_in_rule__Restriction__Group_7__114293);
            rule__Restriction__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_7__1"


    // $ANTLR start "rule__Restriction__Group_7__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7128:1: rule__Restriction__Group_7__1__Impl : ( ( rule__Restriction__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Restriction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7132:1: ( ( ( rule__Restriction__DescriptionAssignment_7_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7133:1: ( ( rule__Restriction__DescriptionAssignment_7_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7133:1: ( ( rule__Restriction__DescriptionAssignment_7_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7134:1: ( rule__Restriction__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionAssignment_7_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7135:1: ( rule__Restriction__DescriptionAssignment_7_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7135:2: rule__Restriction__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Restriction__DescriptionAssignment_7_1_in_rule__Restriction__Group_7__1__Impl14320);
            rule__Restriction__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionAccess().getDescriptionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__Group_7__1__Impl"


    // $ANTLR start "rule__ASMLModel__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7150:1: rule__ASMLModel__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ASMLModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7154:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7155:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7155:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7156:1: RULE_ID_ASML
            {
             before(grammarAccess.getASMLModelAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114359); 
             after(grammarAccess.getASMLModelAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__NameAssignment_1"


    // $ANTLR start "rule__ASMLModel__ImportURIAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7165:1: rule__ASMLModel__ImportURIAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ASMLModel__ImportURIAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7169:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7170:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7170:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7171:1: RULE_STRING
            {
             before(grammarAccess.getASMLModelAccess().getImportURISTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114390); 
             after(grammarAccess.getASMLModelAccess().getImportURISTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__ImportURIAssignment_3_1"


    // $ANTLR start "rule__ASMLModel__ViewsAssignment_4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7180:1: rule__ASMLModel__ViewsAssignment_4 : ( ruleView ) ;
    public final void rule__ASMLModel__ViewsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7184:1: ( ( ruleView ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7185:1: ( ruleView )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7185:1: ( ruleView )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7186:1: ruleView
            {
             before(grammarAccess.getASMLModelAccess().getViewsViewParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414421);
            ruleView();

            state._fsp--;

             after(grammarAccess.getASMLModelAccess().getViewsViewParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__ViewsAssignment_4"


    // $ANTLR start "rule__ASMLModel__IgnoreAssignment_5_1_0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7195:1: rule__ASMLModel__IgnoreAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__ASMLModel__IgnoreAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7199:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7200:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7200:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7201:1: RULE_STRING
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreSTRINGTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ASMLModel__IgnoreAssignment_5_1_014452); 
             after(grammarAccess.getASMLModelAccess().getIgnoreSTRINGTerminalRuleCall_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASMLModel__IgnoreAssignment_5_1_0"


    // $ANTLR start "rule__View__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7210:1: rule__View__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7214:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7215:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7215:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7216:1: RULE_ID_ASML
            {
             before(grammarAccess.getViewAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114483); 
             after(grammarAccess.getViewAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__NameAssignment_1"


    // $ANTLR start "rule__View__AttributesAssignment_3_0_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7225:1: rule__View__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__View__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7229:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7230:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7230:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7231:1: ruleAttribute
            {
             before(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114514);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__AttributesAssignment_3_0_1"


    // $ANTLR start "rule__View__ComponentsAssignment_4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7240:1: rule__View__ComponentsAssignment_4 : ( ruleAbstractComponent ) ;
    public final void rule__View__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7244:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7245:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7245:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7246:1: ruleAbstractComponent
            {
             before(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414545);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ComponentsAssignment_4"


    // $ANTLR start "rule__View__RestrictionsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7255:1: rule__View__RestrictionsAssignment_5 : ( ruleRestriction ) ;
    public final void rule__View__RestrictionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7259:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7260:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7260:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7261:1: ruleRestriction
            {
             before(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514576);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__RestrictionsAssignment_5"


    // $ANTLR start "rule__AbstractComponent__RestrictionsAssignment_7_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7270:1: rule__AbstractComponent__RestrictionsAssignment_7_1 : ( ruleRestriction ) ;
    public final void rule__AbstractComponent__RestrictionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7274:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7275:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7275:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7276:1: ruleRestriction
            {
             before(grammarAccess.getAbstractComponentAccess().getRestrictionsRestrictionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__AbstractComponent__RestrictionsAssignment_7_114607);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getAbstractComponentAccess().getRestrictionsRestrictionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractComponent__RestrictionsAssignment_7_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7285:1: rule__Attribute__NameAssignment_0 : ( RULE_ID_ASML ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7289:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7290:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7290:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7291:1: RULE_ID_ASML
            {
             before(grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014638); 
             after(grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7300:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7304:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7305:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7305:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7306:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214669); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"


    // $ANTLR start "rule__ModuleMatching__ParameterAssignment"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7317:1: rule__ModuleMatching__ParameterAssignment : ( ruleModuleMatchingParamenter ) ;
    public final void rule__ModuleMatching__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7321:1: ( ( ruleModuleMatchingParamenter ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7322:1: ( ruleModuleMatchingParamenter )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7322:1: ( ruleModuleMatchingParamenter )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7323:1: ruleModuleMatchingParamenter
            {
             before(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment14702);
            ruleModuleMatchingParamenter();

            state._fsp--;

             after(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleMatching__ParameterAssignment"


    // $ANTLR start "rule__ClassMatching__ExpressionMatchingAssignment_0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7332:1: rule__ClassMatching__ExpressionMatchingAssignment_0 : ( ruleExpressionMatchingClause ) ;
    public final void rule__ClassMatching__ExpressionMatchingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7336:1: ( ( ruleExpressionMatchingClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7337:1: ( ruleExpressionMatchingClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7337:1: ( ruleExpressionMatchingClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7338:1: ruleExpressionMatchingClause
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_014733);
            ruleExpressionMatchingClause();

            state._fsp--;

             after(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__ExpressionMatchingAssignment_0"


    // $ANTLR start "rule__ClassMatching__ParameterAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7347:1: rule__ClassMatching__ParameterAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassMatching__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7351:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7352:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7352:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7353:1: RULE_STRING
            {
             before(grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_114764); 
             after(grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassMatching__ParameterAssignment_1"


    // $ANTLR start "rule__File__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7362:1: rule__File__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7366:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7367:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7367:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7368:1: RULE_ID_ASML
            {
             before(grammarAccess.getFileAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_114795); 
             after(grammarAccess.getFileAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__NameAssignment_1"


    // $ANTLR start "rule__File__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7377:1: rule__File__MatchingAssignment_3_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__File__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7381:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7382:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7382:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7383:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_114826);
            ruleAbstractNameConvetion();

            state._fsp--;

             after(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__MatchingAssignment_3_1"


    // $ANTLR start "rule__File__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7392:1: rule__File__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__File__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7396:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7397:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7397:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7398:1: ruleCardinality
            {
             before(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_114857);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__CardinalityAssignment_4_1"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7407:1: rule__Configuration__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7411:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7412:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7412:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7413:1: RULE_ID_ASML
            {
             before(grammarAccess.getConfigurationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_114888); 
             after(grammarAccess.getConfigurationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NameAssignment_1"


    // $ANTLR start "rule__Configuration__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7422:1: rule__Configuration__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Configuration__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7426:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7427:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7427:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7428:1: RULE_STRING
            {
             before(grammarAccess.getConfigurationAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_114919); 
             after(grammarAccess.getConfigurationAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__MatchingAssignment_3_1"


    // $ANTLR start "rule__Configuration__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7437:1: rule__Configuration__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Configuration__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7441:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7442:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7442:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7443:1: ruleCardinality
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_114950);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__CardinalityAssignment_4_1"


    // $ANTLR start "rule__Configuration__ConfigurationElementAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7452:1: rule__Configuration__ConfigurationElementAssignment_5 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__ConfigurationElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7456:1: ( ( ruleConfigurationElement ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7457:1: ( ruleConfigurationElement )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7457:1: ( ruleConfigurationElement )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7458:1: ruleConfigurationElement
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_514981);
            ruleConfigurationElement();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__ConfigurationElementAssignment_5"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7467:1: rule__Method__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7471:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7472:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7472:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7473:1: RULE_ID_ASML
            {
             before(grammarAccess.getMethodAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_115012); 
             after(grammarAccess.getMethodAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7482:1: rule__Method__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Method__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7486:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7487:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7487:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7488:1: RULE_STRING
            {
             before(grammarAccess.getMethodAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_115043); 
             after(grammarAccess.getMethodAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__MatchingAssignment_3_1"


    // $ANTLR start "rule__Method__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7497:1: rule__Method__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Method__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7501:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7502:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7502:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7503:1: ruleCardinality
            {
             before(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_115074);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__CardinalityAssignment_4_1"


    // $ANTLR start "rule__MetaClass__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7512:1: rule__MetaClass__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__MetaClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7516:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7517:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7517:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7518:1: RULE_ID_ASML
            {
             before(grammarAccess.getMetaClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__MetaClass__NameAssignment_115105); 
             after(grammarAccess.getMetaClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__NameAssignment_1"


    // $ANTLR start "rule__MetaClass__ExtendsAssignment_2_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7527:1: rule__MetaClass__ExtendsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MetaClass__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7531:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7532:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7532:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7533:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMetaClassAccess().getExtendsMetaClassCrossReference_2_1_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7534:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7535:1: ruleQualifiedName
            {
             before(grammarAccess.getMetaClassAccess().getExtendsMetaClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MetaClass__ExtendsAssignment_2_115140);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getExtendsMetaClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMetaClassAccess().getExtendsMetaClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__ExtendsAssignment_2_1"


    // $ANTLR start "rule__MetaClass__DescriptionAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7546:1: rule__MetaClass__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__MetaClass__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7550:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7551:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7551:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7552:1: RULE_STRING
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetaClass__DescriptionAssignment_4_115175); 
             after(grammarAccess.getMetaClassAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__DescriptionAssignment_4_1"


    // $ANTLR start "rule__MetaClass__MatchingAssignment_5_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7561:1: rule__MetaClass__MatchingAssignment_5_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__MetaClass__MatchingAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7565:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7566:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7566:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7567:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getMetaClassAccess().getMatchingAbstractNameConvetionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__MetaClass__MatchingAssignment_5_115206);
            ruleAbstractNameConvetion();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getMatchingAbstractNameConvetionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__MatchingAssignment_5_1"


    // $ANTLR start "rule__MetaClass__CardinalityAssignment_6_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7576:1: rule__MetaClass__CardinalityAssignment_6_1 : ( ruleCardinality ) ;
    public final void rule__MetaClass__CardinalityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7580:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7581:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7581:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7582:1: ruleCardinality
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityCardinalityEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__MetaClass__CardinalityAssignment_6_115237);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getCardinalityCardinalityEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__CardinalityAssignment_6_1"


    // $ANTLR start "rule__MetaClass__MethodsAssignment_7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7591:1: rule__MetaClass__MethodsAssignment_7 : ( ruleMethod ) ;
    public final void rule__MetaClass__MethodsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7595:1: ( ( ruleMethod ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7596:1: ( ruleMethod )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7596:1: ( ruleMethod )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7597:1: ruleMethod
            {
             before(grammarAccess.getMetaClassAccess().getMethodsMethodParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__MetaClass__MethodsAssignment_715268);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getMethodsMethodParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__MethodsAssignment_7"


    // $ANTLR start "rule__ExternalClass__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7606:1: rule__ExternalClass__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ExternalClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7610:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7611:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7611:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7612:1: RULE_ID_ASML
            {
             before(grammarAccess.getExternalClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ExternalClass__NameAssignment_115299); 
             after(grammarAccess.getExternalClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__NameAssignment_1"


    // $ANTLR start "rule__ExternalClass__DescriptionAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7621:1: rule__ExternalClass__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ExternalClass__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7625:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7626:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7626:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7627:1: RULE_STRING
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalClass__DescriptionAssignment_3_115330); 
             after(grammarAccess.getExternalClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__DescriptionAssignment_3_1"


    // $ANTLR start "rule__ExternalClass__TypeAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7636:1: rule__ExternalClass__TypeAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ExternalClass__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7640:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7641:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7641:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7642:1: RULE_STRING
            {
             before(grammarAccess.getExternalClassAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalClass__TypeAssignment_4_115361); 
             after(grammarAccess.getExternalClassAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalClass__TypeAssignment_4_1"


    // $ANTLR start "rule__XmlElement__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7651:1: rule__XmlElement__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7655:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7656:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7656:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7657:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlElementAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_115392); 
             after(grammarAccess.getXmlElementAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__NameAssignment_1"


    // $ANTLR start "rule__XmlElement__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7666:1: rule__XmlElement__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlElement__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7670:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7671:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7671:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7672:1: RULE_STRING
            {
             before(grammarAccess.getXmlElementAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115423); 
             after(grammarAccess.getXmlElementAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__MatchingAssignment_3_1"


    // $ANTLR start "rule__XmlElement__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7681:1: rule__XmlElement__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlElement__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7685:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7686:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7686:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7687:1: ruleCardinality
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115454);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlElement__CardinalityAssignment_4_1"


    // $ANTLR start "rule__XmlDocument__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7696:1: rule__XmlDocument__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlDocument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7700:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7701:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7701:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7702:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlDocumentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115485); 
             after(grammarAccess.getXmlDocumentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__NameAssignment_1"


    // $ANTLR start "rule__XmlDocument__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7711:1: rule__XmlDocument__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlDocument__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7715:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7716:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7716:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7717:1: RULE_STRING
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115516); 
             after(grammarAccess.getXmlDocumentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__MatchingAssignment_3_1"


    // $ANTLR start "rule__XmlDocument__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7726:1: rule__XmlDocument__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlDocument__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7730:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7731:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7731:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7732:1: ruleCardinality
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115547);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlDocument__CardinalityAssignment_4_1"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7741:1: rule__Module__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7745:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7746:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7746:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7747:1: RULE_ID_ASML
            {
             before(grammarAccess.getModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115578); 
             after(grammarAccess.getModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__AttributesAssignment_3_0_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7756:1: rule__Module__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__Module__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7760:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7761:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7761:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7762:1: ruleAttribute
            {
             before(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115609);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__AttributesAssignment_3_0_1"


    // $ANTLR start "rule__Module__MatchingAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7771:1: rule__Module__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__Module__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7775:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7776:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7776:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7777:1: ruleModuleMatching
            {
             before(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115640);
            ruleModuleMatching();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__MatchingAssignment_4_1"


    // $ANTLR start "rule__Module__ComponentsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7786:1: rule__Module__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__Module__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7790:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7791:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7791:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7792:1: ruleAbstractComponent
            {
             before(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_515671);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ComponentsAssignment_5"


    // $ANTLR start "rule__Module__RestrictionsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7801:1: rule__Module__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__Module__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7805:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7806:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7806:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7807:1: ruleRestriction
            {
             before(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_615702);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__RestrictionsAssignment_6"


    // $ANTLR start "rule__MetaModule__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7816:1: rule__MetaModule__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__MetaModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7820:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7821:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7821:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7822:1: RULE_ID_ASML
            {
             before(grammarAccess.getMetaModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_115733); 
             after(grammarAccess.getMetaModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__NameAssignment_1"


    // $ANTLR start "rule__MetaModule__AttributesAssignment_3_0_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7831:1: rule__MetaModule__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__MetaModule__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7835:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7836:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7836:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7837:1: ruleAttribute
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_115764);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__AttributesAssignment_3_0_1"


    // $ANTLR start "rule__MetaModule__MatchingAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7846:1: rule__MetaModule__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__MetaModule__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7850:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7851:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7851:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7852:1: ruleModuleMatching
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_115795);
            ruleModuleMatching();

            state._fsp--;

             after(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__MatchingAssignment_4_1"


    // $ANTLR start "rule__MetaModule__ComponentsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7861:1: rule__MetaModule__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__MetaModule__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7865:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7866:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7866:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7867:1: ruleAbstractComponent
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_515826);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__ComponentsAssignment_5"


    // $ANTLR start "rule__MetaModule__RestrictionsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7876:1: rule__MetaModule__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__MetaModule__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7880:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7881:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7881:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7882:1: ruleRestriction
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_615857);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaModule__RestrictionsAssignment_6"


    // $ANTLR start "rule__ExternalModule__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7891:1: rule__ExternalModule__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ExternalModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7895:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7896:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7896:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7897:1: RULE_ID_ASML
            {
             before(grammarAccess.getExternalModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ExternalModule__NameAssignment_115888); 
             after(grammarAccess.getExternalModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__NameAssignment_1"


    // $ANTLR start "rule__ExternalModule__AttributesAssignment_3_0_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7906:1: rule__ExternalModule__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__ExternalModule__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7910:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7911:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7911:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7912:1: ruleAttribute
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__ExternalModule__AttributesAssignment_3_0_115919);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getExternalModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__AttributesAssignment_3_0_1"


    // $ANTLR start "rule__ExternalModule__MatchingAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7921:1: rule__ExternalModule__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__ExternalModule__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7925:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7926:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7926:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7927:1: ruleModuleMatching
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__ExternalModule__MatchingAssignment_4_115950);
            ruleModuleMatching();

            state._fsp--;

             after(grammarAccess.getExternalModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__MatchingAssignment_4_1"


    // $ANTLR start "rule__ExternalModule__ComponentsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7936:1: rule__ExternalModule__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__ExternalModule__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7940:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7941:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7941:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7942:1: ruleAbstractComponent
            {
             before(grammarAccess.getExternalModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__ExternalModule__ComponentsAssignment_515981);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getExternalModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__ComponentsAssignment_5"


    // $ANTLR start "rule__ExternalModule__RestrictionsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7951:1: rule__ExternalModule__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__ExternalModule__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7955:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7956:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7956:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7957:1: ruleRestriction
            {
             before(grammarAccess.getExternalModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__ExternalModule__RestrictionsAssignment_616012);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getExternalModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalModule__RestrictionsAssignment_6"


    // $ANTLR start "rule__Restriction__GroupClauseAssignment_2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7966:1: rule__Restriction__GroupClauseAssignment_2 : ( ruleGroupClause ) ;
    public final void rule__Restriction__GroupClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7970:1: ( ( ruleGroupClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7971:1: ( ruleGroupClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7971:1: ( ruleGroupClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7972:1: ruleGroupClause
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_216043);
            ruleGroupClause();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__GroupClauseAssignment_2"


    // $ANTLR start "rule__Restriction__ComponentAAssignment_3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7981:1: rule__Restriction__ComponentAAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentAAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7985:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7986:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7986:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7987:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7988:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7989:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_316078);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__ComponentAAssignment_3"


    // $ANTLR start "rule__Restriction__PermissionClauseAssignment_4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8000:1: rule__Restriction__PermissionClauseAssignment_4 : ( rulePermissionClause ) ;
    public final void rule__Restriction__PermissionClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8004:1: ( ( rulePermissionClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8005:1: ( rulePermissionClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8005:1: ( rulePermissionClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8006:1: rulePermissionClause
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_416113);
            rulePermissionClause();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__PermissionClauseAssignment_4"


    // $ANTLR start "rule__Restriction__RelactionTypeAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8015:1: rule__Restriction__RelactionTypeAssignment_5 : ( ruleRelactionType ) ;
    public final void rule__Restriction__RelactionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8019:1: ( ( ruleRelactionType ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8020:1: ( ruleRelactionType )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8020:1: ( ruleRelactionType )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8021:1: ruleRelactionType
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_516144);
            ruleRelactionType();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__RelactionTypeAssignment_5"


    // $ANTLR start "rule__Restriction__ComponentBAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8030:1: rule__Restriction__ComponentBAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8034:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8035:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8035:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8036:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8037:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8038:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_616179);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__ComponentBAssignment_6"


    // $ANTLR start "rule__Restriction__DescriptionAssignment_7_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8049:1: rule__Restriction__DescriptionAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Restriction__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8053:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8054:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8054:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8055:1: RULE_STRING
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Restriction__DescriptionAssignment_7_116214); 
             after(grammarAccess.getRestrictionAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restriction__DescriptionAssignment_7_1"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\37\uffff";
    static final String DFA20_eofS =
        "\1\1\36\uffff";
    static final String DFA20_minS =
        "\1\52\1\uffff\1\51\6\5\3\36\12\5\1\36\1\5\1\52\2\5\1\4\1\uffff"+
        "\2\52";
    static final String DFA20_maxS =
        "\1\103\1\uffff\1\51\5\47\1\102\3\47\12\5\1\47\1\5\2\102\1\5\1\4"+
        "\1\uffff\1\102\1\52";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\32\uffff\1\1\2\uffff";
    static final String DFA20_specialS =
        "\37\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\4\uffff\1\1\2\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\5\1\1\uffff\1\2",
            "",
            "\1\3",
            "\1\10\21\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\32\uffff\1\27",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\31",
            "\1\34\16\uffff\1\33\10\uffff\1\32",
            "\1\10\21\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\32\uffff\1\27",
            "\1\35",
            "\1\36",
            "",
            "\1\34\16\uffff\1\33\10\uffff\1\32",
            "\1\34"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 2021:1: ( rule__AbstractComponent__RestrictionsAssignment_7_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleASMLModel_in_entryRuleASMLModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASMLModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__0_in_ruleASMLModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractComponent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractComponent__Alternatives_in_ruleAbstractComponent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNameConvetion308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractNameConvetion__Alternatives_in_ruleAbstractNameConvetion334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleMatching370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleMatching__ParameterAssignment_in_ruleModuleMatching396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_entryRuleClassMatching423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMatching430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__0_in_ruleClassMatching456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaClass_in_entryRuleMetaClass723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaClass730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__0_in_ruleMetaClass756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_entryRuleExternalClass783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalClass790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__0_in_ruleExternalClass816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__0_in_ruleXmlElement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlDocument910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__0_in_ruleXmlDocument936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_entryRuleMetaModule1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModule1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__0_in_ruleMetaModule1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalModule_in_entryRuleExternalModule1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalModule1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__0_in_ruleExternalModule1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0_in_ruleRestriction1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionMatchingClause__Alternatives_in_ruleExpressionMatchingClause1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleMatchingParamenter__Alternatives_in_ruleModuleMatchingParamenter1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupClause__Alternatives_in_ruleGroupClause1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PermissionClause__Alternatives_in_rulePermissionClause1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelactionType__Alternatives_in_ruleRelactionType1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__AbstractComponent__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_rule__AbstractComponent__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalModule_in_rule__AbstractComponent__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaClass_in_rule__AbstractComponent__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_rule__AbstractComponent__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__AbstractComponent__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__AbstractComponent__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractComponent__Group_7__0_in_rule__AbstractComponent__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExpressionMatchingClause__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModuleMatchingParamenter__Alternatives1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModuleMatchingParamenter__Alternatives2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GroupClause__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GroupClause__Alternatives2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GroupClause__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GroupClause__Alternatives2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PermissionClause__Alternatives2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PermissionClause__Alternatives2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PermissionClause__Alternatives2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PermissionClause__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RelactionType__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelactionType__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RelactionType__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RelactionType__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RelactionType__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RelactionType__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelactionType__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RelactionType__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RelactionType__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RelactionType__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ASMLModel__Group__0__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12532 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22592 = new BitSet(new long[]{0x0000AC0000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ASMLModel__Group__2__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32654 = new BitSet(new long[]{0x0000AC0000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42715 = new BitSet(new long[]{0x0000AC0000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl2745 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__52776 = new BitSet(new long[]{0x0000AC0000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__6_in_rule__ASMLModel__Group__52779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__0_in_rule__ASMLModel__Group__5__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__6__Impl_in_rule__ASMLModel__Group__62837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ASMLModel__Group__6__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__02910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ASMLModel__Group_3__0__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__12972 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__23032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ASMLModel__Group_3__2__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__0__Impl_in_rule__ASMLModel__Group_5__03097 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__1_in_rule__ASMLModel__Group_5__03100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ASMLModel__Group_5__0__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__1__Impl_in_rule__ASMLModel__Group_5__13159 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__2_in_rule__ASMLModel__Group_5__13162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__0_in_rule__ASMLModel__Group_5__1__Impl3189 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__2__Impl_in_rule__ASMLModel__Group_5__23220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ASMLModel__Group_5__2__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__0__Impl_in_rule__ASMLModel__Group_5_1__03285 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__1_in_rule__ASMLModel__Group_5_1__03288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__IgnoreAssignment_5_1_0_in_rule__ASMLModel__Group_5_1__0__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__1__Impl_in_rule__ASMLModel__Group_5_1__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ASMLModel__Group_5_1__1__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__03414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__View__Group__0__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13473 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23533 = new BitSet(new long[]{0xE8E5940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__23536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__View__Group__2__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33595 = new BitSet(new long[]{0xE8E5940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__33598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43656 = new BitSet(new long[]{0xE8E5940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__43659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3686 = new BitSet(new long[]{0xE8E4800000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53717 = new BitSet(new long[]{0xE8E5940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__53720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__View__Group__6__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03851 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3881 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__View__Group_3__1__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__View__Group_3_0__0__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__14037 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__14040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__24097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__View__Group_3_0__2__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractComponent__Group_7__0__Impl_in_rule__AbstractComponent__Group_7__04165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__AbstractComponent__Group_7__1_in_rule__AbstractComponent__Group_7__04168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__AbstractComponent__Group_7__0__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractComponent__Group_7__1__Impl_in_rule__AbstractComponent__Group_7__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractComponent__RestrictionsAssignment_7_1_in_rule__AbstractComponent__Group_7__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04286 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Attribute__Group__1__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__04471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__04474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__14531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__04592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__04595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__File__Group__0__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__14654 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__14657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__24714 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__24717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__File__Group__2__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__34776 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__File__Group__4_in_rule__File__Group__34779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__44837 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__File__Group__5_in_rule__File__Group__44840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__54898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__File__Group__5__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__04969 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__04972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__File__Group_3__0__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__15031 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__25091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__File__Group_3__2__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__05156 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__05159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__File__Group_4__0__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__15218 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__25278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__File__Group_4__2__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__05343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Configuration__Group__0__Impl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__15405 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__15408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__25465 = new BitSet(new long[]{0x603C040000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__25468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Configuration__Group__2__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__35527 = new BitSet(new long[]{0x603C040000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__35530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__45588 = new BitSet(new long[]{0x603C040000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__45591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__55649 = new BitSet(new long[]{0x603C040000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__55652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl5679 = new BitSet(new long[]{0x6024000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__65710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Configuration__Group__6__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__05783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__05786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Configuration__Group_3__0__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__15845 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__25905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Configuration__Group_3__2__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__05970 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__05973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Configuration__Group_4__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__16032 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__16035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__26092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Configuration__Group_4__2__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__06157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Method__Group__0__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16219 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26279 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Method__Group__2__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36341 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46402 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Method__Group__5__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Method__Group_3__0__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16596 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__26656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Method__Group_3__2__Impl6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__06721 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__06724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Method__Group_4__0__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__16783 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__16786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__26843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Method__Group_4__2__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__06908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__06911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__MetaClass__Group__0__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__16970 = new BitSet(new long[]{0x0100020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__27030 = new BitSet(new long[]{0x0100020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__27033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_2__0_in_rule__MetaClass__Group__2__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__37091 = new BitSet(new long[]{0x0650040000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__37094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaClass__Group__3__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__47153 = new BitSet(new long[]{0x0650040000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__47156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__0_in_rule__MetaClass__Group__4__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__57214 = new BitSet(new long[]{0x0650040000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__57217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__0_in_rule__MetaClass__Group__5__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__67275 = new BitSet(new long[]{0x0650040000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__67278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__0_in_rule__MetaClass__Group__6__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__77336 = new BitSet(new long[]{0x0650040000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__8_in_rule__MetaClass__Group__77339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__MethodsAssignment_7_in_rule__MetaClass__Group__7__Impl7366 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__8__Impl_in_rule__MetaClass__Group__87397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MetaClass__Group__8__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_2__0__Impl_in_rule__MetaClass__Group_2__07474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_2__1_in_rule__MetaClass__Group_2__07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__MetaClass__Group_2__0__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_2__1__Impl_in_rule__MetaClass__Group_2__17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__ExtendsAssignment_2_1_in_rule__MetaClass__Group_2__1__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__0__Impl_in_rule__MetaClass__Group_4__07597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__1_in_rule__MetaClass__Group_4__07600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__MetaClass__Group_4__0__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__1__Impl_in_rule__MetaClass__Group_4__17659 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__2_in_rule__MetaClass__Group_4__17662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__DescriptionAssignment_4_1_in_rule__MetaClass__Group_4__1__Impl7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__2__Impl_in_rule__MetaClass__Group_4__27719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MetaClass__Group_4__2__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__0__Impl_in_rule__MetaClass__Group_5__07784 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__1_in_rule__MetaClass__Group_5__07787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__MetaClass__Group_5__0__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__1__Impl_in_rule__MetaClass__Group_5__17846 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__2_in_rule__MetaClass__Group_5__17849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__MatchingAssignment_5_1_in_rule__MetaClass__Group_5__1__Impl7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__2__Impl_in_rule__MetaClass__Group_5__27906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MetaClass__Group_5__2__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__0__Impl_in_rule__MetaClass__Group_6__07971 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__1_in_rule__MetaClass__Group_6__07974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MetaClass__Group_6__0__Impl8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__1__Impl_in_rule__MetaClass__Group_6__18033 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__2_in_rule__MetaClass__Group_6__18036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__CardinalityAssignment_6_1_in_rule__MetaClass__Group_6__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_6__2__Impl_in_rule__MetaClass__Group_6__28093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MetaClass__Group_6__2__Impl8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__0__Impl_in_rule__ExternalClass__Group__08158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__1_in_rule__ExternalClass__Group__08161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ExternalClass__Group__0__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__1__Impl_in_rule__ExternalClass__Group__18220 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__2_in_rule__ExternalClass__Group__18223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__NameAssignment_1_in_rule__ExternalClass__Group__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__2__Impl_in_rule__ExternalClass__Group__28280 = new BitSet(new long[]{0x1200040000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__3_in_rule__ExternalClass__Group__28283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExternalClass__Group__2__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__3__Impl_in_rule__ExternalClass__Group__38342 = new BitSet(new long[]{0x1200040000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__4_in_rule__ExternalClass__Group__38345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__0_in_rule__ExternalClass__Group__3__Impl8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__4__Impl_in_rule__ExternalClass__Group__48403 = new BitSet(new long[]{0x1200040000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__5_in_rule__ExternalClass__Group__48406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__0_in_rule__ExternalClass__Group__4__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__5__Impl_in_rule__ExternalClass__Group__58464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExternalClass__Group__5__Impl8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__0__Impl_in_rule__ExternalClass__Group_3__08535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__1_in_rule__ExternalClass__Group_3__08538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ExternalClass__Group_3__0__Impl8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__1__Impl_in_rule__ExternalClass__Group_3__18597 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__2_in_rule__ExternalClass__Group_3__18600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__DescriptionAssignment_3_1_in_rule__ExternalClass__Group_3__1__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__2__Impl_in_rule__ExternalClass__Group_3__28657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalClass__Group_3__2__Impl8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__0__Impl_in_rule__ExternalClass__Group_4__08722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__1_in_rule__ExternalClass__Group_4__08725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ExternalClass__Group_4__0__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__1__Impl_in_rule__ExternalClass__Group_4__18784 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__2_in_rule__ExternalClass__Group_4__18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__TypeAssignment_4_1_in_rule__ExternalClass__Group_4__1__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__2__Impl_in_rule__ExternalClass__Group_4__28844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalClass__Group_4__2__Impl8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__08909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__08912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__XmlElement__Group__0__Impl8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__18971 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__18974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__29031 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__29034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XmlElement__Group__2__Impl9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__39093 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__39096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__49154 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__49157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__59215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__XmlElement__Group__5__Impl9243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__09286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__09289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlElement__Group_3__0__Impl9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19348 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__XmlElement__Group_3__2__Impl9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__09473 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__09476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__XmlElement__Group_4__0__Impl9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__19535 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__19538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__29595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__XmlElement__Group_4__2__Impl9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__09660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__09663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__XmlDocument__Group__0__Impl9691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__19722 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__19725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__29782 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__29785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XmlDocument__Group__2__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__39844 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__39847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl9874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__49905 = new BitSet(new long[]{0x0018040000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__49908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__59966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__XmlDocument__Group__5__Impl9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__010037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__010040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlDocument__Group_3__0__Impl10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__110099 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__110102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__210159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__XmlDocument__Group_3__2__Impl10187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__010224 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__010227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__XmlDocument__Group_4__0__Impl10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__110286 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__110289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__XmlDocument__Group_4__2__Impl10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__010411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__010414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Module__Group__0__Impl10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__110473 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__110476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__210533 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__210536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Module__Group__2__Impl10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__310595 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__310598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl10625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__410656 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__410659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__510717 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__510720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl10747 = new BitSet(new long[]{0xE8E4800000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__610778 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__610781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl10808 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__710839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Module__Group__7__Impl10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__010914 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__010917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl10944 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__110975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Module__Group_3__1__Impl11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__011038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__011041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Module__Group_3_0__0__Impl11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__111100 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__111103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl11130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__211160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Module__Group_3_0__2__Impl11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__011228 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__011231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Module__Group_4__0__Impl11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__111290 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__111293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__211350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Module__Group_4__2__Impl11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__011415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__011418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__MetaModule__Group__0__Impl11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__111477 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__111480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl11507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__211537 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__211540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaModule__Group__2__Impl11568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__311599 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__311602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__411660 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__411663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__511721 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__511724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl11751 = new BitSet(new long[]{0xE8E4800000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__611782 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__611785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl11812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__711843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MetaModule__Group__7__Impl11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__011918 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__011921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl11948 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__111979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MetaModule__Group_3__1__Impl12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__012042 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__012045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MetaModule__Group_3_0__0__Impl12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__112104 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__112107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__212164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__MetaModule__Group_3_0__2__Impl12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__012232 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__012235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MetaModule__Group_4__0__Impl12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__112294 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__112297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__212354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MetaModule__Group_4__2__Impl12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__0__Impl_in_rule__ExternalModule__Group__012419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__1_in_rule__ExternalModule__Group__012422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ExternalModule__Group__0__Impl12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__1__Impl_in_rule__ExternalModule__Group__112481 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__2_in_rule__ExternalModule__Group__112484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__NameAssignment_1_in_rule__ExternalModule__Group__1__Impl12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__2__Impl_in_rule__ExternalModule__Group__212541 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__3_in_rule__ExternalModule__Group__212544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExternalModule__Group__2__Impl12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__3__Impl_in_rule__ExternalModule__Group__312603 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__4_in_rule__ExternalModule__Group__312606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__0_in_rule__ExternalModule__Group__3__Impl12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__4__Impl_in_rule__ExternalModule__Group__412664 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__5_in_rule__ExternalModule__Group__412667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__0_in_rule__ExternalModule__Group__4__Impl12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__5__Impl_in_rule__ExternalModule__Group__512725 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__6_in_rule__ExternalModule__Group__512728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__ComponentsAssignment_5_in_rule__ExternalModule__Group__5__Impl12755 = new BitSet(new long[]{0xE8E4800000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__6__Impl_in_rule__ExternalModule__Group__612786 = new BitSet(new long[]{0xE8ED940000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__7_in_rule__ExternalModule__Group__612789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__RestrictionsAssignment_6_in_rule__ExternalModule__Group__6__Impl12816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__7__Impl_in_rule__ExternalModule__Group__712847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExternalModule__Group__7__Impl12875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__0__Impl_in_rule__ExternalModule__Group_3__012922 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__1_in_rule__ExternalModule__Group_3__012925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__0_in_rule__ExternalModule__Group_3__0__Impl12952 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__1__Impl_in_rule__ExternalModule__Group_3__112983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalModule__Group_3__1__Impl13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__0__Impl_in_rule__ExternalModule__Group_3_0__013046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__1_in_rule__ExternalModule__Group_3_0__013049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ExternalModule__Group_3_0__0__Impl13077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__1__Impl_in_rule__ExternalModule__Group_3_0__113108 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__2_in_rule__ExternalModule__Group_3_0__113111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__AttributesAssignment_3_0_1_in_rule__ExternalModule__Group_3_0__1__Impl13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__2__Impl_in_rule__ExternalModule__Group_3_0__213168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ExternalModule__Group_3_0__2__Impl13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__0__Impl_in_rule__ExternalModule__Group_4__013236 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__1_in_rule__ExternalModule__Group_4__013239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ExternalModule__Group_4__0__Impl13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__1__Impl_in_rule__ExternalModule__Group_4__113298 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__2_in_rule__ExternalModule__Group_4__113301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__MatchingAssignment_4_1_in_rule__ExternalModule__Group_4__1__Impl13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__2__Impl_in_rule__ExternalModule__Group_4__213358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalModule__Group_4__2__Impl13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13509 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013666 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Restriction__Group__0__Impl13697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113728 = new BitSet(new long[]{0x000000FFFF800020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Restriction__Group__1__Impl13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213790 = new BitSet(new long[]{0x000000FFFF800020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__213793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl13820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__313851 = new BitSet(new long[]{0x000000FFFF800020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__313854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl13881 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__413912 = new BitSet(new long[]{0x000000FFFF800020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__413915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__513973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__513976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl14003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__614033 = new BitSet(new long[]{0x0200040000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__614036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__714093 = new BitSet(new long[]{0x0200040000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__8_in_rule__Restriction__Group__714096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__0_in_rule__Restriction__Group__7__Impl14123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__8__Impl_in_rule__Restriction__Group__814154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Restriction__Group__8__Impl14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__0__Impl_in_rule__Restriction__Group_7__014231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__1_in_rule__Restriction__Group_7__014234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Restriction__Group_7__0__Impl14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__1__Impl_in_rule__Restriction__Group_7__114293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__DescriptionAssignment_7_1_in_rule__Restriction__Group_7__1__Impl14320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ASMLModel__IgnoreAssignment_5_1_014452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__AbstractComponent__RestrictionsAssignment_7_114607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment14702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_014733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_114764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_114795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_114826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_114857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_114888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_114919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_114950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_514981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_115012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_115043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_115074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__MetaClass__NameAssignment_115105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MetaClass__ExtendsAssignment_2_115140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetaClass__DescriptionAssignment_4_115175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__MetaClass__MatchingAssignment_5_115206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__MetaClass__CardinalityAssignment_6_115237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__MetaClass__MethodsAssignment_715268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ExternalClass__NameAssignment_115299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalClass__DescriptionAssignment_3_115330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalClass__TypeAssignment_4_115361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_115392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_515671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_615702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_115733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_115764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_115795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_515826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_615857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ExternalModule__NameAssignment_115888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__ExternalModule__AttributesAssignment_3_0_115919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__ExternalModule__MatchingAssignment_4_115950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__ExternalModule__ComponentsAssignment_515981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__ExternalModule__RestrictionsAssignment_616012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_216043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_316078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_416113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_516144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_616179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Restriction__DescriptionAssignment_7_116214 = new BitSet(new long[]{0x0000000000000002L});

}