package br.ufes.inf.nemo.ontouml.ontoumlprime.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'complete'", "'GeneralizationSet'", "'specializes'", "'into'", "','", "';'", "'specialize'", "'=>'", "'PrimitiveDataType'", "'('", "')'", "'ComplexDataType'", "'enum'", "'essential'", "'inseparable'", "'shareable'", "'immutable'", "'relation'", "'['", "'..'", "']'", "'isComponentOf'", "'isMemberOf'", "'isSubCollectionOf'", "'isSubQuantityOf'", "'Kind'", "'Quantity'", "'extensional'", "'CollectiveUniversal'", "'SubKind'", "'Role'", "'Phase'", "'Category'", "'Mixin'", "'RoleMixin'", "'RelatorUniversal'", "'material'", "'rel'", "'formal'", "'ModeUniversal'", "'QualityUniversal'", "'characterizes'", "'datatypes'", "'assoc'", "'characterizedBy'", "'mediates'", "'PrimitiveDataTypeType'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:79:28: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:86:2: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==22||(LA1_0>=25 && LA1_0<=31)||(LA1_0>=39 && LA1_0<=50)||(LA1_0>=52 && LA1_0<=54)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:88:3: lv_elements_1_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleModel140);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:112:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:113:2: (iv_ruleElement= ruleElement EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:114:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement177);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement187); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:121:1: ruleElement returns [EObject current=null] : (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_GeneralizationSet_1 = null;

        EObject this_PrimitiveDataType_2 = null;

        EObject this_ComplexDataType_3 = null;

        EObject this_Enumeration_4 = null;

        EObject this_MeronymicRelation_5 = null;

        EObject this_Kind_6 = null;

        EObject this_QuantityUniversal_7 = null;

        EObject this_CollectiveUniversal_8 = null;

        EObject this_SubKind_9 = null;

        EObject this_Role_10 = null;

        EObject this_Phase_11 = null;

        EObject this_Category_12 = null;

        EObject this_Mixin_13 = null;

        EObject this_RoleMixin_14 = null;

        EObject this_RelatorUniversal_15 = null;

        EObject this_BinaryMaterialRelation_16 = null;

        EObject this_BinaryFormalRelation_17 = null;

        EObject this_ModeUniversal_18 = null;

        EObject this_QualityUniversal_19 = null;

        EObject this_nAryMaterialRelation_20 = null;

        EObject this_nAryFormalRelation_21 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:124:28: ( (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:126:5: this_Package_0= rulePackage
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_ruleElement234);
                    this_Package_0=rulePackage();

                    state._fsp--;

                     
                            current = this_Package_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:136:5: this_GeneralizationSet_1= ruleGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getGeneralizationSetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_ruleElement261);
                    this_GeneralizationSet_1=ruleGeneralizationSet();

                    state._fsp--;

                     
                            current = this_GeneralizationSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:146:5: this_PrimitiveDataType_2= rulePrimitiveDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPrimitiveDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_ruleElement288);
                    this_PrimitiveDataType_2=rulePrimitiveDataType();

                    state._fsp--;

                     
                            current = this_PrimitiveDataType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:156:5: this_ComplexDataType_3= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getComplexDataTypeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_ruleElement315);
                    this_ComplexDataType_3=ruleComplexDataType();

                    state._fsp--;

                     
                            current = this_ComplexDataType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:166:5: this_Enumeration_4= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_ruleElement342);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:176:5: this_MeronymicRelation_5= ruleMeronymicRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMeronymicRelationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_ruleElement369);
                    this_MeronymicRelation_5=ruleMeronymicRelation();

                    state._fsp--;

                     
                            current = this_MeronymicRelation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:186:5: this_Kind_6= ruleKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getKindParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleElement396);
                    this_Kind_6=ruleKind();

                    state._fsp--;

                     
                            current = this_Kind_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:196:5: this_QuantityUniversal_7= ruleQuantityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQuantityUniversalParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_ruleElement423);
                    this_QuantityUniversal_7=ruleQuantityUniversal();

                    state._fsp--;

                     
                            current = this_QuantityUniversal_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:206:5: this_CollectiveUniversal_8= ruleCollectiveUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCollectiveUniversalParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_ruleElement450);
                    this_CollectiveUniversal_8=ruleCollectiveUniversal();

                    state._fsp--;

                     
                            current = this_CollectiveUniversal_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:216:5: this_SubKind_9= ruleSubKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSubKindParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_ruleElement477);
                    this_SubKind_9=ruleSubKind();

                    state._fsp--;

                     
                            current = this_SubKind_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:226:5: this_Role_10= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleElement504);
                    this_Role_10=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:236:5: this_Phase_11= rulePhase
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhase_in_ruleElement531);
                    this_Phase_11=rulePhase();

                    state._fsp--;

                     
                            current = this_Phase_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:246:5: this_Category_12= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCategoryParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleElement558);
                    this_Category_12=ruleCategory();

                    state._fsp--;

                     
                            current = this_Category_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:256:5: this_Mixin_13= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMixinParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleElement585);
                    this_Mixin_13=ruleMixin();

                    state._fsp--;

                     
                            current = this_Mixin_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:266:5: this_RoleMixin_14= ruleRoleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleMixinParserRuleCall_14()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_ruleElement612);
                    this_RoleMixin_14=ruleRoleMixin();

                    state._fsp--;

                     
                            current = this_RoleMixin_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:276:5: this_RelatorUniversal_15= ruleRelatorUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRelatorUniversalParserRuleCall_15()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_ruleElement639);
                    this_RelatorUniversal_15=ruleRelatorUniversal();

                    state._fsp--;

                     
                            current = this_RelatorUniversal_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:286:5: this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryMaterialRelationParserRuleCall_16()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666);
                    this_BinaryMaterialRelation_16=ruleBinaryMaterialRelation();

                    state._fsp--;

                     
                            current = this_BinaryMaterialRelation_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:296:5: this_BinaryFormalRelation_17= ruleBinaryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryFormalRelationParserRuleCall_17()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_ruleElement693);
                    this_BinaryFormalRelation_17=ruleBinaryFormalRelation();

                    state._fsp--;

                     
                            current = this_BinaryFormalRelation_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:306:5: this_ModeUniversal_18= ruleModeUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getModeUniversalParserRuleCall_18()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_ruleElement720);
                    this_ModeUniversal_18=ruleModeUniversal();

                    state._fsp--;

                     
                            current = this_ModeUniversal_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:316:5: this_QualityUniversal_19= ruleQualityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQualityUniversalParserRuleCall_19()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_ruleElement747);
                    this_QualityUniversal_19=ruleQualityUniversal();

                    state._fsp--;

                     
                            current = this_QualityUniversal_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:326:5: this_nAryMaterialRelation_20= rulenAryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryMaterialRelationParserRuleCall_20()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_ruleElement774);
                    this_nAryMaterialRelation_20=rulenAryMaterialRelation();

                    state._fsp--;

                     
                            current = this_nAryMaterialRelation_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:336:5: this_nAryFormalRelation_21= rulenAryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryFormalRelationParserRuleCall_21()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_ruleElement801);
                    this_nAryFormalRelation_21=rulenAryFormalRelation();

                    state._fsp--;

                     
                            current = this_nAryFormalRelation_21; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:360:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:361:2: (iv_rulePackage= rulePackage EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:362:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage844);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage854); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:369:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:372:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:374:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage900); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:383:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:385:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePackage917); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage934); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:405:1: ( (lv_elements_4_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==11||(LA3_0>=14 && LA3_0<=15)||LA3_0==22||(LA3_0>=25 && LA3_0<=31)||(LA3_0>=39 && LA3_0<=50)||(LA3_0>=52 && LA3_0<=54)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:407:3: lv_elements_4_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_rulePackage955);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage968); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:435:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:436:2: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:437:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralizationSet1014); 

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
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:444:1: ruleGeneralizationSet returns [EObject current=null] : (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject this_CompleteGeneralizationSet_0 = null;

        EObject this_AnonymousGeneralizationSet_1 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:447:28: ( (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: (this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet | this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:449:5: this_CompleteGeneralizationSet_0= ruleCompleteGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralizationSetAccess().getCompleteGeneralizationSetParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompleteGeneralizationSet_in_ruleGeneralizationSet1061);
                    this_CompleteGeneralizationSet_0=ruleCompleteGeneralizationSet();

                    state._fsp--;

                     
                            current = this_CompleteGeneralizationSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:459:5: this_AnonymousGeneralizationSet_1= ruleAnonymousGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralizationSetAccess().getAnonymousGeneralizationSetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnonymousGeneralizationSet_in_ruleGeneralizationSet1088);
                    this_AnonymousGeneralizationSet_1=ruleAnonymousGeneralizationSet();

                    state._fsp--;

                     
                            current = this_AnonymousGeneralizationSet_1; 
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
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleCompleteGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:475:1: entryRuleCompleteGeneralizationSet returns [EObject current=null] : iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF ;
    public final EObject entryRuleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:476:2: (iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:477:2: iv_ruleCompleteGeneralizationSet= ruleCompleteGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getCompleteGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompleteGeneralizationSet_in_entryRuleCompleteGeneralizationSet1123);
            iv_ruleCompleteGeneralizationSet=ruleCompleteGeneralizationSet();

            state._fsp--;

             current =iv_ruleCompleteGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompleteGeneralizationSet1133); 

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
    // $ANTLR end "entryRuleCompleteGeneralizationSet"


    // $ANTLR start "ruleCompleteGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:484:1: ruleCompleteGeneralizationSet returns [EObject current=null] : ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) ;
    public final EObject ruleCompleteGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:487:28: ( ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:488:2: ( (lv_isCovering_0_0= 'complete' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:489:1: (lv_isCovering_0_0= 'complete' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:489:1: (lv_isCovering_0_0= 'complete' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:490:3: lv_isCovering_0_0= 'complete'
                    {
                    lv_isCovering_0_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompleteGeneralizationSet1176); 

                            newLeafNode(lv_isCovering_0_0, grammarAccess.getCompleteGeneralizationSetAccess().getIsCoveringCompleteKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
                    	        }
                           		setWithLastConsumed(current, "isCovering", true, "complete");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompleteGeneralizationSet1202); 

                	newLeafNode(otherlv_1, grammarAccess.getCompleteGeneralizationSetAccess().getGeneralizationSetKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:507:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:508:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:508:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:509:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1219); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCompleteGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCompleteGeneralizationSet1236); 

                	newLeafNode(otherlv_3, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializesKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:529:1: ( (otherlv_4= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:530:1: (otherlv_4= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:530:1: (otherlv_4= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:531:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1256); 

            		newLeafNode(otherlv_4, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCompleteGeneralizationSet1268); 

                	newLeafNode(otherlv_5, grammarAccess.getCompleteGeneralizationSetAccess().getIntoKeyword_5());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:546:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:547:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:547:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:548:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1288); 

            		newLeafNode(otherlv_6, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_6_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:559:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:559:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCompleteGeneralizationSet1301); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCompleteGeneralizationSetAccess().getCommaKeyword_7_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:563:1: ( (otherlv_8= RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:564:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:564:1: (otherlv_8= RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:565:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompleteGeneralizationSetRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1321); 

            	    		newLeafNode(otherlv_8, grammarAccess.getCompleteGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_7_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCompleteGeneralizationSet1335); 

                	newLeafNode(otherlv_9, grammarAccess.getCompleteGeneralizationSetAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleCompleteGeneralizationSet"


    // $ANTLR start "entryRuleAnonymousGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:588:1: entryRuleAnonymousGeneralizationSet returns [EObject current=null] : iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF ;
    public final EObject entryRuleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:589:2: (iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:590:2: iv_ruleAnonymousGeneralizationSet= ruleAnonymousGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getAnonymousGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousGeneralizationSet_in_entryRuleAnonymousGeneralizationSet1371);
            iv_ruleAnonymousGeneralizationSet=ruleAnonymousGeneralizationSet();

            state._fsp--;

             current =iv_ruleAnonymousGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonymousGeneralizationSet1381); 

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
    // $ANTLR end "entryRuleAnonymousGeneralizationSet"


    // $ANTLR start "ruleAnonymousGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:597:1: ruleAnonymousGeneralizationSet returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleAnonymousGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:600:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:2: ( (otherlv_0= RULE_ID ) ) ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) ) ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:601:2: ( (otherlv_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:602:1: (otherlv_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:602:1: (otherlv_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:603:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1426); 

            		newLeafNode(otherlv_0, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_0_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:2: ( ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) ) | (otherlv_5= 'specializes' | otherlv_6= '=>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==16||LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:3: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:3: ( (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:4: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+ (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:4: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:614:6: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnonymousGeneralizationSet1441); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getAnonymousGeneralizationSetAccess().getCommaKeyword_1_0_0_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:618:1: ( (otherlv_2= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:619:1: (otherlv_2= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:619:1: (otherlv_2= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:620:3: otherlv_2= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
                    	    	        }
                    	            
                    	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1461); 

                    	    		newLeafNode(otherlv_2, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_1_0_0_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:631:4: (otherlv_3= 'specialize' | otherlv_4= '=>' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:631:6: otherlv_3= 'specialize'
                            {
                            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnonymousGeneralizationSet1476); 

                                	newLeafNode(otherlv_3, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializeKeyword_1_0_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:636:7: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnonymousGeneralizationSet1494); 

                                	newLeafNode(otherlv_4, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_0_1_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:6: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:6: (otherlv_5= 'specializes' | otherlv_6= '=>' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==16) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:641:8: otherlv_5= 'specializes'
                            {
                            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnonymousGeneralizationSet1515); 

                                	newLeafNode(otherlv_5, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializesKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:646:7: otherlv_6= '=>'
                            {
                            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnonymousGeneralizationSet1533); 

                                	newLeafNode(otherlv_6, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_1_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:650:3: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:651:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:651:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:652:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousGeneralizationSetRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1555); 

            		newLeafNode(otherlv_7, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_2_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnonymousGeneralizationSet1567); 

                	newLeafNode(otherlv_8, grammarAccess.getAnonymousGeneralizationSetAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleAnonymousGeneralizationSet"


    // $ANTLR start "entryRulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:679:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:680:2: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:681:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1607);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataType1617); 

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
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:688:1: rulePrimitiveDataType returns [EObject current=null] : (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv__type_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:691:28: ( (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:692:3: otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveDataType1654); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:696:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:697:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:697:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveDataType1671); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitiveDataType1688); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDataTypeAccess().getLeftParenthesisKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:718:1: ( (lv__type_3_0= rulePrimitiveDataTypeType ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:719:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:719:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:720:3: lv__type_3_0= rulePrimitiveDataTypeType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().get_typePrimitiveDataTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1709);
            lv__type_3_0=rulePrimitiveDataTypeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"_type",
                    		lv__type_3_0, 
                    		"PrimitiveDataTypeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveDataType1721); 

                	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDataTypeAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePrimitiveDataType1733); 

                	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:752:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:753:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:754:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1769);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComplexDataType1779); 

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
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:761:1: ruleComplexDataType returns [EObject current=null] : (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:764:28: ( (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:765:3: otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleComplexDataType1816); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexDataTypeAccess().getComplexDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:769:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:770:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:770:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComplexDataType1833); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComplexDataType1850); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexDataTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:791:1: ( (lv_attributes_3_0= ruleDataTypeAttribute ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:792:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:792:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:793:3: lv_attributes_3_0= ruleDataTypeAttribute
            {
             
            	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1871);
            lv_attributes_3_0=ruleDataTypeAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"DataTypeAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:809:2: (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:809:4: otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComplexDataType1884); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComplexDataTypeAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:813:1: ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:814:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:814:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:815:3: lv_attributes_5_0= ruleDataTypeAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1905);
            	    lv_attributes_5_0=ruleDataTypeAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"DataTypeAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComplexDataType1919); 

                	newLeafNode(otherlv_6, grammarAccess.getComplexDataTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:843:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:844:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:845:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration1955);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration1965); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:852:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_enumerationLiterals_3_0 = null;

        AntlrDatatypeRuleToken lv_enumerationLiterals_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:855:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:856:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEnumeration2002); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:860:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:861:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:861:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:862:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration2019); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnumeration2036); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:882:1: ( (lv_enumerationLiterals_3_0= ruleEString ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:1: (lv_enumerationLiterals_3_0= ruleEString )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:1: (lv_enumerationLiterals_3_0= ruleEString )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:884:3: lv_enumerationLiterals_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration2057);
            lv_enumerationLiterals_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"enumerationLiterals",
                    		lv_enumerationLiterals_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:900:2: (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:900:4: otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumeration2070); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:904:1: ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:905:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:905:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:906:3: lv_enumerationLiterals_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration2091);
            	    lv_enumerationLiterals_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerationLiterals",
            	            		lv_enumerationLiterals_5_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumeration2105); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:934:1: entryRuleMeronymicRelation returns [EObject current=null] : iv_ruleMeronymicRelation= ruleMeronymicRelation EOF ;
    public final EObject entryRuleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeronymicRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:935:2: (iv_ruleMeronymicRelation= ruleMeronymicRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:936:2: iv_ruleMeronymicRelation= ruleMeronymicRelation EOF
            {
             newCompositeNode(grammarAccess.getMeronymicRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation2141);
            iv_ruleMeronymicRelation=ruleMeronymicRelation();

            state._fsp--;

             current =iv_ruleMeronymicRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeronymicRelation2151); 

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
    // $ANTLR end "entryRuleMeronymicRelation"


    // $ANTLR start "ruleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:943:1: ruleMeronymicRelation returns [EObject current=null] : (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) ;
    public final EObject ruleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentOfRelation_0 = null;

        EObject this_MembershipRelation_1 = null;

        EObject this_SubCollectionRelation_2 = null;

        EObject this_SubQuantityRelation_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:946:28: ( (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:948:5: this_ComponentOfRelation_0= ruleComponentOfRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getComponentOfRelationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation2198);
                    this_ComponentOfRelation_0=ruleComponentOfRelation();

                    state._fsp--;

                     
                            current = this_ComponentOfRelation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:958:5: this_MembershipRelation_1= ruleMembershipRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getMembershipRelationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation2225);
                    this_MembershipRelation_1=ruleMembershipRelation();

                    state._fsp--;

                     
                            current = this_MembershipRelation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:968:5: this_SubCollectionRelation_2= ruleSubCollectionRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubCollectionRelationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation2252);
                    this_SubCollectionRelation_2=ruleSubCollectionRelation();

                    state._fsp--;

                     
                            current = this_SubCollectionRelation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:978:5: this_SubQuantityRelation_3= ruleSubQuantityRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubQuantityRelationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation2279);
                    this_SubQuantityRelation_3=ruleSubQuantityRelation();

                    state._fsp--;

                     
                            current = this_SubQuantityRelation_3; 
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
    // $ANTLR end "ruleMeronymicRelation"


    // $ANTLR start "entryRuleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:994:1: entryRuleComponentOfRelation returns [EObject current=null] : iv_ruleComponentOfRelation= ruleComponentOfRelation EOF ;
    public final EObject entryRuleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOfRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:995:2: (iv_ruleComponentOfRelation= ruleComponentOfRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:996:2: iv_ruleComponentOfRelation= ruleComponentOfRelation EOF
            {
             newCompositeNode(grammarAccess.getComponentOfRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation2314);
            iv_ruleComponentOfRelation=ruleComponentOfRelation();

            state._fsp--;

             current =iv_ruleComponentOfRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentOfRelation2324); 

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
    // $ANTLR end "entryRuleComponentOfRelation"


    // $ANTLR start "ruleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1003:1: ruleComponentOfRelation returns [EObject current=null] : ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isComponentOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_0_0=null;
        Token lv_partIsInseparable_1_0=null;
        Token lv_partIsShareable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1006:28: ( ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isComponentOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isComponentOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isComponentOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isComponentOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:3: ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:3: ( (lv_partIsEssential_0_0= 'essential' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1008:1: (lv_partIsEssential_0_0= 'essential' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1008:1: (lv_partIsEssential_0_0= 'essential' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1009:3: lv_partIsEssential_0_0= 'essential'
                    {
                    lv_partIsEssential_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleComponentOfRelation2368); 

                            newLeafNode(lv_partIsEssential_0_0, grammarAccess.getComponentOfRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsEssential", true, "essential");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1022:3: ( (lv_partIsInseparable_1_0= 'inseparable' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1023:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1023:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1024:3: lv_partIsInseparable_1_0= 'inseparable'
                    {
                    lv_partIsInseparable_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleComponentOfRelation2400); 

                            newLeafNode(lv_partIsInseparable_1_0, grammarAccess.getComponentOfRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1037:3: ( (lv_partIsShareable_2_0= 'shareable' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1038:1: (lv_partIsShareable_2_0= 'shareable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1038:1: (lv_partIsShareable_2_0= 'shareable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1039:3: lv_partIsShareable_2_0= 'shareable'
                    {
                    lv_partIsShareable_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleComponentOfRelation2432); 

                            newLeafNode(lv_partIsShareable_2_0, grammarAccess.getComponentOfRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1052:3: ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1053:1: (lv_partIsImmutable_3_0= 'immutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1053:1: (lv_partIsImmutable_3_0= 'immutable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1054:3: lv_partIsImmutable_3_0= 'immutable'
                    {
                    lv_partIsImmutable_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentOfRelation2464); 

                            newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getComponentOfRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
                    	    

                    }


                    }
                    break;

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentOfRelation2491); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentOfRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1071:1: ( (otherlv_5= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1072:1: (otherlv_5= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1072:1: (otherlv_5= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1073:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2511); 

            		newLeafNode(otherlv_5, grammarAccess.getComponentOfRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1084:2: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1084:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2524); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1088:1: ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1089:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1089:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1090:3: lv_sourceLowerBound_7_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleComponentOfRelation2545);
                    lv_sourceLowerBound_7_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_7_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComponentOfRelation2557); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1110:1: ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1111:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1111:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1112:3: lv_sourceUpperBound_9_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleComponentOfRelation2578);
                    lv_sourceUpperBound_9_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_9_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleComponentOfRelation2590); 

                        	newLeafNode(otherlv_10, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleComponentOfRelation2604); 

                	newLeafNode(otherlv_11, grammarAccess.getComponentOfRelationAccess().getIsComponentOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1136:1: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1137:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1137:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1138:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2624); 

            		newLeafNode(otherlv_12, grammarAccess.getComponentOfRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1149:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1149:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2637); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1153:1: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1154:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1154:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1155:3: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleComponentOfRelation2658);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComponentOfRelation2670); 

                        	newLeafNode(otherlv_15, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1175:1: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1176:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1176:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1177:3: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleComponentOfRelation2691);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleComponentOfRelation2703); 

                        	newLeafNode(otherlv_17, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentOfRelation2717); 

                	newLeafNode(otherlv_18, grammarAccess.getComponentOfRelationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleComponentOfRelation"


    // $ANTLR start "entryRuleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1209:1: entryRuleMembershipRelation returns [EObject current=null] : iv_ruleMembershipRelation= ruleMembershipRelation EOF ;
    public final EObject entryRuleMembershipRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1210:2: (iv_ruleMembershipRelation= ruleMembershipRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1211:2: iv_ruleMembershipRelation= ruleMembershipRelation EOF
            {
             newCompositeNode(grammarAccess.getMembershipRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation2753);
            iv_ruleMembershipRelation=ruleMembershipRelation();

            state._fsp--;

             current =iv_ruleMembershipRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMembershipRelation2763); 

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
    // $ANTLR end "entryRuleMembershipRelation"


    // $ANTLR start "ruleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1218:1: ruleMembershipRelation returns [EObject current=null] : ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isMemberOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleMembershipRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_0_0=null;
        Token lv_partIsInseparable_1_0=null;
        Token lv_partIsShareable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1221:28: ( ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isMemberOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isMemberOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isMemberOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isMemberOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:3: ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1222:3: ( (lv_partIsEssential_0_0= 'essential' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1223:1: (lv_partIsEssential_0_0= 'essential' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1223:1: (lv_partIsEssential_0_0= 'essential' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1224:3: lv_partIsEssential_0_0= 'essential'
                    {
                    lv_partIsEssential_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMembershipRelation2807); 

                            newLeafNode(lv_partIsEssential_0_0, grammarAccess.getMembershipRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsEssential", true, "essential");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1237:3: ( (lv_partIsInseparable_1_0= 'inseparable' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1238:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1238:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1239:3: lv_partIsInseparable_1_0= 'inseparable'
                    {
                    lv_partIsInseparable_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMembershipRelation2839); 

                            newLeafNode(lv_partIsInseparable_1_0, grammarAccess.getMembershipRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1252:3: ( (lv_partIsShareable_2_0= 'shareable' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1253:1: (lv_partIsShareable_2_0= 'shareable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1253:1: (lv_partIsShareable_2_0= 'shareable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1254:3: lv_partIsShareable_2_0= 'shareable'
                    {
                    lv_partIsShareable_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMembershipRelation2871); 

                            newLeafNode(lv_partIsShareable_2_0, grammarAccess.getMembershipRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1267:3: ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1268:1: (lv_partIsImmutable_3_0= 'immutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1268:1: (lv_partIsImmutable_3_0= 'immutable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1269:3: lv_partIsImmutable_3_0= 'immutable'
                    {
                    lv_partIsImmutable_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMembershipRelation2903); 

                            newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getMembershipRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
                    	    

                    }


                    }
                    break;

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMembershipRelation2930); 

                	newLeafNode(otherlv_4, grammarAccess.getMembershipRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1286:1: ( (otherlv_5= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:1: (otherlv_5= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:1: (otherlv_5= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1288:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation2950); 

            		newLeafNode(otherlv_5, grammarAccess.getMembershipRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1299:2: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1299:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation2963); 

                        	newLeafNode(otherlv_6, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1303:1: ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1304:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1304:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1305:3: lv_sourceLowerBound_7_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleMembershipRelation2984);
                    lv_sourceLowerBound_7_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_7_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMembershipRelation2996); 

                        	newLeafNode(otherlv_8, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1325:1: ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1326:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1326:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1327:3: lv_sourceUpperBound_9_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleMembershipRelation3017);
                    lv_sourceUpperBound_9_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_9_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMembershipRelation3029); 

                        	newLeafNode(otherlv_10, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMembershipRelation3043); 

                	newLeafNode(otherlv_11, grammarAccess.getMembershipRelationAccess().getIsMemberOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1351:1: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1352:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1352:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1353:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation3063); 

            		newLeafNode(otherlv_12, grammarAccess.getMembershipRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1364:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1364:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation3076); 

                        	newLeafNode(otherlv_13, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1368:1: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1369:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1369:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1370:3: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleMembershipRelation3097);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMembershipRelation3109); 

                        	newLeafNode(otherlv_15, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1390:1: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1391:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1391:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1392:3: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleMembershipRelation3130);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMembershipRelation3142); 

                        	newLeafNode(otherlv_17, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMembershipRelation3156); 

                	newLeafNode(otherlv_18, grammarAccess.getMembershipRelationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleMembershipRelation"


    // $ANTLR start "entryRuleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1424:1: entryRuleSubCollectionRelation returns [EObject current=null] : iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF ;
    public final EObject entryRuleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCollectionRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1425:2: (iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1426:2: iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF
            {
             newCompositeNode(grammarAccess.getSubCollectionRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3192);
            iv_ruleSubCollectionRelation=ruleSubCollectionRelation();

            state._fsp--;

             current =iv_ruleSubCollectionRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubCollectionRelation3202); 

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
    // $ANTLR end "entryRuleSubCollectionRelation"


    // $ANTLR start "ruleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1433:1: ruleSubCollectionRelation returns [EObject current=null] : ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubCollectionOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_0_0=null;
        Token lv_partIsInseparable_1_0=null;
        Token lv_partIsShareable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1436:28: ( ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubCollectionOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubCollectionOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubCollectionOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )? otherlv_11= 'isSubCollectionOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )? )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:3: ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsShareable_2_0= 'shareable' ) )? ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1437:3: ( (lv_partIsEssential_0_0= 'essential' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1438:1: (lv_partIsEssential_0_0= 'essential' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1438:1: (lv_partIsEssential_0_0= 'essential' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1439:3: lv_partIsEssential_0_0= 'essential'
                    {
                    lv_partIsEssential_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubCollectionRelation3246); 

                            newLeafNode(lv_partIsEssential_0_0, grammarAccess.getSubCollectionRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsEssential", true, "essential");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1452:3: ( (lv_partIsInseparable_1_0= 'inseparable' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1453:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1453:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1454:3: lv_partIsInseparable_1_0= 'inseparable'
                    {
                    lv_partIsInseparable_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubCollectionRelation3278); 

                            newLeafNode(lv_partIsInseparable_1_0, grammarAccess.getSubCollectionRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1467:3: ( (lv_partIsShareable_2_0= 'shareable' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1468:1: (lv_partIsShareable_2_0= 'shareable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1468:1: (lv_partIsShareable_2_0= 'shareable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1469:3: lv_partIsShareable_2_0= 'shareable'
                    {
                    lv_partIsShareable_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubCollectionRelation3310); 

                            newLeafNode(lv_partIsShareable_2_0, grammarAccess.getSubCollectionRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1482:3: ( (lv_partIsImmutable_3_0= 'immutable' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1483:1: (lv_partIsImmutable_3_0= 'immutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1483:1: (lv_partIsImmutable_3_0= 'immutable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1484:3: lv_partIsImmutable_3_0= 'immutable'
                    {
                    lv_partIsImmutable_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubCollectionRelation3342); 

                            newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getSubCollectionRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
                    	    

                    }


                    }
                    break;

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubCollectionRelation3369); 

                	newLeafNode(otherlv_4, grammarAccess.getSubCollectionRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1501:1: ( (otherlv_5= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1502:1: (otherlv_5= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1502:1: (otherlv_5= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1503:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation3389); 

            		newLeafNode(otherlv_5, grammarAccess.getSubCollectionRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1514:2: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1514:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation3402); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1518:1: ( (lv_sourceLowerBound_7_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1519:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1519:1: (lv_sourceLowerBound_7_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1520:3: lv_sourceLowerBound_7_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleSubCollectionRelation3423);
                    lv_sourceLowerBound_7_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_7_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubCollectionRelation3435); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1540:1: ( (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1541:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1541:1: (lv_sourceUpperBound_9_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1542:3: lv_sourceUpperBound_9_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleSubCollectionRelation3456);
                    lv_sourceUpperBound_9_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_9_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubCollectionRelation3468); 

                        	newLeafNode(otherlv_10, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubCollectionRelation3482); 

                	newLeafNode(otherlv_11, grammarAccess.getSubCollectionRelationAccess().getIsSubCollectionOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1566:1: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1568:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation3502); 

            		newLeafNode(otherlv_12, grammarAccess.getSubCollectionRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1579:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1579:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation3515); 

                        	newLeafNode(otherlv_13, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1583:1: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1584:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1584:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1585:3: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleSubCollectionRelation3536);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubCollectionRelation3548); 

                        	newLeafNode(otherlv_15, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1605:1: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1606:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1606:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1607:3: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleSubCollectionRelation3569);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubCollectionRelation3581); 

                        	newLeafNode(otherlv_17, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubCollectionRelation3595); 

                	newLeafNode(otherlv_18, grammarAccess.getSubCollectionRelationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleSubCollectionRelation"


    // $ANTLR start "entryRuleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1639:1: entryRuleSubQuantityRelation returns [EObject current=null] : iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF ;
    public final EObject entryRuleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuantityRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1640:2: (iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1641:2: iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF
            {
             newCompositeNode(grammarAccess.getSubQuantityRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation3631);
            iv_ruleSubQuantityRelation=ruleSubQuantityRelation();

            state._fsp--;

             current =iv_ruleSubQuantityRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubQuantityRelation3641); 

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
    // $ANTLR end "entryRuleSubQuantityRelation"


    // $ANTLR start "ruleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1648:1: ruleSubQuantityRelation returns [EObject current=null] : ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? ) otherlv_3= 'relation' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )? otherlv_10= 'isSubQuantityOf' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
    public final EObject ruleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_0_0=null;
        Token lv_partIsInseparable_1_0=null;
        Token lv_partIsImmutable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_8_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_13_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1651:28: ( ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? ) otherlv_3= 'relation' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )? otherlv_10= 'isSubQuantityOf' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? ) otherlv_3= 'relation' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )? otherlv_10= 'isSubQuantityOf' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:1: ( ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? ) otherlv_3= 'relation' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )? otherlv_10= 'isSubQuantityOf' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? ) otherlv_3= 'relation' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )? otherlv_10= 'isSubQuantityOf' ( (otherlv_11= RULE_ID ) ) (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:2: ( ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )? )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:3: ( (lv_partIsEssential_0_0= 'essential' ) )? ( (lv_partIsInseparable_1_0= 'inseparable' ) )? ( (lv_partIsImmutable_2_0= 'immutable' ) )?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1652:3: ( (lv_partIsEssential_0_0= 'essential' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1653:1: (lv_partIsEssential_0_0= 'essential' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1653:1: (lv_partIsEssential_0_0= 'essential' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1654:3: lv_partIsEssential_0_0= 'essential'
                    {
                    lv_partIsEssential_0_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubQuantityRelation3685); 

                            newLeafNode(lv_partIsEssential_0_0, grammarAccess.getSubQuantityRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsEssential", true, "essential");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1667:3: ( (lv_partIsInseparable_1_0= 'inseparable' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1668:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1668:1: (lv_partIsInseparable_1_0= 'inseparable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1669:3: lv_partIsInseparable_1_0= 'inseparable'
                    {
                    lv_partIsInseparable_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubQuantityRelation3717); 

                            newLeafNode(lv_partIsInseparable_1_0, grammarAccess.getSubQuantityRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
                    	    

                    }


                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1682:3: ( (lv_partIsImmutable_2_0= 'immutable' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1683:1: (lv_partIsImmutable_2_0= 'immutable' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1683:1: (lv_partIsImmutable_2_0= 'immutable' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1684:3: lv_partIsImmutable_2_0= 'immutable'
                    {
                    lv_partIsImmutable_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubQuantityRelation3749); 

                            newLeafNode(lv_partIsImmutable_2_0, grammarAccess.getSubQuantityRelationAccess().getPartIsImmutableImmutableKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
                    	    

                    }


                    }
                    break;

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubQuantityRelation3776); 

                	newLeafNode(otherlv_3, grammarAccess.getSubQuantityRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1701:1: ( (otherlv_4= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1702:1: (otherlv_4= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1702:1: (otherlv_4= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1703:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation3796); 

            		newLeafNode(otherlv_4, grammarAccess.getSubQuantityRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1714:2: (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1714:4: otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation3809); 

                        	newLeafNode(otherlv_5, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1718:1: ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1719:1: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1719:1: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1720:3: lv_sourceLowerBound_6_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleSubQuantityRelation3830);
                    lv_sourceLowerBound_6_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_6_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubQuantityRelation3842); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1740:1: ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1741:1: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1741:1: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1742:3: lv_sourceUpperBound_8_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleSubQuantityRelation3863);
                    lv_sourceUpperBound_8_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_8_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubQuantityRelation3875); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSubQuantityRelation3889); 

                	newLeafNode(otherlv_10, grammarAccess.getSubQuantityRelationAccess().getIsSubQuantityOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1766:1: ( (otherlv_11= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1767:1: (otherlv_11= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1767:1: (otherlv_11= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1768:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation3909); 

            		newLeafNode(otherlv_11, grammarAccess.getSubQuantityRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:2: (otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:4: otherlv_12= '[' ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation3922); 

                        	newLeafNode(otherlv_12, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1783:1: ( (lv_targetLowerBound_13_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1784:1: (lv_targetLowerBound_13_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1784:1: (lv_targetLowerBound_13_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1785:3: lv_targetLowerBound_13_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleSubQuantityRelation3943);
                    lv_targetLowerBound_13_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_13_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubQuantityRelation3955); 

                        	newLeafNode(otherlv_14, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1805:1: ( (lv_targetUpperBound_15_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1806:1: (lv_targetUpperBound_15_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1806:1: (lv_targetUpperBound_15_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1807:3: lv_targetUpperBound_15_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleSubQuantityRelation3976);
                    lv_targetUpperBound_15_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_15_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubQuantityRelation3988); 

                        	newLeafNode(otherlv_16, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubQuantityRelation4002); 

                	newLeafNode(otherlv_17, grammarAccess.getSubQuantityRelationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleSubQuantityRelation"


    // $ANTLR start "entryRuleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1839:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1840:2: (iv_ruleKind= ruleKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1841:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind4038);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind4048); 

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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1848:1: ruleKind returns [EObject current=null] : ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1851:28: ( ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1852:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1852:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1852:2: () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1852:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1853:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKindAccess().getKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleKind4094); 

                	newLeafNode(otherlv_1, grammarAccess.getKindAccess().getKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1862:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1863:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1863:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1864:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKind4111); 

            			newLeafNode(lv_name_2_0, grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind4128); 

                	newLeafNode(otherlv_3, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1884:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==32||LA37_0==58) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1885:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1885:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1886:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleKind4149);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKind4162); 

                	newLeafNode(otherlv_5, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1914:1: entryRuleQuantityUniversal returns [EObject current=null] : iv_ruleQuantityUniversal= ruleQuantityUniversal EOF ;
    public final EObject entryRuleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1915:2: (iv_ruleQuantityUniversal= ruleQuantityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1916:2: iv_ruleQuantityUniversal= ruleQuantityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQuantityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal4198);
            iv_ruleQuantityUniversal=ruleQuantityUniversal();

            state._fsp--;

             current =iv_ruleQuantityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantityUniversal4208); 

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
    // $ANTLR end "entryRuleQuantityUniversal"


    // $ANTLR start "ruleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1923:1: ruleQuantityUniversal returns [EObject current=null] : ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1926:28: ( ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1927:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1927:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1927:2: () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1927:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1928:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityUniversalAccess().getQuantityUniversalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleQuantityUniversal4254); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantityUniversalAccess().getQuantityKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1937:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1938:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1938:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1939:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuantityUniversal4271); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQuantityUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuantityUniversal4288); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantityUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1959:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32||LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1960:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1960:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1961:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQuantityUniversal4309);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQuantityUniversal4322); 

                	newLeafNode(otherlv_5, grammarAccess.getQuantityUniversalAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleQuantityUniversal"


    // $ANTLR start "entryRuleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1989:1: entryRuleCollectiveUniversal returns [EObject current=null] : iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF ;
    public final EObject entryRuleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectiveUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1990:2: (iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1991:2: iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF
            {
             newCompositeNode(grammarAccess.getCollectiveUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal4358);
            iv_ruleCollectiveUniversal=ruleCollectiveUniversal();

            state._fsp--;

             current =iv_ruleCollectiveUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectiveUniversal4368); 

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
    // $ANTLR end "entryRuleCollectiveUniversal"


    // $ANTLR start "ruleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1998:1: ruleCollectiveUniversal returns [EObject current=null] : ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        Token lv_isExtensional_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2001:28: ( ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:2: ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:2: ( (lv_isExtensional_0_0= 'extensional' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2003:1: (lv_isExtensional_0_0= 'extensional' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2003:1: (lv_isExtensional_0_0= 'extensional' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2004:3: lv_isExtensional_0_0= 'extensional'
                    {
                    lv_isExtensional_0_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCollectiveUniversal4411); 

                            newLeafNode(lv_isExtensional_0_0, grammarAccess.getCollectiveUniversalAccess().getIsExtensionalExtensionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
                    	        }
                           		setWithLastConsumed(current, "isExtensional", true, "extensional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCollectiveUniversal4437); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectiveUniversalAccess().getCollectiveUniversalKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2021:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2022:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2022:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2023:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCollectiveUniversal4454); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectiveUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCollectiveUniversal4471); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectiveUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2043:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==32||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2045:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCollectiveUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal4492);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCollectiveUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCollectiveUniversal4505); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectiveUniversalAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCollectiveUniversal"


    // $ANTLR start "entryRuleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2073:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2074:2: (iv_ruleSubKind= ruleSubKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2075:2: iv_ruleSubKind= ruleSubKind EOF
            {
             newCompositeNode(grammarAccess.getSubKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_entryRuleSubKind4541);
            iv_ruleSubKind=ruleSubKind();

            state._fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubKind4551); 

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
    // $ANTLR end "entryRuleSubKind"


    // $ANTLR start "ruleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2082:1: ruleSubKind returns [EObject current=null] : ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2085:28: ( ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2086:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2086:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2086:2: () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2086:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubKindAccess().getSubKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSubKind4597); 

                	newLeafNode(otherlv_1, grammarAccess.getSubKindAccess().getSubKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2096:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2097:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2097:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2098:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubKind4614); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSubKind4631); 

                	newLeafNode(otherlv_3, grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2118:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==32||LA41_0==58) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2120:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleSubKind4652);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSubKind4665); 

                	newLeafNode(otherlv_5, grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSubKind"


    // $ANTLR start "entryRuleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2148:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2149:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2150:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole4701);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole4711); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2157:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2160:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2161:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2161:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2161:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRole4748); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2165:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2166:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2166:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2167:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole4765); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole4782); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2187:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==32||LA42_0==58) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2188:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2188:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2189:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRole4803);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole4816); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2217:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2218:2: (iv_rulePhase= rulePhase EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2219:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhase_in_entryRulePhase4852);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhase4862); 

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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2226:1: rulePhase returns [EObject current=null] : ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2229:28: ( ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2230:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2230:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2230:2: () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2230:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2231:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhaseAccess().getPhaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_rulePhase4908); 

                	newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getPhaseKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2240:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2241:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2241:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2242:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhase4925); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePhase4942); 

                	newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2262:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32||LA43_0==58) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2263:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2263:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2264:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhaseAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_rulePhase4963);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhase4976); 

                	newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2292:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2293:2: (iv_ruleCategory= ruleCategory EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2294:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory5012);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory5022); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2301:1: ruleCategory returns [EObject current=null] : ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2304:28: ( ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:2: () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCategoryAccess().getCategoryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleCategory5068); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2315:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2316:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2316:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2317:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCategory5085); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory5102); 

                	newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCategory5114); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2349:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2350:2: (iv_ruleMixin= ruleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2351:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin5150);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin5160); 

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
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2358:1: ruleMixin returns [EObject current=null] : ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2361:28: ( ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2362:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2362:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2362:2: () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2362:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2363:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMixinAccess().getMixinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMixin5206); 

                	newLeafNode(otherlv_1, grammarAccess.getMixinAccess().getMixinKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2372:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2373:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2373:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2374:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixin5223); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin5240); 

                	newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMixin5252); 

                	newLeafNode(otherlv_4, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2406:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2407:2: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2408:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             newCompositeNode(grammarAccess.getRoleMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin5288);
            iv_ruleRoleMixin=ruleRoleMixin();

            state._fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoleMixin5298); 

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
    // $ANTLR end "entryRuleRoleMixin"


    // $ANTLR start "ruleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2415:1: ruleRoleMixin returns [EObject current=null] : (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2418:28: ( (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2419:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2419:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2419:3: otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleRoleMixin5335); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2423:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2424:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2424:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2425:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRoleMixin5352); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoleMixin5369); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoleMixin5381); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleRoleMixin"


    // $ANTLR start "entryRuleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2457:1: entryRuleRelatorUniversal returns [EObject current=null] : iv_ruleRelatorUniversal= ruleRelatorUniversal EOF ;
    public final EObject entryRuleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelatorUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2458:2: (iv_ruleRelatorUniversal= ruleRelatorUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2459:2: iv_ruleRelatorUniversal= ruleRelatorUniversal EOF
            {
             newCompositeNode(grammarAccess.getRelatorUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal5417);
            iv_ruleRelatorUniversal=ruleRelatorUniversal();

            state._fsp--;

             current =iv_ruleRelatorUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelatorUniversal5427); 

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
    // $ANTLR end "entryRuleRelatorUniversal"


    // $ANTLR start "ruleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2466:1: ruleRelatorUniversal returns [EObject current=null] : (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_3_0 = null;

        EObject lv_mediations_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2469:28: ( (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2470:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2470:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2470:3: otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRelatorUniversal5464); 

                	newLeafNode(otherlv_0, grammarAccess.getRelatorUniversalAccess().getRelatorUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2474:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2475:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2475:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2476:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelatorUniversal5481); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRelatorUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelatorUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelatorUniversal5498); 

                	newLeafNode(otherlv_2, grammarAccess.getRelatorUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2496:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==32||LA44_0==58) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2497:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2497:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2498:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRelatorUniversal5519);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2514:3: ( (lv_mediations_4_0= ruleMediation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==59) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2515:1: (lv_mediations_4_0= ruleMediation )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2515:1: (lv_mediations_4_0= ruleMediation )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2516:3: lv_mediations_4_0= ruleMediation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getMediationsMediationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMediation_in_ruleRelatorUniversal5541);
            	    lv_mediations_4_0=ruleMediation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mediations",
            	            		lv_mediations_4_0, 
            	            		"Mediation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRelatorUniversal5554); 

                	newLeafNode(otherlv_5, grammarAccess.getRelatorUniversalAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRelatorUniversal"


    // $ANTLR start "entryRuleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2544:1: entryRuleBinaryMaterialRelation returns [EObject current=null] : iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF ;
    public final EObject entryRuleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2545:2: (iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2546:2: iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation5590);
            iv_ruleBinaryMaterialRelation=ruleBinaryMaterialRelation();

            state._fsp--;

             current =iv_ruleBinaryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryMaterialRelation5600); 

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
    // $ANTLR end "entryRuleBinaryMaterialRelation"


    // $ANTLR start "ruleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2553:1: ruleBinaryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2556:28: ( (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2557:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2557:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2557:3: otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleBinaryMaterialRelation5637); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleBinaryMaterialRelation5649); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryMaterialRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2565:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2566:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2566:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2567:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5669); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryMaterialRelationAccess().getSourceExternallyDependentUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2578:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2578:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation5682); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2582:1: ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2583:1: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2583:1: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2584:3: lv_sourceLowerBound_4_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleBinaryMaterialRelation5703);
                    lv_sourceLowerBound_4_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryMaterialRelation5715); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2604:1: ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2605:1: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2605:1: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2606:3: lv_sourceUpperBound_6_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryMaterialRelation5736);
                    lv_sourceUpperBound_6_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryMaterialRelation5748); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2626:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2627:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2627:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2628:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5767); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryMaterialRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2644:2: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2644:4: otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryMaterialRelation5785); 

                        	newLeafNode(otherlv_9, grammarAccess.getBinaryMaterialRelationAccess().getLeftParenthesisKeyword_5_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2648:1: ( (otherlv_10= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2649:1: (otherlv_10= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2649:1: (otherlv_10= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2650:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5805); 

                    		newLeafNode(otherlv_10, grammarAccess.getBinaryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_5_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryMaterialRelation5817); 

                        	newLeafNode(otherlv_11, grammarAccess.getBinaryMaterialRelationAccess().getRightParenthesisKeyword_5_2());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2665:3: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2666:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2666:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2667:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5839); 

            		newLeafNode(otherlv_12, grammarAccess.getBinaryMaterialRelationAccess().getTargetExternallyDependentUniversalCrossReference_6_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2678:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2678:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation5852); 

                        	newLeafNode(otherlv_13, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_7_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2682:1: ( (lv_targetLowerBound_14_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2683:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2683:1: (lv_targetLowerBound_14_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2684:3: lv_targetLowerBound_14_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleBinaryMaterialRelation5873);
                    lv_targetLowerBound_14_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryMaterialRelation5885); 

                        	newLeafNode(otherlv_15, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_7_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2704:1: ( (lv_targetUpperBound_16_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2705:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2705:1: (lv_targetUpperBound_16_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2706:3: lv_targetUpperBound_16_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryMaterialRelation5906);
                    lv_targetUpperBound_16_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryMaterialRelation5918); 

                        	newLeafNode(otherlv_17, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryMaterialRelation5932); 

                	newLeafNode(otherlv_18, grammarAccess.getBinaryMaterialRelationAccess().getSemicolonKeyword_8());
                

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
    // $ANTLR end "ruleBinaryMaterialRelation"


    // $ANTLR start "entryRuleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2738:1: entryRuleBinaryFormalRelation returns [EObject current=null] : iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF ;
    public final EObject entryRuleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2739:2: (iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2740:2: iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation5968);
            iv_ruleBinaryFormalRelation=ruleBinaryFormalRelation();

            state._fsp--;

             current =iv_ruleBinaryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryFormalRelation5978); 

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
    // $ANTLR end "entryRuleBinaryFormalRelation"


    // $ANTLR start "ruleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2747:1: ruleBinaryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' ) ;
    public final EObject ruleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_11_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_13_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2750:28: ( (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2751:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2751:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2751:3: otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )? otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleBinaryFormalRelation6015); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleBinaryFormalRelation6027); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryFormalRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2759:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2760:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2760:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2761:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6047); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryFormalRelationAccess().getSourceUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2772:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2772:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation6060); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2776:1: ( (lv_sourceLowerBound_4_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2777:1: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2777:1: (lv_sourceLowerBound_4_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2778:3: lv_sourceLowerBound_4_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleBinaryFormalRelation6081);
                    lv_sourceLowerBound_4_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryFormalRelation6093); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2798:1: ( (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2799:1: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2799:1: (lv_sourceUpperBound_6_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2800:3: lv_sourceUpperBound_6_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryFormalRelation6114);
                    lv_sourceUpperBound_6_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryFormalRelation6126); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2820:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2821:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2821:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2822:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6145); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryFormalRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2838:2: ( (otherlv_9= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2839:1: (otherlv_9= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2839:1: (otherlv_9= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2840:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6170); 

            		newLeafNode(otherlv_9, grammarAccess.getBinaryFormalRelationAccess().getTargetUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2851:2: (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2851:4: otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation6183); 

                        	newLeafNode(otherlv_10, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2855:1: ( (lv_targetLowerBound_11_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2856:1: (lv_targetLowerBound_11_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2856:1: (lv_targetLowerBound_11_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2857:3: lv_targetLowerBound_11_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleBinaryFormalRelation6204);
                    lv_targetLowerBound_11_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_11_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryFormalRelation6216); 

                        	newLeafNode(otherlv_12, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2877:1: ( (lv_targetUpperBound_13_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2878:1: (lv_targetUpperBound_13_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2878:1: (lv_targetUpperBound_13_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2879:3: lv_targetUpperBound_13_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryFormalRelation6237);
                    lv_targetUpperBound_13_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_13_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryFormalRelation6249); 

                        	newLeafNode(otherlv_14, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryFormalRelation6263); 

                	newLeafNode(otherlv_15, grammarAccess.getBinaryFormalRelationAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleBinaryFormalRelation"


    // $ANTLR start "entryRuleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2911:1: entryRuleModeUniversal returns [EObject current=null] : iv_ruleModeUniversal= ruleModeUniversal EOF ;
    public final EObject entryRuleModeUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2912:2: (iv_ruleModeUniversal= ruleModeUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2913:2: iv_ruleModeUniversal= ruleModeUniversal EOF
            {
             newCompositeNode(grammarAccess.getModeUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal6299);
            iv_ruleModeUniversal=ruleModeUniversal();

            state._fsp--;

             current =iv_ruleModeUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModeUniversal6309); 

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
    // $ANTLR end "entryRuleModeUniversal"


    // $ANTLR start "ruleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2920:1: ruleModeUniversal returns [EObject current=null] : (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleModeUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2923:28: ( (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2924:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2924:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2924:3: otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleModeUniversal6346); 

                	newLeafNode(otherlv_0, grammarAccess.getModeUniversalAccess().getModeUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2928:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2929:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2929:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2930:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModeUniversal6363); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModeUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModeUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModeUniversal6380); 

                	newLeafNode(otherlv_2, grammarAccess.getModeUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2950:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==32||LA51_0==58) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2951:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2951:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2952:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleModeUniversal6401);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModeUniversal6414); 

                	newLeafNode(otherlv_4, grammarAccess.getModeUniversalAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModeUniversal"


    // $ANTLR start "entryRuleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2980:1: entryRuleQualityUniversal returns [EObject current=null] : iv_ruleQualityUniversal= ruleQualityUniversal EOF ;
    public final EObject entryRuleQualityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2981:2: (iv_ruleQualityUniversal= ruleQualityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2982:2: iv_ruleQualityUniversal= ruleQualityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQualityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal6450);
            iv_ruleQualityUniversal=ruleQualityUniversal();

            state._fsp--;

             current =iv_ruleQualityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualityUniversal6460); 

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
    // $ANTLR end "entryRuleQualityUniversal"


    // $ANTLR start "ruleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2989:1: ruleQualityUniversal returns [EObject current=null] : (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) ;
    public final EObject ruleQualityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_characterizedBy_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2992:28: ( (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2993:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2993:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2993:3: otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleQualityUniversal6497); 

                	newLeafNode(otherlv_0, grammarAccess.getQualityUniversalAccess().getQualityUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2997:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2998:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2998:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2999:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal6514); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualityUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleQualityUniversal6531); 

                	newLeafNode(otherlv_2, grammarAccess.getQualityUniversalAccess().getCharacterizesKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3019:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3020:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3020:1: (otherlv_3= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3021:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal6551); 

            		newLeafNode(otherlv_3, grammarAccess.getQualityUniversalAccess().getCharacterizationCharacterizationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQualityUniversal6563); 

                	newLeafNode(otherlv_4, grammarAccess.getQualityUniversalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3036:1: (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3036:3: otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleQualityUniversal6576); 

                        	newLeafNode(otherlv_5, grammarAccess.getQualityUniversalAccess().getDatatypesKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQualityUniversal6588); 

                        	newLeafNode(otherlv_6, grammarAccess.getQualityUniversalAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3044:1: ( (otherlv_7= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3045:1: (otherlv_7= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3045:1: (otherlv_7= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3046:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal6608); 

                    		newLeafNode(otherlv_7, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_2_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3057:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==18) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3057:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQualityUniversal6621); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getQualityUniversalAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3061:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3062:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3062:1: (otherlv_9= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3063:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal6641); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleQualityUniversal6655); 

                        	newLeafNode(otherlv_10, grammarAccess.getQualityUniversalAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3078:3: ( (lv_characterizedBy_11_0= ruleCharacterization ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==32||LA54_0==58) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3079:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3079:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3080:3: lv_characterizedBy_11_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQualityUniversal6678);
            	    lv_characterizedBy_11_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_11_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQualityUniversal6691); 

                	newLeafNode(otherlv_12, grammarAccess.getQualityUniversalAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleQualityUniversal"


    // $ANTLR start "entryRulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3108:1: entryRulenAryMaterialRelation returns [EObject current=null] : iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF ;
    public final EObject entryRulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3109:2: (iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3110:2: iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation6727);
            iv_rulenAryMaterialRelation=rulenAryMaterialRelation();

            state._fsp--;

             current =iv_rulenAryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryMaterialRelation6737); 

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
    // $ANTLR end "entryRulenAryMaterialRelation"


    // $ANTLR start "rulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3117:1: rulenAryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) ;
    public final EObject rulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_13_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3120:28: ( (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3121:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3121:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3121:3: otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulenAryMaterialRelation6774); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulenAryMaterialRelation6786); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryMaterialRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3129:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3130:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3130:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3131:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation6806); 

            		newLeafNode(otherlv_2, grammarAccess.getNAryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3142:2: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3143:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3143:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3144:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation6823); 

            			newLeafNode(lv_name_3_0, grammarAccess.getNAryMaterialRelationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3160:2: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3160:3: ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3160:3: ( (otherlv_4= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3161:1: (otherlv_4= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3161:1: (otherlv_4= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3162:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation6849); 

                    		newLeafNode(otherlv_4, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3173:2: (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3173:4: otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation6862); 

                        	newLeafNode(otherlv_5, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3177:1: ( (lv_sourceLowerBound_6_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3178:1: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3178:1: (lv_sourceLowerBound_6_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3179:3: lv_sourceLowerBound_6_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_4_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_rulenAryMaterialRelation6883);
                    lv_sourceLowerBound_6_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_6_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryMaterialRelation6895); 

                        	newLeafNode(otherlv_7, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3199:1: ( (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3200:1: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3200:1: (lv_sourceUpperBound_8_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3201:3: lv_sourceUpperBound_8_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_4_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_rulenAryMaterialRelation6916);
                    lv_sourceUpperBound_8_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_8_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryMaterialRelation6928); 

                        	newLeafNode(otherlv_9, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3221:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3221:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryMaterialRelation6942); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getNAryMaterialRelationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3225:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3226:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3226:1: (otherlv_11= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3227:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation6962); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3238:4: (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3238:6: otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation6977); 

                        	newLeafNode(otherlv_12, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3242:1: ( (lv_sourceLowerBound_13_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3243:1: (lv_sourceLowerBound_13_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3243:1: (lv_sourceLowerBound_13_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3244:3: lv_sourceLowerBound_13_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_4_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_rulenAryMaterialRelation6998);
                    lv_sourceLowerBound_13_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_13_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryMaterialRelation7010); 

                        	newLeafNode(otherlv_14, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3264:1: ( (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3265:1: (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3265:1: (lv_sourceUpperBound_15_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3266:3: lv_sourceUpperBound_15_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_4_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_rulenAryMaterialRelation7031);
                    lv_sourceUpperBound_15_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_15_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryMaterialRelation7043); 

                        	newLeafNode(otherlv_16, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryMaterialRelation7058); 

                	newLeafNode(otherlv_17, grammarAccess.getNAryMaterialRelationAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "rulenAryMaterialRelation"


    // $ANTLR start "entryRulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3298:1: entryRulenAryFormalRelation returns [EObject current=null] : iv_rulenAryFormalRelation= rulenAryFormalRelation EOF ;
    public final EObject entryRulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3299:2: (iv_rulenAryFormalRelation= rulenAryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3300:2: iv_rulenAryFormalRelation= rulenAryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation7094);
            iv_rulenAryFormalRelation=rulenAryFormalRelation();

            state._fsp--;

             current =iv_rulenAryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryFormalRelation7104); 

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
    // $ANTLR end "entryRulenAryFormalRelation"


    // $ANTLR start "rulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3307:1: rulenAryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) ;
    public final EObject rulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_12_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3310:28: ( (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3311:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3311:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3311:3: otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulenAryFormalRelation7141); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulenAryFormalRelation7153); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryFormalRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3319:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3320:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3320:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3321:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7170); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNAryFormalRelationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3337:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3337:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3337:3: ( (otherlv_3= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3338:1: (otherlv_3= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3338:1: (otherlv_3= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3339:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7196); 

                    		newLeafNode(otherlv_3, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3350:2: (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3350:4: otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation7209); 

                        	newLeafNode(otherlv_4, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3354:1: ( (lv_sourceLowerBound_5_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3355:1: (lv_sourceLowerBound_5_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3355:1: (lv_sourceLowerBound_5_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3356:3: lv_sourceLowerBound_5_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_rulenAryFormalRelation7230);
                    lv_sourceLowerBound_5_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_5_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryFormalRelation7242); 

                        	newLeafNode(otherlv_6, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3376:1: ( (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3377:1: (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3377:1: (lv_sourceUpperBound_7_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3378:3: lv_sourceUpperBound_7_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_rulenAryFormalRelation7263);
                    lv_sourceUpperBound_7_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_7_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryFormalRelation7275); 

                        	newLeafNode(otherlv_8, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3398:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==18) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3398:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryFormalRelation7289); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getNAryFormalRelationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3402:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3403:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3403:1: (otherlv_10= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3404:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7309); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3415:4: (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3415:6: otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) ) otherlv_15= ']'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation7324); 

                        	newLeafNode(otherlv_11, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3419:1: ( (lv_sourceLowerBound_12_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3420:1: (lv_sourceLowerBound_12_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3420:1: (lv_sourceLowerBound_12_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3421:3: lv_sourceLowerBound_12_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_3_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_rulenAryFormalRelation7345);
                    lv_sourceLowerBound_12_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_12_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulenAryFormalRelation7357); 

                        	newLeafNode(otherlv_13, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3441:1: ( (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3442:1: (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3442:1: (lv_sourceUpperBound_14_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3443:3: lv_sourceUpperBound_14_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_3_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_rulenAryFormalRelation7378);
                    lv_sourceUpperBound_14_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_14_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulenAryFormalRelation7390); 

                        	newLeafNode(otherlv_15, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryFormalRelation7405); 

                	newLeafNode(otherlv_16, grammarAccess.getNAryFormalRelationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "rulenAryFormalRelation"


    // $ANTLR start "entryRuleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3475:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3476:2: (iv_ruleCharacterization= ruleCharacterization EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3477:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             newCompositeNode(grammarAccess.getCharacterizationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_entryRuleCharacterization7441);
            iv_ruleCharacterization=ruleCharacterization();

            state._fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterization7451); 

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
    // $ANTLR end "entryRuleCharacterization"


    // $ANTLR start "ruleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3484:1: ruleCharacterization returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_4_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3487:28: ( ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3488:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3488:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3488:2: () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3488:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3489:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharacterizationAccess().getCharacterizationAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3494:2: (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==32) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3494:4: otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization7498); 

                        	newLeafNode(otherlv_1, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3498:1: ( (lv_sourceLowerBound_2_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3499:1: (lv_sourceLowerBound_2_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3499:1: (lv_sourceLowerBound_2_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3500:3: lv_sourceLowerBound_2_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleCharacterization7519);
                    lv_sourceLowerBound_2_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_2_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCharacterization7531); 

                        	newLeafNode(otherlv_3, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3520:1: ( (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3521:1: (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3521:1: (lv_sourceUpperBound_4_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3522:3: lv_sourceUpperBound_4_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleCharacterization7552);
                    lv_sourceUpperBound_4_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_4_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCharacterization7564); 

                        	newLeafNode(otherlv_5, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_1_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleCharacterization7578); 

                	newLeafNode(otherlv_6, grammarAccess.getCharacterizationAccess().getCharacterizedByKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3546:1: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3547:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3547:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3548:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterizationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization7598); 

            		newLeafNode(otherlv_7, grammarAccess.getCharacterizationAccess().getTargetIntrinsicMomentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3559:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==32) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3559:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization7611); 

                        	newLeafNode(otherlv_8, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:1: ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3564:1: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3564:1: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3565:3: lv_targetLowerBound_9_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleCharacterization7632);
                    lv_targetLowerBound_9_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCharacterization7644); 

                        	newLeafNode(otherlv_10, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3585:1: ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3586:1: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3586:1: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3587:3: lv_targetUpperBound_11_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleCharacterization7665);
                    lv_targetUpperBound_11_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCharacterization7677); 

                        	newLeafNode(otherlv_12, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCharacterization7691); 

                	newLeafNode(otherlv_13, grammarAccess.getCharacterizationAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleCharacterization"


    // $ANTLR start "entryRuleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3621:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3622:2: (iv_ruleMediation= ruleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3623:2: iv_ruleMediation= ruleMediation EOF
            {
             newCompositeNode(grammarAccess.getMediationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMediation_in_entryRuleMediation7729);
            iv_ruleMediation=ruleMediation();

            state._fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediation7739); 

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
    // $ANTLR end "entryRuleMediation"


    // $ANTLR start "ruleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3630:1: ruleMediation returns [EObject current=null] : ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3633:28: ( ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3634:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3634:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3634:2: () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3634:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3635:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMediationAccess().getMediationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleMediation7785); 

                	newLeafNode(otherlv_1, grammarAccess.getMediationAccess().getMediatesKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3644:1: (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3644:3: otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation7798); 

                        	newLeafNode(otherlv_2, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3648:1: ( (lv_sourceLowerBound_3_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3649:1: (lv_sourceLowerBound_3_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3649:1: (lv_sourceLowerBound_3_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3650:3: lv_sourceLowerBound_3_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceLowerBoundCardinalityBoundParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleMediation7819);
                    lv_sourceLowerBound_3_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_3_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMediation7831); 

                        	newLeafNode(otherlv_4, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_2_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3670:1: ( (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3671:1: (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3671:1: (lv_sourceUpperBound_5_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3672:3: lv_sourceUpperBound_5_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceUpperBoundCardinalityUpperBoundParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleMediation7852);
                    lv_sourceUpperBound_5_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_5_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMediation7864); 

                        	newLeafNode(otherlv_6, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3692:3: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3693:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3693:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3694:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMediationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation7886); 

            		newLeafNode(otherlv_7, grammarAccess.getMediationAccess().getTargetExternallyDependentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3705:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==32) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3705:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation7899); 

                        	newLeafNode(otherlv_8, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3709:1: ( (lv_targetLowerBound_9_0= ruleCardinalityBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3710:1: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3710:1: (lv_targetLowerBound_9_0= ruleCardinalityBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3711:3: lv_targetLowerBound_9_0= ruleCardinalityBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetLowerBoundCardinalityBoundParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleMediation7920);
                    lv_targetLowerBound_9_0=ruleCardinalityBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"CardinalityBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMediation7932); 

                        	newLeafNode(otherlv_10, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3731:1: ( (lv_targetUpperBound_11_0= ruleCardinalityUpperBound ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3732:1: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3732:1: (lv_targetUpperBound_11_0= ruleCardinalityUpperBound )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3733:3: lv_targetUpperBound_11_0= ruleCardinalityUpperBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetUpperBoundCardinalityUpperBoundParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_ruleMediation7953);
                    lv_targetUpperBound_11_0=ruleCardinalityUpperBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"CardinalityUpperBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMediation7965); 

                        	newLeafNode(otherlv_12, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMediation7979); 

                	newLeafNode(otherlv_13, grammarAccess.getMediationAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleMediation"


    // $ANTLR start "entryRuleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3765:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3766:2: (iv_ruleEString= ruleEString EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3767:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString8016);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString8027); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3774:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3777:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3778:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3778:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3778:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString8067); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3786:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString8093); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3801:1: entryRulePrimitiveDataTypeType returns [String current=null] : iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF ;
    public final String entryRulePrimitiveDataTypeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveDataTypeType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3802:2: (iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3803:2: iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8139);
            iv_rulePrimitiveDataTypeType=rulePrimitiveDataTypeType();

            state._fsp--;

             current =iv_rulePrimitiveDataTypeType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8150); 

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
    // $ANTLR end "entryRulePrimitiveDataTypeType"


    // $ANTLR start "rulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3810:1: rulePrimitiveDataTypeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PrimitiveDataTypeType' ;
    public final AntlrDatatypeRuleToken rulePrimitiveDataTypeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3813:28: (kw= 'PrimitiveDataTypeType' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3815:2: kw= 'PrimitiveDataTypeType'
            {
            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimitiveDataTypeType8187); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPrimitiveDataTypeTypeAccess().getPrimitiveDataTypeTypeKeyword()); 
                

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
    // $ANTLR end "rulePrimitiveDataTypeType"


    // $ANTLR start "entryRuleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3828:1: entryRuleDataTypeAttribute returns [EObject current=null] : iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF ;
    public final EObject entryRuleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAttribute = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3829:2: (iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3830:2: iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8226);
            iv_ruleDataTypeAttribute=ruleDataTypeAttribute();

            state._fsp--;

             current =iv_ruleDataTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAttribute8236); 

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
    // $ANTLR end "entryRuleDataTypeAttribute"


    // $ANTLR start "ruleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3837:1: ruleDataTypeAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3840:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3841:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3841:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3841:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3841:2: ( (otherlv_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3842:1: (otherlv_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3842:1: (otherlv_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3843:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8281); 

            		newLeafNode(otherlv_0, grammarAccess.getDataTypeAttributeAccess().getIsOfTypeDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3854:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3855:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3855:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3856:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8298); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDataTypeAttribute"


    // $ANTLR start "entryRuleCardinalityUpperBound"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3882:1: entryRuleCardinalityUpperBound returns [String current=null] : iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF ;
    public final String entryRuleCardinalityUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityUpperBound = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3883:2: (iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3884:2: iv_ruleCardinalityUpperBound= ruleCardinalityUpperBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityUpperBoundRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardinalityUpperBound_in_entryRuleCardinalityUpperBound8342);
            iv_ruleCardinalityUpperBound=ruleCardinalityUpperBound();

            state._fsp--;

             current =iv_ruleCardinalityUpperBound.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardinalityUpperBound8353); 

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
    // $ANTLR end "entryRuleCardinalityUpperBound"


    // $ANTLR start "ruleCardinalityUpperBound"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:1: ruleCardinalityUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CardinalityBound_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3894:28: ( (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3895:1: (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3895:1: (this_CardinalityBound_0= ruleCardinalityBound | kw= '*' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                alt64=1;
            }
            else if ( (LA64_0==61) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3896:5: this_CardinalityBound_0= ruleCardinalityBound
                    {
                     
                            newCompositeNode(grammarAccess.getCardinalityUpperBoundAccess().getCardinalityBoundParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_ruleCardinalityUpperBound8400);
                    this_CardinalityBound_0=ruleCardinalityBound();

                    state._fsp--;


                    		current.merge(this_CardinalityBound_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3908:2: kw= '*'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCardinalityUpperBound8424); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCardinalityUpperBoundAccess().getAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleCardinalityUpperBound"


    // $ANTLR start "entryRuleCardinalityBound"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3921:1: entryRuleCardinalityBound returns [String current=null] : iv_ruleCardinalityBound= ruleCardinalityBound EOF ;
    public final String entryRuleCardinalityBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityBound = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3922:2: (iv_ruleCardinalityBound= ruleCardinalityBound EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3923:2: iv_ruleCardinalityBound= ruleCardinalityBound EOF
            {
             newCompositeNode(grammarAccess.getCardinalityBoundRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardinalityBound_in_entryRuleCardinalityBound8465);
            iv_ruleCardinalityBound=ruleCardinalityBound();

            state._fsp--;

             current =iv_ruleCardinalityBound.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardinalityBound8476); 

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
    // $ANTLR end "entryRuleCardinalityBound"


    // $ANTLR start "ruleCardinalityBound"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3930:1: ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleCardinalityBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3933:28: (this_INT_0= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3934:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCardinalityBound8515); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleCardinalityBound"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\4\20\uffff\2\63\6\uffff";
    static final String DFA2_maxS =
        "\1\66\20\uffff\2\71\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\23\1\24\1\25\1\21\1\22\1\26";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\6\uffff\1\1\2\uffff\2\2\6\uffff\1\3\2\uffff\1\4\1\5\5\6\7\uffff\1\7\1\10\2\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\5\uffff\1\25",
            "\1\27\5\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )";
        }
    }
    static final String DFA13_eotS =
        "\32\uffff";
    static final String DFA13_eofS =
        "\32\uffff";
    static final String DFA13_minS =
        "\1\33\1\34\1\35\1\36\1\37\1\4\1\37\1\4\2\40\1\6\4\uffff\1\6\2\41\2\6\4\42\2\43";
    static final String DFA13_maxS =
        "\5\37\1\4\1\37\1\4\1\46\1\45\1\6\4\uffff\1\6\2\41\2\75\4\42\1\46\1\45";
    static final String DFA13_acceptS =
        "\13\uffff\1\3\1\4\1\2\1\1\13\uffff";
    static final String DFA13_specialS =
        "\32\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\2\1\3\1\4\1\5",
            "\1\3\1\4\1\5",
            "\1\6\1\7",
            "\1\5",
            "\1\10",
            "\1\7",
            "\1\11",
            "\1\12\2\uffff\1\16\1\15\1\13\1\14",
            "\1\17\2\uffff\1\16\1\15\1\13",
            "\1\20",
            "",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\66\uffff\1\25",
            "\1\26\66\uffff\1\27",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\31",
            "\1\16\1\15\1\13\1\14",
            "\1\16\1\15\1\13"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "947:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleModel140 = new BitSet(new long[]{0x0077FF80FE40C812L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_ruleElement234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_ruleElement261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_ruleElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_ruleElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_ruleElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_ruleElement369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_ruleElement396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_ruleElement423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_ruleElement450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_ruleElement477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_ruleElement504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_ruleElement531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleElement558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleElement585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_ruleElement612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_ruleElement639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_ruleElement693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_ruleElement720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_ruleElement747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_ruleElement774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_ruleElement801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage900 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage934 = new BitSet(new long[]{0x0077FF80FE40E810L});
        public static final BitSet FOLLOW_ruleElement_in_rulePackage955 = new BitSet(new long[]{0x0077FF80FE40E810L});
        public static final BitSet FOLLOW_13_in_rulePackage968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralizationSet1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompleteGeneralizationSet_in_ruleGeneralizationSet1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousGeneralizationSet_in_ruleGeneralizationSet1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompleteGeneralizationSet_in_entryRuleCompleteGeneralizationSet1123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompleteGeneralizationSet1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCompleteGeneralizationSet1176 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompleteGeneralizationSet1202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCompleteGeneralizationSet1236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1256 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCompleteGeneralizationSet1268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1288 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleCompleteGeneralizationSet1301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompleteGeneralizationSet1321 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleCompleteGeneralizationSet1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousGeneralizationSet_in_entryRuleAnonymousGeneralizationSet1371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousGeneralizationSet1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1426 = new BitSet(new long[]{0x0000000000250000L});
        public static final BitSet FOLLOW_18_in_ruleAnonymousGeneralizationSet1441 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1461 = new BitSet(new long[]{0x0000000000340000L});
        public static final BitSet FOLLOW_20_in_ruleAnonymousGeneralizationSet1476 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21_in_ruleAnonymousGeneralizationSet1494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16_in_ruleAnonymousGeneralizationSet1515 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21_in_ruleAnonymousGeneralizationSet1533 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousGeneralizationSet1555 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnonymousGeneralizationSet1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataType1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveDataType1654 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveDataType1671 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePrimitiveDataType1688 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1709 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveDataType1721 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePrimitiveDataType1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleComplexDataType1816 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComplexDataType1833 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComplexDataType1850 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1871 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_19_in_ruleComplexDataType1884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1905 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_13_in_ruleComplexDataType1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEnumeration2002 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration2019 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnumeration2036 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration2057 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleEnumeration2070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration2091 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEnumeration2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation2141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeronymicRelation2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation2314 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentOfRelation2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleComponentOfRelation2368 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_28_in_ruleComponentOfRelation2400 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleComponentOfRelation2432 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleComponentOfRelation2464 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentOfRelation2491 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2511 = new BitSet(new long[]{0x0000000900000000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2524 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleComponentOfRelation2545 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleComponentOfRelation2557 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleComponentOfRelation2578 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleComponentOfRelation2590 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleComponentOfRelation2604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2624 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2637 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleComponentOfRelation2658 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleComponentOfRelation2670 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleComponentOfRelation2691 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleComponentOfRelation2703 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentOfRelation2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation2753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMembershipRelation2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleMembershipRelation2807 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_28_in_ruleMembershipRelation2839 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleMembershipRelation2871 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleMembershipRelation2903 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMembershipRelation2930 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation2950 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation2963 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleMembershipRelation2984 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMembershipRelation2996 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleMembershipRelation3017 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMembershipRelation3029 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMembershipRelation3043 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation3063 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation3076 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleMembershipRelation3097 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMembershipRelation3109 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleMembershipRelation3130 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMembershipRelation3142 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMembershipRelation3156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubCollectionRelation3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSubCollectionRelation3246 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_28_in_ruleSubCollectionRelation3278 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleSubCollectionRelation3310 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleSubCollectionRelation3342 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubCollectionRelation3369 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation3389 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation3402 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleSubCollectionRelation3423 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubCollectionRelation3435 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleSubCollectionRelation3456 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubCollectionRelation3468 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubCollectionRelation3482 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation3502 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation3515 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleSubCollectionRelation3536 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubCollectionRelation3548 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleSubCollectionRelation3569 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubCollectionRelation3581 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubCollectionRelation3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation3631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubQuantityRelation3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSubQuantityRelation3685 = new BitSet(new long[]{0x00000000D0000000L});
        public static final BitSet FOLLOW_28_in_ruleSubQuantityRelation3717 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleSubQuantityRelation3749 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubQuantityRelation3776 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation3796 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation3809 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleSubQuantityRelation3830 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubQuantityRelation3842 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleSubQuantityRelation3863 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubQuantityRelation3875 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleSubQuantityRelation3889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation3909 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation3922 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleSubQuantityRelation3943 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSubQuantityRelation3955 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleSubQuantityRelation3976 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSubQuantityRelation3988 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubQuantityRelation4002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind4038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind4048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleKind4094 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKind4111 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind4128 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleKind4149 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleKind4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal4198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantityUniversal4208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleQuantityUniversal4254 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuantityUniversal4271 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuantityUniversal4288 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQuantityUniversal4309 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleQuantityUniversal4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal4358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectiveUniversal4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleCollectiveUniversal4411 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCollectiveUniversal4437 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCollectiveUniversal4454 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCollectiveUniversal4471 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal4492 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleCollectiveUniversal4505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_entryRuleSubKind4541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubKind4551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSubKind4597 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubKind4614 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubKind4631 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleSubKind4652 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleSubKind4665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole4701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole4711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleRole4748 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole4765 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole4782 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRole4803 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleRole4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_entryRulePhase4852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhase4862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rulePhase4908 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhase4925 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhase4942 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_rulePhase4963 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_rulePhase4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory5012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory5022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleCategory5068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCategory5085 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory5102 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCategory5114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin5150 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin5160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMixin5206 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixin5223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin5240 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMixin5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin5288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoleMixin5298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleRoleMixin5335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRoleMixin5352 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoleMixin5369 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoleMixin5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal5417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelatorUniversal5427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleRelatorUniversal5464 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelatorUniversal5481 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelatorUniversal5498 = new BitSet(new long[]{0x0C00000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRelatorUniversal5519 = new BitSet(new long[]{0x0C00000100002000L});
        public static final BitSet FOLLOW_ruleMediation_in_ruleRelatorUniversal5541 = new BitSet(new long[]{0x0800000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRelatorUniversal5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation5590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryMaterialRelation5600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleBinaryMaterialRelation5637 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleBinaryMaterialRelation5649 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5669 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation5682 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleBinaryMaterialRelation5703 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryMaterialRelation5715 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryMaterialRelation5736 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryMaterialRelation5748 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5767 = new BitSet(new long[]{0x0000000000800010L});
        public static final BitSet FOLLOW_23_in_ruleBinaryMaterialRelation5785 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5805 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryMaterialRelation5817 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation5839 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation5852 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleBinaryMaterialRelation5873 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryMaterialRelation5885 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryMaterialRelation5906 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryMaterialRelation5918 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryMaterialRelation5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation5968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryFormalRelation5978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleBinaryFormalRelation6015 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleBinaryFormalRelation6027 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6047 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation6060 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleBinaryFormalRelation6081 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryFormalRelation6093 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryFormalRelation6114 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryFormalRelation6126 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6145 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6170 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation6183 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleBinaryFormalRelation6204 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBinaryFormalRelation6216 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleBinaryFormalRelation6237 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleBinaryFormalRelation6249 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryFormalRelation6263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal6299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModeUniversal6309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleModeUniversal6346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModeUniversal6363 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModeUniversal6380 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleModeUniversal6401 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleModeUniversal6414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal6450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualityUniversal6460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleQualityUniversal6497 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal6514 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleQualityUniversal6531 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal6551 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQualityUniversal6563 = new BitSet(new long[]{0x0500000100002000L});
        public static final BitSet FOLLOW_56_in_ruleQualityUniversal6576 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleQualityUniversal6588 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal6608 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_18_in_ruleQualityUniversal6621 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal6641 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleQualityUniversal6655 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQualityUniversal6678 = new BitSet(new long[]{0x0400000100002000L});
        public static final BitSet FOLLOW_13_in_ruleQualityUniversal6691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation6727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryMaterialRelation6737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulenAryMaterialRelation6774 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_rulenAryMaterialRelation6786 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation6806 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation6823 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation6849 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation6862 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_rulenAryMaterialRelation6883 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryMaterialRelation6895 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_rulenAryMaterialRelation6916 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryMaterialRelation6928 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_18_in_rulenAryMaterialRelation6942 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation6962 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation6977 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_rulenAryMaterialRelation6998 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryMaterialRelation7010 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_rulenAryMaterialRelation7031 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryMaterialRelation7043 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryMaterialRelation7058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation7094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryFormalRelation7104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulenAryFormalRelation7141 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_rulenAryFormalRelation7153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7170 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7196 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation7209 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_rulenAryFormalRelation7230 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryFormalRelation7242 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_rulenAryFormalRelation7263 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryFormalRelation7275 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_18_in_rulenAryFormalRelation7289 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7309 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation7324 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_rulenAryFormalRelation7345 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulenAryFormalRelation7357 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_rulenAryFormalRelation7378 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_rulenAryFormalRelation7390 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryFormalRelation7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_entryRuleCharacterization7441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterization7451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization7498 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleCharacterization7519 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleCharacterization7531 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleCharacterization7552 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCharacterization7564 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleCharacterization7578 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization7598 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization7611 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleCharacterization7632 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleCharacterization7644 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleCharacterization7665 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleCharacterization7677 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCharacterization7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_entryRuleMediation7729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediation7739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleMediation7785 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_32_in_ruleMediation7798 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleMediation7819 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMediation7831 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleMediation7852 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMediation7864 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation7886 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32_in_ruleMediation7899 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleMediation7920 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMediation7932 = new BitSet(new long[]{0x2000000000000040L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_ruleMediation7953 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMediation7965 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMediation7979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString8027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString8093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePrimitiveDataTypeType8187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAttribute8236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8281 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinalityUpperBound_in_entryRuleCardinalityUpperBound8342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityUpperBound8353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_ruleCardinalityUpperBound8400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCardinalityUpperBound8424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinalityBound_in_entryRuleCardinalityBound8465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityBound8476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCardinalityBound8515 = new BitSet(new long[]{0x0000000000000002L});
    }


}