/**
 */
package br.ufmg.dcc.asml.aSMLModel.impl;

import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelFactory;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.Cardinality;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.Component;
import br.ufmg.dcc.asml.aSMLModel.Configuration;
import br.ufmg.dcc.asml.aSMLModel.ConfigurationElement;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator;
import br.ufmg.dcc.asml.aSMLModel.File;
import br.ufmg.dcc.asml.aSMLModel.FrameworkClass;
import br.ufmg.dcc.asml.aSMLModel.FrameworkInstantiation;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.Layer;
import br.ufmg.dcc.asml.aSMLModel.LayerMatching;
import br.ufmg.dcc.asml.aSMLModel.LayerMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.MetaModule;
import br.ufmg.dcc.asml.aSMLModel.Method;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.ModuleMatching;
import br.ufmg.dcc.asml.aSMLModel.ModuleMatchingParamenter;
import br.ufmg.dcc.asml.aSMLModel.PermissionClause;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.View;
import br.ufmg.dcc.asml.aSMLModel.XmlDocument;
import br.ufmg.dcc.asml.aSMLModel.XmlElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASMLModelFactoryImpl extends EFactoryImpl implements ASMLModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ASMLModelFactory init()
  {
    try
    {
      ASMLModelFactory theASMLModelFactory = (ASMLModelFactory)EPackage.Registry.INSTANCE.getEFactory(ASMLModelPackage.eNS_URI);
      if (theASMLModelFactory != null)
      {
        return theASMLModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ASMLModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMLModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ASMLModelPackage.ASML_MODEL: return createASMLModel();
      case ASMLModelPackage.VIEW: return createView();
      case ASMLModelPackage.ABSTRACT_COMPONENT: return createAbstractComponent();
      case ASMLModelPackage.ATTRIBUTE: return createAttribute();
      case ASMLModelPackage.ABSTRACT_NAME_CONVETION: return createAbstractNameConvetion();
      case ASMLModelPackage.COMPONENT: return createComponent();
      case ASMLModelPackage.FRAMEWORK_INSTANTIATION: return createFrameworkInstantiation();
      case ASMLModelPackage.FRAMEWORK_CLASS: return createFrameworkClass();
      case ASMLModelPackage.EXPRESSION_MATCHING_OPERATOR: return createExpressionMatchingOperator();
      case ASMLModelPackage.LAYER_MATCHING: return createLayerMatching();
      case ASMLModelPackage.MODULE_MATCHING: return createModuleMatching();
      case ASMLModelPackage.CLASS_MATCHING: return createClassMatching();
      case ASMLModelPackage.CONFIGURATION_ELEMENT: return createConfigurationElement();
      case ASMLModelPackage.FILE: return createFile();
      case ASMLModelPackage.CONFIGURATION: return createConfiguration();
      case ASMLModelPackage.METHOD: return createMethod();
      case ASMLModelPackage.CLASS: return createClass();
      case ASMLModelPackage.XML_ELEMENT: return createXmlElement();
      case ASMLModelPackage.XML_DOCUMENT: return createXmlDocument();
      case ASMLModelPackage.LAYER: return createLayer();
      case ASMLModelPackage.MODULE: return createModule();
      case ASMLModelPackage.META_MODULE: return createMetaModule();
      case ASMLModelPackage.RESTRICTION: return createRestriction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ASMLModelPackage.CARDINALITY:
        return createCardinalityFromString(eDataType, initialValue);
      case ASMLModelPackage.EXPRESSION_MATCHING_CLAUSE:
        return createExpressionMatchingClauseFromString(eDataType, initialValue);
      case ASMLModelPackage.LAYER_MATCHING_CLAUSE:
        return createLayerMatchingClauseFromString(eDataType, initialValue);
      case ASMLModelPackage.MODULE_MATCHING_PARAMENTER:
        return createModuleMatchingParamenterFromString(eDataType, initialValue);
      case ASMLModelPackage.GROUP_CLAUSE:
        return createGroupClauseFromString(eDataType, initialValue);
      case ASMLModelPackage.PERMISSION_CLAUSE:
        return createPermissionClauseFromString(eDataType, initialValue);
      case ASMLModelPackage.RELACTION_TYPE:
        return createRelactionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ASMLModelPackage.CARDINALITY:
        return convertCardinalityToString(eDataType, instanceValue);
      case ASMLModelPackage.EXPRESSION_MATCHING_CLAUSE:
        return convertExpressionMatchingClauseToString(eDataType, instanceValue);
      case ASMLModelPackage.LAYER_MATCHING_CLAUSE:
        return convertLayerMatchingClauseToString(eDataType, instanceValue);
      case ASMLModelPackage.MODULE_MATCHING_PARAMENTER:
        return convertModuleMatchingParamenterToString(eDataType, instanceValue);
      case ASMLModelPackage.GROUP_CLAUSE:
        return convertGroupClauseToString(eDataType, instanceValue);
      case ASMLModelPackage.PERMISSION_CLAUSE:
        return convertPermissionClauseToString(eDataType, instanceValue);
      case ASMLModelPackage.RELACTION_TYPE:
        return convertRelactionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMLModel createASMLModel()
  {
    ASMLModelImpl asmlModel = new ASMLModelImpl();
    return asmlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractComponent createAbstractComponent()
  {
    AbstractComponentImpl abstractComponent = new AbstractComponentImpl();
    return abstractComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractNameConvetion createAbstractNameConvetion()
  {
    AbstractNameConvetionImpl abstractNameConvetion = new AbstractNameConvetionImpl();
    return abstractNameConvetion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameworkInstantiation createFrameworkInstantiation()
  {
    FrameworkInstantiationImpl frameworkInstantiation = new FrameworkInstantiationImpl();
    return frameworkInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameworkClass createFrameworkClass()
  {
    FrameworkClassImpl frameworkClass = new FrameworkClassImpl();
    return frameworkClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionMatchingOperator createExpressionMatchingOperator()
  {
    ExpressionMatchingOperatorImpl expressionMatchingOperator = new ExpressionMatchingOperatorImpl();
    return expressionMatchingOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerMatching createLayerMatching()
  {
    LayerMatchingImpl layerMatching = new LayerMatchingImpl();
    return layerMatching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleMatching createModuleMatching()
  {
    ModuleMatchingImpl moduleMatching = new ModuleMatchingImpl();
    return moduleMatching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassMatching createClassMatching()
  {
    ClassMatchingImpl classMatching = new ClassMatchingImpl();
    return classMatching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationElement createConfigurationElement()
  {
    ConfigurationElementImpl configurationElement = new ConfigurationElementImpl();
    return configurationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufmg.dcc.asml.aSMLModel.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XmlElement createXmlElement()
  {
    XmlElementImpl xmlElement = new XmlElementImpl();
    return xmlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XmlDocument createXmlDocument()
  {
    XmlDocumentImpl xmlDocument = new XmlDocumentImpl();
    return xmlDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModule createMetaModule()
  {
    MetaModuleImpl metaModule = new MetaModuleImpl();
    return metaModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Restriction createRestriction()
  {
    RestrictionImpl restriction = new RestrictionImpl();
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue)
  {
    Cardinality result = Cardinality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCardinalityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionMatchingClause createExpressionMatchingClauseFromString(EDataType eDataType, String initialValue)
  {
    ExpressionMatchingClause result = ExpressionMatchingClause.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpressionMatchingClauseToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerMatchingClause createLayerMatchingClauseFromString(EDataType eDataType, String initialValue)
  {
    LayerMatchingClause result = LayerMatchingClause.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLayerMatchingClauseToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleMatchingParamenter createModuleMatchingParamenterFromString(EDataType eDataType, String initialValue)
  {
    ModuleMatchingParamenter result = ModuleMatchingParamenter.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModuleMatchingParamenterToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupClause createGroupClauseFromString(EDataType eDataType, String initialValue)
  {
    GroupClause result = GroupClause.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGroupClauseToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionClause createPermissionClauseFromString(EDataType eDataType, String initialValue)
  {
    PermissionClause result = PermissionClause.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPermissionClauseToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelactionType createRelactionTypeFromString(EDataType eDataType, String initialValue)
  {
    RelactionType result = RelactionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelactionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMLModelPackage getASMLModelPackage()
  {
    return (ASMLModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ASMLModelPackage getPackage()
  {
    return ASMLModelPackage.eINSTANCE;
  }

} //ASMLModelFactoryImpl
