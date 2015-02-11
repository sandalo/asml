package br.ufmg.dcc.asml.serializer;

import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.Component;
import br.ufmg.dcc.asml.aSMLModel.Configuration;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator;
import br.ufmg.dcc.asml.aSMLModel.File;
import br.ufmg.dcc.asml.aSMLModel.FrameworkClass;
import br.ufmg.dcc.asml.aSMLModel.FrameworkInstantiation;
import br.ufmg.dcc.asml.aSMLModel.Layer;
import br.ufmg.dcc.asml.aSMLModel.LayerMatching;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.Method;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.ModuleMatching;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.View;
import br.ufmg.dcc.asml.aSMLModel.XmlDocument;
import br.ufmg.dcc.asml.aSMLModel.XmlElement;
import br.ufmg.dcc.asml.services.ASMLModelGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ASMLModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ASMLModelGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ASMLModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ASMLModelPackage.ASML_MODEL:
				if(context == grammarAccess.getASMLModelRule()) {
					sequence_ASMLModel(context, (ASMLModel) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.CLASS:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getClassRule()) {
					sequence_Class(context, (br.ufmg.dcc.asml.aSMLModel.Class) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.CLASS_MATCHING:
				if(context == grammarAccess.getAbstractNameConvetionRule() ||
				   context == grammarAccess.getClassMatchingRule()) {
					sequence_ClassMatching(context, (ClassMatching) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.COMPONENT:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.CONFIGURATION:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getConfigurationRule() ||
				   context == grammarAccess.getConfigurationElementRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.EXPRESSION_MATCHING_OPERATOR:
				if(context == grammarAccess.getExpressionMatchingOperatorRule()) {
					sequence_ExpressionMatchingOperator(context, (ExpressionMatchingOperator) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.FILE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getConfigurationElementRule() ||
				   context == grammarAccess.getFileRule()) {
					sequence_File(context, (File) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.FRAMEWORK_CLASS:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getFrameworkClassRule()) {
					sequence_FrameworkClass(context, (FrameworkClass) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.FRAMEWORK_INSTANTIATION:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getFrameworkInstantiationRule()) {
					sequence_FrameworkInstantiation(context, (FrameworkInstantiation) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.LAYER:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getLayerRule()) {
					sequence_Layer(context, (Layer) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.LAYER_MATCHING:
				if(context == grammarAccess.getLayerMatchingRule()) {
					sequence_LayerMatching(context, (LayerMatching) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.META_MODULE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getMetaModuleRule()) {
					sequence_MetaModule(context, (MetaModule) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.METHOD:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.MODULE:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.MODULE_MATCHING:
				if(context == grammarAccess.getModuleMatchingRule()) {
					sequence_ModuleMatching(context, (ModuleMatching) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.RESTRICTION:
				if(context == grammarAccess.getRestrictionRule()) {
					sequence_Restriction(context, (Restriction) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.VIEW:
				if(context == grammarAccess.getViewRule()) {
					sequence_View(context, (View) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.XML_DOCUMENT:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getConfigurationElementRule() ||
				   context == grammarAccess.getXmlDocumentRule()) {
					sequence_XmlDocument(context, (XmlDocument) semanticObject); 
					return; 
				}
				else break;
			case ASMLModelPackage.XML_ELEMENT:
				if(context == grammarAccess.getAbstractComponentRule() ||
				   context == grammarAccess.getConfigurationElementRule() ||
				   context == grammarAccess.getXmlElementRule()) {
					sequence_XmlElement(context, (XmlElement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID_ASML importURI=STRING? views+=View*)
	 */
	protected void sequence_ASMLModel(EObject context, ASMLModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML value=STRING)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameID_ASMLTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressionMatching=ExpressionMatchingClause parameter=STRING)
	 */
	protected void sequence_ClassMatching(EObject context, ClassMatching semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.CLASS_MATCHING__EXPRESSION_MATCHING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.CLASS_MATCHING__EXPRESSION_MATCHING));
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.CLASS_MATCHING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.CLASS_MATCHING__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassMatchingAccess().getExpressionMatchingExpressionMatchingClauseEnumRuleCall_0_0(), semanticObject.getExpressionMatching());
		feeder.accept(grammarAccess.getClassMatchingAccess().getParameterSTRINGTerminalRuleCall_1_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML description=STRING? matching=AbstractNameConvetion? cardinality=Cardinality? methods+=Method*)
	 */
	protected void sequence_Class(EObject context, br.ufmg.dcc.asml.aSMLModel.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=STRING? cardinality=Cardinality? components+=AbstractComponent* restrictions+=Restriction*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=STRING? cardinality=Cardinality? configurationElement+=ConfigurationElement*)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (AND='and' | OR='or')
	 */
	protected void sequence_ExpressionMatchingOperator(EObject context, ExpressionMatchingOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=AbstractNameConvetion? cardinality=Cardinality?)
	 */
	protected void sequence_File(EObject context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML javaCLass=STRING)
	 */
	protected void sequence_FrameworkClass(EObject context, FrameworkClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.ABSTRACT_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.ABSTRACT_COMPONENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.FRAMEWORK_CLASS__JAVA_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.FRAMEWORK_CLASS__JAVA_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFrameworkClassAccess().getNameID_ASMLTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFrameworkClassAccess().getJavaCLassSTRINGTerminalRuleCall_3_0(), semanticObject.getJavaCLass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML components+=AbstractComponent* restrictions+=Restriction*)
	 */
	protected void sequence_FrameworkInstantiation(EObject context, FrameworkInstantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (layerMatching=LayerMatchingClause parameter=[AbstractComponent|QualifiedName])
	 */
	protected void sequence_LayerMatching(EObject context, LayerMatching semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.LAYER_MATCHING__LAYER_MATCHING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.LAYER_MATCHING__LAYER_MATCHING));
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.LAYER_MATCHING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.LAYER_MATCHING__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLayerMatchingAccess().getLayerMatchingLayerMatchingClauseEnumRuleCall_0_0(), semanticObject.getLayerMatching());
		feeder.accept(grammarAccess.getLayerMatchingAccess().getParameterAbstractComponentQualifiedNameParserRuleCall_1_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=LayerMatching? modules+=Module* restrictions+=Restriction*)
	 */
	protected void sequence_Layer(EObject context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML attributes+=Attribute* matching=ModuleMatching? components+=AbstractComponent* restrictions+=Restriction*)
	 */
	protected void sequence_MetaModule(EObject context, MetaModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=STRING? cardinality=Cardinality?)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameter=ModuleMatchingParamenter
	 */
	protected void sequence_ModuleMatching(EObject context, ModuleMatching semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ASMLModelPackage.Literals.MODULE_MATCHING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ASMLModelPackage.Literals.MODULE_MATCHING__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModuleMatchingAccess().getParameterModuleMatchingParamenterEnumRuleCall_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML attributes+=Attribute* matching=ModuleMatching? components+=AbstractComponent* restrictions+=Restriction*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         groupClause=GroupClause? 
	 *         componentA+=[AbstractComponent|QualifiedName]* 
	 *         permissionClause=PermissionClause? 
	 *         relactionType=RelactionType 
	 *         componentB=[AbstractComponent|QualifiedName]
	 *     )
	 */
	protected void sequence_Restriction(EObject context, Restriction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML attributes+=Attribute* components+=AbstractComponent* restrictions+=Restriction*)
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=STRING? cardinality=Cardinality?)
	 */
	protected void sequence_XmlDocument(EObject context, XmlDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID_ASML matching=STRING? cardinality=Cardinality?)
	 */
	protected void sequence_XmlElement(EObject context, XmlElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
