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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID_ASML", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'0'", "'1..*'", "'0..*'", "'name start with'", "'name ends with'", "'by package name'", "'by folder name'", "'by package and folder name'", "'by external implementation'", "'null'", "'only'", "'any'", "'no one'", "'must'", "'can'", "'cannot'", "'access'", "'declare'", "'handle'", "'extend'", "'implement'", "'create'", "'throw'", "'use annotation'", "'depend'", "'requires'", "'architecture'", "'{'", "'}'", "'import'", "';'", "'ignore'", "','", "'view'", "'attributes'", "':'", "'file'", "'matching'", "'cardinality'", "'configuration'", "'method'", "'meta-class'", "'description'", "'matching:'", "'external-class'", "'type'", "'xmlElement'", "'xmlDocument'", "'module'", "'meta-module'", "'external-module'", "'.'", "'restriction'"
    };
    public static final int RULE_ID_ASML=5;
    public static final int RULE_ID=6;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:736:1: rule__AbstractComponent__Alternatives : ( ( ruleModule ) | ( ruleMetaModule ) | ( ruleExternalModule ) | ( ruleMetaClass ) | ( ruleExternalClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) );
    public final void rule__AbstractComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:740:1: ( ( ruleModule ) | ( ruleMetaModule ) | ( ruleExternalModule ) | ( ruleMetaClass ) | ( ruleExternalClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt1=1;
                }
                break;
            case 62:
                {
                alt1=2;
                }
                break;
            case 63:
                {
                alt1=3;
                }
                break;
            case 54:
                {
                alt1=4;
                }
                break;
            case 57:
                {
                alt1=5;
                }
                break;
            case 53:
                {
                alt1=6;
                }
                break;
            case 49:
            case 52:
            case 59:
            case 60:
                {
                alt1=7;
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

            }
        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:788:1: rule__AbstractNameConvetion__Alternatives : ( ( RULE_STRING ) | ( ruleClassMatching ) );
    public final void rule__AbstractNameConvetion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:792:1: ( ( RULE_STRING ) | ( ruleClassMatching ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:793:1: ( RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:793:1: ( RULE_STRING )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:794:1: RULE_STRING
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1622); 
                     after(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:799:6: ( ruleClassMatching )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:799:6: ( ruleClassMatching )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:800:1: ruleClassMatching
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1639);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:811:1: rule__ConfigurationElement__Alternatives : ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:815:1: ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 60:
                {
                alt3=2;
                }
                break;
            case 59:
                {
                alt3=3;
                }
                break;
            case 49:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:816:1: ( ruleConfiguration )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:816:1: ( ruleConfiguration )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:817:1: ruleConfiguration
                    {
                     before(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1672);
                    ruleConfiguration();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:822:6: ( ruleXmlDocument )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:822:6: ( ruleXmlDocument )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:823:1: ruleXmlDocument
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1689);
                    ruleXmlDocument();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:6: ( ruleXmlElement )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:6: ( ruleXmlElement )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:829:1: ruleXmlElement
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1706);
                    ruleXmlElement();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:834:6: ( ruleFile )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:834:6: ( ruleFile )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:835:1: ruleFile
                    {
                     before(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1723);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:845:1: rule__Cardinality__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:849:1: ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) )
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:850:1: ( ( '1' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:850:1: ( ( '1' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:851:1: ( '1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:852:1: ( '1' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:852:3: '1'
                    {
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives1756); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:857:6: ( ( '0' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:857:6: ( ( '0' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:858:1: ( '0' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:859:1: ( '0' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:859:3: '0'
                    {
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives1777); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:864:6: ( ( '1..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:864:6: ( ( '1..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:865:1: ( '1..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:866:1: ( '1..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:866:3: '1..*'
                    {
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives1798); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:871:6: ( ( '0..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:871:6: ( ( '0..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:872:1: ( '0..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:873:1: ( '0..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:873:3: '0..*'
                    {
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives1819); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:883:1: rule__ExpressionMatchingClause__Alternatives : ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) );
    public final void rule__ExpressionMatchingClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:887:1: ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:888:1: ( ( 'name start with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:888:1: ( ( 'name start with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:889:1: ( 'name start with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:890:1: ( 'name start with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:890:3: 'name start with'
                    {
                    match(input,16,FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives1855); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:895:6: ( ( 'name ends with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:895:6: ( ( 'name ends with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:896:1: ( 'name ends with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:897:1: ( 'name ends with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:897:3: 'name ends with'
                    {
                    match(input,17,FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives1876); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:907:1: rule__ModuleMatchingParamenter__Alternatives : ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) );
    public final void rule__ModuleMatchingParamenter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:911:1: ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:912:1: ( ( 'by package name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:912:1: ( ( 'by package name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:913:1: ( 'by package name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:914:1: ( 'by package name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:914:3: 'by package name'
                    {
                    match(input,18,FOLLOW_18_in_rule__ModuleMatchingParamenter__Alternatives1912); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:919:6: ( ( 'by folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:919:6: ( ( 'by folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:920:1: ( 'by folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:921:1: ( 'by folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:921:3: 'by folder name'
                    {
                    match(input,19,FOLLOW_19_in_rule__ModuleMatchingParamenter__Alternatives1933); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:926:6: ( ( 'by package and folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:926:6: ( ( 'by package and folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:927:1: ( 'by package and folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:928:1: ( 'by package and folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:928:3: 'by package and folder name'
                    {
                    match(input,20,FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives1954); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:933:6: ( ( 'by external implementation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:933:6: ( ( 'by external implementation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:934:1: ( 'by external implementation' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:935:1: ( 'by external implementation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:935:3: 'by external implementation'
                    {
                    match(input,21,FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives1975); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:945:1: rule__GroupClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) );
    public final void rule__GroupClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:949:1: ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:950:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:950:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:951:1: ( 'null' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:952:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:952:3: 'null'
                    {
                    match(input,22,FOLLOW_22_in_rule__GroupClause__Alternatives2011); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:957:6: ( ( 'only' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:957:6: ( ( 'only' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:958:1: ( 'only' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:959:1: ( 'only' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:959:3: 'only'
                    {
                    match(input,23,FOLLOW_23_in_rule__GroupClause__Alternatives2032); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:964:6: ( ( 'any' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:964:6: ( ( 'any' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:965:1: ( 'any' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:966:1: ( 'any' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:966:3: 'any'
                    {
                    match(input,24,FOLLOW_24_in_rule__GroupClause__Alternatives2053); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:971:6: ( ( 'no one' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:971:6: ( ( 'no one' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:972:1: ( 'no one' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:973:1: ( 'no one' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:973:3: 'no one'
                    {
                    match(input,25,FOLLOW_25_in_rule__GroupClause__Alternatives2074); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:983:1: rule__PermissionClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) );
    public final void rule__PermissionClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:987:1: ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 28:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:988:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:988:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:989:1: ( 'null' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:990:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:990:3: 'null'
                    {
                    match(input,22,FOLLOW_22_in_rule__PermissionClause__Alternatives2110); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:995:6: ( ( 'must' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:995:6: ( ( 'must' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:996:1: ( 'must' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:997:1: ( 'must' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:997:3: 'must'
                    {
                    match(input,26,FOLLOW_26_in_rule__PermissionClause__Alternatives2131); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1002:6: ( ( 'can' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1002:6: ( ( 'can' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1003:1: ( 'can' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1004:1: ( 'can' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1004:3: 'can'
                    {
                    match(input,27,FOLLOW_27_in_rule__PermissionClause__Alternatives2152); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1009:6: ( ( 'cannot' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1009:6: ( ( 'cannot' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1010:1: ( 'cannot' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1011:1: ( 'cannot' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1011:3: 'cannot'
                    {
                    match(input,28,FOLLOW_28_in_rule__PermissionClause__Alternatives2173); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1021:1: rule__RelactionType__Alternatives : ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) );
    public final void rule__RelactionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1025:1: ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            case 34:
                {
                alt9=6;
                }
                break;
            case 35:
                {
                alt9=7;
                }
                break;
            case 36:
                {
                alt9=8;
                }
                break;
            case 37:
                {
                alt9=9;
                }
                break;
            case 38:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1026:1: ( ( 'access' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1026:1: ( ( 'access' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1027:1: ( 'access' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1028:1: ( 'access' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1028:3: 'access'
                    {
                    match(input,29,FOLLOW_29_in_rule__RelactionType__Alternatives2209); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1033:6: ( ( 'declare' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1033:6: ( ( 'declare' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1034:1: ( 'declare' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1035:1: ( 'declare' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1035:3: 'declare'
                    {
                    match(input,30,FOLLOW_30_in_rule__RelactionType__Alternatives2230); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1040:6: ( ( 'handle' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1040:6: ( ( 'handle' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1041:1: ( 'handle' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1042:1: ( 'handle' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1042:3: 'handle'
                    {
                    match(input,31,FOLLOW_31_in_rule__RelactionType__Alternatives2251); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1047:6: ( ( 'extend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1047:6: ( ( 'extend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1048:1: ( 'extend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1049:1: ( 'extend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1049:3: 'extend'
                    {
                    match(input,32,FOLLOW_32_in_rule__RelactionType__Alternatives2272); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1054:6: ( ( 'implement' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1054:6: ( ( 'implement' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1055:1: ( 'implement' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1056:1: ( 'implement' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1056:3: 'implement'
                    {
                    match(input,33,FOLLOW_33_in_rule__RelactionType__Alternatives2293); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1061:6: ( ( 'create' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1061:6: ( ( 'create' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1062:1: ( 'create' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1063:1: ( 'create' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1063:3: 'create'
                    {
                    match(input,34,FOLLOW_34_in_rule__RelactionType__Alternatives2314); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1068:6: ( ( 'throw' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1068:6: ( ( 'throw' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1069:1: ( 'throw' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1070:1: ( 'throw' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1070:3: 'throw'
                    {
                    match(input,35,FOLLOW_35_in_rule__RelactionType__Alternatives2335); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1075:6: ( ( 'use annotation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1075:6: ( ( 'use annotation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1076:1: ( 'use annotation' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1077:1: ( 'use annotation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1077:3: 'use annotation'
                    {
                    match(input,36,FOLLOW_36_in_rule__RelactionType__Alternatives2356); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1082:6: ( ( 'depend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1082:6: ( ( 'depend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1083:1: ( 'depend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1084:1: ( 'depend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1084:3: 'depend'
                    {
                    match(input,37,FOLLOW_37_in_rule__RelactionType__Alternatives2377); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1089:6: ( ( 'requires' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1089:6: ( ( 'requires' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1090:1: ( 'requires' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1091:1: ( 'requires' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1091:3: 'requires'
                    {
                    match(input,38,FOLLOW_38_in_rule__RelactionType__Alternatives2398); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1103:1: rule__ASMLModel__Group__0 : rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 ;
    public final void rule__ASMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1107:1: ( rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1108:2: rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02431);
            rule__ASMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02434);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1115:1: rule__ASMLModel__Group__0__Impl : ( 'architecture' ) ;
    public final void rule__ASMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1119:1: ( ( 'architecture' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1120:1: ( 'architecture' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1120:1: ( 'architecture' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1121:1: 'architecture'
            {
             before(grammarAccess.getASMLModelAccess().getArchitectureKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ASMLModel__Group__0__Impl2462); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1134:1: rule__ASMLModel__Group__1 : rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 ;
    public final void rule__ASMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1138:1: ( rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1139:2: rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12493);
            rule__ASMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12496);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1146:1: rule__ASMLModel__Group__1__Impl : ( ( rule__ASMLModel__NameAssignment_1 ) ) ;
    public final void rule__ASMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1150:1: ( ( ( rule__ASMLModel__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1151:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1151:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1152:1: ( rule__ASMLModel__NameAssignment_1 )
            {
             before(grammarAccess.getASMLModelAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1153:1: ( rule__ASMLModel__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1153:2: rule__ASMLModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2523);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1163:1: rule__ASMLModel__Group__2 : rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 ;
    public final void rule__ASMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1167:1: ( rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1168:2: rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22553);
            rule__ASMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22556);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1175:1: rule__ASMLModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ASMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1179:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1180:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1180:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1181:1: '{'
            {
             before(grammarAccess.getASMLModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__ASMLModel__Group__2__Impl2584); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1194:1: rule__ASMLModel__Group__3 : rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 ;
    public final void rule__ASMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1198:1: ( rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1199:2: rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32615);
            rule__ASMLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32618);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1206:1: rule__ASMLModel__Group__3__Impl : ( ( rule__ASMLModel__Group_3__0 )? ) ;
    public final void rule__ASMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1210:1: ( ( ( rule__ASMLModel__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1211:1: ( ( rule__ASMLModel__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1211:1: ( ( rule__ASMLModel__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1212:1: ( rule__ASMLModel__Group_3__0 )?
            {
             before(grammarAccess.getASMLModelAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1213:1: ( rule__ASMLModel__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1213:2: rule__ASMLModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2645);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1223:1: rule__ASMLModel__Group__4 : rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 ;
    public final void rule__ASMLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1227:1: ( rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1228:2: rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42676);
            rule__ASMLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42679);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1235:1: rule__ASMLModel__Group__4__Impl : ( ( rule__ASMLModel__ViewsAssignment_4 )* ) ;
    public final void rule__ASMLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1239:1: ( ( ( rule__ASMLModel__ViewsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1240:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1240:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1241:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            {
             before(grammarAccess.getASMLModelAccess().getViewsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1242:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1242:2: rule__ASMLModel__ViewsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl2706);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1252:1: rule__ASMLModel__Group__5 : rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6 ;
    public final void rule__ASMLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1256:1: ( rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1257:2: rule__ASMLModel__Group__5__Impl rule__ASMLModel__Group__6
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__52737);
            rule__ASMLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__6_in_rule__ASMLModel__Group__52740);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1264:1: rule__ASMLModel__Group__5__Impl : ( ( rule__ASMLModel__Group_5__0 )? ) ;
    public final void rule__ASMLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1268:1: ( ( ( rule__ASMLModel__Group_5__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1269:1: ( ( rule__ASMLModel__Group_5__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1269:1: ( ( rule__ASMLModel__Group_5__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1270:1: ( rule__ASMLModel__Group_5__0 )?
            {
             before(grammarAccess.getASMLModelAccess().getGroup_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1271:1: ( rule__ASMLModel__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1271:2: rule__ASMLModel__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ASMLModel__Group_5__0_in_rule__ASMLModel__Group__5__Impl2767);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1281:1: rule__ASMLModel__Group__6 : rule__ASMLModel__Group__6__Impl ;
    public final void rule__ASMLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1285:1: ( rule__ASMLModel__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1286:2: rule__ASMLModel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__6__Impl_in_rule__ASMLModel__Group__62798);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1292:1: rule__ASMLModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ASMLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1296:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1297:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1297:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1298:1: '}'
            {
             before(grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__ASMLModel__Group__6__Impl2826); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1325:1: rule__ASMLModel__Group_3__0 : rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 ;
    public final void rule__ASMLModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1329:1: ( rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1330:2: rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__02871);
            rule__ASMLModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__02874);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1337:1: rule__ASMLModel__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__ASMLModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1341:1: ( ( 'import' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1342:1: ( 'import' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1342:1: ( 'import' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1343:1: 'import'
            {
             before(grammarAccess.getASMLModelAccess().getImportKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__ASMLModel__Group_3__0__Impl2902); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1356:1: rule__ASMLModel__Group_3__1 : rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 ;
    public final void rule__ASMLModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1360:1: ( rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1361:2: rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__12933);
            rule__ASMLModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__12936);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1368:1: rule__ASMLModel__Group_3__1__Impl : ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) ;
    public final void rule__ASMLModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1372:1: ( ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1373:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1373:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1374:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            {
             before(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1375:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1375:2: rule__ASMLModel__ImportURIAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl2963);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1385:1: rule__ASMLModel__Group_3__2 : rule__ASMLModel__Group_3__2__Impl ;
    public final void rule__ASMLModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1389:1: ( rule__ASMLModel__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1390:2: rule__ASMLModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__22993);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1396:1: rule__ASMLModel__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ASMLModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1400:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1401:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1401:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1402:1: ';'
            {
             before(grammarAccess.getASMLModelAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__ASMLModel__Group_3__2__Impl3021); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1421:1: rule__ASMLModel__Group_5__0 : rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1 ;
    public final void rule__ASMLModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1425:1: ( rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1426:2: rule__ASMLModel__Group_5__0__Impl rule__ASMLModel__Group_5__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__0__Impl_in_rule__ASMLModel__Group_5__03058);
            rule__ASMLModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5__1_in_rule__ASMLModel__Group_5__03061);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1433:1: rule__ASMLModel__Group_5__0__Impl : ( 'ignore' ) ;
    public final void rule__ASMLModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1437:1: ( ( 'ignore' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1438:1: ( 'ignore' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1438:1: ( 'ignore' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1439:1: 'ignore'
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreKeyword_5_0()); 
            match(input,44,FOLLOW_44_in_rule__ASMLModel__Group_5__0__Impl3089); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1452:1: rule__ASMLModel__Group_5__1 : rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2 ;
    public final void rule__ASMLModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1456:1: ( rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1457:2: rule__ASMLModel__Group_5__1__Impl rule__ASMLModel__Group_5__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__1__Impl_in_rule__ASMLModel__Group_5__13120);
            rule__ASMLModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5__2_in_rule__ASMLModel__Group_5__13123);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1464:1: rule__ASMLModel__Group_5__1__Impl : ( ( rule__ASMLModel__Group_5_1__0 )* ) ;
    public final void rule__ASMLModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1468:1: ( ( ( rule__ASMLModel__Group_5_1__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1469:1: ( ( rule__ASMLModel__Group_5_1__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1469:1: ( ( rule__ASMLModel__Group_5_1__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1470:1: ( rule__ASMLModel__Group_5_1__0 )*
            {
             before(grammarAccess.getASMLModelAccess().getGroup_5_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1471:1: ( rule__ASMLModel__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1471:2: rule__ASMLModel__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__0_in_rule__ASMLModel__Group_5__1__Impl3150);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1481:1: rule__ASMLModel__Group_5__2 : rule__ASMLModel__Group_5__2__Impl ;
    public final void rule__ASMLModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1485:1: ( rule__ASMLModel__Group_5__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1486:2: rule__ASMLModel__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5__2__Impl_in_rule__ASMLModel__Group_5__23181);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1492:1: rule__ASMLModel__Group_5__2__Impl : ( ';' ) ;
    public final void rule__ASMLModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1496:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1497:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1497:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1498:1: ';'
            {
             before(grammarAccess.getASMLModelAccess().getSemicolonKeyword_5_2()); 
            match(input,43,FOLLOW_43_in_rule__ASMLModel__Group_5__2__Impl3209); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1517:1: rule__ASMLModel__Group_5_1__0 : rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1 ;
    public final void rule__ASMLModel__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1521:1: ( rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1522:2: rule__ASMLModel__Group_5_1__0__Impl rule__ASMLModel__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__0__Impl_in_rule__ASMLModel__Group_5_1__03246);
            rule__ASMLModel__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__1_in_rule__ASMLModel__Group_5_1__03249);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1529:1: rule__ASMLModel__Group_5_1__0__Impl : ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) ) ;
    public final void rule__ASMLModel__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1533:1: ( ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1534:1: ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1534:1: ( ( rule__ASMLModel__IgnoreAssignment_5_1_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1535:1: ( rule__ASMLModel__IgnoreAssignment_5_1_0 )
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreAssignment_5_1_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1536:1: ( rule__ASMLModel__IgnoreAssignment_5_1_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1536:2: rule__ASMLModel__IgnoreAssignment_5_1_0
            {
            pushFollow(FOLLOW_rule__ASMLModel__IgnoreAssignment_5_1_0_in_rule__ASMLModel__Group_5_1__0__Impl3276);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1546:1: rule__ASMLModel__Group_5_1__1 : rule__ASMLModel__Group_5_1__1__Impl ;
    public final void rule__ASMLModel__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1550:1: ( rule__ASMLModel__Group_5_1__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1551:2: rule__ASMLModel__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_5_1__1__Impl_in_rule__ASMLModel__Group_5_1__13306);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1557:1: rule__ASMLModel__Group_5_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__ASMLModel__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1561:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1562:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1562:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1563:1: ( ',' )?
            {
             before(grammarAccess.getASMLModelAccess().getCommaKeyword_5_1_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1564:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1565:2: ','
                    {
                    match(input,45,FOLLOW_45_in_rule__ASMLModel__Group_5_1__1__Impl3335); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1580:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1584:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1585:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03372);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__03375);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1592:1: rule__View__Group__0__Impl : ( 'view' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1596:1: ( ( 'view' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1597:1: ( 'view' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1597:1: ( 'view' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1598:1: 'view'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__View__Group__0__Impl3403); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1611:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1615:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1616:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13434);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__13437);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1623:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1627:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1628:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1628:1: ( ( rule__View__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1629:1: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1630:1: ( rule__View__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1630:2: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3464);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1640:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1644:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1645:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23494);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__23497);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1652:1: rule__View__Group__2__Impl : ( '{' ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1656:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1657:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1657:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1658:1: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__View__Group__2__Impl3525); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1671:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1675:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1676:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33556);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__33559);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1683:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1687:1: ( ( ( rule__View__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1688:1: ( ( rule__View__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1688:1: ( ( rule__View__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1689:1: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1690:1: ( rule__View__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43||LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1690:2: rule__View__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3586);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1700:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1704:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1705:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43617);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__43620);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1712:1: rule__View__Group__4__Impl : ( ( rule__View__ComponentsAssignment_4 )* ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1716:1: ( ( ( rule__View__ComponentsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1717:1: ( ( rule__View__ComponentsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1717:1: ( ( rule__View__ComponentsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1718:1: ( rule__View__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getViewAccess().getComponentsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1719:1: ( rule__View__ComponentsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49||(LA16_0>=52 && LA16_0<=54)||LA16_0==57||(LA16_0>=59 && LA16_0<=63)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1719:2: rule__View__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3647);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1729:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1733:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1734:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53678);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__6_in_rule__View__Group__53681);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1741:1: rule__View__Group__5__Impl : ( ( rule__View__RestrictionsAssignment_5 )* ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1745:1: ( ( ( rule__View__RestrictionsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1746:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1746:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1747:1: ( rule__View__RestrictionsAssignment_5 )*
            {
             before(grammarAccess.getViewAccess().getRestrictionsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1748:1: ( rule__View__RestrictionsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==65) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1748:2: rule__View__RestrictionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3708);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1758:1: rule__View__Group__6 : rule__View__Group__6__Impl ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1762:1: ( rule__View__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1763:2: rule__View__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63739);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1769:1: rule__View__Group__6__Impl : ( '}' ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1773:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1774:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1774:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1775:1: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__View__Group__6__Impl3767); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1802:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1806:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1807:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
            {
            pushFollow(FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03812);
            rule__View__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03815);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1814:1: rule__View__Group_3__0__Impl : ( ( rule__View__Group_3_0__0 )* ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1818:1: ( ( ( rule__View__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1819:1: ( ( rule__View__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1819:1: ( ( rule__View__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1820:1: ( rule__View__Group_3_0__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1821:1: ( rule__View__Group_3_0__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1821:2: rule__View__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3842);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1831:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1835:1: ( rule__View__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1836:2: rule__View__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13873);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1842:1: rule__View__Group_3__1__Impl : ( ';' ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1846:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1847:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1847:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1848:1: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_3_1()); 
            match(input,43,FOLLOW_43_in_rule__View__Group_3__1__Impl3901); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1865:1: rule__View__Group_3_0__0 : rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 ;
    public final void rule__View__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1869:1: ( rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1870:2: rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03936);
            rule__View__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03939);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1877:1: rule__View__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__View__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1881:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1882:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1882:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1883:1: 'attributes'
            {
             before(grammarAccess.getViewAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__View__Group_3_0__0__Impl3967); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1896:1: rule__View__Group_3_0__1 : rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 ;
    public final void rule__View__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1900:1: ( rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1901:2: rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__13998);
            rule__View__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__14001);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1908:1: rule__View__Group_3_0__1__Impl : ( ( rule__View__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__View__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1912:1: ( ( ( rule__View__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1913:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1913:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1914:1: ( rule__View__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1915:1: ( rule__View__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1915:2: rule__View__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl4028);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1925:1: rule__View__Group_3_0__2 : rule__View__Group_3_0__2__Impl ;
    public final void rule__View__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1929:1: ( rule__View__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1930:2: rule__View__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__24058);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1936:1: rule__View__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__View__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1940:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1941:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1941:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1942:1: ( ',' )?
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1943:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1944:2: ','
                    {
                    match(input,45,FOLLOW_45_in_rule__View__Group_3_0__2__Impl4087); 

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


    // $ANTLR start "rule__Attribute__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1961:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1965:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1966:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04126);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04129);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1973:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1977:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1978:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1978:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1979:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1980:1: ( rule__Attribute__NameAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1980:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4156);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1990:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1994:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1995:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14186);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14189);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2002:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2006:1: ( ( ':' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2007:1: ( ':' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2007:1: ( ':' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2008:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__Attribute__Group__1__Impl4217); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2021:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2025:1: ( rule__Attribute__Group__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2026:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24248);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2032:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2036:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2037:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2037:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2038:1: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2039:1: ( rule__Attribute__ValueAssignment_2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2039:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4275);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2055:1: rule__ClassMatching__Group__0 : rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 ;
    public final void rule__ClassMatching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2059:1: ( rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2060:2: rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__04311);
            rule__ClassMatching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__04314);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2067:1: rule__ClassMatching__Group__0__Impl : ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) ;
    public final void rule__ClassMatching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2071:1: ( ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2072:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2072:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2073:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2074:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2074:2: rule__ClassMatching__ExpressionMatchingAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl4341);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2084:1: rule__ClassMatching__Group__1 : rule__ClassMatching__Group__1__Impl ;
    public final void rule__ClassMatching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2088:1: ( rule__ClassMatching__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2089:2: rule__ClassMatching__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__14371);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2095:1: rule__ClassMatching__Group__1__Impl : ( ( rule__ClassMatching__ParameterAssignment_1 ) ) ;
    public final void rule__ClassMatching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2099:1: ( ( ( rule__ClassMatching__ParameterAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2100:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2100:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2101:1: ( rule__ClassMatching__ParameterAssignment_1 )
            {
             before(grammarAccess.getClassMatchingAccess().getParameterAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2102:1: ( rule__ClassMatching__ParameterAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2102:2: rule__ClassMatching__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl4398);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2116:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2120:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2121:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__04432);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__04435);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2128:1: rule__File__Group__0__Impl : ( 'file' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2132:1: ( ( 'file' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2133:1: ( 'file' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2133:1: ( 'file' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2134:1: 'file'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__File__Group__0__Impl4463); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2147:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2151:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2152:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__14494);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__14497);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2159:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2163:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2164:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2164:1: ( ( rule__File__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2165:1: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2166:1: ( rule__File__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2166:2: rule__File__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl4524);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2176:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2180:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2181:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__24554);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__24557);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2188:1: rule__File__Group__2__Impl : ( '{' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2192:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2193:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2193:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2194:1: '{'
            {
             before(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__File__Group__2__Impl4585); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2207:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2211:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2212:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__34616);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__4_in_rule__File__Group__34619);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2219:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )? ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2223:1: ( ( ( rule__File__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2224:1: ( ( rule__File__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2224:1: ( ( rule__File__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2225:1: ( rule__File__Group_3__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2226:1: ( rule__File__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2226:2: rule__File__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl4646);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2236:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2240:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2241:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__44677);
            rule__File__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__5_in_rule__File__Group__44680);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2248:1: rule__File__Group__4__Impl : ( ( rule__File__Group_4__0 )? ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2252:1: ( ( ( rule__File__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2253:1: ( ( rule__File__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2253:1: ( ( rule__File__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2254:1: ( rule__File__Group_4__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2255:1: ( rule__File__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2255:2: rule__File__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl4707);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2265:1: rule__File__Group__5 : rule__File__Group__5__Impl ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2269:1: ( rule__File__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2270:2: rule__File__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__54738);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2276:1: rule__File__Group__5__Impl : ( '}' ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2280:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2281:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2281:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2282:1: '}'
            {
             before(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__File__Group__5__Impl4766); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2307:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2311:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2312:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__04809);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__04812);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2319:1: rule__File__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2323:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2324:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2324:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2325:1: 'matching'
            {
             before(grammarAccess.getFileAccess().getMatchingKeyword_3_0()); 
            match(input,50,FOLLOW_50_in_rule__File__Group_3__0__Impl4840); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2338:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl rule__File__Group_3__2 ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2342:1: ( rule__File__Group_3__1__Impl rule__File__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2343:2: rule__File__Group_3__1__Impl rule__File__Group_3__2
            {
            pushFollow(FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__14871);
            rule__File__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__14874);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2350:1: rule__File__Group_3__1__Impl : ( ( rule__File__MatchingAssignment_3_1 ) ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2354:1: ( ( ( rule__File__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2355:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2355:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2356:1: ( rule__File__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getFileAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2357:1: ( rule__File__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2357:2: rule__File__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl4901);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2367:1: rule__File__Group_3__2 : rule__File__Group_3__2__Impl ;
    public final void rule__File__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2371:1: ( rule__File__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2372:2: rule__File__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__24931);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2378:1: rule__File__Group_3__2__Impl : ( ';' ) ;
    public final void rule__File__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2382:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2383:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2383:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2384:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__File__Group_3__2__Impl4959); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2403:1: rule__File__Group_4__0 : rule__File__Group_4__0__Impl rule__File__Group_4__1 ;
    public final void rule__File__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2407:1: ( rule__File__Group_4__0__Impl rule__File__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2408:2: rule__File__Group_4__0__Impl rule__File__Group_4__1
            {
            pushFollow(FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__04996);
            rule__File__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__04999);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2415:1: rule__File__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__File__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2419:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2420:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2420:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2421:1: 'cardinality'
            {
             before(grammarAccess.getFileAccess().getCardinalityKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__File__Group_4__0__Impl5027); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2434:1: rule__File__Group_4__1 : rule__File__Group_4__1__Impl rule__File__Group_4__2 ;
    public final void rule__File__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2438:1: ( rule__File__Group_4__1__Impl rule__File__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2439:2: rule__File__Group_4__1__Impl rule__File__Group_4__2
            {
            pushFollow(FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__15058);
            rule__File__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__15061);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2446:1: rule__File__Group_4__1__Impl : ( ( rule__File__CardinalityAssignment_4_1 ) ) ;
    public final void rule__File__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2450:1: ( ( ( rule__File__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2451:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2451:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2452:1: ( rule__File__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getFileAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2453:1: ( rule__File__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2453:2: rule__File__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl5088);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2463:1: rule__File__Group_4__2 : rule__File__Group_4__2__Impl ;
    public final void rule__File__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2467:1: ( rule__File__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2468:2: rule__File__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__25118);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2474:1: rule__File__Group_4__2__Impl : ( ';' ) ;
    public final void rule__File__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2478:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2479:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2479:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2480:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__File__Group_4__2__Impl5146); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2499:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2503:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2504:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__05183);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__05186);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2511:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2515:1: ( ( 'configuration' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2516:1: ( 'configuration' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2516:1: ( 'configuration' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2517:1: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__Configuration__Group__0__Impl5214); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2530:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2534:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2535:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__15245);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__15248);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2542:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2546:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2547:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2547:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2548:1: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2549:1: ( rule__Configuration__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2549:2: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl5275);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2559:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2563:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2564:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__25305);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__25308);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2571:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2575:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2576:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2576:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2577:1: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Configuration__Group__2__Impl5336); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2590:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2594:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2595:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__35367);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__35370);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2602:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2606:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2607:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2607:1: ( ( rule__Configuration__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2608:1: ( rule__Configuration__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2609:1: ( rule__Configuration__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2609:2: rule__Configuration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl5397);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2619:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2623:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2624:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__45428);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__45431);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2631:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__Group_4__0 )? ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2635:1: ( ( ( rule__Configuration__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2636:1: ( ( rule__Configuration__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2636:1: ( ( rule__Configuration__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2637:1: ( rule__Configuration__Group_4__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2638:1: ( rule__Configuration__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2638:2: rule__Configuration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl5458);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2648:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2652:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2653:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__55489);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__55492);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2660:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2664:1: ( ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2665:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2665:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2666:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2667:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==49||LA24_0==52||(LA24_0>=59 && LA24_0<=60)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2667:2: rule__Configuration__ConfigurationElementAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl5519);
            	    rule__Configuration__ConfigurationElementAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2677:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2681:1: ( rule__Configuration__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2682:2: rule__Configuration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__65550);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2688:1: rule__Configuration__Group__6__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2692:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2693:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2693:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2694:1: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__Configuration__Group__6__Impl5578); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2721:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2725:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2726:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__05623);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__05626);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2733:1: rule__Configuration__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2737:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2738:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2738:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2739:1: 'matching'
            {
             before(grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0()); 
            match(input,50,FOLLOW_50_in_rule__Configuration__Group_3__0__Impl5654); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2752:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2756:1: ( rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2757:2: rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__15685);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__15688);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2764:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__MatchingAssignment_3_1 ) ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2768:1: ( ( ( rule__Configuration__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2769:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2769:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2770:1: ( rule__Configuration__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2771:1: ( rule__Configuration__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2771:2: rule__Configuration__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl5715);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2781:1: rule__Configuration__Group_3__2 : rule__Configuration__Group_3__2__Impl ;
    public final void rule__Configuration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2785:1: ( rule__Configuration__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2786:2: rule__Configuration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__25745);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2792:1: rule__Configuration__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2796:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2797:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2797:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2798:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__Configuration__Group_3__2__Impl5773); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2817:1: rule__Configuration__Group_4__0 : rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 ;
    public final void rule__Configuration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2821:1: ( rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2822:2: rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__05810);
            rule__Configuration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__05813);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2829:1: rule__Configuration__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Configuration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2833:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2834:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2834:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2835:1: 'cardinality'
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__Configuration__Group_4__0__Impl5841); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2848:1: rule__Configuration__Group_4__1 : rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 ;
    public final void rule__Configuration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2852:1: ( rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2853:2: rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__15872);
            rule__Configuration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__15875);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2860:1: rule__Configuration__Group_4__1__Impl : ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Configuration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2864:1: ( ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2865:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2865:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2866:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2867:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2867:2: rule__Configuration__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl5902);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2877:1: rule__Configuration__Group_4__2 : rule__Configuration__Group_4__2__Impl ;
    public final void rule__Configuration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2881:1: ( rule__Configuration__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2882:2: rule__Configuration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__25932);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2888:1: rule__Configuration__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2892:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2893:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2893:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2894:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__Configuration__Group_4__2__Impl5960); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2913:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2917:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2918:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05997);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06000);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2925:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2929:1: ( ( 'method' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2930:1: ( 'method' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2930:1: ( 'method' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2931:1: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__Method__Group__0__Impl6028); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2944:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2948:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2949:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16059);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16062);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2956:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2960:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2961:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2961:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2962:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2963:1: ( rule__Method__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2963:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6089);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2973:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2977:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2978:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26119);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26122);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2985:1: rule__Method__Group__2__Impl : ( '{' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2989:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2990:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2990:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2991:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Method__Group__2__Impl6150); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3004:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3008:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3009:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36181);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36184);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3016:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3020:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3021:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3021:1: ( ( rule__Method__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3022:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3023:1: ( rule__Method__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3023:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6211);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3033:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3037:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3038:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46242);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46245);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3045:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3049:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3050:1: ( ( rule__Method__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3050:1: ( ( rule__Method__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3051:1: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3052:1: ( rule__Method__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3052:2: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl6272);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3062:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3066:1: ( rule__Method__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3067:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56303);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3073:1: rule__Method__Group__5__Impl : ( '}' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3077:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3078:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3078:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3079:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Method__Group__5__Impl6331); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3104:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3108:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3109:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06374);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06377);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3116:1: rule__Method__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3120:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3121:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3121:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3122:1: 'matching'
            {
             before(grammarAccess.getMethodAccess().getMatchingKeyword_3_0()); 
            match(input,50,FOLLOW_50_in_rule__Method__Group_3__0__Impl6405); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3135:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl rule__Method__Group_3__2 ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3139:1: ( rule__Method__Group_3__1__Impl rule__Method__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3140:2: rule__Method__Group_3__1__Impl rule__Method__Group_3__2
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16436);
            rule__Method__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__16439);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3147:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__MatchingAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3151:1: ( ( ( rule__Method__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3152:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3152:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3153:1: ( rule__Method__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3154:1: ( rule__Method__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3154:2: rule__Method__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl6466);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3164:1: rule__Method__Group_3__2 : rule__Method__Group_3__2__Impl ;
    public final void rule__Method__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3168:1: ( rule__Method__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3169:2: rule__Method__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__26496);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3175:1: rule__Method__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3179:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3180:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3180:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3181:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__Method__Group_3__2__Impl6524); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3200:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3204:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3205:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__06561);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__06564);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3212:1: rule__Method__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3216:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3217:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3217:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3218:1: 'cardinality'
            {
             before(grammarAccess.getMethodAccess().getCardinalityKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__Method__Group_4__0__Impl6592); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3231:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl rule__Method__Group_4__2 ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3235:1: ( rule__Method__Group_4__1__Impl rule__Method__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3236:2: rule__Method__Group_4__1__Impl rule__Method__Group_4__2
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__16623);
            rule__Method__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__16626);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3243:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3247:1: ( ( ( rule__Method__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3248:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3248:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3249:1: ( rule__Method__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3250:1: ( rule__Method__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3250:2: rule__Method__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl6653);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3260:1: rule__Method__Group_4__2 : rule__Method__Group_4__2__Impl ;
    public final void rule__Method__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3264:1: ( rule__Method__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3265:2: rule__Method__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__26683);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3271:1: rule__Method__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3275:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3276:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3276:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3277:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__Method__Group_4__2__Impl6711); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3296:1: rule__MetaClass__Group__0 : rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 ;
    public final void rule__MetaClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3300:1: ( rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3301:2: rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__06748);
            rule__MetaClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__06751);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3308:1: rule__MetaClass__Group__0__Impl : ( 'meta-class' ) ;
    public final void rule__MetaClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3312:1: ( ( 'meta-class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3313:1: ( 'meta-class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3313:1: ( 'meta-class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3314:1: 'meta-class'
            {
             before(grammarAccess.getMetaClassAccess().getMetaClassKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__MetaClass__Group__0__Impl6779); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3327:1: rule__MetaClass__Group__1 : rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 ;
    public final void rule__MetaClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3331:1: ( rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3332:2: rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__16810);
            rule__MetaClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__16813);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3339:1: rule__MetaClass__Group__1__Impl : ( ( rule__MetaClass__NameAssignment_1 ) ) ;
    public final void rule__MetaClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3343:1: ( ( ( rule__MetaClass__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3344:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3344:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3345:1: ( rule__MetaClass__NameAssignment_1 )
            {
             before(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3346:1: ( rule__MetaClass__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3346:2: rule__MetaClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl6840);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3356:1: rule__MetaClass__Group__2 : rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 ;
    public final void rule__MetaClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3360:1: ( rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3361:2: rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__26870);
            rule__MetaClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__26873);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3368:1: rule__MetaClass__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3372:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3373:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3373:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3374:1: '{'
            {
             before(grammarAccess.getMetaClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MetaClass__Group__2__Impl6901); 
             after(grammarAccess.getMetaClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3387:1: rule__MetaClass__Group__3 : rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 ;
    public final void rule__MetaClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3391:1: ( rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3392:2: rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__36932);
            rule__MetaClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__36935);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3399:1: rule__MetaClass__Group__3__Impl : ( ( rule__MetaClass__Group_3__0 )? ) ;
    public final void rule__MetaClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3403:1: ( ( ( rule__MetaClass__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3404:1: ( ( rule__MetaClass__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3404:1: ( ( rule__MetaClass__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3405:1: ( rule__MetaClass__Group_3__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3406:1: ( rule__MetaClass__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==55) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3406:2: rule__MetaClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_3__0_in_rule__MetaClass__Group__3__Impl6962);
                    rule__MetaClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_3()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3416:1: rule__MetaClass__Group__4 : rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 ;
    public final void rule__MetaClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3420:1: ( rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3421:2: rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__46993);
            rule__MetaClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__46996);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3428:1: rule__MetaClass__Group__4__Impl : ( ( rule__MetaClass__Group_4__0 )? ) ;
    public final void rule__MetaClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3432:1: ( ( ( rule__MetaClass__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3433:1: ( ( rule__MetaClass__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3433:1: ( ( rule__MetaClass__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3434:1: ( rule__MetaClass__Group_4__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3435:1: ( rule__MetaClass__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3435:2: rule__MetaClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_4__0_in_rule__MetaClass__Group__4__Impl7023);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3445:1: rule__MetaClass__Group__5 : rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 ;
    public final void rule__MetaClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3449:1: ( rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3450:2: rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__57054);
            rule__MetaClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__57057);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3457:1: rule__MetaClass__Group__5__Impl : ( ( rule__MetaClass__Group_5__0 )? ) ;
    public final void rule__MetaClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3461:1: ( ( ( rule__MetaClass__Group_5__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3462:1: ( ( rule__MetaClass__Group_5__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3462:1: ( ( rule__MetaClass__Group_5__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3463:1: ( rule__MetaClass__Group_5__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3464:1: ( rule__MetaClass__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3464:2: rule__MetaClass__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__MetaClass__Group_5__0_in_rule__MetaClass__Group__5__Impl7084);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3474:1: rule__MetaClass__Group__6 : rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 ;
    public final void rule__MetaClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3478:1: ( rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3479:2: rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__67115);
            rule__MetaClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__67118);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3486:1: rule__MetaClass__Group__6__Impl : ( ( rule__MetaClass__MethodsAssignment_6 )* ) ;
    public final void rule__MetaClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3490:1: ( ( ( rule__MetaClass__MethodsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3491:1: ( ( rule__MetaClass__MethodsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3491:1: ( ( rule__MetaClass__MethodsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3492:1: ( rule__MetaClass__MethodsAssignment_6 )*
            {
             before(grammarAccess.getMetaClassAccess().getMethodsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3493:1: ( rule__MetaClass__MethodsAssignment_6 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3493:2: rule__MetaClass__MethodsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__MetaClass__MethodsAssignment_6_in_rule__MetaClass__Group__6__Impl7145);
            	    rule__MetaClass__MethodsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMetaClassAccess().getMethodsAssignment_6()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3503:1: rule__MetaClass__Group__7 : rule__MetaClass__Group__7__Impl ;
    public final void rule__MetaClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3507:1: ( rule__MetaClass__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3508:2: rule__MetaClass__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__77176);
            rule__MetaClass__Group__7__Impl();

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3514:1: rule__MetaClass__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3518:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3519:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3519:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3520:1: '}'
            {
             before(grammarAccess.getMetaClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,41,FOLLOW_41_in_rule__MetaClass__Group__7__Impl7204); 
             after(grammarAccess.getMetaClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__MetaClass__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3549:1: rule__MetaClass__Group_3__0 : rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1 ;
    public final void rule__MetaClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3553:1: ( rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3554:2: rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_3__0__Impl_in_rule__MetaClass__Group_3__07251);
            rule__MetaClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_3__1_in_rule__MetaClass__Group_3__07254);
            rule__MetaClass__Group_3__1();

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
    // $ANTLR end "rule__MetaClass__Group_3__0"


    // $ANTLR start "rule__MetaClass__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3561:1: rule__MetaClass__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__MetaClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3565:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3566:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3566:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3567:1: 'description'
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__MetaClass__Group_3__0__Impl7282); 
             after(grammarAccess.getMetaClassAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_3__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3580:1: rule__MetaClass__Group_3__1 : rule__MetaClass__Group_3__1__Impl rule__MetaClass__Group_3__2 ;
    public final void rule__MetaClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3584:1: ( rule__MetaClass__Group_3__1__Impl rule__MetaClass__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3585:2: rule__MetaClass__Group_3__1__Impl rule__MetaClass__Group_3__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_3__1__Impl_in_rule__MetaClass__Group_3__17313);
            rule__MetaClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_3__2_in_rule__MetaClass__Group_3__17316);
            rule__MetaClass__Group_3__2();

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
    // $ANTLR end "rule__MetaClass__Group_3__1"


    // $ANTLR start "rule__MetaClass__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3592:1: rule__MetaClass__Group_3__1__Impl : ( ( rule__MetaClass__DescriptionAssignment_3_1 ) ) ;
    public final void rule__MetaClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3596:1: ( ( ( rule__MetaClass__DescriptionAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3597:1: ( ( rule__MetaClass__DescriptionAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3597:1: ( ( rule__MetaClass__DescriptionAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3598:1: ( rule__MetaClass__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3599:1: ( rule__MetaClass__DescriptionAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3599:2: rule__MetaClass__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MetaClass__DescriptionAssignment_3_1_in_rule__MetaClass__Group_3__1__Impl7343);
            rule__MetaClass__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_3__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3609:1: rule__MetaClass__Group_3__2 : rule__MetaClass__Group_3__2__Impl ;
    public final void rule__MetaClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3613:1: ( rule__MetaClass__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3614:2: rule__MetaClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_3__2__Impl_in_rule__MetaClass__Group_3__27373);
            rule__MetaClass__Group_3__2__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_3__2"


    // $ANTLR start "rule__MetaClass__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3620:1: rule__MetaClass__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3624:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3625:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3625:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3626:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__MetaClass__Group_3__2__Impl7401); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_3__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3645:1: rule__MetaClass__Group_4__0 : rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1 ;
    public final void rule__MetaClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3649:1: ( rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3650:2: rule__MetaClass__Group_4__0__Impl rule__MetaClass__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__0__Impl_in_rule__MetaClass__Group_4__07438);
            rule__MetaClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_4__1_in_rule__MetaClass__Group_4__07441);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3657:1: rule__MetaClass__Group_4__0__Impl : ( 'matching:' ) ;
    public final void rule__MetaClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3661:1: ( ( 'matching:' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3662:1: ( 'matching:' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3662:1: ( 'matching:' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3663:1: 'matching:'
            {
             before(grammarAccess.getMetaClassAccess().getMatchingKeyword_4_0()); 
            match(input,56,FOLLOW_56_in_rule__MetaClass__Group_4__0__Impl7469); 
             after(grammarAccess.getMetaClassAccess().getMatchingKeyword_4_0()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3676:1: rule__MetaClass__Group_4__1 : rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2 ;
    public final void rule__MetaClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3680:1: ( rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3681:2: rule__MetaClass__Group_4__1__Impl rule__MetaClass__Group_4__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__1__Impl_in_rule__MetaClass__Group_4__17500);
            rule__MetaClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_4__2_in_rule__MetaClass__Group_4__17503);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3688:1: rule__MetaClass__Group_4__1__Impl : ( ( rule__MetaClass__MatchingAssignment_4_1 ) ) ;
    public final void rule__MetaClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3692:1: ( ( ( rule__MetaClass__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3693:1: ( ( rule__MetaClass__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3693:1: ( ( rule__MetaClass__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3694:1: ( rule__MetaClass__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getMetaClassAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3695:1: ( rule__MetaClass__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3695:2: rule__MetaClass__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetaClass__MatchingAssignment_4_1_in_rule__MetaClass__Group_4__1__Impl7530);
            rule__MetaClass__MatchingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getMatchingAssignment_4_1()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3705:1: rule__MetaClass__Group_4__2 : rule__MetaClass__Group_4__2__Impl ;
    public final void rule__MetaClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3709:1: ( rule__MetaClass__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3710:2: rule__MetaClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_4__2__Impl_in_rule__MetaClass__Group_4__27560);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3716:1: rule__MetaClass__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3720:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3721:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3721:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3722:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__MetaClass__Group_4__2__Impl7588); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3741:1: rule__MetaClass__Group_5__0 : rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1 ;
    public final void rule__MetaClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3745:1: ( rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3746:2: rule__MetaClass__Group_5__0__Impl rule__MetaClass__Group_5__1
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__0__Impl_in_rule__MetaClass__Group_5__07625);
            rule__MetaClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_5__1_in_rule__MetaClass__Group_5__07628);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3753:1: rule__MetaClass__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__MetaClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3757:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3758:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3758:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3759:1: 'cardinality'
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityKeyword_5_0()); 
            match(input,51,FOLLOW_51_in_rule__MetaClass__Group_5__0__Impl7656); 
             after(grammarAccess.getMetaClassAccess().getCardinalityKeyword_5_0()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3772:1: rule__MetaClass__Group_5__1 : rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2 ;
    public final void rule__MetaClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3776:1: ( rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3777:2: rule__MetaClass__Group_5__1__Impl rule__MetaClass__Group_5__2
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__1__Impl_in_rule__MetaClass__Group_5__17687);
            rule__MetaClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaClass__Group_5__2_in_rule__MetaClass__Group_5__17690);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3784:1: rule__MetaClass__Group_5__1__Impl : ( ( rule__MetaClass__CardinalityAssignment_5_1 ) ) ;
    public final void rule__MetaClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3788:1: ( ( ( rule__MetaClass__CardinalityAssignment_5_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3789:1: ( ( rule__MetaClass__CardinalityAssignment_5_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3789:1: ( ( rule__MetaClass__CardinalityAssignment_5_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3790:1: ( rule__MetaClass__CardinalityAssignment_5_1 )
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityAssignment_5_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3791:1: ( rule__MetaClass__CardinalityAssignment_5_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3791:2: rule__MetaClass__CardinalityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__MetaClass__CardinalityAssignment_5_1_in_rule__MetaClass__Group_5__1__Impl7717);
            rule__MetaClass__CardinalityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getCardinalityAssignment_5_1()); 

            }


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3801:1: rule__MetaClass__Group_5__2 : rule__MetaClass__Group_5__2__Impl ;
    public final void rule__MetaClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3805:1: ( rule__MetaClass__Group_5__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3806:2: rule__MetaClass__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaClass__Group_5__2__Impl_in_rule__MetaClass__Group_5__27747);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3812:1: rule__MetaClass__Group_5__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3816:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3817:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3817:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3818:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_5_2()); 
            match(input,43,FOLLOW_43_in_rule__MetaClass__Group_5__2__Impl7775); 
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


    // $ANTLR start "rule__ExternalClass__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3837:1: rule__ExternalClass__Group__0 : rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1 ;
    public final void rule__ExternalClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3841:1: ( rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3842:2: rule__ExternalClass__Group__0__Impl rule__ExternalClass__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__0__Impl_in_rule__ExternalClass__Group__07812);
            rule__ExternalClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__1_in_rule__ExternalClass__Group__07815);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3849:1: rule__ExternalClass__Group__0__Impl : ( 'external-class' ) ;
    public final void rule__ExternalClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3853:1: ( ( 'external-class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3854:1: ( 'external-class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3854:1: ( 'external-class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3855:1: 'external-class'
            {
             before(grammarAccess.getExternalClassAccess().getExternalClassKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__ExternalClass__Group__0__Impl7843); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3868:1: rule__ExternalClass__Group__1 : rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2 ;
    public final void rule__ExternalClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3872:1: ( rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3873:2: rule__ExternalClass__Group__1__Impl rule__ExternalClass__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__1__Impl_in_rule__ExternalClass__Group__17874);
            rule__ExternalClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__2_in_rule__ExternalClass__Group__17877);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3880:1: rule__ExternalClass__Group__1__Impl : ( ( rule__ExternalClass__NameAssignment_1 ) ) ;
    public final void rule__ExternalClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3884:1: ( ( ( rule__ExternalClass__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3885:1: ( ( rule__ExternalClass__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3885:1: ( ( rule__ExternalClass__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3886:1: ( rule__ExternalClass__NameAssignment_1 )
            {
             before(grammarAccess.getExternalClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3887:1: ( rule__ExternalClass__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3887:2: rule__ExternalClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__NameAssignment_1_in_rule__ExternalClass__Group__1__Impl7904);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3897:1: rule__ExternalClass__Group__2 : rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3 ;
    public final void rule__ExternalClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3901:1: ( rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3902:2: rule__ExternalClass__Group__2__Impl rule__ExternalClass__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__2__Impl_in_rule__ExternalClass__Group__27934);
            rule__ExternalClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__3_in_rule__ExternalClass__Group__27937);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3909:1: rule__ExternalClass__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3913:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3914:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3914:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3915:1: '{'
            {
             before(grammarAccess.getExternalClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__ExternalClass__Group__2__Impl7965); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3928:1: rule__ExternalClass__Group__3 : rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4 ;
    public final void rule__ExternalClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3932:1: ( rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3933:2: rule__ExternalClass__Group__3__Impl rule__ExternalClass__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__3__Impl_in_rule__ExternalClass__Group__37996);
            rule__ExternalClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__4_in_rule__ExternalClass__Group__37999);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3940:1: rule__ExternalClass__Group__3__Impl : ( ( rule__ExternalClass__Group_3__0 )? ) ;
    public final void rule__ExternalClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3944:1: ( ( ( rule__ExternalClass__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3945:1: ( ( rule__ExternalClass__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3945:1: ( ( rule__ExternalClass__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3946:1: ( rule__ExternalClass__Group_3__0 )?
            {
             before(grammarAccess.getExternalClassAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3947:1: ( rule__ExternalClass__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3947:2: rule__ExternalClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExternalClass__Group_3__0_in_rule__ExternalClass__Group__3__Impl8026);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3957:1: rule__ExternalClass__Group__4 : rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5 ;
    public final void rule__ExternalClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3961:1: ( rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3962:2: rule__ExternalClass__Group__4__Impl rule__ExternalClass__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__4__Impl_in_rule__ExternalClass__Group__48057);
            rule__ExternalClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group__5_in_rule__ExternalClass__Group__48060);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3969:1: rule__ExternalClass__Group__4__Impl : ( ( rule__ExternalClass__Group_4__0 )? ) ;
    public final void rule__ExternalClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3973:1: ( ( ( rule__ExternalClass__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3974:1: ( ( rule__ExternalClass__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3974:1: ( ( rule__ExternalClass__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3975:1: ( rule__ExternalClass__Group_4__0 )?
            {
             before(grammarAccess.getExternalClassAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3976:1: ( rule__ExternalClass__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3976:2: rule__ExternalClass__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExternalClass__Group_4__0_in_rule__ExternalClass__Group__4__Impl8087);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3986:1: rule__ExternalClass__Group__5 : rule__ExternalClass__Group__5__Impl ;
    public final void rule__ExternalClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3990:1: ( rule__ExternalClass__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3991:2: rule__ExternalClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group__5__Impl_in_rule__ExternalClass__Group__58118);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3997:1: rule__ExternalClass__Group__5__Impl : ( '}' ) ;
    public final void rule__ExternalClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4001:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4002:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4002:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4003:1: '}'
            {
             before(grammarAccess.getExternalClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__ExternalClass__Group__5__Impl8146); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4028:1: rule__ExternalClass__Group_3__0 : rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1 ;
    public final void rule__ExternalClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4032:1: ( rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4033:2: rule__ExternalClass__Group_3__0__Impl rule__ExternalClass__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__0__Impl_in_rule__ExternalClass__Group_3__08189);
            rule__ExternalClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_3__1_in_rule__ExternalClass__Group_3__08192);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4040:1: rule__ExternalClass__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__ExternalClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4044:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4045:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4045:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4046:1: 'description'
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__ExternalClass__Group_3__0__Impl8220); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4059:1: rule__ExternalClass__Group_3__1 : rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2 ;
    public final void rule__ExternalClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4063:1: ( rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4064:2: rule__ExternalClass__Group_3__1__Impl rule__ExternalClass__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__1__Impl_in_rule__ExternalClass__Group_3__18251);
            rule__ExternalClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_3__2_in_rule__ExternalClass__Group_3__18254);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4071:1: rule__ExternalClass__Group_3__1__Impl : ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ExternalClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4075:1: ( ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4076:1: ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4076:1: ( ( rule__ExternalClass__DescriptionAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4077:1: ( rule__ExternalClass__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4078:1: ( rule__ExternalClass__DescriptionAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4078:2: rule__ExternalClass__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__DescriptionAssignment_3_1_in_rule__ExternalClass__Group_3__1__Impl8281);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4088:1: rule__ExternalClass__Group_3__2 : rule__ExternalClass__Group_3__2__Impl ;
    public final void rule__ExternalClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4092:1: ( rule__ExternalClass__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4093:2: rule__ExternalClass__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_3__2__Impl_in_rule__ExternalClass__Group_3__28311);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4099:1: rule__ExternalClass__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ExternalClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4103:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4104:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4104:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4105:1: ';'
            {
             before(grammarAccess.getExternalClassAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__ExternalClass__Group_3__2__Impl8339); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4124:1: rule__ExternalClass__Group_4__0 : rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1 ;
    public final void rule__ExternalClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4128:1: ( rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4129:2: rule__ExternalClass__Group_4__0__Impl rule__ExternalClass__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__0__Impl_in_rule__ExternalClass__Group_4__08376);
            rule__ExternalClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_4__1_in_rule__ExternalClass__Group_4__08379);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4136:1: rule__ExternalClass__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__ExternalClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4140:1: ( ( 'type' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4141:1: ( 'type' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4141:1: ( 'type' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4142:1: 'type'
            {
             before(grammarAccess.getExternalClassAccess().getTypeKeyword_4_0()); 
            match(input,58,FOLLOW_58_in_rule__ExternalClass__Group_4__0__Impl8407); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4155:1: rule__ExternalClass__Group_4__1 : rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2 ;
    public final void rule__ExternalClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4159:1: ( rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4160:2: rule__ExternalClass__Group_4__1__Impl rule__ExternalClass__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__1__Impl_in_rule__ExternalClass__Group_4__18438);
            rule__ExternalClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalClass__Group_4__2_in_rule__ExternalClass__Group_4__18441);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4167:1: rule__ExternalClass__Group_4__1__Impl : ( ( rule__ExternalClass__TypeAssignment_4_1 ) ) ;
    public final void rule__ExternalClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4171:1: ( ( ( rule__ExternalClass__TypeAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4172:1: ( ( rule__ExternalClass__TypeAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4172:1: ( ( rule__ExternalClass__TypeAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4173:1: ( rule__ExternalClass__TypeAssignment_4_1 )
            {
             before(grammarAccess.getExternalClassAccess().getTypeAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4174:1: ( rule__ExternalClass__TypeAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4174:2: rule__ExternalClass__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExternalClass__TypeAssignment_4_1_in_rule__ExternalClass__Group_4__1__Impl8468);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4184:1: rule__ExternalClass__Group_4__2 : rule__ExternalClass__Group_4__2__Impl ;
    public final void rule__ExternalClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4188:1: ( rule__ExternalClass__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4189:2: rule__ExternalClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalClass__Group_4__2__Impl_in_rule__ExternalClass__Group_4__28498);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4195:1: rule__ExternalClass__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ExternalClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4199:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4200:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4200:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4201:1: ';'
            {
             before(grammarAccess.getExternalClassAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__ExternalClass__Group_4__2__Impl8526); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4220:1: rule__XmlElement__Group__0 : rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 ;
    public final void rule__XmlElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4224:1: ( rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4225:2: rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__08563);
            rule__XmlElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__08566);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4232:1: rule__XmlElement__Group__0__Impl : ( 'xmlElement' ) ;
    public final void rule__XmlElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4236:1: ( ( 'xmlElement' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4237:1: ( 'xmlElement' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4237:1: ( 'xmlElement' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4238:1: 'xmlElement'
            {
             before(grammarAccess.getXmlElementAccess().getXmlElementKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__XmlElement__Group__0__Impl8594); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4251:1: rule__XmlElement__Group__1 : rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 ;
    public final void rule__XmlElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4255:1: ( rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4256:2: rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__18625);
            rule__XmlElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__18628);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4263:1: rule__XmlElement__Group__1__Impl : ( ( rule__XmlElement__NameAssignment_1 ) ) ;
    public final void rule__XmlElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4267:1: ( ( ( rule__XmlElement__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4268:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4268:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4269:1: ( rule__XmlElement__NameAssignment_1 )
            {
             before(grammarAccess.getXmlElementAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4270:1: ( rule__XmlElement__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4270:2: rule__XmlElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl8655);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4280:1: rule__XmlElement__Group__2 : rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 ;
    public final void rule__XmlElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4284:1: ( rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4285:2: rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__28685);
            rule__XmlElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__28688);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4292:1: rule__XmlElement__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4296:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4297:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4297:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4298:1: '{'
            {
             before(grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__XmlElement__Group__2__Impl8716); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4311:1: rule__XmlElement__Group__3 : rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 ;
    public final void rule__XmlElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4315:1: ( rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4316:2: rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__38747);
            rule__XmlElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__38750);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4323:1: rule__XmlElement__Group__3__Impl : ( ( rule__XmlElement__Group_3__0 )? ) ;
    public final void rule__XmlElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4327:1: ( ( ( rule__XmlElement__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4328:1: ( ( rule__XmlElement__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4328:1: ( ( rule__XmlElement__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4329:1: ( rule__XmlElement__Group_3__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4330:1: ( rule__XmlElement__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4330:2: rule__XmlElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl8777);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4340:1: rule__XmlElement__Group__4 : rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 ;
    public final void rule__XmlElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4344:1: ( rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4345:2: rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__48808);
            rule__XmlElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__48811);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4352:1: rule__XmlElement__Group__4__Impl : ( ( rule__XmlElement__Group_4__0 )? ) ;
    public final void rule__XmlElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4356:1: ( ( ( rule__XmlElement__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4357:1: ( ( rule__XmlElement__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4357:1: ( ( rule__XmlElement__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4358:1: ( rule__XmlElement__Group_4__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4359:1: ( rule__XmlElement__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4359:2: rule__XmlElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl8838);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4369:1: rule__XmlElement__Group__5 : rule__XmlElement__Group__5__Impl ;
    public final void rule__XmlElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4373:1: ( rule__XmlElement__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4374:2: rule__XmlElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__58869);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4380:1: rule__XmlElement__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4384:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4385:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4385:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4386:1: '}'
            {
             before(grammarAccess.getXmlElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__XmlElement__Group__5__Impl8897); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4411:1: rule__XmlElement__Group_3__0 : rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 ;
    public final void rule__XmlElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4415:1: ( rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4416:2: rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__08940);
            rule__XmlElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__08943);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4423:1: rule__XmlElement__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4427:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4428:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4428:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4429:1: 'matching'
            {
             before(grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0()); 
            match(input,50,FOLLOW_50_in_rule__XmlElement__Group_3__0__Impl8971); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4442:1: rule__XmlElement__Group_3__1 : rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 ;
    public final void rule__XmlElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4446:1: ( rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4447:2: rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19002);
            rule__XmlElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19005);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4454:1: rule__XmlElement__Group_3__1__Impl : ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4458:1: ( ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4459:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4459:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4460:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlElementAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4461:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4461:2: rule__XmlElement__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9032);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4471:1: rule__XmlElement__Group_3__2 : rule__XmlElement__Group_3__2__Impl ;
    public final void rule__XmlElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4475:1: ( rule__XmlElement__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4476:2: rule__XmlElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29062);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4482:1: rule__XmlElement__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4486:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4487:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4487:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4488:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__XmlElement__Group_3__2__Impl9090); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4507:1: rule__XmlElement__Group_4__0 : rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 ;
    public final void rule__XmlElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4511:1: ( rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4512:2: rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__09127);
            rule__XmlElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__09130);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4519:1: rule__XmlElement__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4523:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4524:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4524:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4525:1: 'cardinality'
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlElement__Group_4__0__Impl9158); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4538:1: rule__XmlElement__Group_4__1 : rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 ;
    public final void rule__XmlElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4542:1: ( rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4543:2: rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__19189);
            rule__XmlElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__19192);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4550:1: rule__XmlElement__Group_4__1__Impl : ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4554:1: ( ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4555:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4555:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4556:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4557:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4557:2: rule__XmlElement__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl9219);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4567:1: rule__XmlElement__Group_4__2 : rule__XmlElement__Group_4__2__Impl ;
    public final void rule__XmlElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4571:1: ( rule__XmlElement__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4572:2: rule__XmlElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__29249);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4578:1: rule__XmlElement__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4582:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4583:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4583:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4584:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__XmlElement__Group_4__2__Impl9277); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4603:1: rule__XmlDocument__Group__0 : rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 ;
    public final void rule__XmlDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4607:1: ( rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4608:2: rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__09314);
            rule__XmlDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__09317);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4615:1: rule__XmlDocument__Group__0__Impl : ( 'xmlDocument' ) ;
    public final void rule__XmlDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4619:1: ( ( 'xmlDocument' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4620:1: ( 'xmlDocument' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4620:1: ( 'xmlDocument' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4621:1: 'xmlDocument'
            {
             before(grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__XmlDocument__Group__0__Impl9345); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4634:1: rule__XmlDocument__Group__1 : rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 ;
    public final void rule__XmlDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4638:1: ( rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4639:2: rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__19376);
            rule__XmlDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__19379);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4646:1: rule__XmlDocument__Group__1__Impl : ( ( rule__XmlDocument__NameAssignment_1 ) ) ;
    public final void rule__XmlDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4650:1: ( ( ( rule__XmlDocument__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4651:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4651:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4652:1: ( rule__XmlDocument__NameAssignment_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4653:1: ( rule__XmlDocument__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4653:2: rule__XmlDocument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl9406);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4663:1: rule__XmlDocument__Group__2 : rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 ;
    public final void rule__XmlDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4667:1: ( rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4668:2: rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__29436);
            rule__XmlDocument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__29439);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4675:1: rule__XmlDocument__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4679:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4680:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4680:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4681:1: '{'
            {
             before(grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__XmlDocument__Group__2__Impl9467); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4694:1: rule__XmlDocument__Group__3 : rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 ;
    public final void rule__XmlDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4698:1: ( rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4699:2: rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__39498);
            rule__XmlDocument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__39501);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4706:1: rule__XmlDocument__Group__3__Impl : ( ( rule__XmlDocument__Group_3__0 )? ) ;
    public final void rule__XmlDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4710:1: ( ( ( rule__XmlDocument__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4711:1: ( ( rule__XmlDocument__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4711:1: ( ( rule__XmlDocument__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4712:1: ( rule__XmlDocument__Group_3__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4713:1: ( rule__XmlDocument__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4713:2: rule__XmlDocument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl9528);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4723:1: rule__XmlDocument__Group__4 : rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 ;
    public final void rule__XmlDocument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4727:1: ( rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4728:2: rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__49559);
            rule__XmlDocument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__49562);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4735:1: rule__XmlDocument__Group__4__Impl : ( ( rule__XmlDocument__Group_4__0 )? ) ;
    public final void rule__XmlDocument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4739:1: ( ( ( rule__XmlDocument__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4740:1: ( ( rule__XmlDocument__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4740:1: ( ( rule__XmlDocument__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4741:1: ( rule__XmlDocument__Group_4__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4742:1: ( rule__XmlDocument__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4742:2: rule__XmlDocument__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl9589);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4752:1: rule__XmlDocument__Group__5 : rule__XmlDocument__Group__5__Impl ;
    public final void rule__XmlDocument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4756:1: ( rule__XmlDocument__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4757:2: rule__XmlDocument__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__59620);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4763:1: rule__XmlDocument__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlDocument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4767:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4768:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4768:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4769:1: '}'
            {
             before(grammarAccess.getXmlDocumentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__XmlDocument__Group__5__Impl9648); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4794:1: rule__XmlDocument__Group_3__0 : rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 ;
    public final void rule__XmlDocument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4798:1: ( rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4799:2: rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__09691);
            rule__XmlDocument__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__09694);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4806:1: rule__XmlDocument__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlDocument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4810:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4811:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4811:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4812:1: 'matching'
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0()); 
            match(input,50,FOLLOW_50_in_rule__XmlDocument__Group_3__0__Impl9722); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4825:1: rule__XmlDocument__Group_3__1 : rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 ;
    public final void rule__XmlDocument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4829:1: ( rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4830:2: rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__19753);
            rule__XmlDocument__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__19756);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4837:1: rule__XmlDocument__Group_3__1__Impl : ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlDocument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4841:1: ( ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4842:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4842:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4843:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4844:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4844:2: rule__XmlDocument__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl9783);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4854:1: rule__XmlDocument__Group_3__2 : rule__XmlDocument__Group_3__2__Impl ;
    public final void rule__XmlDocument__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4858:1: ( rule__XmlDocument__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4859:2: rule__XmlDocument__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__29813);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4865:1: rule__XmlDocument__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4869:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4870:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4870:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4871:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2()); 
            match(input,43,FOLLOW_43_in_rule__XmlDocument__Group_3__2__Impl9841); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4890:1: rule__XmlDocument__Group_4__0 : rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 ;
    public final void rule__XmlDocument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4894:1: ( rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4895:2: rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__09878);
            rule__XmlDocument__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__09881);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4902:1: rule__XmlDocument__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlDocument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4906:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4907:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4907:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4908:1: 'cardinality'
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlDocument__Group_4__0__Impl9909); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4921:1: rule__XmlDocument__Group_4__1 : rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 ;
    public final void rule__XmlDocument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4925:1: ( rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4926:2: rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__19940);
            rule__XmlDocument__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__19943);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4933:1: rule__XmlDocument__Group_4__1__Impl : ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlDocument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4937:1: ( ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4938:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4938:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4939:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4940:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4940:2: rule__XmlDocument__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl9970);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4950:1: rule__XmlDocument__Group_4__2 : rule__XmlDocument__Group_4__2__Impl ;
    public final void rule__XmlDocument__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4954:1: ( rule__XmlDocument__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4955:2: rule__XmlDocument__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210000);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4961:1: rule__XmlDocument__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4965:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4966:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4966:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4967:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__XmlDocument__Group_4__2__Impl10028); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4986:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4990:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4991:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__010065);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__010068);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4998:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5002:1: ( ( 'module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5003:1: ( 'module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5003:1: ( 'module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5004:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__Module__Group__0__Impl10096); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5017:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5021:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5022:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__110127);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__110130);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5029:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5033:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5034:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5034:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5035:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5036:1: ( rule__Module__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5036:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl10157);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5046:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5050:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5051:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__210187);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__210190);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5058:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5062:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5063:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5063:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5064:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Module__Group__2__Impl10218); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5077:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5081:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5082:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__310249);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__310252);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5089:1: rule__Module__Group__3__Impl : ( ( rule__Module__Group_3__0 )? ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5093:1: ( ( ( rule__Module__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5094:1: ( ( rule__Module__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5094:1: ( ( rule__Module__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5095:1: ( rule__Module__Group_3__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5096:1: ( rule__Module__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43||LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5096:2: rule__Module__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl10279);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5106:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5110:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5111:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__410310);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__410313);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5118:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5122:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5123:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5123:1: ( ( rule__Module__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5124:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5125:1: ( rule__Module__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5125:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl10340);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5135:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5139:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5140:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__510371);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__510374);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5147:1: rule__Module__Group__5__Impl : ( ( rule__Module__ComponentsAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5151:1: ( ( ( rule__Module__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5152:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5152:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5153:1: ( rule__Module__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5154:1: ( rule__Module__ComponentsAssignment_5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==49||(LA39_0>=52 && LA39_0<=54)||LA39_0==57||(LA39_0>=59 && LA39_0<=63)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5154:2: rule__Module__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl10401);
            	    rule__Module__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5164:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5168:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5169:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__610432);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__610435);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5176:1: rule__Module__Group__6__Impl : ( ( rule__Module__RestrictionsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5180:1: ( ( ( rule__Module__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5181:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5181:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5182:1: ( rule__Module__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5183:1: ( rule__Module__RestrictionsAssignment_6 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==65) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5183:2: rule__Module__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl10462);
            	    rule__Module__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5193:1: rule__Module__Group__7 : rule__Module__Group__7__Impl ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5197:1: ( rule__Module__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5198:2: rule__Module__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__710493);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5204:1: rule__Module__Group__7__Impl : ( '}' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5208:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5209:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5209:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5210:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,41,FOLLOW_41_in_rule__Module__Group__7__Impl10521); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5239:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5243:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5244:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__010568);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__010571);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5251:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__Group_3_0__0 )* ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5255:1: ( ( ( rule__Module__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5256:1: ( ( rule__Module__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5256:1: ( ( rule__Module__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5257:1: ( rule__Module__Group_3_0__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5258:1: ( rule__Module__Group_3_0__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==47) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5258:2: rule__Module__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl10598);
            	    rule__Module__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5268:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5272:1: ( rule__Module__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5273:2: rule__Module__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__110629);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5279:1: rule__Module__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5283:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5284:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5284:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5285:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,43,FOLLOW_43_in_rule__Module__Group_3__1__Impl10657); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5302:1: rule__Module__Group_3_0__0 : rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 ;
    public final void rule__Module__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5306:1: ( rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5307:2: rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__010692);
            rule__Module__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__010695);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5314:1: rule__Module__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__Module__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5318:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5319:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5319:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5320:1: 'attributes'
            {
             before(grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Module__Group_3_0__0__Impl10723); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5333:1: rule__Module__Group_3_0__1 : rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 ;
    public final void rule__Module__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5337:1: ( rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5338:2: rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__110754);
            rule__Module__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__110757);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5345:1: rule__Module__Group_3_0__1__Impl : ( ( rule__Module__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__Module__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5349:1: ( ( ( rule__Module__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5350:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5350:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5351:1: ( rule__Module__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5352:1: ( rule__Module__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5352:2: rule__Module__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl10784);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5362:1: rule__Module__Group_3_0__2 : rule__Module__Group_3_0__2__Impl ;
    public final void rule__Module__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5366:1: ( rule__Module__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5367:2: rule__Module__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__210814);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5373:1: rule__Module__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__Module__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5377:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5378:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5378:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5379:1: ( ',' )?
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5380:1: ( ',' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5381:2: ','
                    {
                    match(input,45,FOLLOW_45_in_rule__Module__Group_3_0__2__Impl10843); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5398:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5402:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5403:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__010882);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__010885);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5410:1: rule__Module__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5414:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5415:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5415:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5416:1: 'matching'
            {
             before(grammarAccess.getModuleAccess().getMatchingKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__Module__Group_4__0__Impl10913); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5429:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl rule__Module__Group_4__2 ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5433:1: ( rule__Module__Group_4__1__Impl rule__Module__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5434:2: rule__Module__Group_4__1__Impl rule__Module__Group_4__2
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__110944);
            rule__Module__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__110947);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5441:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__MatchingAssignment_4_1 ) ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5445:1: ( ( ( rule__Module__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5446:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5446:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5447:1: ( rule__Module__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5448:1: ( rule__Module__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5448:2: rule__Module__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl10974);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5458:1: rule__Module__Group_4__2 : rule__Module__Group_4__2__Impl ;
    public final void rule__Module__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5462:1: ( rule__Module__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5463:2: rule__Module__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__211004);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5469:1: rule__Module__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Module__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5473:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5474:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5474:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5475:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__Module__Group_4__2__Impl11032); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5494:1: rule__MetaModule__Group__0 : rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 ;
    public final void rule__MetaModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5498:1: ( rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5499:2: rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__011069);
            rule__MetaModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__011072);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5506:1: rule__MetaModule__Group__0__Impl : ( 'meta-module' ) ;
    public final void rule__MetaModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5510:1: ( ( 'meta-module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5511:1: ( 'meta-module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5511:1: ( 'meta-module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5512:1: 'meta-module'
            {
             before(grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__MetaModule__Group__0__Impl11100); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5525:1: rule__MetaModule__Group__1 : rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 ;
    public final void rule__MetaModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5529:1: ( rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5530:2: rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__111131);
            rule__MetaModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__111134);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5537:1: rule__MetaModule__Group__1__Impl : ( ( rule__MetaModule__NameAssignment_1 ) ) ;
    public final void rule__MetaModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5541:1: ( ( ( rule__MetaModule__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5542:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5542:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5543:1: ( rule__MetaModule__NameAssignment_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5544:1: ( rule__MetaModule__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5544:2: rule__MetaModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl11161);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5554:1: rule__MetaModule__Group__2 : rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 ;
    public final void rule__MetaModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5558:1: ( rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5559:2: rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__211191);
            rule__MetaModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__211194);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5566:1: rule__MetaModule__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5570:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5571:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5571:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5572:1: '{'
            {
             before(grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__MetaModule__Group__2__Impl11222); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5585:1: rule__MetaModule__Group__3 : rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 ;
    public final void rule__MetaModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5589:1: ( rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5590:2: rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__311253);
            rule__MetaModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__311256);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5597:1: rule__MetaModule__Group__3__Impl : ( ( rule__MetaModule__Group_3__0 )? ) ;
    public final void rule__MetaModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5601:1: ( ( ( rule__MetaModule__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5602:1: ( ( rule__MetaModule__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5602:1: ( ( rule__MetaModule__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5603:1: ( rule__MetaModule__Group_3__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5604:1: ( rule__MetaModule__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43||LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5604:2: rule__MetaModule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl11283);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5614:1: rule__MetaModule__Group__4 : rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 ;
    public final void rule__MetaModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5618:1: ( rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5619:2: rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__411314);
            rule__MetaModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__411317);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5626:1: rule__MetaModule__Group__4__Impl : ( ( rule__MetaModule__Group_4__0 )? ) ;
    public final void rule__MetaModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5630:1: ( ( ( rule__MetaModule__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5631:1: ( ( rule__MetaModule__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5631:1: ( ( rule__MetaModule__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5632:1: ( rule__MetaModule__Group_4__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5633:1: ( rule__MetaModule__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5633:2: rule__MetaModule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl11344);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5643:1: rule__MetaModule__Group__5 : rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 ;
    public final void rule__MetaModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5647:1: ( rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5648:2: rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__511375);
            rule__MetaModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__511378);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5655:1: rule__MetaModule__Group__5__Impl : ( ( rule__MetaModule__ComponentsAssignment_5 )* ) ;
    public final void rule__MetaModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5659:1: ( ( ( rule__MetaModule__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5660:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5660:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5661:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5662:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==49||(LA45_0>=52 && LA45_0<=54)||LA45_0==57||(LA45_0>=59 && LA45_0<=63)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5662:2: rule__MetaModule__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl11405);
            	    rule__MetaModule__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5672:1: rule__MetaModule__Group__6 : rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 ;
    public final void rule__MetaModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5676:1: ( rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5677:2: rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__611436);
            rule__MetaModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__611439);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5684:1: rule__MetaModule__Group__6__Impl : ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) ;
    public final void rule__MetaModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5688:1: ( ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5689:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5689:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5690:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5691:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==65) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5691:2: rule__MetaModule__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl11466);
            	    rule__MetaModule__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5701:1: rule__MetaModule__Group__7 : rule__MetaModule__Group__7__Impl ;
    public final void rule__MetaModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5705:1: ( rule__MetaModule__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5706:2: rule__MetaModule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__711497);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5712:1: rule__MetaModule__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5716:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5717:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5717:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5718:1: '}'
            {
             before(grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,41,FOLLOW_41_in_rule__MetaModule__Group__7__Impl11525); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5747:1: rule__MetaModule__Group_3__0 : rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 ;
    public final void rule__MetaModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5751:1: ( rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5752:2: rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__011572);
            rule__MetaModule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__011575);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5759:1: rule__MetaModule__Group_3__0__Impl : ( ( rule__MetaModule__Group_3_0__0 )* ) ;
    public final void rule__MetaModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5763:1: ( ( ( rule__MetaModule__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5764:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5764:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5765:1: ( rule__MetaModule__Group_3_0__0 )*
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5766:1: ( rule__MetaModule__Group_3_0__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==47) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5766:2: rule__MetaModule__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl11602);
            	    rule__MetaModule__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5776:1: rule__MetaModule__Group_3__1 : rule__MetaModule__Group_3__1__Impl ;
    public final void rule__MetaModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5780:1: ( rule__MetaModule__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5781:2: rule__MetaModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__111633);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5787:1: rule__MetaModule__Group_3__1__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5791:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5792:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5792:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5793:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,43,FOLLOW_43_in_rule__MetaModule__Group_3__1__Impl11661); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5810:1: rule__MetaModule__Group_3_0__0 : rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 ;
    public final void rule__MetaModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5814:1: ( rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5815:2: rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__011696);
            rule__MetaModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__011699);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5822:1: rule__MetaModule__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__MetaModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5826:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5827:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5827:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5828:1: 'attributes'
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__MetaModule__Group_3_0__0__Impl11727); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5841:1: rule__MetaModule__Group_3_0__1 : rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 ;
    public final void rule__MetaModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5845:1: ( rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5846:2: rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__111758);
            rule__MetaModule__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__111761);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5853:1: rule__MetaModule__Group_3_0__1__Impl : ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__MetaModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5857:1: ( ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5858:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5858:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5859:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5860:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5860:2: rule__MetaModule__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl11788);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5870:1: rule__MetaModule__Group_3_0__2 : rule__MetaModule__Group_3_0__2__Impl ;
    public final void rule__MetaModule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5874:1: ( rule__MetaModule__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5875:2: rule__MetaModule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__211818);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5881:1: rule__MetaModule__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__MetaModule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5885:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5886:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5886:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5887:1: ( ',' )?
            {
             before(grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5888:1: ( ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5889:2: ','
                    {
                    match(input,45,FOLLOW_45_in_rule__MetaModule__Group_3_0__2__Impl11847); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5906:1: rule__MetaModule__Group_4__0 : rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 ;
    public final void rule__MetaModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5910:1: ( rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5911:2: rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__011886);
            rule__MetaModule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__011889);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5918:1: rule__MetaModule__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__MetaModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5922:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5923:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5923:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5924:1: 'matching'
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__MetaModule__Group_4__0__Impl11917); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5937:1: rule__MetaModule__Group_4__1 : rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 ;
    public final void rule__MetaModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5941:1: ( rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5942:2: rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__111948);
            rule__MetaModule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__111951);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5949:1: rule__MetaModule__Group_4__1__Impl : ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) ;
    public final void rule__MetaModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5953:1: ( ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5954:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5954:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5955:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5956:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5956:2: rule__MetaModule__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl11978);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5966:1: rule__MetaModule__Group_4__2 : rule__MetaModule__Group_4__2__Impl ;
    public final void rule__MetaModule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5970:1: ( rule__MetaModule__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5971:2: rule__MetaModule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__212008);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5977:1: rule__MetaModule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5981:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5982:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5982:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5983:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__MetaModule__Group_4__2__Impl12036); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6002:1: rule__ExternalModule__Group__0 : rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1 ;
    public final void rule__ExternalModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6006:1: ( rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6007:2: rule__ExternalModule__Group__0__Impl rule__ExternalModule__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__0__Impl_in_rule__ExternalModule__Group__012073);
            rule__ExternalModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__1_in_rule__ExternalModule__Group__012076);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6014:1: rule__ExternalModule__Group__0__Impl : ( 'external-module' ) ;
    public final void rule__ExternalModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6018:1: ( ( 'external-module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6019:1: ( 'external-module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6019:1: ( 'external-module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6020:1: 'external-module'
            {
             before(grammarAccess.getExternalModuleAccess().getExternalModuleKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__ExternalModule__Group__0__Impl12104); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6033:1: rule__ExternalModule__Group__1 : rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2 ;
    public final void rule__ExternalModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6037:1: ( rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6038:2: rule__ExternalModule__Group__1__Impl rule__ExternalModule__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__1__Impl_in_rule__ExternalModule__Group__112135);
            rule__ExternalModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__2_in_rule__ExternalModule__Group__112138);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6045:1: rule__ExternalModule__Group__1__Impl : ( ( rule__ExternalModule__NameAssignment_1 ) ) ;
    public final void rule__ExternalModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6049:1: ( ( ( rule__ExternalModule__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6050:1: ( ( rule__ExternalModule__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6050:1: ( ( rule__ExternalModule__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6051:1: ( rule__ExternalModule__NameAssignment_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6052:1: ( rule__ExternalModule__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6052:2: rule__ExternalModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__NameAssignment_1_in_rule__ExternalModule__Group__1__Impl12165);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6062:1: rule__ExternalModule__Group__2 : rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3 ;
    public final void rule__ExternalModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6066:1: ( rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6067:2: rule__ExternalModule__Group__2__Impl rule__ExternalModule__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__2__Impl_in_rule__ExternalModule__Group__212195);
            rule__ExternalModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__3_in_rule__ExternalModule__Group__212198);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6074:1: rule__ExternalModule__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6078:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6079:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6079:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6080:1: '{'
            {
             before(grammarAccess.getExternalModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__ExternalModule__Group__2__Impl12226); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6093:1: rule__ExternalModule__Group__3 : rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4 ;
    public final void rule__ExternalModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6097:1: ( rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6098:2: rule__ExternalModule__Group__3__Impl rule__ExternalModule__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__3__Impl_in_rule__ExternalModule__Group__312257);
            rule__ExternalModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__4_in_rule__ExternalModule__Group__312260);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6105:1: rule__ExternalModule__Group__3__Impl : ( ( rule__ExternalModule__Group_3__0 )? ) ;
    public final void rule__ExternalModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6109:1: ( ( ( rule__ExternalModule__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6110:1: ( ( rule__ExternalModule__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6110:1: ( ( rule__ExternalModule__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6111:1: ( rule__ExternalModule__Group_3__0 )?
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6112:1: ( rule__ExternalModule__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43||LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6112:2: rule__ExternalModule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExternalModule__Group_3__0_in_rule__ExternalModule__Group__3__Impl12287);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6122:1: rule__ExternalModule__Group__4 : rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5 ;
    public final void rule__ExternalModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6126:1: ( rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6127:2: rule__ExternalModule__Group__4__Impl rule__ExternalModule__Group__5
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__4__Impl_in_rule__ExternalModule__Group__412318);
            rule__ExternalModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__5_in_rule__ExternalModule__Group__412321);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6134:1: rule__ExternalModule__Group__4__Impl : ( ( rule__ExternalModule__Group_4__0 )? ) ;
    public final void rule__ExternalModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6138:1: ( ( ( rule__ExternalModule__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6139:1: ( ( rule__ExternalModule__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6139:1: ( ( rule__ExternalModule__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6140:1: ( rule__ExternalModule__Group_4__0 )?
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6141:1: ( rule__ExternalModule__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6141:2: rule__ExternalModule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExternalModule__Group_4__0_in_rule__ExternalModule__Group__4__Impl12348);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6151:1: rule__ExternalModule__Group__5 : rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6 ;
    public final void rule__ExternalModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6155:1: ( rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6156:2: rule__ExternalModule__Group__5__Impl rule__ExternalModule__Group__6
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__5__Impl_in_rule__ExternalModule__Group__512379);
            rule__ExternalModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__6_in_rule__ExternalModule__Group__512382);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6163:1: rule__ExternalModule__Group__5__Impl : ( ( rule__ExternalModule__ComponentsAssignment_5 )* ) ;
    public final void rule__ExternalModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6167:1: ( ( ( rule__ExternalModule__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6168:1: ( ( rule__ExternalModule__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6168:1: ( ( rule__ExternalModule__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6169:1: ( rule__ExternalModule__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getExternalModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6170:1: ( rule__ExternalModule__ComponentsAssignment_5 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==49||(LA51_0>=52 && LA51_0<=54)||LA51_0==57||(LA51_0>=59 && LA51_0<=63)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6170:2: rule__ExternalModule__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__ComponentsAssignment_5_in_rule__ExternalModule__Group__5__Impl12409);
            	    rule__ExternalModule__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6180:1: rule__ExternalModule__Group__6 : rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7 ;
    public final void rule__ExternalModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6184:1: ( rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6185:2: rule__ExternalModule__Group__6__Impl rule__ExternalModule__Group__7
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__6__Impl_in_rule__ExternalModule__Group__612440);
            rule__ExternalModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group__7_in_rule__ExternalModule__Group__612443);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6192:1: rule__ExternalModule__Group__6__Impl : ( ( rule__ExternalModule__RestrictionsAssignment_6 )* ) ;
    public final void rule__ExternalModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6196:1: ( ( ( rule__ExternalModule__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6197:1: ( ( rule__ExternalModule__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6197:1: ( ( rule__ExternalModule__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6198:1: ( rule__ExternalModule__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getExternalModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6199:1: ( rule__ExternalModule__RestrictionsAssignment_6 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==65) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6199:2: rule__ExternalModule__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__RestrictionsAssignment_6_in_rule__ExternalModule__Group__6__Impl12470);
            	    rule__ExternalModule__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6209:1: rule__ExternalModule__Group__7 : rule__ExternalModule__Group__7__Impl ;
    public final void rule__ExternalModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6213:1: ( rule__ExternalModule__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6214:2: rule__ExternalModule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group__7__Impl_in_rule__ExternalModule__Group__712501);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6220:1: rule__ExternalModule__Group__7__Impl : ( '}' ) ;
    public final void rule__ExternalModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6224:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6225:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6225:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6226:1: '}'
            {
             before(grammarAccess.getExternalModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,41,FOLLOW_41_in_rule__ExternalModule__Group__7__Impl12529); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6255:1: rule__ExternalModule__Group_3__0 : rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1 ;
    public final void rule__ExternalModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6259:1: ( rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6260:2: rule__ExternalModule__Group_3__0__Impl rule__ExternalModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3__0__Impl_in_rule__ExternalModule__Group_3__012576);
            rule__ExternalModule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3__1_in_rule__ExternalModule__Group_3__012579);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6267:1: rule__ExternalModule__Group_3__0__Impl : ( ( rule__ExternalModule__Group_3_0__0 )* ) ;
    public final void rule__ExternalModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6271:1: ( ( ( rule__ExternalModule__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6272:1: ( ( rule__ExternalModule__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6272:1: ( ( rule__ExternalModule__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6273:1: ( rule__ExternalModule__Group_3_0__0 )*
            {
             before(grammarAccess.getExternalModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6274:1: ( rule__ExternalModule__Group_3_0__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==47) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6274:2: rule__ExternalModule__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__0_in_rule__ExternalModule__Group_3__0__Impl12606);
            	    rule__ExternalModule__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6284:1: rule__ExternalModule__Group_3__1 : rule__ExternalModule__Group_3__1__Impl ;
    public final void rule__ExternalModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6288:1: ( rule__ExternalModule__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6289:2: rule__ExternalModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3__1__Impl_in_rule__ExternalModule__Group_3__112637);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6295:1: rule__ExternalModule__Group_3__1__Impl : ( ';' ) ;
    public final void rule__ExternalModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6299:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6300:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6300:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6301:1: ';'
            {
             before(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,43,FOLLOW_43_in_rule__ExternalModule__Group_3__1__Impl12665); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6318:1: rule__ExternalModule__Group_3_0__0 : rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1 ;
    public final void rule__ExternalModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6322:1: ( rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6323:2: rule__ExternalModule__Group_3_0__0__Impl rule__ExternalModule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__0__Impl_in_rule__ExternalModule__Group_3_0__012700);
            rule__ExternalModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__1_in_rule__ExternalModule__Group_3_0__012703);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6330:1: rule__ExternalModule__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__ExternalModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6334:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6335:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6335:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6336:1: 'attributes'
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__ExternalModule__Group_3_0__0__Impl12731); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6349:1: rule__ExternalModule__Group_3_0__1 : rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2 ;
    public final void rule__ExternalModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6353:1: ( rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6354:2: rule__ExternalModule__Group_3_0__1__Impl rule__ExternalModule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__1__Impl_in_rule__ExternalModule__Group_3_0__112762);
            rule__ExternalModule__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__2_in_rule__ExternalModule__Group_3_0__112765);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6361:1: rule__ExternalModule__Group_3_0__1__Impl : ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__ExternalModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6365:1: ( ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6366:1: ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6366:1: ( ( rule__ExternalModule__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6367:1: ( rule__ExternalModule__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6368:1: ( rule__ExternalModule__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6368:2: rule__ExternalModule__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__AttributesAssignment_3_0_1_in_rule__ExternalModule__Group_3_0__1__Impl12792);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6378:1: rule__ExternalModule__Group_3_0__2 : rule__ExternalModule__Group_3_0__2__Impl ;
    public final void rule__ExternalModule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6382:1: ( rule__ExternalModule__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6383:2: rule__ExternalModule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_3_0__2__Impl_in_rule__ExternalModule__Group_3_0__212822);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6389:1: rule__ExternalModule__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__ExternalModule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6393:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6394:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6394:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6395:1: ( ',' )?
            {
             before(grammarAccess.getExternalModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6396:1: ( ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==45) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6397:2: ','
                    {
                    match(input,45,FOLLOW_45_in_rule__ExternalModule__Group_3_0__2__Impl12851); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6414:1: rule__ExternalModule__Group_4__0 : rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1 ;
    public final void rule__ExternalModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6418:1: ( rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6419:2: rule__ExternalModule__Group_4__0__Impl rule__ExternalModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__0__Impl_in_rule__ExternalModule__Group_4__012890);
            rule__ExternalModule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_4__1_in_rule__ExternalModule__Group_4__012893);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6426:1: rule__ExternalModule__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__ExternalModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6430:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6431:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6431:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6432:1: 'matching'
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingKeyword_4_0()); 
            match(input,50,FOLLOW_50_in_rule__ExternalModule__Group_4__0__Impl12921); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6445:1: rule__ExternalModule__Group_4__1 : rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2 ;
    public final void rule__ExternalModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6449:1: ( rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6450:2: rule__ExternalModule__Group_4__1__Impl rule__ExternalModule__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__1__Impl_in_rule__ExternalModule__Group_4__112952);
            rule__ExternalModule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalModule__Group_4__2_in_rule__ExternalModule__Group_4__112955);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6457:1: rule__ExternalModule__Group_4__1__Impl : ( ( rule__ExternalModule__MatchingAssignment_4_1 ) ) ;
    public final void rule__ExternalModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6461:1: ( ( ( rule__ExternalModule__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6462:1: ( ( rule__ExternalModule__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6462:1: ( ( rule__ExternalModule__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6463:1: ( rule__ExternalModule__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6464:1: ( rule__ExternalModule__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6464:2: rule__ExternalModule__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExternalModule__MatchingAssignment_4_1_in_rule__ExternalModule__Group_4__1__Impl12982);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6474:1: rule__ExternalModule__Group_4__2 : rule__ExternalModule__Group_4__2__Impl ;
    public final void rule__ExternalModule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6478:1: ( rule__ExternalModule__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6479:2: rule__ExternalModule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalModule__Group_4__2__Impl_in_rule__ExternalModule__Group_4__213012);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6485:1: rule__ExternalModule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ExternalModule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6489:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6490:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6490:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6491:1: ';'
            {
             before(grammarAccess.getExternalModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,43,FOLLOW_43_in_rule__ExternalModule__Group_4__2__Impl13040); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6510:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6514:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6515:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013077);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013080);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6522:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6526:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6527:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6527:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6528:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13107); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6539:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6543:1: ( rule__QualifiedName__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6544:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113136);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6550:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6554:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6555:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6555:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6556:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6557:1: ( rule__QualifiedName__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==64) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6557:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13163);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6571:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6575:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6576:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013198);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013201);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6583:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6587:1: ( ( '.' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6588:1: ( '.' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6588:1: ( '.' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6589:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,64,FOLLOW_64_in_rule__QualifiedName__Group_1__0__Impl13229); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6602:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6606:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6607:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113260);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6613:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6617:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6618:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6618:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6619:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13287); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6634:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6638:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6639:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013320);
            rule__Restriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013323);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6646:1: rule__Restriction__Group__0__Impl : ( 'restriction' ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6650:1: ( ( 'restriction' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6651:1: ( 'restriction' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6651:1: ( 'restriction' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6652:1: 'restriction'
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__Restriction__Group__0__Impl13351); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6665:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6669:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6670:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113382);
            rule__Restriction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113385);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6677:1: rule__Restriction__Group__1__Impl : ( '{' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6681:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6682:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6682:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6683:1: '{'
            {
             before(grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Restriction__Group__1__Impl13413); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6696:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6700:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6701:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213444);
            rule__Restriction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__213447);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6708:1: rule__Restriction__Group__2__Impl : ( ( rule__Restriction__GroupClauseAssignment_2 )? ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6712:1: ( ( ( rule__Restriction__GroupClauseAssignment_2 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6713:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6713:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6714:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6715:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=22 && LA56_0<=25)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6715:2: rule__Restriction__GroupClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl13474);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6725:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl rule__Restriction__Group__4 ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6729:1: ( rule__Restriction__Group__3__Impl rule__Restriction__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6730:2: rule__Restriction__Group__3__Impl rule__Restriction__Group__4
            {
            pushFollow(FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__313505);
            rule__Restriction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__313508);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6737:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__ComponentAAssignment_3 )* ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6741:1: ( ( ( rule__Restriction__ComponentAAssignment_3 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6742:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6742:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6743:1: ( rule__Restriction__ComponentAAssignment_3 )*
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAssignment_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6744:1: ( rule__Restriction__ComponentAAssignment_3 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID_ASML) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6744:2: rule__Restriction__ComponentAAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl13535);
            	    rule__Restriction__ComponentAAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6754:1: rule__Restriction__Group__4 : rule__Restriction__Group__4__Impl rule__Restriction__Group__5 ;
    public final void rule__Restriction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6758:1: ( rule__Restriction__Group__4__Impl rule__Restriction__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6759:2: rule__Restriction__Group__4__Impl rule__Restriction__Group__5
            {
            pushFollow(FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__413566);
            rule__Restriction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__413569);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6766:1: rule__Restriction__Group__4__Impl : ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) ;
    public final void rule__Restriction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6770:1: ( ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6771:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6771:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6772:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6773:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==22||(LA58_0>=26 && LA58_0<=28)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6773:2: rule__Restriction__PermissionClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl13596);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6783:1: rule__Restriction__Group__5 : rule__Restriction__Group__5__Impl rule__Restriction__Group__6 ;
    public final void rule__Restriction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6787:1: ( rule__Restriction__Group__5__Impl rule__Restriction__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6788:2: rule__Restriction__Group__5__Impl rule__Restriction__Group__6
            {
            pushFollow(FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__513627);
            rule__Restriction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__513630);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6795:1: rule__Restriction__Group__5__Impl : ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) ;
    public final void rule__Restriction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6799:1: ( ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6800:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6800:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6801:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6802:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6802:2: rule__Restriction__RelactionTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl13657);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6812:1: rule__Restriction__Group__6 : rule__Restriction__Group__6__Impl rule__Restriction__Group__7 ;
    public final void rule__Restriction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6816:1: ( rule__Restriction__Group__6__Impl rule__Restriction__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6817:2: rule__Restriction__Group__6__Impl rule__Restriction__Group__7
            {
            pushFollow(FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__613687);
            rule__Restriction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__613690);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6824:1: rule__Restriction__Group__6__Impl : ( ( rule__Restriction__ComponentBAssignment_6 ) ) ;
    public final void rule__Restriction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6828:1: ( ( ( rule__Restriction__ComponentBAssignment_6 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6829:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6829:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6830:1: ( rule__Restriction__ComponentBAssignment_6 )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6831:1: ( rule__Restriction__ComponentBAssignment_6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6831:2: rule__Restriction__ComponentBAssignment_6
            {
            pushFollow(FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl13717);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6841:1: rule__Restriction__Group__7 : rule__Restriction__Group__7__Impl rule__Restriction__Group__8 ;
    public final void rule__Restriction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6845:1: ( rule__Restriction__Group__7__Impl rule__Restriction__Group__8 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6846:2: rule__Restriction__Group__7__Impl rule__Restriction__Group__8
            {
            pushFollow(FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__713747);
            rule__Restriction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__8_in_rule__Restriction__Group__713750);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6853:1: rule__Restriction__Group__7__Impl : ( ( rule__Restriction__Group_7__0 )? ) ;
    public final void rule__Restriction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6857:1: ( ( ( rule__Restriction__Group_7__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6858:1: ( ( rule__Restriction__Group_7__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6858:1: ( ( rule__Restriction__Group_7__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6859:1: ( rule__Restriction__Group_7__0 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroup_7()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6860:1: ( rule__Restriction__Group_7__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6860:2: rule__Restriction__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Restriction__Group_7__0_in_rule__Restriction__Group__7__Impl13777);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6870:1: rule__Restriction__Group__8 : rule__Restriction__Group__8__Impl ;
    public final void rule__Restriction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6874:1: ( rule__Restriction__Group__8__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6875:2: rule__Restriction__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group__8__Impl_in_rule__Restriction__Group__813808);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6881:1: rule__Restriction__Group__8__Impl : ( '}' ) ;
    public final void rule__Restriction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6885:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6886:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6886:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6887:1: '}'
            {
             before(grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,41,FOLLOW_41_in_rule__Restriction__Group__8__Impl13836); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6918:1: rule__Restriction__Group_7__0 : rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1 ;
    public final void rule__Restriction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6922:1: ( rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6923:2: rule__Restriction__Group_7__0__Impl rule__Restriction__Group_7__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group_7__0__Impl_in_rule__Restriction__Group_7__013885);
            rule__Restriction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group_7__1_in_rule__Restriction__Group_7__013888);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6930:1: rule__Restriction__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Restriction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6934:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6935:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6935:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6936:1: 'description'
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionKeyword_7_0()); 
            match(input,55,FOLLOW_55_in_rule__Restriction__Group_7__0__Impl13916); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6949:1: rule__Restriction__Group_7__1 : rule__Restriction__Group_7__1__Impl ;
    public final void rule__Restriction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6953:1: ( rule__Restriction__Group_7__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6954:2: rule__Restriction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group_7__1__Impl_in_rule__Restriction__Group_7__113947);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6960:1: rule__Restriction__Group_7__1__Impl : ( ( rule__Restriction__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Restriction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6964:1: ( ( ( rule__Restriction__DescriptionAssignment_7_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6965:1: ( ( rule__Restriction__DescriptionAssignment_7_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6965:1: ( ( rule__Restriction__DescriptionAssignment_7_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6966:1: ( rule__Restriction__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionAssignment_7_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6967:1: ( rule__Restriction__DescriptionAssignment_7_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6967:2: rule__Restriction__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Restriction__DescriptionAssignment_7_1_in_rule__Restriction__Group_7__1__Impl13974);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6982:1: rule__ASMLModel__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ASMLModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6986:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6987:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6987:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6988:1: RULE_ID_ASML
            {
             before(grammarAccess.getASMLModelAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114013); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6997:1: rule__ASMLModel__ImportURIAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ASMLModel__ImportURIAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7001:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7002:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7002:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7003:1: RULE_STRING
            {
             before(grammarAccess.getASMLModelAccess().getImportURISTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114044); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7012:1: rule__ASMLModel__ViewsAssignment_4 : ( ruleView ) ;
    public final void rule__ASMLModel__ViewsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7016:1: ( ( ruleView ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7017:1: ( ruleView )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7017:1: ( ruleView )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7018:1: ruleView
            {
             before(grammarAccess.getASMLModelAccess().getViewsViewParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414075);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7027:1: rule__ASMLModel__IgnoreAssignment_5_1_0 : ( RULE_STRING ) ;
    public final void rule__ASMLModel__IgnoreAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7031:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7032:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7032:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7033:1: RULE_STRING
            {
             before(grammarAccess.getASMLModelAccess().getIgnoreSTRINGTerminalRuleCall_5_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ASMLModel__IgnoreAssignment_5_1_014106); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7042:1: rule__View__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7046:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7047:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7047:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7048:1: RULE_ID_ASML
            {
             before(grammarAccess.getViewAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114137); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7057:1: rule__View__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__View__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7061:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7062:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7062:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7063:1: ruleAttribute
            {
             before(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114168);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7072:1: rule__View__ComponentsAssignment_4 : ( ruleAbstractComponent ) ;
    public final void rule__View__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7076:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7077:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7077:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7078:1: ruleAbstractComponent
            {
             before(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414199);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7087:1: rule__View__RestrictionsAssignment_5 : ( ruleRestriction ) ;
    public final void rule__View__RestrictionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7091:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7092:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7092:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7093:1: ruleRestriction
            {
             before(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514230);
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7102:1: rule__Attribute__NameAssignment_0 : ( RULE_ID_ASML ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7106:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7107:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7107:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7108:1: RULE_ID_ASML
            {
             before(grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014261); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7117:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7121:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7122:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7122:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7123:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214292); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7134:1: rule__ModuleMatching__ParameterAssignment : ( ruleModuleMatchingParamenter ) ;
    public final void rule__ModuleMatching__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7138:1: ( ( ruleModuleMatchingParamenter ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7139:1: ( ruleModuleMatchingParamenter )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7139:1: ( ruleModuleMatchingParamenter )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7140:1: ruleModuleMatchingParamenter
            {
             before(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment14325);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7149:1: rule__ClassMatching__ExpressionMatchingAssignment_0 : ( ruleExpressionMatchingClause ) ;
    public final void rule__ClassMatching__ExpressionMatchingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7153:1: ( ( ruleExpressionMatchingClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7154:1: ( ruleExpressionMatchingClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7154:1: ( ruleExpressionMatchingClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7155:1: ruleExpressionMatchingClause
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_014356);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7164:1: rule__ClassMatching__ParameterAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassMatching__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7168:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7169:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7169:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7170:1: RULE_STRING
            {
             before(grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_114387); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7179:1: rule__File__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7183:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7184:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7184:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7185:1: RULE_ID_ASML
            {
             before(grammarAccess.getFileAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_114418); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7194:1: rule__File__MatchingAssignment_3_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__File__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7198:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7199:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7199:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7200:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_114449);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7209:1: rule__File__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__File__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7213:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7214:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7214:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7215:1: ruleCardinality
            {
             before(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_114480);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7224:1: rule__Configuration__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7228:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7229:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7229:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7230:1: RULE_ID_ASML
            {
             before(grammarAccess.getConfigurationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_114511); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7239:1: rule__Configuration__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Configuration__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7243:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7244:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7244:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7245:1: RULE_STRING
            {
             before(grammarAccess.getConfigurationAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_114542); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7254:1: rule__Configuration__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Configuration__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7258:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7259:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7259:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7260:1: ruleCardinality
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_114573);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7269:1: rule__Configuration__ConfigurationElementAssignment_5 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__ConfigurationElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7273:1: ( ( ruleConfigurationElement ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7274:1: ( ruleConfigurationElement )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7274:1: ( ruleConfigurationElement )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7275:1: ruleConfigurationElement
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_514604);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7284:1: rule__Method__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7288:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7289:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7289:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7290:1: RULE_ID_ASML
            {
             before(grammarAccess.getMethodAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_114635); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7299:1: rule__Method__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Method__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7303:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7304:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7304:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7305:1: RULE_STRING
            {
             before(grammarAccess.getMethodAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_114666); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7314:1: rule__Method__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Method__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7318:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7319:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7319:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7320:1: ruleCardinality
            {
             before(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_114697);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7329:1: rule__MetaClass__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__MetaClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7333:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7334:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7334:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7335:1: RULE_ID_ASML
            {
             before(grammarAccess.getMetaClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__MetaClass__NameAssignment_114728); 
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


    // $ANTLR start "rule__MetaClass__DescriptionAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7344:1: rule__MetaClass__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__MetaClass__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7348:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7349:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7349:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7350:1: RULE_STRING
            {
             before(grammarAccess.getMetaClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetaClass__DescriptionAssignment_3_114759); 
             after(grammarAccess.getMetaClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__DescriptionAssignment_3_1"


    // $ANTLR start "rule__MetaClass__MatchingAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7359:1: rule__MetaClass__MatchingAssignment_4_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__MetaClass__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7363:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7364:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7364:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7365:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getMetaClassAccess().getMatchingAbstractNameConvetionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__MetaClass__MatchingAssignment_4_114790);
            ruleAbstractNameConvetion();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getMatchingAbstractNameConvetionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__MatchingAssignment_4_1"


    // $ANTLR start "rule__MetaClass__CardinalityAssignment_5_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7374:1: rule__MetaClass__CardinalityAssignment_5_1 : ( ruleCardinality ) ;
    public final void rule__MetaClass__CardinalityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7378:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7379:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7379:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7380:1: ruleCardinality
            {
             before(grammarAccess.getMetaClassAccess().getCardinalityCardinalityEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__MetaClass__CardinalityAssignment_5_114821);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getCardinalityCardinalityEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__CardinalityAssignment_5_1"


    // $ANTLR start "rule__MetaClass__MethodsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7389:1: rule__MetaClass__MethodsAssignment_6 : ( ruleMethod ) ;
    public final void rule__MetaClass__MethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7393:1: ( ( ruleMethod ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7394:1: ( ruleMethod )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7394:1: ( ruleMethod )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7395:1: ruleMethod
            {
             before(grammarAccess.getMetaClassAccess().getMethodsMethodParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__MetaClass__MethodsAssignment_614852);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getMethodsMethodParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__MethodsAssignment_6"


    // $ANTLR start "rule__ExternalClass__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7404:1: rule__ExternalClass__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ExternalClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7408:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7409:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7409:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7410:1: RULE_ID_ASML
            {
             before(grammarAccess.getExternalClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ExternalClass__NameAssignment_114883); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7419:1: rule__ExternalClass__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ExternalClass__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7423:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7424:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7424:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7425:1: RULE_STRING
            {
             before(grammarAccess.getExternalClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalClass__DescriptionAssignment_3_114914); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7434:1: rule__ExternalClass__TypeAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ExternalClass__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7438:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7439:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7439:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7440:1: RULE_STRING
            {
             before(grammarAccess.getExternalClassAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExternalClass__TypeAssignment_4_114945); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7449:1: rule__XmlElement__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7453:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7454:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7454:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7455:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlElementAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_114976); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7464:1: rule__XmlElement__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlElement__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7468:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7469:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7469:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7470:1: RULE_STRING
            {
             before(grammarAccess.getXmlElementAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115007); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7479:1: rule__XmlElement__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlElement__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7483:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7484:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7484:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7485:1: ruleCardinality
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115038);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7494:1: rule__XmlDocument__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlDocument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7498:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7499:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7499:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7500:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlDocumentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115069); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7509:1: rule__XmlDocument__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlDocument__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7513:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7514:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7514:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7515:1: RULE_STRING
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115100); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7524:1: rule__XmlDocument__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlDocument__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7528:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7529:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7529:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7530:1: ruleCardinality
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115131);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7539:1: rule__Module__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7543:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7544:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7544:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7545:1: RULE_ID_ASML
            {
             before(grammarAccess.getModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115162); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7554:1: rule__Module__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__Module__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7558:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7559:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7559:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7560:1: ruleAttribute
            {
             before(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115193);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7569:1: rule__Module__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__Module__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7573:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7574:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7574:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7575:1: ruleModuleMatching
            {
             before(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115224);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7584:1: rule__Module__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__Module__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7588:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7589:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7589:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7590:1: ruleAbstractComponent
            {
             before(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_515255);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7599:1: rule__Module__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__Module__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7603:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7604:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7604:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7605:1: ruleRestriction
            {
             before(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_615286);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7614:1: rule__MetaModule__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__MetaModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7618:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7619:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7619:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7620:1: RULE_ID_ASML
            {
             before(grammarAccess.getMetaModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_115317); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7629:1: rule__MetaModule__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__MetaModule__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7633:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7634:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7634:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7635:1: ruleAttribute
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_115348);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7644:1: rule__MetaModule__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__MetaModule__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7648:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7649:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7649:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7650:1: ruleModuleMatching
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_115379);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7659:1: rule__MetaModule__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__MetaModule__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7663:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7664:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7664:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7665:1: ruleAbstractComponent
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_515410);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7674:1: rule__MetaModule__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__MetaModule__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7678:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7679:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7679:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7680:1: ruleRestriction
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_615441);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7689:1: rule__ExternalModule__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ExternalModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7693:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7694:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7694:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7695:1: RULE_ID_ASML
            {
             before(grammarAccess.getExternalModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ExternalModule__NameAssignment_115472); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7704:1: rule__ExternalModule__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__ExternalModule__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7708:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7709:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7709:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7710:1: ruleAttribute
            {
             before(grammarAccess.getExternalModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__ExternalModule__AttributesAssignment_3_0_115503);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7719:1: rule__ExternalModule__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__ExternalModule__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7723:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7724:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7724:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7725:1: ruleModuleMatching
            {
             before(grammarAccess.getExternalModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__ExternalModule__MatchingAssignment_4_115534);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7734:1: rule__ExternalModule__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__ExternalModule__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7738:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7739:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7739:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7740:1: ruleAbstractComponent
            {
             before(grammarAccess.getExternalModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__ExternalModule__ComponentsAssignment_515565);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7749:1: rule__ExternalModule__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__ExternalModule__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7753:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7754:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7754:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7755:1: ruleRestriction
            {
             before(grammarAccess.getExternalModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__ExternalModule__RestrictionsAssignment_615596);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7764:1: rule__Restriction__GroupClauseAssignment_2 : ( ruleGroupClause ) ;
    public final void rule__Restriction__GroupClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7768:1: ( ( ruleGroupClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7769:1: ( ruleGroupClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7769:1: ( ruleGroupClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7770:1: ruleGroupClause
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_215627);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7779:1: rule__Restriction__ComponentAAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentAAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7783:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7784:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7784:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7785:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7786:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7787:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_315662);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7798:1: rule__Restriction__PermissionClauseAssignment_4 : ( rulePermissionClause ) ;
    public final void rule__Restriction__PermissionClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7802:1: ( ( rulePermissionClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7803:1: ( rulePermissionClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7803:1: ( rulePermissionClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7804:1: rulePermissionClause
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_415697);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7813:1: rule__Restriction__RelactionTypeAssignment_5 : ( ruleRelactionType ) ;
    public final void rule__Restriction__RelactionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7817:1: ( ( ruleRelactionType ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7818:1: ( ruleRelactionType )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7818:1: ( ruleRelactionType )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7819:1: ruleRelactionType
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_515728);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7828:1: rule__Restriction__ComponentBAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7832:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7833:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7833:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7834:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7835:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7836:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_615763);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7847:1: rule__Restriction__DescriptionAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Restriction__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7851:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7852:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7852:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7853:1: RULE_STRING
            {
             before(grammarAccess.getRestrictionAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Restriction__DescriptionAssignment_7_115798); 
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
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModuleMatchingParamenter__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ModuleMatchingParamenter__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GroupClause__Alternatives2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GroupClause__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GroupClause__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GroupClause__Alternatives2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PermissionClause__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PermissionClause__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PermissionClause__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PermissionClause__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RelactionType__Alternatives2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RelactionType__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelactionType__Alternatives2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RelactionType__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RelactionType__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RelactionType__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RelactionType__Alternatives2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelactionType__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RelactionType__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RelactionType__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ASMLModel__Group__0__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12493 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22553 = new BitSet(new long[]{0x0000560000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ASMLModel__Group__2__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32615 = new BitSet(new long[]{0x0000560000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42676 = new BitSet(new long[]{0x0000560000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl2706 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__52737 = new BitSet(new long[]{0x0000560000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__6_in_rule__ASMLModel__Group__52740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__0_in_rule__ASMLModel__Group__5__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__6__Impl_in_rule__ASMLModel__Group__62798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ASMLModel__Group__6__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__02871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__02874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ASMLModel__Group_3__0__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__12933 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__22993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ASMLModel__Group_3__2__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__0__Impl_in_rule__ASMLModel__Group_5__03058 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__1_in_rule__ASMLModel__Group_5__03061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ASMLModel__Group_5__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__1__Impl_in_rule__ASMLModel__Group_5__13120 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__2_in_rule__ASMLModel__Group_5__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__0_in_rule__ASMLModel__Group_5__1__Impl3150 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5__2__Impl_in_rule__ASMLModel__Group_5__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ASMLModel__Group_5__2__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__0__Impl_in_rule__ASMLModel__Group_5_1__03246 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__1_in_rule__ASMLModel__Group_5_1__03249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__IgnoreAssignment_5_1_0_in_rule__ASMLModel__Group_5_1__0__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_5_1__1__Impl_in_rule__ASMLModel__Group_5_1__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ASMLModel__Group_5_1__1__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__View__Group__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13434 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__13437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23494 = new BitSet(new long[]{0xFA728A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__23497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__View__Group__2__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33556 = new BitSet(new long[]{0xFA728A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__33559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43617 = new BitSet(new long[]{0xFA728A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__43620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3647 = new BitSet(new long[]{0xFA72000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53678 = new BitSet(new long[]{0xFA728A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__53681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__View__Group__6__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03812 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3842 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__View__Group_3__1__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__View__Group_3_0__0__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__13998 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__24058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__View__Group_3_0__2__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04126 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Attribute__Group__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__04311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__14371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__04432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__04435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__File__Group__0__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__14494 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__14497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__24554 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__24557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__File__Group__2__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__34616 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__File__Group__4_in_rule__File__Group__34619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__44677 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__File__Group__5_in_rule__File__Group__44680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__54738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__File__Group__5__Impl4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__04809 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__04812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__File__Group_3__0__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__14871 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__24931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__File__Group_3__2__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__04996 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__04999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__File__Group_4__0__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__15058 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__15061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__25118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__File__Group_4__2__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__05183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Configuration__Group__0__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__15245 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__15248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__25305 = new BitSet(new long[]{0xFA7E020000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__25308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Configuration__Group__2__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__35367 = new BitSet(new long[]{0xFA7E020000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__35370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__45428 = new BitSet(new long[]{0xFA7E020000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__45431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__55489 = new BitSet(new long[]{0xFA7E020000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__55492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl5519 = new BitSet(new long[]{0xFA72000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__65550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Configuration__Group__6__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__05623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__05626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Configuration__Group_3__0__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__15685 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__15688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__25745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Configuration__Group_3__2__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__05810 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__05813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Configuration__Group_4__0__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__15872 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__15875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__25932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Configuration__Group_4__2__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__05997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__06000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Method__Group__0__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__16059 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__16062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__26119 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__26122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Method__Group__2__Impl6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__36181 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__36184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__46242 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__46245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__56303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Method__Group__5__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__06374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__06377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Method__Group_3__0__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__16436 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__16439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__26496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Method__Group_3__2__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__06561 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__06564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Method__Group_4__0__Impl6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__16623 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__16626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__26683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Method__Group_4__2__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__06748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__06751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__MetaClass__Group__0__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__16810 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__16813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__26870 = new BitSet(new long[]{0x01A8020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__26873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MetaClass__Group__2__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__36932 = new BitSet(new long[]{0x01A8020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__36935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__0_in_rule__MetaClass__Group__3__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__46993 = new BitSet(new long[]{0x01A8020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__46996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__0_in_rule__MetaClass__Group__4__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__57054 = new BitSet(new long[]{0x01A8020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__57057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__0_in_rule__MetaClass__Group__5__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__67115 = new BitSet(new long[]{0x01A8020000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__67118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__MethodsAssignment_6_in_rule__MetaClass__Group__6__Impl7145 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__77176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaClass__Group__7__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__0__Impl_in_rule__MetaClass__Group_3__07251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__1_in_rule__MetaClass__Group_3__07254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__MetaClass__Group_3__0__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__1__Impl_in_rule__MetaClass__Group_3__17313 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__2_in_rule__MetaClass__Group_3__17316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__DescriptionAssignment_3_1_in_rule__MetaClass__Group_3__1__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_3__2__Impl_in_rule__MetaClass__Group_3__27373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaClass__Group_3__2__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__0__Impl_in_rule__MetaClass__Group_4__07438 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__1_in_rule__MetaClass__Group_4__07441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__MetaClass__Group_4__0__Impl7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__1__Impl_in_rule__MetaClass__Group_4__17500 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__2_in_rule__MetaClass__Group_4__17503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__MatchingAssignment_4_1_in_rule__MetaClass__Group_4__1__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_4__2__Impl_in_rule__MetaClass__Group_4__27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaClass__Group_4__2__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__0__Impl_in_rule__MetaClass__Group_5__07625 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__1_in_rule__MetaClass__Group_5__07628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MetaClass__Group_5__0__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__1__Impl_in_rule__MetaClass__Group_5__17687 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__2_in_rule__MetaClass__Group_5__17690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__CardinalityAssignment_5_1_in_rule__MetaClass__Group_5__1__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaClass__Group_5__2__Impl_in_rule__MetaClass__Group_5__27747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaClass__Group_5__2__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__0__Impl_in_rule__ExternalClass__Group__07812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__1_in_rule__ExternalClass__Group__07815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ExternalClass__Group__0__Impl7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__1__Impl_in_rule__ExternalClass__Group__17874 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__2_in_rule__ExternalClass__Group__17877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__NameAssignment_1_in_rule__ExternalClass__Group__1__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__2__Impl_in_rule__ExternalClass__Group__27934 = new BitSet(new long[]{0x0480020000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__3_in_rule__ExternalClass__Group__27937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExternalClass__Group__2__Impl7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__3__Impl_in_rule__ExternalClass__Group__37996 = new BitSet(new long[]{0x0480020000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__4_in_rule__ExternalClass__Group__37999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__0_in_rule__ExternalClass__Group__3__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__4__Impl_in_rule__ExternalClass__Group__48057 = new BitSet(new long[]{0x0480020000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__5_in_rule__ExternalClass__Group__48060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__0_in_rule__ExternalClass__Group__4__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group__5__Impl_in_rule__ExternalClass__Group__58118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExternalClass__Group__5__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__0__Impl_in_rule__ExternalClass__Group_3__08189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__1_in_rule__ExternalClass__Group_3__08192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ExternalClass__Group_3__0__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__1__Impl_in_rule__ExternalClass__Group_3__18251 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__2_in_rule__ExternalClass__Group_3__18254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__DescriptionAssignment_3_1_in_rule__ExternalClass__Group_3__1__Impl8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_3__2__Impl_in_rule__ExternalClass__Group_3__28311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalClass__Group_3__2__Impl8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__0__Impl_in_rule__ExternalClass__Group_4__08376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__1_in_rule__ExternalClass__Group_4__08379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ExternalClass__Group_4__0__Impl8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__1__Impl_in_rule__ExternalClass__Group_4__18438 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__2_in_rule__ExternalClass__Group_4__18441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__TypeAssignment_4_1_in_rule__ExternalClass__Group_4__1__Impl8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalClass__Group_4__2__Impl_in_rule__ExternalClass__Group_4__28498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalClass__Group_4__2__Impl8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__08563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__08566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__XmlElement__Group__0__Impl8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__18625 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__18628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl8655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__28685 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__28688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__XmlElement__Group__2__Impl8716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__38747 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__38750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__48808 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__48811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__58869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XmlElement__Group__5__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__08940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__08943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__XmlElement__Group_3__0__Impl8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19002 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlElement__Group_3__2__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__09127 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__09130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlElement__Group_4__0__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__19189 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__29249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlElement__Group_4__2__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__09314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__09317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__XmlDocument__Group__0__Impl9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__19376 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__19379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl9406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__29436 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__29439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__XmlDocument__Group__2__Impl9467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__39498 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__39501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__49559 = new BitSet(new long[]{0x000C020000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__49562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__59620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XmlDocument__Group__5__Impl9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__09691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__09694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__XmlDocument__Group_3__0__Impl9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__19753 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__19756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl9783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__29813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlDocument__Group_3__2__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__09878 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__09881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlDocument__Group_4__0__Impl9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__19940 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__19943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlDocument__Group_4__2__Impl10028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__010065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__010068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Module__Group__0__Impl10096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__110127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__110130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__210187 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__210190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Module__Group__2__Impl10218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__310249 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__310252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl10279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__410310 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__410313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__510371 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__510374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl10401 = new BitSet(new long[]{0xFA72000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__610432 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__610435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl10462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__710493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Module__Group__7__Impl10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__010568 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__010571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl10598 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Module__Group_3__1__Impl10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__010692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__010695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Module__Group_3_0__0__Impl10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__110754 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__110757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl10784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__210814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Module__Group_3_0__2__Impl10843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__010882 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__010885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Module__Group_4__0__Impl10913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__110944 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__110947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl10974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__211004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Module__Group_4__2__Impl11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__011069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__011072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__MetaModule__Group__0__Impl11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__111131 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__111134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__211191 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__211194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MetaModule__Group__2__Impl11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__311253 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__311256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__411314 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__411317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__511375 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__511378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl11405 = new BitSet(new long[]{0xFA72000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__611436 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__611439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl11466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__711497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__MetaModule__Group__7__Impl11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__011572 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__011575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl11602 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__111633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaModule__Group_3__1__Impl11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__011696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__011699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MetaModule__Group_3_0__0__Impl11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__111758 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__111761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__211818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MetaModule__Group_3_0__2__Impl11847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__011886 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__011889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MetaModule__Group_4__0__Impl11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__111948 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__111951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__212008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaModule__Group_4__2__Impl12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__0__Impl_in_rule__ExternalModule__Group__012073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__1_in_rule__ExternalModule__Group__012076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ExternalModule__Group__0__Impl12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__1__Impl_in_rule__ExternalModule__Group__112135 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__2_in_rule__ExternalModule__Group__112138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__NameAssignment_1_in_rule__ExternalModule__Group__1__Impl12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__2__Impl_in_rule__ExternalModule__Group__212195 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__3_in_rule__ExternalModule__Group__212198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExternalModule__Group__2__Impl12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__3__Impl_in_rule__ExternalModule__Group__312257 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__4_in_rule__ExternalModule__Group__312260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__0_in_rule__ExternalModule__Group__3__Impl12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__4__Impl_in_rule__ExternalModule__Group__412318 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__5_in_rule__ExternalModule__Group__412321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__0_in_rule__ExternalModule__Group__4__Impl12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__5__Impl_in_rule__ExternalModule__Group__512379 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__6_in_rule__ExternalModule__Group__512382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__ComponentsAssignment_5_in_rule__ExternalModule__Group__5__Impl12409 = new BitSet(new long[]{0xFA72000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__6__Impl_in_rule__ExternalModule__Group__612440 = new BitSet(new long[]{0xFA768A0000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__7_in_rule__ExternalModule__Group__612443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__RestrictionsAssignment_6_in_rule__ExternalModule__Group__6__Impl12470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group__7__Impl_in_rule__ExternalModule__Group__712501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExternalModule__Group__7__Impl12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__0__Impl_in_rule__ExternalModule__Group_3__012576 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__1_in_rule__ExternalModule__Group_3__012579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__0_in_rule__ExternalModule__Group_3__0__Impl12606 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3__1__Impl_in_rule__ExternalModule__Group_3__112637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalModule__Group_3__1__Impl12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__0__Impl_in_rule__ExternalModule__Group_3_0__012700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__1_in_rule__ExternalModule__Group_3_0__012703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ExternalModule__Group_3_0__0__Impl12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__1__Impl_in_rule__ExternalModule__Group_3_0__112762 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__2_in_rule__ExternalModule__Group_3_0__112765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__AttributesAssignment_3_0_1_in_rule__ExternalModule__Group_3_0__1__Impl12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_3_0__2__Impl_in_rule__ExternalModule__Group_3_0__212822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExternalModule__Group_3_0__2__Impl12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__0__Impl_in_rule__ExternalModule__Group_4__012890 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__1_in_rule__ExternalModule__Group_4__012893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ExternalModule__Group_4__0__Impl12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__1__Impl_in_rule__ExternalModule__Group_4__112952 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__2_in_rule__ExternalModule__Group_4__112955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__MatchingAssignment_4_1_in_rule__ExternalModule__Group_4__1__Impl12982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalModule__Group_4__2__Impl_in_rule__ExternalModule__Group_4__213012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalModule__Group_4__2__Impl13040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__QualifiedName__Group_1__0__Impl13229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013320 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__Restriction__Group__0__Impl13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113382 = new BitSet(new long[]{0x0000007FFFC00020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Restriction__Group__1__Impl13413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213444 = new BitSet(new long[]{0x0000007FFFC00020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__213447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl13474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__313505 = new BitSet(new long[]{0x0000007FFFC00020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__313508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl13535 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__413566 = new BitSet(new long[]{0x0000007FFFC00020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__413569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__513627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__513630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__613687 = new BitSet(new long[]{0x0080020000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__613690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__713747 = new BitSet(new long[]{0x0080020000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__8_in_rule__Restriction__Group__713750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__0_in_rule__Restriction__Group__7__Impl13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__8__Impl_in_rule__Restriction__Group__813808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Restriction__Group__8__Impl13836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__0__Impl_in_rule__Restriction__Group_7__013885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__1_in_rule__Restriction__Group_7__013888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Restriction__Group_7__0__Impl13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group_7__1__Impl_in_rule__Restriction__Group_7__113947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__DescriptionAssignment_7_1_in_rule__Restriction__Group_7__1__Impl13974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ASMLModel__IgnoreAssignment_5_1_014106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment14325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_014356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_114387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_114418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_114449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_114480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_114511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_114542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_114573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_514604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_114635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_114666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_114697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__MetaClass__NameAssignment_114728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetaClass__DescriptionAssignment_3_114759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__MetaClass__MatchingAssignment_4_114790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__MetaClass__CardinalityAssignment_5_114821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__MetaClass__MethodsAssignment_614852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ExternalClass__NameAssignment_114883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalClass__DescriptionAssignment_3_114914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExternalClass__TypeAssignment_4_114945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_114976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_515255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_615286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_115317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_115348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_115379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_515410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_615441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ExternalModule__NameAssignment_115472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__ExternalModule__AttributesAssignment_3_0_115503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__ExternalModule__MatchingAssignment_4_115534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__ExternalModule__ComponentsAssignment_515565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__ExternalModule__RestrictionsAssignment_615596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_215627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_315662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_415697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_515728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_615763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Restriction__DescriptionAssignment_7_115798 = new BitSet(new long[]{0x0000000000000002L});

}