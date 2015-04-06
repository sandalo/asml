/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.View#getName <em>Name</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.View#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.View#getComponents <em>Components</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.View#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getView_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.AbstractComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getView_Components()
   * @model containment="true"
   * @generated
   */
  EList<AbstractComponent> getComponents();

  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.Restriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getView_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

} // View
