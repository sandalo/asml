/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import br.ufmg.dcc.asml.ASMLResource;

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
	
	public Set<ASMLResource> getResources();

	public void addResources(ASMLResource resource);

	public void resourceClear();
	
	public void resourceRemove(AbstractComponent component);	
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
  void setName(String value);

} // AbstractComponent
