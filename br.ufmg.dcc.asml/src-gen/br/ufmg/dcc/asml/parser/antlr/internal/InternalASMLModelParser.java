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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID_ASML", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecture'", "'{'", "'import'", "';'", "'ignore'", "','", "'}'", "'view'", "'attributes'", "':'", "'file'", "'matching'", "'cardinality'", "'configuration'", "'method'", "'meta-class'", "'extends'", "'description'", "'matching:'", "'external-class'", "'type'", "'xmlElement'", "'xmlDocument'", "'module'", "'meta-module'", "'external-module'", "'.'", "'restriction'", "'1'", "'0'", "'1..*'", "'0..*'", "'name start with'", "'name ends with'", "'annotated with'", "'by package name'", "'by folder name'", "'by package and folder name'", "'by external implementation'", "'null'", "'only'", "'any'", "'no one'", "'must'", "'can'", "'cannot'", "'access'", "'declare'", "'handle'", "'extend'", "'implement'", "'create'", "'throw'", "'use annotation'", "'depend'", "'requires'"
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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:77:1: ruleASMLModel returns [EObject current=null] : (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )? otherlv_11= '}' ) ;
    public final EObject ruleASMLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_ignore_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_views_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:80:28: ( (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )? otherlv_11= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:1: (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )? otherlv_11= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:1: (otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )? otherlv_11= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:81:3: otherlv_0= 'architecture' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'import' ( (lv_importURI_4_0= RULE_STRING ) ) otherlv_5= ';' )? ( (lv_views_6_0= ruleView ) )* (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )? otherlv_11= '}'
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

                if ( (LA2_0==19) ) {
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

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:151:3: (otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:151:5: otherlv_7= 'ignore' ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )* otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleASMLModel240); 

                        	newLeafNode(otherlv_7, grammarAccess.getASMLModelAccess().getIgnoreKeyword_5_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:155:1: ( ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:155:2: ( (lv_ignore_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:155:2: ( (lv_ignore_8_0= RULE_STRING ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:156:1: (lv_ignore_8_0= RULE_STRING )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:156:1: (lv_ignore_8_0= RULE_STRING )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:157:3: lv_ignore_8_0= RULE_STRING
                    	    {
                    	    lv_ignore_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleASMLModel258); 

                    	    			newLeafNode(lv_ignore_8_0, grammarAccess.getASMLModelAccess().getIgnoreSTRINGTerminalRuleCall_5_1_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getASMLModelRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ignore",
                    	            		lv_ignore_8_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:173:2: (otherlv_9= ',' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==17) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:173:4: otherlv_9= ','
                    	            {
                    	            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleASMLModel276); 

                    	                	newLeafNode(otherlv_9, grammarAccess.getASMLModelAccess().getCommaKeyword_5_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleASMLModel292); 

                        	newLeafNode(otherlv_10, grammarAccess.getASMLModelAccess().getSemicolonKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleASMLModel306); 

                	newLeafNode(otherlv_11, grammarAccess.getASMLModelAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:193:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:194:2: (iv_ruleView= ruleView EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:195:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView342);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView352); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:202:1: ruleView returns [EObject current=null] : (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:205:28: ( (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:206:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:206:1: (otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:206:3: otherlv_0= 'view' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? ( (lv_components_7_0= ruleAbstractComponent ) )* ( (lv_restrictions_8_0= ruleRestriction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleView389); 

                	newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:210:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:211:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:211:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:212:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleView406); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleView423); 

                	newLeafNode(otherlv_2, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:232:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15||LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:232:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:232:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:232:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleView437); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:236:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:237:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:237:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:238:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getViewAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleView458);
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

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:254:2: (otherlv_5= ',' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==17) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:254:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleView471); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getViewAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleView487); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:262:3: ( (lv_components_7_0= ruleAbstractComponent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==22||(LA9_0>=25 && LA9_0<=27)||LA9_0==31||(LA9_0>=33 && LA9_0<=37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:263:1: (lv_components_7_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:263:1: (lv_components_7_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:264:3: lv_components_7_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewAccess().getComponentsAbstractComponentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleView510);
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
            	    break loop9;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:280:3: ( (lv_restrictions_8_0= ruleRestriction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:281:1: (lv_restrictions_8_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:281:1: (lv_restrictions_8_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:282:3: lv_restrictions_8_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getViewAccess().getRestrictionsRestrictionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleView532);
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
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleView545); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:310:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:311:2: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:312:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent581);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractComponent591); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:319:1: ruleAbstractComponent returns [EObject current=null] : (this_Module_0= ruleModule | this_MetaModule_1= ruleMetaModule | this_ExternalModule_2= ruleExternalModule | this_MetaClass_3= ruleMetaClass | this_ExternalClass_4= ruleExternalClass | this_Method_5= ruleMethod | this_ConfigurationElement_6= ruleConfigurationElement | (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* ) ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_MetaModule_1 = null;

        EObject this_ExternalModule_2 = null;

        EObject this_MetaClass_3 = null;

        EObject this_ExternalClass_4 = null;

        EObject this_Method_5 = null;

        EObject this_ConfigurationElement_6 = null;

        EObject this_View_7 = null;

        EObject lv_restrictions_8_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:322:28: ( (this_Module_0= ruleModule | this_MetaModule_1= ruleMetaModule | this_ExternalModule_2= ruleExternalModule | this_MetaClass_3= ruleMetaClass | this_ExternalClass_4= ruleExternalClass | this_Method_5= ruleMethod | this_ConfigurationElement_6= ruleConfigurationElement | (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:323:1: (this_Module_0= ruleModule | this_MetaModule_1= ruleMetaModule | this_ExternalModule_2= ruleExternalModule | this_MetaClass_3= ruleMetaClass | this_ExternalClass_4= ruleExternalClass | this_Method_5= ruleMethod | this_ConfigurationElement_6= ruleConfigurationElement | (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:323:1: (this_Module_0= ruleModule | this_MetaModule_1= ruleMetaModule | this_ExternalModule_2= ruleExternalModule | this_MetaClass_3= ruleMetaClass | this_ExternalClass_4= ruleExternalClass | this_Method_5= ruleMethod | this_ConfigurationElement_6= ruleConfigurationElement | (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* ) )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            case 26:
                {
                alt12=6;
                }
                break;
            case 22:
            case 25:
            case 33:
            case 34:
                {
                alt12=7;
                }
                break;
            case 19:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:324:5: this_Module_0= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleAbstractComponent638);
                    this_Module_0=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:334:5: this_MetaModule_1= ruleMetaModule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMetaModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMetaModule_in_ruleAbstractComponent665);
                    this_MetaModule_1=ruleMetaModule();

                    state._fsp--;

                     
                            current = this_MetaModule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:344:5: this_ExternalModule_2= ruleExternalModule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getExternalModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalModule_in_ruleAbstractComponent692);
                    this_ExternalModule_2=ruleExternalModule();

                    state._fsp--;

                     
                            current = this_ExternalModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:354:5: this_MetaClass_3= ruleMetaClass
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMetaClassParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMetaClass_in_ruleAbstractComponent719);
                    this_MetaClass_3=ruleMetaClass();

                    state._fsp--;

                     
                            current = this_MetaClass_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:364:5: this_ExternalClass_4= ruleExternalClass
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getExternalClassParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExternalClass_in_ruleAbstractComponent746);
                    this_ExternalClass_4=ruleExternalClass();

                    state._fsp--;

                     
                            current = this_ExternalClass_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:374:5: this_Method_5= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMethodParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleAbstractComponent773);
                    this_Method_5=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:384:5: this_ConfigurationElement_6= ruleConfigurationElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getConfigurationElementParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleAbstractComponent800);
                    this_ConfigurationElement_6=ruleConfigurationElement();

                    state._fsp--;

                     
                            current = this_ConfigurationElement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:393:6: (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:393:6: (this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )* )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:394:5: this_View_7= ruleView ( (lv_restrictions_8_0= ruleRestriction ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getViewParserRuleCall_7_0()); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleAbstractComponent828);
                    this_View_7=ruleView();

                    state._fsp--;

                     
                            current = this_View_7; 
                            afterParserOrEnumRuleCall();
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:402:1: ( (lv_restrictions_8_0= ruleRestriction ) )*
                    loop11:
                    do {
                        int alt11=2;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:1: (lv_restrictions_8_0= ruleRestriction )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:403:1: (lv_restrictions_8_0= ruleRestriction )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:404:3: lv_restrictions_8_0= ruleRestriction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAbstractComponentAccess().getRestrictionsRestrictionParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRestriction_in_ruleAbstractComponent848);
                    	    lv_restrictions_8_0=ruleRestriction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAbstractComponentRule());
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
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleAttribute"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:428:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:429:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:430:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute886);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute896); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:437:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:440:28: ( ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:441:1: ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:441:1: ( ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:441:2: ( (lv_name_0_0= RULE_ID_ASML ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:441:2: ( (lv_name_0_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:442:1: (lv_name_0_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:442:1: (lv_name_0_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:443:3: lv_name_0_0= RULE_ID_ASML
            {
            lv_name_0_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleAttribute938); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAttribute955); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:463:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:464:1: (lv_value_2_0= RULE_STRING )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:464:1: (lv_value_2_0= RULE_STRING )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:465:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute972); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:489:1: entryRuleAbstractNameConvetion returns [EObject current=null] : iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF ;
    public final EObject entryRuleAbstractNameConvetion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNameConvetion = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:490:2: (iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:491:2: iv_ruleAbstractNameConvetion= ruleAbstractNameConvetion EOF
            {
             newCompositeNode(grammarAccess.getAbstractNameConvetionRule()); 
            pushFollow(FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion1013);
            iv_ruleAbstractNameConvetion=ruleAbstractNameConvetion();

            state._fsp--;

             current =iv_ruleAbstractNameConvetion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractNameConvetion1023); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:498:1: ruleAbstractNameConvetion returns [EObject current=null] : (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching ) ;
    public final EObject ruleAbstractNameConvetion() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;
        EObject this_ClassMatching_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:501:28: ( (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:502:1: (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:502:1: (this_STRING_0= RULE_STRING | this_ClassMatching_1= ruleClassMatching )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=44 && LA13_0<=46)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:502:2: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAbstractNameConvetion1059); 
                     
                        newLeafNode(this_STRING_0, grammarAccess.getAbstractNameConvetionAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:508:5: this_ClassMatching_1= ruleClassMatching
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNameConvetionAccess().getClassMatchingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClassMatching_in_ruleAbstractNameConvetion1086);
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


    // $ANTLR start "entryRuleModuleMatching"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:526:1: entryRuleModuleMatching returns [EObject current=null] : iv_ruleModuleMatching= ruleModuleMatching EOF ;
    public final EObject entryRuleModuleMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleMatching = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:527:2: (iv_ruleModuleMatching= ruleModuleMatching EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:528:2: iv_ruleModuleMatching= ruleModuleMatching EOF
            {
             newCompositeNode(grammarAccess.getModuleMatchingRule()); 
            pushFollow(FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching1123);
            iv_ruleModuleMatching=ruleModuleMatching();

            state._fsp--;

             current =iv_ruleModuleMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleMatching1133); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:535:1: ruleModuleMatching returns [EObject current=null] : ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) ) ;
    public final EObject ruleModuleMatching() throws RecognitionException {
        EObject current = null;

        Enumerator lv_parameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:538:28: ( ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:539:1: ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:539:1: ( (lv_parameter_0_0= ruleModuleMatchingParamenter ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:540:1: (lv_parameter_0_0= ruleModuleMatchingParamenter )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:540:1: (lv_parameter_0_0= ruleModuleMatchingParamenter )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:541:3: lv_parameter_0_0= ruleModuleMatchingParamenter
            {
             
            	        newCompositeNode(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleMatchingParamenter_in_ruleModuleMatching1178);
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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:565:1: entryRuleClassMatching returns [EObject current=null] : iv_ruleClassMatching= ruleClassMatching EOF ;
    public final EObject entryRuleClassMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMatching = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:566:2: (iv_ruleClassMatching= ruleClassMatching EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:567:2: iv_ruleClassMatching= ruleClassMatching EOF
            {
             newCompositeNode(grammarAccess.getClassMatchingRule()); 
            pushFollow(FOLLOW_ruleClassMatching_in_entryRuleClassMatching1213);
            iv_ruleClassMatching=ruleClassMatching();

            state._fsp--;

             current =iv_ruleClassMatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassMatching1223); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:574:1: ruleClassMatching returns [EObject current=null] : ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClassMatching() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_1_0=null;
        Enumerator lv_expressionMatching_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:577:28: ( ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:1: ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:1: ( ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:2: ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) ) ( (lv_parameter_1_0= RULE_STRING ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:578:2: ( (lv_expressionMatching_0_0= ruleExpressionMatchingClause ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:579:1: (lv_expressionMatching_0_0= ruleExpressionMatchingClause )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:579:1: (lv_expressionMatching_0_0= ruleExpressionMatchingClause )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:580:3: lv_expressionMatching_0_0= ruleExpressionMatchingClause
            {
             
            	        newCompositeNode(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionMatchingClause_in_ruleClassMatching1269);
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

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:596:2: ( (lv_parameter_1_0= RULE_STRING ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:597:1: (lv_parameter_1_0= RULE_STRING )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:597:1: (lv_parameter_1_0= RULE_STRING )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:598:3: lv_parameter_1_0= RULE_STRING
            {
            lv_parameter_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClassMatching1286); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:622:1: entryRuleConfigurationElement returns [EObject current=null] : iv_ruleConfigurationElement= ruleConfigurationElement EOF ;
    public final EObject entryRuleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationElement = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:623:2: (iv_ruleConfigurationElement= ruleConfigurationElement EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:624:2: iv_ruleConfigurationElement= ruleConfigurationElement EOF
            {
             newCompositeNode(grammarAccess.getConfigurationElementRule()); 
            pushFollow(FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1327);
            iv_ruleConfigurationElement=ruleConfigurationElement();

            state._fsp--;

             current =iv_ruleConfigurationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationElement1337); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:631:1: ruleConfigurationElement returns [EObject current=null] : (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile ) ;
    public final EObject ruleConfigurationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Configuration_0 = null;

        EObject this_XmlDocument_1 = null;

        EObject this_XmlElement_2 = null;

        EObject this_File_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:634:28: ( (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:635:1: (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:635:1: (this_Configuration_0= ruleConfiguration | this_XmlDocument_1= ruleXmlDocument | this_XmlElement_2= ruleXmlElement | this_File_3= ruleFile )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:636:5: this_Configuration_0= ruleConfiguration
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getConfigurationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConfiguration_in_ruleConfigurationElement1384);
                    this_Configuration_0=ruleConfiguration();

                    state._fsp--;

                     
                            current = this_Configuration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:646:5: this_XmlDocument_1= ruleXmlDocument
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getXmlDocumentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXmlDocument_in_ruleConfigurationElement1411);
                    this_XmlDocument_1=ruleXmlDocument();

                    state._fsp--;

                     
                            current = this_XmlDocument_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:656:5: this_XmlElement_2= ruleXmlElement
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getXmlElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleXmlElement_in_ruleConfigurationElement1438);
                    this_XmlElement_2=ruleXmlElement();

                    state._fsp--;

                     
                            current = this_XmlElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:666:5: this_File_3= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getConfigurationElementAccess().getFileParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFile_in_ruleConfigurationElement1465);
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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:682:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:683:2: (iv_ruleFile= ruleFile EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:684:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1500);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1510); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:691:1: ruleFile returns [EObject current=null] : (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:694:28: ( (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:695:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:695:1: (otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:695:3: otherlv_0= 'file' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFile1547); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:699:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:700:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:700:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:701:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleFile1564); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFile1581); 

                	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:721:1: (otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:721:3: otherlv_3= 'matching' ( (lv_matching_4_0= ruleAbstractNameConvetion ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleFile1594); 

                        	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:725:1: ( (lv_matching_4_0= ruleAbstractNameConvetion ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:726:1: (lv_matching_4_0= ruleAbstractNameConvetion )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:726:1: (lv_matching_4_0= ruleAbstractNameConvetion )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:727:3: lv_matching_4_0= ruleAbstractNameConvetion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFileAccess().getMatchingAbstractNameConvetionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractNameConvetion_in_ruleFile1615);
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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFile1627); 

                        	newLeafNode(otherlv_5, grammarAccess.getFileAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:747:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:747:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleFile1642); 

                        	newLeafNode(otherlv_6, grammarAccess.getFileAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:751:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:752:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:752:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:753:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getFileAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleFile1663);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleFile1675); 

                        	newLeafNode(otherlv_8, grammarAccess.getFileAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleFile1689); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:785:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:786:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:787:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_ruleConfiguration_in_entryRuleConfiguration1725);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfiguration1735); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:794:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:797:28: ( (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:798:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:798:1: (otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:798:3: otherlv_0= 'configuration' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? ( (lv_configurationElement_9_0= ruleConfigurationElement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleConfiguration1772); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:802:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:803:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:803:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:804:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleConfiguration1789); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleConfiguration1806); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:824:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:824:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleConfiguration1819); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:828:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:829:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:829:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:830:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfiguration1836); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleConfiguration1853); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:850:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:850:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleConfiguration1868); 

                        	newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:854:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:855:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:855:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:856:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleConfiguration1889);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleConfiguration1901); 

                        	newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:876:3: ( (lv_configurationElement_9_0= ruleConfigurationElement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22||LA19_0==25||(LA19_0>=33 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:877:1: (lv_configurationElement_9_0= ruleConfigurationElement )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:877:1: (lv_configurationElement_9_0= ruleConfigurationElement )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:878:3: lv_configurationElement_9_0= ruleConfigurationElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationElementConfigurationElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurationElement_in_ruleConfiguration1924);
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
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleConfiguration1937); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:906:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:907:2: (iv_ruleMethod= ruleMethod EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:908:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1973);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1983); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:915:1: ruleMethod returns [EObject current=null] : (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:918:28: ( (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:919:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:919:1: (otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:919:3: otherlv_0= 'method' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMethod2020); 

                	newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:923:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:924:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:924:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:925:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleMethod2037); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMethod2054); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:945:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:945:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleMethod2067); 

                        	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:949:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:950:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:950:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:951:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMethod2084); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMethod2101); 

                        	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:971:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:971:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleMethod2116); 

                        	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:975:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:976:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:976:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:977:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleMethod2137);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleMethod2149); 

                        	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleMethod2163); 

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


    // $ANTLR start "entryRuleMetaClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1009:1: entryRuleMetaClass returns [EObject current=null] : iv_ruleMetaClass= ruleMetaClass EOF ;
    public final EObject entryRuleMetaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaClass = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1010:2: (iv_ruleMetaClass= ruleMetaClass EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1011:2: iv_ruleMetaClass= ruleMetaClass EOF
            {
             newCompositeNode(grammarAccess.getMetaClassRule()); 
            pushFollow(FOLLOW_ruleMetaClass_in_entryRuleMetaClass2199);
            iv_ruleMetaClass=ruleMetaClass();

            state._fsp--;

             current =iv_ruleMetaClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaClass2209); 

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
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1018:1: ruleMetaClass returns [EObject current=null] : (otherlv_0= 'meta-class' ( (lv_name_1_0= RULE_ID_ASML ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )? (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )? (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )? ( (lv_methods_14_0= ruleMethod ) )* otherlv_15= '}' ) ;
    public final EObject ruleMetaClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_matching_9_0 = null;

        Enumerator lv_cardinality_12_0 = null;

        EObject lv_methods_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1021:28: ( (otherlv_0= 'meta-class' ( (lv_name_1_0= RULE_ID_ASML ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )? (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )? (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )? ( (lv_methods_14_0= ruleMethod ) )* otherlv_15= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1022:1: (otherlv_0= 'meta-class' ( (lv_name_1_0= RULE_ID_ASML ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )? (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )? (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )? ( (lv_methods_14_0= ruleMethod ) )* otherlv_15= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1022:1: (otherlv_0= 'meta-class' ( (lv_name_1_0= RULE_ID_ASML ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )? (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )? (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )? ( (lv_methods_14_0= ruleMethod ) )* otherlv_15= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1022:3: otherlv_0= 'meta-class' ( (lv_name_1_0= RULE_ID_ASML ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )? (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )? (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )? ( (lv_methods_14_0= ruleMethod ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMetaClass2246); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaClassAccess().getMetaClassKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1026:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1027:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1027:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1028:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleMetaClass2263); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetaClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1044:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1044:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleMetaClass2281); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetaClassAccess().getExtendsKeyword_2_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1048:1: ( ( ruleQualifiedName ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1049:1: ( ruleQualifiedName )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1049:1: ( ruleQualifiedName )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1050:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMetaClassAccess().getExtendsMetaClassCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMetaClass2304);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMetaClass2318); 

                	newLeafNode(otherlv_4, grammarAccess.getMetaClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1067:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1067:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleMetaClass2331); 

                        	newLeafNode(otherlv_5, grammarAccess.getMetaClassAccess().getDescriptionKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1071:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1072:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1072:1: (lv_description_6_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1073:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetaClass2348); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getMetaClassAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMetaClass2365); 

                        	newLeafNode(otherlv_7, grammarAccess.getMetaClassAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1093:3: (otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1093:5: otherlv_8= 'matching:' ( (lv_matching_9_0= ruleAbstractNameConvetion ) ) otherlv_10= ';'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleMetaClass2380); 

                        	newLeafNode(otherlv_8, grammarAccess.getMetaClassAccess().getMatchingKeyword_5_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1097:1: ( (lv_matching_9_0= ruleAbstractNameConvetion ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1098:1: (lv_matching_9_0= ruleAbstractNameConvetion )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1098:1: (lv_matching_9_0= ruleAbstractNameConvetion )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1099:3: lv_matching_9_0= ruleAbstractNameConvetion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaClassAccess().getMatchingAbstractNameConvetionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractNameConvetion_in_ruleMetaClass2401);
                    lv_matching_9_0=ruleAbstractNameConvetion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_9_0, 
                            		"AbstractNameConvetion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleMetaClass2413); 

                        	newLeafNode(otherlv_10, grammarAccess.getMetaClassAccess().getSemicolonKeyword_5_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1119:3: (otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1119:5: otherlv_11= 'cardinality' ( (lv_cardinality_12_0= ruleCardinality ) ) otherlv_13= ';'
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleMetaClass2428); 

                        	newLeafNode(otherlv_11, grammarAccess.getMetaClassAccess().getCardinalityKeyword_6_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1123:1: ( (lv_cardinality_12_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1124:1: (lv_cardinality_12_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1124:1: (lv_cardinality_12_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1125:3: lv_cardinality_12_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaClassAccess().getCardinalityCardinalityEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleMetaClass2449);
                    lv_cardinality_12_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_12_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleMetaClass2461); 

                        	newLeafNode(otherlv_13, grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1145:3: ( (lv_methods_14_0= ruleMethod ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1146:1: (lv_methods_14_0= ruleMethod )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1146:1: (lv_methods_14_0= ruleMethod )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1147:3: lv_methods_14_0= ruleMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaClassAccess().getMethodsMethodParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethod_in_ruleMetaClass2484);
            	    lv_methods_14_0=ruleMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_14_0, 
            	            		"Method");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleMetaClass2497); 

                	newLeafNode(otherlv_15, grammarAccess.getMetaClassAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleExternalClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1175:1: entryRuleExternalClass returns [EObject current=null] : iv_ruleExternalClass= ruleExternalClass EOF ;
    public final EObject entryRuleExternalClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalClass = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1176:2: (iv_ruleExternalClass= ruleExternalClass EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1177:2: iv_ruleExternalClass= ruleExternalClass EOF
            {
             newCompositeNode(grammarAccess.getExternalClassRule()); 
            pushFollow(FOLLOW_ruleExternalClass_in_entryRuleExternalClass2533);
            iv_ruleExternalClass=ruleExternalClass();

            state._fsp--;

             current =iv_ruleExternalClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalClass2543); 

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
    // $ANTLR end "entryRuleExternalClass"


    // $ANTLR start "ruleExternalClass"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1184:1: ruleExternalClass returns [EObject current=null] : (otherlv_0= 'external-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
    public final EObject ruleExternalClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1187:28: ( (otherlv_0= 'external-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1188:1: (otherlv_0= 'external-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1188:1: (otherlv_0= 'external-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1188:3: otherlv_0= 'external-class' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleExternalClass2580); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalClassAccess().getExternalClassKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1192:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1193:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1193:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1194:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleExternalClass2597); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalClassAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExternalClass2614); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalClassAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1214:1: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1214:3: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleExternalClass2627); 

                        	newLeafNode(otherlv_3, grammarAccess.getExternalClassAccess().getDescriptionKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1218:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1219:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1219:1: (lv_description_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1220:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExternalClass2644); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getExternalClassAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternalClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleExternalClass2661); 

                        	newLeafNode(otherlv_5, grammarAccess.getExternalClassAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1240:3: (otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1240:5: otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleExternalClass2676); 

                        	newLeafNode(otherlv_6, grammarAccess.getExternalClassAccess().getTypeKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1244:1: ( (lv_type_7_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1245:1: (lv_type_7_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1245:1: (lv_type_7_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1246:3: lv_type_7_0= RULE_STRING
                    {
                    lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExternalClass2693); 

                    			newLeafNode(lv_type_7_0, grammarAccess.getExternalClassAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExternalClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleExternalClass2710); 

                        	newLeafNode(otherlv_8, grammarAccess.getExternalClassAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleExternalClass2724); 

                	newLeafNode(otherlv_9, grammarAccess.getExternalClassAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleExternalClass"


    // $ANTLR start "entryRuleXmlElement"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1278:1: entryRuleXmlElement returns [EObject current=null] : iv_ruleXmlElement= ruleXmlElement EOF ;
    public final EObject entryRuleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlElement = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1279:2: (iv_ruleXmlElement= ruleXmlElement EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1280:2: iv_ruleXmlElement= ruleXmlElement EOF
            {
             newCompositeNode(grammarAccess.getXmlElementRule()); 
            pushFollow(FOLLOW_ruleXmlElement_in_entryRuleXmlElement2760);
            iv_ruleXmlElement=ruleXmlElement();

            state._fsp--;

             current =iv_ruleXmlElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlElement2770); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1287:1: ruleXmlElement returns [EObject current=null] : (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1290:28: ( (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1291:1: (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1291:1: (otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1291:3: otherlv_0= 'xmlElement' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleXmlElement2807); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlElementAccess().getXmlElementKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1295:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1296:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1296:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1297:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleXmlElement2824); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXmlElement2841); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1317:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1317:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXmlElement2854); 

                        	newLeafNode(otherlv_3, grammarAccess.getXmlElementAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1321:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1322:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1322:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1323:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXmlElement2871); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXmlElement2888); 

                        	newLeafNode(otherlv_5, grammarAccess.getXmlElementAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1343:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1343:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXmlElement2903); 

                        	newLeafNode(otherlv_6, grammarAccess.getXmlElementAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1347:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1348:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1348:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1349:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getXmlElementAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleXmlElement2924);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleXmlElement2936); 

                        	newLeafNode(otherlv_8, grammarAccess.getXmlElementAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleXmlElement2950); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1381:1: entryRuleXmlDocument returns [EObject current=null] : iv_ruleXmlDocument= ruleXmlDocument EOF ;
    public final EObject entryRuleXmlDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlDocument = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1382:2: (iv_ruleXmlDocument= ruleXmlDocument EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1383:2: iv_ruleXmlDocument= ruleXmlDocument EOF
            {
             newCompositeNode(grammarAccess.getXmlDocumentRule()); 
            pushFollow(FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument2986);
            iv_ruleXmlDocument=ruleXmlDocument();

            state._fsp--;

             current =iv_ruleXmlDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXmlDocument2996); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1390:1: ruleXmlDocument returns [EObject current=null] : (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1393:28: ( (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1394:1: (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1394:1: (otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1394:3: otherlv_0= 'xmlDocument' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )? (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleXmlDocument3033); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlDocumentAccess().getXmlDocumentKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1398:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1399:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1399:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1400:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleXmlDocument3050); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXmlDocument3067); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlDocumentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1420:1: (otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1420:3: otherlv_3= 'matching' ( (lv_matching_4_0= RULE_STRING ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXmlDocument3080); 

                        	newLeafNode(otherlv_3, grammarAccess.getXmlDocumentAccess().getMatchingKeyword_3_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1424:1: ( (lv_matching_4_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1425:1: (lv_matching_4_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1425:1: (lv_matching_4_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1426:3: lv_matching_4_0= RULE_STRING
                    {
                    lv_matching_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXmlDocument3097); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXmlDocument3114); 

                        	newLeafNode(otherlv_5, grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1446:3: (otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1446:5: otherlv_6= 'cardinality' ( (lv_cardinality_7_0= ruleCardinality ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXmlDocument3129); 

                        	newLeafNode(otherlv_6, grammarAccess.getXmlDocumentAccess().getCardinalityKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1450:1: ( (lv_cardinality_7_0= ruleCardinality ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1451:1: (lv_cardinality_7_0= ruleCardinality )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1451:1: (lv_cardinality_7_0= ruleCardinality )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1452:3: lv_cardinality_7_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getXmlDocumentAccess().getCardinalityCardinalityEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleXmlDocument3150);
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

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleXmlDocument3162); 

                        	newLeafNode(otherlv_8, grammarAccess.getXmlDocumentAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleXmlDocument3176); 

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


    // $ANTLR start "entryRuleModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1484:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1485:2: (iv_ruleModule= ruleModule EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1486:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule3212);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule3222); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1493:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1496:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1497:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1497:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1497:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleModule3259); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1501:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1502:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1502:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1503:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleModule3276); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModule3293); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1523:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15||LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1523:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1523:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==20) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1523:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleModule3307); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1527:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1528:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1528:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1529:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleModule3328);
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

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1545:2: (otherlv_5= ',' )?
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==17) ) {
                    	        alt33=1;
                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1545:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleModule3341); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleModule3357); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1553:3: (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1553:5: otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleModule3372); 

                        	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1557:1: ( (lv_matching_8_0= ruleModuleMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1558:1: (lv_matching_8_0= ruleModuleMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1558:1: (lv_matching_8_0= ruleModuleMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1559:3: lv_matching_8_0= ruleModuleMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleMatching_in_ruleModule3393);
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

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleModule3405); 

                        	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1579:3: ( (lv_components_10_0= ruleAbstractComponent ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==19||LA37_0==22||(LA37_0>=25 && LA37_0<=27)||LA37_0==31||(LA37_0>=33 && LA37_0<=37)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1580:1: (lv_components_10_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1580:1: (lv_components_10_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1581:3: lv_components_10_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleModule3428);
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
            	    break loop37;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1597:3: ( (lv_restrictions_11_0= ruleRestriction ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1598:1: (lv_restrictions_11_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1598:1: (lv_restrictions_11_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1599:3: lv_restrictions_11_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleModule3450);
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
            	    break loop38;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleModule3463); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1627:1: entryRuleMetaModule returns [EObject current=null] : iv_ruleMetaModule= ruleMetaModule EOF ;
    public final EObject entryRuleMetaModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaModule = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1628:2: (iv_ruleMetaModule= ruleMetaModule EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1629:2: iv_ruleMetaModule= ruleMetaModule EOF
            {
             newCompositeNode(grammarAccess.getMetaModuleRule()); 
            pushFollow(FOLLOW_ruleMetaModule_in_entryRuleMetaModule3499);
            iv_ruleMetaModule=ruleMetaModule();

            state._fsp--;

             current =iv_ruleMetaModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModule3509); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1636:1: ruleMetaModule returns [EObject current=null] : (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1639:28: ( (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1640:1: (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1640:1: (otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1640:3: otherlv_0= 'meta-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleMetaModule3546); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaModuleAccess().getMetaModuleKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1644:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1645:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1645:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1646:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleMetaModule3563); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMetaModule3580); 

                	newLeafNode(otherlv_2, grammarAccess.getMetaModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1666:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15||LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1666:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1666:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1666:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMetaModule3594); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMetaModuleAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1670:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1671:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1671:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1672:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleMetaModule3615);
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

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1688:2: (otherlv_5= ',' )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==17) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1688:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleMetaModule3628); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getMetaModuleAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMetaModule3644); 

                        	newLeafNode(otherlv_6, grammarAccess.getMetaModuleAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1696:3: (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1696:5: otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleMetaModule3659); 

                        	newLeafNode(otherlv_7, grammarAccess.getMetaModuleAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1700:1: ( (lv_matching_8_0= ruleModuleMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1701:1: (lv_matching_8_0= ruleModuleMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1701:1: (lv_matching_8_0= ruleModuleMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1702:3: lv_matching_8_0= ruleModuleMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleMatching_in_ruleMetaModule3680);
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

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleMetaModule3692); 

                        	newLeafNode(otherlv_9, grammarAccess.getMetaModuleAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1722:3: ( (lv_components_10_0= ruleAbstractComponent ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==19||LA43_0==22||(LA43_0>=25 && LA43_0<=27)||LA43_0==31||(LA43_0>=33 && LA43_0<=37)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1723:1: (lv_components_10_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1723:1: (lv_components_10_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1724:3: lv_components_10_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleMetaModule3715);
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
            	    break loop43;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1740:3: ( (lv_restrictions_11_0= ruleRestriction ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==39) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1741:1: (lv_restrictions_11_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1741:1: (lv_restrictions_11_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1742:3: lv_restrictions_11_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleMetaModule3737);
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
            	    break loop44;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleMetaModule3750); 

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


    // $ANTLR start "entryRuleExternalModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1770:1: entryRuleExternalModule returns [EObject current=null] : iv_ruleExternalModule= ruleExternalModule EOF ;
    public final EObject entryRuleExternalModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalModule = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1771:2: (iv_ruleExternalModule= ruleExternalModule EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1772:2: iv_ruleExternalModule= ruleExternalModule EOF
            {
             newCompositeNode(grammarAccess.getExternalModuleRule()); 
            pushFollow(FOLLOW_ruleExternalModule_in_entryRuleExternalModule3786);
            iv_ruleExternalModule=ruleExternalModule();

            state._fsp--;

             current =iv_ruleExternalModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalModule3796); 

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
    // $ANTLR end "entryRuleExternalModule"


    // $ANTLR start "ruleExternalModule"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1779:1: ruleExternalModule returns [EObject current=null] : (otherlv_0= 'external-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) ;
    public final EObject ruleExternalModule() throws RecognitionException {
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1782:28: ( (otherlv_0= 'external-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1783:1: (otherlv_0= 'external-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1783:1: (otherlv_0= 'external-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1783:3: otherlv_0= 'external-module' ( (lv_name_1_0= RULE_ID_ASML ) ) otherlv_2= '{' ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )? (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )? ( (lv_components_10_0= ruleAbstractComponent ) )* ( (lv_restrictions_11_0= ruleRestriction ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExternalModule3833); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalModuleAccess().getExternalModuleKeyword_0());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1787:1: ( (lv_name_1_0= RULE_ID_ASML ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1788:1: (lv_name_1_0= RULE_ID_ASML )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1788:1: (lv_name_1_0= RULE_ID_ASML )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1789:3: lv_name_1_0= RULE_ID_ASML
            {
            lv_name_1_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleExternalModule3850); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalModuleAccess().getNameID_ASMLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID_ASML");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExternalModule3867); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1809:1: ( (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15||LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1809:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )* otherlv_6= ';'
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1809:2: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )? )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1809:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' )?
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExternalModule3881); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getExternalModuleAccess().getAttributesKeyword_3_0_0());
                    	        
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1813:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1814:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1814:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1815:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExternalModuleAccess().getAttributesAttributeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleExternalModule3902);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExternalModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1831:2: (otherlv_5= ',' )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==17) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1831:4: otherlv_5= ','
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExternalModule3915); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getExternalModuleAccess().getCommaKeyword_3_0_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleExternalModule3931); 

                        	newLeafNode(otherlv_6, grammarAccess.getExternalModuleAccess().getSemicolonKeyword_3_1());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1839:3: (otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1839:5: otherlv_7= 'matching' ( (lv_matching_8_0= ruleModuleMatching ) ) otherlv_9= ';'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleExternalModule3946); 

                        	newLeafNode(otherlv_7, grammarAccess.getExternalModuleAccess().getMatchingKeyword_4_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1843:1: ( (lv_matching_8_0= ruleModuleMatching ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1844:1: (lv_matching_8_0= ruleModuleMatching )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1844:1: (lv_matching_8_0= ruleModuleMatching )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1845:3: lv_matching_8_0= ruleModuleMatching
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalModuleAccess().getMatchingModuleMatchingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModuleMatching_in_ruleExternalModule3967);
                    lv_matching_8_0=ruleModuleMatching();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExternalModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"matching",
                            		lv_matching_8_0, 
                            		"ModuleMatching");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleExternalModule3979); 

                        	newLeafNode(otherlv_9, grammarAccess.getExternalModuleAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1865:3: ( (lv_components_10_0= ruleAbstractComponent ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==19||LA49_0==22||(LA49_0>=25 && LA49_0<=27)||LA49_0==31||(LA49_0>=33 && LA49_0<=37)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1866:1: (lv_components_10_0= ruleAbstractComponent )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1866:1: (lv_components_10_0= ruleAbstractComponent )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1867:3: lv_components_10_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalModuleAccess().getComponentsAbstractComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleExternalModule4002);
            	    lv_components_10_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalModuleRule());
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
            	    break loop49;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1883:3: ( (lv_restrictions_11_0= ruleRestriction ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==39) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1884:1: (lv_restrictions_11_0= ruleRestriction )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1884:1: (lv_restrictions_11_0= ruleRestriction )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1885:3: lv_restrictions_11_0= ruleRestriction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalModuleAccess().getRestrictionsRestrictionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestriction_in_ruleExternalModule4024);
            	    lv_restrictions_11_0=ruleRestriction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalModuleRule());
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
            	    break loop50;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleExternalModule4037); 

                	newLeafNode(otherlv_12, grammarAccess.getExternalModuleAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleExternalModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1913:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1914:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1915:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4074);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4085); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1922:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_ASML_0=null;
        Token kw=null;
        Token this_ID_ASML_2=null;

         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1925:28: ( (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1926:1: (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1926:1: (this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )* )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1926:6: this_ID_ASML_0= RULE_ID_ASML (kw= '.' this_ID_ASML_2= RULE_ID_ASML )*
            {
            this_ID_ASML_0=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4125); 

            		current.merge(this_ID_ASML_0);
                
             
                newLeafNode(this_ID_ASML_0, grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_0()); 
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1933:1: (kw= '.' this_ID_ASML_2= RULE_ID_ASML )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==38) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1934:2: kw= '.' this_ID_ASML_2= RULE_ID_ASML
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName4144); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_ASML_2=(Token)match(input,RULE_ID_ASML,FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4159); 

            	    		current.merge(this_ID_ASML_2);
            	        
            	     
            	        newLeafNode(this_ID_ASML_2, grammarAccess.getQualifiedNameAccess().getID_ASMLTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1954:1: entryRuleRestriction returns [EObject current=null] : iv_ruleRestriction= ruleRestriction EOF ;
    public final EObject entryRuleRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestriction = null;


        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1955:2: (iv_ruleRestriction= ruleRestriction EOF )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1956:2: iv_ruleRestriction= ruleRestriction EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRule()); 
            pushFollow(FOLLOW_ruleRestriction_in_entryRuleRestriction4206);
            iv_ruleRestriction=ruleRestriction();

            state._fsp--;

             current =iv_ruleRestriction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestriction4216); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1963:1: ruleRestriction returns [EObject current=null] : (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_groupClause_2_0 = null;

        Enumerator lv_permissionClause_4_0 = null;

        Enumerator lv_relactionType_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1966:28: ( (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1967:1: (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1967:1: (otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1967:3: otherlv_0= 'restriction' otherlv_1= '{' ( (lv_groupClause_2_0= ruleGroupClause ) )? ( ( ruleQualifiedName ) )* ( (lv_permissionClause_4_0= rulePermissionClause ) )? ( (lv_relactionType_5_0= ruleRelactionType ) ) ( ( ruleQualifiedName ) ) (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleRestriction4253); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictionAccess().getRestrictionKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRestriction4265); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1975:1: ( (lv_groupClause_2_0= ruleGroupClause ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=51 && LA52_0<=54)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1976:1: (lv_groupClause_2_0= ruleGroupClause )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1976:1: (lv_groupClause_2_0= ruleGroupClause )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1977:3: lv_groupClause_2_0= ruleGroupClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getRestrictionAccess().getGroupClauseGroupClauseEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleRestriction4286);
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

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1993:3: ( ( ruleQualifiedName ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID_ASML) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1994:1: ( ruleQualifiedName )
            	    {
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1994:1: ( ruleQualifiedName )
            	    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:1995:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRestrictionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionAccess().getComponentAAbstractComponentCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRestriction4310);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2008:3: ( (lv_permissionClause_4_0= rulePermissionClause ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51||(LA54_0>=55 && LA54_0<=57)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2009:1: (lv_permissionClause_4_0= rulePermissionClause )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2009:1: (lv_permissionClause_4_0= rulePermissionClause )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2010:3: lv_permissionClause_4_0= rulePermissionClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getRestrictionAccess().getPermissionClausePermissionClauseEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulePermissionClause_in_ruleRestriction4332);
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

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2026:3: ( (lv_relactionType_5_0= ruleRelactionType ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2027:1: (lv_relactionType_5_0= ruleRelactionType )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2027:1: (lv_relactionType_5_0= ruleRelactionType )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2028:3: lv_relactionType_5_0= ruleRelactionType
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionAccess().getRelactionTypeRelactionTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleRelactionType_in_ruleRestriction4354);
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

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2044:2: ( ( ruleQualifiedName ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2045:1: ( ruleQualifiedName )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2045:1: ( ruleQualifiedName )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2046:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRestrictionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRestrictionAccess().getComponentBAbstractComponentCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRestriction4377);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2059:2: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2059:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleRestriction4390); 

                        	newLeafNode(otherlv_7, grammarAccess.getRestrictionAccess().getDescriptionKeyword_7_0());
                        
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2063:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2064:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2064:1: (lv_description_8_0= RULE_STRING )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2065:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRestriction4407); 

                    			newLeafNode(lv_description_8_0, grammarAccess.getRestrictionAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestrictionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleRestriction4426); 

                	newLeafNode(otherlv_9, grammarAccess.getRestrictionAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2093:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2095:28: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt56=1;
                }
                break;
            case 41:
                {
                alt56=2;
                }
                break;
            case 42:
                {
                alt56=3;
                }
                break;
            case 43:
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
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:2: (enumLiteral_0= '1' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:2: (enumLiteral_0= '1' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2096:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleCardinality4476); 

                            current = grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getOneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2102:6: (enumLiteral_1= '0' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2102:6: (enumLiteral_1= '0' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2102:8: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleCardinality4493); 

                            current = grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getZeroEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2108:6: (enumLiteral_2= '1..*' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2108:6: (enumLiteral_2= '1..*' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2108:8: enumLiteral_2= '1..*'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleCardinality4510); 

                            current = grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getOneOrManyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2114:6: (enumLiteral_3= '0..*' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2114:6: (enumLiteral_3= '0..*' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2114:8: enumLiteral_3= '0..*'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleCardinality4527); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2124:1: ruleExpressionMatchingClause returns [Enumerator current=null] : ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) | (enumLiteral_2= 'annotated with' ) ) ;
    public final Enumerator ruleExpressionMatchingClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2126:28: ( ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) | (enumLiteral_2= 'annotated with' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2127:1: ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) | (enumLiteral_2= 'annotated with' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2127:1: ( (enumLiteral_0= 'name start with' ) | (enumLiteral_1= 'name ends with' ) | (enumLiteral_2= 'annotated with' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt57=1;
                }
                break;
            case 45:
                {
                alt57=2;
                }
                break;
            case 46:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2127:2: (enumLiteral_0= 'name start with' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2127:2: (enumLiteral_0= 'name start with' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2127:4: enumLiteral_0= 'name start with'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleExpressionMatchingClause4572); 

                            current = grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getExpressionMatchingClauseAccess().getNAME_START_WITHEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2133:6: (enumLiteral_1= 'name ends with' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2133:6: (enumLiteral_1= 'name ends with' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2133:8: enumLiteral_1= 'name ends with'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleExpressionMatchingClause4589); 

                            current = grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getExpressionMatchingClauseAccess().getNAME_ENDS_WITHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2139:6: (enumLiteral_2= 'annotated with' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2139:6: (enumLiteral_2= 'annotated with' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2139:8: enumLiteral_2= 'annotated with'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleExpressionMatchingClause4606); 

                            current = grammarAccess.getExpressionMatchingClauseAccess().getANNOTATED_WITHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getExpressionMatchingClauseAccess().getANNOTATED_WITHEnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleModuleMatchingParamenter"
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2149:1: ruleModuleMatchingParamenter returns [Enumerator current=null] : ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) ) ;
    public final Enumerator ruleModuleMatchingParamenter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2151:28: ( ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2152:1: ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2152:1: ( (enumLiteral_0= 'by package name' ) | (enumLiteral_1= 'by folder name' ) | (enumLiteral_2= 'by package and folder name' ) | (enumLiteral_3= 'by external implementation' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt58=1;
                }
                break;
            case 48:
                {
                alt58=2;
                }
                break;
            case 49:
                {
                alt58=3;
                }
                break;
            case 50:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2152:2: (enumLiteral_0= 'by package name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2152:2: (enumLiteral_0= 'by package name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2152:4: enumLiteral_0= 'by package name'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleModuleMatchingParamenter4651); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2158:6: (enumLiteral_1= 'by folder name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2158:6: (enumLiteral_1= 'by folder name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2158:8: enumLiteral_1= 'by folder name'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleModuleMatchingParamenter4668); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getModuleMatchingParamenterAccess().getFOLDEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2164:6: (enumLiteral_2= 'by package and folder name' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2164:6: (enumLiteral_2= 'by package and folder name' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2164:8: enumLiteral_2= 'by package and folder name'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleModuleMatchingParamenter4685); 

                            current = grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getModuleMatchingParamenterAccess().getPAKCAGE_AND_FOLDEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2170:6: (enumLiteral_3= 'by external implementation' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2170:6: (enumLiteral_3= 'by external implementation' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2170:8: enumLiteral_3= 'by external implementation'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleModuleMatchingParamenter4702); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2180:1: ruleGroupClause returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) ) ;
    public final Enumerator ruleGroupClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2182:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2183:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2183:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'only' ) | (enumLiteral_2= 'any' ) | (enumLiteral_3= 'no one' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt59=1;
                }
                break;
            case 52:
                {
                alt59=2;
                }
                break;
            case 53:
                {
                alt59=3;
                }
                break;
            case 54:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2183:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2183:2: (enumLiteral_0= 'null' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2183:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleGroupClause4747); 

                            current = grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGroupClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2189:6: (enumLiteral_1= 'only' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2189:6: (enumLiteral_1= 'only' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2189:8: enumLiteral_1= 'only'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleGroupClause4764); 

                            current = grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGroupClauseAccess().getONLYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2195:6: (enumLiteral_2= 'any' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2195:6: (enumLiteral_2= 'any' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2195:8: enumLiteral_2= 'any'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleGroupClause4781); 

                            current = grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGroupClauseAccess().getANYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2201:6: (enumLiteral_3= 'no one' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2201:6: (enumLiteral_3= 'no one' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2201:8: enumLiteral_3= 'no one'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleGroupClause4798); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2211:1: rulePermissionClause returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) ) ;
    public final Enumerator rulePermissionClause() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2213:28: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2214:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2214:1: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'must' ) | (enumLiteral_2= 'can' ) | (enumLiteral_3= 'cannot' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt60=1;
                }
                break;
            case 55:
                {
                alt60=2;
                }
                break;
            case 56:
                {
                alt60=3;
                }
                break;
            case 57:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2214:2: (enumLiteral_0= 'null' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2214:2: (enumLiteral_0= 'null' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2214:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_rulePermissionClause4843); 

                            current = grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPermissionClauseAccess().getNULLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2220:6: (enumLiteral_1= 'must' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2220:6: (enumLiteral_1= 'must' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2220:8: enumLiteral_1= 'must'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_rulePermissionClause4860); 

                            current = grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPermissionClauseAccess().getMUSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2226:6: (enumLiteral_2= 'can' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2226:6: (enumLiteral_2= 'can' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2226:8: enumLiteral_2= 'can'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_rulePermissionClause4877); 

                            current = grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPermissionClauseAccess().getCANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2232:6: (enumLiteral_3= 'cannot' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2232:6: (enumLiteral_3= 'cannot' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2232:8: enumLiteral_3= 'cannot'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_rulePermissionClause4894); 

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
    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2242:1: ruleRelactionType returns [Enumerator current=null] : ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) ) ;
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
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2244:28: ( ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) ) )
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2245:1: ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) )
            {
            // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2245:1: ( (enumLiteral_0= 'access' ) | (enumLiteral_1= 'declare' ) | (enumLiteral_2= 'handle' ) | (enumLiteral_3= 'extend' ) | (enumLiteral_4= 'implement' ) | (enumLiteral_5= 'create' ) | (enumLiteral_6= 'throw' ) | (enumLiteral_7= 'use annotation' ) | (enumLiteral_8= 'depend' ) | (enumLiteral_9= 'requires' ) )
            int alt61=10;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt61=1;
                }
                break;
            case 59:
                {
                alt61=2;
                }
                break;
            case 60:
                {
                alt61=3;
                }
                break;
            case 61:
                {
                alt61=4;
                }
                break;
            case 62:
                {
                alt61=5;
                }
                break;
            case 63:
                {
                alt61=6;
                }
                break;
            case 64:
                {
                alt61=7;
                }
                break;
            case 65:
                {
                alt61=8;
                }
                break;
            case 66:
                {
                alt61=9;
                }
                break;
            case 67:
                {
                alt61=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2245:2: (enumLiteral_0= 'access' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2245:2: (enumLiteral_0= 'access' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2245:4: enumLiteral_0= 'access'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleRelactionType4939); 

                            current = grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRelactionTypeAccess().getACCESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2251:6: (enumLiteral_1= 'declare' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2251:6: (enumLiteral_1= 'declare' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2251:8: enumLiteral_1= 'declare'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleRelactionType4956); 

                            current = grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRelactionTypeAccess().getDECLAREEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2257:6: (enumLiteral_2= 'handle' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2257:6: (enumLiteral_2= 'handle' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2257:8: enumLiteral_2= 'handle'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleRelactionType4973); 

                            current = grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRelactionTypeAccess().getHANDLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2263:6: (enumLiteral_3= 'extend' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2263:6: (enumLiteral_3= 'extend' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2263:8: enumLiteral_3= 'extend'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_61_in_ruleRelactionType4990); 

                            current = grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRelactionTypeAccess().getEXTENDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2269:6: (enumLiteral_4= 'implement' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2269:6: (enumLiteral_4= 'implement' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2269:8: enumLiteral_4= 'implement'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_62_in_ruleRelactionType5007); 

                            current = grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRelactionTypeAccess().getIMPLEMENTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2275:6: (enumLiteral_5= 'create' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2275:6: (enumLiteral_5= 'create' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2275:8: enumLiteral_5= 'create'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_63_in_ruleRelactionType5024); 

                            current = grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRelactionTypeAccess().getCREATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2281:6: (enumLiteral_6= 'throw' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2281:6: (enumLiteral_6= 'throw' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2281:8: enumLiteral_6= 'throw'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_64_in_ruleRelactionType5041); 

                            current = grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRelactionTypeAccess().getTHROWEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:6: (enumLiteral_7= 'use annotation' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:6: (enumLiteral_7= 'use annotation' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2287:8: enumLiteral_7= 'use annotation'
                    {
                    enumLiteral_7=(Token)match(input,65,FOLLOW_65_in_ruleRelactionType5058); 

                            current = grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRelactionTypeAccess().getUSEANOTATIONEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:6: (enumLiteral_8= 'depend' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:6: (enumLiteral_8= 'depend' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2293:8: enumLiteral_8= 'depend'
                    {
                    enumLiteral_8=(Token)match(input,66,FOLLOW_66_in_ruleRelactionType5075); 

                            current = grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRelactionTypeAccess().getDEPENDEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2299:6: (enumLiteral_9= 'requires' )
                    {
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2299:6: (enumLiteral_9= 'requires' )
                    // ../br.ufmg.dcc.asml/src-gen/br/ufmg/dcc/asml/parser/antlr/internal/InternalASMLModel.g:2299:8: enumLiteral_9= 'requires'
                    {
                    enumLiteral_9=(Token)match(input,67,FOLLOW_67_in_ruleRelactionType5092); 

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\37\uffff";
    static final String DFA11_eofS =
        "\1\2\36\uffff";
    static final String DFA11_minS =
        "\1\22\1\15\1\uffff\6\4\3\72\12\4\1\72\1\4\1\22\2\4\1\5\1\uffff"+
        "\2\22";
    static final String DFA11_maxS =
        "\1\47\1\15\1\uffff\11\103\12\4\1\103\1\4\1\46\1\103\1\4\1\5\1\uffff"+
        "\1\46\1\22";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\31\uffff\1\1\2\uffff";
    static final String DFA11_specialS =
        "\37\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\2\2\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff\5\2\1\uffff"+
            "\1\1",
            "\1\3",
            "",
            "\1\10\56\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\56\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\56\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\56\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\56\uffff\1\26\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\10\41\uffff\1\27\14\uffff\1\26\3\uffff\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
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
            "\1\34\12\uffff\1\33\10\uffff\1\32",
            "\1\10\41\uffff\1\27\14\uffff\1\26\3\uffff\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "\1\35",
            "\1\36",
            "",
            "\1\34\12\uffff\1\33\10\uffff\1\32",
            "\1\34"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 402:1: ( (lv_restrictions_8_0= ruleRestriction ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleASMLModel_in_entryRuleASMLModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASMLModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleASMLModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleASMLModel139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleASMLModel156 = new BitSet(new long[]{0x00000000000D4000L});
    public static final BitSet FOLLOW_14_in_ruleASMLModel169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleASMLModel186 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleASMLModel203 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_ruleView_in_ruleASMLModel226 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_16_in_ruleASMLModel240 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleASMLModel258 = new BitSet(new long[]{0x0000000000028020L});
    public static final BitSet FOLLOW_17_in_ruleASMLModel276 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleASMLModel292 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleASMLModel306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleView389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleView406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleView423 = new BitSet(new long[]{0x000000BE8E5C8000L});
    public static final BitSet FOLLOW_20_in_ruleView437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleView458 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleView471 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleView487 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleView510 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleView532 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_18_in_ruleView545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractComponent591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleAbstractComponent638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_ruleAbstractComponent665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalModule_in_ruleAbstractComponent692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaClass_in_ruleAbstractComponent719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_ruleAbstractComponent746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleAbstractComponent773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleAbstractComponent800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleAbstractComponent828 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleAbstractComponent848 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleAttribute938 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_entryRuleAbstractNameConvetion1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNameConvetion1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAbstractNameConvetion1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_ruleAbstractNameConvetion1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_entryRuleModuleMatching1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleMatching1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleMatchingParamenter_in_ruleModuleMatching1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassMatching_in_entryRuleClassMatching1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassMatching1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionMatchingClause_in_ruleClassMatching1269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClassMatching1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_entryRuleConfigurationElement1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationElement1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_ruleConfigurationElement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_ruleConfigurationElement1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_ruleConfigurationElement1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleConfigurationElement1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFile1547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleFile1564 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFile1581 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_23_in_ruleFile1594 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_ruleFile1615 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile1627 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleFile1642 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleFile1663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile1675 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFile1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConfiguration1772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleConfiguration1789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConfiguration1806 = new BitSet(new long[]{0x0000000603C40000L});
    public static final BitSet FOLLOW_23_in_ruleConfiguration1819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfiguration1836 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfiguration1853 = new BitSet(new long[]{0x0000000603440000L});
    public static final BitSet FOLLOW_24_in_ruleConfiguration1868 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleConfiguration1889 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfiguration1901 = new BitSet(new long[]{0x0000000602440000L});
    public static final BitSet FOLLOW_ruleConfigurationElement_in_ruleConfiguration1924 = new BitSet(new long[]{0x0000000602440000L});
    public static final BitSet FOLLOW_18_in_ruleConfiguration1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMethod2020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleMethod2037 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMethod2054 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_23_in_ruleMethod2067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMethod2084 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod2101 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleMethod2116 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleMethod2137 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMethod2149 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMethod2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaClass_in_entryRuleMetaClass2199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaClass2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMetaClass2246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleMetaClass2263 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_28_in_ruleMetaClass2281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMetaClass2304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMetaClass2318 = new BitSet(new long[]{0x0000000065040000L});
    public static final BitSet FOLLOW_29_in_ruleMetaClass2331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaClass2348 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaClass2365 = new BitSet(new long[]{0x0000000045040000L});
    public static final BitSet FOLLOW_30_in_ruleMetaClass2380 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleAbstractNameConvetion_in_ruleMetaClass2401 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaClass2413 = new BitSet(new long[]{0x0000000005040000L});
    public static final BitSet FOLLOW_24_in_ruleMetaClass2428 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleMetaClass2449 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaClass2461 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMetaClass2484 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleMetaClass2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalClass_in_entryRuleExternalClass2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalClass2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExternalClass2580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleExternalClass2597 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalClass2614 = new BitSet(new long[]{0x0000000120040000L});
    public static final BitSet FOLLOW_29_in_ruleExternalClass2627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExternalClass2644 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalClass2661 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_32_in_ruleExternalClass2676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExternalClass2693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalClass2710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalClass2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXmlElement2807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleXmlElement2824 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXmlElement2841 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_23_in_ruleXmlElement2854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlElement2871 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlElement2888 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleXmlElement2903 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleXmlElement2924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlElement2936 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXmlElement2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXmlDocument_in_entryRuleXmlDocument2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXmlDocument2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleXmlDocument3033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleXmlDocument3050 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXmlDocument3067 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_23_in_ruleXmlDocument3080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlDocument3097 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlDocument3114 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_24_in_ruleXmlDocument3129 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleXmlDocument3150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXmlDocument3162 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXmlDocument3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule3212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleModule3259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleModule3276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule3293 = new BitSet(new long[]{0x000000BE8EDC8000L});
    public static final BitSet FOLLOW_20_in_ruleModule3307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModule3328 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleModule3341 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleModule3357 = new BitSet(new long[]{0x000000BE8ECC0000L});
    public static final BitSet FOLLOW_23_in_ruleModule3372 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_ruleModule3393 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule3405 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleModule3428 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleModule3450 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_18_in_ruleModule3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModule_in_entryRuleMetaModule3499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModule3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMetaModule3546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleMetaModule3563 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMetaModule3580 = new BitSet(new long[]{0x000000BE8EDC8000L});
    public static final BitSet FOLLOW_20_in_ruleMetaModule3594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleMetaModule3615 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleMetaModule3628 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleMetaModule3644 = new BitSet(new long[]{0x000000BE8ECC0000L});
    public static final BitSet FOLLOW_23_in_ruleMetaModule3659 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_ruleMetaModule3680 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMetaModule3692 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleMetaModule3715 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleMetaModule3737 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetaModule3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalModule_in_entryRuleExternalModule3786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalModule3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExternalModule3833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleExternalModule3850 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExternalModule3867 = new BitSet(new long[]{0x000000BE8EDC8000L});
    public static final BitSet FOLLOW_20_in_ruleExternalModule3881 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleExternalModule3902 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleExternalModule3915 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleExternalModule3931 = new BitSet(new long[]{0x000000BE8ECC0000L});
    public static final BitSet FOLLOW_23_in_ruleExternalModule3946 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleModuleMatching_in_ruleExternalModule3967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExternalModule3979 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleExternalModule4002 = new BitSet(new long[]{0x000000BE8E4C0000L});
    public static final BitSet FOLLOW_ruleRestriction_in_ruleExternalModule4024 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_18_in_ruleExternalModule4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4125 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName4144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_ASML_in_ruleQualifiedName4159 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleRestriction_in_entryRuleRestriction4206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestriction4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRestriction4253 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRestriction4265 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleRestriction4286 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRestriction4310 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_rulePermissionClause_in_ruleRestriction4332 = new BitSet(new long[]{0xFFF8000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRelactionType_in_ruleRestriction4354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRestriction4377 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_29_in_ruleRestriction4390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRestriction4407 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRestriction4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCardinality4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCardinality4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCardinality4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCardinality4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExpressionMatchingClause4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpressionMatchingClause4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExpressionMatchingClause4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleModuleMatchingParamenter4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleModuleMatchingParamenter4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleModuleMatchingParamenter4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleModuleMatchingParamenter4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGroupClause4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGroupClause4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGroupClause4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGroupClause4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePermissionClause4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePermissionClause4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePermissionClause4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePermissionClause4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRelactionType4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRelactionType4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRelactionType4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRelactionType4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRelactionType5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRelactionType5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRelactionType5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRelactionType5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleRelactionType5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRelactionType5092 = new BitSet(new long[]{0x0000000000000002L});

}