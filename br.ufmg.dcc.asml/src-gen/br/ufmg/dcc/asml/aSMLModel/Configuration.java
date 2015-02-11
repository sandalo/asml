/**
 */
package br.ufmg.dcc.asml.aSMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Configuration#getMatching <em>Matching</em>}</li>
 *   <li>{@link br.ufmg.dcc.asml.aSMLModel.Configuration#getConfigurationElement <em>Configuration Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ConfigurationElement
{
  /**
   * Returns the value of the '<em><b>Matching</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matching</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matching</em>' attribute.
   * @see #setMatching(String)
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getConfiguration_Matching()
   * @model
   * @generated
   */
  String getMatching();

  /**
   * Sets the value of the '{@link br.ufmg.dcc.asml.aSMLModel.Configuration#getMatching <em>Matching</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matching</em>' attribute.
   * @see #getMatching()
   * @generated
   */
  void setMatching(String value);

  /**
   * Returns the value of the '<em><b>Configuration Element</b></em>' containment reference list.
   * The list contents are of type {@link br.ufmg.dcc.asml.aSMLModel.ConfigurationElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration Element</em>' containment reference list.
   * @see br.ufmg.dcc.asml.aSMLModel.ASMLModelPackage#getConfiguration_ConfigurationElement()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationElement> getConfigurationElement();

} // Configuration
