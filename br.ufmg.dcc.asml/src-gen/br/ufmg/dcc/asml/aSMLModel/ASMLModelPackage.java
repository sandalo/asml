/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelFactory
 * @model kind="package"
 * @generated
 */
public interface ASMLModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aSMLModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufmg.br/dcc/asml/ASMLModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aSMLModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ASMLModelPackage eINSTANCE = br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelImpl <em>ASML Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getASMLModel()
   * @generated
   */
  int ASML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASML_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASML_MODEL__IMPORT_URI = 1;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASML_MODEL__VIEWS = 2;

  /**
   * The feature id for the '<em><b>Ignore</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASML_MODEL__IGNORE = 3;

  /**
   * The number of structural features of the '<em>ASML Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASML_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getView()
   * @generated
   */
  int VIEW = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__COMPONENTS = 2;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__RESTRICTIONS = 3;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.AbstractComponentImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAbstractComponent()
   * @generated
   */
  int ABSTRACT_COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.AttributeImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AbstractNameConvetionImpl <em>Abstract Name Convetion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.AbstractNameConvetionImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAbstractNameConvetion()
   * @generated
   */
  int ABSTRACT_NAME_CONVETION = 4;

  /**
   * The number of structural features of the '<em>Abstract Name Convetion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_NAME_CONVETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExpressionMatchingOperatorImpl <em>Expression Matching Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ExpressionMatchingOperatorImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExpressionMatchingOperator()
   * @generated
   */
  int EXPRESSION_MATCHING_OPERATOR = 5;

  /**
   * The feature id for the '<em><b>AND</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MATCHING_OPERATOR__AND = 0;

  /**
   * The feature id for the '<em><b>OR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MATCHING_OPERATOR__OR = 1;

  /**
   * The number of structural features of the '<em>Expression Matching Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_MATCHING_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ModuleMatchingImpl <em>Module Matching</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ModuleMatchingImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModuleMatching()
   * @generated
   */
  int MODULE_MATCHING = 6;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_MATCHING__PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Module Matching</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_MATCHING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ClassMatchingImpl <em>Class Matching</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ClassMatchingImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getClassMatching()
   * @generated
   */
  int CLASS_MATCHING = 7;

  /**
   * The feature id for the '<em><b>Expression Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MATCHING__EXPRESSION_MATCHING = ABSTRACT_NAME_CONVETION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MATCHING__PARAMETER = ABSTRACT_NAME_CONVETION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Matching</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MATCHING_FEATURE_COUNT = ABSTRACT_NAME_CONVETION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationElementImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getConfigurationElement()
   * @generated
   */
  int CONFIGURATION_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_ELEMENT__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_ELEMENT__CARDINALITY = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Configuration Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_ELEMENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.FileImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getFile()
   * @generated
   */
  int FILE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = CONFIGURATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__CARDINALITY = CONFIGURATION_ELEMENT__CARDINALITY;

  /**
   * The feature id for the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__MATCHING = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = CONFIGURATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CARDINALITY = CONFIGURATION_ELEMENT__CARDINALITY;

  /**
   * The feature id for the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__MATCHING = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configuration Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CONFIGURATION_ELEMENT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.MethodImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MATCHING = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__CARDINALITY = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl <em>Meta Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMetaClass()
   * @generated
   */
  int META_CLASS = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__DESCRIPTION = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__MATCHING = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__CARDINALITY = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS__METHODS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Meta Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_CLASS_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl <em>External Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExternalClass()
   * @generated
   */
  int EXTERNAL_CLASS = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CLASS__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CLASS__DESCRIPTION = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CLASS__TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CLASS_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.XmlElementImpl <em>Xml Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.XmlElementImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getXmlElement()
   * @generated
   */
  int XML_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT__NAME = CONFIGURATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT__CARDINALITY = CONFIGURATION_ELEMENT__CARDINALITY;

  /**
   * The feature id for the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT__MATCHING = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_ELEMENT_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.XmlDocumentImpl <em>Xml Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.XmlDocumentImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getXmlDocument()
   * @generated
   */
  int XML_DOCUMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT__NAME = CONFIGURATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT__CARDINALITY = CONFIGURATION_ELEMENT__CARDINALITY;

  /**
   * The feature id for the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT__MATCHING = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DOCUMENT_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ModuleImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModule()
   * @generated
   */
  int MODULE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ATTRIBUTES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MATCHING = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__COMPONENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__RESTRICTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaModuleImpl <em>Meta Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.MetaModuleImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMetaModule()
   * @generated
   */
  int META_MODULE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE__ATTRIBUTES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE__MATCHING = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE__COMPONENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE__RESTRICTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Meta Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODULE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl <em>External Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExternalModule()
   * @generated
   */
  int EXTERNAL_MODULE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE__NAME = ABSTRACT_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE__ATTRIBUTES = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE__MATCHING = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE__COMPONENTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE__RESTRICTIONS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>External Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MODULE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl <em>Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getRestriction()
   * @generated
   */
  int RESTRICTION = 19;

  /**
   * The feature id for the '<em><b>Group Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__GROUP_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Component A</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__COMPONENT_A = 1;

  /**
   * The feature id for the '<em><b>Permission Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__PERMISSION_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Relaction Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__RELACTION_TYPE = 3;

  /**
   * The feature id for the '<em><b>Component B</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__COMPONENT_B = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.Cardinality <em>Cardinality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 20;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause <em>Expression Matching Clause</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExpressionMatchingClause()
   * @generated
   */
  int EXPRESSION_MATCHING_CLAUSE = 21;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter <em>Module Matching Paramenter</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModuleMatchingParamenter()
   * @generated
   */
  int MODULE_MATCHING_PARAMENTER = 22;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.GroupClause <em>Group Clause</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.GroupClause
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getGroupClause()
   * @generated
   */
  int GROUP_CLAUSE = 23;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.PermissionClause <em>Permission Clause</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.PermissionClause
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getPermissionClause()
   * @generated
   */
  int PERMISSION_CLAUSE = 24;

  /**
   * The meta object id for the '{@link br.ufmg.dcc.asml.aSMLModel.RelactionType <em>Relaction Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufmg.dcc.asml.aSMLModel.RelactionType
   * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getRelactionType()
   * @generated
   */
  int RELACTION_TYPE = 25;


  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel <em>ASML Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASML Model</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel
   * @generated
   */
  EClass getASMLModel();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel#getName()
   * @see #getASMLModel()
   * @generated
   */
  EAttribute getASMLModel_Name();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel#getImportURI()
   * @see #getASMLModel()
   * @generated
   */
  EAttribute getASMLModel_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel#getViews()
   * @see #getASMLModel()
   * @generated
   */
  EReference getASMLModel_Views();

  /**
   * Returns the meta object for the attribute list '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel#getIgnore <em>Ignore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ignore</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel#getIgnore()
   * @see #getASMLModel()
   * @generated
   */
  EAttribute getASMLModel_Ignore();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.View#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.View#getAttributes()
   * @see #getView()
   * @generated
   */
  EReference getView_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.View#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.View#getComponents()
   * @see #getView()
   * @generated
   */
  EReference getView_Components();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.View#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.View#getRestrictions()
   * @see #getView()
   * @generated
   */
  EReference getView_Restrictions();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent <em>Abstract Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Component</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.AbstractComponent
   * @generated
   */
  EClass getAbstractComponent();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.AbstractComponent#getName()
   * @see #getAbstractComponent()
   * @generated
   */
  EAttribute getAbstractComponent_Name();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion <em>Abstract Name Convetion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Name Convetion</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion
   * @generated
   */
  EClass getAbstractNameConvetion();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator <em>Expression Matching Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Matching Operator</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator
   * @generated
   */
  EClass getExpressionMatchingOperator();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator#getAND <em>AND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AND</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator#getAND()
   * @see #getExpressionMatchingOperator()
   * @generated
   */
  EAttribute getExpressionMatchingOperator_AND();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator#getOR <em>OR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>OR</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator#getOR()
   * @see #getExpressionMatchingOperator()
   * @generated
   */
  EAttribute getExpressionMatchingOperator_OR();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatching <em>Module Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatching
   * @generated
   */
  EClass getModuleMatching();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatching#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatching#getParameter()
   * @see #getModuleMatching()
   * @generated
   */
  EAttribute getModuleMatching_Parameter();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ClassMatching <em>Class Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ClassMatching
   * @generated
   */
  EClass getClassMatching();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ClassMatching#getExpressionMatching <em>Expression Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ClassMatching#getExpressionMatching()
   * @see #getClassMatching()
   * @generated
   */
  EAttribute getClassMatching_ExpressionMatching();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ClassMatching#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ClassMatching#getParameter()
   * @see #getClassMatching()
   * @generated
   */
  EAttribute getClassMatching_Parameter();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement <em>Configuration Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Element</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ConfigurationElement
   * @generated
   */
  EClass getConfigurationElement();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ConfigurationElement#getCardinality()
   * @see #getConfigurationElement()
   * @generated
   */
  EAttribute getConfigurationElement_Cardinality();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference '{@link br.ufmg.dcc.asml.aSMLModel.File#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.File#getMatching()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Matching();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Configuration#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Configuration#getMatching()
   * @see #getConfiguration()
   * @generated
   */
  EAttribute getConfiguration_Matching();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.Configuration#getConfigurationElement <em>Configuration Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configuration Element</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Configuration#getConfigurationElement()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_ConfigurationElement();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Method#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Method#getMatching()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Matching();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Method#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Method#getCardinality()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Cardinality();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.MetaClass <em>Meta Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Class</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaClass
   * @generated
   */
  EClass getMetaClass();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.MetaClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaClass#getDescription()
   * @see #getMetaClass()
   * @generated
   */
  EAttribute getMetaClass_Description();

  /**
   * Returns the meta object for the containment reference '{@link br.ufmg.dcc.asml.aSMLModel.MetaClass#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaClass#getMatching()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Matching();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.MetaClass#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaClass#getCardinality()
   * @see #getMetaClass()
   * @generated
   */
  EAttribute getMetaClass_Cardinality();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.MetaClass#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaClass#getMethods()
   * @see #getMetaClass()
   * @generated
   */
  EReference getMetaClass_Methods();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ExternalClass <em>External Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Class</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalClass
   * @generated
   */
  EClass getExternalClass();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ExternalClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalClass#getDescription()
   * @see #getExternalClass()
   * @generated
   */
  EAttribute getExternalClass_Description();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.ExternalClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalClass#getType()
   * @see #getExternalClass()
   * @generated
   */
  EAttribute getExternalClass_Type();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.XmlElement <em>Xml Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Element</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlElement
   * @generated
   */
  EClass getXmlElement();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.XmlElement#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlElement#getMatching()
   * @see #getXmlElement()
   * @generated
   */
  EAttribute getXmlElement_Matching();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.XmlDocument <em>Xml Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Document</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlDocument
   * @generated
   */
  EClass getXmlDocument();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.XmlDocument#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlDocument#getMatching()
   * @see #getXmlDocument()
   * @generated
   */
  EAttribute getXmlDocument_Matching();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.Module#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Module#getAttributes()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link br.ufmg.dcc.asml.aSMLModel.Module#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Module#getMatching()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Matching();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.Module#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Module#getComponents()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Components();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.Module#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Module#getRestrictions()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Restrictions();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule <em>Meta Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Module</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule
   * @generated
   */
  EClass getMetaModule();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule#getAttributes()
   * @see #getMetaModule()
   * @generated
   */
  EReference getMetaModule_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule#getMatching()
   * @see #getMetaModule()
   * @generated
   */
  EReference getMetaModule_Matching();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule#getComponents()
   * @see #getMetaModule()
   * @generated
   */
  EReference getMetaModule_Components();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule#getRestrictions()
   * @see #getMetaModule()
   * @generated
   */
  EReference getMetaModule_Restrictions();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule <em>External Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Module</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalModule
   * @generated
   */
  EClass getExternalModule();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalModule#getAttributes()
   * @see #getExternalModule()
   * @generated
   */
  EReference getExternalModule_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getMatching <em>Matching</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Matching</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalModule#getMatching()
   * @see #getExternalModule()
   * @generated
   */
  EReference getExternalModule_Matching();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalModule#getComponents()
   * @see #getExternalModule()
   * @generated
   */
  EReference getExternalModule_Components();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExternalModule#getRestrictions()
   * @see #getExternalModule()
   * @generated
   */
  EReference getExternalModule_Restrictions();

  /**
   * Returns the meta object for class '{@link br.ufmg.dcc.asml.aSMLModel.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction
   * @generated
   */
  EClass getRestriction();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getGroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Clause</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getGroupClause()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_GroupClause();

  /**
   * Returns the meta object for the reference list '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getComponentA <em>Component A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Component A</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getComponentA()
   * @see #getRestriction()
   * @generated
   */
  EReference getRestriction_ComponentA();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getPermissionClause <em>Permission Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Permission Clause</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getPermissionClause()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_PermissionClause();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getRelactionType <em>Relaction Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relaction Type</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getRelactionType()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_RelactionType();

  /**
   * Returns the meta object for the reference '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getComponentB <em>Component B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component B</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getComponentB()
   * @see #getRestriction()
   * @generated
   */
  EReference getRestriction_ComponentB();

  /**
   * Returns the meta object for the attribute '{@link br.ufmg.dcc.asml.aSMLModel.Restriction#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction#getDescription()
   * @see #getRestriction()
   * @generated
   */
  EAttribute getRestriction_Description();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cardinality</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
   * @generated
   */
  EEnum getCardinality();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause <em>Expression Matching Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Expression Matching Clause</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause
   * @generated
   */
  EEnum getExpressionMatchingClause();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter <em>Module Matching Paramenter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Module Matching Paramenter</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter
   * @generated
   */
  EEnum getModuleMatchingParamenter();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.GroupClause <em>Group Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Group Clause</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.GroupClause
   * @generated
   */
  EEnum getGroupClause();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.PermissionClause <em>Permission Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Permission Clause</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.PermissionClause
   * @generated
   */
  EEnum getPermissionClause();

  /**
   * Returns the meta object for enum '{@link br.ufmg.dcc.asml.aSMLModel.RelactionType <em>Relaction Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relaction Type</em>'.
   * @see br.ufmg.dcc.asml.aSMLModel.RelactionType
   * @generated
   */
  EEnum getRelactionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ASMLModelFactory getASMLModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelImpl <em>ASML Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getASMLModel()
     * @generated
     */
    EClass ASML_MODEL = eINSTANCE.getASMLModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASML_MODEL__NAME = eINSTANCE.getASMLModel_Name();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASML_MODEL__IMPORT_URI = eINSTANCE.getASMLModel_ImportURI();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASML_MODEL__VIEWS = eINSTANCE.getASMLModel_Views();

    /**
     * The meta object literal for the '<em><b>Ignore</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASML_MODEL__IGNORE = eINSTANCE.getASMLModel_Ignore();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ViewImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__ATTRIBUTES = eINSTANCE.getView_Attributes();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__COMPONENTS = eINSTANCE.getView_Components();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__RESTRICTIONS = eINSTANCE.getView_Restrictions();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.AbstractComponentImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAbstractComponent()
     * @generated
     */
    EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_COMPONENT__NAME = eINSTANCE.getAbstractComponent_Name();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.AttributeImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.AbstractNameConvetionImpl <em>Abstract Name Convetion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.AbstractNameConvetionImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getAbstractNameConvetion()
     * @generated
     */
    EClass ABSTRACT_NAME_CONVETION = eINSTANCE.getAbstractNameConvetion();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExpressionMatchingOperatorImpl <em>Expression Matching Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ExpressionMatchingOperatorImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExpressionMatchingOperator()
     * @generated
     */
    EClass EXPRESSION_MATCHING_OPERATOR = eINSTANCE.getExpressionMatchingOperator();

    /**
     * The meta object literal for the '<em><b>AND</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_MATCHING_OPERATOR__AND = eINSTANCE.getExpressionMatchingOperator_AND();

    /**
     * The meta object literal for the '<em><b>OR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_MATCHING_OPERATOR__OR = eINSTANCE.getExpressionMatchingOperator_OR();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ModuleMatchingImpl <em>Module Matching</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ModuleMatchingImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModuleMatching()
     * @generated
     */
    EClass MODULE_MATCHING = eINSTANCE.getModuleMatching();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_MATCHING__PARAMETER = eINSTANCE.getModuleMatching_Parameter();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ClassMatchingImpl <em>Class Matching</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ClassMatchingImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getClassMatching()
     * @generated
     */
    EClass CLASS_MATCHING = eINSTANCE.getClassMatching();

    /**
     * The meta object literal for the '<em><b>Expression Matching</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MATCHING__EXPRESSION_MATCHING = eINSTANCE.getClassMatching_ExpressionMatching();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_MATCHING__PARAMETER = eINSTANCE.getClassMatching_Parameter();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationElementImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getConfigurationElement()
     * @generated
     */
    EClass CONFIGURATION_ELEMENT = eINSTANCE.getConfigurationElement();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION_ELEMENT__CARDINALITY = eINSTANCE.getConfigurationElement_Cardinality();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.FileImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__MATCHING = eINSTANCE.getFile_Matching();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ConfigurationImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION__MATCHING = eINSTANCE.getConfiguration_Matching();

    /**
     * The meta object literal for the '<em><b>Configuration Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__CONFIGURATION_ELEMENT = eINSTANCE.getConfiguration_ConfigurationElement();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.MethodImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__MATCHING = eINSTANCE.getMethod_Matching();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__CARDINALITY = eINSTANCE.getMethod_Cardinality();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl <em>Meta Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMetaClass()
     * @generated
     */
    EClass META_CLASS = eINSTANCE.getMetaClass();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_CLASS__DESCRIPTION = eINSTANCE.getMetaClass_Description();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__MATCHING = eINSTANCE.getMetaClass_Matching();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_CLASS__CARDINALITY = eINSTANCE.getMetaClass_Cardinality();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_CLASS__METHODS = eINSTANCE.getMetaClass_Methods();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl <em>External Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ExternalClassImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExternalClass()
     * @generated
     */
    EClass EXTERNAL_CLASS = eINSTANCE.getExternalClass();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CLASS__DESCRIPTION = eINSTANCE.getExternalClass_Description();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CLASS__TYPE = eINSTANCE.getExternalClass_Type();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.XmlElementImpl <em>Xml Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.XmlElementImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getXmlElement()
     * @generated
     */
    EClass XML_ELEMENT = eINSTANCE.getXmlElement();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_ELEMENT__MATCHING = eINSTANCE.getXmlElement_Matching();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.XmlDocumentImpl <em>Xml Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.XmlDocumentImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getXmlDocument()
     * @generated
     */
    EClass XML_DOCUMENT = eINSTANCE.getXmlDocument();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_DOCUMENT__MATCHING = eINSTANCE.getXmlDocument_Matching();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ModuleImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__ATTRIBUTES = eINSTANCE.getModule_Attributes();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MATCHING = eINSTANCE.getModule_Matching();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__COMPONENTS = eINSTANCE.getModule_Components();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__RESTRICTIONS = eINSTANCE.getModule_Restrictions();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.MetaModuleImpl <em>Meta Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.MetaModuleImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getMetaModule()
     * @generated
     */
    EClass META_MODULE = eINSTANCE.getMetaModule();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_MODULE__ATTRIBUTES = eINSTANCE.getMetaModule_Attributes();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_MODULE__MATCHING = eINSTANCE.getMetaModule_Matching();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_MODULE__COMPONENTS = eINSTANCE.getMetaModule_Components();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_MODULE__RESTRICTIONS = eINSTANCE.getMetaModule_Restrictions();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl <em>External Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExternalModule()
     * @generated
     */
    EClass EXTERNAL_MODULE = eINSTANCE.getExternalModule();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_MODULE__ATTRIBUTES = eINSTANCE.getExternalModule_Attributes();

    /**
     * The meta object literal for the '<em><b>Matching</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_MODULE__MATCHING = eINSTANCE.getExternalModule_Matching();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_MODULE__COMPONENTS = eINSTANCE.getExternalModule_Components();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_MODULE__RESTRICTIONS = eINSTANCE.getExternalModule_Restrictions();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl <em>Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.impl.RestrictionImpl
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getRestriction()
     * @generated
     */
    EClass RESTRICTION = eINSTANCE.getRestriction();

    /**
     * The meta object literal for the '<em><b>Group Clause</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__GROUP_CLAUSE = eINSTANCE.getRestriction_GroupClause();

    /**
     * The meta object literal for the '<em><b>Component A</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION__COMPONENT_A = eINSTANCE.getRestriction_ComponentA();

    /**
     * The meta object literal for the '<em><b>Permission Clause</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__PERMISSION_CLAUSE = eINSTANCE.getRestriction_PermissionClause();

    /**
     * The meta object literal for the '<em><b>Relaction Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__RELACTION_TYPE = eINSTANCE.getRestriction_RelactionType();

    /**
     * The meta object literal for the '<em><b>Component B</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESTRICTION__COMPONENT_B = eINSTANCE.getRestriction_ComponentB();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTRICTION__DESCRIPTION = eINSTANCE.getRestriction_Description();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.Cardinality <em>Cardinality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.Cardinality
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getCardinality()
     * @generated
     */
    EEnum CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause <em>Expression Matching Clause</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getExpressionMatchingClause()
     * @generated
     */
    EEnum EXPRESSION_MATCHING_CLAUSE = eINSTANCE.getExpressionMatchingClause();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter <em>Module Matching Paramenter</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getModuleMatchingParamenter()
     * @generated
     */
    EEnum MODULE_MATCHING_PARAMENTER = eINSTANCE.getModuleMatchingParamenter();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.GroupClause <em>Group Clause</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.GroupClause
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getGroupClause()
     * @generated
     */
    EEnum GROUP_CLAUSE = eINSTANCE.getGroupClause();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.PermissionClause <em>Permission Clause</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.PermissionClause
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getPermissionClause()
     * @generated
     */
    EEnum PERMISSION_CLAUSE = eINSTANCE.getPermissionClause();

    /**
     * The meta object literal for the '{@link br.ufmg.dcc.asml.aSMLModel.RelactionType <em>Relaction Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufmg.dcc.asml.aSMLModel.RelactionType
     * @see br.ufmg.dcc.asml.aSMLModel.impl.ASMLModelPackageImpl#getRelactionType()
     * @generated
     */
    EEnum RELACTION_TYPE = eINSTANCE.getRelactionType();

  }

} //ASMLModelPackage
