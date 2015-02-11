/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Layer#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Layer#getModules <em>Modules</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Layer#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends AbstractComponent
{
  /**
   * Returns the value of the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matching</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matching</em>' containment reference.
   * @see #setMatching(LayerMatching)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayer_Matching()
   * @model containment="true"
   * @generated
   */
  LayerMatching getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.Layer#getMatching <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' containment reference.
   * @see #getMatching()
   * @generated
   */
  void setMatching(LayerMatching value);

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.Module}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayer_Modules()
   * @model containment="true"
   * @generated
   */
  EList<Module> getModules();

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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getLayer_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

} // Layer
