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
import br.ufmg.dcc.asml.aSMLModel.Configuration;
import br.ufmg.dcc.asml.aSMLModel.ConfigurationElement;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingClause;
import br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator;
import br.ufmg.dcc.asml.aSMLModel.ExternalClass;
import br.ufmg.dcc.asml.aSMLModel.ExternalModule;
import br.ufmg.dcc.asml.aSMLModel.File;
import br.ufmg.dcc.asml.aSMLModel.GroupClause;
import br.ufmg.dcc.asml.aSMLModel.MetaClass;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASMLModelPackageImpl extends EPackageImpl implements ASMLModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asmlModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractNameConvetionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionMatchingOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleMatchingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classMatchingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cardinalityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum expressionMatchingClauseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum moduleMatchingParamenterEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum groupClauseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum permissionClauseEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relactionTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ASMLModelPackageImpl()
  {
    super(eNS_URI, ASMLModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ASMLModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ASMLModelPackage init()
  {
    if (isInited) return (ASMLModelPackage)EPackage.Registry.INSTANCE.getEPackage(ASMLModelPackage.eNS_URI);

    // Obtain or create and register package
    ASMLModelPackageImpl theASMLModelPackage = (ASMLModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ASMLModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ASMLModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theASMLModelPackage.createPackageContents();

    // Initialize created meta-data
    theASMLModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theASMLModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ASMLModelPackage.eNS_URI, theASMLModelPackage);
    return theASMLModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASMLModel()
  {
    return asmlModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getASMLModel_Name()
  {
    return (EAttribute)asmlModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getASMLModel_ImportURI()
  {
    return (EAttribute)asmlModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getASMLModel_Views()
  {
    return (EReference)asmlModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getASMLModel_Ignore()
  {
    return (EAttribute)asmlModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Attributes()
  {
    return (EReference)viewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Components()
  {
    return (EReference)viewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Restrictions()
  {
    return (EReference)viewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractComponent()
  {
    return abstractComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractComponent_Name()
  {
    return (EAttribute)abstractComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Value()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractNameConvetion()
  {
    return abstractNameConvetionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionMatchingOperator()
  {
    return expressionMatchingOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionMatchingOperator_AND()
  {
    return (EAttribute)expressionMatchingOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionMatchingOperator_OR()
  {
    return (EAttribute)expressionMatchingOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleMatching()
  {
    return moduleMatchingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleMatching_Parameter()
  {
    return (EAttribute)moduleMatchingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassMatching()
  {
    return classMatchingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassMatching_ExpressionMatching()
  {
    return (EAttribute)classMatchingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassMatching_Parameter()
  {
    return (EAttribute)classMatchingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationElement()
  {
    return configurationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigurationElement_Cardinality()
  {
    return (EAttribute)configurationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFile_Matching()
  {
    return (EReference)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfiguration()
  {
    return configurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfiguration_Matching()
  {
    return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_ConfigurationElement()
  {
    return (EReference)configurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Matching()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Cardinality()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaClass()
  {
    return metaClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Extends()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaClass_Description()
  {
    return (EAttribute)metaClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Matching()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaClass_Cardinality()
  {
    return (EAttribute)metaClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaClass_Methods()
  {
    return (EReference)metaClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalClass()
  {
    return externalClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalClass_Description()
  {
    return (EAttribute)externalClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalClass_Type()
  {
    return (EAttribute)externalClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlElement()
  {
    return xmlElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXmlElement_Matching()
  {
    return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlDocument()
  {
    return xmlDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXmlDocument_Matching()
  {
    return (EAttribute)xmlDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Attributes()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Matching()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Components()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Restrictions()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaModule()
  {
    return metaModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaModule_Attributes()
  {
    return (EReference)metaModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaModule_Matching()
  {
    return (EReference)metaModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaModule_Components()
  {
    return (EReference)metaModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaModule_Restrictions()
  {
    return (EReference)metaModuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalModule()
  {
    return externalModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalModule_Attributes()
  {
    return (EReference)externalModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalModule_Matching()
  {
    return (EReference)externalModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalModule_Components()
  {
    return (EReference)externalModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalModule_Restrictions()
  {
    return (EReference)externalModuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestriction()
  {
    return restrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestriction_GroupClause()
  {
    return (EAttribute)restrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestriction_ComponentA()
  {
    return (EReference)restrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestriction_PermissionClause()
  {
    return (EAttribute)restrictionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestriction_RelactionType()
  {
    return (EAttribute)restrictionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestriction_ComponentB()
  {
    return (EReference)restrictionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRestriction_Description()
  {
    return (EAttribute)restrictionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCardinality()
  {
    return cardinalityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getExpressionMatchingClause()
  {
    return expressionMatchingClauseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModuleMatchingParamenter()
  {
    return moduleMatchingParamenterEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGroupClause()
  {
    return groupClauseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPermissionClause()
  {
    return permissionClauseEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelactionType()
  {
    return relactionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMLModelFactory getASMLModelFactory()
  {
    return (ASMLModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    asmlModelEClass = createEClass(ASML_MODEL);
    createEAttribute(asmlModelEClass, ASML_MODEL__NAME);
    createEAttribute(asmlModelEClass, ASML_MODEL__IMPORT_URI);
    createEReference(asmlModelEClass, ASML_MODEL__VIEWS);
    createEAttribute(asmlModelEClass, ASML_MODEL__IGNORE);

    viewEClass = createEClass(VIEW);
    createEReference(viewEClass, VIEW__ATTRIBUTES);
    createEReference(viewEClass, VIEW__COMPONENTS);
    createEReference(viewEClass, VIEW__RESTRICTIONS);

    abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
    createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__NAME);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

    abstractNameConvetionEClass = createEClass(ABSTRACT_NAME_CONVETION);

    expressionMatchingOperatorEClass = createEClass(EXPRESSION_MATCHING_OPERATOR);
    createEAttribute(expressionMatchingOperatorEClass, EXPRESSION_MATCHING_OPERATOR__AND);
    createEAttribute(expressionMatchingOperatorEClass, EXPRESSION_MATCHING_OPERATOR__OR);

    moduleMatchingEClass = createEClass(MODULE_MATCHING);
    createEAttribute(moduleMatchingEClass, MODULE_MATCHING__PARAMETER);

    classMatchingEClass = createEClass(CLASS_MATCHING);
    createEAttribute(classMatchingEClass, CLASS_MATCHING__EXPRESSION_MATCHING);
    createEAttribute(classMatchingEClass, CLASS_MATCHING__PARAMETER);

    configurationElementEClass = createEClass(CONFIGURATION_ELEMENT);
    createEAttribute(configurationElementEClass, CONFIGURATION_ELEMENT__CARDINALITY);

    fileEClass = createEClass(FILE);
    createEReference(fileEClass, FILE__MATCHING);

    configurationEClass = createEClass(CONFIGURATION);
    createEAttribute(configurationEClass, CONFIGURATION__MATCHING);
    createEReference(configurationEClass, CONFIGURATION__CONFIGURATION_ELEMENT);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__MATCHING);
    createEAttribute(methodEClass, METHOD__CARDINALITY);

    metaClassEClass = createEClass(META_CLASS);
    createEReference(metaClassEClass, META_CLASS__EXTENDS);
    createEAttribute(metaClassEClass, META_CLASS__DESCRIPTION);
    createEReference(metaClassEClass, META_CLASS__MATCHING);
    createEAttribute(metaClassEClass, META_CLASS__CARDINALITY);
    createEReference(metaClassEClass, META_CLASS__METHODS);

    externalClassEClass = createEClass(EXTERNAL_CLASS);
    createEAttribute(externalClassEClass, EXTERNAL_CLASS__DESCRIPTION);
    createEAttribute(externalClassEClass, EXTERNAL_CLASS__TYPE);

    xmlElementEClass = createEClass(XML_ELEMENT);
    createEAttribute(xmlElementEClass, XML_ELEMENT__MATCHING);

    xmlDocumentEClass = createEClass(XML_DOCUMENT);
    createEAttribute(xmlDocumentEClass, XML_DOCUMENT__MATCHING);

    moduleEClass = createEClass(MODULE);
    createEReference(moduleEClass, MODULE__ATTRIBUTES);
    createEReference(moduleEClass, MODULE__MATCHING);
    createEReference(moduleEClass, MODULE__COMPONENTS);
    createEReference(moduleEClass, MODULE__RESTRICTIONS);

    metaModuleEClass = createEClass(META_MODULE);
    createEReference(metaModuleEClass, META_MODULE__ATTRIBUTES);
    createEReference(metaModuleEClass, META_MODULE__MATCHING);
    createEReference(metaModuleEClass, META_MODULE__COMPONENTS);
    createEReference(metaModuleEClass, META_MODULE__RESTRICTIONS);

    externalModuleEClass = createEClass(EXTERNAL_MODULE);
    createEReference(externalModuleEClass, EXTERNAL_MODULE__ATTRIBUTES);
    createEReference(externalModuleEClass, EXTERNAL_MODULE__MATCHING);
    createEReference(externalModuleEClass, EXTERNAL_MODULE__COMPONENTS);
    createEReference(externalModuleEClass, EXTERNAL_MODULE__RESTRICTIONS);

    restrictionEClass = createEClass(RESTRICTION);
    createEAttribute(restrictionEClass, RESTRICTION__GROUP_CLAUSE);
    createEReference(restrictionEClass, RESTRICTION__COMPONENT_A);
    createEAttribute(restrictionEClass, RESTRICTION__PERMISSION_CLAUSE);
    createEAttribute(restrictionEClass, RESTRICTION__RELACTION_TYPE);
    createEReference(restrictionEClass, RESTRICTION__COMPONENT_B);
    createEAttribute(restrictionEClass, RESTRICTION__DESCRIPTION);

    // Create enums
    cardinalityEEnum = createEEnum(CARDINALITY);
    expressionMatchingClauseEEnum = createEEnum(EXPRESSION_MATCHING_CLAUSE);
    moduleMatchingParamenterEEnum = createEEnum(MODULE_MATCHING_PARAMENTER);
    groupClauseEEnum = createEEnum(GROUP_CLAUSE);
    permissionClauseEEnum = createEEnum(PERMISSION_CLAUSE);
    relactionTypeEEnum = createEEnum(RELACTION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    viewEClass.getESuperTypes().add(this.getAbstractComponent());
    classMatchingEClass.getESuperTypes().add(this.getAbstractNameConvetion());
    configurationElementEClass.getESuperTypes().add(this.getAbstractComponent());
    fileEClass.getESuperTypes().add(this.getConfigurationElement());
    configurationEClass.getESuperTypes().add(this.getConfigurationElement());
    methodEClass.getESuperTypes().add(this.getAbstractComponent());
    metaClassEClass.getESuperTypes().add(this.getAbstractComponent());
    externalClassEClass.getESuperTypes().add(this.getAbstractComponent());
    xmlElementEClass.getESuperTypes().add(this.getConfigurationElement());
    xmlDocumentEClass.getESuperTypes().add(this.getConfigurationElement());
    moduleEClass.getESuperTypes().add(this.getAbstractComponent());
    metaModuleEClass.getESuperTypes().add(this.getAbstractComponent());
    externalModuleEClass.getESuperTypes().add(this.getAbstractComponent());

    // Initialize classes and features; add operations and parameters
    initEClass(asmlModelEClass, ASMLModel.class, "ASMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getASMLModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ASMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getASMLModel_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ASMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getASMLModel_Views(), this.getView(), null, "views", null, 0, -1, ASMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getASMLModel_Ignore(), ecorePackage.getEString(), "ignore", null, 0, -1, ASMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getView_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getView_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getView_Restrictions(), this.getRestriction(), null, "restrictions", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractNameConvetionEClass, AbstractNameConvetion.class, "AbstractNameConvetion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionMatchingOperatorEClass, ExpressionMatchingOperator.class, "ExpressionMatchingOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionMatchingOperator_AND(), ecorePackage.getEString(), "AND", null, 0, 1, ExpressionMatchingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionMatchingOperator_OR(), ecorePackage.getEString(), "OR", null, 0, 1, ExpressionMatchingOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleMatchingEClass, ModuleMatching.class, "ModuleMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleMatching_Parameter(), this.getModuleMatchingParamenter(), "parameter", null, 0, 1, ModuleMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classMatchingEClass, ClassMatching.class, "ClassMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassMatching_ExpressionMatching(), this.getExpressionMatchingClause(), "expressionMatching", null, 0, 1, ClassMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassMatching_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, ClassMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationElementEClass, ConfigurationElement.class, "ConfigurationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfigurationElement_Cardinality(), this.getCardinality(), "cardinality", null, 0, 1, ConfigurationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFile_Matching(), this.getAbstractNameConvetion(), null, "matching", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConfiguration_Matching(), ecorePackage.getEString(), "matching", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConfiguration_ConfigurationElement(), this.getConfigurationElement(), null, "configurationElement", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Matching(), ecorePackage.getEString(), "matching", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Cardinality(), this.getCardinality(), "cardinality", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaClassEClass, MetaClass.class, "MetaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaClass_Extends(), this.getMetaClass(), null, "extends", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Matching(), this.getAbstractNameConvetion(), null, "matching", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaClass_Cardinality(), this.getCardinality(), "cardinality", null, 0, 1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaClass_Methods(), this.getMethod(), null, "methods", null, 0, -1, MetaClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalClassEClass, ExternalClass.class, "ExternalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalClass_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExternalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlElementEClass, XmlElement.class, "XmlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXmlElement_Matching(), ecorePackage.getEString(), "matching", null, 0, 1, XmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlDocumentEClass, XmlDocument.class, "XmlDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXmlDocument_Matching(), ecorePackage.getEString(), "matching", null, 0, 1, XmlDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModule_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Matching(), this.getModuleMatching(), null, "matching", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Restrictions(), this.getRestriction(), null, "restrictions", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaModuleEClass, MetaModule.class, "MetaModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaModule_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, MetaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaModule_Matching(), this.getModuleMatching(), null, "matching", null, 0, 1, MetaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaModule_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, MetaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaModule_Restrictions(), this.getRestriction(), null, "restrictions", null, 0, -1, MetaModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalModuleEClass, ExternalModule.class, "ExternalModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalModule_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ExternalModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalModule_Matching(), this.getModuleMatching(), null, "matching", null, 0, 1, ExternalModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalModule_Components(), this.getAbstractComponent(), null, "components", null, 0, -1, ExternalModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalModule_Restrictions(), this.getRestriction(), null, "restrictions", null, 0, -1, ExternalModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRestriction_GroupClause(), this.getGroupClause(), "groupClause", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestriction_ComponentA(), this.getAbstractComponent(), null, "componentA", null, 0, -1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRestriction_PermissionClause(), this.getPermissionClause(), "permissionClause", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRestriction_RelactionType(), this.getRelactionType(), "relactionType", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestriction_ComponentB(), this.getAbstractComponent(), null, "componentB", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRestriction_Description(), ecorePackage.getEString(), "description", null, 0, 1, Restriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
    addEEnumLiteral(cardinalityEEnum, Cardinality.ONE);
    addEEnumLiteral(cardinalityEEnum, Cardinality.ZERO);
    addEEnumLiteral(cardinalityEEnum, Cardinality.ONE_OR_MANY);
    addEEnumLiteral(cardinalityEEnum, Cardinality.ZERO_OR_MANY);

    initEEnum(expressionMatchingClauseEEnum, ExpressionMatchingClause.class, "ExpressionMatchingClause");
    addEEnumLiteral(expressionMatchingClauseEEnum, ExpressionMatchingClause.NAME_START_WITH);
    addEEnumLiteral(expressionMatchingClauseEEnum, ExpressionMatchingClause.NAME_ENDS_WITH);
    addEEnumLiteral(expressionMatchingClauseEEnum, ExpressionMatchingClause.ANNOTATED_WITH);

    initEEnum(moduleMatchingParamenterEEnum, ModuleMatchingParamenter.class, "ModuleMatchingParamenter");
    addEEnumLiteral(moduleMatchingParamenterEEnum, ModuleMatchingParamenter.PAKCAGE);
    addEEnumLiteral(moduleMatchingParamenterEEnum, ModuleMatchingParamenter.FOLDER);
    addEEnumLiteral(moduleMatchingParamenterEEnum, ModuleMatchingParamenter.PAKCAGE_AND_FOLDER);
    addEEnumLiteral(moduleMatchingParamenterEEnum, ModuleMatchingParamenter.EXTERNAL_DEFINITION);

    initEEnum(groupClauseEEnum, GroupClause.class, "GroupClause");
    addEEnumLiteral(groupClauseEEnum, GroupClause.NULL);
    addEEnumLiteral(groupClauseEEnum, GroupClause.ONLY);
    addEEnumLiteral(groupClauseEEnum, GroupClause.ANY);
    addEEnumLiteral(groupClauseEEnum, GroupClause.NO_ONE);

    initEEnum(permissionClauseEEnum, PermissionClause.class, "PermissionClause");
    addEEnumLiteral(permissionClauseEEnum, PermissionClause.NULL);
    addEEnumLiteral(permissionClauseEEnum, PermissionClause.MUST);
    addEEnumLiteral(permissionClauseEEnum, PermissionClause.CAN);
    addEEnumLiteral(permissionClauseEEnum, PermissionClause.CANNOT);

    initEEnum(relactionTypeEEnum, RelactionType.class, "RelactionType");
    addEEnumLiteral(relactionTypeEEnum, RelactionType.ACCESS);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.DECLARE);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.HANDLE);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.EXTEND);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.IMPLEMENT);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.CREATE);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.THROW);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.USEANOTATION);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.DEPEND);
    addEEnumLiteral(relactionTypeEEnum, RelactionType.REQUIRES);

    // Create resource
    createResource(eNS_URI);
  }

} //ASMLModelPackageImpl
