/**
 */
package br.ufmg.dcc.asml.aSMLModel.util;

import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion;
import br.ufmg.dcc.asml.aSMLModel.Attribute;
import br.ufmg.dcc.asml.aSMLModel.ClassMatching;
import br.ufmg.dcc.asml.aSMLModel.Component;
import br.ufmg.dcc.asml.aSMLModel.Configuration;
import br.ufmg.dcc.asml.aSMLModel.ConfigurationElement;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage
 * @generated
 */
public class ASMLModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ASMLModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASMLModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ASMLModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ASMLModelSwitch<Adapter> modelSwitch =
    new ASMLModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseASMLModel(ASMLModel object)
      {
        return createASMLModelAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
      }
      @Override
      public Adapter caseAbstractComponent(AbstractComponent object)
      {
        return createAbstractComponentAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAbstractNameConvetion(AbstractNameConvetion object)
      {
        return createAbstractNameConvetionAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseFrameworkInstantiation(FrameworkInstantiation object)
      {
        return createFrameworkInstantiationAdapter();
      }
      @Override
      public Adapter caseFrameworkClass(FrameworkClass object)
      {
        return createFrameworkClassAdapter();
      }
      @Override
      public Adapter caseExpressionMatchingOperator(ExpressionMatchingOperator object)
      {
        return createExpressionMatchingOperatorAdapter();
      }
      @Override
      public Adapter caseLayerMatching(LayerMatching object)
      {
        return createLayerMatchingAdapter();
      }
      @Override
      public Adapter caseModuleMatching(ModuleMatching object)
      {
        return createModuleMatchingAdapter();
      }
      @Override
      public Adapter caseClassMatching(ClassMatching object)
      {
        return createClassMatchingAdapter();
      }
      @Override
      public Adapter caseConfigurationElement(ConfigurationElement object)
      {
        return createConfigurationElementAdapter();
      }
      @Override
      public Adapter caseFile(File object)
      {
        return createFileAdapter();
      }
      @Override
      public Adapter caseConfiguration(Configuration object)
      {
        return createConfigurationAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseClass(br.ufmg.dcc.asml.aSMLModel.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseXmlElement(XmlElement object)
      {
        return createXmlElementAdapter();
      }
      @Override
      public Adapter caseXmlDocument(XmlDocument object)
      {
        return createXmlDocumentAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseMetaModule(MetaModule object)
      {
        return createMetaModuleAdapter();
      }
      @Override
      public Adapter caseRestriction(Restriction object)
      {
        return createRestrictionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.ASMLModel <em>ASML Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModel
   * @generated
   */
  public Adapter createASMLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.View
   * @generated
   */
  public Adapter createViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent <em>Abstract Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.AbstractComponent
   * @generated
   */
  public Adapter createAbstractComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion <em>Abstract Name Convetion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.AbstractNameConvetion
   * @generated
   */
  public Adapter createAbstractNameConvetionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.FrameworkInstantiation <em>Framework Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.FrameworkInstantiation
   * @generated
   */
  public Adapter createFrameworkInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.FrameworkClass <em>Framework Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.FrameworkClass
   * @generated
   */
  public Adapter createFrameworkClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator <em>Expression Matching Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.ExpressionMatchingOperator
   * @generated
   */
  public Adapter createExpressionMatchingOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.LayerMatching <em>Layer Matching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.LayerMatching
   * @generated
   */
  public Adapter createLayerMatchingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.ModuleMatching <em>Module Matching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.ModuleMatching
   * @generated
   */
  public Adapter createModuleMatchingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.ClassMatching <em>Class Matching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.ClassMatching
   * @generated
   */
  public Adapter createClassMatchingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement <em>Configuration Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.ConfigurationElement
   * @generated
   */
  public Adapter createConfigurationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.File
   * @generated
   */
  public Adapter createFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Configuration
   * @generated
   */
  public Adapter createConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.XmlElement <em>Xml Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlElement
   * @generated
   */
  public Adapter createXmlElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.XmlDocument <em>Xml Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.XmlDocument
   * @generated
   */
  public Adapter createXmlDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.MetaModule <em>Meta Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.MetaModule
   * @generated
   */
  public Adapter createMetaModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufmg.dcc.asml.aSMLModel.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufmg.dcc.asml.aSMLModel.Restriction
   * @generated
   */
  public Adapter createRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ASMLModelAdapterFactory
