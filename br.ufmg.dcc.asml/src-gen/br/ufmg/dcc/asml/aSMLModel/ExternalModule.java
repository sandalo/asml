/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getComponents <em>Components</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getExternalModule()
 * @model
 * @generated
 */
public interface ExternalModule extends AbstractComponent
{
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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getExternalModule_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Matching</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matching</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matching</em>' containment reference.
   * @see #setMatching(ModuleMatching)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getExternalModule_Matching()
   * @model containment="true"
   * @generated
   */
  ModuleMatching getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.ExternalModule#getMatching <em>Matching</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' containment reference.
   * @see #getMatching()
   * @generated
   */
  void setMatching(ModuleMatching value);

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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getExternalModule_Components()
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
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getExternalModule_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

} // ExternalModule
