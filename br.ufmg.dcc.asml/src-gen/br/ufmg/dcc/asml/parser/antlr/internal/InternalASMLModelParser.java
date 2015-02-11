package br.ufmg.dcc.asml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalASMLModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID_ASML", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecture'", "'{'", "'import'", "';'", "'}'", "'view'", "'attributes'", "','", "':'", "'component'", "'matching'", "'cardinality'", "'framework-instantiation'", "'framework-class'", "'file'", "'configuration'", "'method'", "'class'", "'description'", "'matching:'", "'xmlElement'", "'xmlDocument'", "'layer'", "'module'", "'meta-module'", "'.'", "'restriction'", "'1'", "'0'", "'1..*'", "'0..*'", "'name start with'", "'name ends with'", "'related to component'", "'external definition'", "'by package name'", "'by folder name'", "'by package and folder name'", "'by external implementation'", "'null'", "'only'", "'any'", "'no one'", "'must'", "'can'", "'cannot'", "'access'", "'declare'", "'handle'", "'extend'", "'implement'", "'create'", "'throw'", "'use annotation'", "'depend'", "'requires'"
    };
    public static final int RULE_ID_ASML=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g"; }



     	private ASMLModelGrammarAccess grammarAccess;
     	
        public InternalASMLModelParser(TokenStream input, ASMLModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ASMLModel";	
       	}
       	
       	@Override
       	protected ASMLModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleASMLModel"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:68:1: entryRuleASMLModel returns [EObject current=null] : iv_ruleASMLModel= ruleASMLModel EOF ;
    public final EObject entryRuleASMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASMLModel = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:69:2: (iv_ruleASMLModel= ruleASMLModel EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:70:2: iv_ruleASMLModel= ruleASMLModel EOF
            {
             newCompositeNode(grammarAccess.getASMLModelRule()); 
            pushFollow(FOLLOW_ruleASMLModel_in_entryRuleASMLModel75);
            iv_ruleASMLModel=ruleASMLModel();

            state._fsp--;

             current =iv_ruleASMLModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASMLModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASMLModel"


    // $ANTLR start "ruleASMLModel"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:77:1: ruleASMLModel returns [EObject current=null] : (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* otherlv_7= '}' ) ;
    public final EObject ruleASMLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_views_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:80:28: ( (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* otherlv_7= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:1: (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* otherlv_7= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:1: (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* otherlv_7= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:3: otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleASMLModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getASMLModelAccess().getArchitectureKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:85:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:86:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:86:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:87:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleASMLModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getASMLModelAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getASMLModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleASMLModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getASMLModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:107:1: (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:107:3: otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleASMLModel169); 

                        	newLeafNode(otherlv_3, grammarAccess.getASMLModelAccess().getImportKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:111:1: ( (lv_importURI_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:112:1: (lv_importURI_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:112:1: (lv_importURI_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:113:3: lv_importURI_4_0= RULE_STRING
                    {
                    lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleASMLModel186); 

                    			newLeafNode(lv_importURI_4_0, grammarAccess.getASMLModelAccess().getImportURISTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getASMLModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"importURI",
                            		lv_importURI_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleASMLModel203); 

                        	newLeafNode(otherlv_5, grammarAccess.getASMLModelAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:133:3: ( (lv_views_6_0= ruleView ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:134:1: (lv_views_6_0= ruleView )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:134:1: (lv_views_6_0= ruleView )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:135:3: lv_views_6_0= ruleView
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getASMLModelAccess().getViewsViewParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleView_in_ruleASMLModel226);
            	    lv_views_6_0=ruleView();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getASMLModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"views",
            	            		lv_views_6_0, 
            	            		"View");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleASMLModel239); 

                	newLeafNode(otherlv_7, grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleASMLModel"


    // $ANTLR start "entryRuleView"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:163:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:164:2: (iv_ruleView= ruleView EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:165:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView275);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:172:1: ruleView returns [EObject current=null] : (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_restrictions_8_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:175:28: ( (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:176:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:176:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:176:3: otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleView322); 

                	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:180:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:181:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:181:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:182:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleView339); 

            			newLeafNode(lv_name_1_0, grammarAccess.getViewAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleView356); 

                	newLeafNode(otherlv_2, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:202:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:202:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:202:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:202:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleView370); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:206:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:207:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:207:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:208:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleView391);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:224:2: (otherlv_5= ',' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==19) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:224:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleView404); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleView420); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:232:3: ( (lv_components_7_0= ruleAbstractComponent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||(LA6_0>=24 && LA6_0<=29)||(LA6_0>=32 && LA6_0<=36)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:233:1: (lv_components_7_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:233:1: (lv_components_7_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:234:3: lv_components_7_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleView443);
            	    lv_components_7_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_7_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:250:3: ( (lv_restrictions_8_0= ruleRestriction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:251:1: (lv_restrictions_8_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:251:1: (lv_restrictions_8_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:252:3: lv_restrictions_8_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleView465);
            	    lv_restrictions_8_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_8_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleView478); 

                	newLeafNode(otherlv_9, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleAbstractComponent"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:280:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:281:2: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:282:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent514);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractComponent524); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:289:1: ruleAbstractComponent returns [EObject current=null] : (this_Layer_0= ruleLayer | this_Module_1= ruleModule | this_MetaModule_2= ruleMetaModule | this_Class_3= ruleClass | this_Method_4= ruleMethod | this_ConfigurationElement_5= ruleConfigurationElement | this_Component_6= ruleComponent | this_FrameworkInstantiation_7= ruleFrameworkInstantiation | this_FrameworkClass_8= ruleFrameworkClass ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Layer_0 = null;

        EObject this_Module_1 = null;

        EObject this_MetaModule_2 = null;

        EObject this_Class_3 = null;

        EObject this_Method_4 = null;

        EObject this_ConfigurationElement_5 = null;

        EObject this_Component_6 = null;

        EObject this_FrameworkInstantiation_7 = null;

        EObject this_FrameworkClass_8 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:292:28: ( (this_Layer_0= ruleLayer | this_Module_1= ruleModule | this_MetaModule_2= ruleMetaModule | this_Class_3= ruleClass | this_Method_4= ruleMethod | this_ConfigurationElement_5= ruleConfigurationElement | this_Component_6= ruleComponent | this_FrameworkInstantiation_7= ruleFrameworkInstantiation | this_FrameworkClass_8= ruleFrameworkClass ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:293:1: (this_Layer_0= ruleLayer | this_Module_1= ruleModule | this_MetaModule_2= ruleMetaModule | this_Class_3= ruleClass | this_Method_4= ruleMethod | this_ConfigurationElement_5= ruleConfigurationElement | this_Component_6= ruleComponent | this_FrameworkInstantiation_7= ruleFrameworkInstantiation | this_FrameworkClass_8= ruleFrameworkClass )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:293:1: (this_Layer_0= ruleLayer | this_Module_1= ruleModule | this_MetaModule_2= ruleMetaModule | this_Class_3= ruleClass | this_Method_4= ruleMethod | this_ConfigurationElement_5= ruleConfigurationElement | this_Component_6= ruleComponent | this_FrameworkInstantiation_7= ruleFrameworkInstantiation | this_FrameworkClass_8= ruleFrameworkClass )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 26:
            case 27:
            case 32:
            case 33:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 24:
                {
                alt8=8;
                }
                break;
            case 25:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:294:5: this_Layer_0= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLayer_in_ruleAbstractComponent571);
                    this_Layer_0=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:304:5: this_Module_1= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleAbstractComponent598);
                    this_Module_1=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:314:5: this_MetaModule_2= ruleMetaModule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMetaModule_in_ruleAbstractComponent625);
                    this_MetaModule_2=ruleMetaModule();

                    state._fsp--;

                     
                            current = this_MetaModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:324:5: this_Class_3= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getClassParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleClass_in_ruleAbstractComponent652);
                    this_Class_3=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:334:5: this_Method_4= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleAbstractComponent679);
                    this_Method_4=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:344:5: this_ConfigurationElement_5= ruleConfigurationElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleAbstractComponent706);
                    this_ConfigurationElement_5=ruleConfigurationElement();

                    state._fsp--;

                     
                            current = this_ConfigurationElement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:354:5: this_Component_6= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getComponentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleAbstractComponent733);
                    this_Component_6=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:364:5: this_FrameworkInstantiation_7= ruleFrameworkInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getFrameworkInstantiationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleFrameworkInstantiation_in_ruleAbstractComponent760);
                    this_FrameworkInstantiation_7=ruleFrameworkInstantiation();

                    state._fsp--;

                     
                            current = this_FrameworkInstantiation_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:374:5: this_FrameworkClass_8= ruleFrameworkClass
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getFrameworkClassParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleFrameworkClass_in_ruleAbstractComponent787);
                    this_FrameworkClass_8=ruleFrameworkClass();

                    state._fsp--;

                     
                            current = this_FrameworkClass_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleAttribute"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:390:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:391:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:392:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute822);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:399:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:402:28: ( ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:1: ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:1: ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:2: ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:2: ( (lv_name_0_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:404:1: (lv_name_0_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:404:1: (lv_name_0_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:405:3: lv_name_0_0= RULE_ID_ASML
            {
            lv_name_0_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleAttribute874); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAttribute891); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:425:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:426:1: (lv_value_2_0= RULE_STRING )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:426:1: (lv_value_2_0= RULE_STRING )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:427:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute908); 

            			newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAbstractNameConvetion"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:451:1: entryRuleAbstractNameConvetion returns [EObject current=null] : iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF ;
    public final EObject entryRuleAbstractNameConvetion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNameConvetion = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:452:2: (iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:453:2: iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF
            {
             newCompositeNode(grammarAccess.getAbstractNameConvetionRule()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion949);
            iv_ruleAbstractNameConvetion=ruleAbstractNameConvetion();

            state._fsp--;

             current =iv_ruleAbstractNameConvetion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNameConvetion959); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNameConvetion"


    // $ANTLR start "ruleAbstractNameConvetion"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:460:1: ruleAbstractNameConvetion returns [EObject current=null] : (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching ) ;
    public final EObject ruleAbstractNameConvetion() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;
        EObject this_ClassMatching_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:463:28: ( (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:464:1: (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:464:1: (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=43 && LA9_0<=44)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:464:2: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAbstractNameConvetion995); 
                     
                        newLeafNode(this_STRING_0, grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:470:5: this_ClassMatching_1= ruleClassMatching
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClassMatching_in_ruleAbstractNameConvetion1022);
                    this_ClassMatching_1=ruleClassMatching();

                    state._fsp--;

                     
                            current = this_ClassMatching_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNameConvetion"


    // $ANTLR start "entryRuleComponent"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:486:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:487:2: (iv_ruleComponent= ruleComponent EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:488:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1057);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:495:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_components_9_0= ruleAbstractComponent ) )* ( (lv_restrictions_10_0= ruleRestriction ) )* otherlv_11= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_matching_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Enumerator lv_cardinality_7_0 = null;

        EObject lv_components_9_0 = null;

        EObject lv_restrictions_10_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:498:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_components_9_0= ruleAbstractComponent ) )* ( (lv_restrictions_10_0= ruleRestriction ) )* otherlv_11= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:499:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_components_9_0= ruleAbstractComponent ) )* ( (lv_restrictions_10_0= ruleRestriction ) )* otherlv_11= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:499:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_components_9_0= ruleAbstractComponent ) )* ( (lv_restrictions_10_0= ruleRestriction ) )* otherlv_11= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:499:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_components_9_0= ruleAbstractComponent ) )* ( (lv_restrictions_10_0= ruleRestriction ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleComponent1104); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:503:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:504:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:504:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:505:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleComponent1121); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleComponent1138); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:525:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:525:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleComponent1151); 

                        	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:529:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:530:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:530:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:531:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComponent1168); 

                    			newLeafNode(lv_matching_4_0, grammarAccess.getComponentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComponent1185); 

                        	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:551:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:551:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleComponent1200); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:555:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:556:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:556:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:557:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleComponent1221);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleComponent1233); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:577:3: ( (lv_components_9_0= ruleAbstractComponent ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21||(LA12_0>=24 && LA12_0<=29)||(LA12_0>=32 && LA12_0<=36)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:1: (lv_components_9_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:1: (lv_components_9_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:579:3: lv_components_9_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleComponent1256);
            	    lv_components_9_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_9_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:595:3: ( (lv_restrictions_10_0= ruleRestriction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:596:1: (lv_restrictions_10_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:596:1: (lv_restrictions_10_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:597:3: lv_restrictions_10_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleComponent1278);
            	    lv_restrictions_10_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_10_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleComponent1291); 

                	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleFrameworkInstantiation"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:625:1: entryRuleFrameworkInstantiation returns [EObject current=null] : iv_ruleFrameworkInstantiation= ruleFrameworkInstantiation EOF ;
    public final EObject entryRuleFrameworkInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrameworkInstantiation = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:626:2: (iv_ruleFrameworkInstantiation= ruleFrameworkInstantiation EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:627:2: iv_ruleFrameworkInstantiation= ruleFrameworkInstantiation EOF
            {
             newCompositeNode(grammarAccess.getFrameworkInstantiationRule()); 
            pushFollow(FOLLOW_ruleFrameworkInstantiation_in_entryRuleFrameworkInstantiation1327);
            iv_ruleFrameworkInstantiation=ruleFrameworkInstantiation();

            state._fsp--;

             current =iv_ruleFrameworkInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameworkInstantiation1337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrameworkInstantiation"


    // $ANTLR start "ruleFrameworkInstantiation"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:634:1: ruleFrameworkInstantiation returns [EObject current=null] : (otherlv_0= 'framework-instantiation' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_components_3_0= ruleAbstractComponent ) )* ( (lv_restrictions_4_0= ruleRestriction ) )* otherlv_5= '}' ) ;
    public final EObject ruleFrameworkInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_components_3_0 = null;

        EObject lv_restrictions_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:637:28: ( (otherlv_0= 'framework-instantiation' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_components_3_0= ruleAbstractComponent ) )* ( (lv_restrictions_4_0= ruleRestriction ) )* otherlv_5= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:638:1: (otherlv_0= 'framework-instantiation' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_components_3_0= ruleAbstractComponent ) )* ( (lv_restrictions_4_0= ruleRestriction ) )* otherlv_5= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:638:1: (otherlv_0= 'framework-instantiation' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_components_3_0= ruleAbstractComponent ) )* ( (lv_restrictions_4_0= ruleRestriction ) )* otherlv_5= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:638:3: otherlv_0= 'framework-instantiation' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_components_3_0= ruleAbstractComponent ) )* ( (lv_restrictions_4_0= ruleRestriction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleFrameworkInstantiation1374); 

                	newLeafNode(otherlv_0, grammarAccess.getFrameworkInstantiationAccess().getFrameworkInstantiationKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:642:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:643:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:643:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:644:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleFrameworkInstantiation1391); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFrameworkInstantiationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFrameworkInstantiationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFrameworkInstantiation1408); 

                	newLeafNode(otherlv_2, grammarAccess.getFrameworkInstantiationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:664:1: ( (lv_components_3_0= ruleAbstractComponent ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21||(LA14_0>=24 && LA14_0<=29)||(LA14_0>=32 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:665:1: (lv_components_3_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:665:1: (lv_components_3_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:666:3: lv_components_3_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameworkInstantiationAccess().getComponentsAbstractComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleFrameworkInstantiation1429);
            	    lv_components_3_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameworkInstantiationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:682:3: ( (lv_restrictions_4_0= ruleRestriction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:683:1: (lv_restrictions_4_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:683:1: (lv_restrictions_4_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:684:3: lv_restrictions_4_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameworkInstantiationAccess().getRestrictionsRestrictionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleFrameworkInstantiation1451);
            	    lv_restrictions_4_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameworkInstantiationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_4_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFrameworkInstantiation1464); 

                	newLeafNode(otherlv_5, grammarAccess.getFrameworkInstantiationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameworkInstantiation"


    // $ANTLR start "entryRuleFrameworkClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:712:1: entryRuleFrameworkClass returns [EObject current=null] : iv_ruleFrameworkClass= ruleFrameworkClass EOF ;
    public final EObject entryRuleFrameworkClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrameworkClass = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:713:2: (iv_ruleFrameworkClass= ruleFrameworkClass EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:714:2: iv_ruleFrameworkClass= ruleFrameworkClass EOF
            {
             newCompositeNode(grammarAccess.getFrameworkClassRule()); 
            pushFollow(FOLLOW_ruleFrameworkClass_in_entryRuleFrameworkClass1500);
            iv_ruleFrameworkClass=ruleFrameworkClass();

            state._fsp--;

             current =iv_ruleFrameworkClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrameworkClass1510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrameworkClass"


    // $ANTLR start "ruleFrameworkClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:721:1: ruleFrameworkClass returns [EObject current=null] : (otherlv_0= 'framework-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_javaCLass_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= '}' ) ;
    public final EObject ruleFrameworkClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_javaCLass_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:724:28: ( (otherlv_0= 'framework-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_javaCLass_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:725:1: (otherlv_0= 'framework-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_javaCLass_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:725:1: (otherlv_0= 'framework-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_javaCLass_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:725:3: otherlv_0= 'framework-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (lv_javaCLass_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFrameworkClass1547); 

                	newLeafNode(otherlv_0, grammarAccess.getFrameworkClassAccess().getFrameworkClassKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:729:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:730:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:730:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:731:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleFrameworkClass1564); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFrameworkClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFrameworkClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFrameworkClass1581); 

                	newLeafNode(otherlv_2, grammarAccess.getFrameworkClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:751:1: ( (lv_javaCLass_3_0= RULE_STRING ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:752:1: (lv_javaCLass_3_0= RULE_STRING )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:752:1: (lv_javaCLass_3_0= RULE_STRING )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:753:3: lv_javaCLass_3_0= RULE_STRING
            {
            lv_javaCLass_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFrameworkClass1598); 

            			newLeafNode(lv_javaCLass_3_0, grammarAccess.getFrameworkClassAccess().getJavaCLassSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFrameworkClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"javaCLass",
                    		lv_javaCLass_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFrameworkClass1615); 

                	newLeafNode(otherlv_4, grammarAccess.getFrameworkClassAccess().getSemicolonKeyword_4());
                
            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFrameworkClass1627); 

                	newLeafNode(otherlv_5, grammarAccess.getFrameworkClassAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameworkClass"


    // $ANTLR start "entryRuleLayerMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:787:1: entryRuleLayerMatching returns [EObject current=null] : iv_ruleLayerMatching= ruleLayerMatching EOF ;
    public final EObject entryRuleLayerMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerMatching = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:788:2: (iv_ruleLayerMatching= ruleLayerMatching EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:789:2: iv_ruleLayerMatching= ruleLayerMatching EOF
            {
             newCompositeNode(grammarAccess.getLayerMatchingRule()); 
            pushFollow(FOLLOW_ruleLayerMatching_in_entryRuleLayerMatching1665);
            iv_ruleLayerMatching=ruleLayerMatching();

            state._fsp--;

             current =iv_ruleLayerMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayerMatching1675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerMatching"


    // $ANTLR start "ruleLayerMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:796:1: ruleLayerMatching returns [EObject current=null] : ( ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLayerMatching() throws RecognitionException {
        EObject current = null;

        Enumerator lv_layerMatching_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:799:28: ( ( ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) ) ( ( ruleQualifiedName ) ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:800:1: ( ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) ) ( ( ruleQualifiedName ) ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:800:1: ( ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) ) ( ( ruleQualifiedName ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:800:2: ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) ) ( ( ruleQualifiedName ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:800:2: ( (lv_layerMatching_0_0= ruleLayerMatchingClause ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:801:1: (lv_layerMatching_0_0= ruleLayerMatchingClause )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:801:1: (lv_layerMatching_0_0= ruleLayerMatchingClause )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:802:3: lv_layerMatching_0_0= ruleLayerMatchingClause
            {
             
            	        newCompositeNode(grammarAccess.getLayerMatchingAccess().getLayerMatchingLayerMatchingClauseEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLayerMatchingClause_in_ruleLayerMatching1721);
            lv_layerMatching_0_0=ruleLayerMatchingClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayerMatchingRule());
            	        }
                   		set(
                   			current, 
                   			"layerMatching",
                    		lv_layerMatching_0_0, 
                    		"LayerMatchingClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:818:2: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:819:1: ( ruleQualifiedName )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:819:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:820:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerMatchingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLayerMatching1744);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerMatching"


    // $ANTLR start "entryRuleModuleMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:841:1: entryRuleModuleMatching returns [EObject current=null] : iv_ruleModuleMatching= ruleModuleMatching EOF ;
    public final EObject entryRuleModuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleMatching = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:842:2: (iv_ruleModuleMatching= ruleModuleMatching EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:843:2: iv_ruleModuleMatching= ruleModuleMatching EOF
            {
             newCompositeNode(grammarAccess.getModuleMatchingRule()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching1780);
            iv_ruleModuleMatching=ruleModuleMatching();

            state._fsp--;

             current =iv_ruleModuleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleMatching1790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleMatching"


    // $ANTLR start "ruleModuleMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:850:1: ruleModuleMatching returns [EObject current=null] : ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) ) ;
    public final EObject ruleModuleMatching() throws RecognitionException {
        EObject current = null;

        Enumerator lv_parameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:853:28: ( ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:854:1: ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:854:1: ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:855:1: (lv_parameter_0_0= ruleModuleMatchingParamenter )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:855:1: (lv_parameter_0_0= ruleModuleMatchingParamenter )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:856:3: lv_parameter_0_0= ruleModuleMatchingParamenter
            {
             
            	        newCompositeNode(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleMatchingParamenter_in_ruleModuleMatching1835);
            lv_parameter_0_0=ruleModuleMatchingParamenter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleMatchingRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_0_0, 
                    		"ModuleMatchingParamenter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleMatching"


    // $ANTLR start "entryRuleClassMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:880:1: entryRuleClassMatching returns [EObject current=null] : iv_ruleClassMatching= ruleClassMatching EOF ;
    public final EObject entryRuleClassMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMatching = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:881:2: (iv_ruleClassMatching= ruleClassMatching EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:882:2: iv_ruleClassMatching= ruleClassMatching EOF
            {
             newCompositeNode(grammarAccess.getClassMatchingRule()); 
            pushFollow(FOLLOW_ruleClassMatching_in_entryRuleClassMatching1870);
            iv_ruleClassMatching=ruleClassMatching();

            state._fsp--;

             current =iv_ruleClassMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMatching1880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMatching"


    // $ANTLR start "ruleClassMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:889:1: ruleClassMatching returns [EObject current=null] : ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClassMatching() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_1_0=null;
        Enumerator lv_expressionMatching_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:892:28: ( ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:893:1: ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:893:1: ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:893:2: ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:893:2: ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:894:1: (lv_expressionMatching_0_0= ruleExpressionMatchingClause )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:894:1: (lv_expressionMatching_0_0= ruleExpressionMatchingClause )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:895:3: lv_expressionMatching_0_0= ruleExpressionMatchingClause
            {
             
            	        newCompositeNode(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionMatchingClause_in_ruleClassMatching1926);
            lv_expressionMatching_0_0=ruleExpressionMatchingClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassMatchingRule());
            	        }
                   		set(
                   			current, 
                   			"expressionMatching",
                    		lv_expressionMatching_0_0, 
                    		"ExpressionMatchingClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:911:2: ( (lv_parameter_1_0= RULE_STRING ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:912:1: (lv_parameter_1_0= RULE_STRING )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:912:1: (lv_parameter_1_0= RULE_STRING )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:913:3: lv_parameter_1_0= RULE_STRING
            {
            lv_parameter_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassMatching1943); 

            			newLeafNode(lv_parameter_1_0, grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassMatchingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter",
                    		lv_parameter_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassMatching"


    // $ANTLR start "entryRuleConfigurationElement"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:937:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:938:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:939:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
             newCompositeNode(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1984);
            iv_ruleConfigurationElement=ruleConfigurationElement();

            state._fsp--;

             current =iv_ruleConfigurationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement1994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationElement"


    // $ANTLR start "ruleConfigurationElement"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:946:1: ruleConfigurationElement returns [EObject current=null] : (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Configuration_0 = null;

        EObject this_XmlDocument_1 = null;

        EObject this_XmlElement_2 = null;

        EObject this_File_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:949:28: ( (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:950:1: (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:950:1: (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:951:5: this_Configuration_0= ruleConfiguration
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConfiguration_in_ruleConfigurationElement2041);
                    this_Configuration_0=ruleConfiguration();

                    state._fsp--;

                     
                            current = this_Configuration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:961:5: this_XmlDocument_1= ruleXmlDocument
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXmlDocument_in_ruleConfigurationElement2068);
                    this_XmlDocument_1=ruleXmlDocument();

                    state._fsp--;

                     
                            current = this_XmlDocument_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:971:5: this_XmlElement_2= ruleXmlElement
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXmlElement_in_ruleConfigurationElement2095);
                    this_XmlElement_2=ruleXmlElement();

                    state._fsp--;

                     
                            current = this_XmlElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:981:5: this_File_3= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFile_in_ruleConfigurationElement2122);
                    this_File_3=ruleFile();

                    state._fsp--;

                     
                            current = this_File_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationElement"


    // $ANTLR start "entryRuleFile"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:997:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:998:2: (iv_ruleFile= ruleFile EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:999:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile2157);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile2167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1006:1: ruleFile returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_matching_4_0 = null;

        Enumerator lv_cardinality_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1009:28: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1010:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1010:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1010:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFile2204); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1014:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1015:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1015:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1016:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleFile2221); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFile2238); 

                	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1036:1: (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1036:3: otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFile2251); 

                        	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1040:1: ( (lv_matching_4_0= ruleAbstractNameConvetion ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1041:1: (lv_matching_4_0= ruleAbstractNameConvetion )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1041:1: (lv_matching_4_0= ruleAbstractNameConvetion )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1042:3: lv_matching_4_0= ruleAbstractNameConvetion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractNameConvetion_in_ruleFile2272);
                    lv_matching_4_0=ruleAbstractNameConvetion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFileRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"AbstractNameConvetion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFile2284); 

                        	newLeafNode(otherlv_5, grammarAccess.getFileAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1062:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1062:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleFile2299); 

                        	newLeafNode(otherlv_6, grammarAccess.getFileAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1066:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1067:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1067:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1068:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleFile2320);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFileRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFile2332); 

                        	newLeafNode(otherlv_8, grammarAccess.getFileAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFile2346); 

                	newLeafNode(otherlv_9, grammarAccess.getFileAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleConfiguration"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1100:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1101:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1102:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration2382);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration2392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1109:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_matching_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_cardinality_7_0 = null;

        EObject lv_configurationElement_9_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1112:28: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1113:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1113:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1113:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleConfiguration2429); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1117:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1118:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1118:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1119:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleConfiguration2446); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConfigurationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleConfiguration2463); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1139:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1139:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConfiguration2476); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1143:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1144:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1144:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1145:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfiguration2493); 

                    			newLeafNode(lv_matching_4_0, grammarAccess.getConfigurationAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConfiguration2510); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1165:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1165:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleConfiguration2525); 

                        	newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1169:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1170:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1170:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1171:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleConfiguration2546);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleConfiguration2558); 

                        	newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1191:3: ( (lv_configurationElement_9_0= ruleConfigurationElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=27)||(LA21_0>=32 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1192:1: (lv_configurationElement_9_0= ruleConfigurationElement )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1192:1: (lv_configurationElement_9_0= ruleConfigurationElement )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1193:3: lv_configurationElement_9_0= ruleConfigurationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleConfiguration2581);
            	    lv_configurationElement_9_0=ruleConfigurationElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configurationElement",
            	            		lv_configurationElement_9_0, 
            	            		"ConfigurationElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleConfiguration2594); 

                	newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleMethod"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1221:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1222:2: (iv_ruleMethod= ruleMethod EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1223:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2630);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2640); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1230:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_matching_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_cardinality_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1233:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1234:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1234:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1234:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMethod2677); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1238:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1239:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1239:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1240:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleMethod2694); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMethod2711); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1260:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1260:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleMethod2724); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1264:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1265:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1265:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1266:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMethod2741); 

                    			newLeafNode(lv_matching_4_0, grammarAccess.getMethodAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMethod2758); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1286:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1286:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleMethod2773); 

                        	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1290:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1291:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1291:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1292:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleMethod2794);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMethod2806); 

                        	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleMethod2820); 

                	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1324:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1325:2: (iv_ruleClass= ruleClass EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1326:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass2856);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass2866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1333:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )? (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )? ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_matching_7_0 = null;

        Enumerator lv_cardinality_10_0 = null;

        EObject lv_methods_12_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1336:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )? (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )? ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1337:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )? (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )? ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1337:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )? (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )? ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1337:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )? (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )? ( (lv_methods_12_0= ruleMethod ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleClass2903); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1341:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1342:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1342:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1343:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleClass2920); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleClass2937); 

                	newLeafNode(otherlv_2, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1363:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1363:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleClass2950); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getDescriptionKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1367:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1368:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1368:1: (lv_description_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1369:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClass2967); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClass2984); 

                        	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1389:3: (otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1389:5: otherlv_6= 'matching:' ( (lv_matching_7_0= ruleAbstractNameConvetion ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleClass2999); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1393:1: ( (lv_matching_7_0= ruleAbstractNameConvetion ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1394:1: (lv_matching_7_0= ruleAbstractNameConvetion )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1394:1: (lv_matching_7_0= ruleAbstractNameConvetion )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1395:3: lv_matching_7_0= ruleAbstractNameConvetion
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getMatchingAbstractNameConvetionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractNameConvetion_in_ruleClass3020);
                    lv_matching_7_0=ruleAbstractNameConvetion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_7_0, 
                            		"AbstractNameConvetion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleClass3032); 

                        	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1415:3: (otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1415:5: otherlv_9= 'cardinality' ( (lv_cardinality_10_0= ruleCardinality ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleClass3047); 

                        	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCardinalityKeyword_5_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1419:1: ( (lv_cardinality_10_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1420:1: (lv_cardinality_10_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1420:1: (lv_cardinality_10_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1421:3: lv_cardinality_10_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getCardinalityCardinalityEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleClass3068);
                    lv_cardinality_10_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_10_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleClass3080); 

                        	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getSemicolonKeyword_5_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1441:3: ( (lv_methods_12_0= ruleMethod ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1442:1: (lv_methods_12_0= ruleMethod )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1442:1: (lv_methods_12_0= ruleMethod )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1443:3: lv_methods_12_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleClass3103);
            	    lv_methods_12_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_12_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleClass3116); 

                	newLeafNode(otherlv_13, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleXmlElement"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1471:1: entryRuleXmlElement returns [EObject current=null] : iv_ruleXmlElement= ruleXmlElement EOF ;
    public final EObject entryRuleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlElement = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1472:2: (iv_ruleXmlElement= ruleXmlElement EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1473:2: iv_ruleXmlElement= ruleXmlElement EOF
            {
             newCompositeNode(grammarAccess.getXmlElementRule()); 
            pushFollow(FOLLOW_ruleXmlElement_in_entryRuleXmlElement3152);
            iv_ruleXmlElement=ruleXmlElement();

            state._fsp--;

             current =iv_ruleXmlElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlElement3162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1480:1: ruleXmlElement returns [EObject current=null] : (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
    public final EObject ruleXmlElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_matching_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_cardinality_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1483:28: ( (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1484:1: (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1484:1: (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1484:3: otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleXmlElement3199); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlElementAccess().getXmlElementKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1488:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1489:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1489:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1490:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleXmlElement3216); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXmlElementAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXmlElement3233); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1510:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1510:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXmlElement3246); 

                        	newLeafNode(otherlv_3, grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1514:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1515:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1515:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1516:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXmlElement3263); 

                    			newLeafNode(lv_matching_4_0, grammarAccess.getXmlElementAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXmlElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXmlElement3280); 

                        	newLeafNode(otherlv_5, grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1536:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1536:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXmlElement3295); 

                        	newLeafNode(otherlv_6, grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1540:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1541:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1541:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1542:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleXmlElement3316);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXmlElementRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleXmlElement3328); 

                        	newLeafNode(otherlv_8, grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleXmlElement3342); 

                	newLeafNode(otherlv_9, grammarAccess.getXmlElementAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlDocument"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1574:1: entryRuleXmlDocument returns [EObject current=null] : iv_ruleXmlDocument= ruleXmlDocument EOF ;
    public final EObject entryRuleXmlDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlDocument = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1575:2: (iv_ruleXmlDocument= ruleXmlDocument EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1576:2: iv_ruleXmlDocument= ruleXmlDocument EOF
            {
             newCompositeNode(grammarAccess.getXmlDocumentRule()); 
            pushFollow(FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument3378);
            iv_ruleXmlDocument=ruleXmlDocument();

            state._fsp--;

             current =iv_ruleXmlDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlDocument3388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXmlDocument"


    // $ANTLR start "ruleXmlDocument"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1583:1: ruleXmlDocument returns [EObject current=null] : (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
    public final EObject ruleXmlDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_matching_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_cardinality_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1586:28: ( (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1587:1: (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1587:1: (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1587:3: otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleXmlDocument3425); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1591:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1592:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1592:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1593:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleXmlDocument3442); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXmlDocumentAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlDocumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXmlDocument3459); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1613:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1613:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXmlDocument3472); 

                        	newLeafNode(otherlv_3, grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1617:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1618:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1618:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1619:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXmlDocument3489); 

                    			newLeafNode(lv_matching_4_0, grammarAccess.getXmlDocumentAccess().getMatchingSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXmlDocumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXmlDocument3506); 

                        	newLeafNode(otherlv_5, grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1639:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1639:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXmlDocument3521); 

                        	newLeafNode(otherlv_6, grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1643:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1644:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1644:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1645:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleXmlDocument3542);
                    lv_cardinality_7_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXmlDocumentRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_7_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleXmlDocument3554); 

                        	newLeafNode(otherlv_8, grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleXmlDocument3568); 

                	newLeafNode(otherlv_9, grammarAccess.getXmlDocumentAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXmlDocument"


    // $ANTLR start "entryRuleLayer"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1677:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1678:2: (iv_ruleLayer= ruleLayer EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1679:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer3604);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer3614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1686:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )? ( (lv_modules_6_0= ruleModule ) )* ( (lv_restrictions_7_0= ruleRestriction ) )* otherlv_8= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_matching_4_0 = null;

        EObject lv_modules_6_0 = null;

        EObject lv_restrictions_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1689:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )? ( (lv_modules_6_0= ruleModule ) )* ( (lv_restrictions_7_0= ruleRestriction ) )* otherlv_8= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1690:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )? ( (lv_modules_6_0= ruleModule ) )* ( (lv_restrictions_7_0= ruleRestriction ) )* otherlv_8= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1690:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )? ( (lv_modules_6_0= ruleModule ) )* ( (lv_restrictions_7_0= ruleRestriction ) )* otherlv_8= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1690:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )? ( (lv_modules_6_0= ruleModule ) )* ( (lv_restrictions_7_0= ruleRestriction ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleLayer3651); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1694:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1695:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1695:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1696:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleLayer3668); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLayer3685); 

                	newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1716:1: (otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1716:3: otherlv_3= 'matching' ( (lv_matching_4_0= ruleLayerMatching ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleLayer3698); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1720:1: ( (lv_matching_4_0= ruleLayerMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1721:1: (lv_matching_4_0= ruleLayerMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1721:1: (lv_matching_4_0= ruleLayerMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1722:3: lv_matching_4_0= ruleLayerMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayerAccess().getMatchingLayerMatchingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLayerMatching_in_ruleLayer3719);
                    lv_matching_4_0=ruleLayerMatching();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayerRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_4_0, 
                            		"LayerMatching");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLayer3731); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1742:3: ( (lv_modules_6_0= ruleModule ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1743:1: (lv_modules_6_0= ruleModule )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1743:1: (lv_modules_6_0= ruleModule )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1744:3: lv_modules_6_0= ruleModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayerAccess().getModulesModuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleLayer3754);
            	    lv_modules_6_0=ruleModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modules",
            	            		lv_modules_6_0, 
            	            		"Module");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1760:3: ( (lv_restrictions_7_0= ruleRestriction ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1761:1: (lv_restrictions_7_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1761:1: (lv_restrictions_7_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1762:3: lv_restrictions_7_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayerAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleLayer3776);
            	    lv_restrictions_7_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_7_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleLayer3789); 

                	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1790:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1791:2: (iv_ruleModule= ruleModule EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1792:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule3825);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule3835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1799:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_matching_8_0 = null;

        EObject lv_components_10_0 = null;

        EObject lv_restrictions_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1802:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1803:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1803:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1803:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleModule3872); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1807:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1808:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1808:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1809:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleModule3889); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModule3906); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1829:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15||LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1829:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1829:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1829:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleModule3920); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1833:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1834:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1834:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1835:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleModule3941);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1851:2: (otherlv_5= ',' )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0==19) ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1851:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleModule3954); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleModule3970); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1859:3: (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1859:5: otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleModule3985); 

                        	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1863:1: ( (lv_matching_8_0= ruleModuleMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1864:1: (lv_matching_8_0= ruleModuleMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1864:1: (lv_matching_8_0= ruleModuleMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1865:3: lv_matching_8_0= ruleModuleMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleMatching_in_ruleModule4006);
                    lv_matching_8_0=ruleModuleMatching();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_8_0, 
                            		"ModuleMatching");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleModule4018); 

                        	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1885:3: ( (lv_components_10_0= ruleAbstractComponent ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21||(LA39_0>=24 && LA39_0<=29)||(LA39_0>=32 && LA39_0<=36)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1886:1: (lv_components_10_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1886:1: (lv_components_10_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1887:3: lv_components_10_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleModule4041);
            	    lv_components_10_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_10_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1903:3: ( (lv_restrictions_11_0= ruleRestriction ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==38) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1904:1: (lv_restrictions_11_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1904:1: (lv_restrictions_11_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1905:3: lv_restrictions_11_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleModule4063);
            	    lv_restrictions_11_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_11_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleModule4076); 

                	newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleMetaModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1933:1: entryRuleMetaModule returns [EObject current=null] : iv_ruleMetaModule= ruleMetaModule EOF ;
    public final EObject entryRuleMetaModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModule = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1934:2: (iv_ruleMetaModule= ruleMetaModule EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1935:2: iv_ruleMetaModule= ruleMetaModule EOF
            {
             newCompositeNode(grammarAccess.getMetaModuleRule()); 
            pushFollow(FOLLOW_ruleMetaModule_in_entryRuleMetaModule4112);
            iv_ruleMetaModule=ruleMetaModule();

            state._fsp--;

             current =iv_ruleMetaModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModule4122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaModule"


    // $ANTLR start "ruleMetaModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1942:1: ruleMetaModule returns [EObject current=null] : (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) ;
    public final EObject ruleMetaModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_matching_8_0 = null;

        EObject lv_components_10_0 = null;

        EObject lv_restrictions_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1945:28: ( (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1946:1: (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1946:1: (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1946:3: otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleMetaModule4159); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1950:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1951:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1951:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1952:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleMetaModule4176); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetaModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMetaModule4193); 

                	newLeafNode(otherlv_2, grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1972:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15||LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1972:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1972:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==18) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1972:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMetaModule4207); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1976:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1977:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1977:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1978:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleMetaModule4228);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetaModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1994:2: (otherlv_5= ',' )?
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==19) ) {
                    	        alt41=1;
                    	    }
                    	    switch (alt41) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1994:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMetaModule4241); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMetaModule4257); 

                        	newLeafNode(otherlv_6, grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2002:3: (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2002:5: otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMetaModule4272); 

                        	newLeafNode(otherlv_7, grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2006:1: ( (lv_matching_8_0= ruleModuleMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2007:1: (lv_matching_8_0= ruleModuleMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2007:1: (lv_matching_8_0= ruleModuleMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2008:3: lv_matching_8_0= ruleModuleMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleMatching_in_ruleMetaModule4293);
                    lv_matching_8_0=ruleModuleMatching();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetaModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_8_0, 
                            		"ModuleMatching");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleMetaModule4305); 

                        	newLeafNode(otherlv_9, grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2028:3: ( (lv_components_10_0= ruleAbstractComponent ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==21||(LA45_0>=24 && LA45_0<=29)||(LA45_0>=32 && LA45_0<=36)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2029:1: (lv_components_10_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2029:1: (lv_components_10_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2030:3: lv_components_10_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleMetaModule4328);
            	    lv_components_10_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetaModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_10_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2046:3: ( (lv_restrictions_11_0= ruleRestriction ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==38) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2047:1: (lv_restrictions_11_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2047:1: (lv_restrictions_11_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2048:3: lv_restrictions_11_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleMetaModule4350);
            	    lv_restrictions_11_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetaModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"restrictions",
            	            		lv_restrictions_11_0, 
            	            		"Restriction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleMetaModule4363); 

                	newLeafNode(otherlv_12, grammarAccess.getMetaModuleAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2076:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2077:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2078:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4400);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2085:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_ASML_0=null;
        Token kw=null;
        Token this_ID_ASML_2=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2088:28: ( (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2089:1: (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2089:1: (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2089:6: this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )*
            {
            this_ID_ASML_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4451); 

            		current.merge(this_ID_ASML_0);
                
             
                newLeafNode(this_ID_ASML_0, grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:1: (kw= '.' this_ID_ASML_2= RULE_ID_ASML )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==37) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2097:2: kw= '.' this_ID_ASML_2= RULE_ID_ASML
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName4470); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_ASML_2=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4485); 

            	    		current.merge(this_ID_ASML_2);
            	        
            	     
            	        newLeafNode(this_ID_ASML_2, grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRestriction"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2117:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2118:2: (iv_ruleRestriction= ruleRestriction EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2119:2: iv_ruleRestriction= ruleRestriction EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction4532);
            iv_ruleRestriction=ruleRestriction();

            state._fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction4542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestriction"


    // $ANTLR start "ruleRestriction"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2126:1: ruleRestriction returns [EObject current=null] : (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '}' ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        Enumerator lv_groupClause_2_0 = null;

        Enumerator lv_permissionClause_4_0 = null;

        Enumerator lv_relactionType_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2129:28: ( (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2130:1: (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2130:1: (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2130:3: otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleRestriction4579); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictionAccess().getRestrictionKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRestriction4591); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2138:1: ( (lv_groupClause_2_0= ruleGroupClause ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=51 && LA48_0<=54)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2139:1: (lv_groupClause_2_0= ruleGroupClause )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2139:1: (lv_groupClause_2_0= ruleGroupClause )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2140:3: lv_groupClause_2_0= ruleGroupClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleRestriction4612);
                    lv_groupClause_2_0=ruleGroupClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRestrictionRule());
                    	        }
                           		set(
                           			current, 
                           			"groupClause",
                            		lv_groupClause_2_0, 
                            		"GroupClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2156:3: ( ( ruleQualifiedName ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID_ASML) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2157:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2157:1: ( ruleQualifiedName )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2158:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRestrictionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRestriction4636);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2171:3: ( (lv_permissionClause_4_0= rulePermissionClause ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51||(LA50_0>=55 && LA50_0<=57)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2172:1: (lv_permissionClause_4_0= rulePermissionClause )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2172:1: (lv_permissionClause_4_0= rulePermissionClause )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2173:3: lv_permissionClause_4_0= rulePermissionClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePermissionClause_in_ruleRestriction4658);
                    lv_permissionClause_4_0=rulePermissionClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRestrictionRule());
                    	        }
                           		set(
                           			current, 
                           			"permissionClause",
                            		lv_permissionClause_4_0, 
                            		"PermissionClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2189:3: ( (lv_relactionType_5_0= ruleRelactionType ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2190:1: (lv_relactionType_5_0= ruleRelactionType )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2190:1: (lv_relactionType_5_0= ruleRelactionType )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2191:3: lv_relactionType_5_0= ruleRelactionType
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRelactionType_in_ruleRestriction4680);
            lv_relactionType_5_0=ruleRelactionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionRule());
            	        }
                   		set(
                   			current, 
                   			"relactionType",
                    		lv_relactionType_5_0, 
                    		"RelactionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2207:2: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2208:1: ( ruleQualifiedName )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2208:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2209:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRestrictionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRestriction4703);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleRestriction4715); 

                	newLeafNode(otherlv_7, grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestriction"


    // $ANTLR start "ruleCardinality"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2234:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2236:28: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2237:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2237:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt51=1;
                }
                break;
            case 40:
                {
                alt51=2;
                }
                break;
            case 41:
                {
                alt51=3;
                }
                break;
            case 42:
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2237:2: (enumLiteral_0= '1' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2237:2: (enumLiteral_0= '1' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2237:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleCardinality4765); 

                            current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2243:6: (enumLiteral_1= '0' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2243:6: (enumLiteral_1= '0' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2243:8: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleCardinality4782); 

                            current = grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2249:6: (enumLiteral_2= '1..*' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2249:6: (enumLiteral_2= '1..*' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2249:8: enumLiteral_2= '1..*'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleCardinality4799); 

                            current = grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2255:6: (enumLiteral_3= '0..*' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2255:6: (enumLiteral_3= '0..*' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2255:8: enumLiteral_3= '0..*'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleCardinality4816); 

                            current = grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCardinalityAccess().getZeroOrManyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "ruleExpressionMatchingClause"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2265:1: ruleExpressionMatchingClause returns [Enumerator current=null] : ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) ) ;
    public final Enumerator ruleExpressionMatchingClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2267:28: ( ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2268:1: ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2268:1: ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            else if ( (LA52_0==44) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2268:2: (enumLiteral_0= 'name start with' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2268:2: (enumLiteral_0= 'name start with' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2268:4: enumLiteral_0= 'name start with'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleExpressionMatchingClause4861); 

                            current = grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2274:6: (enumLiteral_1= 'name ends with' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2274:6: (enumLiteral_1= 'name ends with' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2274:8: enumLiteral_1= 'name ends with'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleExpressionMatchingClause4878); 

                            current = grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionMatchingClause"


    // $ANTLR start "ruleLayerMatchingClause"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2284:1: ruleLayerMatchingClause returns [Enumerator current=null] : ( (enumLiteral_0= 'related to component' ) | (enumLiteral_1= 'external definition' ) ) ;
    public final Enumerator ruleLayerMatchingClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2286:28: ( ( (enumLiteral_0= 'related to component' ) | (enumLiteral_1= 'external definition' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:1: ( (enumLiteral_0= 'related to component' ) | (enumLiteral_1= 'external definition' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:1: ( (enumLiteral_0= 'related to component' ) | (enumLiteral_1= 'external definition' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==45) ) {
                alt53=1;
            }
            else if ( (LA53_0==46) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:2: (enumLiteral_0= 'related to component' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:2: (enumLiteral_0= 'related to component' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:4: enumLiteral_0= 'related to component'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleLayerMatchingClause4923); 

                            current = grammarAccess.getLayerMatchingClauseAccess().getRELATED_TO_COMPONENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLayerMatchingClauseAccess().getRELATED_TO_COMPONENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:6: (enumLiteral_1= 'external definition' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:6: (enumLiteral_1= 'external definition' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:8: enumLiteral_1= 'external definition'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleLayerMatchingClause4940); 

                            current = grammarAccess.getLayerMatchingClauseAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLayerMatchingClauseAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerMatchingClause"


    // $ANTLR start "ruleModuleMatchingParamenter"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2303:1: ruleModuleMatchingParamenter returns [Enumerator current=null] : ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) ) ;
    public final Enumerator ruleModuleMatchingParamenter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2305:28: ( ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2306:1: ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2306:1: ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt54=1;
                }
                break;
            case 48:
                {
                alt54=2;
                }
                break;
            case 49:
                {
                alt54=3;
                }
                break;
            case 50:
                {
                alt54=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2306:2: (enumLiteral_0= 'by package name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2306:2: (enumLiteral_0= 'by package name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2306:4: enumLiteral_0= 'by package name'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleModuleMatchingParamenter4985); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2312:6: (enumLiteral_1= 'by folder name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2312:6: (enumLiteral_1= 'by folder name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2312:8: enumLiteral_1= 'by folder name'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleModuleMatchingParamenter5002); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2318:6: (enumLiteral_2= 'by package and folder name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2318:6: (enumLiteral_2= 'by package and folder name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2318:8: enumLiteral_2= 'by package and folder name'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleModuleMatchingParamenter5019); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2324:6: (enumLiteral_3= 'by external implementation' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2324:6: (enumLiteral_3= 'by external implementation' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2324:8: enumLiteral_3= 'by external implementation'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleModuleMatchingParamenter5036); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getModuleMatchingParamenterAccess().getEXTERNAL_DEFINITIONEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleMatchingParamenter"


    // $ANTLR start "ruleGroupClause"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2334:1: ruleGroupClause returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) ) ;
    public final Enumerator ruleGroupClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2336:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2337:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2337:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt55=1;
                }
                break;
            case 52:
                {
                alt55=2;
                }
                break;
            case 53:
                {
                alt55=3;
                }
                break;
            case 54:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2337:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2337:2: (enumLiteral_0= 'null' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2337:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleGroupClause5081); 

                            current = grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2343:6: (enumLiteral_1= 'only' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2343:6: (enumLiteral_1= 'only' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2343:8: enumLiteral_1= 'only'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleGroupClause5098); 

                            current = grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2349:6: (enumLiteral_2= 'any' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2349:6: (enumLiteral_2= 'any' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2349:8: enumLiteral_2= 'any'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleGroupClause5115); 

                            current = grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2355:6: (enumLiteral_3= 'no one' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2355:6: (enumLiteral_3= 'no one' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2355:8: enumLiteral_3= 'no one'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleGroupClause5132); 

                            current = grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGroupClauseAccess().getNO_ONEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "rulePermissionClause"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2365:1: rulePermissionClause returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) ) ;
    public final Enumerator rulePermissionClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2367:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2368:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2368:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt56=1;
                }
                break;
            case 55:
                {
                alt56=2;
                }
                break;
            case 56:
                {
                alt56=3;
                }
                break;
            case 57:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2368:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2368:2: (enumLiteral_0= 'null' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2368:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_rulePermissionClause5177); 

                            current = grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2374:6: (enumLiteral_1= 'must' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2374:6: (enumLiteral_1= 'must' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2374:8: enumLiteral_1= 'must'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_rulePermissionClause5194); 

                            current = grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2380:6: (enumLiteral_2= 'can' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2380:6: (enumLiteral_2= 'can' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2380:8: enumLiteral_2= 'can'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_rulePermissionClause5211); 

                            current = grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2386:6: (enumLiteral_3= 'cannot' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2386:6: (enumLiteral_3= 'cannot' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2386:8: enumLiteral_3= 'cannot'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_rulePermissionClause5228); 

                            current = grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPermissionClauseAccess().getCANNOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermissionClause"


    // $ANTLR start "ruleRelactionType"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2396:1: ruleRelactionType returns [Enumerator current=null] : ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) ) ;
    public final Enumerator ruleRelactionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2398:28: ( ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2399:1: ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2399:1: ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) )
            int alt57=10;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt57=1;
                }
                break;
            case 59:
                {
                alt57=2;
                }
                break;
            case 60:
                {
                alt57=3;
                }
                break;
            case 61:
                {
                alt57=4;
                }
                break;
            case 62:
                {
                alt57=5;
                }
                break;
            case 63:
                {
                alt57=6;
                }
                break;
            case 64:
                {
                alt57=7;
                }
                break;
            case 65:
                {
                alt57=8;
                }
                break;
            case 66:
                {
                alt57=9;
                }
                break;
            case 67:
                {
                alt57=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2399:2: (enumLiteral_0= 'access' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2399:2: (enumLiteral_0= 'access' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2399:4: enumLiteral_0= 'access'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleRelactionType5273); 

                            current = grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2405:6: (enumLiteral_1= 'declare' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2405:6: (enumLiteral_1= 'declare' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2405:8: enumLiteral_1= 'declare'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleRelactionType5290); 

                            current = grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2411:6: (enumLiteral_2= 'handle' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2411:6: (enumLiteral_2= 'handle' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2411:8: enumLiteral_2= 'handle'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleRelactionType5307); 

                            current = grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2417:6: (enumLiteral_3= 'extend' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2417:6: (enumLiteral_3= 'extend' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2417:8: enumLiteral_3= 'extend'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleRelactionType5324); 

                            current = grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2423:6: (enumLiteral_4= 'implement' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2423:6: (enumLiteral_4= 'implement' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2423:8: enumLiteral_4= 'implement'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleRelactionType5341); 

                            current = grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2429:6: (enumLiteral_5= 'create' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2429:6: (enumLiteral_5= 'create' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2429:8: enumLiteral_5= 'create'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_63_in_ruleRelactionType5358); 

                            current = grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2435:6: (enumLiteral_6= 'throw' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2435:6: (enumLiteral_6= 'throw' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2435:8: enumLiteral_6= 'throw'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_64_in_ruleRelactionType5375); 

                            current = grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2441:6: (enumLiteral_7= 'use annotation' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2441:6: (enumLiteral_7= 'use annotation' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2441:8: enumLiteral_7= 'use annotation'
                    {
                    enumLiteral_7=(Token)match(input,65,FOLLOW_65_in_ruleRelactionType5392); 

                            current = grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2447:6: (enumLiteral_8= 'depend' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2447:6: (enumLiteral_8= 'depend' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2447:8: enumLiteral_8= 'depend'
                    {
                    enumLiteral_8=(Token)match(input,66,FOLLOW_66_in_ruleRelactionType5409); 

                            current = grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2453:6: (enumLiteral_9= 'requires' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2453:6: (enumLiteral_9= 'requires' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2453:8: enumLiteral_9= 'requires'
                    {
                    enumLiteral_9=(Token)match(input,67,FOLLOW_67_in_ruleRelactionType5426); 

                            current = grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getRelactionTypeAccess().getREQUIRESEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelactionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleASMLModel_in_entryRuleASMLModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASMLModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleASMLModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleASMLModel139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleASMLModel156 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_14_in_ruleASMLModel169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleASMLModel186 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleASMLModel203 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleView_in_ruleASMLModel226 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleASMLModel239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleView322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleView339 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleView356 = new BitSet(new long[]{0x0000005F3F258000L});
    public static final BitSet FOLLOW_18_in_ruleView370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleView391 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_19_in_ruleView404 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleView420 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleView443 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleView465 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleView478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractComponent524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleAbstractComponent571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleAbstractComponent598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_ruleAbstractComponent625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleAbstractComponent652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAbstractComponent679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleAbstractComponent706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleAbstractComponent733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkInstantiation_in_ruleAbstractComponent760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkClass_in_ruleAbstractComponent787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleAttribute874 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute891 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNameConvetion959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAbstractNameConvetion995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_ruleAbstractNameConvetion1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleComponent1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleComponent1121 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent1138 = new BitSet(new long[]{0x0000005F3FE10000L});
    public static final BitSet FOLLOW_22_in_ruleComponent1151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComponent1168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent1185 = new BitSet(new long[]{0x0000005F3FA10000L});
    public static final BitSet FOLLOW_23_in_ruleComponent1200 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleComponent1221 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent1233 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleComponent1256 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleComponent1278 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponent1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkInstantiation_in_entryRuleFrameworkInstantiation1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameworkInstantiation1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFrameworkInstantiation1374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleFrameworkInstantiation1391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFrameworkInstantiation1408 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleFrameworkInstantiation1429 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleFrameworkInstantiation1451 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleFrameworkInstantiation1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrameworkClass_in_entryRuleFrameworkClass1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrameworkClass1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFrameworkClass1547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleFrameworkClass1564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFrameworkClass1581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFrameworkClass1598 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFrameworkClass1615 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFrameworkClass1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerMatching_in_entryRuleLayerMatching1665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayerMatching1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerMatchingClause_in_ruleLayerMatching1721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLayerMatching1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching1780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleMatching1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatchingParamenter_in_ruleModuleMatching1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_entryRuleClassMatching1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMatching1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMatchingClause_in_ruleClassMatching1926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassMatching1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_ruleConfigurationElement2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_ruleConfigurationElement2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_ruleConfigurationElement2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleConfigurationElement2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFile2204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleFile2221 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFile2238 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_22_in_ruleFile2251 = new BitSet(new long[]{0x0000180000000020L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_ruleFile2272 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile2284 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleFile2299 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleFile2320 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile2332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFile2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConfiguration2429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleConfiguration2446 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration2463 = new BitSet(new long[]{0x000000030CC10000L});
    public static final BitSet FOLLOW_22_in_ruleConfiguration2476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfiguration2493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfiguration2510 = new BitSet(new long[]{0x000000030C810000L});
    public static final BitSet FOLLOW_23_in_ruleConfiguration2525 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleConfiguration2546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfiguration2558 = new BitSet(new long[]{0x000000030C010000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration2581 = new BitSet(new long[]{0x000000030C010000L});
    public static final BitSet FOLLOW_16_in_ruleConfiguration2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMethod2677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleMethod2694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMethod2711 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_22_in_ruleMethod2724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMethod2741 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod2758 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleMethod2773 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleMethod2794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod2806 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMethod2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass2856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleClass2903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleClass2920 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass2937 = new BitSet(new long[]{0x00000000D0810000L});
    public static final BitSet FOLLOW_30_in_ruleClass2950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClass2967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClass2984 = new BitSet(new long[]{0x0000000090810000L});
    public static final BitSet FOLLOW_31_in_ruleClass2999 = new BitSet(new long[]{0x0000180000000020L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_ruleClass3020 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClass3032 = new BitSet(new long[]{0x0000000010810000L});
    public static final BitSet FOLLOW_23_in_ruleClass3047 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleClass3068 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleClass3080 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleClass3103 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleClass3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement3152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleXmlElement3199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleXmlElement3216 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXmlElement3233 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_22_in_ruleXmlElement3246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlElement3263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlElement3280 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleXmlElement3295 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleXmlElement3316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlElement3328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXmlElement3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlDocument3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXmlDocument3425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleXmlDocument3442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXmlDocument3459 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_22_in_ruleXmlDocument3472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlDocument3489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlDocument3506 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleXmlDocument3521 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleXmlDocument3542 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlDocument3554 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXmlDocument3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer3604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLayer3651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleLayer3668 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLayer3685 = new BitSet(new long[]{0x0000004800410000L});
    public static final BitSet FOLLOW_22_in_ruleLayer3698 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_ruleLayerMatching_in_ruleLayer3719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLayer3731 = new BitSet(new long[]{0x0000004800010000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleLayer3754 = new BitSet(new long[]{0x0000004800010000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleLayer3776 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleLayer3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule3825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleModule3872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleModule3889 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule3906 = new BitSet(new long[]{0x0000005F3F658000L});
    public static final BitSet FOLLOW_18_in_ruleModule3920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModule3941 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_19_in_ruleModule3954 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleModule3970 = new BitSet(new long[]{0x0000005F3F610000L});
    public static final BitSet FOLLOW_22_in_ruleModule3985 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_ruleModule4006 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule4018 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleModule4041 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleModule4063 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleModule4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_entryRuleMetaModule4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModule4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMetaModule4159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleMetaModule4176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMetaModule4193 = new BitSet(new long[]{0x0000005F3F658000L});
    public static final BitSet FOLLOW_18_in_ruleMetaModule4207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMetaModule4228 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_19_in_ruleMetaModule4241 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleMetaModule4257 = new BitSet(new long[]{0x0000005F3F610000L});
    public static final BitSet FOLLOW_22_in_ruleMetaModule4272 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_ruleMetaModule4293 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaModule4305 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleMetaModule4328 = new BitSet(new long[]{0x0000005F3F210000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleMetaModule4350 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_16_in_ruleMetaModule4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4451 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName4470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4485 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction4532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRestriction4579 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRestriction4591 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleRestriction4612 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRestriction4636 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_rulePermissionClause_in_ruleRestriction4658 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRelactionType_in_ruleRestriction4680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRestriction4703 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRestriction4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCardinality4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCardinality4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCardinality4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCardinality4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleExpressionMatchingClause4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExpressionMatchingClause4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLayerMatchingClause4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLayerMatchingClause4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleModuleMatchingParamenter4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleModuleMatchingParamenter5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleModuleMatchingParamenter5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleModuleMatchingParamenter5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGroupClause5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGroupClause5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGroupClause5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGroupClause5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePermissionClause5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePermissionClause5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePermissionClause5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePermissionClause5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRelactionType5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelactionType5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelactionType5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRelactionType5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelactionType5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRelactionType5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRelactionType5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRelactionType5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleRelactionType5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRelactionType5426 = new BitSet(new long[]{0x0000000000000002L});

}