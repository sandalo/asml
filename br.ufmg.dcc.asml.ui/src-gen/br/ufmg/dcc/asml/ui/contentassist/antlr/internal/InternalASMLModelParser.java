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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID_ASML", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'0'", "'1..*'", "'0..*'", "'name start with'", "'name ends with'", "'related to component'", "'external definition'", "'by package name'", "'by folder name'", "'by package and folder name'", "'by external implementation'", "'null'", "'only'", "'any'", "'no one'", "'must'", "'can'", "'cannot'", "'access'", "'declare'", "'handle'", "'extend'", "'implement'", "'create'", "'throw'", "'use annotation'", "'depend'", "'requires'", "'architecture'", "'{'", "'}'", "'import'", "';'", "'view'", "'attributes'", "','", "':'", "'component'", "'matching'", "'cardinality'", "'framework-instantiation'", "'framework-class'", "'file'", "'configuration'", "'method'", "'class'", "'description'", "'matching:'", "'xmlElement'", "'xmlDocument'", "'layer'", "'module'", "'meta-module'", "'.'", "'restriction'"
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


    // $ANTLR start "entryRuleComponent"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:200:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:201:1: ( ruleComponent EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:202:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent361);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent368); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:209:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:213:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:214:1: ( ( rule__Component__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:214:1: ( ( rule__Component__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:215:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:216:1: ( rule__Component__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:216:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent394);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleFrameworkInstantiation"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:228:1: entryRuleFrameworkInstantiation : ruleFrameworkInstantiation EOF ;
    public final void entryRuleFrameworkInstantiation() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:229:1: ( ruleFrameworkInstantiation EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:230:1: ruleFrameworkInstantiation EOF
            {
             before(grammarAccess.getFrameworkInstantiationRule()); 
            pushFollow(FOLLOW_ruleFrameworkInstantiation_in_entryRuleFrameworkInstantiation421);
            ruleFrameworkInstantiation();

            state._fsp--;

             after(grammarAccess.getFrameworkInstantiationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameworkInstantiation428); 

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
    // $ANTLR end "entryRuleFrameworkInstantiation"


    // $ANTLR start "ruleFrameworkInstantiation"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:237:1: ruleFrameworkInstantiation : ( ( rule__FrameworkInstantiation__Group__0 ) ) ;
    public final void ruleFrameworkInstantiation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:241:2: ( ( ( rule__FrameworkInstantiation__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:242:1: ( ( rule__FrameworkInstantiation__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:242:1: ( ( rule__FrameworkInstantiation__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:243:1: ( rule__FrameworkInstantiation__Group__0 )
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:244:1: ( rule__FrameworkInstantiation__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:244:2: rule__FrameworkInstantiation__Group__0
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__0_in_ruleFrameworkInstantiation454);
            rule__FrameworkInstantiation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkInstantiationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrameworkInstantiation"


    // $ANTLR start "entryRuleFrameworkClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:256:1: entryRuleFrameworkClass : ruleFrameworkClass EOF ;
    public final void entryRuleFrameworkClass() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:257:1: ( ruleFrameworkClass EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:258:1: ruleFrameworkClass EOF
            {
             before(grammarAccess.getFrameworkClassRule()); 
            pushFollow(FOLLOW_ruleFrameworkClass_in_entryRuleFrameworkClass481);
            ruleFrameworkClass();

            state._fsp--;

             after(grammarAccess.getFrameworkClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameworkClass488); 

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
    // $ANTLR end "entryRuleFrameworkClass"


    // $ANTLR start "ruleFrameworkClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:265:1: ruleFrameworkClass : ( ( rule__FrameworkClass__Group__0 ) ) ;
    public final void ruleFrameworkClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:269:2: ( ( ( rule__FrameworkClass__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:270:1: ( ( rule__FrameworkClass__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:270:1: ( ( rule__FrameworkClass__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:271:1: ( rule__FrameworkClass__Group__0 )
            {
             before(grammarAccess.getFrameworkClassAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:272:1: ( rule__FrameworkClass__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:272:2: rule__FrameworkClass__Group__0
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__0_in_ruleFrameworkClass514);
            rule__FrameworkClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrameworkClass"


    // $ANTLR start "entryRuleLayerMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:286:1: entryRuleLayerMatching : ruleLayerMatching EOF ;
    public final void entryRuleLayerMatching() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:287:1: ( ruleLayerMatching EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:288:1: ruleLayerMatching EOF
            {
             before(grammarAccess.getLayerMatchingRule()); 
            pushFollow(FOLLOW_ruleLayerMatching_in_entryRuleLayerMatching543);
            ruleLayerMatching();

            state._fsp--;

             after(grammarAccess.getLayerMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayerMatching550); 

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
    // $ANTLR end "entryRuleLayerMatching"


    // $ANTLR start "ruleLayerMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:295:1: ruleLayerMatching : ( ( rule__LayerMatching__Group__0 ) ) ;
    public final void ruleLayerMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:299:2: ( ( ( rule__LayerMatching__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:300:1: ( ( rule__LayerMatching__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:300:1: ( ( rule__LayerMatching__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:301:1: ( rule__LayerMatching__Group__0 )
            {
             before(grammarAccess.getLayerMatchingAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:302:1: ( rule__LayerMatching__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:302:2: rule__LayerMatching__Group__0
            {
            pushFollow(FOLLOW_rule__LayerMatching__Group__0_in_ruleLayerMatching576);
            rule__LayerMatching__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerMatchingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerMatching"


    // $ANTLR start "entryRuleModuleMatching"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:314:1: entryRuleModuleMatching : ruleModuleMatching EOF ;
    public final void entryRuleModuleMatching() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:315:1: ( ruleModuleMatching EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:316:1: ruleModuleMatching EOF
            {
             before(grammarAccess.getModuleMatchingRule()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching603);
            ruleModuleMatching();

            state._fsp--;

             after(grammarAccess.getModuleMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleMatching610); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:323:1: ruleModuleMatching : ( ( rule__ModuleMatching__ParameterAssignment ) ) ;
    public final void ruleModuleMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:327:2: ( ( ( rule__ModuleMatching__ParameterAssignment ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:328:1: ( ( rule__ModuleMatching__ParameterAssignment ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:328:1: ( ( rule__ModuleMatching__ParameterAssignment ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:329:1: ( rule__ModuleMatching__ParameterAssignment )
            {
             before(grammarAccess.getModuleMatchingAccess().getParameterAssignment()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:330:1: ( rule__ModuleMatching__ParameterAssignment )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:330:2: rule__ModuleMatching__ParameterAssignment
            {
            pushFollow(FOLLOW_rule__ModuleMatching__ParameterAssignment_in_ruleModuleMatching636);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:342:1: entryRuleClassMatching : ruleClassMatching EOF ;
    public final void entryRuleClassMatching() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:343:1: ( ruleClassMatching EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:344:1: ruleClassMatching EOF
            {
             before(grammarAccess.getClassMatchingRule()); 
            pushFollow(FOLLOW_ruleClassMatching_in_entryRuleClassMatching663);
            ruleClassMatching();

            state._fsp--;

             after(grammarAccess.getClassMatchingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMatching670); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:351:1: ruleClassMatching : ( ( rule__ClassMatching__Group__0 ) ) ;
    public final void ruleClassMatching() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:355:2: ( ( ( rule__ClassMatching__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:356:1: ( ( rule__ClassMatching__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:356:1: ( ( rule__ClassMatching__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:357:1: ( rule__ClassMatching__Group__0 )
            {
             before(grammarAccess.getClassMatchingAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:358:1: ( rule__ClassMatching__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:358:2: rule__ClassMatching__Group__0
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__0_in_ruleClassMatching696);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:370:1: entryRuleConfigurationElement : ruleConfigurationElement EOF ;
    public final void entryRuleConfigurationElement() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:371:1: ( ruleConfigurationElement EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:372:1: ruleConfigurationElement EOF
            {
             before(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement723);
            ruleConfigurationElement();

            state._fsp--;

             after(grammarAccess.getConfigurationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement730); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:379:1: ruleConfigurationElement : ( ( rule__ConfigurationElement__Alternatives ) ) ;
    public final void ruleConfigurationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:383:2: ( ( ( rule__ConfigurationElement__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:384:1: ( ( rule__ConfigurationElement__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:384:1: ( ( rule__ConfigurationElement__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:385:1: ( rule__ConfigurationElement__Alternatives )
            {
             before(grammarAccess.getConfigurationElementAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:386:1: ( rule__ConfigurationElement__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:386:2: rule__ConfigurationElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement756);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:398:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:399:1: ( ruleFile EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:400:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile783);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile790); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:407:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:411:2: ( ( ( rule__File__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:412:1: ( ( rule__File__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:412:1: ( ( rule__File__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:413:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:414:1: ( rule__File__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:414:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile816);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:426:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:427:1: ( ruleConfiguration EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:428:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration843);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration850); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:435:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:439:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:440:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:440:1: ( ( rule__Configuration__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:441:1: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:442:1: ( rule__Configuration__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:442:2: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration876);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:454:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:455:1: ( ruleMethod EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:456:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod903);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod910); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:463:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:467:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:468:1: ( ( rule__Method__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:468:1: ( ( rule__Method__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:469:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:470:1: ( rule__Method__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:470:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod936);
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


    // $ANTLR start "entryRuleClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:482:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:483:1: ( ruleClass EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:484:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass963);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass970); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:491:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:495:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:496:1: ( ( rule__Class__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:496:1: ( ( rule__Class__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:497:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:498:1: ( rule__Class__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:498:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass996);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleXmlElement"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:510:1: entryRuleXmlElement : ruleXmlElement EOF ;
    public final void entryRuleXmlElement() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:511:1: ( ruleXmlElement EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:512:1: ruleXmlElement EOF
            {
             before(grammarAccess.getXmlElementRule()); 
            pushFollow(FOLLOW_ruleXmlElement_in_entryRuleXmlElement1023);
            ruleXmlElement();

            state._fsp--;

             after(grammarAccess.getXmlElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlElement1030); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:519:1: ruleXmlElement : ( ( rule__XmlElement__Group__0 ) ) ;
    public final void ruleXmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:523:2: ( ( ( rule__XmlElement__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:524:1: ( ( rule__XmlElement__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:524:1: ( ( rule__XmlElement__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:525:1: ( rule__XmlElement__Group__0 )
            {
             before(grammarAccess.getXmlElementAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:526:1: ( rule__XmlElement__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:526:2: rule__XmlElement__Group__0
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__0_in_ruleXmlElement1056);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:538:1: entryRuleXmlDocument : ruleXmlDocument EOF ;
    public final void entryRuleXmlDocument() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:539:1: ( ruleXmlDocument EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:540:1: ruleXmlDocument EOF
            {
             before(grammarAccess.getXmlDocumentRule()); 
            pushFollow(FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument1083);
            ruleXmlDocument();

            state._fsp--;

             after(grammarAccess.getXmlDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlDocument1090); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:547:1: ruleXmlDocument : ( ( rule__XmlDocument__Group__0 ) ) ;
    public final void ruleXmlDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:551:2: ( ( ( rule__XmlDocument__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:552:1: ( ( rule__XmlDocument__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:552:1: ( ( rule__XmlDocument__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:553:1: ( rule__XmlDocument__Group__0 )
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:554:1: ( rule__XmlDocument__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:554:2: rule__XmlDocument__Group__0
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__0_in_ruleXmlDocument1116);
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


    // $ANTLR start "entryRuleLayer"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:566:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:567:1: ( ruleLayer EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:568:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer1143);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer1150); 

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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:575:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:579:2: ( ( ( rule__Layer__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:580:1: ( ( rule__Layer__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:580:1: ( ( rule__Layer__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:581:1: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:582:1: ( rule__Layer__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:582:2: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_rule__Layer__Group__0_in_ruleLayer1176);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleModule"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:594:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:595:1: ( ruleModule EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:596:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule1203);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule1210); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:603:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:607:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:608:1: ( ( rule__Module__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:608:1: ( ( rule__Module__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:609:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:610:1: ( rule__Module__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:610:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule1236);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:622:1: entryRuleMetaModule : ruleMetaModule EOF ;
    public final void entryRuleMetaModule() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:623:1: ( ruleMetaModule EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:624:1: ruleMetaModule EOF
            {
             before(grammarAccess.getMetaModuleRule()); 
            pushFollow(FOLLOW_ruleMetaModule_in_entryRuleMetaModule1263);
            ruleMetaModule();

            state._fsp--;

             after(grammarAccess.getMetaModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModule1270); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:631:1: ruleMetaModule : ( ( rule__MetaModule__Group__0 ) ) ;
    public final void ruleMetaModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:635:2: ( ( ( rule__MetaModule__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:636:1: ( ( rule__MetaModule__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:636:1: ( ( rule__MetaModule__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:637:1: ( rule__MetaModule__Group__0 )
            {
             before(grammarAccess.getMetaModuleAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:638:1: ( rule__MetaModule__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:638:2: rule__MetaModule__Group__0
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__0_in_ruleMetaModule1296);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:650:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:651:1: ( ruleQualifiedName EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:652:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1323);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1330); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:659:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:663:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:664:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:664:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:665:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:666:1: ( rule__QualifiedName__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:666:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1356);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:678:1: entryRuleRestriction : ruleRestriction EOF ;
    public final void entryRuleRestriction() throws RecognitionException {
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:679:1: ( ruleRestriction EOF )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:680:1: ruleRestriction EOF
            {
             before(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction1383);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction1390); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:687:1: ruleRestriction : ( ( rule__Restriction__Group__0 ) ) ;
    public final void ruleRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:691:2: ( ( ( rule__Restriction__Group__0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:692:1: ( ( rule__Restriction__Group__0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:692:1: ( ( rule__Restriction__Group__0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:693:1: ( rule__Restriction__Group__0 )
            {
             before(grammarAccess.getRestrictionAccess().getGroup()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:694:1: ( rule__Restriction__Group__0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:694:2: rule__Restriction__Group__0
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0_in_ruleRestriction1416);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:707:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:711:1: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:712:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:712:1: ( ( rule__Cardinality__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:713:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:714:1: ( rule__Cardinality__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:714:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1453);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:726:1: ruleExpressionMatchingClause : ( ( rule__ExpressionMatchingClause__Alternatives ) ) ;
    public final void ruleExpressionMatchingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:730:1: ( ( ( rule__ExpressionMatchingClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:731:1: ( ( rule__ExpressionMatchingClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:731:1: ( ( rule__ExpressionMatchingClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:732:1: ( rule__ExpressionMatchingClause__Alternatives )
            {
             before(grammarAccess.getExpressionMatchingClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:733:1: ( rule__ExpressionMatchingClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:733:2: rule__ExpressionMatchingClause__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionMatchingClause__Alternatives_in_ruleExpressionMatchingClause1489);
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


    // $ANTLR start "ruleLayerMatchingClause"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:745:1: ruleLayerMatchingClause : ( ( rule__LayerMatchingClause__Alternatives ) ) ;
    public final void ruleLayerMatchingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:749:1: ( ( ( rule__LayerMatchingClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:750:1: ( ( rule__LayerMatchingClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:750:1: ( ( rule__LayerMatchingClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:751:1: ( rule__LayerMatchingClause__Alternatives )
            {
             before(grammarAccess.getLayerMatchingClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:752:1: ( rule__LayerMatchingClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:752:2: rule__LayerMatchingClause__Alternatives
            {
            pushFollow(FOLLOW_rule__LayerMatchingClause__Alternatives_in_ruleLayerMatchingClause1525);
            rule__LayerMatchingClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayerMatchingClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayerMatchingClause"


    // $ANTLR start "ruleModuleMatchingParamenter"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:764:1: ruleModuleMatchingParamenter : ( ( rule__ModuleMatchingParamenter__Alternatives ) ) ;
    public final void ruleModuleMatchingParamenter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:768:1: ( ( ( rule__ModuleMatchingParamenter__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:769:1: ( ( rule__ModuleMatchingParamenter__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:769:1: ( ( rule__ModuleMatchingParamenter__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:770:1: ( rule__ModuleMatchingParamenter__Alternatives )
            {
             before(grammarAccess.getModuleMatchingParamenterAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:771:1: ( rule__ModuleMatchingParamenter__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:771:2: rule__ModuleMatchingParamenter__Alternatives
            {
            pushFollow(FOLLOW_rule__ModuleMatchingParamenter__Alternatives_in_ruleModuleMatchingParamenter1561);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:783:1: ruleGroupClause : ( ( rule__GroupClause__Alternatives ) ) ;
    public final void ruleGroupClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:787:1: ( ( ( rule__GroupClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:788:1: ( ( rule__GroupClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:788:1: ( ( rule__GroupClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:789:1: ( rule__GroupClause__Alternatives )
            {
             before(grammarAccess.getGroupClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:790:1: ( rule__GroupClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:790:2: rule__GroupClause__Alternatives
            {
            pushFollow(FOLLOW_rule__GroupClause__Alternatives_in_ruleGroupClause1597);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:802:1: rulePermissionClause : ( ( rule__PermissionClause__Alternatives ) ) ;
    public final void rulePermissionClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:806:1: ( ( ( rule__PermissionClause__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:807:1: ( ( rule__PermissionClause__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:807:1: ( ( rule__PermissionClause__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:808:1: ( rule__PermissionClause__Alternatives )
            {
             before(grammarAccess.getPermissionClauseAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:809:1: ( rule__PermissionClause__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:809:2: rule__PermissionClause__Alternatives
            {
            pushFollow(FOLLOW_rule__PermissionClause__Alternatives_in_rulePermissionClause1633);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:821:1: ruleRelactionType : ( ( rule__RelactionType__Alternatives ) ) ;
    public final void ruleRelactionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:825:1: ( ( ( rule__RelactionType__Alternatives ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:826:1: ( ( rule__RelactionType__Alternatives ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:826:1: ( ( rule__RelactionType__Alternatives ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:827:1: ( rule__RelactionType__Alternatives )
            {
             before(grammarAccess.getRelactionTypeAccess().getAlternatives()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:1: ( rule__RelactionType__Alternatives )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:828:2: rule__RelactionType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelactionType__Alternatives_in_ruleRelactionType1669);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:839:1: rule__AbstractComponent__Alternatives : ( ( ruleLayer ) | ( ruleModule ) | ( ruleMetaModule ) | ( ruleClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) | ( ruleComponent ) | ( ruleFrameworkInstantiation ) | ( ruleFrameworkClass ) );
    public final void rule__AbstractComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:843:1: ( ( ruleLayer ) | ( ruleModule ) | ( ruleMetaModule ) | ( ruleClass ) | ( ruleMethod ) | ( ruleConfigurationElement ) | ( ruleComponent ) | ( ruleFrameworkInstantiation ) | ( ruleFrameworkClass ) )
            int alt1=9;
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
            case 58:
                {
                alt1=4;
                }
                break;
            case 57:
                {
                alt1=5;
                }
                break;
            case 55:
            case 56:
            case 61:
            case 62:
                {
                alt1=6;
                }
                break;
            case 50:
                {
                alt1=7;
                }
                break;
            case 53:
                {
                alt1=8;
                }
                break;
            case 54:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:844:1: ( ruleLayer )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:844:1: ( ruleLayer )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:845:1: ruleLayer
                    {
                     before(grammarAccess.getAbstractComponentAccess().getLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLayer_in_rule__AbstractComponent__Alternatives1704);
                    ruleLayer();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:850:6: ( ruleModule )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:850:6: ( ruleModule )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:851:1: ruleModule
                    {
                     before(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__AbstractComponent__Alternatives1721);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:856:6: ( ruleMetaModule )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:856:6: ( ruleMetaModule )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:857:1: ruleMetaModule
                    {
                     before(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMetaModule_in_rule__AbstractComponent__Alternatives1738);
                    ruleMetaModule();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:862:6: ( ruleClass )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:862:6: ( ruleClass )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:863:1: ruleClass
                    {
                     before(grammarAccess.getAbstractComponentAccess().getClassParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleClass_in_rule__AbstractComponent__Alternatives1755);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getClassParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:868:6: ( ruleMethod )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:868:6: ( ruleMethod )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:869:1: ruleMethod
                    {
                     before(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__AbstractComponent__Alternatives1772);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:874:6: ( ruleConfigurationElement )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:874:6: ( ruleConfigurationElement )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:875:1: ruleConfigurationElement
                    {
                     before(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleConfigurationElement_in_rule__AbstractComponent__Alternatives1789);
                    ruleConfigurationElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:880:6: ( ruleComponent )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:880:6: ( ruleComponent )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:881:1: ruleComponent
                    {
                     before(grammarAccess.getAbstractComponentAccess().getComponentParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__AbstractComponent__Alternatives1806);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getComponentParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:886:6: ( ruleFrameworkInstantiation )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:886:6: ( ruleFrameworkInstantiation )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:887:1: ruleFrameworkInstantiation
                    {
                     before(grammarAccess.getAbstractComponentAccess().getFrameworkInstantiationParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleFrameworkInstantiation_in_rule__AbstractComponent__Alternatives1823);
                    ruleFrameworkInstantiation();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getFrameworkInstantiationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:892:6: ( ruleFrameworkClass )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:892:6: ( ruleFrameworkClass )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:893:1: ruleFrameworkClass
                    {
                     before(grammarAccess.getAbstractComponentAccess().getFrameworkClassParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleFrameworkClass_in_rule__AbstractComponent__Alternatives1840);
                    ruleFrameworkClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentAccess().getFrameworkClassParserRuleCall_8()); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:903:1: rule__AbstractNameConvetion__Alternatives : ( ( RULE_STRING ) | ( ruleClassMatching ) );
    public final void rule__AbstractNameConvetion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:907:1: ( ( RULE_STRING ) | ( ruleClassMatching ) )
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:908:1: ( RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:908:1: ( RULE_STRING )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:909:1: RULE_STRING
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1872); 
                     after(grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:914:6: ( ruleClassMatching )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:914:6: ( ruleClassMatching )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:915:1: ruleClassMatching
                    {
                     before(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1889);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:926:1: rule__ConfigurationElement__Alternatives : ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) );
    public final void rule__ConfigurationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:930:1: ( ( ruleConfiguration ) | ( ruleXmlDocument ) | ( ruleXmlElement ) | ( ruleFile ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 56:
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
            case 55:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:931:1: ( ruleConfiguration )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:931:1: ( ruleConfiguration )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:932:1: ruleConfiguration
                    {
                     before(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1922);
                    ruleConfiguration();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:937:6: ( ruleXmlDocument )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:937:6: ( ruleXmlDocument )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:938:1: ruleXmlDocument
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1939);
                    ruleXmlDocument();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:943:6: ( ruleXmlElement )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:943:6: ( ruleXmlElement )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:944:1: ruleXmlElement
                    {
                     before(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1956);
                    ruleXmlElement();

                    state._fsp--;

                     after(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:949:6: ( ruleFile )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:949:6: ( ruleFile )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:950:1: ruleFile
                    {
                     before(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1973);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:960:1: rule__Cardinality__Alternatives : ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:964:1: ( ( ( '1' ) ) | ( ( '0' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) )
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:965:1: ( ( '1' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:965:1: ( ( '1' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:966:1: ( '1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:967:1: ( '1' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:967:3: '1'
                    {
                    match(input,12,FOLLOW_12_in_rule__Cardinality__Alternatives2006); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:972:6: ( ( '0' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:972:6: ( ( '0' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:973:1: ( '0' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:974:1: ( '0' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:974:3: '0'
                    {
                    match(input,13,FOLLOW_13_in_rule__Cardinality__Alternatives2027); 

                    }

                     after(grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:979:6: ( ( '1..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:979:6: ( ( '1..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:980:1: ( '1..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:981:1: ( '1..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:981:3: '1..*'
                    {
                    match(input,14,FOLLOW_14_in_rule__Cardinality__Alternatives2048); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:986:6: ( ( '0..*' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:986:6: ( ( '0..*' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:987:1: ( '0..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:988:1: ( '0..*' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:988:3: '0..*'
                    {
                    match(input,15,FOLLOW_15_in_rule__Cardinality__Alternatives2069); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:998:1: rule__ExpressionMatchingClause__Alternatives : ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) );
    public final void rule__ExpressionMatchingClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1002:1: ( ( ( 'name start with' ) ) | ( ( 'name ends with' ) ) )
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1003:1: ( ( 'name start with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1003:1: ( ( 'name start with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1004:1: ( 'name start with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1005:1: ( 'name start with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1005:3: 'name start with'
                    {
                    match(input,16,FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives2105); 

                    }

                     after(grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1010:6: ( ( 'name ends with' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1010:6: ( ( 'name ends with' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1011:1: ( 'name ends with' )
                    {
                     before(grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1012:1: ( 'name ends with' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1012:3: 'name ends with'
                    {
                    match(input,17,FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives2126); 

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


    // $ANTLR start "rule__LayerMatchingClause__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1022:1: rule__LayerMatchingClause__Alternatives : ( ( ( 'related to component' ) ) | ( ( 'external definition' ) ) );
    public final void rule__LayerMatchingClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1026:1: ( ( ( 'related to component' ) ) | ( ( 'external definition' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1027:1: ( ( 'related to component' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1027:1: ( ( 'related to component' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1028:1: ( 'related to component' )
                    {
                     before(grammarAccess.getLayerMatchingClauseAccess().getRELATED_TO_COMPONENTEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1029:1: ( 'related to component' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1029:3: 'related to component'
                    {
                    match(input,18,FOLLOW_18_in_rule__LayerMatchingClause__Alternatives2162); 

                    }

                     after(grammarAccess.getLayerMatchingClauseAccess().getRELATED_TO_COMPONENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1034:6: ( ( 'external definition' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1034:6: ( ( 'external definition' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1035:1: ( 'external definition' )
                    {
                     before(grammarAccess.getLayerMatchingClauseAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1036:1: ( 'external definition' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1036:3: 'external definition'
                    {
                    match(input,19,FOLLOW_19_in_rule__LayerMatchingClause__Alternatives2183); 

                    }

                     after(grammarAccess.getLayerMatchingClauseAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LayerMatchingClause__Alternatives"


    // $ANTLR start "rule__ModuleMatchingParamenter__Alternatives"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1046:1: rule__ModuleMatchingParamenter__Alternatives : ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) );
    public final void rule__ModuleMatchingParamenter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1050:1: ( ( ( 'by package name' ) ) | ( ( 'by folder name' ) ) | ( ( 'by package and folder name' ) ) | ( ( 'by external implementation' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1051:1: ( ( 'by package name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1051:1: ( ( 'by package name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1052:1: ( 'by package name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1053:1: ( 'by package name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1053:3: 'by package name'
                    {
                    match(input,20,FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives2219); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1058:6: ( ( 'by folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1058:6: ( ( 'by folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1059:1: ( 'by folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1060:1: ( 'by folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1060:3: 'by folder name'
                    {
                    match(input,21,FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives2240); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1065:6: ( ( 'by package and folder name' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1065:6: ( ( 'by package and folder name' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1066:1: ( 'by package and folder name' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1067:1: ( 'by package and folder name' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1067:3: 'by package and folder name'
                    {
                    match(input,22,FOLLOW_22_in_rule__ModuleMatchingParamenter__Alternatives2261); 

                    }

                     after(grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1072:6: ( ( 'by external implementation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1072:6: ( ( 'by external implementation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1073:1: ( 'by external implementation' )
                    {
                     before(grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1074:1: ( 'by external implementation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1074:3: 'by external implementation'
                    {
                    match(input,23,FOLLOW_23_in_rule__ModuleMatchingParamenter__Alternatives2282); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1084:1: rule__GroupClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) );
    public final void rule__GroupClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1088:1: ( ( ( 'null' ) ) | ( ( 'only' ) ) | ( ( 'any' ) ) | ( ( 'no one' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
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
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1089:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1089:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1090:1: ( 'null' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1091:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1091:3: 'null'
                    {
                    match(input,24,FOLLOW_24_in_rule__GroupClause__Alternatives2318); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1096:6: ( ( 'only' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1096:6: ( ( 'only' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1097:1: ( 'only' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1098:1: ( 'only' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1098:3: 'only'
                    {
                    match(input,25,FOLLOW_25_in_rule__GroupClause__Alternatives2339); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1103:6: ( ( 'any' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1103:6: ( ( 'any' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1104:1: ( 'any' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1105:1: ( 'any' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1105:3: 'any'
                    {
                    match(input,26,FOLLOW_26_in_rule__GroupClause__Alternatives2360); 

                    }

                     after(grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1110:6: ( ( 'no one' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1110:6: ( ( 'no one' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1111:1: ( 'no one' )
                    {
                     before(grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1112:1: ( 'no one' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1112:3: 'no one'
                    {
                    match(input,27,FOLLOW_27_in_rule__GroupClause__Alternatives2381); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1122:1: rule__PermissionClause__Alternatives : ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) );
    public final void rule__PermissionClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1126:1: ( ( ( 'null' ) ) | ( ( 'must' ) ) | ( ( 'can' ) ) | ( ( 'cannot' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1127:1: ( ( 'null' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1127:1: ( ( 'null' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1128:1: ( 'null' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1129:1: ( 'null' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1129:3: 'null'
                    {
                    match(input,24,FOLLOW_24_in_rule__PermissionClause__Alternatives2417); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1134:6: ( ( 'must' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1134:6: ( ( 'must' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1135:1: ( 'must' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1136:1: ( 'must' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1136:3: 'must'
                    {
                    match(input,28,FOLLOW_28_in_rule__PermissionClause__Alternatives2438); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1141:6: ( ( 'can' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1141:6: ( ( 'can' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1142:1: ( 'can' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1143:1: ( 'can' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1143:3: 'can'
                    {
                    match(input,29,FOLLOW_29_in_rule__PermissionClause__Alternatives2459); 

                    }

                     after(grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1148:6: ( ( 'cannot' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1148:6: ( ( 'cannot' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1149:1: ( 'cannot' )
                    {
                     before(grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1150:1: ( 'cannot' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1150:3: 'cannot'
                    {
                    match(input,30,FOLLOW_30_in_rule__PermissionClause__Alternatives2480); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1160:1: rule__RelactionType__Alternatives : ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) );
    public final void rule__RelactionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1164:1: ( ( ( 'access' ) ) | ( ( 'declare' ) ) | ( ( 'handle' ) ) | ( ( 'extend' ) ) | ( ( 'implement' ) ) | ( ( 'create' ) ) | ( ( 'throw' ) ) | ( ( 'use annotation' ) ) | ( ( 'depend' ) ) | ( ( 'requires' ) ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            case 36:
                {
                alt10=6;
                }
                break;
            case 37:
                {
                alt10=7;
                }
                break;
            case 38:
                {
                alt10=8;
                }
                break;
            case 39:
                {
                alt10=9;
                }
                break;
            case 40:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1165:1: ( ( 'access' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1165:1: ( ( 'access' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1166:1: ( 'access' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1167:1: ( 'access' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1167:3: 'access'
                    {
                    match(input,31,FOLLOW_31_in_rule__RelactionType__Alternatives2516); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1172:6: ( ( 'declare' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1172:6: ( ( 'declare' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1173:1: ( 'declare' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1174:1: ( 'declare' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1174:3: 'declare'
                    {
                    match(input,32,FOLLOW_32_in_rule__RelactionType__Alternatives2537); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1179:6: ( ( 'handle' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1179:6: ( ( 'handle' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1180:1: ( 'handle' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1181:1: ( 'handle' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1181:3: 'handle'
                    {
                    match(input,33,FOLLOW_33_in_rule__RelactionType__Alternatives2558); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1186:6: ( ( 'extend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1186:6: ( ( 'extend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1187:1: ( 'extend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1188:1: ( 'extend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1188:3: 'extend'
                    {
                    match(input,34,FOLLOW_34_in_rule__RelactionType__Alternatives2579); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1193:6: ( ( 'implement' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1193:6: ( ( 'implement' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1194:1: ( 'implement' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1195:1: ( 'implement' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1195:3: 'implement'
                    {
                    match(input,35,FOLLOW_35_in_rule__RelactionType__Alternatives2600); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1200:6: ( ( 'create' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1200:6: ( ( 'create' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1201:1: ( 'create' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1202:1: ( 'create' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1202:3: 'create'
                    {
                    match(input,36,FOLLOW_36_in_rule__RelactionType__Alternatives2621); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1207:6: ( ( 'throw' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1207:6: ( ( 'throw' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1208:1: ( 'throw' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1209:1: ( 'throw' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1209:3: 'throw'
                    {
                    match(input,37,FOLLOW_37_in_rule__RelactionType__Alternatives2642); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1214:6: ( ( 'use annotation' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1214:6: ( ( 'use annotation' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1215:1: ( 'use annotation' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1216:1: ( 'use annotation' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1216:3: 'use annotation'
                    {
                    match(input,38,FOLLOW_38_in_rule__RelactionType__Alternatives2663); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1221:6: ( ( 'depend' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1221:6: ( ( 'depend' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1222:1: ( 'depend' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1223:1: ( 'depend' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1223:3: 'depend'
                    {
                    match(input,39,FOLLOW_39_in_rule__RelactionType__Alternatives2684); 

                    }

                     after(grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1228:6: ( ( 'requires' ) )
                    {
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1228:6: ( ( 'requires' ) )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1229:1: ( 'requires' )
                    {
                     before(grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9()); 
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1230:1: ( 'requires' )
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1230:3: 'requires'
                    {
                    match(input,40,FOLLOW_40_in_rule__RelactionType__Alternatives2705); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1242:1: rule__ASMLModel__Group__0 : rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 ;
    public final void rule__ASMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1246:1: ( rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1247:2: rule__ASMLModel__Group__0__Impl rule__ASMLModel__Group__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02738);
            rule__ASMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02741);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1254:1: rule__ASMLModel__Group__0__Impl : ( 'architecture' ) ;
    public final void rule__ASMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1258:1: ( ( 'architecture' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1259:1: ( 'architecture' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1259:1: ( 'architecture' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1260:1: 'architecture'
            {
             before(grammarAccess.getASMLModelAccess().getArchitectureKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ASMLModel__Group__0__Impl2769); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1273:1: rule__ASMLModel__Group__1 : rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 ;
    public final void rule__ASMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1277:1: ( rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1278:2: rule__ASMLModel__Group__1__Impl rule__ASMLModel__Group__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12800);
            rule__ASMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12803);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1285:1: rule__ASMLModel__Group__1__Impl : ( ( rule__ASMLModel__NameAssignment_1 ) ) ;
    public final void rule__ASMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1289:1: ( ( ( rule__ASMLModel__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1290:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1290:1: ( ( rule__ASMLModel__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1291:1: ( rule__ASMLModel__NameAssignment_1 )
            {
             before(grammarAccess.getASMLModelAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1292:1: ( rule__ASMLModel__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1292:2: rule__ASMLModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2830);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1302:1: rule__ASMLModel__Group__2 : rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 ;
    public final void rule__ASMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1306:1: ( rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1307:2: rule__ASMLModel__Group__2__Impl rule__ASMLModel__Group__3
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22860);
            rule__ASMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22863);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1314:1: rule__ASMLModel__Group__2__Impl : ( '{' ) ;
    public final void rule__ASMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1318:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1319:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1319:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1320:1: '{'
            {
             before(grammarAccess.getASMLModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__ASMLModel__Group__2__Impl2891); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1333:1: rule__ASMLModel__Group__3 : rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 ;
    public final void rule__ASMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1337:1: ( rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1338:2: rule__ASMLModel__Group__3__Impl rule__ASMLModel__Group__4
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32922);
            rule__ASMLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32925);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1345:1: rule__ASMLModel__Group__3__Impl : ( ( rule__ASMLModel__Group_3__0 )? ) ;
    public final void rule__ASMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1349:1: ( ( ( rule__ASMLModel__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1350:1: ( ( rule__ASMLModel__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1350:1: ( ( rule__ASMLModel__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1351:1: ( rule__ASMLModel__Group_3__0 )?
            {
             before(grammarAccess.getASMLModelAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1352:1: ( rule__ASMLModel__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1352:2: rule__ASMLModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2952);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1362:1: rule__ASMLModel__Group__4 : rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 ;
    public final void rule__ASMLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1366:1: ( rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1367:2: rule__ASMLModel__Group__4__Impl rule__ASMLModel__Group__5
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42983);
            rule__ASMLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42986);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1374:1: rule__ASMLModel__Group__4__Impl : ( ( rule__ASMLModel__ViewsAssignment_4 )* ) ;
    public final void rule__ASMLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1378:1: ( ( ( rule__ASMLModel__ViewsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1379:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1379:1: ( ( rule__ASMLModel__ViewsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1380:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            {
             before(grammarAccess.getASMLModelAccess().getViewsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1381:1: ( rule__ASMLModel__ViewsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1381:2: rule__ASMLModel__ViewsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl3013);
            	    rule__ASMLModel__ViewsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1391:1: rule__ASMLModel__Group__5 : rule__ASMLModel__Group__5__Impl ;
    public final void rule__ASMLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1395:1: ( rule__ASMLModel__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1396:2: rule__ASMLModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__53044);
            rule__ASMLModel__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1402:1: rule__ASMLModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ASMLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1406:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1407:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1407:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1408:1: '}'
            {
             before(grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__ASMLModel__Group__5__Impl3072); 
             after(grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ASMLModel__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1433:1: rule__ASMLModel__Group_3__0 : rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 ;
    public final void rule__ASMLModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1437:1: ( rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1438:2: rule__ASMLModel__Group_3__0__Impl rule__ASMLModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__03115);
            rule__ASMLModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__03118);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1445:1: rule__ASMLModel__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__ASMLModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1449:1: ( ( 'import' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1450:1: ( 'import' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1450:1: ( 'import' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1451:1: 'import'
            {
             before(grammarAccess.getASMLModelAccess().getImportKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__ASMLModel__Group_3__0__Impl3146); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1464:1: rule__ASMLModel__Group_3__1 : rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 ;
    public final void rule__ASMLModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1468:1: ( rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1469:2: rule__ASMLModel__Group_3__1__Impl rule__ASMLModel__Group_3__2
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__13177);
            rule__ASMLModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__13180);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1476:1: rule__ASMLModel__Group_3__1__Impl : ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) ;
    public final void rule__ASMLModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1480:1: ( ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1481:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1481:1: ( ( rule__ASMLModel__ImportURIAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1482:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            {
             before(grammarAccess.getASMLModelAccess().getImportURIAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1483:1: ( rule__ASMLModel__ImportURIAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1483:2: rule__ASMLModel__ImportURIAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl3207);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1493:1: rule__ASMLModel__Group_3__2 : rule__ASMLModel__Group_3__2__Impl ;
    public final void rule__ASMLModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1497:1: ( rule__ASMLModel__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1498:2: rule__ASMLModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__23237);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1504:1: rule__ASMLModel__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ASMLModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1508:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1509:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1509:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1510:1: ';'
            {
             before(grammarAccess.getASMLModelAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__ASMLModel__Group_3__2__Impl3265); 
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


    // $ANTLR start "rule__View__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1529:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1533:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1534:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03302);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__03305);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1541:1: rule__View__Group__0__Impl : ( 'view' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1545:1: ( ( 'view' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1546:1: ( 'view' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1546:1: ( 'view' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1547:1: 'view'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__View__Group__0__Impl3333); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1560:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1564:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1565:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13364);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__13367);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1572:1: rule__View__Group__1__Impl : ( ( rule__View__NameAssignment_1 ) ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1576:1: ( ( ( rule__View__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1577:1: ( ( rule__View__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1577:1: ( ( rule__View__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1578:1: ( rule__View__NameAssignment_1 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1579:1: ( rule__View__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1579:2: rule__View__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3394);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1589:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1593:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1594:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23424);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__23427);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1601:1: rule__View__Group__2__Impl : ( '{' ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1605:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1606:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1606:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1607:1: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__View__Group__2__Impl3455); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1620:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1624:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1625:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33486);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__33489);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1632:1: rule__View__Group__3__Impl : ( ( rule__View__Group_3__0 )? ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1636:1: ( ( ( rule__View__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1637:1: ( ( rule__View__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1637:1: ( ( rule__View__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1638:1: ( rule__View__Group_3__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1639:1: ( rule__View__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45||LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1639:2: rule__View__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3516);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1649:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1653:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1654:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43547);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__5_in_rule__View__Group__43550);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1661:1: rule__View__Group__4__Impl : ( ( rule__View__ComponentsAssignment_4 )* ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1665:1: ( ( ( rule__View__ComponentsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1666:1: ( ( rule__View__ComponentsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1666:1: ( ( rule__View__ComponentsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1667:1: ( rule__View__ComponentsAssignment_4 )*
            {
             before(grammarAccess.getViewAccess().getComponentsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1668:1: ( rule__View__ComponentsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50||(LA14_0>=53 && LA14_0<=58)||(LA14_0>=61 && LA14_0<=65)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1668:2: rule__View__ComponentsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3577);
            	    rule__View__ComponentsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1678:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1682:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1683:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53608);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__6_in_rule__View__Group__53611);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1690:1: rule__View__Group__5__Impl : ( ( rule__View__RestrictionsAssignment_5 )* ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1694:1: ( ( ( rule__View__RestrictionsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1695:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1695:1: ( ( rule__View__RestrictionsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1696:1: ( rule__View__RestrictionsAssignment_5 )*
            {
             before(grammarAccess.getViewAccess().getRestrictionsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1697:1: ( rule__View__RestrictionsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==67) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1697:2: rule__View__RestrictionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3638);
            	    rule__View__RestrictionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1707:1: rule__View__Group__6 : rule__View__Group__6__Impl ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1711:1: ( rule__View__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1712:2: rule__View__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63669);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1718:1: rule__View__Group__6__Impl : ( '}' ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1722:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1723:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1723:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1724:1: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__View__Group__6__Impl3697); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1751:1: rule__View__Group_3__0 : rule__View__Group_3__0__Impl rule__View__Group_3__1 ;
    public final void rule__View__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1755:1: ( rule__View__Group_3__0__Impl rule__View__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1756:2: rule__View__Group_3__0__Impl rule__View__Group_3__1
            {
            pushFollow(FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03742);
            rule__View__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03745);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1763:1: rule__View__Group_3__0__Impl : ( ( rule__View__Group_3_0__0 )* ) ;
    public final void rule__View__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1767:1: ( ( ( rule__View__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1768:1: ( ( rule__View__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1768:1: ( ( rule__View__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1769:1: ( rule__View__Group_3_0__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1770:1: ( rule__View__Group_3_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1770:2: rule__View__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3772);
            	    rule__View__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1780:1: rule__View__Group_3__1 : rule__View__Group_3__1__Impl ;
    public final void rule__View__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1784:1: ( rule__View__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1785:2: rule__View__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13803);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1791:1: rule__View__Group_3__1__Impl : ( ';' ) ;
    public final void rule__View__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1795:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1796:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1796:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1797:1: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_3_1()); 
            match(input,45,FOLLOW_45_in_rule__View__Group_3__1__Impl3831); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1814:1: rule__View__Group_3_0__0 : rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 ;
    public final void rule__View__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1818:1: ( rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1819:2: rule__View__Group_3_0__0__Impl rule__View__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03866);
            rule__View__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03869);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1826:1: rule__View__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__View__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1830:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1831:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1831:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1832:1: 'attributes'
            {
             before(grammarAccess.getViewAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__View__Group_3_0__0__Impl3897); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1845:1: rule__View__Group_3_0__1 : rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 ;
    public final void rule__View__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1849:1: ( rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1850:2: rule__View__Group_3_0__1__Impl rule__View__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__13928);
            rule__View__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__13931);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1857:1: rule__View__Group_3_0__1__Impl : ( ( rule__View__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__View__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1861:1: ( ( ( rule__View__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1862:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1862:1: ( ( rule__View__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1863:1: ( rule__View__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getViewAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1864:1: ( rule__View__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1864:2: rule__View__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl3958);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1874:1: rule__View__Group_3_0__2 : rule__View__Group_3_0__2__Impl ;
    public final void rule__View__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1878:1: ( rule__View__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1879:2: rule__View__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__23988);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1885:1: rule__View__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__View__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1889:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1890:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1890:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1891:1: ( ',' )?
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1892:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1893:2: ','
                    {
                    match(input,48,FOLLOW_48_in_rule__View__Group_3_0__2__Impl4017); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1910:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1914:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1915:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04056);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04059);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1922:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1926:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1927:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1927:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1928:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1929:1: ( rule__Attribute__NameAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1929:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4086);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1939:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1943:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1944:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14116);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14119);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1951:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1955:1: ( ( ':' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1956:1: ( ':' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1956:1: ( ':' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1957:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__Attribute__Group__1__Impl4147); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1970:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1974:1: ( rule__Attribute__Group__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1975:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24178);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1981:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1985:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1986:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1986:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1987:1: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1988:1: ( rule__Attribute__ValueAssignment_2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:1988:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4205);
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


    // $ANTLR start "rule__Component__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2004:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2008:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2009:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__04241);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__04244);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2016:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2020:1: ( ( 'component' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2021:1: ( 'component' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2021:1: ( 'component' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2022:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Component__Group__0__Impl4272); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2035:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2039:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2040:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__14303);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__14306);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2047:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2051:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2052:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2052:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2053:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2054:1: ( rule__Component__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2054:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl4333);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2064:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2068:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2069:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__24363);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__24366);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2076:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2080:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2081:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2081:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2082:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Component__Group__2__Impl4394); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2095:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2099:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2100:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__34425);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__34428);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2107:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2111:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2112:1: ( ( rule__Component__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2112:1: ( ( rule__Component__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2113:1: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2114:1: ( rule__Component__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2114:2: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_3__0_in_rule__Component__Group__3__Impl4455);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2124:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2128:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2129:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__44486);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__44489);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2136:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2140:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2141:1: ( ( rule__Component__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2141:1: ( ( rule__Component__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2142:1: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2143:1: ( rule__Component__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2143:2: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl4516);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2153:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2157:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2158:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__54547);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__54550);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2165:1: rule__Component__Group__5__Impl : ( ( rule__Component__ComponentsAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2169:1: ( ( ( rule__Component__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2170:1: ( ( rule__Component__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2170:1: ( ( rule__Component__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2171:1: ( rule__Component__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2172:1: ( rule__Component__ComponentsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50||(LA20_0>=53 && LA20_0<=58)||(LA20_0>=61 && LA20_0<=65)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2172:2: rule__Component__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__ComponentsAssignment_5_in_rule__Component__Group__5__Impl4577);
            	    rule__Component__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2182:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2186:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2187:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__64608);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__64611);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2194:1: rule__Component__Group__6__Impl : ( ( rule__Component__RestrictionsAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2198:1: ( ( ( rule__Component__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2199:1: ( ( rule__Component__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2199:1: ( ( rule__Component__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2200:1: ( rule__Component__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2201:1: ( rule__Component__RestrictionsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==67) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2201:2: rule__Component__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Component__RestrictionsAssignment_6_in_rule__Component__Group__6__Impl4638);
            	    rule__Component__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getRestrictionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2211:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2215:1: ( rule__Component__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2216:2: rule__Component__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__74669);
            rule__Component__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2222:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2226:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2227:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2227:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2228:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_43_in_rule__Component__Group__7__Impl4697); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2257:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2261:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2262:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_rule__Component__Group_3__0__Impl_in_rule__Component__Group_3__04744);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_3__1_in_rule__Component__Group_3__04747);
            rule__Component__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2269:1: rule__Component__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2273:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2274:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2274:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2275:1: 'matching'
            {
             before(grammarAccess.getComponentAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Component__Group_3__0__Impl4775); 
             after(grammarAccess.getComponentAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2288:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl rule__Component__Group_3__2 ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2292:1: ( rule__Component__Group_3__1__Impl rule__Component__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2293:2: rule__Component__Group_3__1__Impl rule__Component__Group_3__2
            {
            pushFollow(FOLLOW_rule__Component__Group_3__1__Impl_in_rule__Component__Group_3__14806);
            rule__Component__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_3__2_in_rule__Component__Group_3__14809);
            rule__Component__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2300:1: rule__Component__Group_3__1__Impl : ( ( rule__Component__MatchingAssignment_3_1 ) ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2304:1: ( ( ( rule__Component__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2305:1: ( ( rule__Component__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2305:1: ( ( rule__Component__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2306:1: ( rule__Component__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getComponentAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2307:1: ( rule__Component__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2307:2: rule__Component__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Component__MatchingAssignment_3_1_in_rule__Component__Group_3__1__Impl4836);
            rule__Component__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2317:1: rule__Component__Group_3__2 : rule__Component__Group_3__2__Impl ;
    public final void rule__Component__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2321:1: ( rule__Component__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2322:2: rule__Component__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_3__2__Impl_in_rule__Component__Group_3__24866);
            rule__Component__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2"


    // $ANTLR start "rule__Component__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2328:1: rule__Component__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Component__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2332:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2333:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2333:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2334:1: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__Component__Group_3__2__Impl4894); 
             after(grammarAccess.getComponentAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__2__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2353:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2357:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2358:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__04931);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__04934);
            rule__Component__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2365:1: rule__Component__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2369:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2370:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2370:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2371:1: 'cardinality'
            {
             before(grammarAccess.getComponentAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Component__Group_4__0__Impl4962); 
             after(grammarAccess.getComponentAccess().getCardinalityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2384:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl rule__Component__Group_4__2 ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2388:1: ( rule__Component__Group_4__1__Impl rule__Component__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2389:2: rule__Component__Group_4__1__Impl rule__Component__Group_4__2
            {
            pushFollow(FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__14993);
            rule__Component__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__2_in_rule__Component__Group_4__14996);
            rule__Component__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2396:1: rule__Component__Group_4__1__Impl : ( ( rule__Component__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2400:1: ( ( ( rule__Component__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2401:1: ( ( rule__Component__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2401:1: ( ( rule__Component__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2402:1: ( rule__Component__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getComponentAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2403:1: ( rule__Component__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2403:2: rule__Component__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Component__CardinalityAssignment_4_1_in_rule__Component__Group_4__1__Impl5023);
            rule__Component__CardinalityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getCardinalityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2413:1: rule__Component__Group_4__2 : rule__Component__Group_4__2__Impl ;
    public final void rule__Component__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2417:1: ( rule__Component__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2418:2: rule__Component__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_4__2__Impl_in_rule__Component__Group_4__25053);
            rule__Component__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__2"


    // $ANTLR start "rule__Component__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2424:1: rule__Component__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Component__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2428:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2429:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2429:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2430:1: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__Component__Group_4__2__Impl5081); 
             after(grammarAccess.getComponentAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_4__2__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2449:1: rule__FrameworkInstantiation__Group__0 : rule__FrameworkInstantiation__Group__0__Impl rule__FrameworkInstantiation__Group__1 ;
    public final void rule__FrameworkInstantiation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2453:1: ( rule__FrameworkInstantiation__Group__0__Impl rule__FrameworkInstantiation__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2454:2: rule__FrameworkInstantiation__Group__0__Impl rule__FrameworkInstantiation__Group__1
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__0__Impl_in_rule__FrameworkInstantiation__Group__05118);
            rule__FrameworkInstantiation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__1_in_rule__FrameworkInstantiation__Group__05121);
            rule__FrameworkInstantiation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__0"


    // $ANTLR start "rule__FrameworkInstantiation__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2461:1: rule__FrameworkInstantiation__Group__0__Impl : ( 'framework-instantiation' ) ;
    public final void rule__FrameworkInstantiation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2465:1: ( ( 'framework-instantiation' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2466:1: ( 'framework-instantiation' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2466:1: ( 'framework-instantiation' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2467:1: 'framework-instantiation'
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getFrameworkInstantiationKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__FrameworkInstantiation__Group__0__Impl5149); 
             after(grammarAccess.getFrameworkInstantiationAccess().getFrameworkInstantiationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__0__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2480:1: rule__FrameworkInstantiation__Group__1 : rule__FrameworkInstantiation__Group__1__Impl rule__FrameworkInstantiation__Group__2 ;
    public final void rule__FrameworkInstantiation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2484:1: ( rule__FrameworkInstantiation__Group__1__Impl rule__FrameworkInstantiation__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2485:2: rule__FrameworkInstantiation__Group__1__Impl rule__FrameworkInstantiation__Group__2
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__1__Impl_in_rule__FrameworkInstantiation__Group__15180);
            rule__FrameworkInstantiation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__2_in_rule__FrameworkInstantiation__Group__15183);
            rule__FrameworkInstantiation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__1"


    // $ANTLR start "rule__FrameworkInstantiation__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2492:1: rule__FrameworkInstantiation__Group__1__Impl : ( ( rule__FrameworkInstantiation__NameAssignment_1 ) ) ;
    public final void rule__FrameworkInstantiation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2496:1: ( ( ( rule__FrameworkInstantiation__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2497:1: ( ( rule__FrameworkInstantiation__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2497:1: ( ( rule__FrameworkInstantiation__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2498:1: ( rule__FrameworkInstantiation__NameAssignment_1 )
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2499:1: ( rule__FrameworkInstantiation__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2499:2: rule__FrameworkInstantiation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__NameAssignment_1_in_rule__FrameworkInstantiation__Group__1__Impl5210);
            rule__FrameworkInstantiation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkInstantiationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__1__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2509:1: rule__FrameworkInstantiation__Group__2 : rule__FrameworkInstantiation__Group__2__Impl rule__FrameworkInstantiation__Group__3 ;
    public final void rule__FrameworkInstantiation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2513:1: ( rule__FrameworkInstantiation__Group__2__Impl rule__FrameworkInstantiation__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2514:2: rule__FrameworkInstantiation__Group__2__Impl rule__FrameworkInstantiation__Group__3
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__2__Impl_in_rule__FrameworkInstantiation__Group__25240);
            rule__FrameworkInstantiation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__3_in_rule__FrameworkInstantiation__Group__25243);
            rule__FrameworkInstantiation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__2"


    // $ANTLR start "rule__FrameworkInstantiation__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2521:1: rule__FrameworkInstantiation__Group__2__Impl : ( '{' ) ;
    public final void rule__FrameworkInstantiation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2525:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2526:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2526:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2527:1: '{'
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__FrameworkInstantiation__Group__2__Impl5271); 
             after(grammarAccess.getFrameworkInstantiationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__2__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2540:1: rule__FrameworkInstantiation__Group__3 : rule__FrameworkInstantiation__Group__3__Impl rule__FrameworkInstantiation__Group__4 ;
    public final void rule__FrameworkInstantiation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2544:1: ( rule__FrameworkInstantiation__Group__3__Impl rule__FrameworkInstantiation__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2545:2: rule__FrameworkInstantiation__Group__3__Impl rule__FrameworkInstantiation__Group__4
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__3__Impl_in_rule__FrameworkInstantiation__Group__35302);
            rule__FrameworkInstantiation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__4_in_rule__FrameworkInstantiation__Group__35305);
            rule__FrameworkInstantiation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__3"


    // $ANTLR start "rule__FrameworkInstantiation__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2552:1: rule__FrameworkInstantiation__Group__3__Impl : ( ( rule__FrameworkInstantiation__ComponentsAssignment_3 )* ) ;
    public final void rule__FrameworkInstantiation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2556:1: ( ( ( rule__FrameworkInstantiation__ComponentsAssignment_3 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2557:1: ( ( rule__FrameworkInstantiation__ComponentsAssignment_3 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2557:1: ( ( rule__FrameworkInstantiation__ComponentsAssignment_3 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2558:1: ( rule__FrameworkInstantiation__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getComponentsAssignment_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2559:1: ( rule__FrameworkInstantiation__ComponentsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==50||(LA22_0>=53 && LA22_0<=58)||(LA22_0>=61 && LA22_0<=65)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2559:2: rule__FrameworkInstantiation__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FrameworkInstantiation__ComponentsAssignment_3_in_rule__FrameworkInstantiation__Group__3__Impl5332);
            	    rule__FrameworkInstantiation__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFrameworkInstantiationAccess().getComponentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__3__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2569:1: rule__FrameworkInstantiation__Group__4 : rule__FrameworkInstantiation__Group__4__Impl rule__FrameworkInstantiation__Group__5 ;
    public final void rule__FrameworkInstantiation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2573:1: ( rule__FrameworkInstantiation__Group__4__Impl rule__FrameworkInstantiation__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2574:2: rule__FrameworkInstantiation__Group__4__Impl rule__FrameworkInstantiation__Group__5
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__4__Impl_in_rule__FrameworkInstantiation__Group__45363);
            rule__FrameworkInstantiation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__5_in_rule__FrameworkInstantiation__Group__45366);
            rule__FrameworkInstantiation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__4"


    // $ANTLR start "rule__FrameworkInstantiation__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2581:1: rule__FrameworkInstantiation__Group__4__Impl : ( ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )* ) ;
    public final void rule__FrameworkInstantiation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2585:1: ( ( ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2586:1: ( ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2586:1: ( ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2587:1: ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )*
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getRestrictionsAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2588:1: ( rule__FrameworkInstantiation__RestrictionsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==67) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2588:2: rule__FrameworkInstantiation__RestrictionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FrameworkInstantiation__RestrictionsAssignment_4_in_rule__FrameworkInstantiation__Group__4__Impl5393);
            	    rule__FrameworkInstantiation__RestrictionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFrameworkInstantiationAccess().getRestrictionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__4__Impl"


    // $ANTLR start "rule__FrameworkInstantiation__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2598:1: rule__FrameworkInstantiation__Group__5 : rule__FrameworkInstantiation__Group__5__Impl ;
    public final void rule__FrameworkInstantiation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2602:1: ( rule__FrameworkInstantiation__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2603:2: rule__FrameworkInstantiation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FrameworkInstantiation__Group__5__Impl_in_rule__FrameworkInstantiation__Group__55424);
            rule__FrameworkInstantiation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__5"


    // $ANTLR start "rule__FrameworkInstantiation__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2609:1: rule__FrameworkInstantiation__Group__5__Impl : ( '}' ) ;
    public final void rule__FrameworkInstantiation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2613:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2614:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2614:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2615:1: '}'
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__FrameworkInstantiation__Group__5__Impl5452); 
             after(grammarAccess.getFrameworkInstantiationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__Group__5__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2640:1: rule__FrameworkClass__Group__0 : rule__FrameworkClass__Group__0__Impl rule__FrameworkClass__Group__1 ;
    public final void rule__FrameworkClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2644:1: ( rule__FrameworkClass__Group__0__Impl rule__FrameworkClass__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2645:2: rule__FrameworkClass__Group__0__Impl rule__FrameworkClass__Group__1
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__0__Impl_in_rule__FrameworkClass__Group__05495);
            rule__FrameworkClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkClass__Group__1_in_rule__FrameworkClass__Group__05498);
            rule__FrameworkClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__0"


    // $ANTLR start "rule__FrameworkClass__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2652:1: rule__FrameworkClass__Group__0__Impl : ( 'framework-class' ) ;
    public final void rule__FrameworkClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2656:1: ( ( 'framework-class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2657:1: ( 'framework-class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2657:1: ( 'framework-class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2658:1: 'framework-class'
            {
             before(grammarAccess.getFrameworkClassAccess().getFrameworkClassKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__FrameworkClass__Group__0__Impl5526); 
             after(grammarAccess.getFrameworkClassAccess().getFrameworkClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__0__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2671:1: rule__FrameworkClass__Group__1 : rule__FrameworkClass__Group__1__Impl rule__FrameworkClass__Group__2 ;
    public final void rule__FrameworkClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2675:1: ( rule__FrameworkClass__Group__1__Impl rule__FrameworkClass__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2676:2: rule__FrameworkClass__Group__1__Impl rule__FrameworkClass__Group__2
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__1__Impl_in_rule__FrameworkClass__Group__15557);
            rule__FrameworkClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkClass__Group__2_in_rule__FrameworkClass__Group__15560);
            rule__FrameworkClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__1"


    // $ANTLR start "rule__FrameworkClass__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2683:1: rule__FrameworkClass__Group__1__Impl : ( ( rule__FrameworkClass__NameAssignment_1 ) ) ;
    public final void rule__FrameworkClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2687:1: ( ( ( rule__FrameworkClass__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2688:1: ( ( rule__FrameworkClass__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2688:1: ( ( rule__FrameworkClass__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2689:1: ( rule__FrameworkClass__NameAssignment_1 )
            {
             before(grammarAccess.getFrameworkClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2690:1: ( rule__FrameworkClass__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2690:2: rule__FrameworkClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FrameworkClass__NameAssignment_1_in_rule__FrameworkClass__Group__1__Impl5587);
            rule__FrameworkClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__1__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2700:1: rule__FrameworkClass__Group__2 : rule__FrameworkClass__Group__2__Impl rule__FrameworkClass__Group__3 ;
    public final void rule__FrameworkClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2704:1: ( rule__FrameworkClass__Group__2__Impl rule__FrameworkClass__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2705:2: rule__FrameworkClass__Group__2__Impl rule__FrameworkClass__Group__3
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__2__Impl_in_rule__FrameworkClass__Group__25617);
            rule__FrameworkClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkClass__Group__3_in_rule__FrameworkClass__Group__25620);
            rule__FrameworkClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__2"


    // $ANTLR start "rule__FrameworkClass__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2712:1: rule__FrameworkClass__Group__2__Impl : ( '{' ) ;
    public final void rule__FrameworkClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2716:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2717:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2717:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2718:1: '{'
            {
             before(grammarAccess.getFrameworkClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__FrameworkClass__Group__2__Impl5648); 
             after(grammarAccess.getFrameworkClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__2__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2731:1: rule__FrameworkClass__Group__3 : rule__FrameworkClass__Group__3__Impl rule__FrameworkClass__Group__4 ;
    public final void rule__FrameworkClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2735:1: ( rule__FrameworkClass__Group__3__Impl rule__FrameworkClass__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2736:2: rule__FrameworkClass__Group__3__Impl rule__FrameworkClass__Group__4
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__3__Impl_in_rule__FrameworkClass__Group__35679);
            rule__FrameworkClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkClass__Group__4_in_rule__FrameworkClass__Group__35682);
            rule__FrameworkClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__3"


    // $ANTLR start "rule__FrameworkClass__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2743:1: rule__FrameworkClass__Group__3__Impl : ( ( rule__FrameworkClass__JavaCLassAssignment_3 ) ) ;
    public final void rule__FrameworkClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2747:1: ( ( ( rule__FrameworkClass__JavaCLassAssignment_3 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2748:1: ( ( rule__FrameworkClass__JavaCLassAssignment_3 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2748:1: ( ( rule__FrameworkClass__JavaCLassAssignment_3 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2749:1: ( rule__FrameworkClass__JavaCLassAssignment_3 )
            {
             before(grammarAccess.getFrameworkClassAccess().getJavaCLassAssignment_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2750:1: ( rule__FrameworkClass__JavaCLassAssignment_3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2750:2: rule__FrameworkClass__JavaCLassAssignment_3
            {
            pushFollow(FOLLOW_rule__FrameworkClass__JavaCLassAssignment_3_in_rule__FrameworkClass__Group__3__Impl5709);
            rule__FrameworkClass__JavaCLassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkClassAccess().getJavaCLassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__3__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2760:1: rule__FrameworkClass__Group__4 : rule__FrameworkClass__Group__4__Impl rule__FrameworkClass__Group__5 ;
    public final void rule__FrameworkClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2764:1: ( rule__FrameworkClass__Group__4__Impl rule__FrameworkClass__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2765:2: rule__FrameworkClass__Group__4__Impl rule__FrameworkClass__Group__5
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__4__Impl_in_rule__FrameworkClass__Group__45739);
            rule__FrameworkClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FrameworkClass__Group__5_in_rule__FrameworkClass__Group__45742);
            rule__FrameworkClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__4"


    // $ANTLR start "rule__FrameworkClass__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2772:1: rule__FrameworkClass__Group__4__Impl : ( ';' ) ;
    public final void rule__FrameworkClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2776:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2777:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2777:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2778:1: ';'
            {
             before(grammarAccess.getFrameworkClassAccess().getSemicolonKeyword_4()); 
            match(input,45,FOLLOW_45_in_rule__FrameworkClass__Group__4__Impl5770); 
             after(grammarAccess.getFrameworkClassAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__4__Impl"


    // $ANTLR start "rule__FrameworkClass__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2791:1: rule__FrameworkClass__Group__5 : rule__FrameworkClass__Group__5__Impl ;
    public final void rule__FrameworkClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2795:1: ( rule__FrameworkClass__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2796:2: rule__FrameworkClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FrameworkClass__Group__5__Impl_in_rule__FrameworkClass__Group__55801);
            rule__FrameworkClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__5"


    // $ANTLR start "rule__FrameworkClass__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2802:1: rule__FrameworkClass__Group__5__Impl : ( '}' ) ;
    public final void rule__FrameworkClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2806:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2807:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2807:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2808:1: '}'
            {
             before(grammarAccess.getFrameworkClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__FrameworkClass__Group__5__Impl5829); 
             after(grammarAccess.getFrameworkClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__Group__5__Impl"


    // $ANTLR start "rule__LayerMatching__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2833:1: rule__LayerMatching__Group__0 : rule__LayerMatching__Group__0__Impl rule__LayerMatching__Group__1 ;
    public final void rule__LayerMatching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2837:1: ( rule__LayerMatching__Group__0__Impl rule__LayerMatching__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2838:2: rule__LayerMatching__Group__0__Impl rule__LayerMatching__Group__1
            {
            pushFollow(FOLLOW_rule__LayerMatching__Group__0__Impl_in_rule__LayerMatching__Group__05872);
            rule__LayerMatching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LayerMatching__Group__1_in_rule__LayerMatching__Group__05875);
            rule__LayerMatching__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__Group__0"


    // $ANTLR start "rule__LayerMatching__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2845:1: rule__LayerMatching__Group__0__Impl : ( ( rule__LayerMatching__LayerMatchingAssignment_0 ) ) ;
    public final void rule__LayerMatching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2849:1: ( ( ( rule__LayerMatching__LayerMatchingAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2850:1: ( ( rule__LayerMatching__LayerMatchingAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2850:1: ( ( rule__LayerMatching__LayerMatchingAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2851:1: ( rule__LayerMatching__LayerMatchingAssignment_0 )
            {
             before(grammarAccess.getLayerMatchingAccess().getLayerMatchingAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2852:1: ( rule__LayerMatching__LayerMatchingAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2852:2: rule__LayerMatching__LayerMatchingAssignment_0
            {
            pushFollow(FOLLOW_rule__LayerMatching__LayerMatchingAssignment_0_in_rule__LayerMatching__Group__0__Impl5902);
            rule__LayerMatching__LayerMatchingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLayerMatchingAccess().getLayerMatchingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__Group__0__Impl"


    // $ANTLR start "rule__LayerMatching__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2862:1: rule__LayerMatching__Group__1 : rule__LayerMatching__Group__1__Impl ;
    public final void rule__LayerMatching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2866:1: ( rule__LayerMatching__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2867:2: rule__LayerMatching__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LayerMatching__Group__1__Impl_in_rule__LayerMatching__Group__15932);
            rule__LayerMatching__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__Group__1"


    // $ANTLR start "rule__LayerMatching__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2873:1: rule__LayerMatching__Group__1__Impl : ( ( rule__LayerMatching__ParameterAssignment_1 ) ) ;
    public final void rule__LayerMatching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2877:1: ( ( ( rule__LayerMatching__ParameterAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2878:1: ( ( rule__LayerMatching__ParameterAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2878:1: ( ( rule__LayerMatching__ParameterAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2879:1: ( rule__LayerMatching__ParameterAssignment_1 )
            {
             before(grammarAccess.getLayerMatchingAccess().getParameterAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2880:1: ( rule__LayerMatching__ParameterAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2880:2: rule__LayerMatching__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__LayerMatching__ParameterAssignment_1_in_rule__LayerMatching__Group__1__Impl5959);
            rule__LayerMatching__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerMatchingAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__Group__1__Impl"


    // $ANTLR start "rule__ClassMatching__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2894:1: rule__ClassMatching__Group__0 : rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 ;
    public final void rule__ClassMatching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2898:1: ( rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2899:2: rule__ClassMatching__Group__0__Impl rule__ClassMatching__Group__1
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__05993);
            rule__ClassMatching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__05996);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2906:1: rule__ClassMatching__Group__0__Impl : ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) ;
    public final void rule__ClassMatching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2910:1: ( ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2911:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2911:1: ( ( rule__ClassMatching__ExpressionMatchingAssignment_0 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2912:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingAssignment_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2913:1: ( rule__ClassMatching__ExpressionMatchingAssignment_0 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2913:2: rule__ClassMatching__ExpressionMatchingAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl6023);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2923:1: rule__ClassMatching__Group__1 : rule__ClassMatching__Group__1__Impl ;
    public final void rule__ClassMatching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2927:1: ( rule__ClassMatching__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2928:2: rule__ClassMatching__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__16053);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2934:1: rule__ClassMatching__Group__1__Impl : ( ( rule__ClassMatching__ParameterAssignment_1 ) ) ;
    public final void rule__ClassMatching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2938:1: ( ( ( rule__ClassMatching__ParameterAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2939:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2939:1: ( ( rule__ClassMatching__ParameterAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2940:1: ( rule__ClassMatching__ParameterAssignment_1 )
            {
             before(grammarAccess.getClassMatchingAccess().getParameterAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2941:1: ( rule__ClassMatching__ParameterAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2941:2: rule__ClassMatching__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl6080);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2955:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2959:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2960:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__06114);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__06117);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2967:1: rule__File__Group__0__Impl : ( 'file' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2971:1: ( ( 'file' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2972:1: ( 'file' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2972:1: ( 'file' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2973:1: 'file'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__File__Group__0__Impl6145); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2986:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2990:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2991:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__16176);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__16179);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:2998:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3002:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3003:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3003:1: ( ( rule__File__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3004:1: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3005:1: ( rule__File__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3005:2: rule__File__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl6206);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3015:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3019:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3020:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__26236);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__26239);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3027:1: rule__File__Group__2__Impl : ( '{' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3031:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3032:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3032:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3033:1: '{'
            {
             before(grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__File__Group__2__Impl6267); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3046:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3050:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3051:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__36298);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__4_in_rule__File__Group__36301);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3058:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )? ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3062:1: ( ( ( rule__File__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3063:1: ( ( rule__File__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3063:1: ( ( rule__File__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3064:1: ( rule__File__Group_3__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3065:1: ( rule__File__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3065:2: rule__File__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl6328);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3075:1: rule__File__Group__4 : rule__File__Group__4__Impl rule__File__Group__5 ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3079:1: ( rule__File__Group__4__Impl rule__File__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3080:2: rule__File__Group__4__Impl rule__File__Group__5
            {
            pushFollow(FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__46359);
            rule__File__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__5_in_rule__File__Group__46362);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3087:1: rule__File__Group__4__Impl : ( ( rule__File__Group_4__0 )? ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3091:1: ( ( ( rule__File__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3092:1: ( ( rule__File__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3092:1: ( ( rule__File__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3093:1: ( rule__File__Group_4__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3094:1: ( rule__File__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3094:2: rule__File__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl6389);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3104:1: rule__File__Group__5 : rule__File__Group__5__Impl ;
    public final void rule__File__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3108:1: ( rule__File__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3109:2: rule__File__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__56420);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3115:1: rule__File__Group__5__Impl : ( '}' ) ;
    public final void rule__File__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3119:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3120:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3120:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3121:1: '}'
            {
             before(grammarAccess.getFileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__File__Group__5__Impl6448); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3146:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3150:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3151:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__06491);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__06494);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3158:1: rule__File__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3162:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3163:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3163:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3164:1: 'matching'
            {
             before(grammarAccess.getFileAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__File__Group_3__0__Impl6522); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3177:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl rule__File__Group_3__2 ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3181:1: ( rule__File__Group_3__1__Impl rule__File__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3182:2: rule__File__Group_3__1__Impl rule__File__Group_3__2
            {
            pushFollow(FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__16553);
            rule__File__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__16556);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3189:1: rule__File__Group_3__1__Impl : ( ( rule__File__MatchingAssignment_3_1 ) ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3193:1: ( ( ( rule__File__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3194:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3194:1: ( ( rule__File__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3195:1: ( rule__File__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getFileAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3196:1: ( rule__File__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3196:2: rule__File__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl6583);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3206:1: rule__File__Group_3__2 : rule__File__Group_3__2__Impl ;
    public final void rule__File__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3210:1: ( rule__File__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3211:2: rule__File__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__26613);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3217:1: rule__File__Group_3__2__Impl : ( ';' ) ;
    public final void rule__File__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3221:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3222:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3222:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3223:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__File__Group_3__2__Impl6641); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3242:1: rule__File__Group_4__0 : rule__File__Group_4__0__Impl rule__File__Group_4__1 ;
    public final void rule__File__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3246:1: ( rule__File__Group_4__0__Impl rule__File__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3247:2: rule__File__Group_4__0__Impl rule__File__Group_4__1
            {
            pushFollow(FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__06678);
            rule__File__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__06681);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3254:1: rule__File__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__File__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3258:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3259:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3259:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3260:1: 'cardinality'
            {
             before(grammarAccess.getFileAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__File__Group_4__0__Impl6709); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3273:1: rule__File__Group_4__1 : rule__File__Group_4__1__Impl rule__File__Group_4__2 ;
    public final void rule__File__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3277:1: ( rule__File__Group_4__1__Impl rule__File__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3278:2: rule__File__Group_4__1__Impl rule__File__Group_4__2
            {
            pushFollow(FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__16740);
            rule__File__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__16743);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3285:1: rule__File__Group_4__1__Impl : ( ( rule__File__CardinalityAssignment_4_1 ) ) ;
    public final void rule__File__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3289:1: ( ( ( rule__File__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3290:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3290:1: ( ( rule__File__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3291:1: ( rule__File__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getFileAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3292:1: ( rule__File__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3292:2: rule__File__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl6770);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3302:1: rule__File__Group_4__2 : rule__File__Group_4__2__Impl ;
    public final void rule__File__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3306:1: ( rule__File__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3307:2: rule__File__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__26800);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3313:1: rule__File__Group_4__2__Impl : ( ';' ) ;
    public final void rule__File__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3317:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3318:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3318:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3319:1: ';'
            {
             before(grammarAccess.getFileAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__File__Group_4__2__Impl6828); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3338:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3342:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3343:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__06865);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__06868);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3350:1: rule__Configuration__Group__0__Impl : ( 'configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3354:1: ( ( 'configuration' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3355:1: ( 'configuration' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3355:1: ( 'configuration' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3356:1: 'configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__Configuration__Group__0__Impl6896); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3369:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3373:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3374:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__16927);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__16930);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3381:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3385:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3386:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3386:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3387:1: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3388:1: ( rule__Configuration__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3388:2: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl6957);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3398:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl rule__Configuration__Group__3 ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3402:1: ( rule__Configuration__Group__2__Impl rule__Configuration__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3403:2: rule__Configuration__Group__2__Impl rule__Configuration__Group__3
            {
            pushFollow(FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__26987);
            rule__Configuration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__26990);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3410:1: rule__Configuration__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3414:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3415:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3415:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3416:1: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Configuration__Group__2__Impl7018); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3429:1: rule__Configuration__Group__3 : rule__Configuration__Group__3__Impl rule__Configuration__Group__4 ;
    public final void rule__Configuration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3433:1: ( rule__Configuration__Group__3__Impl rule__Configuration__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3434:2: rule__Configuration__Group__3__Impl rule__Configuration__Group__4
            {
            pushFollow(FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__37049);
            rule__Configuration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__37052);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3441:1: rule__Configuration__Group__3__Impl : ( ( rule__Configuration__Group_3__0 )? ) ;
    public final void rule__Configuration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3445:1: ( ( ( rule__Configuration__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3446:1: ( ( rule__Configuration__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3446:1: ( ( rule__Configuration__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3447:1: ( rule__Configuration__Group_3__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3448:1: ( rule__Configuration__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3448:2: rule__Configuration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl7079);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3458:1: rule__Configuration__Group__4 : rule__Configuration__Group__4__Impl rule__Configuration__Group__5 ;
    public final void rule__Configuration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3462:1: ( rule__Configuration__Group__4__Impl rule__Configuration__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3463:2: rule__Configuration__Group__4__Impl rule__Configuration__Group__5
            {
            pushFollow(FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__47110);
            rule__Configuration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__47113);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3470:1: rule__Configuration__Group__4__Impl : ( ( rule__Configuration__Group_4__0 )? ) ;
    public final void rule__Configuration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3474:1: ( ( ( rule__Configuration__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3475:1: ( ( rule__Configuration__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3475:1: ( ( rule__Configuration__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3476:1: ( rule__Configuration__Group_4__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3477:1: ( rule__Configuration__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3477:2: rule__Configuration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl7140);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3487:1: rule__Configuration__Group__5 : rule__Configuration__Group__5__Impl rule__Configuration__Group__6 ;
    public final void rule__Configuration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3491:1: ( rule__Configuration__Group__5__Impl rule__Configuration__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3492:2: rule__Configuration__Group__5__Impl rule__Configuration__Group__6
            {
            pushFollow(FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__57171);
            rule__Configuration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__57174);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3499:1: rule__Configuration__Group__5__Impl : ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) ;
    public final void rule__Configuration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3503:1: ( ( ( rule__Configuration__ConfigurationElementAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3504:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3504:1: ( ( rule__Configuration__ConfigurationElementAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3505:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3506:1: ( rule__Configuration__ConfigurationElementAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=55 && LA28_0<=56)||(LA28_0>=61 && LA28_0<=62)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3506:2: rule__Configuration__ConfigurationElementAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl7201);
            	    rule__Configuration__ConfigurationElementAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3516:1: rule__Configuration__Group__6 : rule__Configuration__Group__6__Impl ;
    public final void rule__Configuration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3520:1: ( rule__Configuration__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3521:2: rule__Configuration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__67232);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3527:1: rule__Configuration__Group__6__Impl : ( '}' ) ;
    public final void rule__Configuration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3531:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3532:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3532:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3533:1: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__Configuration__Group__6__Impl7260); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3560:1: rule__Configuration__Group_3__0 : rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 ;
    public final void rule__Configuration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3564:1: ( rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3565:2: rule__Configuration__Group_3__0__Impl rule__Configuration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__07305);
            rule__Configuration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__07308);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3572:1: rule__Configuration__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Configuration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3576:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3577:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3577:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3578:1: 'matching'
            {
             before(grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Configuration__Group_3__0__Impl7336); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3591:1: rule__Configuration__Group_3__1 : rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 ;
    public final void rule__Configuration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3595:1: ( rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3596:2: rule__Configuration__Group_3__1__Impl rule__Configuration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__17367);
            rule__Configuration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__17370);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3603:1: rule__Configuration__Group_3__1__Impl : ( ( rule__Configuration__MatchingAssignment_3_1 ) ) ;
    public final void rule__Configuration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3607:1: ( ( ( rule__Configuration__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3608:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3608:1: ( ( rule__Configuration__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3609:1: ( rule__Configuration__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getConfigurationAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3610:1: ( rule__Configuration__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3610:2: rule__Configuration__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl7397);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3620:1: rule__Configuration__Group_3__2 : rule__Configuration__Group_3__2__Impl ;
    public final void rule__Configuration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3624:1: ( rule__Configuration__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3625:2: rule__Configuration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__27427);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3631:1: rule__Configuration__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3635:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3636:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3636:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3637:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__Configuration__Group_3__2__Impl7455); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3656:1: rule__Configuration__Group_4__0 : rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 ;
    public final void rule__Configuration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3660:1: ( rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3661:2: rule__Configuration__Group_4__0__Impl rule__Configuration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__07492);
            rule__Configuration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__07495);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3668:1: rule__Configuration__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Configuration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3672:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3673:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3673:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3674:1: 'cardinality'
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Configuration__Group_4__0__Impl7523); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3687:1: rule__Configuration__Group_4__1 : rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 ;
    public final void rule__Configuration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3691:1: ( rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3692:2: rule__Configuration__Group_4__1__Impl rule__Configuration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__17554);
            rule__Configuration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__17557);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3699:1: rule__Configuration__Group_4__1__Impl : ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Configuration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3703:1: ( ( ( rule__Configuration__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3704:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3704:1: ( ( rule__Configuration__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3705:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3706:1: ( rule__Configuration__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3706:2: rule__Configuration__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl7584);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3716:1: rule__Configuration__Group_4__2 : rule__Configuration__Group_4__2__Impl ;
    public final void rule__Configuration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3720:1: ( rule__Configuration__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3721:2: rule__Configuration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__27614);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3727:1: rule__Configuration__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Configuration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3731:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3732:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3732:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3733:1: ';'
            {
             before(grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__Configuration__Group_4__2__Impl7642); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3752:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3756:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3757:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__07679);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__07682);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3764:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3768:1: ( ( 'method' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3769:1: ( 'method' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3769:1: ( 'method' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3770:1: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Method__Group__0__Impl7710); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3783:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3787:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3788:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__17741);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__2_in_rule__Method__Group__17744);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3795:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3799:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3800:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3800:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3801:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3802:1: ( rule__Method__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3802:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl7771);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3812:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3816:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3817:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__27801);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__3_in_rule__Method__Group__27804);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3824:1: rule__Method__Group__2__Impl : ( '{' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3828:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3829:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3829:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3830:1: '{'
            {
             before(grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Method__Group__2__Impl7832); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3843:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3847:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3848:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__37863);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__4_in_rule__Method__Group__37866);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3855:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3859:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3860:1: ( ( rule__Method__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3860:1: ( ( rule__Method__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3861:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3862:1: ( rule__Method__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3862:2: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl7893);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3872:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3876:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3877:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__47924);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__5_in_rule__Method__Group__47927);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3884:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3888:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3889:1: ( ( rule__Method__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3889:1: ( ( rule__Method__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3890:1: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3891:1: ( rule__Method__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3891:2: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl7954);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3901:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3905:1: ( rule__Method__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3906:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__57985);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3912:1: rule__Method__Group__5__Impl : ( '}' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3916:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3917:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3917:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3918:1: '}'
            {
             before(grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Method__Group__5__Impl8013); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3943:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3947:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3948:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__08056);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__08059);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3955:1: rule__Method__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3959:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3960:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3960:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3961:1: 'matching'
            {
             before(grammarAccess.getMethodAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Method__Group_3__0__Impl8087); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3974:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl rule__Method__Group_3__2 ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3978:1: ( rule__Method__Group_3__1__Impl rule__Method__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3979:2: rule__Method__Group_3__1__Impl rule__Method__Group_3__2
            {
            pushFollow(FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__18118);
            rule__Method__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__18121);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3986:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__MatchingAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3990:1: ( ( ( rule__Method__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3991:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3991:1: ( ( rule__Method__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3992:1: ( rule__Method__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3993:1: ( rule__Method__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:3993:2: rule__Method__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl8148);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4003:1: rule__Method__Group_3__2 : rule__Method__Group_3__2__Impl ;
    public final void rule__Method__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4007:1: ( rule__Method__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4008:2: rule__Method__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__28178);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4014:1: rule__Method__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4018:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4019:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4019:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4020:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__Method__Group_3__2__Impl8206); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4039:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4043:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4044:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__08243);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__08246);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4051:1: rule__Method__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4055:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4056:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4056:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4057:1: 'cardinality'
            {
             before(grammarAccess.getMethodAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__Method__Group_4__0__Impl8274); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4070:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl rule__Method__Group_4__2 ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4074:1: ( rule__Method__Group_4__1__Impl rule__Method__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4075:2: rule__Method__Group_4__1__Impl rule__Method__Group_4__2
            {
            pushFollow(FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__18305);
            rule__Method__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__18308);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4082:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__CardinalityAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4086:1: ( ( ( rule__Method__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4087:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4087:1: ( ( rule__Method__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4088:1: ( rule__Method__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4089:1: ( rule__Method__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4089:2: rule__Method__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl8335);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4099:1: rule__Method__Group_4__2 : rule__Method__Group_4__2__Impl ;
    public final void rule__Method__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4103:1: ( rule__Method__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4104:2: rule__Method__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__28365);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4110:1: rule__Method__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Method__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4114:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4115:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4115:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4116:1: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__Method__Group_4__2__Impl8393); 
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


    // $ANTLR start "rule__Class__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4135:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4139:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4140:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__08430);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__08433);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4147:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4151:1: ( ( 'class' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4152:1: ( 'class' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4152:1: ( 'class' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4153:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__Class__Group__0__Impl8461); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4166:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4170:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4171:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__18492);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__18495);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4178:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4182:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4183:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4183:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4184:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4185:1: ( rule__Class__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4185:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl8522);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4195:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4199:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4200:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__28552);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__28555);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4207:1: rule__Class__Group__2__Impl : ( '{' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4211:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4212:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4212:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4213:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Class__Group__2__Impl8583); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4226:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4230:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4231:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__38614);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__38617);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4238:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4242:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4243:1: ( ( rule__Class__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4243:1: ( ( rule__Class__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4244:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4245:1: ( rule__Class__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4245:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl8644);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4255:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4259:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4260:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__48675);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__48678);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4267:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4271:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4272:1: ( ( rule__Class__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4272:1: ( ( rule__Class__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4273:1: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4274:1: ( rule__Class__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4274:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl8705);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4284:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4288:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4289:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__58736);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__58739);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4296:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4300:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4301:1: ( ( rule__Class__Group_5__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4301:1: ( ( rule__Class__Group_5__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4302:1: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4303:1: ( rule__Class__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4303:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl8766);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4313:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4317:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4318:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__68797);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__7_in_rule__Class__Group__68800);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4325:1: rule__Class__Group__6__Impl : ( ( rule__Class__MethodsAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4329:1: ( ( ( rule__Class__MethodsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4330:1: ( ( rule__Class__MethodsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4330:1: ( ( rule__Class__MethodsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4331:1: ( rule__Class__MethodsAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4332:1: ( rule__Class__MethodsAssignment_6 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==57) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4332:2: rule__Class__MethodsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class__MethodsAssignment_6_in_rule__Class__Group__6__Impl8827);
            	    rule__Class__MethodsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4342:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4346:1: ( rule__Class__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4347:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__78858);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4353:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4357:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4358:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4358:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4359:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_43_in_rule__Class__Group__7__Impl8886); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4388:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4392:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4393:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__08933);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__08936);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4400:1: rule__Class__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4404:1: ( ( 'description' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4405:1: ( 'description' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4405:1: ( 'description' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4406:1: 'description'
            {
             before(grammarAccess.getClassAccess().getDescriptionKeyword_3_0()); 
            match(input,59,FOLLOW_59_in_rule__Class__Group_3__0__Impl8964); 
             after(grammarAccess.getClassAccess().getDescriptionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4419:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4423:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4424:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__18995);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__18998);
            rule__Class__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4431:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4435:1: ( ( ( rule__Class__DescriptionAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4436:1: ( ( rule__Class__DescriptionAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4436:1: ( ( rule__Class__DescriptionAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4437:1: ( rule__Class__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getDescriptionAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4438:1: ( rule__Class__DescriptionAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4438:2: rule__Class__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class__DescriptionAssignment_3_1_in_rule__Class__Group_3__1__Impl9025);
            rule__Class__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4448:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4452:1: ( rule__Class__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4453:2: rule__Class__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__29055);
            rule__Class__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4459:1: rule__Class__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4463:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4464:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4464:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4465:1: ';'
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__Class__Group_3__2__Impl9083); 
             after(grammarAccess.getClassAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4484:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4488:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4489:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__09120);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__09123);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4496:1: rule__Class__Group_4__0__Impl : ( 'matching:' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4500:1: ( ( 'matching:' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4501:1: ( 'matching:' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4501:1: ( 'matching:' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4502:1: 'matching:'
            {
             before(grammarAccess.getClassAccess().getMatchingKeyword_4_0()); 
            match(input,60,FOLLOW_60_in_rule__Class__Group_4__0__Impl9151); 
             after(grammarAccess.getClassAccess().getMatchingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4515:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4519:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4520:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__19182);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_4__2_in_rule__Class__Group_4__19185);
            rule__Class__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4527:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__MatchingAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4531:1: ( ( ( rule__Class__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4532:1: ( ( rule__Class__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4532:1: ( ( rule__Class__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4533:1: ( rule__Class__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4534:1: ( rule__Class__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4534:2: rule__Class__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__MatchingAssignment_4_1_in_rule__Class__Group_4__1__Impl9212);
            rule__Class__MatchingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getMatchingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_4__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4544:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4548:1: ( rule__Class__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4549:2: rule__Class__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__2__Impl_in_rule__Class__Group_4__29242);
            rule__Class__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4555:1: rule__Class__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4559:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4560:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4560:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4561:1: ';'
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__Class__Group_4__2__Impl9270); 
             after(grammarAccess.getClassAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4580:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4584:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4585:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__09307);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__09310);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4592:1: rule__Class__Group_5__0__Impl : ( 'cardinality' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4596:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4597:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4597:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4598:1: 'cardinality'
            {
             before(grammarAccess.getClassAccess().getCardinalityKeyword_5_0()); 
            match(input,52,FOLLOW_52_in_rule__Class__Group_5__0__Impl9338); 
             after(grammarAccess.getClassAccess().getCardinalityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4611:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4615:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4616:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__19369);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_5__2_in_rule__Class__Group_5__19372);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4623:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__CardinalityAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4627:1: ( ( ( rule__Class__CardinalityAssignment_5_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4628:1: ( ( rule__Class__CardinalityAssignment_5_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4628:1: ( ( rule__Class__CardinalityAssignment_5_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4629:1: ( rule__Class__CardinalityAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getCardinalityAssignment_5_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4630:1: ( rule__Class__CardinalityAssignment_5_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4630:2: rule__Class__CardinalityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Class__CardinalityAssignment_5_1_in_rule__Class__Group_5__1__Impl9399);
            rule__Class__CardinalityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getCardinalityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4640:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4644:1: ( rule__Class__Group_5__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4645:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_5__2__Impl_in_rule__Class__Group_5__29429);
            rule__Class__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4651:1: rule__Class__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4655:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4656:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4656:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4657:1: ';'
            {
             before(grammarAccess.getClassAccess().getSemicolonKeyword_5_2()); 
            match(input,45,FOLLOW_45_in_rule__Class__Group_5__2__Impl9457); 
             after(grammarAccess.getClassAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__XmlElement__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4676:1: rule__XmlElement__Group__0 : rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 ;
    public final void rule__XmlElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4680:1: ( rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4681:2: rule__XmlElement__Group__0__Impl rule__XmlElement__Group__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__09494);
            rule__XmlElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__09497);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4688:1: rule__XmlElement__Group__0__Impl : ( 'xmlElement' ) ;
    public final void rule__XmlElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4692:1: ( ( 'xmlElement' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4693:1: ( 'xmlElement' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4693:1: ( 'xmlElement' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4694:1: 'xmlElement'
            {
             before(grammarAccess.getXmlElementAccess().getXmlElementKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__XmlElement__Group__0__Impl9525); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4707:1: rule__XmlElement__Group__1 : rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 ;
    public final void rule__XmlElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4711:1: ( rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4712:2: rule__XmlElement__Group__1__Impl rule__XmlElement__Group__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__19556);
            rule__XmlElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__19559);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4719:1: rule__XmlElement__Group__1__Impl : ( ( rule__XmlElement__NameAssignment_1 ) ) ;
    public final void rule__XmlElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4723:1: ( ( ( rule__XmlElement__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4724:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4724:1: ( ( rule__XmlElement__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4725:1: ( rule__XmlElement__NameAssignment_1 )
            {
             before(grammarAccess.getXmlElementAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4726:1: ( rule__XmlElement__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4726:2: rule__XmlElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl9586);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4736:1: rule__XmlElement__Group__2 : rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 ;
    public final void rule__XmlElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4740:1: ( rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4741:2: rule__XmlElement__Group__2__Impl rule__XmlElement__Group__3
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__29616);
            rule__XmlElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__29619);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4748:1: rule__XmlElement__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4752:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4753:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4753:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4754:1: '{'
            {
             before(grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__XmlElement__Group__2__Impl9647); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4767:1: rule__XmlElement__Group__3 : rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 ;
    public final void rule__XmlElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4771:1: ( rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4772:2: rule__XmlElement__Group__3__Impl rule__XmlElement__Group__4
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__39678);
            rule__XmlElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__39681);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4779:1: rule__XmlElement__Group__3__Impl : ( ( rule__XmlElement__Group_3__0 )? ) ;
    public final void rule__XmlElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4783:1: ( ( ( rule__XmlElement__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4784:1: ( ( rule__XmlElement__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4784:1: ( ( rule__XmlElement__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4785:1: ( rule__XmlElement__Group_3__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4786:1: ( rule__XmlElement__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4786:2: rule__XmlElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl9708);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4796:1: rule__XmlElement__Group__4 : rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 ;
    public final void rule__XmlElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4800:1: ( rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4801:2: rule__XmlElement__Group__4__Impl rule__XmlElement__Group__5
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__49739);
            rule__XmlElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__49742);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4808:1: rule__XmlElement__Group__4__Impl : ( ( rule__XmlElement__Group_4__0 )? ) ;
    public final void rule__XmlElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4812:1: ( ( ( rule__XmlElement__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4813:1: ( ( rule__XmlElement__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4813:1: ( ( rule__XmlElement__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4814:1: ( rule__XmlElement__Group_4__0 )?
            {
             before(grammarAccess.getXmlElementAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4815:1: ( rule__XmlElement__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4815:2: rule__XmlElement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl9769);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4825:1: rule__XmlElement__Group__5 : rule__XmlElement__Group__5__Impl ;
    public final void rule__XmlElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4829:1: ( rule__XmlElement__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4830:2: rule__XmlElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__59800);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4836:1: rule__XmlElement__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4840:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4841:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4841:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4842:1: '}'
            {
             before(grammarAccess.getXmlElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__XmlElement__Group__5__Impl9828); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4867:1: rule__XmlElement__Group_3__0 : rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 ;
    public final void rule__XmlElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4871:1: ( rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4872:2: rule__XmlElement__Group_3__0__Impl rule__XmlElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__09871);
            rule__XmlElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__09874);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4879:1: rule__XmlElement__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4883:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4884:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4884:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4885:1: 'matching'
            {
             before(grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlElement__Group_3__0__Impl9902); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4898:1: rule__XmlElement__Group_3__1 : rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 ;
    public final void rule__XmlElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4902:1: ( rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4903:2: rule__XmlElement__Group_3__1__Impl rule__XmlElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19933);
            rule__XmlElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19936);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4910:1: rule__XmlElement__Group_3__1__Impl : ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4914:1: ( ( ( rule__XmlElement__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4915:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4915:1: ( ( rule__XmlElement__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4916:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlElementAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4917:1: ( rule__XmlElement__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4917:2: rule__XmlElement__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9963);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4927:1: rule__XmlElement__Group_3__2 : rule__XmlElement__Group_3__2__Impl ;
    public final void rule__XmlElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4931:1: ( rule__XmlElement__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4932:2: rule__XmlElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29993);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4938:1: rule__XmlElement__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4942:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4943:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4943:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4944:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__XmlElement__Group_3__2__Impl10021); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4963:1: rule__XmlElement__Group_4__0 : rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 ;
    public final void rule__XmlElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4967:1: ( rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4968:2: rule__XmlElement__Group_4__0__Impl rule__XmlElement__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__010058);
            rule__XmlElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__010061);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4975:1: rule__XmlElement__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4979:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4980:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4980:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4981:1: 'cardinality'
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__XmlElement__Group_4__0__Impl10089); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4994:1: rule__XmlElement__Group_4__1 : rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 ;
    public final void rule__XmlElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4998:1: ( rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:4999:2: rule__XmlElement__Group_4__1__Impl rule__XmlElement__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__110120);
            rule__XmlElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__110123);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5006:1: rule__XmlElement__Group_4__1__Impl : ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5010:1: ( ( ( rule__XmlElement__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5011:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5011:1: ( ( rule__XmlElement__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5012:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5013:1: ( rule__XmlElement__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5013:2: rule__XmlElement__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl10150);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5023:1: rule__XmlElement__Group_4__2 : rule__XmlElement__Group_4__2__Impl ;
    public final void rule__XmlElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5027:1: ( rule__XmlElement__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5028:2: rule__XmlElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__210180);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5034:1: rule__XmlElement__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5038:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5039:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5039:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5040:1: ';'
            {
             before(grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__XmlElement__Group_4__2__Impl10208); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5059:1: rule__XmlDocument__Group__0 : rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 ;
    public final void rule__XmlDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5063:1: ( rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5064:2: rule__XmlDocument__Group__0__Impl rule__XmlDocument__Group__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__010245);
            rule__XmlDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__010248);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5071:1: rule__XmlDocument__Group__0__Impl : ( 'xmlDocument' ) ;
    public final void rule__XmlDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5075:1: ( ( 'xmlDocument' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5076:1: ( 'xmlDocument' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5076:1: ( 'xmlDocument' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5077:1: 'xmlDocument'
            {
             before(grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0()); 
            match(input,62,FOLLOW_62_in_rule__XmlDocument__Group__0__Impl10276); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5090:1: rule__XmlDocument__Group__1 : rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 ;
    public final void rule__XmlDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5094:1: ( rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5095:2: rule__XmlDocument__Group__1__Impl rule__XmlDocument__Group__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__110307);
            rule__XmlDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__110310);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5102:1: rule__XmlDocument__Group__1__Impl : ( ( rule__XmlDocument__NameAssignment_1 ) ) ;
    public final void rule__XmlDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5106:1: ( ( ( rule__XmlDocument__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5107:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5107:1: ( ( rule__XmlDocument__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5108:1: ( rule__XmlDocument__NameAssignment_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5109:1: ( rule__XmlDocument__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5109:2: rule__XmlDocument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl10337);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5119:1: rule__XmlDocument__Group__2 : rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 ;
    public final void rule__XmlDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5123:1: ( rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5124:2: rule__XmlDocument__Group__2__Impl rule__XmlDocument__Group__3
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__210367);
            rule__XmlDocument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__210370);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5131:1: rule__XmlDocument__Group__2__Impl : ( '{' ) ;
    public final void rule__XmlDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5135:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5136:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5136:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5137:1: '{'
            {
             before(grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__XmlDocument__Group__2__Impl10398); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5150:1: rule__XmlDocument__Group__3 : rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 ;
    public final void rule__XmlDocument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5154:1: ( rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5155:2: rule__XmlDocument__Group__3__Impl rule__XmlDocument__Group__4
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__310429);
            rule__XmlDocument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__310432);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5162:1: rule__XmlDocument__Group__3__Impl : ( ( rule__XmlDocument__Group_3__0 )? ) ;
    public final void rule__XmlDocument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5166:1: ( ( ( rule__XmlDocument__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5167:1: ( ( rule__XmlDocument__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5167:1: ( ( rule__XmlDocument__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5168:1: ( rule__XmlDocument__Group_3__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5169:1: ( rule__XmlDocument__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5169:2: rule__XmlDocument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl10459);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5179:1: rule__XmlDocument__Group__4 : rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 ;
    public final void rule__XmlDocument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5183:1: ( rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5184:2: rule__XmlDocument__Group__4__Impl rule__XmlDocument__Group__5
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__410490);
            rule__XmlDocument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__410493);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5191:1: rule__XmlDocument__Group__4__Impl : ( ( rule__XmlDocument__Group_4__0 )? ) ;
    public final void rule__XmlDocument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5195:1: ( ( ( rule__XmlDocument__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5196:1: ( ( rule__XmlDocument__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5196:1: ( ( rule__XmlDocument__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5197:1: ( rule__XmlDocument__Group_4__0 )?
            {
             before(grammarAccess.getXmlDocumentAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5198:1: ( rule__XmlDocument__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5198:2: rule__XmlDocument__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl10520);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5208:1: rule__XmlDocument__Group__5 : rule__XmlDocument__Group__5__Impl ;
    public final void rule__XmlDocument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5212:1: ( rule__XmlDocument__Group__5__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5213:2: rule__XmlDocument__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__510551);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5219:1: rule__XmlDocument__Group__5__Impl : ( '}' ) ;
    public final void rule__XmlDocument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5223:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5224:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5224:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5225:1: '}'
            {
             before(grammarAccess.getXmlDocumentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__XmlDocument__Group__5__Impl10579); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5250:1: rule__XmlDocument__Group_3__0 : rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 ;
    public final void rule__XmlDocument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5254:1: ( rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5255:2: rule__XmlDocument__Group_3__0__Impl rule__XmlDocument__Group_3__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__010622);
            rule__XmlDocument__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__010625);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5262:1: rule__XmlDocument__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__XmlDocument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5266:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5267:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5267:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5268:1: 'matching'
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__XmlDocument__Group_3__0__Impl10653); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5281:1: rule__XmlDocument__Group_3__1 : rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 ;
    public final void rule__XmlDocument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5285:1: ( rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5286:2: rule__XmlDocument__Group_3__1__Impl rule__XmlDocument__Group_3__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__110684);
            rule__XmlDocument__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__110687);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5293:1: rule__XmlDocument__Group_3__1__Impl : ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) ;
    public final void rule__XmlDocument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5297:1: ( ( ( rule__XmlDocument__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5298:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5298:1: ( ( rule__XmlDocument__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5299:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5300:1: ( rule__XmlDocument__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5300:2: rule__XmlDocument__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl10714);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5310:1: rule__XmlDocument__Group_3__2 : rule__XmlDocument__Group_3__2__Impl ;
    public final void rule__XmlDocument__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5314:1: ( rule__XmlDocument__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5315:2: rule__XmlDocument__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__210744);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5321:1: rule__XmlDocument__Group_3__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5325:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5326:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5326:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5327:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__XmlDocument__Group_3__2__Impl10772); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5346:1: rule__XmlDocument__Group_4__0 : rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 ;
    public final void rule__XmlDocument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5350:1: ( rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5351:2: rule__XmlDocument__Group_4__0__Impl rule__XmlDocument__Group_4__1
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__010809);
            rule__XmlDocument__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__010812);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5358:1: rule__XmlDocument__Group_4__0__Impl : ( 'cardinality' ) ;
    public final void rule__XmlDocument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5362:1: ( ( 'cardinality' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5363:1: ( 'cardinality' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5363:1: ( 'cardinality' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5364:1: 'cardinality'
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0()); 
            match(input,52,FOLLOW_52_in_rule__XmlDocument__Group_4__0__Impl10840); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5377:1: rule__XmlDocument__Group_4__1 : rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 ;
    public final void rule__XmlDocument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5381:1: ( rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5382:2: rule__XmlDocument__Group_4__1__Impl rule__XmlDocument__Group_4__2
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__110871);
            rule__XmlDocument__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__110874);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5389:1: rule__XmlDocument__Group_4__1__Impl : ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) ;
    public final void rule__XmlDocument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5393:1: ( ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5394:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5394:1: ( ( rule__XmlDocument__CardinalityAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5395:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5396:1: ( rule__XmlDocument__CardinalityAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5396:2: rule__XmlDocument__CardinalityAssignment_4_1
            {
            pushFollow(FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl10901);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5406:1: rule__XmlDocument__Group_4__2 : rule__XmlDocument__Group_4__2__Impl ;
    public final void rule__XmlDocument__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5410:1: ( rule__XmlDocument__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5411:2: rule__XmlDocument__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210931);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5417:1: rule__XmlDocument__Group_4__2__Impl : ( ';' ) ;
    public final void rule__XmlDocument__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5421:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5422:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5422:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5423:1: ';'
            {
             before(grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__XmlDocument__Group_4__2__Impl10959); 
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


    // $ANTLR start "rule__Layer__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5442:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5446:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5447:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__010996);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__010999);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5454:1: rule__Layer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5458:1: ( ( 'layer' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5459:1: ( 'layer' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5459:1: ( 'layer' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5460:1: 'layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_0()); 
            match(input,63,FOLLOW_63_in_rule__Layer__Group__0__Impl11027); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5473:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5477:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5478:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__111058);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__2_in_rule__Layer__Group__111061);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5485:1: rule__Layer__Group__1__Impl : ( ( rule__Layer__NameAssignment_1 ) ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5489:1: ( ( ( rule__Layer__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5490:1: ( ( rule__Layer__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5490:1: ( ( rule__Layer__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5491:1: ( rule__Layer__NameAssignment_1 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5492:1: ( rule__Layer__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5492:2: rule__Layer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl11088);
            rule__Layer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5502:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5506:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5507:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_rule__Layer__Group__2__Impl_in_rule__Layer__Group__211118);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__3_in_rule__Layer__Group__211121);
            rule__Layer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5514:1: rule__Layer__Group__2__Impl : ( '{' ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5518:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5519:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5519:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5520:1: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Layer__Group__2__Impl11149); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5533:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5537:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5538:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_rule__Layer__Group__3__Impl_in_rule__Layer__Group__311180);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__4_in_rule__Layer__Group__311183);
            rule__Layer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5545:1: rule__Layer__Group__3__Impl : ( ( rule__Layer__Group_3__0 )? ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5549:1: ( ( ( rule__Layer__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5550:1: ( ( rule__Layer__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5550:1: ( ( rule__Layer__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5551:1: ( rule__Layer__Group_3__0 )?
            {
             before(grammarAccess.getLayerAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5552:1: ( rule__Layer__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5552:2: rule__Layer__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Layer__Group_3__0_in_rule__Layer__Group__3__Impl11210);
                    rule__Layer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5562:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5566:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5567:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_rule__Layer__Group__4__Impl_in_rule__Layer__Group__411241);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__5_in_rule__Layer__Group__411244);
            rule__Layer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5574:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__ModulesAssignment_4 )* ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5578:1: ( ( ( rule__Layer__ModulesAssignment_4 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5579:1: ( ( rule__Layer__ModulesAssignment_4 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5579:1: ( ( rule__Layer__ModulesAssignment_4 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5580:1: ( rule__Layer__ModulesAssignment_4 )*
            {
             before(grammarAccess.getLayerAccess().getModulesAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5581:1: ( rule__Layer__ModulesAssignment_4 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==64) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5581:2: rule__Layer__ModulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Layer__ModulesAssignment_4_in_rule__Layer__Group__4__Impl11271);
            	    rule__Layer__ModulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getModulesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5591:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5595:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5596:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
            {
            pushFollow(FOLLOW_rule__Layer__Group__5__Impl_in_rule__Layer__Group__511302);
            rule__Layer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group__6_in_rule__Layer__Group__511305);
            rule__Layer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5603:1: rule__Layer__Group__5__Impl : ( ( rule__Layer__RestrictionsAssignment_5 )* ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5607:1: ( ( ( rule__Layer__RestrictionsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5608:1: ( ( rule__Layer__RestrictionsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5608:1: ( ( rule__Layer__RestrictionsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5609:1: ( rule__Layer__RestrictionsAssignment_5 )*
            {
             before(grammarAccess.getLayerAccess().getRestrictionsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5610:1: ( rule__Layer__RestrictionsAssignment_5 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==67) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5610:2: rule__Layer__RestrictionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Layer__RestrictionsAssignment_5_in_rule__Layer__Group__5__Impl11332);
            	    rule__Layer__RestrictionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getRestrictionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Layer__Group__6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5620:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5624:1: ( rule__Layer__Group__6__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5625:2: rule__Layer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group__6__Impl_in_rule__Layer__Group__611363);
            rule__Layer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__6"


    // $ANTLR start "rule__Layer__Group__6__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5631:1: rule__Layer__Group__6__Impl : ( '}' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5635:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5636:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5636:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5637:1: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__Layer__Group__6__Impl11391); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__6__Impl"


    // $ANTLR start "rule__Layer__Group_3__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5664:1: rule__Layer__Group_3__0 : rule__Layer__Group_3__0__Impl rule__Layer__Group_3__1 ;
    public final void rule__Layer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5668:1: ( rule__Layer__Group_3__0__Impl rule__Layer__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5669:2: rule__Layer__Group_3__0__Impl rule__Layer__Group_3__1
            {
            pushFollow(FOLLOW_rule__Layer__Group_3__0__Impl_in_rule__Layer__Group_3__011436);
            rule__Layer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group_3__1_in_rule__Layer__Group_3__011439);
            rule__Layer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__0"


    // $ANTLR start "rule__Layer__Group_3__0__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5676:1: rule__Layer__Group_3__0__Impl : ( 'matching' ) ;
    public final void rule__Layer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5680:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5681:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5681:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5682:1: 'matching'
            {
             before(grammarAccess.getLayerAccess().getMatchingKeyword_3_0()); 
            match(input,51,FOLLOW_51_in_rule__Layer__Group_3__0__Impl11467); 
             after(grammarAccess.getLayerAccess().getMatchingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__0__Impl"


    // $ANTLR start "rule__Layer__Group_3__1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5695:1: rule__Layer__Group_3__1 : rule__Layer__Group_3__1__Impl rule__Layer__Group_3__2 ;
    public final void rule__Layer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5699:1: ( rule__Layer__Group_3__1__Impl rule__Layer__Group_3__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5700:2: rule__Layer__Group_3__1__Impl rule__Layer__Group_3__2
            {
            pushFollow(FOLLOW_rule__Layer__Group_3__1__Impl_in_rule__Layer__Group_3__111498);
            rule__Layer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Layer__Group_3__2_in_rule__Layer__Group_3__111501);
            rule__Layer__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__1"


    // $ANTLR start "rule__Layer__Group_3__1__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5707:1: rule__Layer__Group_3__1__Impl : ( ( rule__Layer__MatchingAssignment_3_1 ) ) ;
    public final void rule__Layer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5711:1: ( ( ( rule__Layer__MatchingAssignment_3_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5712:1: ( ( rule__Layer__MatchingAssignment_3_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5712:1: ( ( rule__Layer__MatchingAssignment_3_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5713:1: ( rule__Layer__MatchingAssignment_3_1 )
            {
             before(grammarAccess.getLayerAccess().getMatchingAssignment_3_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5714:1: ( rule__Layer__MatchingAssignment_3_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5714:2: rule__Layer__MatchingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Layer__MatchingAssignment_3_1_in_rule__Layer__Group_3__1__Impl11528);
            rule__Layer__MatchingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getMatchingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__1__Impl"


    // $ANTLR start "rule__Layer__Group_3__2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5724:1: rule__Layer__Group_3__2 : rule__Layer__Group_3__2__Impl ;
    public final void rule__Layer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5728:1: ( rule__Layer__Group_3__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5729:2: rule__Layer__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Layer__Group_3__2__Impl_in_rule__Layer__Group_3__211558);
            rule__Layer__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__2"


    // $ANTLR start "rule__Layer__Group_3__2__Impl"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5735:1: rule__Layer__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Layer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5739:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5740:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5740:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5741:1: ';'
            {
             before(grammarAccess.getLayerAccess().getSemicolonKeyword_3_2()); 
            match(input,45,FOLLOW_45_in_rule__Layer__Group_3__2__Impl11586); 
             after(grammarAccess.getLayerAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group_3__2__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5760:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5764:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5765:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__011623);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__011626);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5772:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5776:1: ( ( 'module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5777:1: ( 'module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5777:1: ( 'module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5778:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__Module__Group__0__Impl11654); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5791:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5795:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5796:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__111685);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__111688);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5803:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5807:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5808:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5808:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5809:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5810:1: ( rule__Module__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5810:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl11715);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5820:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5824:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5825:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__211745);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__211748);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5832:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5836:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5837:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5837:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5838:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Module__Group__2__Impl11776); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5851:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5855:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5856:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__311807);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__311810);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5863:1: rule__Module__Group__3__Impl : ( ( rule__Module__Group_3__0 )? ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5867:1: ( ( ( rule__Module__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5868:1: ( ( rule__Module__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5868:1: ( ( rule__Module__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5869:1: ( rule__Module__Group_3__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5870:1: ( rule__Module__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45||LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5870:2: rule__Module__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl11837);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5880:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5884:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5885:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__411868);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__411871);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5892:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5896:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5897:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5897:1: ( ( rule__Module__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5898:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5899:1: ( rule__Module__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5899:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl11898);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5909:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5913:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5914:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__511929);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__511932);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5921:1: rule__Module__Group__5__Impl : ( ( rule__Module__ComponentsAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5925:1: ( ( ( rule__Module__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5926:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5926:1: ( ( rule__Module__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5927:1: ( rule__Module__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5928:1: ( rule__Module__ComponentsAssignment_5 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==50||(LA44_0>=53 && LA44_0<=58)||(LA44_0>=61 && LA44_0<=65)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5928:2: rule__Module__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl11959);
            	    rule__Module__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5938:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5942:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5943:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__611990);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__611993);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5950:1: rule__Module__Group__6__Impl : ( ( rule__Module__RestrictionsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5954:1: ( ( ( rule__Module__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5955:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5955:1: ( ( rule__Module__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5956:1: ( rule__Module__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5957:1: ( rule__Module__RestrictionsAssignment_6 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==67) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5957:2: rule__Module__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl12020);
            	    rule__Module__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5967:1: rule__Module__Group__7 : rule__Module__Group__7__Impl ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5971:1: ( rule__Module__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5972:2: rule__Module__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__712051);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5978:1: rule__Module__Group__7__Impl : ( '}' ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5982:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5983:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5983:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:5984:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_43_in_rule__Module__Group__7__Impl12079); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6013:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6017:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6018:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__012126);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__012129);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6025:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__Group_3_0__0 )* ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6029:1: ( ( ( rule__Module__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6030:1: ( ( rule__Module__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6030:1: ( ( rule__Module__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6031:1: ( rule__Module__Group_3_0__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6032:1: ( rule__Module__Group_3_0__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==47) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6032:2: rule__Module__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl12156);
            	    rule__Module__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6042:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6046:1: ( rule__Module__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6047:2: rule__Module__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__112187);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6053:1: rule__Module__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6057:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6058:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6058:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6059:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,45,FOLLOW_45_in_rule__Module__Group_3__1__Impl12215); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6076:1: rule__Module__Group_3_0__0 : rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 ;
    public final void rule__Module__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6080:1: ( rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6081:2: rule__Module__Group_3_0__0__Impl rule__Module__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__012250);
            rule__Module__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__012253);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6088:1: rule__Module__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__Module__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6092:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6093:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6093:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6094:1: 'attributes'
            {
             before(grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Module__Group_3_0__0__Impl12281); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6107:1: rule__Module__Group_3_0__1 : rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 ;
    public final void rule__Module__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6111:1: ( rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6112:2: rule__Module__Group_3_0__1__Impl rule__Module__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__112312);
            rule__Module__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__112315);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6119:1: rule__Module__Group_3_0__1__Impl : ( ( rule__Module__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__Module__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6123:1: ( ( ( rule__Module__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6124:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6124:1: ( ( rule__Module__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6125:1: ( rule__Module__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6126:1: ( rule__Module__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6126:2: rule__Module__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl12342);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6136:1: rule__Module__Group_3_0__2 : rule__Module__Group_3_0__2__Impl ;
    public final void rule__Module__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6140:1: ( rule__Module__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6141:2: rule__Module__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__212372);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6147:1: rule__Module__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__Module__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6151:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6152:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6152:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6153:1: ( ',' )?
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6154:1: ( ',' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6155:2: ','
                    {
                    match(input,48,FOLLOW_48_in_rule__Module__Group_3_0__2__Impl12401); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6172:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6176:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6177:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__012440);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__012443);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6184:1: rule__Module__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6188:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6189:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6189:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6190:1: 'matching'
            {
             before(grammarAccess.getModuleAccess().getMatchingKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__Module__Group_4__0__Impl12471); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6203:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl rule__Module__Group_4__2 ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6207:1: ( rule__Module__Group_4__1__Impl rule__Module__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6208:2: rule__Module__Group_4__1__Impl rule__Module__Group_4__2
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__112502);
            rule__Module__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__112505);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6215:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__MatchingAssignment_4_1 ) ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6219:1: ( ( ( rule__Module__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6220:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6220:1: ( ( rule__Module__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6221:1: ( rule__Module__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6222:1: ( rule__Module__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6222:2: rule__Module__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl12532);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6232:1: rule__Module__Group_4__2 : rule__Module__Group_4__2__Impl ;
    public final void rule__Module__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6236:1: ( rule__Module__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6237:2: rule__Module__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__212562);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6243:1: rule__Module__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Module__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6247:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6248:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6248:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6249:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__Module__Group_4__2__Impl12590); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6268:1: rule__MetaModule__Group__0 : rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 ;
    public final void rule__MetaModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6272:1: ( rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6273:2: rule__MetaModule__Group__0__Impl rule__MetaModule__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__012627);
            rule__MetaModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__012630);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6280:1: rule__MetaModule__Group__0__Impl : ( 'meta-module' ) ;
    public final void rule__MetaModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6284:1: ( ( 'meta-module' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6285:1: ( 'meta-module' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6285:1: ( 'meta-module' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6286:1: 'meta-module'
            {
             before(grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__MetaModule__Group__0__Impl12658); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6299:1: rule__MetaModule__Group__1 : rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 ;
    public final void rule__MetaModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6303:1: ( rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6304:2: rule__MetaModule__Group__1__Impl rule__MetaModule__Group__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__112689);
            rule__MetaModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__112692);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6311:1: rule__MetaModule__Group__1__Impl : ( ( rule__MetaModule__NameAssignment_1 ) ) ;
    public final void rule__MetaModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6315:1: ( ( ( rule__MetaModule__NameAssignment_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6316:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6316:1: ( ( rule__MetaModule__NameAssignment_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6317:1: ( rule__MetaModule__NameAssignment_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getNameAssignment_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6318:1: ( rule__MetaModule__NameAssignment_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6318:2: rule__MetaModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl12719);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6328:1: rule__MetaModule__Group__2 : rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 ;
    public final void rule__MetaModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6332:1: ( rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6333:2: rule__MetaModule__Group__2__Impl rule__MetaModule__Group__3
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__212749);
            rule__MetaModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__212752);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6340:1: rule__MetaModule__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6344:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6345:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6345:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6346:1: '{'
            {
             before(grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__MetaModule__Group__2__Impl12780); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6359:1: rule__MetaModule__Group__3 : rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 ;
    public final void rule__MetaModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6363:1: ( rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6364:2: rule__MetaModule__Group__3__Impl rule__MetaModule__Group__4
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__312811);
            rule__MetaModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__312814);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6371:1: rule__MetaModule__Group__3__Impl : ( ( rule__MetaModule__Group_3__0 )? ) ;
    public final void rule__MetaModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6375:1: ( ( ( rule__MetaModule__Group_3__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6376:1: ( ( rule__MetaModule__Group_3__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6376:1: ( ( rule__MetaModule__Group_3__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6377:1: ( rule__MetaModule__Group_3__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6378:1: ( rule__MetaModule__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45||LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6378:2: rule__MetaModule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl12841);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6388:1: rule__MetaModule__Group__4 : rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 ;
    public final void rule__MetaModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6392:1: ( rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6393:2: rule__MetaModule__Group__4__Impl rule__MetaModule__Group__5
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__412872);
            rule__MetaModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__412875);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6400:1: rule__MetaModule__Group__4__Impl : ( ( rule__MetaModule__Group_4__0 )? ) ;
    public final void rule__MetaModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6404:1: ( ( ( rule__MetaModule__Group_4__0 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6405:1: ( ( rule__MetaModule__Group_4__0 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6405:1: ( ( rule__MetaModule__Group_4__0 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6406:1: ( rule__MetaModule__Group_4__0 )?
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6407:1: ( rule__MetaModule__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6407:2: rule__MetaModule__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl12902);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6417:1: rule__MetaModule__Group__5 : rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 ;
    public final void rule__MetaModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6421:1: ( rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6422:2: rule__MetaModule__Group__5__Impl rule__MetaModule__Group__6
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__512933);
            rule__MetaModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__512936);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6429:1: rule__MetaModule__Group__5__Impl : ( ( rule__MetaModule__ComponentsAssignment_5 )* ) ;
    public final void rule__MetaModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6433:1: ( ( ( rule__MetaModule__ComponentsAssignment_5 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6434:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6434:1: ( ( rule__MetaModule__ComponentsAssignment_5 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6435:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6436:1: ( rule__MetaModule__ComponentsAssignment_5 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==50||(LA50_0>=53 && LA50_0<=58)||(LA50_0>=61 && LA50_0<=65)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6436:2: rule__MetaModule__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl12963);
            	    rule__MetaModule__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6446:1: rule__MetaModule__Group__6 : rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 ;
    public final void rule__MetaModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6450:1: ( rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6451:2: rule__MetaModule__Group__6__Impl rule__MetaModule__Group__7
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__612994);
            rule__MetaModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__612997);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6458:1: rule__MetaModule__Group__6__Impl : ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) ;
    public final void rule__MetaModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6462:1: ( ( ( rule__MetaModule__RestrictionsAssignment_6 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6463:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6463:1: ( ( rule__MetaModule__RestrictionsAssignment_6 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6464:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6465:1: ( rule__MetaModule__RestrictionsAssignment_6 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==67) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6465:2: rule__MetaModule__RestrictionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl13024);
            	    rule__MetaModule__RestrictionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6475:1: rule__MetaModule__Group__7 : rule__MetaModule__Group__7__Impl ;
    public final void rule__MetaModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6479:1: ( rule__MetaModule__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6480:2: rule__MetaModule__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__713055);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6486:1: rule__MetaModule__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6490:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6491:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6491:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6492:1: '}'
            {
             before(grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_43_in_rule__MetaModule__Group__7__Impl13083); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6521:1: rule__MetaModule__Group_3__0 : rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 ;
    public final void rule__MetaModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6525:1: ( rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6526:2: rule__MetaModule__Group_3__0__Impl rule__MetaModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__013130);
            rule__MetaModule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__013133);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6533:1: rule__MetaModule__Group_3__0__Impl : ( ( rule__MetaModule__Group_3_0__0 )* ) ;
    public final void rule__MetaModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6537:1: ( ( ( rule__MetaModule__Group_3_0__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6538:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6538:1: ( ( rule__MetaModule__Group_3_0__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6539:1: ( rule__MetaModule__Group_3_0__0 )*
            {
             before(grammarAccess.getMetaModuleAccess().getGroup_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6540:1: ( rule__MetaModule__Group_3_0__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==47) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6540:2: rule__MetaModule__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl13160);
            	    rule__MetaModule__Group_3_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6550:1: rule__MetaModule__Group_3__1 : rule__MetaModule__Group_3__1__Impl ;
    public final void rule__MetaModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6554:1: ( rule__MetaModule__Group_3__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6555:2: rule__MetaModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__113191);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6561:1: rule__MetaModule__Group_3__1__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6565:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6566:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6566:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6567:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1()); 
            match(input,45,FOLLOW_45_in_rule__MetaModule__Group_3__1__Impl13219); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6584:1: rule__MetaModule__Group_3_0__0 : rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 ;
    public final void rule__MetaModule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6588:1: ( rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6589:2: rule__MetaModule__Group_3_0__0__Impl rule__MetaModule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__013254);
            rule__MetaModule__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__013257);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6596:1: rule__MetaModule__Group_3_0__0__Impl : ( 'attributes' ) ;
    public final void rule__MetaModule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6600:1: ( ( 'attributes' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6601:1: ( 'attributes' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6601:1: ( 'attributes' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6602:1: 'attributes'
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0()); 
            match(input,47,FOLLOW_47_in_rule__MetaModule__Group_3_0__0__Impl13285); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6615:1: rule__MetaModule__Group_3_0__1 : rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 ;
    public final void rule__MetaModule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6619:1: ( rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6620:2: rule__MetaModule__Group_3_0__1__Impl rule__MetaModule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__113316);
            rule__MetaModule__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__113319);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6627:1: rule__MetaModule__Group_3_0__1__Impl : ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) ;
    public final void rule__MetaModule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6631:1: ( ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6632:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6632:1: ( ( rule__MetaModule__AttributesAssignment_3_0_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6633:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAssignment_3_0_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6634:1: ( rule__MetaModule__AttributesAssignment_3_0_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6634:2: rule__MetaModule__AttributesAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl13346);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6644:1: rule__MetaModule__Group_3_0__2 : rule__MetaModule__Group_3_0__2__Impl ;
    public final void rule__MetaModule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6648:1: ( rule__MetaModule__Group_3_0__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6649:2: rule__MetaModule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__213376);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6655:1: rule__MetaModule__Group_3_0__2__Impl : ( ( ',' )? ) ;
    public final void rule__MetaModule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6659:1: ( ( ( ',' )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6660:1: ( ( ',' )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6660:1: ( ( ',' )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6661:1: ( ',' )?
            {
             before(grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6662:1: ( ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6663:2: ','
                    {
                    match(input,48,FOLLOW_48_in_rule__MetaModule__Group_3_0__2__Impl13405); 

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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6680:1: rule__MetaModule__Group_4__0 : rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 ;
    public final void rule__MetaModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6684:1: ( rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6685:2: rule__MetaModule__Group_4__0__Impl rule__MetaModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__013444);
            rule__MetaModule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__013447);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6692:1: rule__MetaModule__Group_4__0__Impl : ( 'matching' ) ;
    public final void rule__MetaModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6696:1: ( ( 'matching' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6697:1: ( 'matching' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6697:1: ( 'matching' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6698:1: 'matching'
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0()); 
            match(input,51,FOLLOW_51_in_rule__MetaModule__Group_4__0__Impl13475); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6711:1: rule__MetaModule__Group_4__1 : rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 ;
    public final void rule__MetaModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6715:1: ( rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6716:2: rule__MetaModule__Group_4__1__Impl rule__MetaModule__Group_4__2
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__113506);
            rule__MetaModule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__113509);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6723:1: rule__MetaModule__Group_4__1__Impl : ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) ;
    public final void rule__MetaModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6727:1: ( ( ( rule__MetaModule__MatchingAssignment_4_1 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6728:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6728:1: ( ( rule__MetaModule__MatchingAssignment_4_1 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6729:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingAssignment_4_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6730:1: ( rule__MetaModule__MatchingAssignment_4_1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6730:2: rule__MetaModule__MatchingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl13536);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6740:1: rule__MetaModule__Group_4__2 : rule__MetaModule__Group_4__2__Impl ;
    public final void rule__MetaModule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6744:1: ( rule__MetaModule__Group_4__2__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6745:2: rule__MetaModule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__213566);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6751:1: rule__MetaModule__Group_4__2__Impl : ( ';' ) ;
    public final void rule__MetaModule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6755:1: ( ( ';' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6756:1: ( ';' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6756:1: ( ';' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6757:1: ';'
            {
             before(grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2()); 
            match(input,45,FOLLOW_45_in_rule__MetaModule__Group_4__2__Impl13594); 
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6776:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6780:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6781:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013631);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013634);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6788:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6792:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6793:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6793:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6794:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13661); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6805:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6809:1: ( rule__QualifiedName__Group__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6810:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113690);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6816:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6820:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6821:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6821:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6822:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6823:1: ( rule__QualifiedName__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==66) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6823:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13717);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6837:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6841:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6842:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013752);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013755);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6849:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6853:1: ( ( '.' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6854:1: ( '.' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6854:1: ( '.' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6855:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13783); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6868:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6872:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6873:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113814);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6879:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID_ASML ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6883:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6884:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6884:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6885:1: RULE_ID_ASML
            {
             before(grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13841); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6900:1: rule__Restriction__Group__0 : rule__Restriction__Group__0__Impl rule__Restriction__Group__1 ;
    public final void rule__Restriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6904:1: ( rule__Restriction__Group__0__Impl rule__Restriction__Group__1 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6905:2: rule__Restriction__Group__0__Impl rule__Restriction__Group__1
            {
            pushFollow(FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013874);
            rule__Restriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013877);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6912:1: rule__Restriction__Group__0__Impl : ( 'restriction' ) ;
    public final void rule__Restriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6916:1: ( ( 'restriction' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6917:1: ( 'restriction' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6917:1: ( 'restriction' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6918:1: 'restriction'
            {
             before(grammarAccess.getRestrictionAccess().getRestrictionKeyword_0()); 
            match(input,67,FOLLOW_67_in_rule__Restriction__Group__0__Impl13905); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6931:1: rule__Restriction__Group__1 : rule__Restriction__Group__1__Impl rule__Restriction__Group__2 ;
    public final void rule__Restriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6935:1: ( rule__Restriction__Group__1__Impl rule__Restriction__Group__2 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6936:2: rule__Restriction__Group__1__Impl rule__Restriction__Group__2
            {
            pushFollow(FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113936);
            rule__Restriction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113939);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6943:1: rule__Restriction__Group__1__Impl : ( '{' ) ;
    public final void rule__Restriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6947:1: ( ( '{' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6948:1: ( '{' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6948:1: ( '{' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6949:1: '{'
            {
             before(grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Restriction__Group__1__Impl13967); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6962:1: rule__Restriction__Group__2 : rule__Restriction__Group__2__Impl rule__Restriction__Group__3 ;
    public final void rule__Restriction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6966:1: ( rule__Restriction__Group__2__Impl rule__Restriction__Group__3 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6967:2: rule__Restriction__Group__2__Impl rule__Restriction__Group__3
            {
            pushFollow(FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213998);
            rule__Restriction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__214001);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6974:1: rule__Restriction__Group__2__Impl : ( ( rule__Restriction__GroupClauseAssignment_2 )? ) ;
    public final void rule__Restriction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6978:1: ( ( ( rule__Restriction__GroupClauseAssignment_2 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6979:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6979:1: ( ( rule__Restriction__GroupClauseAssignment_2 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6980:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseAssignment_2()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6981:1: ( rule__Restriction__GroupClauseAssignment_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=24 && LA55_0<=27)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6981:2: rule__Restriction__GroupClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl14028);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6991:1: rule__Restriction__Group__3 : rule__Restriction__Group__3__Impl rule__Restriction__Group__4 ;
    public final void rule__Restriction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6995:1: ( rule__Restriction__Group__3__Impl rule__Restriction__Group__4 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:6996:2: rule__Restriction__Group__3__Impl rule__Restriction__Group__4
            {
            pushFollow(FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__314059);
            rule__Restriction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__314062);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7003:1: rule__Restriction__Group__3__Impl : ( ( rule__Restriction__ComponentAAssignment_3 )* ) ;
    public final void rule__Restriction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7007:1: ( ( ( rule__Restriction__ComponentAAssignment_3 )* ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7008:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7008:1: ( ( rule__Restriction__ComponentAAssignment_3 )* )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7009:1: ( rule__Restriction__ComponentAAssignment_3 )*
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAssignment_3()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7010:1: ( rule__Restriction__ComponentAAssignment_3 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID_ASML) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7010:2: rule__Restriction__ComponentAAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl14089);
            	    rule__Restriction__ComponentAAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7020:1: rule__Restriction__Group__4 : rule__Restriction__Group__4__Impl rule__Restriction__Group__5 ;
    public final void rule__Restriction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7024:1: ( rule__Restriction__Group__4__Impl rule__Restriction__Group__5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7025:2: rule__Restriction__Group__4__Impl rule__Restriction__Group__5
            {
            pushFollow(FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__414120);
            rule__Restriction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__414123);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7032:1: rule__Restriction__Group__4__Impl : ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) ;
    public final void rule__Restriction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7036:1: ( ( ( rule__Restriction__PermissionClauseAssignment_4 )? ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7037:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7037:1: ( ( rule__Restriction__PermissionClauseAssignment_4 )? )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7038:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClauseAssignment_4()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7039:1: ( rule__Restriction__PermissionClauseAssignment_4 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==24||(LA57_0>=28 && LA57_0<=30)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7039:2: rule__Restriction__PermissionClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl14150);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7049:1: rule__Restriction__Group__5 : rule__Restriction__Group__5__Impl rule__Restriction__Group__6 ;
    public final void rule__Restriction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7053:1: ( rule__Restriction__Group__5__Impl rule__Restriction__Group__6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7054:2: rule__Restriction__Group__5__Impl rule__Restriction__Group__6
            {
            pushFollow(FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__514181);
            rule__Restriction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__514184);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7061:1: rule__Restriction__Group__5__Impl : ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) ;
    public final void rule__Restriction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7065:1: ( ( ( rule__Restriction__RelactionTypeAssignment_5 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7066:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7066:1: ( ( rule__Restriction__RelactionTypeAssignment_5 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7067:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeAssignment_5()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7068:1: ( rule__Restriction__RelactionTypeAssignment_5 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7068:2: rule__Restriction__RelactionTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl14211);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7078:1: rule__Restriction__Group__6 : rule__Restriction__Group__6__Impl rule__Restriction__Group__7 ;
    public final void rule__Restriction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7082:1: ( rule__Restriction__Group__6__Impl rule__Restriction__Group__7 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7083:2: rule__Restriction__Group__6__Impl rule__Restriction__Group__7
            {
            pushFollow(FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__614241);
            rule__Restriction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__614244);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7090:1: rule__Restriction__Group__6__Impl : ( ( rule__Restriction__ComponentBAssignment_6 ) ) ;
    public final void rule__Restriction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7094:1: ( ( ( rule__Restriction__ComponentBAssignment_6 ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7095:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7095:1: ( ( rule__Restriction__ComponentBAssignment_6 ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7096:1: ( rule__Restriction__ComponentBAssignment_6 )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAssignment_6()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7097:1: ( rule__Restriction__ComponentBAssignment_6 )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7097:2: rule__Restriction__ComponentBAssignment_6
            {
            pushFollow(FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl14271);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7107:1: rule__Restriction__Group__7 : rule__Restriction__Group__7__Impl ;
    public final void rule__Restriction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7111:1: ( rule__Restriction__Group__7__Impl )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7112:2: rule__Restriction__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__714301);
            rule__Restriction__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7118:1: rule__Restriction__Group__7__Impl : ( '}' ) ;
    public final void rule__Restriction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7122:1: ( ( '}' ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7123:1: ( '}' )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7123:1: ( '}' )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7124:1: '}'
            {
             before(grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_43_in_rule__Restriction__Group__7__Impl14329); 
             after(grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ASMLModel__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7154:1: rule__ASMLModel__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__ASMLModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7158:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7159:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7159:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7160:1: RULE_ID_ASML
            {
             before(grammarAccess.getASMLModelAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114381); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7169:1: rule__ASMLModel__ImportURIAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ASMLModel__ImportURIAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7173:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7174:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7174:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7175:1: RULE_STRING
            {
             before(grammarAccess.getASMLModelAccess().getImportURISTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114412); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7184:1: rule__ASMLModel__ViewsAssignment_4 : ( ruleView ) ;
    public final void rule__ASMLModel__ViewsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7188:1: ( ( ruleView ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7189:1: ( ruleView )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7189:1: ( ruleView )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7190:1: ruleView
            {
             before(grammarAccess.getASMLModelAccess().getViewsViewParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414443);
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


    // $ANTLR start "rule__View__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7199:1: rule__View__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__View__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7203:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7204:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7204:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7205:1: RULE_ID_ASML
            {
             before(grammarAccess.getViewAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114474); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7214:1: rule__View__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__View__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7218:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7219:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7219:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7220:1: ruleAttribute
            {
             before(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114505);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7229:1: rule__View__ComponentsAssignment_4 : ( ruleAbstractComponent ) ;
    public final void rule__View__ComponentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7233:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7234:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7234:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7235:1: ruleAbstractComponent
            {
             before(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414536);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7244:1: rule__View__RestrictionsAssignment_5 : ( ruleRestriction ) ;
    public final void rule__View__RestrictionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7248:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7249:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7249:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7250:1: ruleRestriction
            {
             before(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514567);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7259:1: rule__Attribute__NameAssignment_0 : ( RULE_ID_ASML ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7263:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7264:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7264:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7265:1: RULE_ID_ASML
            {
             before(grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014598); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7274:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7278:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7279:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7279:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7280:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214629); 
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


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7289:1: rule__Component__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7293:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7294:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7294:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7295:1: RULE_ID_ASML
            {
             before(grammarAccess.getComponentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Component__NameAssignment_114660); 
             after(grammarAccess.getComponentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7304:1: rule__Component__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Component__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7308:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7309:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7309:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7310:1: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Component__MatchingAssignment_3_114691); 
             after(grammarAccess.getComponentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__MatchingAssignment_3_1"


    // $ANTLR start "rule__Component__CardinalityAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7319:1: rule__Component__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Component__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7323:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7324:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7324:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7325:1: ruleCardinality
            {
             before(grammarAccess.getComponentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Component__CardinalityAssignment_4_114722);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CardinalityAssignment_4_1"


    // $ANTLR start "rule__Component__ComponentsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7334:1: rule__Component__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__Component__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7338:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7339:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7339:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7340:1: ruleAbstractComponent
            {
             before(grammarAccess.getComponentAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__Component__ComponentsAssignment_514753);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentsAssignment_5"


    // $ANTLR start "rule__Component__RestrictionsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7349:1: rule__Component__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__Component__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7353:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7354:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7354:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7355:1: ruleRestriction
            {
             before(grammarAccess.getComponentAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Component__RestrictionsAssignment_614784);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RestrictionsAssignment_6"


    // $ANTLR start "rule__FrameworkInstantiation__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7364:1: rule__FrameworkInstantiation__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__FrameworkInstantiation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7368:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7369:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7369:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7370:1: RULE_ID_ASML
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__FrameworkInstantiation__NameAssignment_114815); 
             after(grammarAccess.getFrameworkInstantiationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__NameAssignment_1"


    // $ANTLR start "rule__FrameworkInstantiation__ComponentsAssignment_3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7379:1: rule__FrameworkInstantiation__ComponentsAssignment_3 : ( ruleAbstractComponent ) ;
    public final void rule__FrameworkInstantiation__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7383:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7384:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7384:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7385:1: ruleAbstractComponent
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getComponentsAbstractComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__FrameworkInstantiation__ComponentsAssignment_314846);
            ruleAbstractComponent();

            state._fsp--;

             after(grammarAccess.getFrameworkInstantiationAccess().getComponentsAbstractComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__ComponentsAssignment_3"


    // $ANTLR start "rule__FrameworkInstantiation__RestrictionsAssignment_4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7394:1: rule__FrameworkInstantiation__RestrictionsAssignment_4 : ( ruleRestriction ) ;
    public final void rule__FrameworkInstantiation__RestrictionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7398:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7399:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7399:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7400:1: ruleRestriction
            {
             before(grammarAccess.getFrameworkInstantiationAccess().getRestrictionsRestrictionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__FrameworkInstantiation__RestrictionsAssignment_414877);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getFrameworkInstantiationAccess().getRestrictionsRestrictionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkInstantiation__RestrictionsAssignment_4"


    // $ANTLR start "rule__FrameworkClass__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7409:1: rule__FrameworkClass__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__FrameworkClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7413:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7414:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7414:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7415:1: RULE_ID_ASML
            {
             before(grammarAccess.getFrameworkClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__FrameworkClass__NameAssignment_114908); 
             after(grammarAccess.getFrameworkClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__NameAssignment_1"


    // $ANTLR start "rule__FrameworkClass__JavaCLassAssignment_3"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7424:1: rule__FrameworkClass__JavaCLassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FrameworkClass__JavaCLassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7428:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7429:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7429:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7430:1: RULE_STRING
            {
             before(grammarAccess.getFrameworkClassAccess().getJavaCLassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FrameworkClass__JavaCLassAssignment_314939); 
             after(grammarAccess.getFrameworkClassAccess().getJavaCLassSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkClass__JavaCLassAssignment_3"


    // $ANTLR start "rule__LayerMatching__LayerMatchingAssignment_0"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7441:1: rule__LayerMatching__LayerMatchingAssignment_0 : ( ruleLayerMatchingClause ) ;
    public final void rule__LayerMatching__LayerMatchingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7445:1: ( ( ruleLayerMatchingClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7446:1: ( ruleLayerMatchingClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7446:1: ( ruleLayerMatchingClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7447:1: ruleLayerMatchingClause
            {
             before(grammarAccess.getLayerMatchingAccess().getLayerMatchingLayerMatchingClauseEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLayerMatchingClause_in_rule__LayerMatching__LayerMatchingAssignment_014972);
            ruleLayerMatchingClause();

            state._fsp--;

             after(grammarAccess.getLayerMatchingAccess().getLayerMatchingLayerMatchingClauseEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__LayerMatchingAssignment_0"


    // $ANTLR start "rule__LayerMatching__ParameterAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7456:1: rule__LayerMatching__ParameterAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__LayerMatching__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7460:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7461:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7461:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7462:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentCrossReference_1_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7463:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7464:1: ruleQualifiedName
            {
             before(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__LayerMatching__ParameterAssignment_115007);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayerMatching__ParameterAssignment_1"


    // $ANTLR start "rule__ModuleMatching__ParameterAssignment"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7475:1: rule__ModuleMatching__ParameterAssignment : ( ruleModuleMatchingParamenter ) ;
    public final void rule__ModuleMatching__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7479:1: ( ( ruleModuleMatchingParamenter ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7480:1: ( ruleModuleMatchingParamenter )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7480:1: ( ruleModuleMatchingParamenter )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7481:1: ruleModuleMatchingParamenter
            {
             before(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment15042);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7490:1: rule__ClassMatching__ExpressionMatchingAssignment_0 : ( ruleExpressionMatchingClause ) ;
    public final void rule__ClassMatching__ExpressionMatchingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7494:1: ( ( ruleExpressionMatchingClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7495:1: ( ruleExpressionMatchingClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7495:1: ( ruleExpressionMatchingClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7496:1: ruleExpressionMatchingClause
            {
             before(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_015073);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7505:1: rule__ClassMatching__ParameterAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassMatching__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7509:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7510:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7510:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7511:1: RULE_STRING
            {
             before(grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_115104); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7520:1: rule__File__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7524:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7525:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7525:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7526:1: RULE_ID_ASML
            {
             before(grammarAccess.getFileAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_115135); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7535:1: rule__File__MatchingAssignment_3_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__File__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7539:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7540:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7540:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7541:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_115166);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7550:1: rule__File__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__File__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7554:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7555:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7555:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7556:1: ruleCardinality
            {
             before(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_115197);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7565:1: rule__Configuration__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7569:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7570:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7570:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7571:1: RULE_ID_ASML
            {
             before(grammarAccess.getConfigurationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_115228); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7580:1: rule__Configuration__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Configuration__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7584:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7585:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7585:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7586:1: RULE_STRING
            {
             before(grammarAccess.getConfigurationAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_115259); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7595:1: rule__Configuration__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Configuration__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7599:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7600:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7600:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7601:1: ruleCardinality
            {
             before(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_115290);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7610:1: rule__Configuration__ConfigurationElementAssignment_5 : ( ruleConfigurationElement ) ;
    public final void rule__Configuration__ConfigurationElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7614:1: ( ( ruleConfigurationElement ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7615:1: ( ruleConfigurationElement )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7615:1: ( ruleConfigurationElement )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7616:1: ruleConfigurationElement
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_515321);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7625:1: rule__Method__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7629:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7630:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7630:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7631:1: RULE_ID_ASML
            {
             before(grammarAccess.getMethodAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_115352); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7640:1: rule__Method__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Method__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7644:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7645:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7645:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7646:1: RULE_STRING
            {
             before(grammarAccess.getMethodAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_115383); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7655:1: rule__Method__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__Method__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7659:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7660:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7660:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7661:1: ruleCardinality
            {
             before(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_115414);
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


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7670:1: rule__Class__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7674:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7675:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7675:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7676:1: RULE_ID_ASML
            {
             before(grammarAccess.getClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Class__NameAssignment_115445); 
             after(grammarAccess.getClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__DescriptionAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7685:1: rule__Class__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Class__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7689:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7690:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7690:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7691:1: RULE_STRING
            {
             before(grammarAccess.getClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Class__DescriptionAssignment_3_115476); 
             after(grammarAccess.getClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Class__MatchingAssignment_4_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7700:1: rule__Class__MatchingAssignment_4_1 : ( ruleAbstractNameConvetion ) ;
    public final void rule__Class__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7704:1: ( ( ruleAbstractNameConvetion ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7705:1: ( ruleAbstractNameConvetion )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7705:1: ( ruleAbstractNameConvetion )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7706:1: ruleAbstractNameConvetion
            {
             before(grammarAccess.getClassAccess().getMatchingAbstractNameConvetionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_rule__Class__MatchingAssignment_4_115507);
            ruleAbstractNameConvetion();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMatchingAbstractNameConvetionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MatchingAssignment_4_1"


    // $ANTLR start "rule__Class__CardinalityAssignment_5_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7715:1: rule__Class__CardinalityAssignment_5_1 : ( ruleCardinality ) ;
    public final void rule__Class__CardinalityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7719:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7720:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7720:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7721:1: ruleCardinality
            {
             before(grammarAccess.getClassAccess().getCardinalityCardinalityEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Class__CardinalityAssignment_5_115538);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getClassAccess().getCardinalityCardinalityEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__CardinalityAssignment_5_1"


    // $ANTLR start "rule__Class__MethodsAssignment_6"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7730:1: rule__Class__MethodsAssignment_6 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7734:1: ( ( ruleMethod ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7735:1: ( ruleMethod )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7735:1: ( ruleMethod )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7736:1: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMethod_in_rule__Class__MethodsAssignment_615569);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_6"


    // $ANTLR start "rule__XmlElement__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7745:1: rule__XmlElement__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7749:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7750:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7750:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7751:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlElementAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_115600); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7760:1: rule__XmlElement__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlElement__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7764:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7765:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7765:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7766:1: RULE_STRING
            {
             before(grammarAccess.getXmlElementAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115631); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7775:1: rule__XmlElement__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlElement__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7779:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7780:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7780:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7781:1: ruleCardinality
            {
             before(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115662);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7790:1: rule__XmlDocument__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__XmlDocument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7794:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7795:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7795:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7796:1: RULE_ID_ASML
            {
             before(grammarAccess.getXmlDocumentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115693); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7805:1: rule__XmlDocument__MatchingAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__XmlDocument__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7809:1: ( ( RULE_STRING ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7810:1: ( RULE_STRING )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7810:1: ( RULE_STRING )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7811:1: RULE_STRING
            {
             before(grammarAccess.getXmlDocumentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115724); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7820:1: rule__XmlDocument__CardinalityAssignment_4_1 : ( ruleCardinality ) ;
    public final void rule__XmlDocument__CardinalityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7824:1: ( ( ruleCardinality ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7825:1: ( ruleCardinality )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7825:1: ( ruleCardinality )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7826:1: ruleCardinality
            {
             before(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115755);
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


    // $ANTLR start "rule__Layer__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7835:1: rule__Layer__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Layer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7839:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7840:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7840:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7841:1: RULE_ID_ASML
            {
             before(grammarAccess.getLayerAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Layer__NameAssignment_115786); 
             after(grammarAccess.getLayerAccess().getNameID_ASMLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__NameAssignment_1"


    // $ANTLR start "rule__Layer__MatchingAssignment_3_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7850:1: rule__Layer__MatchingAssignment_3_1 : ( ruleLayerMatching ) ;
    public final void rule__Layer__MatchingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7854:1: ( ( ruleLayerMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7855:1: ( ruleLayerMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7855:1: ( ruleLayerMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7856:1: ruleLayerMatching
            {
             before(grammarAccess.getLayerAccess().getMatchingLayerMatchingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLayerMatching_in_rule__Layer__MatchingAssignment_3_115817);
            ruleLayerMatching();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getMatchingLayerMatchingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__MatchingAssignment_3_1"


    // $ANTLR start "rule__Layer__ModulesAssignment_4"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7865:1: rule__Layer__ModulesAssignment_4 : ( ruleModule ) ;
    public final void rule__Layer__ModulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7869:1: ( ( ruleModule ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7870:1: ( ruleModule )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7870:1: ( ruleModule )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7871:1: ruleModule
            {
             before(grammarAccess.getLayerAccess().getModulesModuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Layer__ModulesAssignment_415848);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getModulesModuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__ModulesAssignment_4"


    // $ANTLR start "rule__Layer__RestrictionsAssignment_5"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7880:1: rule__Layer__RestrictionsAssignment_5 : ( ruleRestriction ) ;
    public final void rule__Layer__RestrictionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7884:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7885:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7885:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7886:1: ruleRestriction
            {
             before(grammarAccess.getLayerAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Layer__RestrictionsAssignment_515879);
            ruleRestriction();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__RestrictionsAssignment_5"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7895:1: rule__Module__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7899:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7900:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7900:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7901:1: RULE_ID_ASML
            {
             before(grammarAccess.getModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115910); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7910:1: rule__Module__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__Module__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7914:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7915:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7915:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7916:1: ruleAttribute
            {
             before(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115941);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7925:1: rule__Module__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__Module__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7929:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7930:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7930:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7931:1: ruleModuleMatching
            {
             before(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115972);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7940:1: rule__Module__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__Module__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7944:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7945:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7945:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7946:1: ruleAbstractComponent
            {
             before(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_516003);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7955:1: rule__Module__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__Module__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7959:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7960:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7960:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7961:1: ruleRestriction
            {
             before(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_616034);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7970:1: rule__MetaModule__NameAssignment_1 : ( RULE_ID_ASML ) ;
    public final void rule__MetaModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7974:1: ( ( RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7975:1: ( RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7975:1: ( RULE_ID_ASML )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7976:1: RULE_ID_ASML
            {
             before(grammarAccess.getMetaModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_116065); 
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7985:1: rule__MetaModule__AttributesAssignment_3_0_1 : ( ruleAttribute ) ;
    public final void rule__MetaModule__AttributesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7989:1: ( ( ruleAttribute ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7990:1: ( ruleAttribute )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7990:1: ( ruleAttribute )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:7991:1: ruleAttribute
            {
             before(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_116096);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8000:1: rule__MetaModule__MatchingAssignment_4_1 : ( ruleModuleMatching ) ;
    public final void rule__MetaModule__MatchingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8004:1: ( ( ruleModuleMatching ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8005:1: ( ruleModuleMatching )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8005:1: ( ruleModuleMatching )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8006:1: ruleModuleMatching
            {
             before(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_116127);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8015:1: rule__MetaModule__ComponentsAssignment_5 : ( ruleAbstractComponent ) ;
    public final void rule__MetaModule__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8019:1: ( ( ruleAbstractComponent ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8020:1: ( ruleAbstractComponent )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8020:1: ( ruleAbstractComponent )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8021:1: ruleAbstractComponent
            {
             before(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_516158);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8030:1: rule__MetaModule__RestrictionsAssignment_6 : ( ruleRestriction ) ;
    public final void rule__MetaModule__RestrictionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8034:1: ( ( ruleRestriction ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8035:1: ( ruleRestriction )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8035:1: ( ruleRestriction )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8036:1: ruleRestriction
            {
             before(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_616189);
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


    // $ANTLR start "rule__Restriction__GroupClauseAssignment_2"
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8045:1: rule__Restriction__GroupClauseAssignment_2 : ( ruleGroupClause ) ;
    public final void rule__Restriction__GroupClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8049:1: ( ( ruleGroupClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8050:1: ( ruleGroupClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8050:1: ( ruleGroupClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8051:1: ruleGroupClause
            {
             before(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_216220);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8060:1: rule__Restriction__ComponentAAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentAAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8064:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8065:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8065:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8066:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8067:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8068:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_316255);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8079:1: rule__Restriction__PermissionClauseAssignment_4 : ( rulePermissionClause ) ;
    public final void rule__Restriction__PermissionClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8083:1: ( ( rulePermissionClause ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8084:1: ( rulePermissionClause )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8084:1: ( rulePermissionClause )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8085:1: rulePermissionClause
            {
             before(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_416290);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8094:1: rule__Restriction__RelactionTypeAssignment_5 : ( ruleRelactionType ) ;
    public final void rule__Restriction__RelactionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8098:1: ( ( ruleRelactionType ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8099:1: ( ruleRelactionType )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8099:1: ( ruleRelactionType )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8100:1: ruleRelactionType
            {
             before(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_516321);
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
    // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8109:1: rule__Restriction__ComponentBAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Restriction__ComponentBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8113:1: ( ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8114:1: ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8114:1: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8115:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8116:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml.ui/src-gen/br/ufmg/dcc/asml/ui/contentassist/antlr/internal/InternalASMLModel.g:8117:1: ruleQualifiedName
            {
             before(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_616356);
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
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkInstantiation_in_entryRuleFrameworkInstantiation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameworkInstantiation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__0_in_ruleFrameworkInstantiation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkClass_in_entryRuleFrameworkClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameworkClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__0_in_ruleFrameworkClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerMatching_in_entryRuleLayerMatching543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayerMatching550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatching__Group__0_in_ruleLayerMatching576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleMatching610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleMatching__ParameterAssignment_in_ruleModuleMatching636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_entryRuleClassMatching663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMatching670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__0_in_ruleClassMatching696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConfigurationElement__Alternatives_in_ruleConfigurationElement756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__0_in_ruleXmlElement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlDocument1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__0_in_ruleXmlDocument1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0_in_ruleLayer1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_entryRuleMetaModule1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModule1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__0_in_ruleMetaModule1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0_in_ruleRestriction1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionMatchingClause__Alternatives_in_ruleExpressionMatchingClause1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatchingClause__Alternatives_in_ruleLayerMatchingClause1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleMatchingParamenter__Alternatives_in_ruleModuleMatchingParamenter1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupClause__Alternatives_in_ruleGroupClause1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PermissionClause__Alternatives_in_rulePermissionClause1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelactionType__Alternatives_in_ruleRelactionType1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_rule__AbstractComponent__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__AbstractComponent__Alternatives1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_rule__AbstractComponent__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__AbstractComponent__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__AbstractComponent__Alternatives1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__AbstractComponent__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__AbstractComponent__Alternatives1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkInstantiation_in_rule__AbstractComponent__Alternatives1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkClass_in_rule__AbstractComponent__Alternatives1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AbstractNameConvetion__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_rule__AbstractNameConvetion__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_rule__ConfigurationElement__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_rule__ConfigurationElement__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_rule__ConfigurationElement__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__ConfigurationElement__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cardinality__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cardinality__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExpressionMatchingClause__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExpressionMatchingClause__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LayerMatchingClause__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LayerMatchingClause__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ModuleMatchingParamenter__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ModuleMatchingParamenter__Alternatives2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModuleMatchingParamenter__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModuleMatchingParamenter__Alternatives2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GroupClause__Alternatives2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GroupClause__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GroupClause__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GroupClause__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PermissionClause__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PermissionClause__Alternatives2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PermissionClause__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PermissionClause__Alternatives2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelactionType__Alternatives2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RelactionType__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RelactionType__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RelactionType__Alternatives2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RelactionType__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelactionType__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RelactionType__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RelactionType__Alternatives2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RelactionType__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RelactionType__Alternatives2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__0__Impl_in_rule__ASMLModel__Group__02738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1_in_rule__ASMLModel__Group__02741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ASMLModel__Group__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__1__Impl_in_rule__ASMLModel__Group__12800 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2_in_rule__ASMLModel__Group__12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__NameAssignment_1_in_rule__ASMLModel__Group__1__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__2__Impl_in_rule__ASMLModel__Group__22860 = new BitSet(new long[]{0x0000580000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3_in_rule__ASMLModel__Group__22863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ASMLModel__Group__2__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__3__Impl_in_rule__ASMLModel__Group__32922 = new BitSet(new long[]{0x0000580000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4_in_rule__ASMLModel__Group__32925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0_in_rule__ASMLModel__Group__3__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__4__Impl_in_rule__ASMLModel__Group__42983 = new BitSet(new long[]{0x0000580000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5_in_rule__ASMLModel__Group__42986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ViewsAssignment_4_in_rule__ASMLModel__Group__4__Impl3013 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group__5__Impl_in_rule__ASMLModel__Group__53044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ASMLModel__Group__5__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__0__Impl_in_rule__ASMLModel__Group_3__03115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1_in_rule__ASMLModel__Group_3__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ASMLModel__Group_3__0__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__1__Impl_in_rule__ASMLModel__Group_3__13177 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2_in_rule__ASMLModel__Group_3__13180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__ImportURIAssignment_3_1_in_rule__ASMLModel__Group_3__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ASMLModel__Group_3__2__Impl_in_rule__ASMLModel__Group_3__23237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ASMLModel__Group_3__2__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__03302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__03305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__View__Group__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__13364 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__13367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_1_in_rule__View__Group__1__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__23424 = new BitSet(new long[]{0xE7E4A80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__View__Group__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__33486 = new BitSet(new long[]{0xE7E4A80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__33489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0_in_rule__View__Group__3__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__43547 = new BitSet(new long[]{0xE7E4A80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__5_in_rule__View__Group__43550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ComponentsAssignment_4_in_rule__View__Group__4__Impl3577 = new BitSet(new long[]{0xE7E4000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__View__Group__5__Impl_in_rule__View__Group__53608 = new BitSet(new long[]{0xE7E4A80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__View__Group__6_in_rule__View__Group__53611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__RestrictionsAssignment_5_in_rule__View__Group__5__Impl3638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__View__Group__6__Impl_in_rule__View__Group__63669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__View__Group__6__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__0__Impl_in_rule__View__Group_3__03742 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3__1_in_rule__View__Group_3__03745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0_in_rule__View__Group_3__0__Impl3772 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3__1__Impl_in_rule__View__Group_3__13803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__View__Group_3__1__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__0__Impl_in_rule__View__Group_3_0__03866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1_in_rule__View__Group_3_0__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__View__Group_3_0__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__1__Impl_in_rule__View__Group_3_0__13928 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2_in_rule__View__Group_3_0__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__AttributesAssignment_3_0_1_in_rule__View__Group_3_0__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group_3_0__2__Impl_in_rule__View__Group_3_0__23988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__View__Group_3_0__2__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04056 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Attribute__Group__1__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__04241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__04244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Component__Group__0__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__14303 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__14306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__24363 = new BitSet(new long[]{0xE7FC080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__24366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Component__Group__2__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__34425 = new BitSet(new long[]{0xE7FC080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__34428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__0_in_rule__Component__Group__3__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__44486 = new BitSet(new long[]{0xE7FC080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__44489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__54547 = new BitSet(new long[]{0xE7FC080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__54550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ComponentsAssignment_5_in_rule__Component__Group__5__Impl4577 = new BitSet(new long[]{0xE7E4000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__64608 = new BitSet(new long[]{0xE7FC080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__64611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__RestrictionsAssignment_6_in_rule__Component__Group__6__Impl4638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__74669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Component__Group__7__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__0__Impl_in_rule__Component__Group_3__04744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group_3__1_in_rule__Component__Group_3__04747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Component__Group_3__0__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__1__Impl_in_rule__Component__Group_3__14806 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Component__Group_3__2_in_rule__Component__Group_3__14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__MatchingAssignment_3_1_in_rule__Component__Group_3__1__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__2__Impl_in_rule__Component__Group_3__24866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Component__Group_3__2__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__04931 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Component__Group_4__0__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__14993 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Component__Group_4__2_in_rule__Component__Group_4__14996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__CardinalityAssignment_4_1_in_rule__Component__Group_4__1__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__2__Impl_in_rule__Component__Group_4__25053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Component__Group_4__2__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__0__Impl_in_rule__FrameworkInstantiation__Group__05118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__1_in_rule__FrameworkInstantiation__Group__05121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FrameworkInstantiation__Group__0__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__1__Impl_in_rule__FrameworkInstantiation__Group__15180 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__2_in_rule__FrameworkInstantiation__Group__15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__NameAssignment_1_in_rule__FrameworkInstantiation__Group__1__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__2__Impl_in_rule__FrameworkInstantiation__Group__25240 = new BitSet(new long[]{0xE7E4080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__3_in_rule__FrameworkInstantiation__Group__25243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FrameworkInstantiation__Group__2__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__3__Impl_in_rule__FrameworkInstantiation__Group__35302 = new BitSet(new long[]{0xE7E4080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__4_in_rule__FrameworkInstantiation__Group__35305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__ComponentsAssignment_3_in_rule__FrameworkInstantiation__Group__3__Impl5332 = new BitSet(new long[]{0xE7E4000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__4__Impl_in_rule__FrameworkInstantiation__Group__45363 = new BitSet(new long[]{0xE7E4080000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__5_in_rule__FrameworkInstantiation__Group__45366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__RestrictionsAssignment_4_in_rule__FrameworkInstantiation__Group__4__Impl5393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__FrameworkInstantiation__Group__5__Impl_in_rule__FrameworkInstantiation__Group__55424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FrameworkInstantiation__Group__5__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__0__Impl_in_rule__FrameworkClass__Group__05495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__1_in_rule__FrameworkClass__Group__05498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FrameworkClass__Group__0__Impl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__1__Impl_in_rule__FrameworkClass__Group__15557 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__2_in_rule__FrameworkClass__Group__15560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__NameAssignment_1_in_rule__FrameworkClass__Group__1__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__2__Impl_in_rule__FrameworkClass__Group__25617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__3_in_rule__FrameworkClass__Group__25620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FrameworkClass__Group__2__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__3__Impl_in_rule__FrameworkClass__Group__35679 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__4_in_rule__FrameworkClass__Group__35682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__JavaCLassAssignment_3_in_rule__FrameworkClass__Group__3__Impl5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__4__Impl_in_rule__FrameworkClass__Group__45739 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__5_in_rule__FrameworkClass__Group__45742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FrameworkClass__Group__4__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FrameworkClass__Group__5__Impl_in_rule__FrameworkClass__Group__55801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FrameworkClass__Group__5__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatching__Group__0__Impl_in_rule__LayerMatching__Group__05872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LayerMatching__Group__1_in_rule__LayerMatching__Group__05875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatching__LayerMatchingAssignment_0_in_rule__LayerMatching__Group__0__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatching__Group__1__Impl_in_rule__LayerMatching__Group__15932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LayerMatching__ParameterAssignment_1_in_rule__LayerMatching__Group__1__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__0__Impl_in_rule__ClassMatching__Group__05993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1_in_rule__ClassMatching__Group__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ExpressionMatchingAssignment_0_in_rule__ClassMatching__Group__0__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__Group__1__Impl_in_rule__ClassMatching__Group__16053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassMatching__ParameterAssignment_1_in_rule__ClassMatching__Group__1__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__06114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__06117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__File__Group__0__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__16176 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__26236 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__26239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__File__Group__2__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__36298 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__File__Group__4_in_rule__File__Group__36301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__46359 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__File__Group__5_in_rule__File__Group__46362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0_in_rule__File__Group__4__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__5__Impl_in_rule__File__Group__56420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__File__Group__5__Impl6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__06491 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__06494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__File__Group_3__0__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__16553 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__16556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__MatchingAssignment_3_1_in_rule__File__Group_3__1__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__26613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__File__Group_3__2__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__0__Impl_in_rule__File__Group_4__06678 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__File__Group_4__1_in_rule__File__Group_4__06681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__File__Group_4__0__Impl6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__1__Impl_in_rule__File__Group_4__16740 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__File__Group_4__2_in_rule__File__Group_4__16743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__CardinalityAssignment_4_1_in_rule__File__Group_4__1__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_4__2__Impl_in_rule__File__Group_4__26800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__File__Group_4__2__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__06865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__06868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Configuration__Group__0__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__16927 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__16930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__NameAssignment_1_in_rule__Configuration__Group__1__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__26987 = new BitSet(new long[]{0x6198080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3_in_rule__Configuration__Group__26990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Configuration__Group__2__Impl7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__3__Impl_in_rule__Configuration__Group__37049 = new BitSet(new long[]{0x6198080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4_in_rule__Configuration__Group__37052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0_in_rule__Configuration__Group__3__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__4__Impl_in_rule__Configuration__Group__47110 = new BitSet(new long[]{0x6198080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5_in_rule__Configuration__Group__47113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0_in_rule__Configuration__Group__4__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__5__Impl_in_rule__Configuration__Group__57171 = new BitSet(new long[]{0x6198080000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6_in_rule__Configuration__Group__57174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__ConfigurationElementAssignment_5_in_rule__Configuration__Group__5__Impl7201 = new BitSet(new long[]{0x6180000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group__6__Impl_in_rule__Configuration__Group__67232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Configuration__Group__6__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__0__Impl_in_rule__Configuration__Group_3__07305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1_in_rule__Configuration__Group_3__07308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Configuration__Group_3__0__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__1__Impl_in_rule__Configuration__Group_3__17367 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2_in_rule__Configuration__Group_3__17370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__MatchingAssignment_3_1_in_rule__Configuration__Group_3__1__Impl7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_3__2__Impl_in_rule__Configuration__Group_3__27427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Configuration__Group_3__2__Impl7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__0__Impl_in_rule__Configuration__Group_4__07492 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1_in_rule__Configuration__Group_4__07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Configuration__Group_4__0__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__1__Impl_in_rule__Configuration__Group_4__17554 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2_in_rule__Configuration__Group_4__17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__CardinalityAssignment_4_1_in_rule__Configuration__Group_4__1__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Configuration__Group_4__2__Impl_in_rule__Configuration__Group_4__27614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Configuration__Group_4__2__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__07679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__07682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Method__Group__0__Impl7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__17741 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__2_in_rule__Method__Group__17744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__2__Impl_in_rule__Method__Group__27801 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__3_in_rule__Method__Group__27804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Method__Group__2__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__3__Impl_in_rule__Method__Group__37863 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__4_in_rule__Method__Group__37866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0_in_rule__Method__Group__3__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__4__Impl_in_rule__Method__Group__47924 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__Method__Group__5_in_rule__Method__Group__47927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0_in_rule__Method__Group__4__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__5__Impl_in_rule__Method__Group__57985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Method__Group__5__Impl8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__0__Impl_in_rule__Method__Group_3__08056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1_in_rule__Method__Group_3__08059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Method__Group_3__0__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__1__Impl_in_rule__Method__Group_3__18118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2_in_rule__Method__Group_3__18121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__MatchingAssignment_3_1_in_rule__Method__Group_3__1__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_3__2__Impl_in_rule__Method__Group_3__28178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Method__Group_3__2__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__0__Impl_in_rule__Method__Group_4__08243 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1_in_rule__Method__Group_4__08246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Method__Group_4__0__Impl8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__1__Impl_in_rule__Method__Group_4__18305 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2_in_rule__Method__Group_4__18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__CardinalityAssignment_4_1_in_rule__Method__Group_4__1__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group_4__2__Impl_in_rule__Method__Group_4__28365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Method__Group_4__2__Impl8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__08430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__08433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Class__Group__0__Impl8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__18492 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__18495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__28552 = new BitSet(new long[]{0x1A10080000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__28555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Class__Group__2__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__38614 = new BitSet(new long[]{0x1A10080000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__38617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__48675 = new BitSet(new long[]{0x1A10080000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__48678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__58736 = new BitSet(new long[]{0x1A10080000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__58739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__68797 = new BitSet(new long[]{0x1A10080000000000L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__68800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__MethodsAssignment_6_in_rule__Class__Group__6__Impl8827 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__78858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Class__Group__7__Impl8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__08933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__08936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Class__Group_3__0__Impl8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__18995 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__18998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DescriptionAssignment_3_1_in_rule__Class__Group_3__1__Impl9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__29055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Class__Group_3__2__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__09120 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__09123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Class__Group_4__0__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__19182 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Class__Group_4__2_in_rule__Class__Group_4__19185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__MatchingAssignment_4_1_in_rule__Class__Group_4__1__Impl9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__2__Impl_in_rule__Class__Group_4__29242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Class__Group_4__2__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__09307 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__09310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Class__Group_5__0__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__19369 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Class__Group_5__2_in_rule__Class__Group_5__19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__CardinalityAssignment_5_1_in_rule__Class__Group_5__1__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__2__Impl_in_rule__Class__Group_5__29429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Class__Group_5__2__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__0__Impl_in_rule__XmlElement__Group__09494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1_in_rule__XmlElement__Group__09497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__XmlElement__Group__0__Impl9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__1__Impl_in_rule__XmlElement__Group__19556 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2_in_rule__XmlElement__Group__19559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__NameAssignment_1_in_rule__XmlElement__Group__1__Impl9586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__2__Impl_in_rule__XmlElement__Group__29616 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3_in_rule__XmlElement__Group__29619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__XmlElement__Group__2__Impl9647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__3__Impl_in_rule__XmlElement__Group__39678 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4_in_rule__XmlElement__Group__39681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0_in_rule__XmlElement__Group__3__Impl9708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__4__Impl_in_rule__XmlElement__Group__49739 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5_in_rule__XmlElement__Group__49742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0_in_rule__XmlElement__Group__4__Impl9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group__5__Impl_in_rule__XmlElement__Group__59800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlElement__Group__5__Impl9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__0__Impl_in_rule__XmlElement__Group_3__09871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1_in_rule__XmlElement__Group_3__09874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlElement__Group_3__0__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__1__Impl_in_rule__XmlElement__Group_3__19933 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2_in_rule__XmlElement__Group_3__19936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__MatchingAssignment_3_1_in_rule__XmlElement__Group_3__1__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_3__2__Impl_in_rule__XmlElement__Group_3__29993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__XmlElement__Group_3__2__Impl10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__0__Impl_in_rule__XmlElement__Group_4__010058 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1_in_rule__XmlElement__Group_4__010061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__XmlElement__Group_4__0__Impl10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__1__Impl_in_rule__XmlElement__Group_4__110120 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2_in_rule__XmlElement__Group_4__110123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__CardinalityAssignment_4_1_in_rule__XmlElement__Group_4__1__Impl10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlElement__Group_4__2__Impl_in_rule__XmlElement__Group_4__210180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__XmlElement__Group_4__2__Impl10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__0__Impl_in_rule__XmlDocument__Group__010245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1_in_rule__XmlDocument__Group__010248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__XmlDocument__Group__0__Impl10276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__1__Impl_in_rule__XmlDocument__Group__110307 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2_in_rule__XmlDocument__Group__110310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__NameAssignment_1_in_rule__XmlDocument__Group__1__Impl10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__2__Impl_in_rule__XmlDocument__Group__210367 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3_in_rule__XmlDocument__Group__210370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__XmlDocument__Group__2__Impl10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__3__Impl_in_rule__XmlDocument__Group__310429 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4_in_rule__XmlDocument__Group__310432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0_in_rule__XmlDocument__Group__3__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__4__Impl_in_rule__XmlDocument__Group__410490 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5_in_rule__XmlDocument__Group__410493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0_in_rule__XmlDocument__Group__4__Impl10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group__5__Impl_in_rule__XmlDocument__Group__510551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__XmlDocument__Group__5__Impl10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__0__Impl_in_rule__XmlDocument__Group_3__010622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1_in_rule__XmlDocument__Group_3__010625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__XmlDocument__Group_3__0__Impl10653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__1__Impl_in_rule__XmlDocument__Group_3__110684 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2_in_rule__XmlDocument__Group_3__110687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__MatchingAssignment_3_1_in_rule__XmlDocument__Group_3__1__Impl10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_3__2__Impl_in_rule__XmlDocument__Group_3__210744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__XmlDocument__Group_3__2__Impl10772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__0__Impl_in_rule__XmlDocument__Group_4__010809 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1_in_rule__XmlDocument__Group_4__010812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__XmlDocument__Group_4__0__Impl10840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__1__Impl_in_rule__XmlDocument__Group_4__110871 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2_in_rule__XmlDocument__Group_4__110874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__CardinalityAssignment_4_1_in_rule__XmlDocument__Group_4__1__Impl10901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XmlDocument__Group_4__2__Impl_in_rule__XmlDocument__Group_4__210931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__XmlDocument__Group_4__2__Impl10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__0__Impl_in_rule__Layer__Group__010996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Layer__Group__1_in_rule__Layer__Group__010999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Layer__Group__0__Impl11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__1__Impl_in_rule__Layer__Group__111058 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Layer__Group__2_in_rule__Layer__Group__111061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__NameAssignment_1_in_rule__Layer__Group__1__Impl11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__2__Impl_in_rule__Layer__Group__211118 = new BitSet(new long[]{0x0008080000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__Layer__Group__3_in_rule__Layer__Group__211121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Layer__Group__2__Impl11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__3__Impl_in_rule__Layer__Group__311180 = new BitSet(new long[]{0x0008080000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__Layer__Group__4_in_rule__Layer__Group__311183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__0_in_rule__Layer__Group__3__Impl11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group__4__Impl_in_rule__Layer__Group__411241 = new BitSet(new long[]{0x0008080000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__Layer__Group__5_in_rule__Layer__Group__411244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__ModulesAssignment_4_in_rule__Layer__Group__4__Impl11271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Layer__Group__5__Impl_in_rule__Layer__Group__511302 = new BitSet(new long[]{0x0008080000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_rule__Layer__Group__6_in_rule__Layer__Group__511305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__RestrictionsAssignment_5_in_rule__Layer__Group__5__Impl11332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Layer__Group__6__Impl_in_rule__Layer__Group__611363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Layer__Group__6__Impl11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__0__Impl_in_rule__Layer__Group_3__011436 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__1_in_rule__Layer__Group_3__011439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Layer__Group_3__0__Impl11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__1__Impl_in_rule__Layer__Group_3__111498 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__2_in_rule__Layer__Group_3__111501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__MatchingAssignment_3_1_in_rule__Layer__Group_3__1__Impl11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Layer__Group_3__2__Impl_in_rule__Layer__Group_3__211558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Layer__Group_3__2__Impl11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__011623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__011626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Module__Group__0__Impl11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__111685 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__111688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__211745 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__211748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Module__Group__2__Impl11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__311807 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__311810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__411868 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__411871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__511929 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__511932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ComponentsAssignment_5_in_rule__Module__Group__5__Impl11959 = new BitSet(new long[]{0xE7E4000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__611990 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__611993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__RestrictionsAssignment_6_in_rule__Module__Group__6__Impl12020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__712051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Module__Group__7__Impl12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__012126 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__012129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0_in_rule__Module__Group_3__0__Impl12156 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__112187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Module__Group_3__1__Impl12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__0__Impl_in_rule__Module__Group_3_0__012250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1_in_rule__Module__Group_3_0__012253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Module__Group_3_0__0__Impl12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__1__Impl_in_rule__Module__Group_3_0__112312 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2_in_rule__Module__Group_3_0__112315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__AttributesAssignment_3_0_1_in_rule__Module__Group_3_0__1__Impl12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_3_0__2__Impl_in_rule__Module__Group_3_0__212372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Module__Group_3_0__2__Impl12401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__012440 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__012443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Module__Group_4__0__Impl12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__112502 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2_in_rule__Module__Group_4__112505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__MatchingAssignment_4_1_in_rule__Module__Group_4__1__Impl12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__2__Impl_in_rule__Module__Group_4__212562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Module__Group_4__2__Impl12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__0__Impl_in_rule__MetaModule__Group__012627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1_in_rule__MetaModule__Group__012630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__MetaModule__Group__0__Impl12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__1__Impl_in_rule__MetaModule__Group__112689 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2_in_rule__MetaModule__Group__112692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__NameAssignment_1_in_rule__MetaModule__Group__1__Impl12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__2__Impl_in_rule__MetaModule__Group__212749 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3_in_rule__MetaModule__Group__212752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MetaModule__Group__2__Impl12780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__3__Impl_in_rule__MetaModule__Group__312811 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4_in_rule__MetaModule__Group__312814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0_in_rule__MetaModule__Group__3__Impl12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__4__Impl_in_rule__MetaModule__Group__412872 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5_in_rule__MetaModule__Group__412875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0_in_rule__MetaModule__Group__4__Impl12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__5__Impl_in_rule__MetaModule__Group__512933 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6_in_rule__MetaModule__Group__512936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__ComponentsAssignment_5_in_rule__MetaModule__Group__5__Impl12963 = new BitSet(new long[]{0xE7E4000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__6__Impl_in_rule__MetaModule__Group__612994 = new BitSet(new long[]{0xE7ECA80000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7_in_rule__MetaModule__Group__612997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__RestrictionsAssignment_6_in_rule__MetaModule__Group__6__Impl13024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__MetaModule__Group__7__Impl_in_rule__MetaModule__Group__713055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MetaModule__Group__7__Impl13083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__0__Impl_in_rule__MetaModule__Group_3__013130 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1_in_rule__MetaModule__Group_3__013133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0_in_rule__MetaModule__Group_3__0__Impl13160 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3__1__Impl_in_rule__MetaModule__Group_3__113191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MetaModule__Group_3__1__Impl13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__0__Impl_in_rule__MetaModule__Group_3_0__013254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1_in_rule__MetaModule__Group_3_0__013257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MetaModule__Group_3_0__0__Impl13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__1__Impl_in_rule__MetaModule__Group_3_0__113316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2_in_rule__MetaModule__Group_3_0__113319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__AttributesAssignment_3_0_1_in_rule__MetaModule__Group_3_0__1__Impl13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_3_0__2__Impl_in_rule__MetaModule__Group_3_0__213376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MetaModule__Group_3_0__2__Impl13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__0__Impl_in_rule__MetaModule__Group_4__013444 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1_in_rule__MetaModule__Group_4__013447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MetaModule__Group_4__0__Impl13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__1__Impl_in_rule__MetaModule__Group_4__113506 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2_in_rule__MetaModule__Group_4__113509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__MatchingAssignment_4_1_in_rule__MetaModule__Group_4__1__Impl13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModule__Group_4__2__Impl_in_rule__MetaModule__Group_4__213566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MetaModule__Group_4__2__Impl13594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group__0__Impl13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__QualifiedName__Group_1__1__Impl13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__0__Impl_in_rule__Restriction__Group__013874 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1_in_rule__Restriction__Group__013877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Restriction__Group__0__Impl13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__1__Impl_in_rule__Restriction__Group__113936 = new BitSet(new long[]{0x000001FFFF000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2_in_rule__Restriction__Group__113939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Restriction__Group__1__Impl13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__2__Impl_in_rule__Restriction__Group__213998 = new BitSet(new long[]{0x000001FFFF000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3_in_rule__Restriction__Group__214001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__GroupClauseAssignment_2_in_rule__Restriction__Group__2__Impl14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__3__Impl_in_rule__Restriction__Group__314059 = new BitSet(new long[]{0x000001FFFF000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4_in_rule__Restriction__Group__314062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentAAssignment_3_in_rule__Restriction__Group__3__Impl14089 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Restriction__Group__4__Impl_in_rule__Restriction__Group__414120 = new BitSet(new long[]{0x000001FFFF000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5_in_rule__Restriction__Group__414123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__PermissionClauseAssignment_4_in_rule__Restriction__Group__4__Impl14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__5__Impl_in_rule__Restriction__Group__514181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6_in_rule__Restriction__Group__514184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__RelactionTypeAssignment_5_in_rule__Restriction__Group__5__Impl14211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__6__Impl_in_rule__Restriction__Group__614241 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7_in_rule__Restriction__Group__614244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__ComponentBAssignment_6_in_rule__Restriction__Group__6__Impl14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restriction__Group__7__Impl_in_rule__Restriction__Group__714301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Restriction__Group__7__Impl14329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__ASMLModel__NameAssignment_114381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ASMLModel__ImportURIAssignment_3_114412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__ASMLModel__ViewsAssignment_414443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__View__NameAssignment_114474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__View__AttributesAssignment_3_0_114505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__View__ComponentsAssignment_414536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__View__RestrictionsAssignment_514567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Attribute__NameAssignment_014598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValueAssignment_214629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Component__NameAssignment_114660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Component__MatchingAssignment_3_114691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Component__CardinalityAssignment_4_114722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__Component__ComponentsAssignment_514753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Component__RestrictionsAssignment_614784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__FrameworkInstantiation__NameAssignment_114815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__FrameworkInstantiation__ComponentsAssignment_314846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__FrameworkInstantiation__RestrictionsAssignment_414877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__FrameworkClass__NameAssignment_114908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FrameworkClass__JavaCLassAssignment_314939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerMatchingClause_in_rule__LayerMatching__LayerMatchingAssignment_014972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__LayerMatching__ParameterAssignment_115007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatchingParamenter_in_rule__ModuleMatching__ParameterAssignment15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMatchingClause_in_rule__ClassMatching__ExpressionMatchingAssignment_015073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassMatching__ParameterAssignment_115104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__File__NameAssignment_115135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__File__MatchingAssignment_3_115166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__File__CardinalityAssignment_4_115197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Configuration__NameAssignment_115228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Configuration__MatchingAssignment_3_115259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Configuration__CardinalityAssignment_4_115290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_rule__Configuration__ConfigurationElementAssignment_515321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Method__NameAssignment_115352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Method__MatchingAssignment_3_115383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Method__CardinalityAssignment_4_115414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Class__NameAssignment_115445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Class__DescriptionAssignment_3_115476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_rule__Class__MatchingAssignment_4_115507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Class__CardinalityAssignment_5_115538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__Class__MethodsAssignment_615569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlElement__NameAssignment_115600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlElement__MatchingAssignment_3_115631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlElement__CardinalityAssignment_4_115662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__XmlDocument__NameAssignment_115693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlDocument__MatchingAssignment_3_115724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__XmlDocument__CardinalityAssignment_4_115755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Layer__NameAssignment_115786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerMatching_in_rule__Layer__MatchingAssignment_3_115817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Layer__ModulesAssignment_415848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Layer__RestrictionsAssignment_515879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__Module__NameAssignment_115910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Module__AttributesAssignment_3_0_115941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__Module__MatchingAssignment_4_115972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__Module__ComponentsAssignment_516003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__Module__RestrictionsAssignment_616034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_rule__MetaModule__NameAssignment_116065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__MetaModule__AttributesAssignment_3_0_116096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_rule__MetaModule__MatchingAssignment_4_116127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_rule__MetaModule__ComponentsAssignment_516158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_rule__MetaModule__RestrictionsAssignment_616189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_rule__Restriction__GroupClauseAssignment_216220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentAAssignment_316255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermissionClause_in_rule__Restriction__PermissionClauseAssignment_416290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelactionType_in_rule__Restriction__RelactionTypeAssignment_516321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Restriction__ComponentBAssignment_616356 = new BitSet(new long[]{0x0000000000000002L});

}