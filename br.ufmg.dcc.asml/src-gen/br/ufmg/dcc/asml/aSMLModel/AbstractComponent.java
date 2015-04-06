/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.ComponentVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getAbstractComponent()
 * @model
 * @generated
 */
public interface AbstractComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getAbstractComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
 public EList<AbstractComponent> getComponents();
  
  void setName(String value);

  public Set<ComponentInstance> getInstances();
  
  public Set<ComponentInstance> getAllComponentInstances();

  public void addComponentInstance(ComponentInstance resource);
  
  public void resourceClear();
  
  public String[] getAllTypesNames();
  
  public String[] getAllSupertypesNames();

 public boolean containsType(String fullName);
 
 public void accept(ComponentVisitor compVisitor);

} // AbstractComponent
